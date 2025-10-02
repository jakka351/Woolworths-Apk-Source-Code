package androidx.camera.core;

import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.annotation.RestrictTo;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

@RestrictTo
/* loaded from: classes2.dex */
public class MetadataImageReader implements ImageReaderProxy, ForwardingImageProxy.OnImageCloseListener {

    /* renamed from: a, reason: collision with root package name */
    public final Object f414a;
    public final CameraCaptureCallback b;
    public int c;
    public final f d;
    public boolean e;
    public final ImageReaderProxy f;
    public ImageReaderProxy.OnImageAvailableListener g;
    public Executor h;
    public final LongSparseArray i;
    public final LongSparseArray j;
    public int k;
    public final ArrayList l;
    public final ArrayList m;

    public MetadataImageReader(int i, int i2, int i3, int i4) {
        AndroidImageReaderProxy androidImageReaderProxy = new AndroidImageReaderProxy(ImageReader.newInstance(i, i2, i3, i4));
        this.f414a = new Object();
        this.b = new CameraCaptureCallback() { // from class: androidx.camera.core.MetadataImageReader.1
            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public final void b(int i5, CameraCaptureResult cameraCaptureResult) {
                MetadataImageReader metadataImageReader = MetadataImageReader.this;
                synchronized (metadataImageReader.f414a) {
                    try {
                        if (metadataImageReader.e) {
                            return;
                        }
                        metadataImageReader.i.put(cameraCaptureResult.getTimestamp(), new CameraCaptureResultImageInfo(cameraCaptureResult));
                        metadataImageReader.k();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.c = 0;
        this.d = new f(this);
        this.e = false;
        this.i = new LongSparseArray();
        this.j = new LongSparseArray();
        this.m = new ArrayList();
        this.f = androidImageReaderProxy;
        this.k = 0;
        this.l = new ArrayList(b());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int a() {
        int iA;
        synchronized (this.f414a) {
            iA = this.f.a();
        }
        return iA;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int b() {
        int iB;
        synchronized (this.f414a) {
            iB = this.f.b();
        }
        return iB;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy c() {
        synchronized (this.f414a) {
            try {
                if (this.l.isEmpty()) {
                    return null;
                }
                if (this.k >= this.l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.l;
                int i = this.k;
                this.k = i + 1;
                ImageProxy imageProxy = (ImageProxy) arrayList.get(i);
                this.m.add(imageProxy);
                return imageProxy;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void close() {
        synchronized (this.f414a) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it = new ArrayList(this.l).iterator();
                while (it.hasNext()) {
                    ((ImageProxy) it.next()).close();
                }
                this.l.clear();
                ((AndroidImageReaderProxy) this.f).close();
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy d() {
        synchronized (this.f414a) {
            try {
                if (this.l.isEmpty()) {
                    return null;
                }
                if (this.k >= this.l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.l.size() - 1; i++) {
                    if (!this.m.contains(this.l.get(i))) {
                        arrayList.add((ImageProxy) this.l.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ImageProxy) it.next()).close();
                }
                int size = this.l.size();
                ArrayList arrayList2 = this.l;
                this.k = size;
                ImageProxy imageProxy = (ImageProxy) arrayList2.get(size - 1);
                this.m.add(imageProxy);
                return imageProxy;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void e() {
        synchronized (this.f414a) {
            this.f.e();
            this.g = null;
            this.h = null;
            this.c = 0;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void f(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        synchronized (this.f414a) {
            onImageAvailableListener.getClass();
            this.g = onImageAvailableListener;
            executor.getClass();
            this.h = executor;
            ((AndroidImageReaderProxy) this.f).f(this.d, executor);
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void g(ForwardingImageProxy forwardingImageProxy) {
        synchronized (this.f414a) {
            h(forwardingImageProxy);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getHeight() {
        int height;
        synchronized (this.f414a) {
            height = this.f.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f414a) {
            surface = this.f.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getWidth() {
        int width;
        synchronized (this.f414a) {
            width = this.f.getWidth();
        }
        return width;
    }

    public final void h(ForwardingImageProxy forwardingImageProxy) {
        synchronized (this.f414a) {
            try {
                int iIndexOf = this.l.indexOf(forwardingImageProxy);
                if (iIndexOf >= 0) {
                    this.l.remove(iIndexOf);
                    int i = this.k;
                    if (iIndexOf <= i) {
                        this.k = i - 1;
                    }
                }
                this.m.remove(forwardingImageProxy);
                if (this.c > 0) {
                    j(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(SettableImageProxy settableImageProxy) {
        ImageReaderProxy.OnImageAvailableListener onImageAvailableListener;
        Executor executor;
        synchronized (this.f414a) {
            try {
                if (this.l.size() < b()) {
                    settableImageProxy.a(this);
                    this.l.add(settableImageProxy);
                    onImageAvailableListener = this.g;
                    executor = this.h;
                } else {
                    Logger.a("TAG", "Maximum image number reached.");
                    settableImageProxy.close();
                    onImageAvailableListener = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (onImageAvailableListener != null) {
            if (executor != null) {
                executor.execute(new b(2, this, onImageAvailableListener));
            } else {
                onImageAvailableListener.a(this);
            }
        }
    }

    public final void j(ImageReaderProxy imageReaderProxy) {
        ImageProxy imageProxyC;
        synchronized (this.f414a) {
            try {
                if (this.e) {
                    return;
                }
                int size = this.j.size() + this.l.size();
                if (size >= imageReaderProxy.b()) {
                    Logger.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        imageProxyC = imageReaderProxy.c();
                        if (imageProxyC != null) {
                            this.c--;
                            size++;
                            this.j.put(imageProxyC.M0().getTimestamp(), imageProxyC);
                            k();
                        }
                    } catch (IllegalStateException e) {
                        if (Logger.d(3, "MetadataImageReader")) {
                            Log.d("MetadataImageReader", "Failed to acquire next image.", e);
                        }
                        imageProxyC = null;
                    }
                    if (imageProxyC == null || this.c <= 0) {
                        break;
                    }
                } while (size < imageReaderProxy.b());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.f414a) {
            try {
                for (int size = this.i.size() - 1; size >= 0; size--) {
                    ImageInfo imageInfo = (ImageInfo) this.i.valueAt(size);
                    long timestamp = imageInfo.getTimestamp();
                    ImageProxy imageProxy = (ImageProxy) this.j.get(timestamp);
                    if (imageProxy != null) {
                        this.j.remove(timestamp);
                        this.i.removeAt(size);
                        i(new SettableImageProxy(imageProxy, null, imageInfo));
                    }
                }
                l();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        synchronized (this.f414a) {
            try {
                if (this.j.size() != 0 && this.i.size() != 0) {
                    long jKeyAt = this.j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.i.keyAt(0);
                    Preconditions.b(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.j.size() - 1; size >= 0; size--) {
                            if (this.j.keyAt(size) < jKeyAt2) {
                                ((ImageProxy) this.j.valueAt(size)).close();
                                this.j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.i.size() - 1; size2 >= 0; size2--) {
                            if (this.i.keyAt(size2) < jKeyAt) {
                                this.i.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }
}
