package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderDataSpace;
import androidx.core.util.Supplier;
import java.util.Objects;

/* loaded from: classes2.dex */
public class VideoEncoderConfigVideoProfileResolver implements Supplier<VideoEncoderConfig> {

    /* renamed from: a, reason: collision with root package name */
    public final String f621a;
    public final Timebase b;
    public final VideoSpec c;
    public final Size d;
    public final EncoderProfilesProxy.VideoProfileProxy e;
    public final DynamicRange f;
    public final Range g;

    public VideoEncoderConfigVideoProfileResolver(String str, Timebase timebase, VideoSpec videoSpec, Size size, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, DynamicRange dynamicRange, Range range) {
        this.f621a = str;
        this.b = timebase;
        this.c = videoSpec;
        this.d = size;
        this.e = videoProfileProxy;
        this.f = dynamicRange;
        this.g = range;
    }

    @Override // androidx.core.util.Supplier
    public final Object get() {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.e;
        int iF = videoProfileProxy.f();
        Range range = SurfaceRequest.p;
        Range range2 = this.g;
        int iIntValue = !Objects.equals(range2, range) ? ((Integer) range2.clamp(Integer.valueOf(iF))).intValue() : iF;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(iF);
        boolean zEquals = Objects.equals(range2, range);
        Object obj = range2;
        if (!zEquals) {
            obj = "<UNSPECIFIED>";
        }
        Logger.a("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", numValueOf, numValueOf2, obj));
        Logger.a("VidEncVdPrflRslvr", "Resolved VIDEO frame rate: " + iIntValue + "fps");
        Range rangeC = this.c.c();
        Logger.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int iC = videoProfileProxy.c();
        int i = this.f.b;
        int iB = videoProfileProxy.b();
        int iF2 = videoProfileProxy.f();
        Size size = this.d;
        int iD = VideoConfigUtil.d(iC, i, iB, iIntValue, iF2, size.getWidth(), videoProfileProxy.k(), size.getHeight(), videoProfileProxy.h(), rangeC);
        int iJ = videoProfileProxy.j();
        String str = this.f621a;
        VideoEncoderDataSpace videoEncoderDataSpaceA = VideoConfigUtil.a(iJ, str);
        VideoEncoderConfig.Builder builderD = VideoEncoderConfig.d();
        builderD.f(str);
        builderD.e(this.b);
        builderD.h(size);
        builderD.b(iD);
        builderD.d(iIntValue);
        builderD.g(iJ);
        builderD.c(videoEncoderDataSpaceA);
        return builderD.a();
    }
}
