package com.company.homeactivity;

import static org.junit.jupiter.api.Assertions.*;

class UsersTest {

    @org.junit.jupiter.api.Test
    void setName() {
        Users users=new Users("name","phone","pass","image");
        assertEquals("name",users.getName());
    }

    @org.junit.jupiter.api.Test
    void setPass() {
        Users users=new Users("name","phone","pass","image");
        assertEquals("phone",users.getPhone());
        assert (users)

    }

    @org.junit.jupiter.api.Test
    void setPhone() {
        Users users=new Users("name","phone","pass","image");
        assertEquals("pass",users.getPass());
    }

    @org.junit.jupiter.api.Test
    void setImage() {
        Users users=new Users("name","phone","pass","image");
        assertEquals("image",users.getImage());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Users users=new Users("name","phone","pass","image");
        assertEquals("name",users.getName());

    }

    @org.junit.jupiter.api.Test
    void getPhone() {
        Users users=new Users("name","phone","pass","image");
        assertEquals("pass",users.getPass());
    }

    @org.junit.jupiter.api.Test
    void getPass() {
        Users users=new Users("name","phone","pass","image");
        assertEquals("pass",users.getPass());
    }

    @org.junit.jupiter.api.Test
    void getImage() {
        Users users=new Users("name","phone","pass","image");
        assertEquals("image",users.getImage());
    }
}