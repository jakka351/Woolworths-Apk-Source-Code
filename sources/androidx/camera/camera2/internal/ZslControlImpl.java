package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.internal.utils.ZslRingBuffer;

@RequiresApi
/* loaded from: classes2.dex */
final class ZslControlImpl implements ZslControl {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCharacteristicsCompat f295a;
    public final ZslRingBuffer b;
    public boolean c = false;
    public boolean d = false;
    public final boolean e;
    public final boolean f;
    public SafeCloseImageReaderProxy g;
    public CameraCaptureCallback h;
    public ImmediateSurface i;
    public ImageWriter j;

    public ZslControlImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        boolean z;
        this.e = false;
        this.f = false;
        this.f295a = cameraCharacteristicsCompat;
        int[] iArr = (int[]) cameraCharacteristicsCompat.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 4) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        this.e = z;
        this.f = DeviceQuirks.f327a.b(ZslDisablerQuirk.class) != null;
        this.b = new ZslRingBuffer(3, new t(3));
    }
}
