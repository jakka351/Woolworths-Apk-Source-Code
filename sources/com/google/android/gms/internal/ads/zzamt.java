package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzamt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zza(com.google.android.gms.internal.ads.zzee r18, com.google.android.gms.internal.ads.zzamr r19) throws com.google.android.gms.internal.ads.zzas {
        /*
            r0 = r18
            r1 = r19
            r0.zze()
            r2 = 3
            r3 = 8
            int r2 = zzf(r0, r2, r3, r3)
            r1.zza = r2
            r4 = 0
            r5 = -1
            if (r2 == r5) goto Ld1
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L26
            r6 = r9
            goto L27
        L26:
            r6 = r4
        L27:
            com.google.android.gms.internal.ads.zzghc.zza(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = java.lang.Math.addExact(r10, r12)
            r16 = r10
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            java.lang.Math.addExact(r14, r10)
            int r6 = r0.zzc()
            r10 = -1
            if (r6 >= r2) goto L46
        L44:
            r14 = r10
            goto L6f
        L46:
            long r14 = r0.zzk(r2)
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 != 0) goto L6f
            int r6 = r0.zzc()
            if (r6 >= r3) goto L55
            goto L44
        L55:
            long r14 = r0.zzk(r3)
            long r16 = r14 + r16
            int r3 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r3 != 0) goto L6d
            int r3 = r0.zzc()
            if (r3 >= r7) goto L66
            goto L44
        L66:
            long r6 = r0.zzk(r7)
            long r14 = r6 + r16
            goto L6f
        L6d:
            r14 = r16
        L6f:
            r1.zzb = r14
            int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r3 != 0) goto L76
            return r4
        L76:
            r6 = 16
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 > 0) goto Lb1
            r6 = 0
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto La3
            int r3 = r1.zza
            r6 = 0
            if (r3 == r9) goto L9c
            if (r3 == r2) goto L95
            r2 = 17
            if (r3 == r2) goto L8e
            goto La3
        L8e:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzas r0 = com.google.android.gms.internal.ads.zzas.zzb(r0, r6)
            throw r0
        L95:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzas r0 = com.google.android.gms.internal.ads.zzas.zzb(r0, r6)
            throw r0
        L9c:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzas r0 = com.google.android.gms.internal.ads.zzas.zzb(r0, r6)
            throw r0
        La3:
            r2 = 11
            r3 = 24
            int r0 = zzf(r0, r2, r3, r3)
            r1.zzc = r0
            if (r0 == r5) goto Lb0
            return r9
        Lb0:
            return r4
        Lb1:
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 49
            r1.<init>(r0)
            java.lang.String r0 = "Contains sub-stream with an invalid packet label "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzas r0 = com.google.android.gms.internal.ads.zzas.zzc(r0)
            throw r0
        Ld1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamt.zza(com.google.android.gms.internal.ads.zzee, com.google.android.gms.internal.ads.zzamr):boolean");
    }

    public static zzams zzb(zzee zzeeVar) throws zzas {
        int iZzj;
        int i;
        char c;
        int i2;
        int i3;
        int iZzj2;
        char c2;
        int iZzj3 = zzeeVar.zzj(8);
        int i4 = 5;
        int iZzj4 = zzeeVar.zzj(5);
        if (iZzj4 != 31) {
            switch (iZzj4) {
                case 0:
                    iZzj = 96000;
                    break;
                case 1:
                    iZzj = 88200;
                    break;
                case 2:
                    iZzj = 64000;
                    break;
                case 3:
                    iZzj = 48000;
                    break;
                case 4:
                    iZzj = 44100;
                    break;
                case 5:
                    iZzj = 32000;
                    break;
                case 6:
                    iZzj = 24000;
                    break;
                case 7:
                    iZzj = 22050;
                    break;
                case 8:
                    iZzj = 16000;
                    break;
                case 9:
                    iZzj = 12000;
                    break;
                case 10:
                    iZzj = 11025;
                    break;
                case 11:
                    iZzj = 8000;
                    break;
                case 12:
                    iZzj = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzj4).length() + 32);
                    sb.append("Unsupported sampling rate index ");
                    sb.append(iZzj4);
                    throw zzas.zzc(sb.toString());
                case 15:
                    iZzj = 57600;
                    break;
                case 16:
                    iZzj = 51200;
                    break;
                case 17:
                    iZzj = 40000;
                    break;
                case 18:
                    iZzj = 38400;
                    break;
                case 19:
                    iZzj = 34150;
                    break;
                case 20:
                    iZzj = 28800;
                    break;
                case 21:
                    iZzj = 25600;
                    break;
                case 22:
                    iZzj = 20000;
                    break;
                case 23:
                    iZzj = 19200;
                    break;
                case 24:
                    iZzj = 17075;
                    break;
                case 25:
                    iZzj = 14400;
                    break;
                case 26:
                    iZzj = 12800;
                    break;
                case 27:
                    iZzj = 9600;
                    break;
            }
        } else {
            iZzj = zzeeVar.zzj(24);
        }
        int iZzj5 = zzeeVar.zzj(3);
        int i5 = 1;
        if (iZzj5 == 0) {
            i = 768;
        } else if (iZzj5 == 1) {
            i = 1024;
        } else if (iZzj5 == 2 || iZzj5 == 3) {
            i = 2048;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb2 = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.a(iZzj5, 36));
                sb2.append("Unsupported coreSbrFrameLengthIndex ");
                sb2.append(iZzj5);
                throw zzas.zzc(sb2.toString());
            }
            i = 4096;
        }
        if (iZzj5 == 0 || iZzj5 == 1) {
            c = 0;
        } else if (iZzj5 == 2) {
            c = 2;
        } else if (iZzj5 == 3) {
            c = 3;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb3 = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.a(iZzj5, 36));
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(iZzj5);
                throw zzas.zzc(sb3.toString());
            }
            c = 1;
        }
        zzeeVar.zzh(2);
        zzc(zzeeVar);
        int iZzj6 = zzeeVar.zzj(5);
        int i6 = 0;
        int iZzf = 0;
        while (true) {
            int i7 = 16;
            if (i6 < iZzj6 + 1) {
                int iZzj7 = zzeeVar.zzj(3);
                iZzf += zzf(zzeeVar, 5, 8, 16) + 1;
                if ((iZzj7 == 0 || iZzj7 == 2) && zzeeVar.zzi()) {
                    zzc(zzeeVar);
                }
                i6++;
            } else {
                int iZzf2 = zzf(zzeeVar, 4, 8, 16) + 1;
                zzeeVar.zzg();
                int i8 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i8 >= iZzf2) {
                        int i9 = iZzj3;
                        byte[] bArr = null;
                        if (zzeeVar.zzi()) {
                            int iZzf3 = zzf(zzeeVar, 2, 4, 8) + 1;
                            for (int i10 = 0; i10 < iZzf3; i10++) {
                                int iZzf4 = zzf(zzeeVar, 4, 8, 16);
                                int iZzf5 = zzf(zzeeVar, 4, 8, 16);
                                if (iZzf4 == 7) {
                                    int iZzj8 = zzeeVar.zzj(4) + 1;
                                    zzeeVar.zzh(4);
                                    byte[] bArr2 = new byte[iZzj8];
                                    for (int i11 = 0; i11 < iZzj8; i11++) {
                                        bArr2[i11] = (byte) zzeeVar.zzj(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzeeVar.zzh(iZzf5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iZzj) {
                            case 14700:
                            case 16000:
                                d = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d = 1.0d;
                                break;
                            default:
                                StringBuilder sb4 = new StringBuilder(String.valueOf(iZzj).length() + 26);
                                sb4.append("Unsupported sampling rate ");
                                sb4.append(iZzj);
                                throw zzas.zzc(sb4.toString());
                        }
                        return new zzams(i9, (int) (iZzj * d), (int) (i * d), bArr3, null);
                    }
                    int iZzj9 = zzeeVar.zzj(2);
                    if (iZzj9 == 0) {
                        i2 = iZzj3;
                        i3 = i5;
                        zzd(zzeeVar);
                        if (c > 0) {
                            zze(zzeeVar);
                        }
                    } else if (iZzj9 == i5) {
                        i3 = i5;
                        if (zzd(zzeeVar)) {
                            zzeeVar.zzg();
                        }
                        if (c > 0) {
                            zze(zzeeVar);
                            iZzj2 = zzeeVar.zzj(2);
                            c2 = c;
                        } else {
                            iZzj2 = 0;
                            c2 = 0;
                        }
                        if (iZzj2 > 0) {
                            zzeeVar.zzh(6);
                            int iZzj10 = zzeeVar.zzj(2);
                            zzeeVar.zzh(4);
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(i4);
                            }
                            if (iZzj2 == 2 || iZzj2 == 3) {
                                zzeeVar.zzh(6);
                            }
                            if (iZzj10 == 2) {
                                zzeeVar.zzg();
                            }
                        }
                        i2 = iZzj3;
                        int iFloor = ((int) Math.floor(Math.log(iZzf - 1) / Math.log(2.0d))) + 1;
                        int iZzj11 = zzeeVar.zzj(2);
                        if (iZzj11 > 0 && zzeeVar.zzi()) {
                            zzeeVar.zzh(iFloor);
                        }
                        if (zzeeVar.zzi()) {
                            zzeeVar.zzh(iFloor);
                        }
                        if (c2 == 0 && iZzj11 == 0) {
                            zzeeVar.zzg();
                        }
                    } else if (iZzj9 != 3) {
                        i2 = iZzj3;
                        i3 = i5;
                    } else {
                        zzf(zzeeVar, 4, 8, i7);
                        int iZzf6 = zzf(zzeeVar, 4, 8, i7);
                        i3 = i5;
                        if (zzeeVar.zzi()) {
                            zzf(zzeeVar, 8, i7, 0);
                        }
                        zzeeVar.zzg();
                        if (iZzf6 > 0) {
                            zzeeVar.zzh(iZzf6 * 8);
                        }
                        i2 = iZzj3;
                    }
                    i8++;
                    iZzj3 = i2;
                    i5 = i3;
                    i4 = 5;
                    i7 = 16;
                }
            }
        }
    }

    private static void zzc(zzee zzeeVar) {
        int iZzj;
        int iZzj2 = zzeeVar.zzj(2);
        if (iZzj2 == 0) {
            zzeeVar.zzh(6);
            return;
        }
        int iZzf = zzf(zzeeVar, 5, 8, 16) + 1;
        if (iZzj2 == 1) {
            zzeeVar.zzh(iZzf * 7);
            return;
        }
        if (iZzj2 == 2) {
            boolean zZzi = zzeeVar.zzi();
            int i = true != zZzi ? 5 : 1;
            int i2 = true == zZzi ? 7 : 5;
            int i3 = true == zZzi ? 8 : 6;
            int i4 = 0;
            while (i4 < iZzf) {
                if (zzeeVar.zzi()) {
                    zzeeVar.zzh(7);
                    iZzj = 0;
                } else {
                    if (zzeeVar.zzj(2) == 3 && zzeeVar.zzj(i2) * i != 0) {
                        zzeeVar.zzg();
                    }
                    iZzj = zzeeVar.zzj(i3) * i;
                    if (iZzj != 0 && iZzj != 180) {
                        zzeeVar.zzg();
                    }
                    zzeeVar.zzg();
                }
                if (iZzj != 0 && iZzj != 180 && zzeeVar.zzi()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    private static boolean zzd(zzee zzeeVar) {
        zzeeVar.zzh(3);
        boolean zZzi = zzeeVar.zzi();
        if (zZzi) {
            zzeeVar.zzh(13);
        }
        return zZzi;
    }

    private static void zze(zzee zzeeVar) {
        zzeeVar.zzh(3);
        zzeeVar.zzh(8);
        boolean zZzi = zzeeVar.zzi();
        boolean zZzi2 = zzeeVar.zzi();
        if (zZzi) {
            zzeeVar.zzh(5);
        }
        if (zZzi2) {
            zzeeVar.zzh(6);
        }
    }

    private static int zzf(zzee zzeeVar, int i, int i2, int i3) {
        zzghc.zza(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        Math.addExact(Math.addExact(i4, i5), 1 << i3);
        if (zzeeVar.zzc() < i) {
            return -1;
        }
        int iZzj = zzeeVar.zzj(i);
        if (iZzj == i4) {
            if (zzeeVar.zzc() < i2) {
                return -1;
            }
            int iZzj2 = zzeeVar.zzj(i2);
            iZzj += iZzj2;
            if (iZzj2 == i5) {
                if (zzeeVar.zzc() < i3) {
                    return -1;
                }
                return zzeeVar.zzj(i3) + iZzj;
            }
        }
        return iZzj;
    }
}
