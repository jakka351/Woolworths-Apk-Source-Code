package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CaptureCallbacks;
import androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks;
import androidx.camera.camera2.internal.CameraDeviceStateCallbacks;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.internal.compat.workaround.PreviewPixelHDRnet;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class Camera2SessionOptionUnpacker implements SessionConfig.OptionUnpacker {

    /* renamed from: a, reason: collision with root package name */
    public static final Camera2SessionOptionUnpacker f256a = new Camera2SessionOptionUnpacker();

    @Override // androidx.camera.core.impl.SessionConfig.OptionUnpacker
    public final void a(Size size, UseCaseConfig useCaseConfig, SessionConfig.Builder builder) {
        SessionConfig sessionConfigX = useCaseConfig.x();
        Config config = OptionsBundle.I;
        int i = SessionConfig.a().g.c;
        if (sessionConfigX != null) {
            i = sessionConfigX.g.c;
            Iterator it = sessionConfigX.c.iterator();
            while (it.hasNext()) {
                builder.d((CameraDevice.StateCallback) it.next());
            }
            Iterator it2 = sessionConfigX.d.iterator();
            while (it2.hasNext()) {
                builder.h((CameraCaptureSession.StateCallback) it2.next());
            }
            builder.b(sessionConfigX.g.e);
            config = sessionConfigX.g.b;
        }
        builder.q(config);
        if (useCaseConfig instanceof PreviewConfig) {
            Rational rational = PreviewPixelHDRnet.f359a;
            if (((PreviewPixelHDRnetQuirk) DeviceQuirks.f327a.b(PreviewPixelHDRnetQuirk.class)) != null && !PreviewPixelHDRnet.f359a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
                builder2.c(CaptureRequest.TONEMAP_MODE, 2);
                builder.e(builder2.a());
            }
        }
        builder.u(((Integer) useCaseConfig.c(Camera2ImplConfig.H, Integer.valueOf(i))).intValue());
        builder.d((CameraDevice.StateCallback) useCaseConfig.c(Camera2ImplConfig.J, new CameraDeviceStateCallbacks.NoOpDeviceStateCallback()));
        builder.h((CameraCaptureSession.StateCallback) useCaseConfig.c(Camera2ImplConfig.K, new CameraCaptureSessionStateCallbacks.NoOpSessionStateCallback()));
        builder.c(new CaptureCallbackContainer((CameraCaptureSession.CaptureCallback) useCaseConfig.c(Camera2ImplConfig.L, new Camera2CaptureCallbacks.NoOpSessionCaptureCallback())));
        builder.v(useCaseConfig.o());
        builder.t(useCaseConfig.p());
        MutableOptionsBundle mutableOptionsBundleV = MutableOptionsBundle.V();
        Config.Option option = Camera2ImplConfig.M;
        mutableOptionsBundleV.G(option, (String) useCaseConfig.c(option, null));
        Config.Option option2 = Camera2ImplConfig.I;
        Long l = (Long) useCaseConfig.c(option2, -1L);
        l.getClass();
        mutableOptionsBundleV.G(option2, l);
        builder.e(mutableOptionsBundleV);
        builder.e(CaptureRequestOptions.Builder.c(useCaseConfig).a());
    }
}
