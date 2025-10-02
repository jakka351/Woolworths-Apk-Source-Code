package com.adobe.mobile;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes4.dex */
public final class Analytics {

    /* renamed from: com.adobe.mobile.Analytics$11, reason: invalid class name */
    final class AnonymousClass11 implements Callable<String> {
        @Override // java.util.concurrent.Callable
        public final String call() {
            return StaticMethods.g();
        }
    }

    /* renamed from: com.adobe.mobile.Analytics$12, reason: invalid class name */
    final class AnonymousClass12 implements Callable<Long> {
        @Override // java.util.concurrent.Callable
        public final Long call() {
            return Long.valueOf(AnalyticsWorker.o().j());
        }
    }

    /* renamed from: com.adobe.mobile.Analytics$13, reason: invalid class name */
    final class AnonymousClass13 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            AnalyticsWorker.o().h();
        }
    }

    /* renamed from: com.adobe.mobile.Analytics$14, reason: invalid class name */
    final class AnonymousClass14 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            AnalyticsWorker.o().k(true);
        }
    }

    /* renamed from: com.adobe.mobile.Analytics$15, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass15 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13260a;

        static {
            int[] iArr = new int[BEACON_PROXIMITY.values().length];
            f13260a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13260a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13260a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13260a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.adobe.mobile.Analytics$3, reason: invalid class name */
    final class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            StaticMethods.K("Analytics - trackLocation failed, invalid location specified", new Object[0]);
        }
    }

    /* renamed from: com.adobe.mobile.Analytics$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            HashMap map = new HashMap();
            AnalyticsTrackBeacon.a();
            Lifecycle.p(map);
            AnalyticsTrackInternal.a("Beacon", map, StaticMethods.E());
        }
    }

    /* renamed from: com.adobe.mobile.Analytics$5, reason: invalid class name */
    final class AnonymousClass5 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            AnalyticsTrackBeacon.a();
        }
    }

    /* renamed from: com.adobe.mobile.Analytics$6, reason: invalid class name */
    final class AnonymousClass6 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            StaticMethods.K("Analytics - trackLifetimeValueIncrease failed, invalid amount specified '%f'", null);
        }
    }

    /* renamed from: com.adobe.mobile.Analytics$7, reason: invalid class name */
    final class AnonymousClass7 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            StaticMethods.K("%s - trackTimedActionStart() failed(the required parameter actionName was null or empty.)", AnalyticsTrackTimedAction.h().f);
        }
    }

    /* renamed from: com.adobe.mobile.Analytics$8, reason: invalid class name */
    final class AnonymousClass8 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            StaticMethods.K("%s - Unable to update the timed action (timed action name was null or empty)", AnalyticsTrackTimedAction.h().f);
        }
    }

    /* renamed from: com.adobe.mobile.Analytics$9, reason: invalid class name */
    final class AnonymousClass9 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            StaticMethods.K("%s - Unable to end the timed action (timed action name was null or empty)", AnalyticsTrackTimedAction.h().f);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BEACON_PROXIMITY {
        public static final /* synthetic */ BEACON_PROXIMITY[] d = {new BEACON_PROXIMITY("PROXIMITY_IMMEDIATE", 0), new BEACON_PROXIMITY("PROXIMITY_NEAR", 1), new BEACON_PROXIMITY("PROXIMITY_FAR", 2), new BEACON_PROXIMITY("PROXIMITY_UNKNOWN", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        BEACON_PROXIMITY EF5;

        public static BEACON_PROXIMITY valueOf(String str) {
            return (BEACON_PROXIMITY) Enum.valueOf(BEACON_PROXIMITY.class, str);
        }

        public static BEACON_PROXIMITY[] values() {
            return (BEACON_PROXIMITY[]) d.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            int iOrdinal = ordinal();
            return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? "0" : "3" : "2" : "1";
        }
    }

    public interface TimedActionBlock<Boolean> {
    }

    public static String a() {
        FutureTask futureTask = new FutureTask(new AnonymousClass11());
        StaticMethods.i().execute(futureTask);
        try {
            return (String) futureTask.get();
        } catch (Exception e) {
            StaticMethods.J("Analytics - Unable to get TrackingIdentifier (%s)", e.getMessage());
            return null;
        }
    }

    public static void b(final String str, Map map) {
        final HashMap map2 = map != null ? new HashMap(map) : null;
        StaticMethods.i().execute(new Runnable() { // from class: com.adobe.mobile.Analytics.2
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, IllegalAccessException, InterruptedException, IllegalArgumentException, UnsupportedEncodingException, InvocationTargetException {
                Map map3 = map2;
                HashMap map4 = map3 != null ? new HashMap(map3) : new HashMap();
                String str2 = str;
                if (str2 == null) {
                    str2 = "";
                }
                map4.put("a.action", str2);
                HashMap map5 = new HashMap();
                map5.put("pe", "lnk_o");
                map5.put("pev2", "AMACTION:".concat(str2));
                map5.put("pageName", StaticMethods.j());
                RequestBuilder.a(map4, map5, StaticMethods.E());
            }
        });
    }

    public static void c(final String str, Map map) {
        final HashMap map2 = map != null ? new HashMap(map) : null;
        StaticMethods.i().execute(new Runnable() { // from class: com.adobe.mobile.Analytics.1
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, IllegalAccessException, InterruptedException, IllegalArgumentException, UnsupportedEncodingException, InvocationTargetException {
                HashMap map3 = new HashMap();
                String strJ = str;
                if (strJ == null || strJ.length() <= 0) {
                    strJ = StaticMethods.j();
                }
                map3.put("pageName", strJ);
                RequestBuilder.a(map2, map3, StaticMethods.E());
            }
        });
    }
}
