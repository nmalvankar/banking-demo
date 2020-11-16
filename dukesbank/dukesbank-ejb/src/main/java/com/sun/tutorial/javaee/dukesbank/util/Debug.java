package com.sun.tutorial.javaee.dukesbank.util;

import java.util.logging.Logger;


/**
 * This class makes it easier to print out debug statements.
 * The Debug.print statements are printed to System.err
 * if debuggingOn = true.
 */
public final class Debug {
    public static final boolean debuggingOn = true;

    private static Logger log = Logger.getLogger(Debug.class.getName());

    public static final void print(String msg) {
        if (debuggingOn) {
            log.fine("Debug: " + msg);
        }
    }

    public static final void print(
        String msg,
        Object object) {
        if (debuggingOn) {
            log.fine("Debug: " + msg);
            log.fine("       " + object.getClass().getName());
        }
    }
}
