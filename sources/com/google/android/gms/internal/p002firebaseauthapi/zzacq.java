package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.ActionCodeResult;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.SignInMethodQueryResult;
import com.google.firebase.auth.TotpMultiFactorAssertion;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzab;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzah;
import com.google.firebase.auth.internal.zzam;
import com.google.firebase.auth.internal.zzau;
import com.google.firebase.auth.internal.zzav;
import com.google.firebase.auth.internal.zzbk;
import com.google.firebase.auth.internal.zzcf;
import com.google.firebase.auth.internal.zzl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class zzacq extends zzafo {
    public zzacq(FirebaseApp firebaseApp, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzaeo(firebaseApp, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, String str, @Nullable String str2) {
        return zza((zzacp) new zzacp(str, str2).zza(firebaseApp));
    }

    public final Task<ActionCodeResult> zzb(FirebaseApp firebaseApp, String str, @Nullable String str2) {
        return zza((zzacs) new zzacs(str, str2).zza(firebaseApp));
    }

    public final Task<SignInMethodQueryResult> zzc(FirebaseApp firebaseApp, String str, @Nullable String str2) {
        return zza((zzacw) new zzacw(str, str2).zza(firebaseApp));
    }

    public final Task<Void> zzd(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzcf zzcfVar) {
        return zza((zzaeg) new zzaeg(str).zza(firebaseApp).zza(firebaseUser).zza((zzaff<Void, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, String str, String str2, @Nullable String str3) {
        return zza((zzacr) new zzacr(str, str2, str3).zza(firebaseApp));
    }

    public final Task<Void> zzb(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, @Nullable String str2, @Nullable String str3) {
        actionCodeSettings.l = 6;
        return zza((zzadp) new zzadp(str, actionCodeSettings, str2, str3, "sendSignInLinkToEmail").zza(firebaseApp));
    }

    public final Task<AuthResult> zzc(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, @Nullable String str, zzcf zzcfVar) {
        return zza((zzadf) new zzadf(authCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzaff<AuthResult, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, String str, String str2, String str3, @Nullable String str4, zzl zzlVar) {
        return zza((zzacu) new zzacu(str, str2, str3, str4).zza(firebaseApp).zza((zzaff<AuthResult, zzl>) zzlVar));
    }

    public final Task<String> zzd(FirebaseApp firebaseApp, String str, @Nullable String str2) {
        return zza((zzaek) new zzaek(str, str2).zza(firebaseApp));
    }

    public final Task<Void> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, @Nullable String str, zzcf zzcfVar) {
        return zza((zzadg) new zzadg(authCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzaff<Void, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    public final Task<Void> zzc(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzcf zzcfVar) {
        return zza((zzaed) new zzaed(str).zza(firebaseApp).zza(firebaseUser).zza((zzaff<Void, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    @NonNull
    public final Task<Void> zza(FirebaseUser firebaseUser, zzav zzavVar) {
        return zza((zzact) new zzact().zza(firebaseUser).zza((zzaff<Void, zzav>) zzavVar).zza((zzau) zzavVar));
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, @Nullable String str, zzcf zzcfVar) {
        return zza((zzadh) new zzadh(emailAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzaff<AuthResult, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, PhoneMultiFactorAssertion phoneMultiFactorAssertion, FirebaseUser firebaseUser, @Nullable String str, zzl zzlVar) {
        zzagb.zza();
        zzacv zzacvVar = new zzacv(phoneMultiFactorAssertion, firebaseUser.zze(), str, null);
        zzacvVar.zza(firebaseApp).zza((zzaff<Void, zzl>) zzlVar);
        return zza(zzacvVar);
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, @Nullable String str3, @Nullable String str4, zzcf zzcfVar) {
        return zza((zzadj) new zzadj(str, str2, str3, str4).zza(firebaseApp).zza(firebaseUser).zza((zzaff<AuthResult, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, TotpMultiFactorAssertion totpMultiFactorAssertion, FirebaseUser firebaseUser, @Nullable String str, @Nullable String str2, zzl zzlVar) {
        zzacv zzacvVar = new zzacv(totpMultiFactorAssertion, firebaseUser.zze(), str, str2);
        zzacvVar.zza(firebaseApp).zza((zzaff<Void, zzl>) zzlVar);
        return zza(zzacvVar);
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, @Nullable FirebaseUser firebaseUser, PhoneMultiFactorAssertion phoneMultiFactorAssertion, String str, zzl zzlVar) {
        zzagb.zza();
        zzacy zzacyVar = new zzacy(phoneMultiFactorAssertion, str, null);
        zzacyVar.zza(firebaseApp).zza((zzaff<AuthResult, zzl>) zzlVar);
        if (firebaseUser != null) {
            zzacyVar.zza(firebaseUser);
        }
        return zza(zzacyVar);
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, @Nullable String str, zzcf zzcfVar) {
        zzagb.zza();
        return zza((zzadl) new zzadl(phoneAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzaff<AuthResult, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, @Nullable FirebaseUser firebaseUser, TotpMultiFactorAssertion totpMultiFactorAssertion, String str, @Nullable String str2, zzl zzlVar) {
        zzacy zzacyVar = new zzacy(totpMultiFactorAssertion, str, str2);
        zzacyVar.zza(firebaseApp).zza((zzaff<AuthResult, zzl>) zzlVar);
        if (firebaseUser != null) {
            zzacyVar.zza(firebaseUser);
        }
        return zza(zzacyVar);
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, String str, String str2, @Nullable String str3, @Nullable String str4, zzl zzlVar) {
        return zza((zzadw) new zzadw(str, str2, str3, str4).zza(firebaseApp).zza((zzaff<AuthResult, zzl>) zzlVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, @Nullable String str2, @Nullable String str3) {
        actionCodeSettings.l = 1;
        return zza((zzadp) new zzadp(str, actionCodeSettings, str2, str3, "sendPasswordResetEmail").zza(firebaseApp));
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzcf zzcfVar) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzcfVar);
        List listZzg = firebaseUser.zzg();
        if ((listZzg != null && !listZzg.contains(str)) || firebaseUser.d2()) {
            return Tasks.forException(zzaen.zza(new Status(17016, str)));
        }
        str.getClass();
        if (!str.equals("password")) {
            return zza((zzaee) new zzaee(str).zza(firebaseApp).zza(firebaseUser).zza((zzaff<AuthResult, zzl>) zzcfVar).zza((zzau) zzcfVar));
        }
        return zza((zzaeb) new zzaeb().zza(firebaseApp).zza(firebaseUser).zza((zzaff<AuthResult, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    public final Task<Void> zza(String str, String str2, ActionCodeSettings actionCodeSettings) {
        actionCodeSettings.l = 7;
        return zza(new zzaeh(str, str2, actionCodeSettings));
    }

    public final Task<GetTokenResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzcf zzcfVar) {
        return zza((zzacx) new zzacx(str).zza(firebaseApp).zza(firebaseUser).zza((zzaff<GetTokenResult, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    public final Task<zzahr> zza() {
        return zza(new zzada());
    }

    public final Task<zzahs> zza(@Nullable String str, String str2) {
        return zza(new zzacz(str, str2));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, @Nullable String str, zzcf zzcfVar) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(authCredential);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzcfVar);
        List listZzg = firebaseUser.zzg();
        if (listZzg != null && listZzg.contains(authCredential.d())) {
            return Tasks.forException(zzaen.zza(new Status(17015)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (!emailAuthCredential.zzf()) {
                return zza((zzadc) new zzadc(emailAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzaff<AuthResult, zzl>) zzcfVar).zza((zzau) zzcfVar));
            }
            return zza((zzadd) new zzadd(emailAuthCredential).zza(firebaseApp).zza(firebaseUser).zza((zzaff<AuthResult, zzl>) zzcfVar).zza((zzau) zzcfVar));
        }
        if (authCredential instanceof PhoneAuthCredential) {
            zzagb.zza();
            return zza((zzade) new zzade((PhoneAuthCredential) authCredential).zza(firebaseApp).zza(firebaseUser).zza((zzaff<AuthResult, zzl>) zzcfVar).zza((zzau) zzcfVar));
        }
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(authCredential);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzcfVar);
        return zza((zzadb) new zzadb(authCredential).zza(firebaseApp).zza(firebaseUser).zza((zzaff<AuthResult, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, @Nullable String str, zzcf zzcfVar) {
        return zza((zzadi) new zzadi(emailAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzaff<Void, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, @Nullable String str3, @Nullable String str4, zzcf zzcfVar) {
        return zza((zzadk) new zzadk(str, str2, str3, str4).zza(firebaseApp).zza(firebaseUser).zza((zzaff<Void, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, @Nullable String str, zzcf zzcfVar) {
        zzagb.zza();
        return zza((zzadm) new zzadm(phoneAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzaff<Void, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    @NonNull
    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, zzcf zzcfVar) {
        return zza((zzado) new zzado().zza(firebaseApp).zza(firebaseUser).zza((zzaff<Void, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    public final Task<Void> zza(String str, String str2, String str3, @Nullable String str4) {
        return zza(new zzadn(str, str2, str3, str4));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, @Nullable ActionCodeSettings actionCodeSettings, String str) {
        return zza((zzadq) new zzadq(str, actionCodeSettings).zza(firebaseApp));
    }

    @NonNull
    public final Task<Void> zza(@Nullable String str) {
        return zza(new zzads(str));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, zzl zzlVar, @Nullable String str) {
        return zza((zzadr) new zzadr(str).zza(firebaseApp).zza((zzaff<AuthResult, zzl>) zzlVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, AuthCredential authCredential, @Nullable String str, zzl zzlVar) {
        return zza((zzadu) new zzadu(authCredential, str).zza(firebaseApp).zza((zzaff<AuthResult, zzl>) zzlVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, String str, @Nullable String str2, zzl zzlVar) {
        return zza((zzadt) new zzadt(str, str2).zza(firebaseApp).zza((zzaff<AuthResult, zzl>) zzlVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, EmailAuthCredential emailAuthCredential, @Nullable String str, zzl zzlVar) {
        return zza((zzadv) new zzadv(emailAuthCredential, str).zza(firebaseApp).zza((zzaff<AuthResult, zzl>) zzlVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, PhoneAuthCredential phoneAuthCredential, @Nullable String str, zzl zzlVar) {
        zzagb.zza();
        return zza((zzady) new zzady(phoneAuthCredential, str).zza(firebaseApp).zza((zzaff<AuthResult, zzl>) zzlVar));
    }

    public final Task<Void> zza(zzam zzamVar, String str, @Nullable String str2, long j, boolean z, boolean z2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z3, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, @Nullable Activity activity) {
        zzadx zzadxVar = new zzadx(zzamVar, str, str2, j, z, z2, str3, str4, str5, z3);
        zzadxVar.zza(onVerificationStateChangedCallbacks, activity, executor, str);
        return zza(zzadxVar);
    }

    public final Task<zzair> zza(zzam zzamVar, @Nullable String str) {
        return zza(new zzaea(zzamVar, str));
    }

    public final Task<Void> zza(zzam zzamVar, PhoneMultiFactorInfo phoneMultiFactorInfo, @Nullable String str, long j, boolean z, boolean z2, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z3, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, @Nullable Activity activity) {
        zzadz zzadzVar = new zzadz(phoneMultiFactorInfo, Preconditions.checkNotEmpty(zzamVar.e), str, j, z, z2, str2, str3, str4, z3);
        zzadzVar.zza(onVerificationStateChangedCallbacks, activity, executor, phoneMultiFactorInfo.d);
        return zza(zzadzVar);
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, @Nullable String str2, zzcf zzcfVar) {
        return zza((zzaec) new zzaec(firebaseUser.zze(), str, str2).zza(firebaseApp).zza(firebaseUser).zza((zzaff<Void, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, zzcf zzcfVar) {
        zzagb.zza();
        return zza((zzaef) new zzaef(phoneAuthCredential).zza(firebaseApp).zza(firebaseUser).zza((zzaff<Void, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, zzcf zzcfVar) {
        return zza((zzaei) new zzaei(userProfileChangeRequest).zza(firebaseApp).zza(firebaseUser).zza((zzaff<Void, zzl>) zzcfVar).zza((zzau) zzcfVar));
    }

    @NonNull
    @VisibleForTesting
    public static zzaf zza(FirebaseApp firebaseApp, zzahk zzahkVar) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(zzahkVar);
        ArrayList arrayList = new ArrayList();
        zzab zzabVar = new zzab();
        Preconditions.checkNotNull(zzahkVar);
        Preconditions.checkNotEmpty("firebase");
        zzabVar.d = Preconditions.checkNotEmpty(zzahkVar.zzi());
        zzabVar.e = "firebase";
        zzabVar.h = zzahkVar.zzh();
        zzabVar.f = zzahkVar.zzg();
        Uri uriZzc = zzahkVar.zzc();
        if (uriZzc != null) {
            zzabVar.g = uriZzc.toString();
        }
        zzabVar.j = zzahkVar.zzm();
        zzabVar.k = null;
        zzabVar.i = zzahkVar.zzj();
        arrayList.add(zzabVar);
        List<zzaib> listZzl = zzahkVar.zzl();
        if (listZzl != null && !listZzl.isEmpty()) {
            for (int i = 0; i < listZzl.size(); i++) {
                zzaib zzaibVar = listZzl.get(i);
                zzab zzabVar2 = new zzab();
                Preconditions.checkNotNull(zzaibVar);
                zzabVar2.d = zzaibVar.zzd();
                zzabVar2.e = Preconditions.checkNotEmpty(zzaibVar.zzf());
                zzabVar2.f = zzaibVar.zzb();
                Uri uriZza = zzaibVar.zza();
                if (uriZza != null) {
                    zzabVar2.g = uriZza.toString();
                }
                zzabVar2.h = zzaibVar.zzc();
                zzabVar2.i = zzaibVar.zze();
                zzabVar2.j = false;
                zzabVar2.k = zzaibVar.zzg();
                arrayList.add(zzabVar2);
            }
        }
        zzaf zzafVar = new zzaf(firebaseApp, arrayList);
        zzafVar.l = new zzah(zzahkVar.zzb(), zzahkVar.zza());
        zzafVar.m = zzahkVar.zzn();
        zzafVar.n = zzahkVar.zze();
        zzafVar.G2(zzbk.b(zzahkVar.zzk()));
        zzafVar.E2(zzahkVar.zzd());
        return zzafVar;
    }

    public final void zza(FirebaseApp firebaseApp, zzaij zzaijVar, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, @Nullable Activity activity, Executor executor) {
        zza((zzaej) new zzaej(zzaijVar).zza(firebaseApp).zza(onVerificationStateChangedCallbacks, activity, executor, zzaijVar.zzd()));
    }
}
