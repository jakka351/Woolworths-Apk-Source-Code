package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.UnmodifiableListIterator;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.core.source.CameraSettings;

/* loaded from: classes.dex */
public final class zzc {

    /* renamed from: a, reason: collision with root package name */
    public static final ImmutableSet f15183a;
    public static final ImmutableList b;
    public static final ImmutableList c;
    public static final ImmutableList d;
    public static final ImmutableList e;
    public static final ImmutableList f;

    static {
        int i = ImmutableSet.f;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f15183a = ImmutableSet.o(15, objArr);
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.e;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        ObjectArrays.a(7, objArr2);
        b = ImmutableList.l(7, objArr2);
        Object[] objArr3 = {CameraSettings.FOCUS_STRATEGY_AUTO, "app", "am"};
        ObjectArrays.a(3, objArr3);
        c = ImmutableList.l(3, objArr3);
        d = ImmutableList.x(NotificationMessage.NOTIF_KEY_REQUEST_ID, "_dbg");
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.i(zzjo.zza);
        builder.i(zzjo.zzb);
        e = builder.j();
        f = ImmutableList.x("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str) {
        return !c.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(Bundle bundle, String str) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        ImmutableList immutableList = d;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((String) immutableList.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        }
        if (e.contains(str2)) {
            return false;
        }
        ImmutableList immutableList = f;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            boolean zMatches = str2.matches((String) immutableList.get(i));
            i++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(Bundle bundle, String str, String str2) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        ImmutableList immutableList = d;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((String) immutableList.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            } else if (str.equals("fdl")) {
                bundle.putString("_cis", "fdl_integration");
                return true;
            }
        } else if (str.equals(AppMeasurement.FCM_ORIGIN)) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        return false;
    }
}
