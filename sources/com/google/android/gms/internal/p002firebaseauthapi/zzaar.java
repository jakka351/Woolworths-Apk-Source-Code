package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.zze;

/* loaded from: classes5.dex */
public final class zzaar {
    private final zzaft zza;

    public zzaar(zzaft zzaftVar) {
        this.zza = (zzaft) Preconditions.checkNotNull(zzaftVar);
    }

    public final void zzb(String str, String str2, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaelVar);
        zza(str, new zzacj(this, str2, zzaelVar));
    }

    public final void zzc(String str, String str2, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaelVar);
        zza(str, new zzacm(this, str2, zzaelVar));
    }

    public final void zzd(String str, @Nullable String str2, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(new zzaic(str, null, str2), new zzabe(this, zzaelVar));
    }

    public final void zze(String str, @Nullable String str2, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(new zzags(str, str2), new zzabc(this, zzaelVar));
    }

    public final void zzf(String str, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaelVar);
        zza(str, new zzabn(this, zzaelVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzajd zzajdVar, zzael zzaelVar, zzafs zzafsVar) {
        Status statusA;
        if (zzajdVar.zzo()) {
            zze zzeVarZzb = zzajdVar.zzb();
            String strZzc = zzajdVar.zzc();
            String strZzj = zzajdVar.zzj();
            if (zzajdVar.zzm()) {
                statusA = new Status(17012);
            } else {
                statusA = zzao.a(zzajdVar.zzd());
            }
            zzaelVar.zza(new zzaap(statusA, zzeVarZzb, strZzc, strZzj));
            return;
        }
        zzaarVar.zza(new zzahv(zzajdVar.zzi(), zzajdVar.zze(), Long.valueOf(zzajdVar.zza()), "Bearer"), zzajdVar.zzh(), zzajdVar.zzg(), Boolean.valueOf(zzajdVar.zzn()), zzajdVar.zzb(), zzaelVar, zzafsVar);
    }

    public final void zzf(String str, String str2, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaelVar);
        zza(str2, new zzabq(this, str, zzaelVar));
    }

    private final void zzd(zzahm zzahmVar, zzael zzaelVar) {
        Preconditions.checkNotNull(zzahmVar);
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(zzahmVar, new zzacf(this, zzaelVar));
    }

    public final void zzb(String str, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(new zzahj(str), new zzaau(this, zzaelVar));
    }

    public final void zzc(String str, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaelVar);
        zza(str, new zzacc(this, zzaelVar));
    }

    public final void zze(@Nullable String str, zzael zzaelVar) {
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(new zzaim(str), new zzaci(this, zzaelVar));
    }

    public final void zzc(zzahm zzahmVar, zzael zzaelVar) {
        zzd(zzahmVar, zzaelVar);
    }

    public final void zzd(@Nullable String str, zzael zzaelVar) {
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(str, new zzacg(this, zzaelVar));
    }

    public final void zzb(zzahm zzahmVar, zzael zzaelVar) {
        Preconditions.checkNotEmpty(zzahmVar.zzc());
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(zzahmVar, new zzabb(this, zzaelVar));
    }

    public final void zzb(String str, String str2, @Nullable String str3, @Nullable String str4, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(new zzaje(str, str2, str3, str4), new zzaaw(this, zzaelVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzaim zzaimVar, zzafs zzafsVar) {
        Preconditions.checkNotNull(zzaelVar);
        Preconditions.checkNotNull(zzaimVar);
        Preconditions.checkNotNull(zzafsVar);
        zzaarVar.zza.zza(zzaimVar, new zzabk(zzaarVar, zzaelVar, zzafsVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzahv zzahvVar, zzail zzailVar, zzafs zzafsVar) {
        Preconditions.checkNotNull(zzaelVar);
        Preconditions.checkNotNull(zzahvVar);
        Preconditions.checkNotNull(zzailVar);
        Preconditions.checkNotNull(zzafsVar);
        zzaarVar.zza.zza(new zzahi(zzahvVar.zzc()), new zzaax(zzaarVar, zzafsVar, zzaelVar, zzahvVar, zzailVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzahv zzahvVar, zzahk zzahkVar, zzail zzailVar, zzafs zzafsVar) {
        Preconditions.checkNotNull(zzaelVar);
        Preconditions.checkNotNull(zzahvVar);
        Preconditions.checkNotNull(zzahkVar);
        Preconditions.checkNotNull(zzailVar);
        Preconditions.checkNotNull(zzafsVar);
        zzaarVar.zza.zza(zzailVar, new zzaba(zzaarVar, zzailVar, zzahkVar, zzaelVar, zzahvVar, zzafsVar));
    }

    public final void zza(String str, @Nullable String str2, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaelVar);
        zzail zzailVar = new zzail();
        zzailVar.zze(str);
        zzailVar.zzh(str2);
        this.zza.zza(zzailVar, new zzacl(this, zzaelVar));
    }

    public final void zza(zzaic zzaicVar, zzael zzaelVar) {
        Preconditions.checkNotEmpty(zzaicVar.zzb());
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(zzaicVar, new zzabg(this, zzaelVar));
    }

    public final void zza(String str, String str2, @Nullable String str3, @Nullable String str4, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(new zzaim(str, str2, null, str3, str4, null), new zzaat(this, zzaelVar));
    }

    public final void zza(String str, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaelVar);
        zza(str, new zzace(this, zzaelVar));
    }

    private final void zza(String str, zzafv<zzahv> zzafvVar) {
        Preconditions.checkNotNull(zzafvVar);
        Preconditions.checkNotEmpty(str);
        zzahv zzahvVarZzb = zzahv.zzb(str);
        if (zzahvVarZzb.zzg()) {
            zzafvVar.zza((zzafv<zzahv>) zzahvVarZzb);
        } else {
            this.zza.zza(new zzahj(zzahvVarZzb.zzd()), new zzaco(this, zzafvVar));
        }
    }

    public final void zza(zzagz zzagzVar, String str, zzael zzaelVar) {
        Preconditions.checkNotNull(zzagzVar);
        Preconditions.checkNotNull(zzaelVar);
        zza(str, new zzabw(this, zzagzVar, zzaelVar));
    }

    public final void zza(zzahb zzahbVar, zzael zzaelVar) {
        Preconditions.checkNotNull(zzahbVar);
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(zzahbVar, new zzaby(this, zzaelVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzagx zzagxVar, zzael zzaelVar) {
        Preconditions.checkNotNull(zzagxVar);
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(zzagxVar, new zzaay(this, zzaelVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahv zzahvVar, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable zze zzeVar, zzael zzaelVar, zzafs zzafsVar) {
        Preconditions.checkNotNull(zzahvVar);
        Preconditions.checkNotNull(zzafsVar);
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(new zzahi(zzahvVar.zzc()), new zzaaz(this, zzafsVar, str2, str, bool, zzeVar, zzaelVar, zzahvVar));
    }

    public final void zza(zzaho zzahoVar, zzael zzaelVar) {
        Preconditions.checkNotNull(zzahoVar);
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(zzahoVar, new zzabz(this, zzaelVar));
    }

    public final void zza(zzaht zzahtVar, zzael zzaelVar) {
        Preconditions.checkNotNull(zzahtVar);
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(zzahtVar, new zzaca(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, @Nullable String str4, @Nullable String str5, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzaelVar);
        zza(str3, new zzabh(this, str, str2, str4, str5, zzaelVar));
    }

    public final void zza(String str, zzajb zzajbVar, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzajbVar);
        Preconditions.checkNotNull(zzaelVar);
        zza(str, new zzabl(this, zzajbVar, zzaelVar));
    }

    public final void zza(String str, zzajg zzajgVar, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzajgVar);
        Preconditions.checkNotNull(zzaelVar);
        zza(str, new zzabj(this, zzajgVar, zzaelVar));
    }

    public final void zza(zzaie zzaieVar, zzael zzaelVar) {
        this.zza.zza(zzaieVar, new zzach(this, zzaelVar));
    }

    public final void zza(zzahm zzahmVar, zzael zzaelVar) {
        Preconditions.checkNotEmpty(zzahmVar.zzd());
        Preconditions.checkNotNull(zzaelVar);
        zzd(zzahmVar, zzaelVar);
    }

    public final void zza(zzaij zzaijVar, zzael zzaelVar) {
        Preconditions.checkNotEmpty(zzaijVar.zzd());
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(zzaijVar, new zzabf(this, zzaelVar));
    }

    public final void zza(zzajb zzajbVar, zzael zzaelVar) {
        Preconditions.checkNotNull(zzajbVar);
        Preconditions.checkNotNull(zzaelVar);
        zzajbVar.zzb(true);
        this.zza.zza(zzajbVar, new zzabu(this, zzaelVar));
    }

    public final void zza(zzajc zzajcVar, zzael zzaelVar) {
        Preconditions.checkNotNull(zzajcVar);
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(zzajcVar, new zzabd(this, zzaelVar));
    }

    public final void zza(EmailAuthCredential emailAuthCredential, @Nullable String str, zzael zzaelVar) {
        Preconditions.checkNotNull(emailAuthCredential);
        Preconditions.checkNotNull(zzaelVar);
        if (emailAuthCredential.h) {
            zza(emailAuthCredential.g, new zzaav(this, emailAuthCredential, str, zzaelVar));
        } else {
            zza(new zzagx(emailAuthCredential, null, str), zzaelVar);
        }
    }

    public final void zza(zzajg zzajgVar, zzael zzaelVar) {
        Preconditions.checkNotNull(zzajgVar);
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(zzajgVar, new zzabi(this, zzaelVar));
    }

    public final void zza(zzaio zzaioVar, zzael zzaelVar) {
        Preconditions.checkNotNull(zzaioVar);
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(zzaioVar, new zzabt(this, zzaioVar, zzaelVar));
    }

    public final void zza(zzaiq zzaiqVar, zzael zzaelVar) {
        Preconditions.checkNotNull(zzaiqVar);
        Preconditions.checkNotNull(zzaelVar);
        this.zza.zza(zzaiqVar, new zzabx(this, zzaelVar));
    }

    public final void zza(String str, String str2, @Nullable String str3, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaelVar);
        zza(str, new zzabs(this, str2, str3, zzaelVar));
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzael zzaelVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(userProfileChangeRequest);
        Preconditions.checkNotNull(zzaelVar);
        zza(str, new zzack(this, userProfileChangeRequest, zzaelVar));
    }
}
