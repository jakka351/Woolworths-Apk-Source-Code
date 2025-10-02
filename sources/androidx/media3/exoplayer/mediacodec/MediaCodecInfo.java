package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class MediaCodecInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f3106a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public MediaCodecInfo(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f3106a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = MimeTypes.l(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(Util.e(i, widthAlignment) * widthAlignment, Util.e(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.exoplayer.mediacodec.MediaCodecInfo i(java.lang.String r11, java.lang.String r12, java.lang.String r13, android.media.MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17, boolean r18) {
        /*
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo r0 = new androidx.media3.exoplayer.mediacodec.MediaCodecInfo
            r1 = 0
            r2 = 1
            if (r14 == 0) goto L39
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L39
            int r3 = androidx.media3.common.util.Util.f2928a
            r4 = 22
            if (r3 > r4) goto L37
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L26
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L37
        L26:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L39
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L37
            goto L39
        L37:
            r8 = r2
            goto L3a
        L39:
            r8 = r1
        L3a:
            if (r14 == 0) goto L42
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r14.isFeatureSupported(r3)
        L42:
            if (r18 != 0) goto L51
            if (r14 == 0) goto L4f
            java.lang.String r3 = "secure-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L4f
            goto L51
        L4f:
            r9 = r1
            goto L52
        L51:
            r9 = r2
        L52:
            int r3 = androidx.media3.common.util.Util.f2928a
            r4 = 35
            if (r3 < r4) goto L80
            if (r14 == 0) goto L80
            java.lang.String r3 = "detached-surface"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L80
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Xiaomi"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L80
            java.lang.String r4 = "OPPO"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L75
            goto L80
        L75:
            r10 = r2
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2 = r12
            goto L8a
        L80:
            r10 = r1
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r1 = r11
        L8a:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecInfo.i(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):androidx.media3.exoplayer.mediacodec.MediaCodecInfo");
    }

    public final DecoderReuseEvaluation b(Format format, Format format2) {
        Format format3;
        Format format4;
        String str = format.n;
        ColorInfo colorInfo = format.B;
        String str2 = format2.n;
        ColorInfo colorInfo2 = format2.B;
        int i = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (format.x != format2.x) {
                i |= 1024;
            }
            if (!this.e && (format.u != format2.u || format.v != format2.v)) {
                i |= 512;
            }
            if ((!ColorInfo.e(colorInfo) || !ColorInfo.e(colorInfo2)) && !Objects.equals(colorInfo, colorInfo2)) {
                i |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f3106a) && !format.b(format2)) {
                i |= 2;
            }
            if (i == 0) {
                return new DecoderReuseEvaluation(this.f3106a, format, format2, format.b(format2) ? 3 : 2, 0);
            }
            format3 = format;
            format4 = format2;
        } else {
            format3 = format;
            format4 = format2;
            if (format3.D != format4.D) {
                i |= 4096;
            }
            if (format3.E != format4.E) {
                i |= 8192;
            }
            if (format3.F != format4.F) {
                i |= 16384;
            }
            String str3 = this.b;
            if (i == 0 && "audio/mp4a-latm".equals(str3)) {
                Pair pairD = MediaCodecUtil.d(format3);
                Pair pairD2 = MediaCodecUtil.d(format4);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new DecoderReuseEvaluation(this.f3106a, format3, format4, 3, 0);
                    }
                }
            }
            if (!format3.b(format4)) {
                i |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i |= 2;
            }
            if (i == 0) {
                return new DecoderReuseEvaluation(this.f3106a, format3, format4, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.f3106a, format3, format4, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6 A[PHI: r2
  0x00c6: PHI (r2v1 android.util.Pair) = (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v13 android.util.Pair) binds: [B:3:0x000f, B:5:0x0017, B:10:0x002b, B:40:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(androidx.media3.common.Format r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecInfo.c(androidx.media3.common.Format, boolean):boolean");
    }

    public final boolean d(Format format) {
        return (Objects.equals(format.n, "audio/flac") && format.F == 22 && Util.f2928a < 34 && this.f3106a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(Format format) {
        int i;
        String str = format.n;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(MediaCodecUtil.b(format))) || !c(format, true) || !d(format)) {
            return false;
        }
        if (this.i) {
            int i2 = format.u;
            if (i2 > 0 && (i = format.v) > 0) {
                return g(format.w, i2, i);
            }
        } else {
            int i3 = format.E;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i3 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    h("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = format.D;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Util.f2928a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    StringBuilder sbU = androidx.camera.core.impl.b.u("AssumedMaxChannelAdjustment: ", maxInputChannelCount, this.f3106a, ", [", " to ");
                    sbU.append(i5);
                    sbU.append("]");
                    Log.g("MediaCodecInfo", sbU.toString());
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    h("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(Format format) {
        if (this.i) {
            return this.e;
        }
        Pair pairD = MediaCodecUtil.d(format);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(double r12, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecInfo.g(double, int, int):boolean");
    }

    public final void h(String str) {
        StringBuilder sbU = YU.a.u("NoSupport [", str, "] [");
        sbU.append(this.f3106a);
        sbU.append(", ");
        sbU.append(this.b);
        sbU.append("] [");
        sbU.append(Util.b);
        sbU.append("]");
        Log.b("MediaCodecInfo", sbU.toString());
    }

    public final String toString() {
        return this.f3106a;
    }
}
