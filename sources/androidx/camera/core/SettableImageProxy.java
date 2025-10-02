package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes2.dex */
public final class SettableImageProxy extends ForwardingImageProxy {
    public final Object g;
    public final ImageInfo h;
    public final int i;
    public final int j;

    public SettableImageProxy(ImageProxy imageProxy, Size size, ImageInfo imageInfo) {
        super(imageProxy);
        this.g = new Object();
        if (size == null) {
            this.i = this.e.getWidth();
            this.j = this.e.getHeight();
        } else {
            this.i = size.getWidth();
            this.j = size.getHeight();
        }
        this.h = imageInfo;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public final ImageInfo M0() {
        return this.h;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.i, this.j)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.g) {
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public final int getHeight() {
        return this.j;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public final int getWidth() {
        return this.i;
    }
}
