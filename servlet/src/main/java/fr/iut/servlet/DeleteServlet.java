package fr.iut.servlet;

import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jnvarzea on 01/03/17.
 */
@WebServlet(name = "delete", urlPatterns = {"/delete"})
@ServletSecurity(@HttpConstraint(rolesAllowed = "manager"))
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        Template freemarkerTemplate = null;
        freemarker.template.Configuration freemarkerConfiguration =
                new freemarker.template.Configuration();
        freemarkerConfiguration.setClassForTemplateLoading(this.getClass(), "/");
        freemarkerConfiguration.setObjectWrapper(new DefaultObjectWrapper());
        try {
            freemarkerTemplate =
                    freemarkerConfiguration.getTemplate("templates/delete.ftl");
        } catch (IOException e) {
            System.out.println("Unable to process request, error during freemarker template retrieval."); }
        Map < String, Object > root = new HashMap<String, Object>();

        PrintWriter out = response.getWriter();
        assert freemarkerTemplate != null;
        try {
            freemarkerTemplate.process(root, out);
            out.close();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
        // set mime type
        response.setContentType("text/html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<HTML>" );
        out.println("<HEAD>");
        out.println("<TITLE>DELETE</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<H1>Deleted the room " + req.getParameter("room_name") +"</H1>");
        out.println("</BODY>");
        out.println("</HTML>");
        out.close();
    }
}
