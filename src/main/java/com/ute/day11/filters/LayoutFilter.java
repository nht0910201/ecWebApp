package com.ute.day11.filters;

import com.ute.day11.beans.Category;
import com.ute.day11.models.CategoryModel;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebFilter(filterName = "LayoutFilter", value = "/*")
public class LayoutFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        List<Category> list = CategoryModel.findAll();
        request.setAttribute("categoriesWithDetails",list);
        chain.doFilter(request, response);
    }
}
