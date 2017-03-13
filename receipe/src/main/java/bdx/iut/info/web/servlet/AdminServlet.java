package bdx.iut.info.web.servlet;

import bdx.iut.info.persistence.dao.IngredientDao;
import bdx.iut.info.persistence.dao.ReceipeDao;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jnvarzea on 08/03/17.
 */
@Singleton
public class AdminServlet extends HttpServlet {
    private static final String BOOTFREE_TEMPLATE = "templates/admin.ftl";
    /**
     * constant for UTF-8 *
     */
    private static final String TEMPLATE_ENCODING = "UTF-8";
    /**
     * Logger
     */
    private static final Logger logger = LoggerFactory.getLogger(MainServlet.class);

    @Inject
    IngredientDao ingredientDao;

    @Inject
    ReceipeDao receipeDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        if (req.getParameter("submit") != null && req.getParameter("submit").equals("Remplir")) {
            InitServlet initServlet = new InitServlet();
            initServlet.doGet(req, response);
        }

        // Manage freemarker stuff
        Template freemarkerTemplate = null;
        freemarker.template.Configuration freemarkerConfiguration = new freemarker.template.Configuration();
        freemarkerConfiguration.setClassForTemplateLoading(this.getClass(), "/");
        freemarkerConfiguration.setObjectWrapper(new DefaultObjectWrapper());
        try {
            freemarkerTemplate = freemarkerConfiguration.getTemplate(BOOTFREE_TEMPLATE, TEMPLATE_ENCODING);

        } catch (IOException e) {
            logger.error("Unable to process request, error during freemarker template retrieval.", e);

        }

        Map<String, Object> root = new HashMap<String, Object>();
        root.put("title", "Java EE - Admin");

        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        assert freemarkerTemplate != null;

        try {
            freemarkerTemplate.process(root, out);
            out.close();
        } catch (TemplateException e) {
            logger.error("Error during template processing", e);
        }


        response.setContentType("text/html");

    }
}
