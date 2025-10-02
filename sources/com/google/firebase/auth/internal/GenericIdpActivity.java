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
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaer;
import com.google.android.gms.internal.p002firebaseauthapi.zzaes;
import com.google.android.gms.internal.p002firebaseauthapi.zzagi;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

@KeepName
/* loaded from: classes6.dex */
public class GenericIdpActivity extends FragmentActivity implements zzaes {
    public static long u;
    public static final zzcg v = zzcg.b;
    public boolean t = false;

    public final Uri.Builder N4(Uri.Builder builder, Intent intent, String str, String str2) throws JSONException {
        String string;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String strJoin = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            string = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str3 : bundleExtra.keySet()) {
                    String string2 = bundleExtra.getString(str3);
                    if (!TextUtils.isEmpty(string2)) {
                        jSONObject.put(str3, string2);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            string = jSONObject.toString();
        }
        String string3 = UUID.randomUUID().toString();
        String strZza = zzaer.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        zzo zzoVar = zzo.f15213a;
        Context applicationContext = getApplicationContext();
        String str4 = string;
        String str5 = strJoin;
        synchronized (zzoVar) {
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotEmpty(string3);
            Preconditions.checkNotEmpty(strZza);
            Preconditions.checkNotEmpty(stringExtra4);
            SharedPreferences sharedPreferencesA = zzo.a(applicationContext, str);
            zzo.b(sharedPreferencesA);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".SESSION_ID", strZza);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".OPERATION", action);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".PROVIDER_ID", stringExtra2);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".FIREBASE_APP_NAME", stringExtra4);
            editorEdit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
            editorEdit.apply();
        }
        String strB = zzq.a(getApplicationContext(), FirebaseApp.e(stringExtra4).f()).b();
        if (TextUtils.isEmpty(strB)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            O4(zzao.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (strZza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", strZza).appendQueryParameter("eventId", string3).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strB);
        if (!TextUtils.isEmpty(str5)) {
            builder.appendQueryParameter("scopes", str5);
        }
        if (!TextUtils.isEmpty(str4)) {
            builder.appendQueryParameter("customParameters", str4);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    public final void O4(Status status) {
        u = 0L;
        this.t = false;
        Intent intent = new Intent();
        HashMap map = zzce.f15209a;
        SafeParcelableSerializer.serializeToIntentExtra(status, intent, "com.google.firebase.auth.internal.STATUS");
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (LocalBroadcastManager.a(this).c(intent)) {
            v.a(this);
        } else {
            zzbl.a(getApplicationContext(), status);
        }
        finish();
    }

    public final void P4() {
        u = 0L;
        this.t = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (LocalBroadcastManager.a(this).c(intent)) {
            v.a(this);
        } else {
            zzbl.a(this, zzao.a("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            P4();
            return;
        }
        long jCurrentTimeMillis = DefaultClock.getInstance().currentTimeMillis();
        if (jCurrentTimeMillis - u < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        u = jCurrentTimeMillis;
        if (bundle != null) {
            this.t = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        zzr zzrVar;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.t) {
                P4();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = Hex.bytesToStringUppercase(AndroidUtilsLight.getPackageCertificateHashBytes(this, packageName)).toLowerCase(Locale.US);
                FirebaseApp firebaseAppE = FirebaseApp.e(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(firebaseAppE);
                if (zzagl.zza(firebaseAppE)) {
                    firebaseAppE.a();
                    zza(N4(Uri.parse(zzagl.zza(firebaseAppE.c.f15172a)).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.o);
                } else {
                    new zzaeq(packageName, lowerCase, getIntent(), firebaseAppE, this).executeOnExecutor(firebaseAuth.r, new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e));
                zzaer.zzb(this, packageName);
            }
            this.t = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            O4(zzce.a(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            P4();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        synchronized (zzo.f15213a) {
            Preconditions.checkNotEmpty(packageName2);
            Preconditions.checkNotEmpty(stringExtra2);
            SharedPreferences sharedPreferencesA = zzo.a(this, packageName2);
            String str = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".SESSION_ID";
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".PROVIDER_ID";
            String str4 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            zzrVar = null;
            String string = sharedPreferencesA.getString(str, null);
            String string2 = sharedPreferencesA.getString(str2, null);
            String string3 = sharedPreferencesA.getString(str3, null);
            String string4 = sharedPreferencesA.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
            String string5 = sharedPreferencesA.getString(str4, null);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.remove(str);
            editorEdit.remove(str2);
            editorEdit.remove(str3);
            editorEdit.remove(str4);
            editorEdit.apply();
            if (string != null && string2 != null && string3 != null) {
                zzrVar = new zzr(string, string2, string3, string4, string5);
            }
        }
        if (zzrVar == null) {
            P4();
        }
        if (booleanExtra) {
            stringExtra = zzq.a(getApplicationContext(), FirebaseApp.e(zzrVar.e).f()).c(stringExtra);
        }
        zzajb zzajbVar = new zzajb(zzrVar, stringExtra);
        String str5 = zzrVar.d;
        String str6 = zzrVar.b;
        zzajbVar.zzb(str5);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str6) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str6) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str6)) {
            Log.e("GenericIdpActivity", "unsupported operation: ".concat(str6));
            P4();
            return;
        }
        u = 0L;
        this.t = false;
        Intent intent2 = new Intent();
        SafeParcelableSerializer.serializeToIntentExtra(zzajbVar, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str6);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (LocalBroadcastManager.a(this).c(intent2)) {
            v.a(this);
        } else {
            SharedPreferences.Editor editorEdit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            editorEdit2.putString("verifyAssertionRequest", SafeParcelableSerializer.serializeToString(zzajbVar));
            editorEdit2.putString("operation", str6);
            editorEdit2.putString("tenantId", str5);
            editorEdit2.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
            editorEdit2.commit();
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.t);
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
        a.v("Found hermetic configuration for identityToolkit URL: ", strZza, "GenericIdpActivity");
        return strZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) com.google.android.gms.internal.p002firebaseauthapi.zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
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
            zzbf zzbfVar = new zzbf();
            zzbfVar.d = uri;
            taskForResult = taskA.continueWith(zzbfVar);
        } else {
            taskForResult = Tasks.forResult(uri);
        }
        zzbg zzbgVar = new zzbg();
        zzbgVar.d = this;
        zzbgVar.e = str;
        taskForResult.addOnCompleteListener(zzbgVar);
    }
}
