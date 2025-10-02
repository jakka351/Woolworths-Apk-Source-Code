package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzagb {
    private static final Map<String, zzagd> zza = new ArrayMap(0);

    public static PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, @Nullable zzaff zzaffVar) {
        zza(str, zzaffVar);
        return new zzaga(onVerificationStateChangedCallbacks, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, @Nullable zzaff zzaffVar) {
        zza.put(str, new zzagd(zzaffVar, DefaultClock.getInstance().currentTimeMillis()));
    }

    public static boolean zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, @Nullable Activity activity, Executor executor) {
        Map<String, zzagd> map = zza;
        if (map.containsKey(str)) {
            zzagd zzagdVar = map.get(str);
            if (DefaultClock.getInstance().currentTimeMillis() - zzagdVar.zzb < 120000) {
                zzaff zzaffVar = zzagdVar.zza;
                if (zzaffVar == null) {
                    return true;
                }
                zzaffVar.zza(onVerificationStateChangedCallbacks, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
