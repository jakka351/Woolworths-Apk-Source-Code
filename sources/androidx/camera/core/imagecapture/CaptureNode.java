package androidx.camera.core.imagecapture;

import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.Logger;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.Node;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.Objects;

/* loaded from: classes2.dex */
class CaptureNode implements Node<In, ProcessingNode.In> {

    /* renamed from: a, reason: collision with root package name */
    public ProcessingRequest f442a;
    public SafeCloseImageReaderProxy b;
    public SafeCloseImageReaderProxy c;
    public AutoValue_ProcessingNode_In d;
    public AutoValue_CaptureNode_In e;
    public NoMetadataImageReader f;

    /* renamed from: androidx.camera.core.imagecapture.CaptureNode$1, reason: invalid class name */
    class AnonymousClass1 extends CameraCaptureCallback {
        public AnonymousClass1() {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void d(int i) {
            CameraXExecutors.d().execute(new h(this));
        }
    }

    @AutoValue
    public static abstract class In {

        /* renamed from: a, reason: collision with root package name */
        public ImmediateSurface f445a;
        public ImmediateSurface b;

        /* renamed from: androidx.camera.core.imagecapture.CaptureNode$In$1, reason: invalid class name */
        public class AnonymousClass1 extends CameraCaptureCallback {
        }

        public abstract Edge a();

        public abstract ImageReaderProxyProvider b();

        public abstract int c();

        public abstract int d();

        public abstract int e();

        public abstract Size f();

        public abstract Edge g();

        public abstract Size h();

        public abstract boolean i();
    }

    public final int a() {
        int iB;
        Threads.a();
        Preconditions.f("The ImageReader is not initialized.", this.b != null);
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.b;
        synchronized (safeCloseImageReaderProxy.f423a) {
            iB = safeCloseImageReaderProxy.d.b() - safeCloseImageReaderProxy.b;
        }
        return iB;
    }

    public final void b(ImageProxy imageProxy) throws Exception {
        Threads.a();
        if (this.f442a == null) {
            Logger.e("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + imageProxy);
            imageProxy.close();
            return;
        }
        if (((Integer) imageProxy.M0().a().f504a.get(this.f442a.h)) == null) {
            Logger.e("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            imageProxy.close();
            return;
        }
        Threads.a();
        AutoValue_ProcessingNode_In autoValue_ProcessingNode_In = this.d;
        Objects.requireNonNull(autoValue_ProcessingNode_In);
        autoValue_ProcessingNode_In.f438a.accept(new AutoValue_ProcessingNode_InputPacket(this.f442a, imageProxy));
        ProcessingRequest processingRequest = this.f442a;
        this.f442a = null;
        RequestWithCallback requestWithCallback = processingRequest.g;
        int i = processingRequest.k;
        if (i != -1 && i != 100) {
            processingRequest.k = 100;
            Threads.a();
            if (!requestWithCallback.g) {
                throw null;
            }
        }
        Threads.a();
        if (requestWithCallback.g) {
            return;
        }
        if (!requestWithCallback.h) {
            requestWithCallback.b();
        }
        requestWithCallback.e.b(null);
    }

    public final void c(final ProcessingRequest processingRequest) {
        Threads.a();
        Preconditions.f("only one capture stage is supported.", processingRequest.i.size() == 1);
        Preconditions.f("Too many acquire images. Close image to be able to process next.", a() > 0);
        this.f442a = processingRequest;
        Futures.a(processingRequest.j, new FutureCallback<Void>() { // from class: androidx.camera.core.imagecapture.CaptureNode.2
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
                Threads.a();
                CaptureNode captureNode = CaptureNode.this;
                if (processingRequest == captureNode.f442a) {
                    Logger.e("CaptureNode", "request aborted, id=" + captureNode.f442a.f450a);
                    NoMetadataImageReader noMetadataImageReader = captureNode.f;
                    if (noMetadataImageReader != null) {
                        noMetadataImageReader.b = null;
                    }
                    captureNode.f442a = null;
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            }
        }, CameraXExecutors.a());
    }

    public final void d(TakePictureManager.CaptureError captureError) {
        boolean z;
        Threads.a();
        ProcessingRequest processingRequest = this.f442a;
        if (processingRequest == null || processingRequest.f450a != captureError.b()) {
            return;
        }
        ProcessingRequest processingRequest2 = this.f442a;
        ImageCaptureException imageCaptureExceptionA = captureError.a();
        RequestWithCallback requestWithCallback = processingRequest2.g;
        TakePictureRequest takePictureRequest = requestWithCallback.f451a;
        Threads.a();
        if (requestWithCallback.g) {
            return;
        }
        Threads.a();
        int i = takePictureRequest.f456a;
        if (i > 0) {
            z = true;
            takePictureRequest.f456a = i - 1;
        } else {
            z = false;
        }
        if (!z) {
            Threads.a();
            throw null;
        }
        requestWithCallback.a();
        requestWithCallback.e.d(imageCaptureExceptionA);
        if (z) {
            requestWithCallback.b.c(takePictureRequest);
        }
    }
}
