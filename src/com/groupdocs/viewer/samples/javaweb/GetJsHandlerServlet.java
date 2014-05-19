package com.groupdocs.viewer.samples.javaweb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author Alex Bobkov, Aleksey Permyakov
 */
public class GetJsHandlerServlet extends ViewerServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        viewerHandler.getJsHandler(request.getParameter("script"), response);
    }

}
