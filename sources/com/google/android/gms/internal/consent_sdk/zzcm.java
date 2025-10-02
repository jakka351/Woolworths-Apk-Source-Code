package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes5.dex */
public final class zzcm {

    @Nullable
    @GuardedBy
    private static String zza;

    public static synchronized String zza(Context context) {
        try {
            if (zza == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, nnlllnn.nnlllln.w007700770077www);
                if (string == null || zzcu.zza(true)) {
                    string = "emulator";
                }
                zza = zzb(string);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    private static String zzb(String str) throws NoSuchAlgorithmException {
        for (int i = 0; i < 3; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format("%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return "";
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return "";
    }
}
