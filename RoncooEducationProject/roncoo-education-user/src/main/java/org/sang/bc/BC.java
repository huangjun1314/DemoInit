package org.sang.bc;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BC {

    /*public static void main(String[] args){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("123"));
        System.out.println(encoder.matches("123","$2a$10$OZfqTIZEGM.r0BYlurIJTelOUtEU8lvSQX69sRSikRzyamIcqBRYG"));
    }*/

    public static String bcEncoder(String charSequence){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String bcencoder = encoder.encode(charSequence);
        return bcencoder;
    }

    public static Boolean bcEncoderDB(String rawPassword,String encodedPassword){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        Boolean bcencoder = encoder.matches(rawPassword,encodedPassword);
        return bcencoder;
    }

}
