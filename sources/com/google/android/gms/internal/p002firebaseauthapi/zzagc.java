package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.b;
import androidx.core.content.ContextCompat;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.auth.PhoneAuthCredential;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
final class zzagc {
    private static final Logger zza = new Logger("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap<String, zzagj> zzd = new HashMap<>();

    public zzagc(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(String str) {
        zzagj zzagjVar = this.zzd.get(str);
        if (zzagjVar == null) {
            return;
        }
        if (!zzagjVar.zzi) {
            zzd(str);
        }
        zzb(str);
    }

    public final String zzb() throws NoSuchAlgorithmException {
        try {
            String packageName = this.zzb.getPackageName();
            String strZza = zza(packageName, Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 134217728).signingInfo.getApkContentsSigners()[0].toCharsString());
            if (strZza != null) {
                return strZza;
            }
            zza.e("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.e("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(String str) {
        zzagj zzagjVar = this.zzd.get(str);
        if (zzagjVar == null || zzagjVar.zzh || zzac.zzc(zzagjVar.zzd)) {
            return;
        }
        zza.w("Timed out waiting for SMS.", new Object[0]);
        Iterator<zzael> it = zzagjVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(zzagjVar.zzd);
        }
        zzagjVar.zzi = true;
    }

    public final boolean zzc(String str) {
        return this.zzd.get(str) != null;
    }

    public final zzael zza(zzael zzaelVar, String str) {
        return new zzagh(this, zzaelVar, str);
    }

    @VisibleForTesting
    public static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String zza(String str, String str2) throws NoSuchAlgorithmException {
        String strO = b.o(str, " ", str2);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(strO.getBytes(StandardCharsets.UTF_8));
            String strSubstring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.d("Package: " + str + " -- Hash: " + strSubstring, new Object[0]);
            return strSubstring;
        } catch (NoSuchAlgorithmException e) {
            zza.e(a.A("NoSuchAlgorithm: ", e.getMessage()), new Object[0]);
            return null;
        }
    }

    public static void zzb(zzagc zzagcVar, String str) {
        zzagj zzagjVar = zzagcVar.zzd.get(str);
        if (zzagjVar == null || zzac.zzc(zzagjVar.zzd) || zzac.zzc(zzagjVar.zze) || zzagjVar.zzb.isEmpty()) {
            return;
        }
        Iterator<zzael> it = zzagjVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(new PhoneAuthCredential(zzagjVar.zzd, zzagjVar.zze, null, null, true));
        }
        zzagjVar.zzh = true;
    }

    public final void zzb(zzael zzaelVar, String str) {
        zzagj zzagjVar = this.zzd.get(str);
        if (zzagjVar == null) {
            return;
        }
        zzagjVar.zzb.add(zzaelVar);
        if (zzagjVar.zzg) {
            zzaelVar.zzb(zzagjVar.zzd);
        }
        if (zzagjVar.zzh) {
            zzaelVar.zza(new PhoneAuthCredential(zzagjVar.zzd, zzagjVar.zze, null, null, true));
        }
        if (zzagjVar.zzi) {
            zzaelVar.zza(zzagjVar.zzd);
        }
    }

    public final void zzb(String str) {
        zzagj zzagjVar = this.zzd.get(str);
        if (zzagjVar == null) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = zzagjVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzagjVar.zzf.cancel(false);
        }
        zzagjVar.zzb.clear();
        this.zzd.remove(str);
    }

    public final void zza(final String str, zzael zzaelVar, long j, boolean z) {
        this.zzd.put(str, new zzagj(j, z));
        zzb(zzaelVar, str);
        zzagj zzagjVar = this.zzd.get(str);
        if (zzagjVar.zza <= 0) {
            zza.w("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzagjVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzagf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze(str);
            }
        }, zzagjVar.zza, TimeUnit.SECONDS);
        if (!zzagjVar.zzc) {
            zza.w("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzagg zzaggVar = new zzagg(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
        ContextCompat.f(this.zzb.getApplicationContext(), zzaggVar, intentFilter, 2);
        SmsRetriever.getClient(this.zzb).startSmsRetriever().addOnFailureListener(new zzage(this));
    }
}
