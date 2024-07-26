package com.filiphagno.jobservice.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AppUtil {
    public static final String HOSTNAME;

    static {
        try {
            HOSTNAME = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getHostname() {
        return HOSTNAME;
    }
}
