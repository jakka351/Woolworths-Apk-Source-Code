package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes5.dex */
public final class zzagz implements zzacu {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;

    @Nullable
    private zzagy zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private boolean zzI;
    private long zzJ;
    private long zzK;
    private long zzL;

    @Nullable
    private zzdt zzM;

    @Nullable
    private zzdt zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private long zzR;
    private long zzS;
    private int zzT;
    private int zzU;
    private int[] zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private int zzZ;
    private boolean zzaa;
    private long zzab;
    private int zzac;
    private int zzad;
    private int zzae;
    private boolean zzaf;
    private boolean zzag;
    private boolean zzah;
    private int zzai;
    private byte zzaj;
    private boolean zzak;
    private zzacx zzal;
    private final zzagu zzam;
    private final zzahb zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzajt zzl;
    private final zzef zzm;
    private final zzef zzn;
    private final zzef zzo;
    private final zzef zzp;
    private final zzef zzq;
    private final zzef zzr;
    private final zzef zzs;
    private final zzef zzt;
    private final zzef zzu;
    private final zzef zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        String str = zzeo.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        androidx.constraintlayout.core.state.a.u(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        androidx.constraintlayout.core.state.a.u(SubsamplingScaleImageView.ORIENTATION_180, map, "htc_video_rotA-180", SubsamplingScaleImageView.ORIENTATION_270, "htc_video_rotA-270");
        zzg = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzagz() {
        this(new zzagu(), 2, zzajt.zza);
    }

    private final void zzA() {
        if (!this.zzD) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                zzacx zzacxVar = this.zzal;
                zzacxVar.getClass();
                zzacxVar.zzv();
                this.zzD = false;
                return;
            }
            if (((zzagy) sparseArray.valueAt(i)).zzV) {
                return;
            } else {
                i++;
            }
        }
    }

    @EnsuresNonNull
    private final void zzp(int i) throws zzas {
        if (this.zzE != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw zzas.zzb(sb.toString(), null);
    }

    @EnsuresNonNull
    private final void zzq(int i) throws zzas {
        if (this.zzM == null || this.zzN == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw zzas.zzb(sb.toString(), null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        r2 = zzw(r10, "%01d:%02d:%02d:%02d", 10000);
        r3 = 21;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca A[SYNTHETIC] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzr(com.google.android.gms.internal.ads.zzagy r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagz.zzr(com.google.android.gms.internal.ads.zzagy, long, int, int, int):void");
    }

    private final void zzs(zzacv zzacvVar, int i) throws IOException {
        zzef zzefVar = this.zzo;
        if (zzefVar.zze() >= i) {
            return;
        }
        if (zzefVar.zzj() < i) {
            int iZzj = zzefVar.zzj();
            zzefVar.zzc(Math.max(iZzj + iZzj, i));
        }
        zzacvVar.zzc(zzefVar.zzi(), zzefVar.zze(), i - zzefVar.zze());
        zzefVar.zzf(i);
    }

    @RequiresNonNull
    private final int zzt(zzacv zzacvVar, zzagy zzagyVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzagyVar.zzc)) {
            zzv(zzacvVar, zzb, i);
            int i3 = this.zzad;
            zzu();
            return i3;
        }
        if ("S_TEXT/ASS".equals(zzagyVar.zzc) || "S_TEXT/SSA".equals(zzagyVar.zzc)) {
            zzv(zzacvVar, zzd, i);
            int i4 = this.zzad;
            zzu();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(zzagyVar.zzc)) {
            zzv(zzacvVar, zze, i);
            int i5 = this.zzad;
            zzu();
            return i5;
        }
        if (zzagyVar.zzV) {
            zzagyVar.zzZ.getClass();
            zzef zzefVar = new zzef(i);
            if (zzacvVar.zzh(zzefVar.zzi(), 0, i, true)) {
                zzacvVar.zzl();
                if (zzact.zza(zzefVar.zzr()) == 1 && zzefVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzefVar.zzm(bArr, 0, 10);
                    zzefVar.zzh(0);
                    int iZzc = zzact.zzc(bArr);
                    if (zzefVar.zzd() >= iZzc + 4) {
                        zzefVar.zzk(iZzc);
                        if (zzact.zza(zzefVar.zzB()) == 2) {
                            zzs zzsVarZza = zzagyVar.zzZ.zza();
                            zzsVarZza.zzm("audio/vnd.dts.hd");
                            zzagyVar.zzZ = zzsVarZza.zzM();
                        }
                    }
                }
            }
            zzagyVar.zzY.zzu(zzagyVar.zzZ);
            zzagyVar.zzV = false;
            zzA();
        }
        zzaeb zzaebVar = zzagyVar.zzY;
        if (!this.zzaf) {
            if (zzagyVar.zzh) {
                this.zzY &= -1073741825;
                if (!this.zzag) {
                    zzef zzefVar2 = this.zzo;
                    zzacvVar.zzc(zzefVar2.zzi(), 0, 1);
                    this.zzac++;
                    if ((zzefVar2.zzi()[0] & 128) == 128) {
                        throw zzas.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzaj = zzefVar2.zzi()[0];
                    this.zzag = true;
                }
                byte b = this.zzaj;
                if ((b & 1) == 1) {
                    int i6 = b & 2;
                    this.zzY |= 1073741824;
                    if (!this.zzak) {
                        zzef zzefVar3 = this.zzt;
                        zzacvVar.zzc(zzefVar3.zzi(), 0, 8);
                        this.zzac += 8;
                        this.zzak = true;
                        zzef zzefVar4 = this.zzo;
                        zzefVar4.zzi()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                        zzefVar4.zzh(0);
                        zzaebVar.zzw(zzefVar4, 1, 1);
                        this.zzad++;
                        zzefVar3.zzh(0);
                        zzaebVar.zzw(zzefVar3, 8, 1);
                        this.zzad += 8;
                    }
                    if (i6 == 2) {
                        if (!this.zzah) {
                            zzef zzefVar5 = this.zzo;
                            zzacvVar.zzc(zzefVar5.zzi(), 0, 1);
                            this.zzac++;
                            zzefVar5.zzh(0);
                            this.zzai = zzefVar5.zzs();
                            this.zzah = true;
                        }
                        int i7 = this.zzai * 4;
                        zzef zzefVar6 = this.zzo;
                        zzefVar6.zza(i7);
                        zzacvVar.zzc(zzefVar6.zzi(), 0, i7);
                        this.zzac += i7;
                        int i8 = (this.zzai >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.zzw = ByteBuffer.allocate(i9);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.zzai;
                            if (i10 >= i2) {
                                break;
                            }
                            int iZzH = zzefVar6.zzH();
                            int i12 = iZzH - i11;
                            if (i10 % 2 == 0) {
                                this.zzw.putShort((short) i12);
                            } else {
                                this.zzw.putInt(i12);
                            }
                            i10++;
                            i11 = iZzH;
                        }
                        int i13 = (i - this.zzac) - i11;
                        if ((i2 & 1) == 1) {
                            this.zzw.putInt(i13);
                        } else {
                            this.zzw.putShort((short) i13);
                            this.zzw.putInt(0);
                        }
                        zzef zzefVar7 = this.zzu;
                        zzefVar7.zzb(this.zzw.array(), i9);
                        zzaebVar.zzw(zzefVar7, i9, 1);
                        this.zzad += i9;
                    }
                }
            } else {
                byte[] bArr2 = zzagyVar.zzi;
                if (bArr2 != null) {
                    this.zzr.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzagyVar.zzc) ? zzagyVar.zzg > 0 : z) {
                this.zzY |= 268435456;
                this.zzv.zza(0);
                int iZze = (this.zzr.zze() + i) - this.zzac;
                zzef zzefVar8 = this.zzo;
                zzefVar8.zza(4);
                zzefVar8.zzi()[0] = (byte) ((iZze >> 24) & 255);
                zzefVar8.zzi()[1] = (byte) ((iZze >> 16) & 255);
                zzefVar8.zzi()[2] = (byte) ((iZze >> 8) & 255);
                zzefVar8.zzi()[3] = (byte) (iZze & 255);
                zzaebVar.zzw(zzefVar8, 4, 2);
                this.zzad += 4;
            }
            this.zzaf = true;
        }
        zzef zzefVar9 = this.zzr;
        int iZze2 = zzefVar9.zze() + i;
        if (!"V_MPEG4/ISO/AVC".equals(zzagyVar.zzc) && !"V_MPEGH/ISO/HEVC".equals(zzagyVar.zzc)) {
            if (zzagyVar.zzU != null) {
                zzghc.zzh(zzefVar9.zze() == 0);
                zzagyVar.zzU.zzb(zzacvVar);
            }
            while (true) {
                int i14 = this.zzac;
                if (i14 >= iZze2) {
                    break;
                }
                int iZzx = zzx(zzacvVar, zzaebVar, iZze2 - i14);
                this.zzac += iZzx;
                this.zzad += iZzx;
            }
        } else {
            zzef zzefVar10 = this.zzn;
            byte[] bArrZzi = zzefVar10.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i15 = zzagyVar.zzaa;
            int i16 = 4 - i15;
            while (this.zzac < iZze2) {
                int i17 = this.zzae;
                if (i17 == 0) {
                    int iMin = Math.min(i15, zzefVar9.zzd());
                    zzacvVar.zzc(bArrZzi, i16 + iMin, i15 - iMin);
                    if (iMin > 0) {
                        zzefVar9.zzm(bArrZzi, i16, iMin);
                    }
                    this.zzac += i15;
                    zzefVar10.zzh(0);
                    this.zzae = zzefVar10.zzH();
                    zzef zzefVar11 = this.zzm;
                    zzefVar11.zzh(0);
                    zzaebVar.zzz(zzefVar11, 4);
                    this.zzad += 4;
                } else {
                    int iZzx2 = zzx(zzacvVar, zzaebVar, i17);
                    this.zzac += iZzx2;
                    this.zzad += iZzx2;
                    this.zzae -= iZzx2;
                }
            }
        }
        if ("A_VORBIS".equals(zzagyVar.zzc)) {
            zzef zzefVar12 = this.zzp;
            zzefVar12.zzh(0);
            zzaebVar.zzz(zzefVar12, 4);
            this.zzad += 4;
        }
        int i18 = this.zzad;
        zzu();
        return i18;
    }

    private final void zzu() {
        this.zzac = 0;
        this.zzad = 0;
        this.zzae = 0;
        this.zzaf = false;
        this.zzag = false;
        this.zzah = false;
        this.zzai = 0;
        this.zzaj = (byte) 0;
        this.zzak = false;
        this.zzr.zza(0);
    }

    private final void zzv(zzacv zzacvVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        zzef zzefVar = this.zzs;
        if (zzefVar.zzj() < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2 + i);
            zzefVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzefVar.zzi(), 0, length);
        }
        zzacvVar.zzc(zzefVar.zzi(), length, i);
        zzefVar.zzh(0);
        zzefVar.zzf(i2);
    }

    private static byte[] zzw(long j, String str, long j2) {
        zzghc.zza(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str3 = zzeo.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzx(zzacv zzacvVar, zzaeb zzaebVar, int i) throws IOException {
        zzef zzefVar = this.zzr;
        int iZzd = zzefVar.zzd();
        if (iZzd <= 0) {
            return zzaebVar.zzy(zzacvVar, i, false);
        }
        int iMin = Math.min(i, iZzd);
        zzaebVar.zzz(zzefVar, iMin);
        return iMin;
    }

    private final long zzy(long j) throws zzas {
        long j2 = this.zzz;
        if (j2 != -9223372036854775807L) {
            return zzeo.zzt(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw zzas.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static int[] zzz(@Nullable int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @CallSuper
    public final void zza(int i, long j, long j2) throws zzas {
        zzacx zzacxVar = this.zzal;
        zzacxVar.getClass();
        if (i == 160) {
            this.zzaa = false;
            this.zzab = 0L;
            return;
        }
        if (i == 174) {
            zzagy zzagyVar = new zzagy();
            this.zzE = zzagyVar;
            zzagyVar.zza = this.zzC;
            return;
        }
        if (i == 187) {
            this.zzO = false;
            return;
        }
        if (i == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i == 20533) {
            zzp(i);
            this.zzE.zzh = true;
            return;
        }
        if (i == 21968) {
            zzp(i);
            this.zzE.zzy = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzy;
            if (j3 != -1 && j3 != j) {
                throw zzas.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j;
            this.zzx = j2;
            return;
        }
        if (i == 475249515) {
            this.zzM = new zzdt(32);
            this.zzN = new zzdt(32);
        } else if (i == 524531317 && !this.zzF) {
            if (this.zzj && this.zzJ != -1) {
                this.zzI = true;
            } else {
                zzacxVar.zzw(new zzadu(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d1  */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(int r21) throws com.google.android.gms.internal.ads.zzas {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagz.zzb(int):void");
    }

    @CallSuper
    public final void zzc(int i, long j) throws zzas {
        boolean z;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw zzas.zzb(sb.toString(), null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw zzas.zzb(sb2.toString(), null);
        }
        switch (i) {
            case 131:
                zzp(i);
                this.zzE.zze = (int) j;
                return;
            case 136:
                z = j == 1;
                zzp(i);
                this.zzE.zzX = z;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.zzS = zzy(j);
                return;
            case 159:
                zzp(i);
                this.zzE.zzP = (int) j;
                return;
            case 176:
                zzp(i);
                this.zzE.zzm = (int) j;
                return;
            case 179:
                zzq(i);
                this.zzM.zza(zzy(j));
                return;
            case 186:
                zzp(i);
                this.zzE.zzn = (int) j;
                return;
            case 215:
                zzp(i);
                this.zzE.zzd = (int) j;
                return;
            case 231:
                this.zzL = zzy(j);
                return;
            case 238:
                this.zzZ = (int) j;
                return;
            case 241:
                if (this.zzO) {
                    return;
                }
                zzq(i);
                this.zzN.zza(j);
                this.zzO = true;
                return;
            case 251:
                this.zzaa = true;
                return;
            case 16871:
                zzp(i);
                this.zzE.zzd((int) j);
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw zzas.zzb(sb3.toString(), null);
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw zzas.zzb(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw zzas.zzb(sb5.toString(), null);
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw zzas.zzb(sb6.toString(), null);
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw zzas.zzb(sb7.toString(), null);
            case 21420:
                this.zzH = j + this.zzy;
                return;
            case 21432:
                int i2 = (int) j;
                zzp(i);
                if (i2 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i2 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i2 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzp(i);
                this.zzE.zzp = (int) j;
                return;
            case 21682:
                zzp(i);
                this.zzE.zzr = (int) j;
                return;
            case 21690:
                zzp(i);
                this.zzE.zzq = (int) j;
                return;
            case 21930:
                z = j == 1;
                zzp(i);
                this.zzE.zzW = z;
                return;
            case 21938:
                zzp(i);
                zzagy zzagyVar = this.zzE;
                zzagyVar.zzy = true;
                zzagyVar.zzo = (int) j;
                return;
            case 21998:
                zzp(i);
                this.zzE.zzg = (int) j;
                return;
            case 22186:
                zzp(i);
                this.zzE.zzS = j;
                return;
            case 22203:
                zzp(i);
                this.zzE.zzT = j;
                return;
            case 25188:
                zzp(i);
                this.zzE.zzQ = (int) j;
                return;
            case 30114:
                this.zzab = j;
                return;
            case 30321:
                int i3 = (int) j;
                zzp(i);
                if (i3 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i3 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzp(i);
                this.zzE.zzf = (int) j;
                return;
            case 2807729:
                this.zzz = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        zzp(i);
                        if (i4 == 1) {
                            this.zzE.zzB = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.zzE.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzp(i);
                        int iZzc = zzh.zzc((int) j);
                        if (iZzc != -1) {
                            this.zzE.zzA = iZzc;
                            return;
                        }
                        return;
                    case 21947:
                        zzp(i);
                        this.zzE.zzy = true;
                        int iZzb = zzh.zzb((int) j);
                        if (iZzb != -1) {
                            this.zzE.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21948:
                        zzp(i);
                        this.zzE.zzC = (int) j;
                        return;
                    case 21949:
                        zzp(i);
                        this.zzE.zzD = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        return new zzaha().zza(zzacvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        if (this.zzk) {
            zzacxVar = new zzajw(zzacxVar, this.zzl);
        }
        this.zzal = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        int i = 0;
        this.zzP = false;
        while (!this.zzP) {
            if (this.zzam.zzc(zzacvVar)) {
                long jZzn = zzacvVar.zzn();
                if (this.zzI) {
                    this.zzK = jZzn;
                    zzadsVar.zza = this.zzJ;
                    this.zzI = false;
                    return 1;
                }
                if (this.zzF) {
                    long j = this.zzK;
                    if (j != -1) {
                        zzadsVar.zza = j;
                        this.zzK = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzagy zzagyVar = (zzagy) sparseArray.valueAt(i);
                    zzagyVar.zzb();
                    zzaec zzaecVar = zzagyVar.zzU;
                    if (zzaecVar != null) {
                        zzaecVar.zzd(zzagyVar.zzY, zzagyVar.zzj);
                    }
                    i++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    @CallSuper
    public final void zzh(long j, long j2) {
        this.zzL = -9223372036854775807L;
        int i = 0;
        this.zzQ = 0;
        this.zzam.zzb();
        this.zzh.zza();
        zzu();
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                return;
            }
            zzaec zzaecVar = ((zzagy) sparseArray.valueAt(i)).zzU;
            if (zzaecVar != null) {
                zzaecVar.zza();
            }
            i++;
        }
    }

    @CallSuper
    public final void zzj(int i, double d) throws zzas {
        if (i == 181) {
            zzp(i);
            this.zzE.zzR = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzA = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzp(i);
                this.zzE.zzE = (float) d;
                break;
            case 21970:
                zzp(i);
                this.zzE.zzF = (float) d;
                break;
            case 21971:
                zzp(i);
                this.zzE.zzG = (float) d;
                break;
            case 21972:
                zzp(i);
                this.zzE.zzH = (float) d;
                break;
            case 21973:
                zzp(i);
                this.zzE.zzI = (float) d;
                break;
            case 21974:
                zzp(i);
                this.zzE.zzJ = (float) d;
                break;
            case 21975:
                zzp(i);
                this.zzE.zzK = (float) d;
                break;
            case 21976:
                zzp(i);
                this.zzE.zzL = (float) d;
                break;
            case 21977:
                zzp(i);
                this.zzE.zzM = (float) d;
                break;
            case 21978:
                zzp(i);
                this.zzE.zzN = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzp(i);
                        this.zzE.zzt = (float) d;
                        break;
                    case 30324:
                        zzp(i);
                        this.zzE.zzu = (float) d;
                        break;
                    case 30325:
                        zzp(i);
                        this.zzE.zzv = (float) d;
                        break;
                }
        }
    }

    @CallSuper
    public final void zzk(int i, String str) throws zzas {
        if (i == 134) {
            zzp(i);
            this.zzE.zzc = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                zzp(i);
                this.zzE.zzb = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                zzp(i);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw zzas.zzb(sb.toString(), null);
    }

    @CallSuper
    public final void zzl(int i, int i2, zzacv zzacvVar) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = i;
        int i13 = 1;
        int i14 = 0;
        if (i12 != 161 && i12 != 163) {
            if (i12 == 165) {
                if (this.zzQ != 2) {
                    return;
                }
                zzagy zzagyVar = (zzagy) this.zzi.get(this.zzW);
                if (this.zzZ != 4 || !"V_VP9".equals(zzagyVar.zzc)) {
                    zzacvVar.zzf(i2);
                    return;
                }
                zzef zzefVar = this.zzv;
                zzefVar.zza(i2);
                zzacvVar.zzc(zzefVar.zzi(), 0, i2);
                return;
            }
            if (i12 == 16877) {
                zzp(i);
                zzagy zzagyVar2 = this.zzE;
                if (zzagyVar2.zzc() != 1685485123 && zzagyVar2.zzc() != 1685480259) {
                    zzacvVar.zzf(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                zzagyVar2.zzO = bArr;
                zzacvVar.zzc(bArr, 0, i2);
                return;
            }
            if (i12 == 16981) {
                zzp(i);
                byte[] bArr2 = new byte[i2];
                this.zzE.zzi = bArr2;
                zzacvVar.zzc(bArr2, 0, i2);
                return;
            }
            if (i12 == 18402) {
                byte[] bArr3 = new byte[i2];
                zzacvVar.zzc(bArr3, 0, i2);
                zzp(i);
                this.zzE.zzj = new zzaea(1, bArr3, 0, 0);
                return;
            }
            if (i12 == 21419) {
                zzef zzefVar2 = this.zzq;
                Arrays.fill(zzefVar2.zzi(), (byte) 0);
                zzacvVar.zzc(zzefVar2.zzi(), 4 - i2, i2);
                zzefVar2.zzh(0);
                this.zzG = (int) zzefVar2.zzz();
                return;
            }
            if (i12 == 25506) {
                zzp(i);
                byte[] bArr4 = new byte[i2];
                this.zzE.zzk = bArr4;
                zzacvVar.zzc(bArr4, 0, i2);
                return;
            }
            if (i12 != 30322) {
                StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 15);
                sb.append("Unexpected id: ");
                sb.append(i12);
                throw zzas.zzb(sb.toString(), null);
            }
            zzp(i);
            byte[] bArr5 = new byte[i2];
            this.zzE.zzw = bArr5;
            zzacvVar.zzc(bArr5, 0, i2);
            return;
        }
        int i15 = 8;
        if (this.zzQ == 0) {
            zzahb zzahbVar = this.zzh;
            this.zzW = (int) zzahbVar.zzb(zzacvVar, false, true, 8);
            this.zzX = zzahbVar.zzc();
            this.zzS = -9223372036854775807L;
            this.zzQ = 1;
            this.zzo.zza(0);
        }
        zzagy zzagyVar3 = (zzagy) this.zzi.get(this.zzW);
        if (zzagyVar3 == null) {
            zzacvVar.zzf(i2 - this.zzX);
            this.zzQ = 0;
            return;
        }
        zzagyVar3.zzb();
        if (this.zzQ == 1) {
            zzs(zzacvVar, 3);
            zzef zzefVar3 = this.zzo;
            int i16 = (zzefVar3.zzi()[2] & 6) >> 1;
            if (i16 == 0) {
                this.zzU = 1;
                int[] iArrZzz = zzz(this.zzV, 1);
                this.zzV = iArrZzz;
                iArrZzz[0] = (i2 - this.zzX) - 3;
            } else {
                zzs(zzacvVar, 4);
                int i17 = (zzefVar3.zzi()[3] & 255) + 1;
                this.zzU = i17;
                int[] iArrZzz2 = zzz(this.zzV, i17);
                this.zzV = iArrZzz2;
                if (i16 == 2) {
                    int i18 = (i2 - this.zzX) - 4;
                    int i19 = this.zzU;
                    Arrays.fill(iArrZzz2, 0, i19, i18 / i19);
                } else {
                    if (i16 != 1) {
                        if (i16 != 3) {
                            throw zzas.zzb("Unexpected lacing value: 2", null);
                        }
                        int i20 = 0;
                        int i21 = 0;
                        int i22 = 4;
                        while (true) {
                            int i23 = this.zzU - 1;
                            if (i20 >= i23) {
                                i3 = i13;
                                i5 = i14;
                                this.zzV[i23] = ((i2 - this.zzX) - i22) - i21;
                                break;
                            }
                            this.zzV[i20] = i14;
                            int i24 = i22 + 1;
                            zzs(zzacvVar, i24);
                            if (zzefVar3.zzi()[i22] == 0) {
                                throw zzas.zzb("No valid varint length mask found", null);
                            }
                            int i25 = i13;
                            int i26 = i14;
                            while (true) {
                                if (i26 >= i15) {
                                    i6 = i14;
                                    i7 = i15;
                                    j = 0;
                                    break;
                                }
                                i7 = i15;
                                int i27 = i25 << (7 - i26);
                                if ((zzefVar3.zzi()[i22] & i27) != 0) {
                                    i24 += i26;
                                    zzs(zzacvVar, i24);
                                    i6 = i14;
                                    j = zzefVar3.zzi()[i22] & 255 & (~i27);
                                    int i28 = i22 + 1;
                                    while (i28 < i24) {
                                        j = (j << i7) | (zzefVar3.zzi()[i28] & 255);
                                        i28++;
                                        i26 = i26;
                                    }
                                    int i29 = i26;
                                    if (i20 > 0) {
                                        j -= (1 << ((i29 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i26++;
                                    i15 = i7;
                                }
                            }
                            i22 = i24;
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.zzV;
                            int i30 = (int) j;
                            if (i20 != 0) {
                                i30 += iArr[i20 - 1];
                            }
                            iArr[i20] = i30;
                            i21 += i30;
                            i20++;
                            i13 = i25;
                            i14 = i6;
                            i15 = i7;
                        }
                        throw zzas.zzb("EBML lacing sample size out of range.", null);
                    }
                    int i31 = 0;
                    int i32 = 0;
                    int i33 = 4;
                    while (true) {
                        i8 = this.zzU - 1;
                        if (i31 >= i8) {
                            break;
                        }
                        this.zzV[i31] = 0;
                        while (true) {
                            i9 = i33 + 1;
                            zzs(zzacvVar, i9);
                            int i34 = zzefVar3.zzi()[i33] & 255;
                            int[] iArr2 = this.zzV;
                            i10 = iArr2[i31] + i34;
                            iArr2[i31] = i10;
                            if (i34 != 255) {
                                break;
                            } else {
                                i33 = i9;
                            }
                        }
                        i32 += i10;
                        i31++;
                        i33 = i9;
                    }
                    this.zzV[i8] = ((i2 - this.zzX) - i33) - i32;
                }
            }
            i3 = 1;
            i5 = 0;
            this.zzR = this.zzL + zzy((zzefVar3.zzi()[i5] << 8) | (zzefVar3.zzi()[i3] & 255));
            if (zzagyVar3.zze == 2) {
                i11 = i3;
            } else if (i12 == 163) {
                i11 = (zzefVar3.zzi()[2] & 128) == 128 ? i3 : i5;
                i12 = 163;
            } else {
                i11 = i5;
            }
            this.zzY = i11;
            this.zzQ = 2;
            this.zzT = i5;
            i4 = 163;
        } else {
            i3 = 1;
            i4 = 163;
        }
        if (i12 == i4) {
            while (true) {
                int i35 = this.zzT;
                if (i35 >= this.zzU) {
                    this.zzQ = 0;
                    return;
                }
                int iZzt = zzt(zzacvVar, zzagyVar3, this.zzV[i35], false);
                zzagy zzagyVar4 = zzagyVar3;
                zzr(zzagyVar4, this.zzR + ((this.zzT * zzagyVar3.zzf) / 1000), this.zzY, iZzt, 0);
                this.zzT++;
                zzagyVar3 = zzagyVar4;
            }
        } else {
            while (true) {
                int i36 = this.zzT;
                if (i36 >= this.zzU) {
                    return;
                }
                int[] iArr3 = this.zzV;
                boolean z = i3;
                iArr3[i36] = zzt(zzacvVar, zzagyVar3, iArr3[i36], z);
                this.zzT += z ? 1 : 0;
            }
        }
    }

    public zzagz(zzagu zzaguVar, int i, zzajt zzajtVar) {
        this.zzy = -1L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzJ = -1L;
        this.zzK = -1L;
        this.zzL = -9223372036854775807L;
        this.zzam = zzaguVar;
        zzaguVar.zza(new zzagw(this, null));
        this.zzl = zzajtVar;
        this.zzj = 1 == ((i & 1) ^ 1);
        this.zzk = (i & 2) == 0;
        this.zzh = new zzahb();
        this.zzi = new SparseArray();
        this.zzo = new zzef(4);
        this.zzp = new zzef(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzef(4);
        this.zzm = new zzef(zzfl.zza);
        this.zzn = new zzef(4);
        this.zzr = new zzef();
        this.zzs = new zzef();
        this.zzt = new zzef(8);
        this.zzu = new zzef();
        this.zzv = new zzef();
        this.zzV = new int[1];
        this.zzD = true;
    }

    public zzagz(zzajt zzajtVar, int i) {
        this(new zzagu(), 0, zzajtVar);
    }
}
