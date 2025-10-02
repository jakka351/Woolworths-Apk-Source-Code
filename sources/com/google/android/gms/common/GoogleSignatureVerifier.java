package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Set;
import javax.annotation.Nullable;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public class GoogleSignatureVerifier {

    @Nullable
    private static GoogleSignatureVerifier zza;

    @Nullable
    private static volatile Set zzd;

    @Nullable
    private static volatile Set zze;
    private final Context zzb;
    private volatile String zzc;

    public GoogleSignatureVerifier(@NonNull Context context) {
        this.zzb = context.getApplicationContext();
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (zza == null) {
                    zzo.zza(context);
                    zza = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zza(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r11 == 0) goto L28
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.android.vending"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1b
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            android.content.pm.ApplicationInfo r11 = r10.applicationInfo
            if (r11 != 0) goto L21
        L1f:
            r11 = r0
            goto L28
        L21:
            int r11 = r11.flags
            r11 = r11 & 129(0x81, float:1.81E-43)
            if (r11 == 0) goto L1f
            r11 = r1
        L28:
            if (r11 == 0) goto L2d
            com.google.android.gms.internal.common.zzah r2 = com.google.android.gms.common.zzn.zzc     // Catch: java.lang.IllegalArgumentException -> La2
            goto L2f
        L2d:
            com.google.android.gms.internal.common.zzah r2 = com.google.android.gms.common.zzn.zzb     // Catch: java.lang.IllegalArgumentException -> La2
        L2f:
            com.google.android.gms.internal.common.zzr.zza(r1)     // Catch: java.lang.IllegalArgumentException -> La2
            android.content.pm.SigningInfo r3 = r10.signingInfo     // Catch: java.lang.IllegalArgumentException -> La2
            if (r3 == 0) goto L63
            boolean r4 = r3.hasMultipleSigners()     // Catch: java.lang.IllegalArgumentException -> La2
            if (r4 != 0) goto L63
            android.content.pm.Signature[] r4 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> La2
            if (r4 != 0) goto L43
            goto L63
        L43:
            int r4 = com.google.android.gms.internal.common.zzah.zzd     // Catch: java.lang.IllegalArgumentException -> La2
            com.google.android.gms.internal.common.zzad r4 = new com.google.android.gms.internal.common.zzad     // Catch: java.lang.IllegalArgumentException -> La2
            r4.<init>()     // Catch: java.lang.IllegalArgumentException -> La2
            android.content.pm.Signature[] r3 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> La2
            int r5 = r3.length     // Catch: java.lang.IllegalArgumentException -> La2
            r6 = r0
        L50:
            if (r6 >= r5) goto L5e
            r7 = r3[r6]     // Catch: java.lang.IllegalArgumentException -> La2
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.IllegalArgumentException -> La2
            r4.zzb(r7)     // Catch: java.lang.IllegalArgumentException -> La2
            int r6 = r6 + 1
            goto L50
        L5e:
            com.google.android.gms.internal.common.zzah r3 = r4.zzd()     // Catch: java.lang.IllegalArgumentException -> La2
            goto L67
        L63:
            com.google.android.gms.internal.common.zzah r3 = com.google.android.gms.internal.common.zzah.zzj()     // Catch: java.lang.IllegalArgumentException -> La2
        L67:
            boolean r4 = r3.isEmpty()     // Catch: java.lang.IllegalArgumentException -> La2
            if (r4 != 0) goto L9a
            com.google.android.gms.internal.common.zzah r3 = r3.zzh()     // Catch: java.lang.IllegalArgumentException -> La2
            int r4 = r3.size()     // Catch: java.lang.IllegalArgumentException -> La2
            r5 = r0
        L76:
            if (r5 >= r4) goto L99
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.IllegalArgumentException -> La2
            byte[] r6 = (byte[]) r6     // Catch: java.lang.IllegalArgumentException -> La2
            com.google.android.gms.internal.common.zzal r7 = r2.listIterator(r0)     // Catch: java.lang.IllegalArgumentException -> La2
        L82:
            boolean r8 = r7.hasNext()     // Catch: java.lang.IllegalArgumentException -> La2
            int r9 = r5 + 1
            if (r8 == 0) goto L97
            java.lang.Object r8 = r7.next()     // Catch: java.lang.IllegalArgumentException -> La2
            byte[] r8 = (byte[]) r8     // Catch: java.lang.IllegalArgumentException -> La2
            boolean r8 = java.util.Arrays.equals(r6, r8)     // Catch: java.lang.IllegalArgumentException -> La2
            if (r8 == 0) goto L82
            return r1
        L97:
            r5 = r9
            goto L76
        L99:
            return r0
        L9a:
            java.lang.String r2 = "Unable to obtain package certificate history."
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> La2
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> La2
            throw r3     // Catch: java.lang.IllegalArgumentException -> La2
        La2:
            java.lang.String r2 = "GoogleSignatureVerifier"
            java.lang.String r3 = "package info is not set correctly"
            android.util.Log.i(r2, r3)
            if (r11 == 0) goto Lb2
            com.google.android.gms.common.zzj[] r11 = com.google.android.gms.common.zzn.zza
            com.google.android.gms.common.zzj r10 = zzc(r10, r11)
            goto Lbe
        Lb2:
            com.google.android.gms.common.zzj[] r11 = com.google.android.gms.common.zzn.zza
            r11 = r11[r0]
            com.google.android.gms.common.zzj[] r11 = new com.google.android.gms.common.zzj[]{r11}
            com.google.android.gms.common.zzj r10 = zzc(r10, r11)
        Lbe:
            if (r10 == 0) goto Lc1
            return r1
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zza(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.content.pm.PackageInfo] */
    @SuppressLint
    private final zzy zzb(@Nullable String str, boolean z, boolean z2) throws PackageManager.NameNotFoundException {
        zzy zzyVarZzc;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return zzy.zzc("null pkg");
        }
        if (str.equals(this.zzc)) {
            return zzy.zzb();
        }
        int i = zzo.zzh;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                zzo.zzb();
            } catch (RemoteException | DynamiteModule.LoadingException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
            if (zzo.zzg.zzg()) {
                zzv zzvVar = new zzv(null);
                zzvVar.zza(str);
                zzvVar.zzb(GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb));
                zzvVar.zzc(true);
                zzyVarZzc = zzo.zzc(zzvVar.zzd());
            } else {
                try {
                    threadPolicyAllowThreadDiskReads = this.zzb.getPackageManager().getPackageInfo(str, 134217792);
                    boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
                    if (threadPolicyAllowThreadDiskReads == 0) {
                        zzyVarZzc = zzy.zzc("null pkg");
                    } else {
                        Signature[] signatureArr = ((PackageInfo) threadPolicyAllowThreadDiskReads).signatures;
                        if (signatureArr == null || signatureArr.length != 1) {
                            zzyVarZzc = zzy.zzc("single cert required");
                        } else {
                            zzk zzkVar = new zzk(((PackageInfo) threadPolicyAllowThreadDiskReads).signatures[0].toByteArray());
                            String str2 = ((PackageInfo) threadPolicyAllowThreadDiskReads).packageName;
                            zzy zzyVarZzd = zzo.zzd(str2, zzkVar, zHonorsDebugCertificates, false);
                            zzyVarZzc = (!zzyVarZzd.zza || (applicationInfo = ((PackageInfo) threadPolicyAllowThreadDiskReads).applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !zzo.zzd(str2, zzkVar, false, true).zza) ? zzyVarZzd : zzy.zzc("debuggable release cert app rejected");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    return zzy.zzd("no pkg ".concat(str), e2);
                }
            }
            if (zzyVarZzc.zza) {
                this.zzc = str;
            }
            return zzyVarZzc;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Nullable
    private static zzj zzc(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < zzjVarArr.length; i++) {
                if (zzjVarArr[i].equals(zzkVar)) {
                    return zzjVarArr[i];
                }
            }
        }
        return null;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        if (zza(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(@Nullable String str) throws PackageManager.NameNotFoundException {
        zzy zzyVarZzb = zzb(str, false, false);
        zzyVarZzb.zze();
        return zzyVarZzb.zza;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i) throws PackageManager.NameNotFoundException {
        zzy zzyVarZzc;
        int length;
        String[] packagesForUid = this.zzb.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzyVarZzc = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    Preconditions.checkNotNull(zzyVarZzc);
                    break;
                }
                zzyVarZzc = zzb(packagesForUid[i2], false, false);
                if (zzyVarZzc.zza) {
                    break;
                }
                i2++;
            }
        } else {
            zzyVarZzc = zzy.zzc("no pkgs");
        }
        zzyVarZzc.zze();
        return zzyVarZzc.zza;
    }
}
