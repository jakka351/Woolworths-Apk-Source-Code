package com.adobe.mobile;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.adobe.mobile.AudienceManager;
import com.adobe.mobile.Messages;
import com.adobe.mobile.MobileIdentities;
import com.adobe.mobile.StaticMethods;
import com.adobe.mobile.Target;
import com.adobe.mobile.VisitorID;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class Config {

    /* renamed from: com.adobe.mobile.Config$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (StaticMethods.e) {
                try {
                    WearableFunctionBridge.a().getDeclaredMethod("syncConfigFromHandheld", null).invoke(null, null);
                } catch (Exception e) {
                    StaticMethods.I("Wearable - Unable to sync config (%s)", e.getLocalizedMessage());
                }
            }
        }
    }

    /* renamed from: com.adobe.mobile.Config$11, reason: invalid class name */
    final class AnonymousClass11 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() throws JSONException, UnsupportedEncodingException {
            Lifecycle.o(null);
        }
    }

    /* renamed from: com.adobe.mobile.Config$12, reason: invalid class name */
    final class AnonymousClass12 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            Lifecycle.b = true;
            Lifecycle.c = false;
            StaticMethods.T(Long.valueOf(StaticMethods.E()));
            try {
                SharedPreferences.Editor editorC = StaticMethods.C();
                editorC.putBoolean("ADMS_SuccessfulClose", true);
                editorC.putLong("ADMS_PauseDate", StaticMethods.E() * 1000);
                editorC.commit();
            } catch (StaticMethods.NullContextException e) {
                StaticMethods.J("Lifecycle - Error updating lifecycle pause data (%s)", e.getMessage());
            }
            try {
                if (StaticMethods.q().isFinishing()) {
                    StaticMethods.w().execute(new Messages.AnonymousClass5());
                }
            } catch (StaticMethods.NullActivityException unused) {
            }
        }
    }

    /* renamed from: com.adobe.mobile.Config$13, reason: invalid class name */
    final class AnonymousClass13 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            boolean z = Lifecycle.b;
        }
    }

    /* renamed from: com.adobe.mobile.Config$14, reason: invalid class name */
    final class AnonymousClass14 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            Messages.c = 0;
        }
    }

    /* renamed from: com.adobe.mobile.Config$15, reason: invalid class name */
    final class AnonymousClass15 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            Messages.d = 0;
        }
    }

    /* renamed from: com.adobe.mobile.Config$16, reason: invalid class name */
    final class AnonymousClass16 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            MobileConfig.b().getClass();
        }
    }

    /* renamed from: com.adobe.mobile.Config$17, reason: invalid class name */
    final class AnonymousClass17 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList;
            List arrayList2;
            String str;
            String str2;
            String str3;
            HashMap map = new HashMap();
            String str4 = MobileConfig.b().B;
            if (str4 == null || str4.isEmpty()) {
                arrayList = null;
            } else {
                HashMap map2 = new HashMap();
                map2.put("namespace", "imsOrgID");
                map2.put("value", str4);
                arrayList = new ArrayList();
                arrayList.add(map2);
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                map.put("companyContexts", arrayList);
            }
            ArrayList arrayList3 = new ArrayList();
            FutureTask futureTask = new FutureTask(new MobileIdentities.AnonymousClass1());
            StaticMethods.i().execute(futureTask);
            try {
                arrayList2 = (List) futureTask.get();
            } catch (Exception e) {
                StaticMethods.I("Identities - failed to get OS identifiers json (%s)", e.getMessage());
                arrayList2 = new ArrayList();
            }
            arrayList3.addAll(arrayList2);
            ArrayList arrayList4 = new ArrayList();
            String strA = Config.a();
            if (strA != null && !strA.isEmpty()) {
                HashMap mapA = MobileIdentities.a("vid", strA, "analytics");
                String str5 = MobileConfig.b().c;
                if (str5 != null && !str5.isEmpty()) {
                    mapA.put("rsids", Arrays.asList(str5.split(",")));
                }
                arrayList4.add(mapA);
            }
            String strA2 = Analytics.a();
            if (strA2 != null && !strA2.isEmpty()) {
                arrayList4.add(MobileIdentities.a("AVID", Analytics.a(), "integrationCode"));
            }
            arrayList3.addAll(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            FutureTask futureTask2 = new FutureTask(new Target.AnonymousClass1());
            StaticMethods.i().execute(futureTask2);
            try {
                str = (String) futureTask2.get();
            } catch (Exception e2) {
                StaticMethods.J("Target - Unable to get PcID (%s)", e2.getMessage());
                str = null;
            }
            if (str != null && !str.isEmpty()) {
                arrayList5.add(MobileIdentities.a("tntid", str, "target"));
            }
            FutureTask futureTask3 = new FutureTask(new Target.AnonymousClass3());
            StaticMethods.i().execute(futureTask3);
            try {
                str2 = (String) futureTask3.get();
            } catch (Exception e3) {
                StaticMethods.J("Target - Unable to get ThirdPartyID (%s)", e3.getMessage());
                str2 = null;
            }
            if (str2 != null && !str2.isEmpty()) {
                arrayList5.add(MobileIdentities.a("3rdpartyid", str2, "target"));
            }
            arrayList3.addAll(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            String strB = AudienceManagerWorker.b();
            if (strB != null && !strB.isEmpty()) {
                arrayList6.add(MobileIdentities.a(AudienceManagerWorker.a(), strB, "namespaceId"));
            }
            FutureTask futureTask4 = new FutureTask(new AudienceManager.AnonymousClass1());
            StaticMethods.n().execute(futureTask4);
            try {
                str3 = (String) futureTask4.get();
            } catch (Exception e4) {
                StaticMethods.J("Audience Manager - Unable to get Uuid (%s)", e4.getMessage());
                str3 = "";
            }
            if (str3 != null && !str3.isEmpty()) {
                arrayList6.add(MobileIdentities.a("0", str3, "namespaceId"));
            }
            arrayList3.addAll(arrayList6);
            ArrayList arrayList7 = new ArrayList();
            String strG = VisitorIDService.i().g();
            if (strG != null && !strG.isEmpty()) {
                arrayList7.add(MobileIdentities.a("4", strG, "namespaceId"));
            }
            List<VisitorID> listA = Visitor.a();
            if (listA != null && !listA.isEmpty()) {
                for (VisitorID visitorID : listA) {
                    String str6 = visitorID.b;
                    if (str6 != null && !str6.isEmpty()) {
                        arrayList7.add(MobileIdentities.a(visitorID.f13283a, visitorID.b, "integrationCode"));
                    }
                }
            }
            arrayList3.addAll(arrayList7);
            if (!arrayList3.isEmpty()) {
                ArrayList arrayList8 = new ArrayList();
                HashMap map3 = new HashMap();
                map3.put("userIDs", arrayList3);
                arrayList8.add(map3);
                map.put("users", arrayList8);
            }
            StaticMethods.M(map).toString();
            throw null;
        }
    }

    /* renamed from: com.adobe.mobile.Config$2, reason: invalid class name */
    final class AnonymousClass2 implements Callable<MobilePrivacyStatus> {
        @Override // java.util.concurrent.Callable
        public final MobilePrivacyStatus call() {
            return MobileConfig.b().l;
        }
    }

    /* renamed from: com.adobe.mobile.Config$3, reason: invalid class name */
    final class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            MobileConfig.b().getClass();
        }
    }

    /* renamed from: com.adobe.mobile.Config$4, reason: invalid class name */
    final class AnonymousClass4 implements Callable<String> {
        @Override // java.util.concurrent.Callable
        public final String call() {
            return StaticMethods.F();
        }
    }

    /* renamed from: com.adobe.mobile.Config$5, reason: invalid class name */
    final class AnonymousClass5 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            if (MobileConfig.b().l == MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_OUT) {
                return;
            }
            synchronized (StaticMethods.r) {
                StaticMethods.p = null;
                WearableFunctionBridge.e();
                try {
                    SharedPreferences.Editor editorC = StaticMethods.C();
                    editorC.putString("APP_MEASUREMENT_VISITOR_ID", null);
                    editorC.commit();
                } catch (StaticMethods.NullContextException e) {
                    StaticMethods.J("Config - Error updating visitorID. (%s)", e.getMessage());
                }
            }
        }
    }

    /* renamed from: com.adobe.mobile.Config$6, reason: invalid class name */
    final class AnonymousClass6 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            String string;
            if (MobileConfig.b().l == MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_OUT) {
                return;
            }
            synchronized (StaticMethods.u) {
                try {
                    string = StaticMethods.B().getString("ADBMOBILE_KEY_PUSH_TOKEN", null);
                } catch (StaticMethods.NullContextException e) {
                    StaticMethods.I("Unable to retrieve shared preferences (%s)", e);
                }
                if (string != null && (string == null || !string.equals(null))) {
                    SharedPreferences.Editor editorC = StaticMethods.C();
                    editorC.remove("ADBMOBILE_KEY_PUSH_TOKEN");
                    editorC.commit();
                    if (StaticMethods.G()) {
                        StaticMethods.Q(false);
                        StaticMethods.AnonymousClass2 anonymousClass2 = new StaticMethods.AnonymousClass2();
                        anonymousClass2.put("a.push.optin", "False");
                        AnalyticsTrackInternal.a("Push", anonymousClass2, StaticMethods.E());
                    }
                    VisitorIDService visitorIDServiceI = VisitorIDService.i();
                    StaticMethods.AnonymousClass1 anonymousClass1 = new StaticMethods.AnonymousClass1();
                    anonymousClass1.put("20919", null);
                    visitorIDServiceI.h(null, anonymousClass1, VisitorID.VisitorIDAuthenticationState.VISITOR_ID_AUTHENTICATION_STATE_UNKNOWN, false);
                }
                StaticMethods.I("Config - Provided push token matches existing push token.  Analytics push settings will not be resent to Analytics.", new Object[0]);
                VisitorIDService visitorIDServiceI2 = VisitorIDService.i();
                StaticMethods.AnonymousClass1 anonymousClass12 = new StaticMethods.AnonymousClass1();
                anonymousClass12.put("20919", null);
                visitorIDServiceI2.h(null, anonymousClass12, VisitorID.VisitorIDAuthenticationState.VISITOR_ID_AUTHENTICATION_STATE_UNKNOWN, false);
            }
        }
    }

    /* renamed from: com.adobe.mobile.Config$7, reason: invalid class name */
    final class AnonymousClass7 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                MobilePrivacyStatus mobilePrivacyStatus = MobileConfig.b().l;
            } catch (Exception e) {
                StaticMethods.J("Config - Error running the task to get Advertising Identifier (%s).", e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: com.adobe.mobile.Config$8, reason: invalid class name */
    final class AnonymousClass8 implements Callable<BigDecimal> {
        @Override // java.util.concurrent.Callable
        public final BigDecimal call() {
            return AnalyticsTrackLifetimeValueIncrease.a();
        }
    }

    /* renamed from: com.adobe.mobile.Config$9, reason: invalid class name */
    final class AnonymousClass9 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() throws JSONException, UnsupportedEncodingException {
            Lifecycle.o(null);
        }
    }

    public interface AdobeDataCallback {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ApplicationType {
        public static final /* synthetic */ ApplicationType[] d = {new ApplicationType("APPLICATION_TYPE_HANDHELD", 0), new ApplicationType("APPLICATION_TYPE_WEARABLE", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ApplicationType EF5;

        public static ApplicationType valueOf(String str) {
            return (ApplicationType) Enum.valueOf(ApplicationType.class, str);
        }

        public static ApplicationType[] values() {
            return (ApplicationType[]) d.clone();
        }
    }

    public interface ConfigCallback<T> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MobileDataEvent {
        public static final MobileDataEvent d;
        public static final MobileDataEvent e;
        public static final MobileDataEvent f;
        public static final /* synthetic */ MobileDataEvent[] g;

        static {
            MobileDataEvent mobileDataEvent = new MobileDataEvent("MOBILE_EVENT_LIFECYCLE", 0);
            d = mobileDataEvent;
            MobileDataEvent mobileDataEvent2 = new MobileDataEvent("MOBILE_EVENT_ACQUISITION_INSTALL", 1);
            e = mobileDataEvent2;
            MobileDataEvent mobileDataEvent3 = new MobileDataEvent("MOBILE_EVENT_ACQUISITION_LAUNCH", 2);
            f = mobileDataEvent3;
            g = new MobileDataEvent[]{mobileDataEvent, mobileDataEvent2, mobileDataEvent3};
        }

        public static MobileDataEvent valueOf(String str) {
            return (MobileDataEvent) Enum.valueOf(MobileDataEvent.class, str);
        }

        public static MobileDataEvent[] values() {
            return (MobileDataEvent[]) g.clone();
        }
    }

    public static String a() {
        FutureTask futureTask = new FutureTask(new AnonymousClass4());
        StaticMethods.i().execute(futureTask);
        try {
            return (String) futureTask.get();
        } catch (Exception e) {
            StaticMethods.J("Analytics - Unable to get UserIdentifier (%s)", e.getMessage());
            return null;
        }
    }

    public static void b(Context context) {
        String[] strArr = StaticMethods.f13279a;
        if (context != null) {
            if (context instanceof Activity) {
                StaticMethods.a0 = context.getApplicationContext();
            } else {
                StaticMethods.a0 = context;
            }
        }
        StaticMethods.e = false;
    }

    public static void c(Boolean bool) {
        StaticMethods.d = bool.booleanValue();
    }
}
