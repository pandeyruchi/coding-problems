package com.ruchi.leetcode;

public class IPAddress {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
