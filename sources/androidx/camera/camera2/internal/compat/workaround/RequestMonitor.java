package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.camera.camera2.internal.Camera2CaptureCallbacks;
import androidx.camera.camera2.internal.compat.workaround.RequestMonitor;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class RequestMonitor {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f360a;
    public final List b = Collections.synchronizedList(new ArrayList());

    public static class RequestCompleteListener extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public final ListenableFuture f361a = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.compat.workaround.c
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                RequestMonitor.RequestCompleteListener requestCompleteListener = this.d;
                requestCompleteListener.b = completer;
                return "RequestCompleteListener[" + requestCompleteListener + "]";
            }
        });
        public CallbackToFutureAdapter.Completer b;

        public final void a() {
            CallbackToFutureAdapter.Completer completer = this.b;
            if (completer != null) {
                completer.b(null);
                this.b = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            a();
        }
    }

    public RequestMonitor(boolean z) {
        this.f360a = z;
    }

    public final CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.f360a) {
            return captureCallback;
        }
        final RequestCompleteListener requestCompleteListener = new RequestCompleteListener();
        List list = this.b;
        final ListenableFuture listenableFuture = requestCompleteListener.f361a;
        list.add(listenableFuture);
        Log.d("RequestMonitor", "RequestListener " + requestCompleteListener + " monitoring " + this);
        listenableFuture.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.compat.workaround.a
            @Override // java.lang.Runnable
            public final void run() {
                RequestMonitor requestMonitor = this.d;
                requestMonitor.getClass();
                Log.d("RequestMonitor", "RequestListener " + requestCompleteListener + " done " + requestMonitor);
                requestMonitor.b.remove(listenableFuture);
            }
        }, CameraXExecutors.a());
        return Camera2CaptureCallbacks.a(requestCompleteListener, captureCallback);
    }

    public final ListenableFuture b() {
        List list = this.b;
        return list.isEmpty() ? Futures.g(null) : Futures.h(Futures.l(Futures.k(new ArrayList(list)), new b(0), CameraXExecutors.a()));
    }

    public final void c() {
        LinkedList linkedList = new LinkedList(this.b);
        while (!linkedList.isEmpty()) {
            ListenableFuture listenableFuture = (ListenableFuture) linkedList.poll();
            Objects.requireNonNull(listenableFuture);
            listenableFuture.cancel(true);
        }
    }
}
