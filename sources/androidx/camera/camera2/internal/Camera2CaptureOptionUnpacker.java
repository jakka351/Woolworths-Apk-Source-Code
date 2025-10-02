package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CaptureCallbacks;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;

/* loaded from: classes2.dex */
class Camera2CaptureOptionUnpacker implements CaptureConfig.OptionUnpacker {

    /* renamed from: a, reason: collision with root package name */
    public static final Camera2CaptureOptionUnpacker f243a = new Camera2CaptureOptionUnpacker();

    @Override // androidx.camera.core.impl.CaptureConfig.OptionUnpacker
    public void a(UseCaseConfig useCaseConfig, CaptureConfig.Builder builder) {
        CaptureConfig captureConfigS = useCaseConfig.S();
        OptionsBundle optionsBundle = OptionsBundle.I;
        Config.Option option = CaptureConfig.i;
        int i = new CaptureConfig.Builder().d().c;
        if (captureConfigS != null) {
            i = captureConfigS.c;
            builder.a(captureConfigS.e);
            optionsBundle = captureConfigS.b;
        }
        builder.b = MutableOptionsBundle.W(optionsBundle);
        builder.c = ((Integer) useCaseConfig.c(Camera2ImplConfig.H, Integer.valueOf(i))).intValue();
        builder.b(new CaptureCallbackContainer((CameraCaptureSession.CaptureCallback) useCaseConfig.c(Camera2ImplConfig.L, new Camera2CaptureCallbacks.NoOpSessionCaptureCallback())));
        builder.c(CaptureRequestOptions.Builder.c(useCaseConfig).a());
    }
}
