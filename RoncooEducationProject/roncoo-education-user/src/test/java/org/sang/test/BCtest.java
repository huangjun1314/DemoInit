package org.sang.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCtest {

    public static void main(String[] args){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("123"));
    }

}
