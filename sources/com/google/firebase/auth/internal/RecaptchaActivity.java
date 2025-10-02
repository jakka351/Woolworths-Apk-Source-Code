package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.input.pointer.a;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaer;
import com.google.android.gms.internal.p002firebaseauthapi.zzaes;
import com.google.android.gms.internal.p002firebaseauthapi.zzafd;
import com.google.android.gms.internal.p002firebaseauthapi.zzagi;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.inject.Provider;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes6.dex */
public class RecaptchaActivity extends FragmentActivity implements zzaes {
    public static long u;
    public static final zzcg v = zzcg.b;
    public boolean t = false;

    public final Uri.Builder N4(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String string = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        FirebaseApp firebaseAppE = FirebaseApp.e(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(firebaseAppE);
        zzo zzoVar = zzo.f15213a;
        Context applicationContext = getApplicationContext();
        synchronized (zzoVar) {
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotEmpty(string);
            SharedPreferences sharedPreferencesA = zzo.a(applicationContext, str);
            zzo.b(sharedPreferencesA);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".FIREBASE_APP_NAME", stringExtra3);
            editorEdit.apply();
        }
        String strB = zzq.a(getApplicationContext(), firebaseAppE.f()).b();
        String strZza = null;
        if (TextUtils.isEmpty(strB)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            O4(zzao.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (firebaseAuth.g) {
        }
        if (TextUtils.isEmpty(null)) {
            strZza = zzafd.zza();
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", strZza).appendQueryParameter("eventId", string).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strB);
        return builder;
    }

    public final void O4(Status status) {
        u = 0L;
        this.t = false;
        Intent intent = new Intent();
        HashMap map = zzce.f15209a;
        SafeParcelableSerializer.serializeToIntentExtra(status, intent, "com.google.firebase.auth.internal.STATUS");
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        LocalBroadcastManager.a(this).c(intent);
        v.a(this);
        finish();
    }

    public final void P4() {
        u = 0L;
        this.t = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        LocalBroadcastManager.a(this).c(intent);
        v.a(this);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("RecaptchaActivity", "Could not do operation - unknown action: " + action);
            P4();
            return;
        }
        long jCurrentTimeMillis = DefaultClock.getInstance().currentTimeMillis();
        if (jCurrentTimeMillis - u < 30000) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        u = jCurrentTimeMillis;
        if (bundle != null) {
            this.t = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        RecaptchaActivity recaptchaActivity;
        String str;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.t) {
                P4();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = Hex.bytesToStringUppercase(AndroidUtilsLight.getPackageCertificateHashBytes(this, packageName)).toLowerCase(Locale.US);
                FirebaseApp firebaseAppE = FirebaseApp.e(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(firebaseAppE);
                if (zzagl.zza(firebaseAppE)) {
                    recaptchaActivity = this;
                    firebaseAppE.a();
                    zza(N4(Uri.parse(zzagl.zza(firebaseAppE.c.f15172a)).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.o);
                } else {
                    recaptchaActivity = this;
                    new zzaeq(packageName, lowerCase, intent, firebaseAppE, recaptchaActivity).executeOnExecutor(firebaseAuth.r, new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e) {
                recaptchaActivity = this;
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e));
                zzaer.zzb(this, packageName);
            }
            recaptchaActivity.t = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            O4(zzce.a(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            P4();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        zzo zzoVar = zzo.f15213a;
        Context applicationContext = getApplicationContext();
        String packageName2 = getPackageName();
        String stringExtra2 = intent2.getStringExtra("eventId");
        synchronized (zzoVar) {
            Preconditions.checkNotEmpty(packageName2);
            Preconditions.checkNotEmpty(stringExtra2);
            SharedPreferences sharedPreferencesA = zzo.a(applicationContext, packageName2);
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            str = null;
            String string = sharedPreferencesA.getString(str2, null);
            String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            String string2 = sharedPreferencesA.getString(str3, null);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.remove(str2);
            editorEdit.remove(str3);
            editorEdit.apply();
            if (!TextUtils.isEmpty(string)) {
                str = string2;
            }
        }
        if (TextUtils.isEmpty(str)) {
            Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
            O4(zzao.a("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = zzq.a(getApplicationContext(), FirebaseApp.e(str).f()).c(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        u = 0L;
        this.t = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (LocalBroadcastManager.a(this).c(intent3)) {
            v.a(this);
        } else {
            SharedPreferences.Editor editorEdit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            editorEdit2.putString("recaptchaToken", queryParameter);
            editorEdit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            editorEdit2.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
            editorEdit2.commit();
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.t);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return N4(new Uri.Builder().scheme("https").appendPath(lqlqqlq.m006D006D006Dm006Dm).appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String strZza = zzagi.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza)) {
            return zzagl.zzb(str);
        }
        a.v("Found hermetic configuration for identityToolkit URL: ", strZza, "RecaptchaActivity");
        return strZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) com.google.android.gms.internal.p002firebaseauthapi.zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzaes.zza.e("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final void zza(String str, Status status) {
        if (status == null) {
            P4();
        } else {
            O4(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final void zza(Uri uri, String str, Provider provider) {
        Task taskForResult;
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = (InteropAppCheckTokenProvider) provider.get();
        if (interopAppCheckTokenProvider != null) {
            Task taskA = interopAppCheckTokenProvider.a();
            zzbp zzbpVar = new zzbp();
            zzbpVar.d = uri;
            taskForResult = taskA.continueWith(zzbpVar);
        } else {
            taskForResult = Tasks.forResult(uri);
        }
        zzbn zzbnVar = new zzbn();
        zzbnVar.d = this;
        zzbnVar.e = str;
        taskForResult.addOnCompleteListener(zzbnVar);
    }
}
