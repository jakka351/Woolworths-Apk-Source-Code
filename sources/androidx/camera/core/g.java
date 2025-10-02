package androidx.camera.core;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.Threads;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements SessionConfig.ErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f434a;
    public final /* synthetic */ UseCase b;

    public /* synthetic */ g(UseCase useCase, int i) {
        this.f434a = i;
        this.b = useCase;
    }

    @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
    public final void a(SessionConfig sessionConfig) {
        int i = this.f434a;
        UseCase useCase = this.b;
        switch (i) {
            case 0:
                ImageAnalysis imageAnalysis = (ImageAnalysis) useCase;
                ImageAnalysis.Defaults defaults = ImageAnalysis.v;
                if (imageAnalysis.b() != null) {
                    Threads.a();
                    SessionConfig.CloseableErrorListener closeableErrorListener = imageAnalysis.u;
                    if (closeableErrorListener != null) {
                        closeableErrorListener.b();
                        imageAnalysis.u = null;
                    }
                    ImmediateSurface immediateSurface = imageAnalysis.t;
                    if (immediateSurface != null) {
                        immediateSurface.a();
                        imageAnalysis.t = null;
                    }
                    imageAnalysis.p.d();
                    imageAnalysis.d();
                    ImageAnalysisConfig imageAnalysisConfig = (ImageAnalysisConfig) imageAnalysis.f;
                    StreamSpec streamSpec = imageAnalysis.g;
                    streamSpec.getClass();
                    SessionConfig.Builder builderE = imageAnalysis.E(imageAnalysisConfig, streamSpec);
                    imageAnalysis.s = builderE;
                    Object[] objArr = {builderE.k()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj = objArr[0];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                    imageAnalysis.D(Collections.unmodifiableList(arrayList));
                    imageAnalysis.p();
                    break;
                }
                break;
            case 1:
                ImageCapture imageCapture = (ImageCapture) useCase;
                ImageCapture.Defaults defaults2 = ImageCapture.A;
                if (imageCapture.b() != null) {
                    TakePictureManager takePictureManager = imageCapture.x;
                    takePictureManager.getClass();
                    Threads.a();
                    takePictureManager.f = true;
                    RequestWithCallback requestWithCallback = takePictureManager.d;
                    if (requestWithCallback != null) {
                        Threads.a();
                        if (!requestWithCallback.d.isDone()) {
                            ImageCaptureException imageCaptureException = new ImageCaptureException("The request is aborted silently and retried.", null);
                            Threads.a();
                            requestWithCallback.g = true;
                            ListenableFuture listenableFuture = requestWithCallback.i;
                            Objects.requireNonNull(listenableFuture);
                            listenableFuture.cancel(true);
                            requestWithCallback.e.d(imageCaptureException);
                            requestWithCallback.f.b(null);
                            requestWithCallback.b.c(requestWithCallback.f451a);
                        }
                    }
                    imageCapture.E(true);
                    String strD = imageCapture.d();
                    ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) imageCapture.f;
                    StreamSpec streamSpec2 = imageCapture.g;
                    streamSpec2.getClass();
                    SessionConfig.Builder builderF = imageCapture.F(strD, imageCaptureConfig, streamSpec2);
                    imageCapture.v = builderF;
                    Object[] objArr2 = {builderF.k()};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj2 = objArr2[0];
                    Objects.requireNonNull(obj2);
                    arrayList2.add(obj2);
                    imageCapture.D(Collections.unmodifiableList(arrayList2));
                    imageCapture.p();
                    TakePictureManager takePictureManager2 = imageCapture.x;
                    takePictureManager2.getClass();
                    Threads.a();
                    takePictureManager2.f = false;
                    takePictureManager2.b();
                    break;
                }
                break;
            default:
                Preview preview = (Preview) useCase;
                Preview.Defaults defaults3 = Preview.w;
                if (preview.b() != null) {
                    preview.G((PreviewConfig) preview.f, preview.g);
                    preview.p();
                    break;
                }
                break;
        }
    }
}
