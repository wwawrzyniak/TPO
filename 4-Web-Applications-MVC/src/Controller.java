import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Acts on both model and view, controls the data flow into model object and updates the view whenever data changes.
public class Controller extends HttpServlet {
    Model m = new Model();
    RequestDispatcher dispatcher;
    HttpSession session;
    private static final String NUMBER_PATTERN = "[0-9]+";
    private static final Pattern NUMBER_REGEX = Pattern.compile(NUMBER_PATTERN);

    private static BigInteger parameters(HttpServletRequest req, String name) {
        String parameter = (String) req.getParameter(name);
        return parse(parameter);
    }

    private static BigInteger parse(String input) {
        if (input == null) return null;
        Matcher matcher = NUMBER_REGEX.matcher(input);
        if (matcher.matches()) {
            return new BigInteger(input);
        }
        return null;
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            BigInteger x = parameters(request, "text1");
            BigInteger y = parameters(request, "text2");
            session = request.getSession();
            session.setAttribute("add1", m.addition(x, y));
        } catch (Exception e) {
            session = request.getSession();
            session.setAttribute("add1", "Invalid input");
        }
        dispatcher = request.getRequestDispatcher("addition.jsp");
        dispatcher.forward(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        service(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        service(request,response);
    }
}
