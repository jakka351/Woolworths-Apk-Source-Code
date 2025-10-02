package com.google.firebase.auth.internal;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import androidx.compose.ui.input.pointer.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzks;
import com.google.android.gms.internal.p002firebaseauthapi.zzkt;
import com.google.android.gms.internal.p002firebaseauthapi.zzlh;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class zzq {
    public static zzq c;

    /* renamed from: a, reason: collision with root package name */
    public final String f15214a;
    public final zzmy b;

    public zzq(Context context, String str) {
        zzmy zzmyVarZza;
        this.f15214a = str;
        try {
            zzkt.zza();
            zzmy.zza zzaVarZza = new zzmy.zza().zza(context, "GenericIdpKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzlh.zza);
            zzaVarZza.zza("android-keystore://firebear_master_key_id." + str);
            zzmyVarZza = zzaVarZza.zza();
        } catch (IOException | GeneralSecurityException e) {
            a.v("Exception encountered during crypto setup:\n", e.getMessage(), "FirebearCryptoHelper");
            zzmyVarZza = null;
        }
        this.b = zzmyVarZza;
    }

    public static zzq a(Context context, String str) {
        zzq zzqVar = c;
        if (zzqVar == null || !Objects.equals(zzqVar.f15214a, str)) {
            c = new zzq(context, str);
        }
        return c;
    }

    public final String b() {
        if (this.b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.google.android.gms.internal.p002firebaseauthapi.zzby zzbyVarZza = com.google.android.gms.internal.p002firebaseauthapi.zzbc.zza(byteArrayOutputStream);
        try {
            synchronized (this.b) {
                this.b.zza().zzb().zza(zzbyVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e) {
            a.v("Exception encountered when attempting to get Public Key:\n", e.getMessage(), "FirebearCryptoHelper");
            return null;
        }
    }

    public final String c(String str) {
        String str2;
        zzmy zzmyVar = this.b;
        if (zzmyVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((com.google.android.gms.internal.p002firebaseauthapi.zzbd) this.b.zza().zza(zzks.zza(), com.google.android.gms.internal.p002firebaseauthapi.zzbd.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            a.v("Exception encountered while decrypting bytes:\n", e.getMessage(), "FirebearCryptoHelper");
            return null;
        }
    }
}
