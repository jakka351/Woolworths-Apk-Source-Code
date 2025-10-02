package com.adobe.mobile;

import android.content.SharedPreferences;
import com.adobe.mobile.AudienceManagerWorker;
import com.adobe.mobile.StaticMethods;
import com.adobe.mobile.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
class MobileIdentities {

    /* renamed from: com.adobe.mobile.MobileIdentities$1, reason: invalid class name */
    final class AnonymousClass1 implements Callable<List<Object>> {
        @Override // java.util.concurrent.Callable
        public final List<Object> call() {
            ArrayList arrayList = new ArrayList();
            synchronized (StaticMethods.u) {
            }
            StaticMethods.h();
            return arrayList;
        }
    }

    /* renamed from: com.adobe.mobile.MobileIdentities$2, reason: invalid class name */
    final class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            StaticMethods.i().execute(new AnonymousClass3());
            StaticMethods.n().execute(new AudienceManagerWorker.AnonymousClass6());
            StaticMethods.n().execute(new AudienceManagerWorker.AnonymousClass7());
            StaticMethods.i().execute(new AnonymousClass4());
            StaticMethods.i().execute(new Target.AnonymousClass5());
            final VisitorIDService visitorIDServiceI = VisitorIDService.i();
            visitorIDServiceI.j.execute(new Runnable() { // from class: com.adobe.mobile.VisitorIDService.15
                public AnonymousClass15() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    VisitorIDService visitorIDService = VisitorIDService.this;
                    visitorIDService.d = null;
                    visitorIDService.i = null;
                    visitorIDService.g = null;
                    visitorIDService.h = null;
                    visitorIDService.e = null;
                    visitorIDService.f = null;
                    try {
                        SharedPreferences.Editor editorC = StaticMethods.C();
                        editorC.remove("ADBMOBILE_VISITORID_IDS");
                        editorC.remove("ADBMOBILE_PERSISTED_MID");
                        editorC.remove("ADBMOBILE_PERSISTED_MID_HINT");
                        editorC.remove("ADBMOBILE_PERSISTED_MID_BLOB");
                        editorC.apply();
                    } catch (StaticMethods.NullContextException unused) {
                        StaticMethods.K("ID Service - Unable to purge identities (application context is null)", new Object[0]);
                    }
                }
            });
        }
    }

    /* renamed from: com.adobe.mobile.MobileIdentities$3, reason: invalid class name */
    final class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (StaticMethods.X) {
                StaticMethods.W = null;
                try {
                    SharedPreferences.Editor editorEdit = StaticMethods.B().edit();
                    editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_AID");
                    editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID");
                    editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_AID_SYNCED");
                    editorEdit.apply();
                } catch (StaticMethods.NullContextException unused) {
                    StaticMethods.K("Config - Failed to purge AID (application context is null)", new Object[0]);
                }
            }
            synchronized (StaticMethods.r) {
                StaticMethods.p = null;
                WearableFunctionBridge.e();
                try {
                    SharedPreferences.Editor editorC = StaticMethods.C();
                    editorC.remove("APP_MEASUREMENT_VISITOR_ID");
                    editorC.commit();
                } catch (StaticMethods.NullContextException e) {
                    StaticMethods.J("Config - Error purging visitorID. (%s)", e.getMessage());
                }
            }
        }
    }

    /* renamed from: com.adobe.mobile.MobileIdentities$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (StaticMethods.v) {
                if (!StaticMethods.e && MobileConfig.b().l()) {
                    try {
                        WearableFunctionBridge.a().getDeclaredMethod("syncAdvertisingIdentifier", String.class).invoke(null, null);
                    } catch (Exception e) {
                        StaticMethods.I("Wearable - Unable to sync advertisingIdentifier id (%s)", e.getLocalizedMessage());
                    }
                }
            }
            synchronized (StaticMethods.u) {
                StaticMethods.Q(false);
                try {
                    SharedPreferences.Editor editorC = StaticMethods.C();
                    editorC.remove("ADBMOBILE_KEY_PUSH_TOKEN");
                    editorC.commit();
                } catch (StaticMethods.NullContextException e2) {
                    StaticMethods.J("Config - Failed to remove push identifier from shared preferences. (%s)", e2.getMessage());
                }
            }
        }
    }

    public static HashMap a(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("namespace", str);
        map.put("value", str2);
        map.put("type", str3);
        return map;
    }
}
