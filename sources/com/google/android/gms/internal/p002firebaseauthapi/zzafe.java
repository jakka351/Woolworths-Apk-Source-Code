package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;

/* loaded from: classes5.dex */
public final class zzafe {
    private Context zza;
    private zzafx zzb;
    private String zzc;
    private final FirebaseApp zzd;
    private boolean zze;
    private String zzf;

    public zzafe(Context context, FirebaseApp firebaseApp, String str) {
        this.zze = false;
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzd = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
        this.zzc = a.A("Android/Fallback/", str);
    }

    @Nullable
    private static String zza(FirebaseApp firebaseApp) {
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = (InteropAppCheckTokenProvider) FirebaseAuth.getInstance(firebaseApp).o.get();
        if (interopAppCheckTokenProvider == null) {
            return null;
        }
        try {
            AppCheckTokenResult appCheckTokenResult = (AppCheckTokenResult) Tasks.await(interopAppCheckTokenProvider.a());
            if (appCheckTokenResult.a() != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(appCheckTokenResult.a())));
            }
            return appCheckTokenResult.b();
        } catch (InterruptedException e) {
            e = e;
            androidx.compose.ui.input.pointer.a.v("Unexpected error getting App Check token: ", e.getMessage(), "LocalRequestInterceptor");
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            androidx.compose.ui.input.pointer.a.v("Unexpected error getting App Check token: ", e.getMessage(), "LocalRequestInterceptor");
            return null;
        }
    }

    @Nullable
    private static String zzb(FirebaseApp firebaseApp) {
        HeartBeatController heartBeatController = (HeartBeatController) FirebaseAuth.getInstance(firebaseApp).p.get();
        if (heartBeatController != null) {
            try {
                return (String) Tasks.await(heartBeatController.a());
            } catch (InterruptedException | ExecutionException e) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e.getMessage());
            }
        }
        return null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzafe(FirebaseApp firebaseApp, String str) {
        this(firebaseApp.f15169a, firebaseApp, str);
        firebaseApp.a();
    }

    public final void zza(URLConnection uRLConnection) {
        String strG;
        if (this.zze) {
            strG = a.g(this.zzc, "/FirebaseUI-Android");
        } else {
            strG = a.g(this.zzc, "/FirebaseCore-Android");
        }
        if (this.zzb == null) {
            this.zzb = new zzafx(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzafd.zza());
        uRLConnection.setRequestProperty("X-Client-Version", strG);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        FirebaseApp firebaseApp = this.zzd;
        firebaseApp.a();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", firebaseApp.c.b);
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String strZza = zza(this.zzd);
        if (!TextUtils.isEmpty(strZza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", strZza);
        }
        this.zzf = null;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
