package androidx.camera.core.imagecapture;

import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.core.streamsharing.VirtualCameraCaptureResult;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class NoMetadataImageReader implements ImageReaderProxy {

    /* renamed from: a, reason: collision with root package name */
    public final ImageReaderProxy f448a;
    public ProcessingRequest b;

    public NoMetadataImageReader(ImageReaderProxy imageReaderProxy) {
        this.f448a = imageReaderProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int a() {
        return this.f448a.a();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int b() {
        return this.f448a.b();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy c() {
        return g(this.f448a.c());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void close() {
        this.f448a.close();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy d() {
        return g(this.f448a.d());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void e() {
        this.f448a.e();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void f(final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        this.f448a.f(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.d
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void a(ImageReaderProxy imageReaderProxy) {
                NoMetadataImageReader noMetadataImageReader = this.d;
                noMetadataImageReader.getClass();
                onImageAvailableListener.a(noMetadataImageReader);
            }
        }, executor);
    }

    public final SettableImageProxy g(ImageProxy imageProxy) {
        TagBundle tagBundle;
        if (imageProxy == null) {
            return null;
        }
        if (this.b == null) {
            tagBundle = TagBundle.b;
        } else {
            ProcessingRequest processingRequest = this.b;
            Pair pair = new Pair(processingRequest.h, processingRequest.i.get(0));
            TagBundle tagBundle2 = TagBundle.b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            tagBundle = new TagBundle(arrayMap);
        }
        this.b = null;
        return new SettableImageProxy(imageProxy, new Size(imageProxy.getWidth(), imageProxy.getHeight()), new CameraCaptureResultImageInfo(new VirtualCameraCaptureResult(null, tagBundle, imageProxy.M0().getTimestamp())));
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getHeight() {
        return this.f448a.getHeight();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final Surface getSurface() {
        return this.f448a.getSurface();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getWidth() {
        return this.f448a.getWidth();
    }
}
