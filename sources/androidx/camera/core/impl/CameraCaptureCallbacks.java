package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class CameraCaptureCallbacks {

    public static final class ComboCameraCaptureCallback extends CameraCaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f471a = new ArrayList();

        public ComboCameraCaptureCallback(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) it.next();
                if (!(cameraCaptureCallback instanceof NoOpCameraCaptureCallback)) {
                    this.f471a.add(cameraCaptureCallback);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void a(int i) {
            Iterator it = this.f471a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureCallback) it.next()).a(i);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void b(int i, CameraCaptureResult cameraCaptureResult) {
            Iterator it = this.f471a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureCallback) it.next()).b(i, cameraCaptureResult);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void c(int i, CameraCaptureFailure cameraCaptureFailure) {
            Iterator it = this.f471a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureCallback) it.next()).c(i, cameraCaptureFailure);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void d(int i) {
            Iterator it = this.f471a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureCallback) it.next()).d(i);
            }
        }
    }

    public static final class NoOpCameraCaptureCallback extends CameraCaptureCallback {
        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void b(int i, CameraCaptureResult cameraCaptureResult) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void c(int i, CameraCaptureFailure cameraCaptureFailure) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void d(int i) {
        }
    }

    public static CameraCaptureCallback a(CameraCaptureCallback... cameraCaptureCallbackArr) {
        List listAsList = Arrays.asList(cameraCaptureCallbackArr);
        return listAsList.isEmpty() ? new NoOpCameraCaptureCallback() : listAsList.size() == 1 ? (CameraCaptureCallback) listAsList.get(0) : new ComboCameraCaptureCallback(listAsList);
    }
}
