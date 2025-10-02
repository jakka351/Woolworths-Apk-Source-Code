package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.Exif;

/* loaded from: classes2.dex */
final class AutoValue_Packet<T> extends Packet<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f547a;
    public final Exif b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final CameraCaptureResult h;

    public AutoValue_Packet(Object obj, Exif exif, int i, Size size, Rect rect, int i2, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.f547a = obj;
        this.b = exif;
        this.c = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.e = rect;
        this.f = i2;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.g = matrix;
        if (cameraCaptureResult == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.h = cameraCaptureResult;
    }

    @Override // androidx.camera.core.processing.Packet
    public final CameraCaptureResult a() {
        return this.h;
    }

    @Override // androidx.camera.core.processing.Packet
    public final Rect b() {
        return this.e;
    }

    @Override // androidx.camera.core.processing.Packet
    public final Object c() {
        return this.f547a;
    }

    @Override // androidx.camera.core.processing.Packet
    public final Exif d() {
        return this.b;
    }

    @Override // androidx.camera.core.processing.Packet
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Packet)) {
            return false;
        }
        Packet packet = (Packet) obj;
        if (!this.f547a.equals(packet.c())) {
            return false;
        }
        Exif exif = this.b;
        if (exif == null) {
            if (packet.d() != null) {
                return false;
            }
        } else if (!exif.equals(packet.d())) {
            return false;
        }
        return this.c == packet.e() && this.d.equals(packet.h()) && this.e.equals(packet.b()) && this.f == packet.f() && this.g.equals(packet.g()) && this.h.equals(packet.a());
    }

    @Override // androidx.camera.core.processing.Packet
    public final int f() {
        return this.f;
    }

    @Override // androidx.camera.core.processing.Packet
    public final Matrix g() {
        return this.g;
    }

    @Override // androidx.camera.core.processing.Packet
    public final Size h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f547a.hashCode() ^ 1000003) * 1000003;
        Exif exif = this.b;
        return ((((((((((((iHashCode ^ (exif == null ? 0 : exif.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.f547a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
