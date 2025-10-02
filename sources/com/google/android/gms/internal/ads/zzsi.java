package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzsi implements zzso {

    @Nullable
    private final Context zza;

    @Deprecated
    public zzsi() {
        this.zza = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    @Override // com.google.android.gms.internal.ads.zzso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzsq zzb(com.google.android.gms.internal.ads.zzsn r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L7
            goto L18
        L7:
            android.content.Context r1 = r6.zza
            if (r1 == 0) goto L39
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "com.amazon.hardware.tv_screen"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 != 0) goto L18
            goto L39
        L18:
            com.google.android.gms.internal.ads.zzu r0 = r7.zzc
            java.lang.String r0 = r0.zzo
            int r0 = com.google.android.gms.internal.ads.zzar.zzg(r0)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeo.zzQ(r0)
            java.lang.String r2 = "DMCodecAdapterFactory"
            java.lang.String r3 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r1 = r3.concat(r1)
            com.google.android.gms.internal.ads.zzds.zzb(r2, r1)
            com.google.android.gms.internal.ads.zzsa r1 = new com.google.android.gms.internal.ads.zzsa
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzsb r7 = r1.zza(r7)
            return r7
        L39:
            r1 = 0
            java.lang.String r2 = "createCodec:"
            com.google.android.gms.internal.ads.zzst r3 = r7.zza     // Catch: java.lang.RuntimeException -> L84 java.io.IOException -> L86
            java.lang.String r4 = r3.zza     // Catch: java.lang.RuntimeException -> L84 java.io.IOException -> L86
            java.lang.String r2 = r2.concat(r4)     // Catch: java.lang.RuntimeException -> L84 java.io.IOException -> L86
            android.os.Trace.beginSection(r2)     // Catch: java.lang.RuntimeException -> L84 java.io.IOException -> L86
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r4)     // Catch: java.lang.RuntimeException -> L84 java.io.IOException -> L86
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L84 java.io.IOException -> L86
            java.lang.String r4 = "configureCodec"
            android.os.Trace.beginSection(r4)     // Catch: java.lang.RuntimeException -> L63 java.io.IOException -> L65
            android.view.Surface r4 = r7.zzd     // Catch: java.lang.RuntimeException -> L63 java.io.IOException -> L65
            r5 = 0
            if (r4 != 0) goto L67
            boolean r3 = r3.zzh     // Catch: java.lang.RuntimeException -> L63 java.io.IOException -> L65
            if (r3 == 0) goto L67
            r3 = 35
            if (r0 < r3) goto L67
            r5 = 8
            goto L67
        L63:
            r7 = move-exception
            goto L82
        L65:
            r7 = move-exception
            goto L82
        L67:
            android.media.MediaFormat r0 = r7.zzb     // Catch: java.lang.RuntimeException -> L63 java.io.IOException -> L65
            r2.configure(r0, r4, r1, r5)     // Catch: java.lang.RuntimeException -> L63 java.io.IOException -> L65
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L63 java.io.IOException -> L65
            java.lang.String r0 = "startCodec"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.RuntimeException -> L63 java.io.IOException -> L65
            r2.start()     // Catch: java.lang.RuntimeException -> L63 java.io.IOException -> L65
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L63 java.io.IOException -> L65
            com.google.android.gms.internal.ads.zztm r0 = new com.google.android.gms.internal.ads.zztm     // Catch: java.lang.RuntimeException -> L63 java.io.IOException -> L65
            com.google.android.gms.internal.ads.zzsm r7 = r7.zzf     // Catch: java.lang.RuntimeException -> L63 java.io.IOException -> L65
            r0.<init>(r2, r7, r1)     // Catch: java.lang.RuntimeException -> L63 java.io.IOException -> L65
            return r0
        L82:
            r1 = r2
            goto L87
        L84:
            r7 = move-exception
            goto L87
        L86:
            r7 = move-exception
        L87:
            if (r1 == 0) goto L8c
            r1.release()
        L8c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsi.zzb(com.google.android.gms.internal.ads.zzsn):com.google.android.gms.internal.ads.zzsq");
    }

    public zzsi(Context context, @Nullable zzght zzghtVar, @Nullable zzght zzghtVar2) {
        this.zza = context;
    }
}
