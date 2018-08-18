package com.it.utils;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserFactory {
    private static ResourceBundle bundle = ResourceBundle.getBundle("user");

   public static  User getValidUser(){
        return  new User(bundle.getString("validLogin"),
                bundle.getString("validPassword"),
                bundle.getString("validEmail"));
    }
    public static List<User> getRandomUsers(int count){
        return Stream.generate(()-> new User(
                RandomUtils.getRandomString(10),
                RandomUtils.getRandomString(12),
                RandomUtils.getRandomString(8)+"@i.ua"))
                .limit(count)
                .collect(Collectors.toList());
    }
}
