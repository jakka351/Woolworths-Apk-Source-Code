package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@SuppressLint
@UnstableApi
/* loaded from: classes2.dex */
public final class MediaCodecUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f3110a = new HashMap();

    public static final class CodecKey {

        /* renamed from: a, reason: collision with root package name */
        public final String f3111a;
        public final boolean b;
        public final boolean c;

        public CodecKey(String str, boolean z, boolean z2) {
            this.f3111a = str;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == CodecKey.class) {
                CodecKey codecKey = (CodecKey) obj;
                if (TextUtils.equals(this.f3111a, codecKey.f3111a) && this.b == codecKey.b && this.c == codecKey.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((androidx.camera.core.impl.b.c(31, 31, this.f3111a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
        }
    }

    public static class DecoderQueryException extends Exception {
    }

    public interface MediaCodecListCompat {
        boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        android.media.MediaCodecInfo b(int i);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    public static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final android.media.MediaCodecInfo b(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean e() {
            return false;
        }
    }

    public static final class MediaCodecListCompatV21 implements MediaCodecListCompat {

        /* renamed from: a, reason: collision with root package name */
        public final int f3112a;
        public android.media.MediaCodecInfo[] b;

        public MediaCodecListCompatV21(boolean z, boolean z2, boolean z3) {
            this.f3112a = (z || z2 || z3) ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final android.media.MediaCodecInfo b(int i) {
            if (this.b == null) {
                this.b = new MediaCodecList(this.f3112a).getCodecInfos();
            }
            return this.b[i];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final int d() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.f3112a).getCodecInfos();
            }
            return this.b.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean e() {
            return true;
        }
    }

    public interface ScoreProvider<T> {
        int b(Object obj);
    }

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Util.f2928a < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((MediaCodecInfo) arrayList.get(0)).f3106a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(MediaCodecInfo.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new f(new d()));
        }
        if (Util.f2928a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((MediaCodecInfo) arrayList.get(0)).f3106a)) {
            return;
        }
        arrayList.add((MediaCodecInfo) arrayList.remove(0));
    }

    public static String b(Format format) {
        Pair pairD;
        String str = format.n;
        String str2 = format.n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairD = d(format)) != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String c(android.media.MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03e4 A[Catch: NumberFormatException -> 0x03f2, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x03f2, blocks: (B:273:0x0396, B:275:0x03a8, B:286:0x03c6, B:297:0x03e4), top: B:433:0x0396 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair d(androidx.media3.common.Format r32) {
        /*
            Method dump skipped, instructions count: 1766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.d(androidx.media3.common.Format):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        try {
            CodecKey codecKey = new CodecKey(str, z, z2);
            HashMap map = f3110a;
            List list = (List) map.get(codecKey);
            if (list != null) {
                return list;
            }
            ArrayList arrayListF = f(codecKey, new MediaCodecListCompatV21(z, z2, str.equals("video/mv-hevc")));
            if (z && arrayListF.isEmpty() && Util.f2928a <= 23) {
                arrayListF = f(codecKey, new MediaCodecListCompatV16());
                if (!arrayListF.isEmpty()) {
                    Log.g("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((MediaCodecInfo) arrayListF.get(0)).f3106a);
                }
            }
            a(str, arrayListF);
            ImmutableList immutableListO = ImmutableList.o(arrayListF);
            map.put(codecKey, immutableListO);
            return immutableListO;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0119 A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #4 {Exception -> 0x0163, blocks: (B:3:0x000a, B:5:0x001f, B:7:0x0029, B:77:0x0138, B:10:0x0035, B:13:0x0040, B:71:0x0111, B:74:0x0119, B:76:0x011f, B:78:0x0140, B:79:0x0161), top: B:92:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0140 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList f(androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey r20, androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat r21) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.f(androidx.media3.exoplayer.mediacodec.MediaCodecUtil$CodecKey, androidx.media3.exoplayer.mediacodec.MediaCodecUtil$MediaCodecListCompat):java.util.ArrayList");
    }

    public static List g(MediaCodecSelector mediaCodecSelector, Format format, boolean z, boolean z2) {
        List listA = mediaCodecSelector.a(format.n, z, z2);
        String strB = b(format);
        List listT = strB == null ? ImmutableList.t() : mediaCodecSelector.a(strB, z, z2);
        ImmutableList.Builder builderM = ImmutableList.m();
        builderM.f(listA);
        builderM.f(listT);
        return builderM.j();
    }

    public static boolean h(android.media.MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z && str.endsWith(".secure")) {
            return false;
        }
        int i = Util.f2928a;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean i(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        if (Util.f2928a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (MimeTypes.i(str)) {
            return true;
        }
        String strB = Ascii.b(mediaCodecInfo.getName());
        if (strB.startsWith("arc.")) {
            return false;
        }
        if (strB.startsWith("omx.google.") || strB.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strB.startsWith("omx.sec.") && strB.contains(".sw.")) || strB.equals("omx.qcom.video.decoder.hevcswvdec") || strB.startsWith("c2.android.") || strB.startsWith("c2.google.")) {
            return true;
        }
        return (strB.startsWith("omx.") || strB.startsWith("c2.")) ? false : true;
    }
}
