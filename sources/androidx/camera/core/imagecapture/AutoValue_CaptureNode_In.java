package androidx.camera.core.imagecapture;

import android.util.Size;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.imagecapture.CaptureNode;
import androidx.camera.core.processing.Edge;

/* loaded from: classes2.dex */
final class AutoValue_CaptureNode_In extends CaptureNode.In {
    public final Size c;
    public final int d;
    public final int e;
    public final boolean f;
    public final ImageReaderProxyProvider g;
    public final Size h;
    public final int i;
    public final Edge j;
    public final Edge k;

    public AutoValue_CaptureNode_In(Size size, int i, int i2, boolean z, ImageReaderProxyProvider imageReaderProxyProvider, Size size2, int i3, Edge edge, Edge edge2) {
        this.b = null;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.c = size;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = imageReaderProxyProvider;
        this.h = size2;
        this.i = i3;
        this.j = edge;
        this.k = edge2;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public final Edge a() {
        return this.k;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public final ImageReaderProxyProvider b() {
        return this.g;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public final int c() {
        return this.d;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public final int d() {
        return this.e;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public final int e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaptureNode.In)) {
            return false;
        }
        CaptureNode.In in = (CaptureNode.In) obj;
        if (!this.c.equals(in.h()) || this.d != in.c() || this.e != in.d() || this.f != in.i()) {
            return false;
        }
        ImageReaderProxyProvider imageReaderProxyProvider = this.g;
        if (imageReaderProxyProvider == null) {
            if (in.b() != null) {
                return false;
            }
        } else if (!imageReaderProxyProvider.equals(in.b())) {
            return false;
        }
        Size size = this.h;
        if (size == null) {
            if (in.f() != null) {
                return false;
            }
        } else if (!size.equals(in.f())) {
            return false;
        }
        return this.i == in.e() && this.j.equals(in.g()) && this.k.equals(in.a());
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public final Size f() {
        return this.h;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public final Edge g() {
        return this.j;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public final Size h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003;
        ImageReaderProxyProvider imageReaderProxyProvider = this.g;
        int iHashCode2 = (iHashCode ^ (imageReaderProxyProvider == null ? 0 : imageReaderProxyProvider.hashCode())) * 1000003;
        Size size = this.h;
        return ((((((iHashCode2 ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.i) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    public final boolean i() {
        return this.f;
    }

    public final String toString() {
        return "In{size=" + this.c + ", inputFormat=" + this.d + ", outputFormat=" + this.e + ", virtualCamera=" + this.f + ", imageReaderProxyProvider=" + this.g + ", postviewSize=" + this.h + ", postviewImageFormat=" + this.i + ", requestEdge=" + this.j + ", errorEdge=" + this.k + "}";
    }
}
