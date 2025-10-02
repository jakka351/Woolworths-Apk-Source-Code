package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class FirebasePerfTraceValidator extends PerfMetricValidator {
    public static final AndroidLogger c = AndroidLogger.e();
    public final TraceMetric b;

    public FirebasePerfTraceValidator(TraceMetric traceMetric) {
        this.b = traceMetric;
    }

    public static boolean e(TraceMetric traceMetric, int i) {
        if (traceMetric != null) {
            AndroidLogger androidLogger = c;
            if (i > 1) {
                androidLogger.g("Exceed MAX_SUBTRACE_DEEP:1");
                return false;
            }
            for (Map.Entry entry : traceMetric.W().entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    String strTrim = str.trim();
                    if (strTrim.isEmpty()) {
                        androidLogger.g("counterId is empty");
                    } else if (strTrim.length() > 100) {
                        androidLogger.g("counterId exceeded max length 100");
                    } else if (((Long) entry.getValue()) == null) {
                        androidLogger.g("invalid CounterValue:" + entry.getValue());
                        return false;
                    }
                }
                androidLogger.g("invalid CounterId:" + ((String) entry.getKey()));
                return false;
            }
            Iterator<E> it = traceMetric.c0().iterator();
            while (it.hasNext()) {
                if (!e((TraceMetric) it.next(), i + 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean f(TraceMetric traceMetric, int i) {
        Long l;
        AndroidLogger androidLogger = c;
        if (traceMetric == null) {
            androidLogger.g("TraceMetric is null");
            return false;
        }
        if (i > 1) {
            androidLogger.g("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        String strA0 = traceMetric.a0();
        if (strA0 != null) {
            String strTrim = strA0.trim();
            if (!strTrim.isEmpty() && strTrim.length() <= 100) {
                if (traceMetric.Z() <= 0) {
                    androidLogger.g("invalid TraceDuration:" + traceMetric.Z());
                    return false;
                }
                if (!traceMetric.d0()) {
                    androidLogger.g("clientStartTimeUs is null.");
                    return false;
                }
                if (traceMetric.a0().startsWith("_st_") && ((l = (Long) traceMetric.W().get("_fr_tot")) == null || l.compareTo((Long) 0L) <= 0)) {
                    androidLogger.g("non-positive totalFrames in screen trace " + traceMetric.a0());
                    return false;
                }
                Iterator<E> it = traceMetric.c0().iterator();
                while (it.hasNext()) {
                    if (!f((TraceMetric) it.next(), i + 1)) {
                        return false;
                    }
                }
                for (Map.Entry entry : traceMetric.X().entrySet()) {
                    try {
                        PerfMetricValidator.c((String) entry.getKey(), (String) entry.getValue());
                    } catch (IllegalArgumentException e) {
                        androidLogger.g(e.getLocalizedMessage());
                        return false;
                    }
                }
                return true;
            }
        }
        androidLogger.g("invalid TraceId:" + traceMetric.a0());
        return false;
    }

    @Override // com.google.firebase.perf.metrics.validator.PerfMetricValidator
    public final boolean b() {
        TraceMetric traceMetric = this.b;
        boolean zF = f(traceMetric, 0);
        AndroidLogger androidLogger = c;
        if (!zF) {
            androidLogger.g("Invalid Trace:" + traceMetric.a0());
            return false;
        }
        if (traceMetric.V() <= 0) {
            Iterator<E> it = traceMetric.c0().iterator();
            while (it.hasNext()) {
                if (((TraceMetric) it.next()).V() > 0) {
                }
            }
            return true;
        }
        if (e(traceMetric, 0)) {
            return true;
        }
        androidLogger.g("Invalid Counters for Trace:" + traceMetric.a0());
        return false;
    }
}
