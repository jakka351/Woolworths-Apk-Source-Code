package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderDataSpace;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import androidx.core.util.Supplier;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class VideoEncoderConfigDefaultResolver implements Supplier<VideoEncoderConfig> {
    public static final Size g = new Size(1280, 720);
    public static final Range h = new Range(1, 60);

    /* renamed from: a, reason: collision with root package name */
    public final String f620a;
    public final Timebase b;
    public final VideoSpec c;
    public final Size d;
    public final DynamicRange e;
    public final Range f;

    public VideoEncoderConfigDefaultResolver(String str, Timebase timebase, VideoSpec videoSpec, Size size, DynamicRange dynamicRange, Range range) {
        this.f620a = str;
        this.b = timebase;
        this.c = videoSpec;
        this.d = size;
        this.e = dynamicRange;
        this.f = range;
    }

    @Override // androidx.core.util.Supplier
    public final Object get() {
        Integer num;
        Range range = SurfaceRequest.p;
        Range range2 = this.f;
        int iIntValue = !Objects.equals(range2, range) ? ((Integer) h.clamp((Integer) range2.getUpper())).intValue() : 30;
        Integer numValueOf = Integer.valueOf(iIntValue);
        boolean zEquals = Objects.equals(range2, range);
        Object obj = range2;
        if (!zEquals) {
            obj = "<UNSPECIFIED>";
        }
        Logger.a("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", numValueOf, obj));
        Logger.a("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rate: " + iIntValue + "fps");
        Range rangeC = this.c.c();
        Logger.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        DynamicRange dynamicRange = this.e;
        int i = dynamicRange.b;
        Size size = this.d;
        int width = size.getWidth();
        Size size2 = g;
        int iD = VideoConfigUtil.d(14000000, i, 8, iIntValue, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), rangeC);
        HashMap map = DynamicRangeUtil.e;
        String str = this.f620a;
        Map map2 = (Map) map.get(str);
        int iIntValue2 = (map2 == null || (num = (Integer) map2.get(dynamicRange)) == null) ? -1 : num.intValue();
        VideoEncoderDataSpace videoEncoderDataSpaceA = VideoConfigUtil.a(iIntValue2, str);
        VideoEncoderConfig.Builder builderD = VideoEncoderConfig.d();
        builderD.f(str);
        builderD.e(this.b);
        builderD.h(size);
        builderD.b(iD);
        builderD.d(iIntValue);
        builderD.g(iIntValue2);
        builderD.c(videoEncoderDataSpaceA);
        return builderD.a();
    }
}
