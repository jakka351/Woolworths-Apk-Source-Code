package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class StillCaptureFlow {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f364a;

    public StillCaptureFlow() {
        this.f364a = ((StillCaptureFlashStopRepeatingQuirk) DeviceQuirks.f327a.b(StillCaptureFlashStopRepeatingQuirk.class)) != null;
    }

    public final boolean a(ArrayList arrayList, boolean z) {
        if (!this.f364a || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
            if (iIntValue == 2 || iIntValue == 3) {
                return true;
            }
        }
        return false;
    }
}
