package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class DynamicColors {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f14551a;
    public static final Map b;

    /* renamed from: com.google.android.material.color.DynamicColors$1, reason: invalid class name */
    public class AnonymousClass1 implements DeviceSupportCondition {
        @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
        public final boolean a() {
            return true;
        }
    }

    /* renamed from: com.google.android.material.color.DynamicColors$2, reason: invalid class name */
    public class AnonymousClass2 implements DeviceSupportCondition {

        /* renamed from: a, reason: collision with root package name */
        public Long f14552a;

        @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
        public final boolean a() throws NoSuchMethodException, SecurityException {
            if (this.f14552a == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    Long l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                    l.longValue();
                    this.f14552a = l;
                } catch (Exception unused) {
                    this.f14552a = -1L;
                }
            }
            return this.f14552a.longValue() >= 40100;
        }
    }

    public interface DeviceSupportCondition {
        boolean a();
    }

    public static class DynamicColorsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onActivityPreCreated(android.app.Activity r2, android.os.Bundle r3) {
            /*
                r1 = this;
                java.util.Map r2 = com.google.android.material.color.DynamicColors.f14551a
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 31
                if (r2 >= r3) goto L9
                goto L4a
            L9:
                int r3 = androidx.core.os.BuildCompat.f2439a
                r3 = 33
                if (r2 >= r3) goto L4b
                r3 = 32
                if (r2 < r3) goto L22
                java.lang.String r2 = android.os.Build.VERSION.CODENAME
                java.lang.String r3 = "CODENAME"
                kotlin.jvm.internal.Intrinsics.g(r2, r3)
                java.lang.String r2 = "Tiramisu"
                boolean r2 = androidx.core.os.BuildCompat.a(r2)
                if (r2 != 0) goto L4b
            L22:
                java.util.Map r2 = com.google.android.material.color.DynamicColors.f14551a
                java.lang.String r3 = android.os.Build.MANUFACTURER
                java.util.Locale r0 = java.util.Locale.ROOT
                java.lang.String r3 = r3.toLowerCase(r0)
                java.lang.Object r2 = r2.get(r3)
                com.google.android.material.color.DynamicColors$DeviceSupportCondition r2 = (com.google.android.material.color.DynamicColors.DeviceSupportCondition) r2
                if (r2 != 0) goto L42
                java.util.Map r2 = com.google.android.material.color.DynamicColors.b
                java.lang.String r3 = android.os.Build.BRAND
                java.lang.String r3 = r3.toLowerCase(r0)
                java.lang.Object r2 = r2.get(r3)
                com.google.android.material.color.DynamicColors$DeviceSupportCondition r2 = (com.google.android.material.color.DynamicColors.DeviceSupportCondition) r2
            L42:
                if (r2 == 0) goto L4a
                boolean r2 = r2.a()
                if (r2 != 0) goto L4b
            L4a:
                return
            L4b:
                r2 = 0
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.DynamicColors.DynamicColorsActivityLifecycleCallbacks.onActivityPreCreated(android.app.Activity, android.os.Bundle):void");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    public interface OnAppliedCallback {
    }

    public interface Precondition {
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        HashMap map = new HashMap();
        map.put("fcnt", anonymousClass1);
        map.put("google", anonymousClass1);
        map.put("hmd global", anonymousClass1);
        map.put("infinix", anonymousClass1);
        map.put("infinix mobility limited", anonymousClass1);
        map.put("itel", anonymousClass1);
        map.put("kyocera", anonymousClass1);
        map.put("lenovo", anonymousClass1);
        map.put("lge", anonymousClass1);
        map.put("meizu", anonymousClass1);
        map.put("motorola", anonymousClass1);
        map.put("nothing", anonymousClass1);
        map.put("oneplus", anonymousClass1);
        map.put("oppo", anonymousClass1);
        map.put("realme", anonymousClass1);
        map.put("robolectric", anonymousClass1);
        map.put("samsung", anonymousClass2);
        map.put("sharp", anonymousClass1);
        map.put("shift", anonymousClass1);
        map.put("sony", anonymousClass1);
        map.put("tcl", anonymousClass1);
        map.put("tecno", anonymousClass1);
        map.put("tecno mobile limited", anonymousClass1);
        map.put("vivo", anonymousClass1);
        map.put("wingtech", anonymousClass1);
        map.put("xiaomi", anonymousClass1);
        f14551a = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", anonymousClass1);
        map2.put("jio", anonymousClass1);
        b = Collections.unmodifiableMap(map2);
    }
}
