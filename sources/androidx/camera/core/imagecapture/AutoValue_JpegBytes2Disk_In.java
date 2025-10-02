package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.JpegBytes2Disk;
import androidx.camera.core.processing.Packet;

/* loaded from: classes2.dex */
final class AutoValue_JpegBytes2Disk_In extends JpegBytes2Disk.In {

    /* renamed from: a, reason: collision with root package name */
    public final Packet f437a;
    public final ImageCapture.OutputFileOptions b;

    public AutoValue_JpegBytes2Disk_In(Packet packet, ImageCapture.OutputFileOptions outputFileOptions) {
        if (packet == null) {
            throw new NullPointerException("Null packet");
        }
        this.f437a = packet;
        if (outputFileOptions == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.b = outputFileOptions;
    }

    @Override // androidx.camera.core.imagecapture.JpegBytes2Disk.In
    public final ImageCapture.OutputFileOptions a() {
        return this.b;
    }

    @Override // androidx.camera.core.imagecapture.JpegBytes2Disk.In
    public final Packet b() {
        return this.f437a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JpegBytes2Disk.In)) {
            return false;
        }
        JpegBytes2Disk.In in = (JpegBytes2Disk.In) obj;
        return this.f437a.equals(in.b()) && this.b.equals(in.a());
    }

    public final int hashCode() {
        return ((this.f437a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "In{packet=" + this.f437a + ", outputFileOptions=" + this.b + "}";
    }
}
