package com.google.android.gms.internal.vision;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;

/* loaded from: classes5.dex */
public class zzas {

    @GuardedBy
    private static UserManager zza;
    private static volatile boolean zzb = !zza();

    @GuardedBy
    private static boolean zzc = false;

    private zzas() {
    }

    public static boolean zza() {
        return true;
    }

    @RequiresApi
    @TargetApi
    @GuardedBy
    private static boolean zzb(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (zza == null) {
                zza = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = zza;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                zza = null;
                i++;
            }
        }
        z = z2;
        if (z) {
            zza = null;
        }
        return z;
    }

    @RequiresApi
    @TargetApi
    private static boolean zzc(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzas.class) {
            try {
                if (zzb) {
                    return true;
                }
                boolean zZzb = zzb(context);
                if (zZzb) {
                    zzb = zZzb;
                }
                return zZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(Context context) {
        return !zza() || zzc(context);
    }
}
