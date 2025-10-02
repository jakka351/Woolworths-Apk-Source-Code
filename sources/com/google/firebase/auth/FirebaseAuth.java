package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.auth.internal.zzbi;
import com.google.firebase.auth.internal.zzbx;
import com.google.firebase.auth.internal.zzca;
import com.google.firebase.auth.internal.zzcb;
import com.google.firebase.auth.internal.zzcf;
import com.google.firebase.auth.internal.zzcg;
import com.google.firebase.firestore.auth.a;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class FirebaseAuth implements InternalAuthProvider {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseApp f15191a;
    public final CopyOnWriteArrayList b;
    public final CopyOnWriteArrayList c;
    public final CopyOnWriteArrayList d;
    public final zzacq e;
    public FirebaseUser f;
    public final Object g;
    public final Object h;
    public String i;
    public zzbx j;
    public final RecaptchaAction k;
    public final RecaptchaAction l;
    public final RecaptchaAction m;
    public final zzcb n;
    public final Provider o;
    public final Provider p;
    public zzca q;
    public final Executor r;
    public final Executor s;
    public final Executor t;

    /* loaded from: classes6.dex */
    public interface AuthStateListener {
        void a();
    }

    /* loaded from: classes6.dex */
    public interface IdTokenListener {
        void a();
    }

    @VisibleForTesting
    /* loaded from: classes6.dex */
    public class zza implements com.google.firebase.auth.internal.zzl {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FirebaseAuth f15192a;

        public zza(FirebaseAuth firebaseAuth) {
            Objects.requireNonNull(firebaseAuth);
            this.f15192a = firebaseAuth;
        }

        @Override // com.google.firebase.auth.internal.zzl
        public final void a(zzahv zzahvVar, FirebaseUser firebaseUser) {
            Preconditions.checkNotNull(zzahvVar);
            Preconditions.checkNotNull(firebaseUser);
            firebaseUser.C2(zzahvVar);
            FirebaseAuth firebaseAuth = this.f15192a;
            firebaseAuth.getClass();
            FirebaseAuth.h(firebaseAuth, firebaseUser, zzahvVar, true, false);
        }
    }

    @VisibleForTesting
    /* loaded from: classes6.dex */
    public class zzb implements com.google.firebase.auth.internal.zzau, com.google.firebase.auth.internal.zzl {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FirebaseAuth f15193a;

        public zzb(FirebaseAuth firebaseAuth) {
            Objects.requireNonNull(firebaseAuth);
            this.f15193a = firebaseAuth;
        }

        @Override // com.google.firebase.auth.internal.zzl
        public final void a(zzahv zzahvVar, FirebaseUser firebaseUser) {
            Preconditions.checkNotNull(zzahvVar);
            Preconditions.checkNotNull(firebaseUser);
            firebaseUser.C2(zzahvVar);
            FirebaseAuth firebaseAuth = this.f15193a;
            firebaseAuth.getClass();
            FirebaseAuth.h(firebaseAuth, firebaseUser, zzahvVar, true, true);
        }

        @Override // com.google.firebase.auth.internal.zzau
        public final void zza(Status status) {
            if (status.getStatusCode() == 17011 || status.getStatusCode() == 17021 || status.getStatusCode() == 17005 || status.getStatusCode() == 17091) {
                FirebaseAuth firebaseAuth = this.f15193a;
                zzcb zzcbVar = firebaseAuth.n;
                Preconditions.checkNotNull(zzcbVar);
                FirebaseUser firebaseUser = firebaseAuth.f;
                if (firebaseUser != null) {
                    zzcbVar.h(firebaseUser);
                    firebaseAuth.f = null;
                }
                zzcbVar.g();
                FirebaseAuth.j(firebaseAuth, null);
                FirebaseAuth.g(firebaseAuth, null);
                zzca zzcaVar = firebaseAuth.q;
                if (zzcaVar != null) {
                    zzcaVar.a();
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public class zzc extends zza implements com.google.firebase.auth.internal.zzau, com.google.firebase.auth.internal.zzl {
        @Override // com.google.firebase.auth.internal.zzau
        public final void zza(Status status) {
        }
    }

    public FirebaseAuth(FirebaseApp firebaseApp, Provider provider, Provider provider2, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, Executor executor3) {
        zzahv zzahvVarA;
        zzacq zzacqVar = new zzacq(firebaseApp, executor, scheduledExecutorService);
        firebaseApp.a();
        zzcb zzcbVar = new zzcb(firebaseApp.f15169a, firebaseApp.f());
        zzcg zzcgVarC = zzcg.c();
        this.b = new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.g = new Object();
        this.h = new Object();
        this.k = RecaptchaAction.custom("getOobCode");
        this.l = RecaptchaAction.custom("signInWithPassword");
        this.m = RecaptchaAction.custom("signUpPassword");
        RecaptchaAction.custom("sendVerificationCode");
        RecaptchaAction.custom("mfaSmsEnrollment");
        RecaptchaAction.custom("mfaSmsSignIn");
        this.f15191a = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
        this.e = (zzacq) Preconditions.checkNotNull(zzacqVar);
        zzcb zzcbVar2 = (zzcb) Preconditions.checkNotNull(zzcbVar);
        this.n = zzcbVar2;
        zzcg zzcgVar = (zzcg) Preconditions.checkNotNull(zzcgVarC);
        this.o = provider;
        this.p = provider2;
        this.r = executor;
        this.s = executor2;
        this.t = executor3;
        com.google.firebase.auth.internal.zzaf zzafVarB = zzcbVar2.b();
        this.f = zzafVarB;
        if (zzafVarB != null && (zzahvVarA = zzcbVar2.a(zzafVarB)) != null) {
            h(this, this.f, zzahvVarA, false, false);
        }
        zzcgVar.b(this);
    }

    public static void g(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + firebaseUser.k0() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.t.execute(new zzy(firebaseAuth));
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) FirebaseApp.d().b(FirebaseAuth.class);
    }

    public static void h(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzahv zzahvVar, boolean z, boolean z2) {
        boolean z3;
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzahvVar);
        FirebaseUser firebaseUser2 = firebaseAuth.f;
        zzcb zzcbVar = firebaseAuth.n;
        boolean z4 = true;
        boolean z5 = firebaseUser2 != null && firebaseUser.k0().equals(firebaseAuth.f.k0());
        if (z5 || !z2) {
            FirebaseUser firebaseUser3 = firebaseAuth.f;
            if (firebaseUser3 == null) {
                z3 = true;
            } else {
                boolean z6 = (z5 && firebaseUser3.F2().zzc().equals(zzahvVar.zzc())) ? false : true;
                z3 = z5 ? false : true;
                z4 = z6;
            }
            Preconditions.checkNotNull(firebaseUser);
            if (firebaseAuth.f == null || !firebaseUser.k0().equals(firebaseAuth.a())) {
                firebaseAuth.f = firebaseUser;
            } else {
                firebaseAuth.f.B2(firebaseUser.v());
                if (!firebaseUser.d2()) {
                    firebaseAuth.f.D2();
                }
                ArrayList arrayListA = firebaseUser.d().a();
                List listH2 = firebaseUser.H2();
                firebaseAuth.f.G2(arrayListA);
                firebaseAuth.f.E2(listH2);
            }
            if (z) {
                zzcbVar.i(firebaseAuth.f);
            }
            if (z4) {
                FirebaseUser firebaseUser4 = firebaseAuth.f;
                if (firebaseUser4 != null) {
                    firebaseUser4.C2(zzahvVar);
                }
                j(firebaseAuth, firebaseAuth.f);
            }
            if (z3) {
                g(firebaseAuth, firebaseAuth.f);
            }
            if (z) {
                zzcbVar.e(zzahvVar, firebaseUser);
            }
            FirebaseUser firebaseUser5 = firebaseAuth.f;
            if (firebaseUser5 != null) {
                if (firebaseAuth.q == null) {
                    firebaseAuth.q = new zzca((FirebaseApp) Preconditions.checkNotNull(firebaseAuth.f15191a));
                }
                firebaseAuth.q.c(firebaseUser5.F2());
            }
        }
    }

    public static void j(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + firebaseUser.k0() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.t.execute(new zzv(firebaseAuth, new InternalTokenResult(firebaseUser != null ? firebaseUser.zzd() : null)));
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public final String a() {
        FirebaseUser firebaseUser = this.f;
        if (firebaseUser == null) {
            return null;
        }
        return firebaseUser.k0();
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public final void b(a aVar) {
        zzca zzcaVar;
        Preconditions.checkNotNull(aVar);
        this.d.add(aVar);
        synchronized (this) {
            if (this.q == null) {
                this.q = new zzca((FirebaseApp) Preconditions.checkNotNull(this.f15191a));
            }
            zzcaVar = this.q;
        }
        zzcaVar.b(this.d.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.firebase.auth.internal.zzcf, com.google.firebase.auth.zzx] */
    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public final Task c(boolean z) {
        FirebaseUser firebaseUser = this.f;
        if (firebaseUser == null) {
            return Tasks.forException(zzaen.zza(new Status(17495)));
        }
        zzahv zzahvVarF2 = firebaseUser.F2();
        if (zzahvVarF2.zzg() && !z) {
            return Tasks.forResult(zzbi.a(zzahvVarF2.zzc()));
        }
        return this.e.zza(this.f15191a, firebaseUser, zzahvVarF2.zzd(), (zzcf) new zzx(this));
    }

    public final Task d(zze zzeVar) {
        Preconditions.checkNotNull(zzeVar);
        AuthCredential authCredentialV = zzeVar.v();
        if (!(authCredentialV instanceof EmailAuthCredential)) {
            boolean z = authCredentialV instanceof PhoneAuthCredential;
            FirebaseApp firebaseApp = this.f15191a;
            zzacq zzacqVar = this.e;
            return z ? zzacqVar.zza(firebaseApp, (PhoneAuthCredential) authCredentialV, this.i, (com.google.firebase.auth.internal.zzl) new zza(this)) : zzacqVar.zza(firebaseApp, authCredentialV, this.i, new zza(this));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialV;
        if (!emailAuthCredential.zzf()) {
            String strZzc = emailAuthCredential.zzc();
            String str = (String) Preconditions.checkNotNull(emailAuthCredential.zzd());
            String str2 = this.i;
            return new zzz(this, strZzc, false, null, str, str2).a(this, str2, this.l);
        }
        ActionCodeUrl actionCodeUrlA = ActionCodeUrl.a(Preconditions.checkNotEmpty(emailAuthCredential.zze()));
        if (actionCodeUrlA == null || TextUtils.equals(this.i, actionCodeUrlA.b())) {
            return new zzac(this, false, null, emailAuthCredential).a(this, this.i, this.k);
        }
        return Tasks.forException(zzaen.zza(new Status(17072)));
    }

    public final Task e(String str) {
        Preconditions.checkNotEmpty(str);
        return this.e.zza(this.f15191a, str, this.i, new zza(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    public final Task f(FirebaseUser firebaseUser, zze zzeVar) {
        Preconditions.checkNotNull(zzeVar);
        Preconditions.checkNotNull(firebaseUser);
        return this.e.zza(this.f15191a, firebaseUser, zzeVar.v(), (String) null, (zzcf) new zzb(this));
    }

    public final synchronized zzbx i() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    public final Task k(FirebaseUser firebaseUser, zze zzeVar) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzeVar);
        AuthCredential authCredentialV = zzeVar.v();
        if (!(authCredentialV instanceof EmailAuthCredential)) {
            if (!(authCredentialV instanceof PhoneAuthCredential)) {
                return this.e.zzc(this.f15191a, firebaseUser, authCredentialV, firebaseUser.A(), new zzb(this));
            }
            String str = this.i;
            ?? zzbVar = new zzb(this);
            return this.e.zzb(this.f15191a, firebaseUser, (PhoneAuthCredential) authCredentialV, str, (zzcf) zzbVar);
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialV;
        if ("password".equals(emailAuthCredential.v())) {
            String strZzc = emailAuthCredential.zzc();
            String strCheckNotEmpty = Preconditions.checkNotEmpty(emailAuthCredential.zzd());
            String strA = firebaseUser.A();
            return new zzz(this, strZzc, true, firebaseUser, strCheckNotEmpty, strA).a(this, strA, this.l);
        }
        ActionCodeUrl actionCodeUrlA = ActionCodeUrl.a(Preconditions.checkNotEmpty(emailAuthCredential.zze()));
        if (actionCodeUrlA != null && !TextUtils.equals(this.i, actionCodeUrlA.b())) {
            return Tasks.forException(zzaen.zza(new Status(17072)));
        }
        return new zzac(this, true, firebaseUser, emailAuthCredential).a(this, this.i, this.k);
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance(@NonNull FirebaseApp firebaseApp) {
        return (FirebaseAuth) firebaseApp.b(FirebaseAuth.class);
    }
}
