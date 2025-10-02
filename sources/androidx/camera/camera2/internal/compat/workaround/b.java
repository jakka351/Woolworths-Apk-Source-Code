package androidx.camera.camera2.internal.compat.workaround;

import androidx.arch.core.util.Function;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f370a;

    public /* synthetic */ b(int i) {
        this.f370a = i;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f370a) {
            case 0:
                return null;
            case 1:
                ImageCapture.Defaults defaults = ImageCapture.A;
                return null;
            case 2:
                return new DefaultSurfaceProcessor((DynamicRange) obj);
            default:
                try {
                    return VideoEncoderInfoWrapper.k(VideoEncoderInfoImpl.k((VideoEncoderConfig) obj), null);
                } catch (InvalidConfigException e) {
                    Logger.f("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e);
                    return null;
                }
        }
    }
}
