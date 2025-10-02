package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzau;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
abstract class zzaff<ResultT, CallbackT> implements zzafq<ResultT> {
    protected final int zza;
    protected FirebaseApp zzc;
    protected FirebaseUser zzd;
    protected CallbackT zze;
    protected zzau zzf;
    protected zzafg<ResultT> zzg;
    protected Executor zzi;
    protected zzahv zzj;
    protected zzahk zzk;
    protected zzagv zzl;
    protected zzaif zzm;
    protected AuthCredential zzn;
    protected String zzo;
    protected String zzp;
    protected zzaas zzq;
    protected zzahs zzr;
    protected zzahr zzs;
    protected zzair zzt;

    @VisibleForTesting
    boolean zzu;
    protected final zzafh zzb = new zzafh(this);
    protected final List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> zzh = new ArrayList();

    public static class zza extends LifecycleCallback {
        private final List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> zza;

        private zza(LifecycleFragment lifecycleFragment, List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list) {
            super(lifecycleFragment);
            this.mLifecycleFragment.addCallback("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list) {
            LifecycleFragment fragment2 = LifecycleCallback.getFragment(activity);
            if (((zza) fragment2.getCallbackOrNull("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(fragment2, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        @MainThread
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaff(int i) {
        this.zza = i;
    }

    public final zzaff<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = (CallbackT) Preconditions.checkNotNull(callbackt, "external callback cannot be null");
        return this;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzaff<ResultT, CallbackT> zza(zzau zzauVar) {
        this.zzf = (zzau) Preconditions.checkNotNull(zzauVar, "external failure callback cannot be null");
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(FirebaseApp firebaseApp) {
        this.zzc = (FirebaseApp) Preconditions.checkNotNull(firebaseApp, "firebaseApp cannot be null");
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(FirebaseUser firebaseUser) {
        this.zzd = (FirebaseUser) Preconditions.checkNotNull(firebaseUser, "firebaseUser cannot be null");
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, @Nullable Activity activity, Executor executor, String str) {
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacksZza = zzagb.zza(str, onVerificationStateChangedCallbacks, this);
        synchronized (this.zzh) {
            this.zzh.add((PhoneAuthProvider.OnVerificationStateChangedCallbacks) Preconditions.checkNotNull(onVerificationStateChangedCallbacksZza));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) Preconditions.checkNotNull(executor);
        return this;
    }

    public static /* synthetic */ void zza(zzaff zzaffVar) {
        zzaffVar.zzb();
        Preconditions.checkState(zzaffVar.zzu, "no success or failure set on method implementation");
    }

    public static /* synthetic */ void zza(zzaff zzaffVar, Status status) {
        zzau zzauVar = zzaffVar.zzf;
        if (zzauVar != null) {
            zzauVar.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}
