package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzst {
    public final String zza;
    public final String zzb;
    public final String zzc;

    @Nullable
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    @VisibleForTesting
    public zzst(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = z7;
        this.zzi = zzar.zzb(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzst zza(java.lang.String r12, java.lang.String r13, java.lang.String r14, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            com.google.android.gms.internal.ads.zzst r0 = new com.google.android.gms.internal.ads.zzst
            r1 = 1
            r2 = 0
            if (r15 == 0) goto L10
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L10
            r8 = r1
            goto L11
        L10:
            r8 = r2
        L11:
            if (r15 == 0) goto L1d
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L1d
            r9 = r1
            goto L1e
        L1d:
            r9 = r2
        L1e:
            if (r20 != 0) goto L2a
            if (r15 == 0) goto L2c
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L2c
        L2a:
            r10 = r1
            goto L2d
        L2c:
            r10 = r2
        L2d:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 35
            if (r3 < r4) goto L67
            if (r15 == 0) goto L67
            java.lang.String r3 = "detached-surface"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L67
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Xiaomi"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "OPPO"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "realme"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "motorola"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "LENOVO"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L73
        L67:
            r1 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r2
            r2 = r13
            goto L7e
        L73:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r1
            r1 = r12
        L7e:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzst.zza(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzst");
    }

    private final boolean zzj(zzu zzuVar) {
        String str = this.zzb;
        return str.equals(zzuVar.zzo) || str.equals(zztl.zzg(zzuVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r1.equals("video/hevc") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r1.equals("video/av01") != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzk(com.google.android.gms.internal.ads.zzu r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzst.zzk(com.google.android.gms.internal.ads.zzu, boolean):boolean");
    }

    private final boolean zzl(zzu zzuVar) {
        return (Objects.equals(zzuVar.zzo, "audio/flac") && zzuVar.zzI == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void zzm(String str) {
        String str2 = zzeo.zza;
        String str3 = this.zzb;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.zza;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 14 + 2 + length + 3 + length2 + 1);
        androidx.constraintlayout.core.state.a.B(sb, "NoSupport [", str, "] [", str4);
        androidx.constraintlayout.core.state.a.B(sb, ", ", str3, "] [", str2);
        sb.append("]");
        zzds.zza("MediaCodecInfo", sb.toString());
    }

    private static boolean zzn(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointZzo = zzo(videoCapabilities, i, i2);
        int i3 = pointZzo.x;
        int i4 = pointZzo.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    private static Point zzo(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzeo.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean zzc(zzu zzuVar) throws zztd {
        int i;
        if (!zzj(zzuVar) || !zzk(zzuVar, true) || !zzl(zzuVar)) {
            return false;
        }
        if (this.zzi) {
            int i2 = zzuVar.zzv;
            if (i2 <= 0 || (i = zzuVar.zzw) <= 0) {
                return true;
            }
            return zzg(i2, i, zzuVar.zzz);
        }
        int i3 = zzuVar.zzH;
        if (i3 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzm("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzm("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i3)) {
                zzm(YU.a.n(new StringBuilder(String.valueOf(i3).length() + 20), "sampleRate.support, ", i3));
                return false;
            }
        }
        int i4 = zzuVar.zzG;
        if (i4 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzm("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzm("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                StringBuilder sb = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.e(String.valueOf(maxInputChannelCount).length() + str.length() + 32 + 4, 1, String.valueOf(i5)));
                sb.append("AssumedMaxChannelAdjustment: ");
                sb.append(str);
                sb.append(", [");
                sb.append(maxInputChannelCount);
                sb.append(" to ");
                sb.append(i5);
                sb.append("]");
                zzds.zzc("MediaCodecInfo", sb.toString());
                maxInputChannelCount = i5;
            }
            if (maxInputChannelCount < i4) {
                zzm(YU.a.n(new StringBuilder(String.valueOf(i4).length() + 22), "channelCount.support, ", i4));
                return false;
            }
        }
        return true;
    }

    public final boolean zzd(zzu zzuVar) {
        return zzj(zzuVar) && zzk(zzuVar, false) && zzl(zzuVar);
    }

    public final boolean zze(zzu zzuVar) {
        if (this.zzi) {
            return this.zze;
        }
        int i = zztl.zza;
        Pair pairZze = zzdc.zze(zzuVar);
        return pairZze != null && ((Integer) pairZze.first).intValue() == 42;
    }

    public final zzhs zzf(zzu zzuVar, zzu zzuVar2) {
        zzu zzuVar3;
        zzu zzuVar4;
        int i;
        int i2 = true != Objects.equals(zzuVar.zzo, zzuVar2.zzo) ? 8 : 0;
        if (this.zzi) {
            if (zzuVar.zzA != zzuVar2.zzA) {
                i2 |= 1024;
            }
            boolean z = (zzuVar.zzv == zzuVar2.zzv && zzuVar.zzw == zzuVar2.zzw) ? false : true;
            if (!this.zze && z) {
                i2 |= 512;
            }
            zzh zzhVar = zzuVar.zzE;
            if ((!zzh.zza(zzhVar) || !zzh.zza(zzuVar2.zzE)) && !Objects.equals(zzhVar, zzuVar2.zzE)) {
                i2 |= 2048;
            }
            String str = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzuVar.zzd(zzuVar2)) {
                i2 |= 2;
            }
            int i3 = zzuVar.zzx;
            if (i3 != -1 && (i = zzuVar.zzy) != -1 && i3 == zzuVar2.zzx && i == zzuVar2.zzy && z) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzhs(str, zzuVar, zzuVar2, true != zzuVar.zzd(zzuVar2) ? 2 : 3, 0);
            }
            zzuVar3 = zzuVar;
            zzuVar4 = zzuVar2;
        } else {
            zzuVar3 = zzuVar;
            zzuVar4 = zzuVar2;
            if (zzuVar3.zzG != zzuVar4.zzG) {
                i2 |= 4096;
            }
            if (zzuVar3.zzH != zzuVar4.zzH) {
                i2 |= 8192;
            }
            if (zzuVar3.zzI != zzuVar4.zzI) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                int i4 = zztl.zza;
                Pair pairZze = zzdc.zze(zzuVar3);
                Pair pairZze2 = zzdc.zze(zzuVar4);
                if (pairZze != null && pairZze2 != null) {
                    int iIntValue = ((Integer) pairZze.first).intValue();
                    int iIntValue2 = ((Integer) pairZze2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zzhs(this.zza, zzuVar3, zzuVar4, 3, 0);
                    }
                }
            }
            if (!zzuVar3.zzd(zzuVar4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzhs(this.zza, zzuVar3, zzuVar4, 1, 0);
            }
        }
        return new zzhs(this.zza, zzuVar3, zzuVar4, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzg(int r11, int r12, double r13) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzst.zzg(int, int, double):boolean");
    }

    public final float zzh(int i, int i2) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f = this.zzl;
        if (f != -3.4028235E38f && this.zzj == i && this.zzk == i2) {
            return f;
        }
        float f2 = 1024.0f;
        if (!zzg(i, i2, 1024.0d)) {
            float f3 = BitmapDescriptorFactory.HUE_RED;
            while (true) {
                float f4 = f2 - f3;
                if (Math.abs(f4) <= 5.0f) {
                    break;
                }
                float f5 = (f4 / 2.0f) + f3;
                boolean zZzg = zzg(i, i2, f5);
                if (true == zZzg) {
                    f3 = f5;
                }
                if (true != zZzg) {
                    f2 = f5;
                }
            }
            f2 = f3;
        }
        this.zzl = f2;
        this.zzj = i;
        this.zzk = i2;
        return f2;
    }

    @Nullable
    public final Point zzi(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzo(videoCapabilities, i, i2);
    }
}
