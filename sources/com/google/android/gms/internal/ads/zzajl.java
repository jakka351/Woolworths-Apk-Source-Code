package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes5.dex */
final class zzajl extends zzajj {

    @Nullable
    private zzajk zza;
    private int zzb;
    private boolean zzc;

    @Nullable
    private zzaeg zzd;

    @Nullable
    private zzaee zze;

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final long zzb(zzef zzefVar) {
        if ((zzefVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzefVar.zzi()[0];
        zzajk zzajkVar = this.zza;
        zzajkVar.getClass();
        int i = !zzajkVar.zzd[(b >> 1) & (255 >>> (8 - zzajkVar.zze))].zza ? zzajkVar.zza.zze : zzajkVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzefVar.zzj() < zzefVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzefVar.zzi(), zzefVar.zze() + 4);
            zzefVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzefVar.zzf(zzefVar.zze() + 4);
        }
        long j = i2;
        byte[] bArrZzi = zzefVar.zzi();
        bArrZzi[zzefVar.zze() - 4] = (byte) (j & 255);
        bArrZzi[zzefVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzi[zzefVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzi[zzefVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    @EnsuresNonNullIf
    public final boolean zzc(zzef zzefVar, long j, zzajh zzajhVar) throws IOException {
        zzajk zzajkVar;
        int i;
        int iZzb;
        int i2;
        int i3;
        long jFloor;
        if (this.zza != null) {
            zzajhVar.zza.getClass();
            return false;
        }
        zzaeg zzaegVar = this.zzd;
        int i4 = 1;
        if (zzaegVar == null) {
            zzaeh.zzd(1, zzefVar, false);
            int iZzI = zzefVar.zzI();
            int iZzs = zzefVar.zzs();
            int iZzI2 = zzefVar.zzI();
            int iZzC = zzefVar.zzC();
            int i5 = iZzC <= 0 ? -1 : iZzC;
            int iZzC2 = zzefVar.zzC();
            int i6 = iZzC2 <= 0 ? -1 : iZzC2;
            int iZzC3 = zzefVar.zzC();
            int i7 = iZzC3 <= 0 ? -1 : iZzC3;
            int iZzs2 = zzefVar.zzs();
            this.zzd = new zzaeg(iZzI, iZzs, iZzI2, i5, i6, i7, (int) Math.pow(2.0d, iZzs2 & 15), (int) Math.pow(2.0d, (iZzs2 & 240) >> 4), 1 == (zzefVar.zzs() & 1), Arrays.copyOf(zzefVar.zzi(), zzefVar.zze()));
        } else {
            int i8 = 4;
            zzaee zzaeeVar = this.zze;
            if (zzaeeVar == null) {
                this.zze = zzaeh.zzb(zzefVar, true, true);
            } else {
                byte[] bArr = new byte[zzefVar.zze()];
                System.arraycopy(zzefVar.zzi(), 0, bArr, 0, zzefVar.zze());
                int i9 = zzaegVar.zza;
                int i10 = 5;
                zzaeh.zzd(5, zzefVar, false);
                int iZzs3 = zzefVar.zzs() + 1;
                zzaed zzaedVar = new zzaed(zzefVar.zzi());
                zzaedVar.zzc(zzefVar.zzg() * 8);
                int i11 = 0;
                while (true) {
                    int i12 = 2;
                    int i13 = 16;
                    if (i11 >= iZzs3) {
                        int i14 = i4;
                        int i15 = 6;
                        int iZzb2 = zzaedVar.zzb(6) + i14;
                        for (int i16 = 0; i16 < iZzb2; i16++) {
                            if (zzaedVar.zzb(16) != 0) {
                                throw zzas.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iZzb3 = zzaedVar.zzb(6) + i14;
                        int i17 = 0;
                        while (true) {
                            int i18 = 3;
                            if (i17 < iZzb3) {
                                int iZzb4 = zzaedVar.zzb(i13);
                                if (iZzb4 == 0) {
                                    int i19 = 8;
                                    zzaedVar.zzc(8);
                                    zzaedVar.zzc(16);
                                    zzaedVar.zzc(16);
                                    zzaedVar.zzc(6);
                                    zzaedVar.zzc(8);
                                    int iZzb5 = zzaedVar.zzb(4) + 1;
                                    int i20 = 0;
                                    while (i20 < iZzb5) {
                                        zzaedVar.zzc(i19);
                                        i20++;
                                        i19 = 8;
                                    }
                                } else {
                                    if (iZzb4 != 1) {
                                        StringBuilder sb = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.a(iZzb4, 41));
                                        sb.append("floor type greater than 1 not decodable: ");
                                        sb.append(iZzb4);
                                        throw zzas.zzb(sb.toString(), null);
                                    }
                                    int iZzb6 = zzaedVar.zzb(5);
                                    int[] iArr = new int[iZzb6];
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < iZzb6; i22++) {
                                        int iZzb7 = zzaedVar.zzb(4);
                                        iArr[i22] = iZzb7;
                                        if (iZzb7 > i21) {
                                            i21 = iZzb7;
                                        }
                                    }
                                    int i23 = i21 + 1;
                                    int[] iArr2 = new int[i23];
                                    int i24 = 0;
                                    while (i24 < i23) {
                                        iArr2[i24] = zzaedVar.zzb(i18) + 1;
                                        int iZzb8 = zzaedVar.zzb(2);
                                        if (iZzb8 > 0) {
                                            i2 = 8;
                                            zzaedVar.zzc(8);
                                        } else {
                                            i2 = 8;
                                        }
                                        int i25 = i23;
                                        int i26 = 0;
                                        for (int i27 = 1; i26 < (i27 << iZzb8); i27 = 1) {
                                            zzaedVar.zzc(i2);
                                            i26++;
                                            i2 = 8;
                                        }
                                        i24++;
                                        i23 = i25;
                                        i18 = 3;
                                    }
                                    zzaedVar.zzc(2);
                                    int iZzb9 = zzaedVar.zzb(4);
                                    int i28 = 0;
                                    int i29 = 0;
                                    for (int i30 = 0; i30 < iZzb6; i30++) {
                                        i28 += iArr2[iArr[i30]];
                                        while (i29 < i28) {
                                            zzaedVar.zzc(iZzb9);
                                            i29++;
                                        }
                                    }
                                }
                                i17++;
                                i15 = 6;
                                i13 = 16;
                            } else {
                                int i31 = 1;
                                int iZzb10 = zzaedVar.zzb(i15) + 1;
                                int i32 = 0;
                                while (i32 < iZzb10) {
                                    if (zzaedVar.zzb(16) > 2) {
                                        throw zzas.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzaedVar.zzc(24);
                                    zzaedVar.zzc(24);
                                    zzaedVar.zzc(24);
                                    int iZzb11 = zzaedVar.zzb(i15) + i31;
                                    int i33 = 8;
                                    zzaedVar.zzc(8);
                                    int[] iArr3 = new int[iZzb11];
                                    for (int i34 = 0; i34 < iZzb11; i34++) {
                                        iArr3[i34] = ((zzaedVar.zza() ? zzaedVar.zzb(5) : 0) * 8) + zzaedVar.zzb(3);
                                    }
                                    int i35 = 0;
                                    while (i35 < iZzb11) {
                                        int i36 = 0;
                                        while (i36 < i33) {
                                            if ((iArr3[i35] & (1 << i36)) != 0) {
                                                zzaedVar.zzc(i33);
                                            }
                                            i36++;
                                            i33 = 8;
                                        }
                                        i35++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i15 = 6;
                                    i31 = 1;
                                }
                                int iZzb12 = zzaedVar.zzb(i15) + 1;
                                for (int i37 = 0; i37 < iZzb12; i37++) {
                                    int iZzb13 = zzaedVar.zzb(16);
                                    if (iZzb13 != 0) {
                                        StringBuilder sb2 = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.a(iZzb13, 41));
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(iZzb13);
                                        zzds.zze("VorbisUtil", sb2.toString());
                                    } else {
                                        if (zzaedVar.zza()) {
                                            i = 1;
                                            iZzb = zzaedVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            iZzb = 1;
                                        }
                                        if (zzaedVar.zza()) {
                                            int iZzb14 = zzaedVar.zzb(8) + i;
                                            for (int i38 = 0; i38 < iZzb14; i38++) {
                                                int i39 = i9 - 1;
                                                zzaedVar.zzc(zzaeh.zza(i39));
                                                zzaedVar.zzc(zzaeh.zza(i39));
                                            }
                                        }
                                        if (zzaedVar.zzb(2) != 0) {
                                            throw zzas.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i40 = 0; i40 < i9; i40++) {
                                                zzaedVar.zzc(4);
                                            }
                                        }
                                        for (int i41 = 0; i41 < iZzb; i41++) {
                                            zzaedVar.zzc(8);
                                            zzaedVar.zzc(8);
                                            zzaedVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb15 = zzaedVar.zzb(6);
                                int i42 = iZzb15 + 1;
                                zzaef[] zzaefVarArr = new zzaef[i42];
                                for (int i43 = 0; i43 < i42; i43++) {
                                    zzaefVarArr[i43] = new zzaef(zzaedVar.zza(), zzaedVar.zzb(16), zzaedVar.zzb(16), zzaedVar.zzb(8));
                                }
                                if (!zzaedVar.zza()) {
                                    throw zzas.zzb("framing bit after modes not set as expected", null);
                                }
                                zzajkVar = new zzajk(zzaegVar, zzaeeVar, bArr, zzaefVarArr, zzaeh.zza(iZzb15));
                            }
                        }
                    } else {
                        if (zzaedVar.zzb(24) != 5653314) {
                            int iZzd = zzaedVar.zzd();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzd).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(iZzd);
                            throw zzas.zzb(sb3.toString(), null);
                        }
                        int iZzb16 = zzaedVar.zzb(16);
                        int iZzb17 = zzaedVar.zzb(24);
                        if (zzaedVar.zza()) {
                            zzaedVar.zzc(i10);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzaedVar.zzb(zzaeh.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZza = zzaedVar.zza();
                            for (int i44 = 0; i44 < iZzb17; i44++) {
                                if (!zZza) {
                                    zzaedVar.zzc(i10);
                                } else if (zzaedVar.zza()) {
                                    zzaedVar.zzc(i10);
                                }
                            }
                        }
                        int i45 = i8;
                        int iZzb19 = zzaedVar.zzb(i45);
                        if (iZzb19 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzb19).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(iZzb19);
                            throw zzas.zzb(sb4.toString(), null);
                        }
                        if (iZzb19 != i4) {
                            if (iZzb19 != 2) {
                                i3 = i4;
                            }
                            i11++;
                            i4 = i3;
                            i8 = 4;
                            i10 = 5;
                        } else {
                            i12 = iZzb19;
                        }
                        zzaedVar.zzc(32);
                        zzaedVar.zzc(32);
                        int iZzb20 = zzaedVar.zzb(i45) + i4;
                        zzaedVar.zzc(i4);
                        if (i12 != i4) {
                            i3 = i4;
                            jFloor = iZzb16 * iZzb17;
                        } else if (iZzb16 != 0) {
                            i3 = i4;
                            jFloor = (long) Math.floor(Math.pow(iZzb17, 1.0d / iZzb16));
                        } else {
                            i3 = i4;
                            jFloor = 0;
                        }
                        zzaedVar.zzc((int) (jFloor * iZzb20));
                        i11++;
                        i4 = i3;
                        i8 = 4;
                        i10 = 5;
                    }
                }
            }
        }
        zzajkVar = null;
        this.zza = zzajkVar;
        if (zzajkVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzaeg zzaegVar2 = zzajkVar.zza;
        arrayList.add(zzaegVar2.zzg);
        arrayList.add(zzajkVar.zzc);
        zzao zzaoVarZzc = zzaeh.zzc(zzgjz.zzr(zzajkVar.zzb.zza));
        zzs zzsVar = new zzs();
        zzsVar.zzl("audio/ogg");
        zzsVar.zzm("audio/vorbis");
        zzsVar.zzh(zzaegVar2.zzd);
        zzsVar.zzi(zzaegVar2.zzc);
        zzsVar.zzE(zzaegVar2.zza);
        zzsVar.zzF(zzaegVar2.zzb);
        zzsVar.zzp(arrayList);
        zzsVar.zzk(zzaoVarZzc);
        zzajhVar.zza = zzsVar.zzM();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzj(long j) {
        super.zzj(j);
        this.zzc = j != 0;
        zzaeg zzaegVar = this.zzd;
        this.zzb = zzaegVar != null ? zzaegVar.zze : 0;
    }
}
