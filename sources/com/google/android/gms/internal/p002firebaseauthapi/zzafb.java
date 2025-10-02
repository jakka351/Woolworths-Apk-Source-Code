package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class zzafb extends zzaft implements zzagn {

    @VisibleForTesting
    private zzaev zza;

    @VisibleForTesting
    private zzaey zzb;

    @VisibleForTesting
    private zzafy zzc;
    private final zzafc zzd;
    private final FirebaseApp zze;
    private String zzf;

    @VisibleForTesting
    private zzafe zzg;

    public zzafb(FirebaseApp firebaseApp, zzafc zzafcVar) {
        this(firebaseApp, zzafcVar, null, null, null, null);
    }

    @VisibleForTesting
    private final zzafe zzb() {
        if (this.zzg == null) {
            this.zzg = new zzafe(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzags zzagsVar, zzafv<zzagv> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzagsVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/createAuthUri", this.zzf), zzagsVar, zzafvVar, zzagv.class, zzaevVar.zza);
    }

    @VisibleForTesting
    private zzafb(FirebaseApp firebaseApp, zzafc zzafcVar, zzafy zzafyVar, zzaev zzaevVar, zzaey zzaeyVar, zzaew zzaewVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.zze = firebaseApp;
        firebaseApp.a();
        FirebaseOptions firebaseOptions = firebaseApp.c;
        this.zzf = firebaseOptions.f15172a;
        firebaseApp.a();
        firebaseOptions.getClass();
        this.zzd = (zzafc) Preconditions.checkNotNull(zzafcVar);
        zza(null, null, null, null);
        zzagl.zza(this.zzf, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzagu zzaguVar, zzafv<Void> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzaguVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/deleteAccount", this.zzf), zzaguVar, zzafvVar, Void.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzagx zzagxVar, zzafv<zzagw> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzagxVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/emailLinkSignin", this.zzf), zzagxVar, zzafvVar, zzagw.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzagz zzagzVar, zzafv<zzagy> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzagzVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzagzVar, zzafvVar, zzagy.class, zzaeyVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzahb zzahbVar, zzafv<zzaha> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzahbVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzahbVar, zzafvVar, zzaha.class, zzaeyVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzahj zzahjVar, zzafv<zzahv> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzahjVar);
        Preconditions.checkNotNull(zzafvVar);
        zzafy zzafyVar = this.zzc;
        zzafu.zza(zzafyVar.zza("/token", this.zzf), zzahjVar, zzafvVar, zzahv.class, zzafyVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzahi zzahiVar, zzafv<zzahl> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzahiVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/getAccountInfo", this.zzf), zzahiVar, zzafvVar, zzahl.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzahm zzahmVar, zzafv<zzahp> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzahmVar);
        Preconditions.checkNotNull(zzafvVar);
        if (zzahmVar.zzb() != null) {
            zzb().zzb(zzahmVar.zzb().k);
        }
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/getOobConfirmationCode", this.zzf), zzahmVar, zzafvVar, zzahp.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaho zzahoVar, zzafv<zzahr> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzahoVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/getRecaptchaParam", this.zzf), zzafvVar, zzahr.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaht zzahtVar, zzafv<zzahs> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzahtVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaey zzaeyVar = this.zzb;
        String strJ = a.j(zzaeyVar.zza("/recaptchaConfig", this.zzf), "&clientType=", zzahtVar.zzb(), "&version=", zzahtVar.zzc());
        if (!zzac.zzc(zzahtVar.zzd())) {
            strJ = b.o(strJ, "&tenantId=", zzahtVar.zzd());
        }
        zzafu.zza(strJ, zzafvVar, zzahs.class, zzaeyVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagn
    public final void zza() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        zza(null, null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaic zzaicVar, zzafv<zzaif> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzaicVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/resetPassword", this.zzf), zzaicVar, zzafvVar, zzaif.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaie zzaieVar, zzafv<zzaig> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzaieVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts:revokeToken", this.zzf), zzaieVar, zzafvVar, zzaig.class, zzaeyVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaij zzaijVar, zzafv<zzaii> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzaijVar);
        Preconditions.checkNotNull(zzafvVar);
        if (!TextUtils.isEmpty(zzaijVar.zzc())) {
            zzb().zzb(zzaijVar.zzc());
        }
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/sendVerificationCode", this.zzf), zzaijVar, zzafvVar, zzaii.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzail zzailVar, zzafv<zzaik> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzailVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/setAccountInfo", this.zzf), zzailVar, zzafvVar, zzaik.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(@Nullable String str, zzafv<Void> zzafvVar) {
        Preconditions.checkNotNull(zzafvVar);
        zzb().zza(str);
        zzafvVar.zza((zzafv<Void>) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaim zzaimVar, zzafv<zzaip> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzaimVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/signupNewUser", this.zzf), zzaimVar, zzafvVar, zzaip.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaio zzaioVar, zzafv<zzair> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzaioVar);
        Preconditions.checkNotNull(zzafvVar);
        if (zzaioVar instanceof zzais) {
            zzais zzaisVar = (zzais) zzaioVar;
            if (!TextUtils.isEmpty(zzaisVar.zzb())) {
                zzb().zzb(zzaisVar.zzb());
            }
        }
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzaioVar, zzafvVar, zzair.class, zzaeyVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaiq zzaiqVar, zzafv<zzait> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzaiqVar);
        Preconditions.checkNotNull(zzafvVar);
        if (!TextUtils.isEmpty(zzaiqVar.zzb())) {
            zzb().zzb(zzaiqVar.zzb());
        }
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts/mfaSignIn:start", this.zzf), zzaiqVar, zzafvVar, zzait.class, zzaeyVar.zza);
    }

    private final void zza(zzafy zzafyVar, zzaev zzaevVar, zzaey zzaeyVar, zzaew zzaewVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String strZza = zzagi.zza("firebear.secureToken");
        if (TextUtils.isEmpty(strZza)) {
            strZza = zzagl.zzd(this.zzf);
        } else {
            androidx.compose.ui.input.pointer.a.v("Found hermetic configuration for secureToken URL: ", strZza, "LocalClient");
        }
        if (this.zzc == null) {
            this.zzc = new zzafy(strZza, zzb());
        }
        String strZza2 = zzagi.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza2)) {
            strZza2 = zzagl.zzb(this.zzf);
        } else {
            androidx.compose.ui.input.pointer.a.v("Found hermetic configuration for identityToolkit URL: ", strZza2, "LocalClient");
        }
        if (this.zza == null) {
            this.zza = new zzaev(strZza2, zzb());
        }
        String strZza3 = zzagi.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(strZza3)) {
            strZza3 = zzagl.zzc(this.zzf);
        } else {
            androidx.compose.ui.input.pointer.a.v("Found hermetic configuration for identityToolkitV2 URL: ", strZza3, "LocalClient");
        }
        if (this.zzb == null) {
            this.zzb = new zzaey(strZza3, zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzajb zzajbVar, zzafv<zzajd> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzajbVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/verifyAssertion", this.zzf), zzajbVar, zzafvVar, zzajd.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzajc zzajcVar, zzafv<zzajf> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzajcVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/verifyCustomToken", this.zzf), zzajcVar, zzafvVar, zzajf.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaje zzajeVar, zzafv<zzajh> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzajeVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/verifyPassword", this.zzf), zzajeVar, zzafvVar, zzajh.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzajg zzajgVar, zzafv<zzajj> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzajgVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/verifyPhoneNumber", this.zzf), zzajgVar, zzafvVar, zzajj.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaji zzajiVar, zzafv<zzajl> zzafvVar) throws IOException {
        Preconditions.checkNotNull(zzajiVar);
        Preconditions.checkNotNull(zzafvVar);
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzajiVar, zzafvVar, zzajl.class, zzaeyVar.zza);
    }
}
