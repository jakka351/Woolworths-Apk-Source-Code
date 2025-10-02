package com.adobe.mobile;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
final class WearableFunctionBridge {

    /* renamed from: a, reason: collision with root package name */
    public static Class f13285a;
    public static Class b;

    public static Class a() {
        Class cls = b;
        if (cls != null) {
            return cls;
        }
        try {
            b = WearableFunctionBridge.class.getClassLoader().loadClass("com.adobe.mobile.ConfigSynchronizer");
        } catch (Exception e) {
            StaticMethods.I("Wearable - Failed to load class com.adobe.mobile.ConfigSynchronizer", e.getLocalizedMessage());
        }
        return b;
    }

    public static Class b() {
        Class cls = f13285a;
        if (cls != null) {
            return cls;
        }
        try {
            f13285a = WearableFunctionBridge.class.getClassLoader().loadClass("com.adobe.mobile.WearableFunction");
        } catch (Exception e) {
            StaticMethods.I("Wearable - Failed to load class com.adobe.mobile.WearableFunction", e.getLocalizedMessage());
        }
        return f13285a;
    }

    public static boolean c() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> clsLoadClass = WearableFunctionBridge.class.getClassLoader().loadClass("com.google.android.gms.common.GoogleApiAvailability");
            Object objInvoke = clsLoadClass.getDeclaredMethod("isGooglePlayServicesAvailable", Context.class).invoke(clsLoadClass.getDeclaredMethod("getInstance", null).invoke(null, null), StaticMethods.A());
            if (objInvoke instanceof Integer) {
                return ((Integer) objInvoke).intValue() == 0;
            }
        } catch (IllegalStateException e) {
            StaticMethods.I("Wearable - Google Play Services is not enabled in your app's AndroidManifest.xml", e.getLocalizedMessage());
        } catch (Exception unused) {
        }
        try {
            Object objInvoke2 = WearableFunctionBridge.class.getClassLoader().loadClass("com.google.android.gms.common.GooglePlayServicesUtil").getDeclaredMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, StaticMethods.A());
            if (objInvoke2 instanceof Integer) {
                return ((Integer) objInvoke2).intValue() == 0;
            }
        } catch (IllegalStateException e2) {
            StaticMethods.I("Wearable - Google Play Services is not enabled in your app's AndroidManifest.xml", e2.getLocalizedMessage());
        } catch (Exception unused2) {
        }
        return false;
    }

    public static void d(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (StaticMethods.e || !MobileConfig.b().l()) {
            return;
        }
        try {
            a().getDeclaredMethod("syncPushEnabled", Boolean.TYPE).invoke(null, Boolean.valueOf(z));
        } catch (Exception e) {
            StaticMethods.I("Wearable - Unable to sync push enabled status (%s)", e.getLocalizedMessage());
        }
    }

    public static void e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (StaticMethods.e || !MobileConfig.b().l()) {
            return;
        }
        try {
            a().getDeclaredMethod("syncVisitorID", String.class).invoke(null, null);
        } catch (Exception e) {
            StaticMethods.I("Wearable - Unable to sync visitor id (%s)", e.getLocalizedMessage());
        }
    }
}
