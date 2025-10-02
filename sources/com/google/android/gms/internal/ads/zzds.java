package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes5.dex */
public final class zzds {
    private static final Object zza = new Object();

    @Pure
    public static void zza(@Size String str, String str2) {
        synchronized (zza) {
            Log.d(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzb(@Size String str, String str2) {
        synchronized (zza) {
            Log.i(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzc(@Size String str, String str2) {
        synchronized (zza) {
            Log.w(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzd(@Size String str, String str2, @Nullable Throwable th) {
        synchronized (zza) {
            Log.w(str, zzg(str2, th));
        }
    }

    @Pure
    public static void zze(@Size String str, String str2) {
        synchronized (zza) {
            Log.e(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzf(@Size String str, String str2, @Nullable Throwable th) {
        synchronized (zza) {
            Log.e(str, zzg(str2, th));
        }
    }

    @Pure
    public static String zzg(String str, @Nullable Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (zza) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace("\n", "\n  ");
        int length = String.valueOf(str).length();
        return androidx.constraintlayout.core.state.a.l(new StringBuilder(String.valueOf(strReplace2).length() + length + 3 + 1), str, "\n  ", strReplace2, "\n");
    }
}
