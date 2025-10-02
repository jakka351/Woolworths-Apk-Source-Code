package androidx.camera.core;

import android.content.Context;
import android.os.SystemClock;
import android.util.Range;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements CallbackToFutureAdapter.Resolver, ImageReaderProxy.OnImageAvailableListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void a(ImageReaderProxy imageReaderProxy) {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = (SafeCloseImageReaderProxy) this.e;
        ImageReaderProxy.OnImageAvailableListener onImageAvailableListener = (ImageReaderProxy.OnImageAvailableListener) this.f;
        safeCloseImageReaderProxy.getClass();
        onImageAvailableListener.a(safeCloseImageReaderProxy);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                CameraX cameraX = (CameraX) obj2;
                Executor executor = cameraX.d;
                executor.execute(new e(cameraX, (Context) obj, executor, 1, completer, SystemClock.elapsedRealtime()));
                return "CameraX initInternal";
            default:
                Range range = SurfaceRequest.p;
                ((AtomicReference) obj).set(completer);
                return "SurfaceRequest-surface-recreation(" + ((SurfaceRequest) obj2).hashCode() + ")";
        }
    }
}
