package com.municipalpolice.officerapp.util;

import java.util.concurrent.TimeUnit;

/** Small formatting helpers for the shift timer and "X minutes ago" style labels. */
public final class TimeFormat {

    private TimeFormat() { }

    public static String hms(long millis) {
        long duration = Math.max(0, millis);
        long h = TimeUnit.MILLISECONDS.toHours(duration);
        long m = TimeUnit.MILLISECONDS.toMinutes(duration) % 60;
        long s = TimeUnit.MILLISECONDS.toSeconds(duration) % 60;
        return String.format(java.util.Locale.US, "%02d:%02d:%02d", h, m, s);
    }

    public static String minutesAgo(long minutes) {
        return minutes + " min";
    }
}
