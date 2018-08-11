package com.it.utils;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.it.utils.RandomUtils.getRandomString;

public class UserFactory {
    private static ResourceBundle bundle = ResourceBundle.getBundle("user");

   public static  User getValidUser(){
        return  new User(bundle.getString("validLogin"),
                bundle.getString("validPassword"),
                bundle.getString("validEmail"));
    }
    public static List<User> getRandomUsers(int count){
        return Stream.generate(()-> new User(
                getRandomString(10),
                getRandomString(12),
                getRandomString(8)+"@i.ua"))
                .limit(count)
                .collect(Collectors.toList());
    }
}
