package androidx.camera.core.streamsharing;

import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.streamsharing.StreamSharing;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements AsyncFunction, StreamSharing.Control {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        switch (this.d) {
            case 0:
                return ((CameraCapturePipeline) ((ListenableFuture) this.e).get()).a();
            default:
                return ((CameraCapturePipeline) ((ListenableFuture) this.e).get()).b();
        }
    }
}
