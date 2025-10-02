package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.OperationCanceledException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
abstract class ImageAnalysisAbstractAnalyzer implements ImageReaderProxy.OnImageAvailableListener {
    public f d;
    public volatile int e;
    public volatile int f;
    public volatile boolean h;
    public volatile boolean i;
    public Executor j;
    public SafeCloseImageReaderProxy k;
    public ImageWriter l;
    public ByteBuffer q;
    public ByteBuffer r;
    public ByteBuffer s;
    public ByteBuffer t;
    public volatile int g = 1;
    public Rect m = new Rect();
    public Rect n = new Rect();
    public Matrix o = new Matrix();
    public Matrix p = new Matrix();
    public final Object u = new Object();
    public boolean v = true;

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public final void a(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyB = b(imageReaderProxy);
            if (imageProxyB != null) {
                f(imageProxyB);
            }
        } catch (IllegalStateException e) {
            Logger.c("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    public abstract ImageProxy b(ImageReaderProxy imageReaderProxy);

    public final ListenableFuture c(final ImageProxy imageProxy) throws Throwable {
        Object obj;
        final Executor executor;
        final f fVar;
        boolean z;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ImageProxy imageProxy2;
        ImageProxy imageProxyH;
        int i = this.h ? this.e : 0;
        Object obj2 = this.u;
        synchronized (obj2) {
            try {
                try {
                    executor = this.j;
                    fVar = this.d;
                    z = this.h && i != this.f;
                    if (z) {
                        h(imageProxy, i);
                    }
                    if (this.h) {
                        e(imageProxy);
                    }
                    try {
                        safeCloseImageReaderProxy = this.k;
                        try {
                            imageWriter = this.l;
                            byteBuffer = this.q;
                            try {
                                byteBuffer2 = this.r;
                                byteBuffer3 = this.s;
                                byteBuffer4 = this.t;
                            } catch (Throwable th) {
                                th = th;
                                obj = obj2;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = obj2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        if (fVar == null || executor == null || !this.v) {
            return Futures.e(new OperationCanceledException("No analyzer or executor currently set."));
        }
        if (safeCloseImageReaderProxy == null) {
            imageProxy2 = null;
        } else {
            if (this.g == 2) {
                imageProxyH = ImageProcessingUtil.d(imageProxy, safeCloseImageReaderProxy, byteBuffer, i, this.i);
            } else {
                if (this.g == 1) {
                    if (this.i) {
                        ImageProcessingUtil.a(imageProxy);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        imageProxyH = ImageProcessingUtil.h(imageProxy, safeCloseImageReaderProxy, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                imageProxy2 = null;
            }
            imageProxy2 = imageProxyH;
        }
        boolean z2 = imageProxy2 == null;
        final ImageProxy imageProxy3 = z2 ? imageProxy : imageProxy2;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.u) {
            if (z && !z2) {
                try {
                    g(imageProxy.getWidth(), imageProxy.getHeight(), imageProxy3.getWidth(), imageProxy3.getHeight());
                } finally {
                }
            }
            this.f = i;
            rect.set(this.n);
            matrix.set(this.p);
        }
        return CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.h
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(final CallbackToFutureAdapter.Completer completer) {
                final ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.d;
                final ImageProxy imageProxy4 = imageProxy;
                final Matrix matrix2 = matrix;
                final ImageProxy imageProxy5 = imageProxy3;
                final Rect rect2 = rect;
                final ImageAnalysis.Analyzer analyzer = fVar;
                executor.execute(new Runnable() { // from class: androidx.camera.core.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer2 = imageAnalysisAbstractAnalyzer;
                        ImageProxy imageProxy6 = imageProxy4;
                        Matrix matrix3 = matrix2;
                        ImageProxy imageProxy7 = imageProxy5;
                        Rect rect3 = rect2;
                        ImageAnalysis.Analyzer analyzer2 = analyzer;
                        CallbackToFutureAdapter.Completer completer2 = completer;
                        if (!imageAnalysisAbstractAnalyzer2.v) {
                            completer2.d(new OperationCanceledException("ImageAnalysis is detached"));
                            return;
                        }
                        SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy7, null, new AutoValue_ImmutableImageInfo(imageProxy6.M0().a(), imageProxy6.M0().getTimestamp(), imageAnalysisAbstractAnalyzer2.h ? 0 : imageAnalysisAbstractAnalyzer2.e, matrix3));
                        if (!rect3.isEmpty()) {
                            settableImageProxy.b(rect3);
                        }
                        analyzer2.b(settableImageProxy);
                        completer2.b(null);
                    }
                });
                return "analyzeImage";
            }
        });
    }

    public abstract void d();

    public final void e(ImageProxy imageProxy) {
        if (this.g != 1) {
            if (this.g == 2 && this.q == null) {
                this.q = ByteBuffer.allocateDirect(imageProxy.getHeight() * imageProxy.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.r == null) {
            this.r = ByteBuffer.allocateDirect(imageProxy.getHeight() * imageProxy.getWidth());
        }
        this.r.position(0);
        if (this.s == null) {
            this.s = ByteBuffer.allocateDirect((imageProxy.getHeight() * imageProxy.getWidth()) / 4);
        }
        this.s.position(0);
        if (this.t == null) {
            this.t = ByteBuffer.allocateDirect((imageProxy.getHeight() * imageProxy.getWidth()) / 4);
        }
        this.t.position(0);
    }

    public abstract void f(ImageProxy imageProxy);

    public final void g(int i, int i2, int i3, int i4) {
        int i5 = this.e;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i, i2);
            RectF rectF2 = TransformUtils.f522a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.m);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.n = rect;
        this.p.setConcat(this.o, matrix);
    }

    public final void h(ImageProxy imageProxy, int i) {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.k;
        if (safeCloseImageReaderProxy == null) {
            return;
        }
        safeCloseImageReaderProxy.g();
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int iA = this.k.a();
        int iB = this.k.b();
        boolean z = i == 90 || i == 270;
        int i2 = z ? height : width;
        if (!z) {
            width = height;
        }
        this.k = new SafeCloseImageReaderProxy(ImageReaderProxys.a(i2, width, iA, iB));
        if (this.g == 1) {
            ImageWriter imageWriter = this.l;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.l = ImageWriter.newInstance(this.k.getSurface(), this.k.b());
        }
    }
}
