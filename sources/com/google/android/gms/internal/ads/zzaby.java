package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzaby {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Removed duplicated region for block: B:145:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0292 A[PHI: r1 r5 r8
  0x0292: PHI (r1v4 int) = (r1v3 int), (r1v60 int) binds: [B:176:0x0294, B:169:0x026a] A[DONT_GENERATE, DONT_INLINE]
  0x0292: PHI (r5v3 int) = (r5v2 int), (r5v17 int) binds: [B:176:0x0294, B:169:0x026a] A[DONT_GENERATE, DONT_INLINE]
  0x0292: PHI (r8v3 int) = (r8v2 int), (r8v37 int) binds: [B:176:0x0294, B:169:0x026a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0382  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzu zza(com.google.android.gms.internal.ads.zzef r21, java.lang.String r22, @androidx.annotation.Nullable java.lang.String r23, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzp r24) throws com.google.android.gms.internal.ads.zzas {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaby.zza(com.google.android.gms.internal.ads.zzef, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzp):com.google.android.gms.internal.ads.zzu");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzabx zzb(com.google.android.gms.internal.ads.zzee r11) {
        /*
            r0 = 16
            int r1 = r11.zzj(r0)
            int r0 = r11.zzj(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.zzj(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.zzj(r0)
            r2 = 0
            r4 = 3
            if (r1 != r4) goto L39
            r1 = r2
        L2c:
            int r5 = r11.zzj(r0)
            int r5 = r5 + r1
            boolean r1 = r11.zzi()
            if (r1 != 0) goto L3b
            int r1 = r5 + 3
        L39:
            r5 = r1
            goto L40
        L3b:
            int r5 = r5 + 1
            int r1 = r5 << 2
            goto L2c
        L40:
            r1 = 10
            int r1 = r11.zzj(r1)
            boolean r6 = r11.zzi()
            if (r6 == 0) goto L55
            int r6 = r11.zzj(r4)
            if (r6 <= 0) goto L55
            r11.zzh(r0)
        L55:
            boolean r6 = r11.zzi()
            r7 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            r10 = 1
            if (r10 == r6) goto L65
            r6 = r7
            r7 = r9
            goto L66
        L65:
            r6 = r7
        L66:
            int r11 = r11.zzj(r3)
            if (r7 != r9) goto L76
            r9 = 13
            if (r11 != r9) goto L76
            int[] r11 = com.google.android.gms.internal.ads.zzaby.zzb
            r2 = r11[r9]
        L74:
            r9 = r2
            goto La2
        L76:
            if (r7 != r6) goto L74
            r6 = 14
            if (r11 >= r6) goto L74
            int[] r2 = com.google.android.gms.internal.ads.zzaby.zzb
            r2 = r2[r11]
            int r1 = r1 % 5
            r6 = 8
            if (r1 == r10) goto L9d
            r9 = 11
            if (r1 == r0) goto L98
            if (r1 == r4) goto L9d
            if (r1 == r3) goto L8f
            goto L74
        L8f:
            if (r11 == r4) goto L95
            if (r11 == r6) goto L95
            if (r11 != r9) goto L74
        L95:
            int r2 = r2 + 1
            goto L74
        L98:
            if (r11 == r6) goto L95
            if (r11 != r9) goto L74
            goto L95
        L9d:
            if (r11 == r4) goto L95
            if (r11 != r6) goto L74
            goto L95
        La2:
            com.google.android.gms.internal.ads.zzabx r4 = new com.google.android.gms.internal.ads.zzabx
            r6 = 2
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaby.zzb(com.google.android.gms.internal.ads.zzee):com.google.android.gms.internal.ads.zzabx");
    }

    public static void zzc(int i, zzef zzefVar) {
        zzefVar.zza(7);
        byte[] bArrZzi = zzefVar.zzi();
        bArrZzi[0] = -84;
        bArrZzi[1] = 64;
        bArrZzi[2] = -1;
        bArrZzi[3] = -1;
        bArrZzi[4] = (byte) ((i >> 16) & 255);
        bArrZzi[5] = (byte) ((i >> 8) & 255);
        bArrZzi[6] = (byte) (i & 255);
    }

    private static void zzd(zzee zzeeVar, zzabw zzabwVar) throws zzas {
        int iZzj = zzeeVar.zzj(5);
        zzeeVar.zzh(2);
        if (zzeeVar.zzi()) {
            zzeeVar.zzh(5);
        }
        if (iZzj >= 7 && iZzj <= 10) {
            zzeeVar.zzg();
        }
        if (zzeeVar.zzi()) {
            int iZzj2 = zzeeVar.zzj(3);
            if (zzabwVar.zzb == -1 && iZzj >= 0 && iZzj <= 15 && (iZzj2 == 0 || iZzj2 == 1)) {
                zzabwVar.zzb = iZzj;
            }
            if (zzeeVar.zzi()) {
                zzf(zzeeVar);
            }
        }
    }

    private static void zze(zzee zzeeVar, zzabw zzabwVar) throws zzas {
        zzeeVar.zzh(2);
        boolean zZzi = zzeeVar.zzi();
        int iZzj = zzeeVar.zzj(8);
        for (int i = 0; i < iZzj; i++) {
            zzeeVar.zzh(2);
            if (zzeeVar.zzi()) {
                zzeeVar.zzh(5);
            }
            if (zZzi) {
                zzeeVar.zzh(24);
            } else {
                if (zzeeVar.zzi()) {
                    if (!zzeeVar.zzi()) {
                        zzeeVar.zzh(4);
                    }
                    zzabwVar.zzc = zzeeVar.zzj(6) + 1;
                }
                zzeeVar.zzh(4);
            }
        }
        if (zzeeVar.zzi()) {
            zzeeVar.zzh(3);
            if (zzeeVar.zzi()) {
                zzf(zzeeVar);
            }
        }
    }

    private static void zzf(zzee zzeeVar) throws zzas {
        int iZzj = zzeeVar.zzj(6);
        if (iZzj < 2 || iZzj > 42) {
            throw zzas.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iZzj)));
        }
        zzeeVar.zzh(iZzj * 8);
    }

    private static boolean zzg(zzee zzeeVar) {
        if (zzeeVar.zzc() < 66) {
            return false;
        }
        zzeeVar.zzh(66);
        return true;
    }
}
