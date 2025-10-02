package androidx.camera.camera2.internal.compat.quirk;

import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat;
import androidx.camera.core.impl.Quirk;
import java.util.List;

/* loaded from: classes2.dex */
public class CamcorderProfileResolutionQuirk implements Quirk {

    /* renamed from: a, reason: collision with root package name */
    public final StreamConfigurationMapCompat f324a;
    public List b = null;

    public CamcorderProfileResolutionQuirk(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f324a = cameraCharacteristicsCompat.b();
    }
}
