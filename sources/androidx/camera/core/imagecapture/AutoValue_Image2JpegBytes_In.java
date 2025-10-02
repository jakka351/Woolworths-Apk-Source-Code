package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.Image2JpegBytes;
import androidx.camera.core.processing.Packet;

/* loaded from: classes2.dex */
final class AutoValue_Image2JpegBytes_In extends Image2JpegBytes.In {

    /* renamed from: a, reason: collision with root package name */
    public final Packet f436a;
    public final int b;

    public AutoValue_Image2JpegBytes_In(Packet packet, int i) {
        if (packet == null) {
            throw new NullPointerException("Null packet");
        }
        this.f436a = packet;
        this.b = i;
    }

    @Override // androidx.camera.core.imagecapture.Image2JpegBytes.In
    public final int a() {
        return this.b;
    }

    @Override // androidx.camera.core.imagecapture.Image2JpegBytes.In
    public final Packet b() {
        return this.f436a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Image2JpegBytes.In)) {
            return false;
        }
        Image2JpegBytes.In in = (Image2JpegBytes.In) obj;
        return this.f436a.equals(in.b()) && this.b == in.a();
    }

    public final int hashCode() {
        return ((this.f436a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.f436a);
        sb.append(", jpegQuality=");
        return YU.a.m(sb, this.b, "}");
    }
}
