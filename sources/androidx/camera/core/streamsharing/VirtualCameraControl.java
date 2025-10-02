package androidx.camera.core.streamsharing;

import androidx.camera.camera2.interop.e;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.ForwardingCameraControl;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public class VirtualCameraControl extends ForwardingCameraControl {
    public final b c;

    public VirtualCameraControl(CameraControlInternal cameraControlInternal, b bVar) {
        super(cameraControlInternal);
        this.c = bVar;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture e(int i, int i2, ArrayList arrayList) {
        Preconditions.a("Only support one capture config.", arrayList.size() == 1);
        ListenableFuture listenableFutureM = this.b.m(i, i2);
        return Futures.b(Collections.singletonList((FutureChain) Futures.m((FutureChain) Futures.m((FutureChain) Futures.m(FutureChain.a(listenableFutureM), new b(listenableFutureM, 0), CameraXExecutors.a()), new e(1, this, arrayList), CameraXExecutors.a()), new b(listenableFutureM, 1), CameraXExecutors.a())));
    }
}
