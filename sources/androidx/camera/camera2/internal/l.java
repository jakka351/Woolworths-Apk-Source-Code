package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements AsyncFunction, CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        int i = this.d;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                CaptureSession captureSession = (CaptureSession) obj3;
                captureSession.close();
                ((ImmediateSurface) obj2).a();
                return captureSession.release();
            case 1:
            default:
                ArrayList arrayList = (ArrayList) obj2;
                List list = (List) obj;
                Logger.a("SyncCaptureSessionBase", "[" + ((SynchronizedCaptureSessionBaseImpl) obj3) + "] getSurface done with results: " + list);
                return list.isEmpty() ? Futures.e(new IllegalArgumentException("Unable to open capture session without surfaces")) : list.contains(null) ? Futures.e(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) arrayList.get(list.indexOf(null)))) : Futures.g(list);
            case 2:
                int i2 = Camera2CapturePipeline.ScreenFlashTask.g;
                return CallbackToFutureAdapter.a(new androidx.camera.core.impl.utils.futures.b((ListenableFuture) obj2, ((Camera2CapturePipeline.ScreenFlashTask) obj3).c, TimeUnit.SECONDS.toMillis(3L), 1));
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 1:
                int i2 = Camera2CapturePipeline.ScreenFlashTask.g;
                CameraXExecutors.d().execute(new d(1, (Camera2CapturePipeline.ScreenFlashTask) obj2, (AtomicReference) obj, completer));
                return "OnScreenFlashStart";
            default:
                FocusMeteringControl focusMeteringControl = (FocusMeteringControl) obj2;
                focusMeteringControl.b.execute(new d(2, focusMeteringControl, completer, (FocusMeteringAction) obj));
                return "startFocusAndMetering";
        }
    }
}
