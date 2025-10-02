package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.v1.PerfMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class PerfMetricValidator {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f15706a = Pattern.compile("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*");

    public static boolean a(PerfMetric perfMetric, Context context) {
        ArrayList arrayList = new ArrayList();
        if (perfMetric.g()) {
            arrayList.add(new FirebasePerfTraceValidator(perfMetric.h()));
        }
        if (perfMetric.f()) {
            arrayList.add(new FirebasePerfNetworkValidator(perfMetric.b(), context));
        }
        if (perfMetric.Q()) {
            arrayList.add(new FirebasePerfApplicationInfoValidator(perfMetric.P()));
        }
        if (perfMetric.e()) {
            arrayList.add(new FirebasePerfGaugeMetricValidator(perfMetric.d()));
        }
        if (arrayList.isEmpty()) {
            AndroidLogger.e().a("No validators found for PerfMetric.");
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((PerfMetricValidator) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    public static void c(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        }
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        if (str.length() > 40) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("Attribute key length must not exceed 40 characters");
        }
        if (str2.length() > 100) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("Attribute value length must not exceed 100 characters");
        }
        if (!f15706a.matcher(str).matches()) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    public static String d(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            Locale locale = Locale.US;
            return "Metric name must not exceed 100 characters";
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (Constants.CounterNames counterNames : Constants.CounterNames.values()) {
            if (counterNames.d.equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    public abstract boolean b();
}
