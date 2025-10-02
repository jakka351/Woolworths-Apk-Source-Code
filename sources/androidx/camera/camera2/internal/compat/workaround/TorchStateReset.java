package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class TorchStateReset {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f367a;

    public TorchStateReset() {
        this.f367a = DeviceQuirks.f327a.b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public static CaptureConfig a(CaptureConfig captureConfig) {
        CaptureConfig.Builder builder = new CaptureConfig.Builder();
        builder.c = captureConfig.c;
        Iterator it = Collections.unmodifiableList(captureConfig.f482a).iterator();
        while (it.hasNext()) {
            builder.f483a.add((DeferrableSurface) it.next());
        }
        builder.c(captureConfig.b);
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        builder2.c(CaptureRequest.FLASH_MODE, 0);
        builder.c(builder2.a());
        return builder.d();
    }

    public final boolean b(ArrayList arrayList, boolean z) {
        if (!this.f367a || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
