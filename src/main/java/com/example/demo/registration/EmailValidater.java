package com.example.demo.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
@Service
public class EmailValidater implements Predicate<String> {
    @Override
    public boolean test(String s) {
        // TODO:regex to validate
        return true;
    }
}
