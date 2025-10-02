package androidx.camera.core.imagecapture;

import android.util.Log;
import androidx.camera.core.CaptureBundles;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Logger;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class TakePictureManager implements ForwardingImageProxy.OnImageCloseListener, TakePictureRequest.RetryControl {
    public final ImageCaptureControl b;
    public ImagePipeline c;
    public RequestWithCallback d;
    public final ArrayList e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f454a = new ArrayDeque();
    public boolean f = false;

    @AutoValue
    public static abstract class CaptureError {
        public abstract ImageCaptureException a();

        public abstract int b();
    }

    public TakePictureManager(ImageCaptureControl imageCaptureControl) {
        Threads.a();
        this.b = imageCaptureControl;
        this.e = new ArrayList();
    }

    public final void a() {
        Threads.a();
        ImageCaptureException imageCaptureException = new ImageCaptureException("Camera is closed.", null);
        ArrayDeque arrayDeque = this.f454a;
        Iterator it = arrayDeque.iterator();
        if (it.hasNext()) {
            ((TakePictureRequest) it.next()).getClass();
            throw null;
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.e).iterator();
        while (it2.hasNext()) {
            RequestWithCallback requestWithCallback = (RequestWithCallback) it2.next();
            requestWithCallback.getClass();
            Threads.a();
            if (!requestWithCallback.d.isDone()) {
                Threads.a();
                requestWithCallback.g = true;
                ListenableFuture listenableFuture = requestWithCallback.i;
                Objects.requireNonNull(listenableFuture);
                listenableFuture.cancel(true);
                requestWithCallback.e.d(imageCaptureException);
                requestWithCallback.f.b(null);
                Threads.a();
                throw null;
            }
        }
    }

    public final void b() {
        Threads.a();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (this.d != null) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
            return;
        }
        if (this.f) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        ImagePipeline imagePipeline = this.c;
        imagePipeline.getClass();
        Threads.a();
        if (imagePipeline.c.a() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        TakePictureRequest takePictureRequest = (TakePictureRequest) this.f454a.poll();
        if (takePictureRequest == null) {
            Log.d("TakePictureManager", "No new request.");
            return;
        }
        RequestWithCallback requestWithCallback = new RequestWithCallback(takePictureRequest, this);
        Preconditions.f(null, !(this.d != null));
        this.d = requestWithCallback;
        Threads.a();
        j jVar = new j(this, 1);
        Executor executorA = CameraXExecutors.a();
        ListenableFuture listenableFuture = requestWithCallback.c;
        listenableFuture.addListener(jVar, executorA);
        this.e.add(requestWithCallback);
        Threads.a();
        requestWithCallback.d.addListener(new g(1, this, requestWithCallback), CameraXExecutors.a());
        ImagePipeline imagePipeline2 = this.c;
        Threads.a();
        imagePipeline2.getClass();
        Threads.a();
        CaptureBundle captureBundle = (CaptureBundle) imagePipeline2.f447a.c(ImageCaptureConfig.J, CaptureBundles.a());
        Objects.requireNonNull(captureBundle);
        int i = ImagePipeline.f;
        ImagePipeline.f = i + 1;
        ArrayList arrayList = new ArrayList();
        String.valueOf(captureBundle.hashCode());
        List listA = captureBundle.a();
        Objects.requireNonNull(listA);
        Iterator it = listA.iterator();
        if (it.hasNext()) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            CaptureConfig captureConfig = imagePipeline2.b;
            builder.c = captureConfig.c;
            builder.c(captureConfig.b);
            builder.a(null);
            throw null;
        }
        final CameraRequest cameraRequest = new CameraRequest(arrayList, requestWithCallback);
        ProcessingRequest processingRequest = new ProcessingRequest(captureBundle, null, null, 0, 0, null, requestWithCallback, listenableFuture, i);
        ImagePipeline imagePipeline3 = this.c;
        imagePipeline3.getClass();
        Threads.a();
        imagePipeline3.e.j.accept(processingRequest);
        Threads.a();
        ImageCaptureControl imageCaptureControl = this.b;
        imageCaptureControl.a();
        ListenableFuture listenableFutureC = imageCaptureControl.c(arrayList);
        Futures.a(listenableFutureC, new FutureCallback<Void>() { // from class: androidx.camera.core.imagecapture.TakePictureManager.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
                CameraRequest cameraRequest2 = cameraRequest;
                if (cameraRequest2.b.g) {
                    return;
                }
                int iA = ((CaptureConfig) cameraRequest2.f441a.get(0)).a();
                boolean z = th instanceof ImageCaptureException;
                TakePictureManager takePictureManager = TakePictureManager.this;
                if (z) {
                    ImagePipeline imagePipeline4 = takePictureManager.c;
                    AutoValue_TakePictureManager_CaptureError autoValue_TakePictureManager_CaptureError = new AutoValue_TakePictureManager_CaptureError(iA, (ImageCaptureException) th);
                    imagePipeline4.getClass();
                    Threads.a();
                    imagePipeline4.e.k.accept(autoValue_TakePictureManager_CaptureError);
                } else {
                    ImagePipeline imagePipeline5 = takePictureManager.c;
                    AutoValue_TakePictureManager_CaptureError autoValue_TakePictureManager_CaptureError2 = new AutoValue_TakePictureManager_CaptureError(iA, new ImageCaptureException("Failed to submit capture request", th));
                    imagePipeline5.getClass();
                    Threads.a();
                    imagePipeline5.e.k.accept(autoValue_TakePictureManager_CaptureError2);
                }
                takePictureManager.b.b();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onSuccess(Object obj) {
                TakePictureManager.this.b.b();
            }
        }, CameraXExecutors.d());
        Threads.a();
        Preconditions.f("CaptureRequestFuture can only be set once.", requestWithCallback.i == null);
        requestWithCallback.i = listenableFutureC;
    }

    public final void c(TakePictureRequest takePictureRequest) {
        Threads.a();
        Logger.a("TakePictureManager", "Add a new request for retrying.");
        this.f454a.addFirst(takePictureRequest);
        b();
    }

    public final void d(ImagePipeline imagePipeline) {
        Threads.a();
        this.c = imagePipeline;
        imagePipeline.getClass();
        Threads.a();
        CaptureNode captureNode = imagePipeline.c;
        captureNode.getClass();
        Threads.a();
        Preconditions.f("The ImageReader is not initialized.", captureNode.b != null);
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = captureNode.b;
        synchronized (safeCloseImageReaderProxy.f423a) {
            safeCloseImageReaderProxy.f = this;
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void g(ForwardingImageProxy forwardingImageProxy) {
        CameraXExecutors.d().execute(new j(this, 0));
    }
}
