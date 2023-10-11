package com.springboot.sqlserver.util;

import java.util.NoSuchElementException;

public class ProfileUtil {
    private ProfileUtil() {
    }

    public static NoSuchElementException notFound(Long empId) {
        return new NoSuchElementException("Patient with id=" + empId + " not found.");
    }
}
