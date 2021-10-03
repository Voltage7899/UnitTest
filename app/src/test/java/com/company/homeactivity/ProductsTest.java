package com.company.homeactivity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    @Test
    void getName() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("name",products.getName());
    }

    @Test
    void setName() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("name",products.getName());
    }

    @Test
    void getDescription() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("description",products.getDescription());
    }

    @Test
    void setDescription() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("description",products.getDescription());
    }

    @Test
    void getPrice() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("price",products.getPrice());
    }

    @Test
    void setPrice() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("price",products.getPrice());
    }

    @Test
    void getImage() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("image",products.getImage());
    }

    @Test
    void setImage() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("image",products.getImage());
    }

    @Test
    void getCategory() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("category",products.getCategory());
    }

    @Test
    void setCategory() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("category",products.getCategory());
    }

    @Test
    void getPid() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("pid",products.getPid());
    }

    @Test
    void setPid() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("pid",products.getPid());
    }

    @Test
    void getDate() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("date",products.getDate());
    }

    @Test
    void setDate() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("date",products.getDate());
    }

    @Test
    void getTime() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("time",products.getTime());
    }

    @Test
    void setTime() {
        Products products =new Products("name","description","price","image","category","pid","date","time");
        assertEquals("time",products.getTime());
    }
}