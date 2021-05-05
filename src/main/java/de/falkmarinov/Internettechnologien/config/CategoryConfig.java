package de.falkmarinov.Internettechnologien.config;

import de.falkmarinov.Internettechnologien.service.AddCategoryService;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class CategoryConfig implements ServletContextListener {

    public static final String CATEGORY_ATTR = "categories";

    @Inject
    private AddCategoryService categoryService;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().setAttribute(CATEGORY_ATTR, categoryService.getAllCategories());
    }
}
