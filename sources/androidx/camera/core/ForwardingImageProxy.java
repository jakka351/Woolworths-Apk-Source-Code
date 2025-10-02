package androidx.camera.core;

import android.media.Image;
import androidx.annotation.RestrictTo;
import androidx.camera.core.ImageProxy;
import java.util.HashSet;
import java.util.Iterator;

@RestrictTo
/* loaded from: classes2.dex */
public abstract class ForwardingImageProxy implements ImageProxy {
    public final ImageProxy e;
    public final Object d = new Object();
    public final HashSet f = new HashSet();

    public interface OnImageCloseListener {
        void g(ForwardingImageProxy forwardingImageProxy);
    }

    public ForwardingImageProxy(ImageProxy imageProxy) {
        this.e = imageProxy;
    }

    @Override // androidx.camera.core.ImageProxy
    public ImageInfo M0() {
        return this.e.M0();
    }

    public final void a(OnImageCloseListener onImageCloseListener) {
        synchronized (this.d) {
            this.f.add(onImageCloseListener);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.e.close();
        synchronized (this.d) {
            hashSet = new HashSet(this.f);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((OnImageCloseListener) it.next()).g(this);
        }
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getFormat() {
        return this.e.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getHeight() {
        return this.e.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public final Image getImage() {
        return this.e.getImage();
    }

    @Override // androidx.camera.core.ImageProxy
    public ImageProxy.PlaneProxy[] getPlanes() {
        return this.e.getPlanes();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
        return this.e.getWidth();
    }
}
