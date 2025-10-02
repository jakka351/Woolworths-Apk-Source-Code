package androidx.camera.camera2.internal.compat.quirk;

import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements Quirk {
    public static final List b = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* renamed from: a, reason: collision with root package name */
    public final CameraCharacteristicsCompat f345a;

    public TorchFlashRequiredFor3aUpdateQuirk(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f345a = cameraCharacteristicsCompat;
    }
}
