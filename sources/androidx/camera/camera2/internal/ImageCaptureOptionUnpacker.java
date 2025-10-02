package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.UseCaseConfig;

/* loaded from: classes2.dex */
final class ImageCaptureOptionUnpacker extends Camera2CaptureOptionUnpacker {
    public static final ImageCaptureOptionUnpacker b = new ImageCaptureOptionUnpacker();

    @Override // androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker, androidx.camera.core.impl.CaptureConfig.OptionUnpacker
    public final void a(UseCaseConfig useCaseConfig, CaptureConfig.Builder builder) {
        super.a(useCaseConfig, builder);
        if (!(useCaseConfig instanceof ImageCaptureConfig)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) useCaseConfig;
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        Config.Option option = ImageCaptureConfig.H;
        if (imageCaptureConfig.d(option)) {
            int iIntValue = ((Integer) imageCaptureConfig.a(option)).intValue();
            if (((ImageCapturePixelHDRPlusQuirk) DeviceQuirks.f327a.b(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (iIntValue == 0) {
                    builder2.c(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
                } else if (iIntValue == 1) {
                    builder2.c(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
                }
            }
        }
        builder.c(builder2.a());
    }
}
