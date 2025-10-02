package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirks;

/* loaded from: classes2.dex */
public class UseFlashModeTorchFor3aUpdate {

    /* renamed from: a, reason: collision with root package name */
    public final TorchFlashRequiredFor3aUpdateQuirk f368a;

    public UseFlashModeTorchFor3aUpdate(Quirks quirks) {
        this.f368a = (TorchFlashRequiredFor3aUpdateQuirk) quirks.b(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public final boolean a() {
        boolean z = false;
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.f368a;
        if (torchFlashRequiredFor3aUpdateQuirk != null) {
            if (!(Camera2CameraControlImpl.t(torchFlashRequiredFor3aUpdateQuirk.f345a, 5) == 5)) {
                z = true;
            }
        }
        Logger.a("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + z);
        return z;
    }
}
