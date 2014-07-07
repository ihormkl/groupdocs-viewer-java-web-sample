package com.groupdocs.viewer.samples.javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Alex Bobkov, Aleksey Permyakov
 */
public class GetImageHandlerServlet extends ViewerServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String contextPath = request.getPathInfo();
        String[] path = contextPath.split("/");
        writeOutput((InputStream) viewerHandler.getImageHandler(path[path.length - 1], response), response);
    }

}
