package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class CaptureCallbackConverter {
    public static void a(CameraCaptureCallback cameraCaptureCallback, ArrayList arrayList) {
        if (cameraCaptureCallback instanceof CameraCaptureCallbacks.ComboCameraCaptureCallback) {
            Iterator it = ((CameraCaptureCallbacks.ComboCameraCaptureCallback) cameraCaptureCallback).f471a.iterator();
            while (it.hasNext()) {
                a((CameraCaptureCallback) it.next(), arrayList);
            }
        } else if (cameraCaptureCallback instanceof CaptureCallbackContainer) {
            arrayList.add(((CaptureCallbackContainer) cameraCaptureCallback).f263a);
        } else {
            arrayList.add(new CaptureCallbackAdapter(cameraCaptureCallback));
        }
    }
}
