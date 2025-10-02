package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzakh implements zzajv {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzaka zzg;
    private final zzajz zzh;
    private final zzakg zzi;
    private Bitmap zzj;

    public zzakh(List list) {
        zzef zzefVar = new zzef((byte[]) list.get(0));
        int iZzt = zzefVar.zzt();
        int iZzt2 = zzefVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzaka(719, 575, 0, 719, 0, 575);
        this.zzh = new zzajz(0, zzd(), zze(), zzf());
        this.zzi = new zzakg(iZzt, iZzt2);
    }

    private static zzajz zzb(zzee zzeeVar, int i) {
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i2 = 8;
        int iZzj5 = zzeeVar.zzj(8);
        zzeeVar.zzh(8);
        int[] iArrZzd = zzd();
        int[] iArrZze = zze();
        int[] iArrZzf = zzf();
        int i3 = i - 2;
        while (i3 > 0) {
            int iZzj6 = zzeeVar.zzj(i2);
            int iZzj7 = zzeeVar.zzj(i2);
            int[] iArr = (iZzj7 & 128) != 0 ? iArrZzd : (iZzj7 & 64) != 0 ? iArrZze : iArrZzf;
            if ((iZzj7 & 1) != 0) {
                iZzj3 = zzeeVar.zzj(i2);
                iZzj4 = zzeeVar.zzj(i2);
                iZzj = zzeeVar.zzj(i2);
                iZzj2 = zzeeVar.zzj(i2);
                i3 -= 6;
            } else {
                int iZzj8 = zzeeVar.zzj(6) << 2;
                int iZzj9 = zzeeVar.zzj(4) << 4;
                i3 -= 4;
                iZzj = zzeeVar.zzj(4) << 4;
                iZzj2 = zzeeVar.zzj(2) << 6;
                iZzj3 = iZzj8;
                iZzj4 = iZzj9;
            }
            if (iZzj3 == 0) {
                iZzj2 = 255;
            }
            if (iZzj3 == 0) {
                iZzj = 0;
            }
            if (iZzj3 == 0) {
                iZzj4 = 0;
            }
            double d = iZzj3;
            String str = zzeo.zza;
            double d2 = iZzj4 - 128;
            double d3 = iZzj - 128;
            iArr[iZzj6] = zzg((byte) (255 - (iZzj2 & 255)), Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255)));
            iZzj5 = iZzj5;
            i2 = 8;
        }
        return new zzajz(iZzj5, iArrZzd, iArrZze, iArrZzf);
    }

    private static zzakb zzc(zzee zzeeVar) {
        byte[] bArr;
        int iZzj = zzeeVar.zzj(16);
        zzeeVar.zzh(4);
        int iZzj2 = zzeeVar.zzj(2);
        boolean zZzi = zzeeVar.zzi();
        zzeeVar.zzh(1);
        byte[] bArr2 = zzeo.zzb;
        if (iZzj2 != 1) {
            if (iZzj2 == 0) {
                int iZzj3 = zzeeVar.zzj(16);
                int iZzj4 = zzeeVar.zzj(16);
                if (iZzj3 > 0) {
                    bArr2 = new byte[iZzj3];
                    zzeeVar.zzn(bArr2, 0, iZzj3);
                }
                if (iZzj4 > 0) {
                    bArr = new byte[iZzj4];
                    zzeeVar.zzn(bArr, 0, iZzj4);
                }
            }
            return new zzakb(iZzj, zZzi, bArr2, bArr);
        }
        zzeeVar.zzh(zzeeVar.zzj(8) * 16);
        bArr = bArr2;
        return new zzakb(iZzj, zZzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzg(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = zzg(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = zzg(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = zzg(127, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzh(byte[] r22, int[] r23, int r24, int r25, int r26, @androidx.annotation.Nullable android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakh.zzh(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzi(int i, int i2, zzee zzeeVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzeeVar.zzj(i2);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i, int i2, zzaju zzajuVar, zzdf zzdfVar) {
        boolean z;
        zzajn zzajnVar;
        Canvas canvas;
        char c;
        char c2;
        char c3;
        int i3;
        zzakg zzakgVar;
        Canvas canvas2;
        int i4;
        int i5;
        int i6;
        zzake zzakeVar;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i7;
        int iZzj5;
        zzee zzeeVar = new zzee(bArr, i + i2);
        zzeeVar.zzf(i);
        while (true) {
            z = true;
            if (zzeeVar.zzc() >= 48 && zzeeVar.zzj(8) == 15) {
                zzakg zzakgVar2 = this.zzi;
                int iZzj6 = zzeeVar.zzj(8);
                int iZzj7 = zzeeVar.zzj(16);
                int iZzj8 = zzeeVar.zzj(16);
                int iZze = zzeeVar.zze() + iZzj8;
                if (iZzj8 * 8 > zzeeVar.zzc()) {
                    zzds.zzc("DvbParser", "Data field length exceeds limit");
                    zzeeVar.zzh(zzeeVar.zzc());
                } else {
                    switch (iZzj6) {
                        case 16:
                            if (iZzj7 == zzakgVar2.zza) {
                                zzakc zzakcVar = zzakgVar2.zzi;
                                int iZzj9 = zzeeVar.zzj(8);
                                int iZzj10 = zzeeVar.zzj(4);
                                int iZzj11 = zzeeVar.zzj(2);
                                zzeeVar.zzh(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i8 = iZzj8 - 2; i8 > 0; i8 -= 6) {
                                    int iZzj12 = zzeeVar.zzj(8);
                                    zzeeVar.zzh(8);
                                    sparseArray.put(iZzj12, new zzakd(zzeeVar.zzj(16), zzeeVar.zzj(16)));
                                }
                                zzakc zzakcVar2 = new zzakc(iZzj9, iZzj10, iZzj11, sparseArray);
                                if (zzakcVar2.zzb != 0) {
                                    zzakgVar2.zzi = zzakcVar2;
                                    zzakgVar2.zzc.clear();
                                    zzakgVar2.zzd.clear();
                                    zzakgVar2.zze.clear();
                                    break;
                                } else if (zzakcVar != null) {
                                    if (zzakcVar.zza != zzakcVar2.zza) {
                                        zzakgVar2.zzi = zzakcVar2;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzakc zzakcVar3 = zzakgVar2.zzi;
                            if (iZzj7 == zzakgVar2.zza && zzakcVar3 != null) {
                                int iZzj13 = zzeeVar.zzj(8);
                                zzeeVar.zzh(4);
                                boolean zZzi = zzeeVar.zzi();
                                zzeeVar.zzh(3);
                                int iZzj14 = zzeeVar.zzj(16);
                                int iZzj15 = zzeeVar.zzj(16);
                                int iZzj16 = zzeeVar.zzj(3);
                                int iZzj17 = zzeeVar.zzj(3);
                                zzeeVar.zzh(2);
                                int iZzj18 = zzeeVar.zzj(8);
                                int iZzj19 = zzeeVar.zzj(8);
                                int iZzj20 = zzeeVar.zzj(4);
                                int iZzj21 = zzeeVar.zzj(2);
                                zzeeVar.zzh(2);
                                int i9 = iZzj8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i9 > 0) {
                                    int iZzj22 = zzeeVar.zzj(16);
                                    int iZzj23 = zzeeVar.zzj(2);
                                    int iZzj24 = zzeeVar.zzj(2);
                                    int iZzj25 = zzeeVar.zzj(12);
                                    zzeeVar.zzh(4);
                                    int iZzj26 = zzeeVar.zzj(12);
                                    int i10 = i9 - 6;
                                    if (iZzj23 == 1) {
                                        i9 -= 8;
                                        iZzj = zzeeVar.zzj(8);
                                        iZzj2 = zzeeVar.zzj(8);
                                    } else if (iZzj23 == 2) {
                                        iZzj23 = 2;
                                        i9 -= 8;
                                        iZzj = zzeeVar.zzj(8);
                                        iZzj2 = zzeeVar.zzj(8);
                                    } else {
                                        i9 = i10;
                                        iZzj = 0;
                                        iZzj2 = 0;
                                    }
                                    sparseArray2.put(iZzj22, new zzakf(iZzj23, iZzj24, iZzj25, iZzj26, iZzj, iZzj2));
                                }
                                zzake zzakeVar2 = new zzake(iZzj13, zZzi, iZzj14, iZzj15, iZzj16, iZzj17, iZzj18, iZzj19, iZzj20, iZzj21, sparseArray2);
                                if (zzakcVar3.zzb == 0 && (zzakeVar = (zzake) zzakgVar2.zzc.get(zzakeVar2.zza)) != null) {
                                    int i11 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzakeVar.zzj;
                                        if (i11 < sparseArray3.size()) {
                                            zzakeVar2.zzj.put(sparseArray3.keyAt(i11), (zzakf) sparseArray3.valueAt(i11));
                                            i11++;
                                        }
                                    }
                                }
                                zzakgVar2.zzc.put(zzakeVar2.zza, zzakeVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (iZzj7 == zzakgVar2.zza) {
                                zzajz zzajzVarZzb = zzb(zzeeVar, iZzj8);
                                zzakgVar2.zzd.put(zzajzVarZzb.zza, zzajzVarZzb);
                                break;
                            } else if (iZzj7 == zzakgVar2.zzb) {
                                zzajz zzajzVarZzb2 = zzb(zzeeVar, iZzj8);
                                zzakgVar2.zzf.put(zzajzVarZzb2.zza, zzajzVarZzb2);
                                break;
                            }
                            break;
                        case 19:
                            if (iZzj7 == zzakgVar2.zza) {
                                zzakb zzakbVarZzc = zzc(zzeeVar);
                                zzakgVar2.zze.put(zzakbVarZzc.zza, zzakbVarZzc);
                                break;
                            } else if (iZzj7 == zzakgVar2.zzb) {
                                zzakb zzakbVarZzc2 = zzc(zzeeVar);
                                zzakgVar2.zzg.put(zzakbVarZzc2.zza, zzakbVarZzc2);
                                break;
                            }
                            break;
                        case 20:
                            if (iZzj7 == zzakgVar2.zza) {
                                zzeeVar.zzh(4);
                                boolean zZzi2 = zzeeVar.zzi();
                                zzeeVar.zzh(3);
                                int iZzj27 = zzeeVar.zzj(16);
                                int iZzj28 = zzeeVar.zzj(16);
                                if (zZzi2) {
                                    int iZzj29 = zzeeVar.zzj(16);
                                    iZzj3 = zzeeVar.zzj(16);
                                    iZzj5 = zzeeVar.zzj(16);
                                    iZzj4 = zzeeVar.zzj(16);
                                    i7 = iZzj29;
                                } else {
                                    iZzj3 = iZzj27;
                                    iZzj4 = iZzj28;
                                    i7 = 0;
                                    iZzj5 = 0;
                                }
                                zzakgVar2.zzh = new zzaka(iZzj27, iZzj28, i7, iZzj3, iZzj5, iZzj4);
                                break;
                            }
                            break;
                    }
                    zzeeVar.zzo(iZze - zzeeVar.zze());
                }
            }
        }
        zzakg zzakgVar3 = this.zzi;
        zzakc zzakcVar4 = zzakgVar3.zzi;
        if (zzakcVar4 == null) {
            zzajnVar = new zzajn(zzgjz.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzaka zzakaVar = zzakgVar3.zzh;
            if (zzakaVar == null) {
                zzakaVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzakaVar.zza + 1 != bitmap.getWidth() || zzakaVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzakaVar.zza + 1, zzakaVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzakcVar4.zzc;
            int i12 = 0;
            while (i12 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzakd zzakdVar = (zzakd) sparseArray4.valueAt(i12);
                zzake zzakeVar3 = (zzake) zzakgVar3.zzc.get(sparseArray4.keyAt(i12));
                int i13 = zzakdVar.zza + zzakaVar.zzc;
                int i14 = zzakdVar.zzb + zzakaVar.zze;
                int i15 = zzakeVar3.zzc;
                int i16 = i13 + i15;
                boolean z2 = z;
                int iMin = Math.min(i16, zzakaVar.zzd);
                int i17 = zzakeVar3.zzd;
                int i18 = i14 + i17;
                canvas3.clipRect(i13, i14, iMin, Math.min(i18, zzakaVar.zzf));
                int i19 = zzakeVar3.zzf;
                zzajz zzajzVar = (zzajz) zzakgVar3.zzd.get(i19);
                if (zzajzVar == null && (zzajzVar = (zzajz) zzakgVar3.zzf.get(i19)) == null) {
                    zzajzVar = this.zzh;
                }
                SparseArray sparseArray5 = zzakeVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i20 = i12;
                int i21 = 0;
                while (i21 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i21);
                    int i22 = i21;
                    zzakf zzakfVar = (zzakf) sparseArray5.valueAt(i21);
                    SparseArray sparseArray7 = sparseArray5;
                    zzakb zzakbVar = (zzakb) zzakgVar3.zze.get(iKeyAt);
                    if (zzakbVar == null) {
                        zzakbVar = (zzakb) zzakgVar3.zzg.get(iKeyAt);
                    }
                    if (zzakbVar != null) {
                        Paint paint = zzakbVar.zzb ? null : this.zzd;
                        i5 = i15;
                        int i23 = zzakeVar3.zze;
                        zzakgVar = zzakgVar3;
                        int i24 = zzakfVar.zza + i13;
                        int i25 = i14 + zzakfVar.zzb;
                        canvas2 = canvas3;
                        i4 = i13;
                        int[] iArr = i23 == 3 ? zzajzVar.zzd : i23 == 2 ? zzajzVar.zzc : zzajzVar.zzb;
                        i6 = i16;
                        zzh(zzakbVar.zzc, iArr, i23, i24, i25, paint, canvas2);
                        zzh(zzakbVar.zzd, iArr, i23, i24, i25 + 1, paint, canvas2);
                    } else {
                        zzakgVar = zzakgVar3;
                        canvas2 = canvas3;
                        i4 = i13;
                        i5 = i15;
                        i6 = i16;
                    }
                    i13 = i4;
                    i16 = i6;
                    i21 = i22 + 1;
                    i15 = i5;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzakgVar3 = zzakgVar;
                }
                zzakg zzakgVar4 = zzakgVar3;
                Canvas canvas4 = canvas3;
                int i26 = i13;
                int i27 = i15;
                int i28 = i16;
                float f = i14;
                float f2 = i26;
                if (zzakeVar3.zzb) {
                    int i29 = zzakeVar3.zze;
                    if (i29 == 3) {
                        i3 = zzajzVar.zzd[zzakeVar3.zzg];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i3 = i29 == 2 ? zzajzVar.zzc[zzakeVar3.zzh] : zzajzVar.zzb[zzakeVar3.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i3);
                    float f3 = i28;
                    c2 = c3;
                    c = 3;
                    canvas = canvas4;
                    canvas.drawRect(f2, f, f3, i18, paint2);
                } else {
                    canvas = canvas4;
                    c = 3;
                    c2 = 2;
                }
                zzck zzckVar = new zzck();
                zzckVar.zzc(Bitmap.createBitmap(this.zzj, i26, i14, i27, i17));
                float f4 = zzakaVar.zza;
                zzckVar.zzi(f2 / f4);
                zzckVar.zzj(0);
                float f5 = zzakaVar.zzb;
                zzckVar.zzf(f / f5, 0);
                zzckVar.zzg(0);
                zzckVar.zzm(i27 / f4);
                zzckVar.zzn(i17 / f5);
                arrayList.add(zzckVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i12 = i20 + 1;
                z = z2;
                zzakgVar3 = zzakgVar4;
                sparseArray4 = sparseArray6;
            }
            zzajnVar = new zzajn(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdfVar.zza(zzajnVar);
    }
}
