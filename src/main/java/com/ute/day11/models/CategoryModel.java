package com.ute.day11.models;

import com.ute.day11.beans.Category;
import com.ute.day11.utils.DbUtils;
import org.sql2o.Connection;

import java.util.List;

public class CategoryModel {
    public static List<Category> findAll(){
            final String query = "select * from categories";
            try (Connection con = DbUtils.getConnection()) {
                return con.createQuery(query)
                        .executeAndFetch(Category.class);
            }
    }

    public static void add(Category c){
        String insertSql = "insert into categories(CatName) values (:CatName)";
        try (Connection con = DbUtils.getConnection()) {
            con.createQuery(insertSql)
                    .addParameter("CatName", c.getCatName())
                    .executeUpdate();
        }
    }
    public static Category findByID(int id){
        final String query = "select * from categories where CatID=:CatID";
        try (Connection con = DbUtils.getConnection()) {
            List<Category> list = con.createQuery(query)
                    .addParameter("CatID",id)
                    .executeAndFetch(Category.class);
            if(list.size()==0)
            {
                return null;
            }
            return list.get(0);
        }
    }
    public static void update(Category c){
        String Sql = "update categories set CatName=:CatName where CatID=:CatID";
        try (Connection con = DbUtils.getConnection()) {
            con.createQuery(Sql)
                    .addParameter("CatID", c.getCatID())
                    .addParameter("CatName", c.getCatName())
                    .executeUpdate();
        }
    }
    public static void delete(int id){
        String Sql = "delete from categories where CatID=:CatID";
        try (Connection con = DbUtils.getConnection()) {
            con.createQuery(Sql)
                    .addParameter("CatID",id)
                    .executeUpdate();
        }
    }
}
