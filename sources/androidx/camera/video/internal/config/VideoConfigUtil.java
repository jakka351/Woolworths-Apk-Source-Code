package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.config.AutoValue_VideoMimeInfo;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderDataSpace;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class VideoConfigUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f619a;
    public static final Timebase b;

    static {
        HashMap map = new HashMap();
        f619a = map;
        b = Timebase.d;
        HashMap map2 = new HashMap();
        VideoEncoderDataSpace videoEncoderDataSpace = VideoEncoderDataSpace.f635a;
        map2.put(1, videoEncoderDataSpace);
        VideoEncoderDataSpace videoEncoderDataSpace2 = VideoEncoderDataSpace.c;
        map2.put(2, videoEncoderDataSpace2);
        VideoEncoderDataSpace videoEncoderDataSpace3 = VideoEncoderDataSpace.d;
        map2.put(4096, videoEncoderDataSpace3);
        map2.put(8192, videoEncoderDataSpace3);
        HashMap map3 = new HashMap();
        map3.put(1, videoEncoderDataSpace);
        map3.put(2, videoEncoderDataSpace2);
        map3.put(4096, videoEncoderDataSpace3);
        map3.put(8192, videoEncoderDataSpace3);
        HashMap map4 = new HashMap();
        map4.put(1, videoEncoderDataSpace);
        map4.put(4, videoEncoderDataSpace2);
        map4.put(4096, videoEncoderDataSpace3);
        map4.put(16384, videoEncoderDataSpace3);
        map4.put(2, videoEncoderDataSpace);
        map4.put(8, videoEncoderDataSpace2);
        map4.put(8192, videoEncoderDataSpace3);
        map4.put(32768, videoEncoderDataSpace3);
        HashMap map5 = new HashMap();
        map5.put(256, videoEncoderDataSpace2);
        map5.put(512, VideoEncoderDataSpace.b);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    public static VideoEncoderDataSpace a(int i, String str) {
        VideoEncoderDataSpace videoEncoderDataSpace;
        Map map = (Map) f619a.get(str);
        if (map != null && (videoEncoderDataSpace = (VideoEncoderDataSpace) map.get(Integer.valueOf(i))) != null) {
            return videoEncoderDataSpace;
        }
        Logger.e("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i)));
        return VideoEncoderDataSpace.f635a;
    }

    public static VideoEncoderConfig b(VideoMimeInfo videoMimeInfo, Timebase timebase, VideoSpec videoSpec, Size size, DynamicRange dynamicRange, Range range) {
        AutoValue_VideoMimeInfo autoValue_VideoMimeInfo = (AutoValue_VideoMimeInfo) videoMimeInfo;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = autoValue_VideoMimeInfo.c;
        return (VideoEncoderConfig) (videoProfileProxy != null ? new VideoEncoderConfigVideoProfileResolver(autoValue_VideoMimeInfo.f617a, timebase, videoSpec, size, videoProfileProxy, dynamicRange, range) : new VideoEncoderConfigDefaultResolver(autoValue_VideoMimeInfo.f617a, timebase, videoSpec, size, dynamicRange, range)).get();
    }

    public static VideoMimeInfo c(MediaSpec mediaSpec, DynamicRange dynamicRange, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy) {
        boolean zB = dynamicRange.b();
        int i = dynamicRange.f400a;
        Preconditions.f("Dynamic range must be a fully specified dynamic range [provided dynamic range: " + dynamicRange + "]", zB);
        String str = "video/avc";
        String str2 = mediaSpec.c() != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
        if (videoValidatedEncoderProfilesProxy == null) {
            videoProfileProxy = null;
        } else {
            Set set = (Set) DynamicRangeUtil.b.get(Integer.valueOf(i));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set set2 = (Set) DynamicRangeUtil.f637a.get(Integer.valueOf(dynamicRange.b));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : videoValidatedEncoderProfilesProxy.d()) {
                if (set.contains(Integer.valueOf(videoProfileProxy.g())) && set2.contains(Integer.valueOf(videoProfileProxy.b()))) {
                    String strI = videoProfileProxy.i();
                    if (str2.equals(strI)) {
                        Logger.a("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + str2 + "]");
                    } else if (mediaSpec.c() == -1) {
                        Logger.a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + str2 + ", dynamic range: " + dynamicRange + "]");
                    }
                    str2 = strI;
                    break;
                }
            }
            videoProfileProxy = null;
        }
        if (videoProfileProxy == null) {
            if (mediaSpec.c() == -1) {
                if (i != 1) {
                    if (i == 3 || i == 4 || i == 5) {
                        str = "video/hevc";
                    } else {
                        if (i != 6) {
                            throw new UnsupportedOperationException("Unsupported dynamic range: " + dynamicRange + "\nNo supported default mime type available.");
                        }
                        str = "video/dolby-vision";
                    }
                }
                str2 = str;
            }
            if (videoValidatedEncoderProfilesProxy == null) {
                Logger.a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + dynamicRange + "]");
            } else {
                Logger.a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + dynamicRange + "]");
            }
        }
        AutoValue_VideoMimeInfo.Builder builder = new AutoValue_VideoMimeInfo.Builder();
        if (str2 == null) {
            throw new NullPointerException("Null mimeType");
        }
        builder.f618a = str2;
        builder.b = -1;
        if (videoProfileProxy != null) {
            builder.c = videoProfileProxy;
        }
        String str3 = builder.f618a == null ? " mimeType" : "";
        if (str3.isEmpty()) {
            return new AutoValue_VideoMimeInfo(builder.f618a, builder.b.intValue(), builder.c);
        }
        throw new IllegalStateException("Missing required properties:".concat(str3));
    }

    public static int d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Range range) {
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        int iDoubleValue = (int) (new Rational(i8, i9).doubleValue() * new Rational(i6, i7).doubleValue() * rational2.doubleValue() * rational.doubleValue() * i);
        String strConcat = Logger.d(3, "VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(iDoubleValue)) : "";
        if (!VideoSpec.b.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            int iIntValue = num.intValue();
            if (Logger.d(3, "VideoConfigUtil")) {
                strConcat = strConcat.concat(String.format("\nClamped to range %s -> %dbps", range, num));
            }
            iDoubleValue = iIntValue;
        }
        Logger.a("VideoConfigUtil", strConcat);
        return iDoubleValue;
    }

    public static VideoEncoderConfig e(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        VideoEncoderConfig.Builder builderD = VideoEncoderConfig.d();
        builderD.f(videoProfileProxy.i());
        builderD.g(videoProfileProxy.j());
        builderD.h(new Size(videoProfileProxy.k(), videoProfileProxy.h()));
        builderD.d(videoProfileProxy.f());
        builderD.b(videoProfileProxy.c());
        builderD.e(b);
        return builderD.a();
    }
}
