package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.signatureverification.SignatureVerificationConfigurationProvider;
import com.google.android.gms.dynamite.DynamiteModule;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public class PackageSignatureVerifier {

    @Nullable
    @VisibleForTesting
    static volatile zzac zza;

    @Nullable
    private static zzad zzb;

    private static synchronized zzad zza(Context context) {
        try {
            if (zzb == null) {
                zzb = new zzad(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzb;
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerified(@NonNull Context context, @NonNull String str) {
        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza(context);
        int i = zzo.zzh;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                zzo.zzb();
                if (zzo.zzg.zzi()) {
                    SignatureVerificationConfigurationProvider.zza().zza();
                    String strConcat = String.valueOf(str).concat(true != zHonorsDebugCertificates ? "-0" : "-1");
                    if (zza != null && zza.zza().equals(strConcat)) {
                        return zza.zzb();
                    }
                    str.getClass();
                    zza(context);
                    zzv zzvVar = new zzv(null);
                    zzvVar.zza(str);
                    zzvVar.zzb(zHonorsDebugCertificates);
                    zzvVar.zzc(false);
                    zzy zzyVarZzc = zzo.zzc(zzvVar.zzd());
                    if (zzyVarZzc.zza) {
                        PackageVerificationResult packageVerificationResultZzd = PackageVerificationResult.zzd(str, zzyVarZzc.zzd, null);
                        zza = new zzac(strConcat, packageVerificationResultZzd);
                        return packageVerificationResultZzd;
                    }
                    String str2 = zzyVarZzc.zzb;
                    Preconditions.checkNotNull(str2);
                    return PackageVerificationResult.zza(str, str2, zzyVarZzc.zzc, null);
                }
            } catch (RemoteException | DynamiteModule.LoadingException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
            throw new zzae();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(@NonNull Context context, @NonNull String str) {
        try {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            packageVerificationResultQueryPackageSignatureVerified.zzc();
            return packageVerificationResultQueryPackageSignatureVerified;
        } catch (SecurityException e) {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (packageVerificationResultQueryPackageSignatureVerified2.zzb()) {
                Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e);
            }
            return packageVerificationResultQueryPackageSignatureVerified2;
        }
    }
}
