package com.ute.day11.controllers;

import com.ute.day11.beans.Category;
import com.ute.day11.beans.Product;
import com.ute.day11.models.ProductModel;
import com.ute.day11.utils.ServletUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductFEServlet", value = "/Product/*")
public class ProductFEServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getPathInfo();
        switch (path) {
            case "/ByCat":
                int catId = Integer.parseInt(request.getParameter("id"));
                List<Product> list = ProductModel.findByCatId(catId);
                request.setAttribute("products",list);
                ServletUtils.forward("/views/vwProduct/ByCat.jsp",request,response);
                break;
            case "/Detail":
                int proId = Integer.parseInt(request.getParameter("id"));
                Product product = ProductModel.findByID(proId);
                if(product==null)
                {
                    ServletUtils.redirect("/Home",request,response);
                }
                else {
                    request.setAttribute("product",product);
                    ServletUtils.forward("/views/vwProduct/Detail.jsp",request,response);
                    break;
                }

            default:
                ServletUtils.forward("/views/404.jsp",request,response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
