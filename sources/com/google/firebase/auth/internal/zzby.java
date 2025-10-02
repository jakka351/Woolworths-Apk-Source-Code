package com.google.firebase.auth.internal;

import android.content.Context;
import androidx.compose.ui.input.pointer.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzcl;
import com.google.android.gms.internal.p002firebaseauthapi.zzcv;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class zzby {
    public static zzby c;

    /* renamed from: a, reason: collision with root package name */
    public final String f15204a;
    public final zzmy b;

    public zzby(String str, zzmy zzmyVar) {
        this.f15204a = str;
        this.b = zzmyVar;
    }

    public static zzby a(Context context, String str) {
        zzmy zzmyVarB;
        zzby zzbyVar = c;
        if (zzbyVar == null || !Objects.equals(zzbyVar.f15204a, str)) {
            try {
                zzcl.zza();
                zzmyVarB = b(context, str);
            } catch (IOException | GeneralSecurityException e) {
                a.v("Exception encountered during crypto setup:\n", e.getMessage(), "FirebearStorageCryptoHelper");
                if (e instanceof GeneralSecurityException) {
                    context.getSharedPreferences("com.google.firebase.auth.api.crypto." + str, 0).edit().remove("StorageCryptoKeyset").apply();
                    try {
                        zzmyVarB = b(context, str);
                    } catch (IOException | GeneralSecurityException e2) {
                        a.v("Exception encountered during second attempt to crypto setup:\n", e2.getMessage(), "FirebearStorageCryptoHelper");
                        zzmyVarB = null;
                        c = new zzby(str, zzmyVarB);
                        return c;
                    }
                } else {
                    zzmyVarB = null;
                }
                return c;
            }
            c = new zzby(str, zzmyVarB);
        }
        return c;
    }

    public static zzmy b(Context context, String str) {
        return new zzmy.zza().zza(context, "StorageCryptoKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzcv.zzb).zza("android-keystore://firebear_main_key_id_for_storage_crypto." + str).zza();
    }
}
