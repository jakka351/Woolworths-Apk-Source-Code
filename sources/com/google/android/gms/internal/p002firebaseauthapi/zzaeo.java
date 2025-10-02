package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.TotpMultiFactorAssertion;
import com.google.firebase.auth.TotpSecret;
import com.google.firebase.auth.UserProfileChangeRequest;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class zzaeo {
    private static final Logger zza = new Logger("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzaar zzb;
    private final zzagc zzc;

    public zzaeo(FirebaseApp firebaseApp, ScheduledExecutorService scheduledExecutorService) {
        Preconditions.checkNotNull(firebaseApp);
        firebaseApp.a();
        Context context = firebaseApp.f15169a;
        Preconditions.checkNotNull(context);
        this.zzb = new zzaar(new zzafb(firebaseApp, zzafc.zza()));
        this.zzc = new zzagc(context, scheduledExecutorService);
    }

    public final void zza(String str, @Nullable String str2, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zza(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, String str2, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zzb(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzc(String str, String str2, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zzc(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzd(String str, @Nullable String str2, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zzd(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zze(String str, @Nullable String str2, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        this.zzb.zze(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzf(String str, String str2, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zzf(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zze(String str, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zzf(str, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaic zzaicVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzaicVar);
        Preconditions.checkNotEmpty(zzaicVar.zzb());
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zza(zzaicVar, new zzael(zzaemVar, zza));
    }

    public final void zzd(@Nullable String str, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zze(str, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zzb(str, new zzael(zzaemVar, zza));
    }

    public final void zzc(String str, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zzc(str, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, @Nullable String str3, @Nullable String str4, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zza(str, str2, str3, str4, new zzael(zzaemVar, zza));
    }

    public final void zzb(@NonNull zzahm zzahmVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzahmVar);
        Preconditions.checkNotEmpty(zzahmVar.zzc());
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zzb(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zzc(zzahm zzahmVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzahmVar);
        this.zzb.zzc(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zza(str, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, String str2, @Nullable String str3, @Nullable String str4, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaemVar);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zzb(str, str2, str3, str4, new zzael(zzaemVar, zza));
    }

    public final void zza(MultiFactorAssertion multiFactorAssertion, String str, @Nullable String str2, @Nullable String str3, zzaem zzaemVar) {
        Preconditions.checkNotNull(multiFactorAssertion);
        Preconditions.checkNotEmpty(str, "cachedTokenState should not be empty.");
        Preconditions.checkNotNull(zzaemVar);
        if (!(multiFactorAssertion instanceof PhoneMultiFactorAssertion)) {
            if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
                this.zzb.zza(zzahf.zza(str, Preconditions.checkNotEmpty(str2), Preconditions.checkNotEmpty(((TotpSecret) Preconditions.checkNotNull(null)).getSessionInfo()), Preconditions.checkNotEmpty(null), str3), str, new zzael(zzaemVar, zza));
                return;
            }
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        throw null;
    }

    public final void zza(String str, MultiFactorAssertion multiFactorAssertion, @Nullable String str2, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(multiFactorAssertion);
        Preconditions.checkNotNull(zzaemVar);
        if (!(multiFactorAssertion instanceof PhoneMultiFactorAssertion)) {
            if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
                this.zzb.zza(zzahe.zza(str, Preconditions.checkNotEmpty(null), str2, Preconditions.checkNotEmpty(null)), new zzael(zzaemVar, zza));
                return;
            }
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        throw null;
    }

    public final void zza(zzaho zzahoVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzahoVar);
        this.zzb.zza(zzahoVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaht zzahtVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzahtVar);
        this.zzb.zza(zzahtVar, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, @Nullable String str4, @Nullable String str5, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, zzajb zzajbVar, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzajbVar);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zza(str, zzajbVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzahz zzahzVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzaemVar);
        Preconditions.checkNotNull(zzahzVar);
        this.zzb.zza(Preconditions.checkNotEmpty(zzahzVar.zzb()), zzahzVar.zza(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzaie zzaieVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzaieVar);
        this.zzb.zza(zzaieVar, new zzael(zzaemVar, zza));
    }

    public final void zza(@NonNull zzahm zzahmVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzahmVar);
        Preconditions.checkNotEmpty(zzahmVar.zzd());
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zza(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaij zzaijVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzaemVar);
        Preconditions.checkNotNull(zzaijVar);
        String strZzd = zzaijVar.zzd();
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(strZzd)) {
            if (zzaijVar.zze()) {
                this.zzc.zzb(strZzd);
            } else {
                this.zzc.zzb(zzaelVar, strZzd);
                return;
            }
        }
        long jZzb = zzaijVar.zzb();
        boolean zZzf = zzaijVar.zzf();
        if (zza(jZzb, zZzf)) {
            zzaijVar.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(strZzd, zzaelVar, jZzb, zZzf);
        this.zzb.zza(zzaijVar, this.zzc.zza(zzaelVar, strZzd));
    }

    public final void zza(zzain zzainVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzainVar);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zzd(zzainVar.zza(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzajb zzajbVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzajbVar);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zza(zzajbVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzajc zzajcVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzajcVar);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zza(zzajcVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzagx zzagxVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzaemVar);
        Preconditions.checkNotNull(zzagxVar.zzb());
        this.zzb.zza(zzagxVar.zzb(), zzagxVar.zzc(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzaan zzaanVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzaemVar);
        Preconditions.checkNotNull(zzaanVar);
        this.zzb.zza(zzafw.zza((PhoneAuthCredential) Preconditions.checkNotNull(zzaanVar.zza())), new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, @Nullable String str3, long j, boolean z, boolean z2, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z3, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str, "idToken should not be empty.");
        Preconditions.checkNotNull(zzaemVar);
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(str2)) {
            if (z) {
                this.zzc.zzb(str2);
            } else {
                this.zzc.zzb(zzaelVar, str2);
                return;
            }
        }
        zzais zzaisVarZza = zzais.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j, z3)) {
            zzaisVarZza.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzaelVar, j, z3);
        this.zzb.zza(zzaisVarZza, this.zzc.zza(zzaelVar, str2));
    }

    public final void zza(zzaaq zzaaqVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzaaqVar);
        Preconditions.checkNotNull(zzaemVar);
        String str = zzaaqVar.zzb().g;
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(str)) {
            if (zzaaqVar.zzh()) {
                this.zzc.zzb(str);
            } else {
                this.zzc.zzb(zzaelVar, str);
                return;
            }
        }
        long jZza = zzaaqVar.zza();
        boolean zZzi = zzaaqVar.zzi();
        zzaiq zzaiqVarZza = zzaiq.zza(zzaaqVar.zze(), zzaaqVar.zzb().d, zzaaqVar.zzb().g, zzaaqVar.zzd(), zzaaqVar.zzg(), zzaaqVar.zzf(), zzaaqVar.zzc());
        if (zza(jZza, zZzi)) {
            zzaiqVarZza.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(str, zzaelVar, jZza, zZzi);
        this.zzb.zza(zzaiqVarZza, this.zzc.zza(zzaelVar, str));
    }

    public final void zza(zzaiu zzaiuVar, zzaem zzaemVar) {
        this.zzb.zza(zzaiuVar, new zzael((zzaem) Preconditions.checkNotNull(zzaemVar), zza));
    }

    public final void zza(String str, String str2, @Nullable String str3, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str, "cachedTokenState should not be empty.");
        Preconditions.checkNotEmpty(str2, "uid should not be empty.");
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zza(str, str2, str3, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzaem zzaemVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(userProfileChangeRequest);
        Preconditions.checkNotNull(zzaemVar);
        this.zzb.zza(str, userProfileChangeRequest, new zzael(zzaemVar, zza));
    }

    private static boolean zza(long j, boolean z) {
        if (j > 0 && z) {
            return true;
        }
        zza.w("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
