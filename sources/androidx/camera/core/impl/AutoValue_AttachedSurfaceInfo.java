package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import java.util.List;

/* loaded from: classes2.dex */
final class AutoValue_AttachedSurfaceInfo extends AttachedSurfaceInfo {

    /* renamed from: a, reason: collision with root package name */
    public final SurfaceConfig f457a;
    public final int b;
    public final Size c;
    public final DynamicRange d;
    public final List e;
    public final Config f;
    public final Range g;

    public AutoValue_AttachedSurfaceInfo(SurfaceConfig surfaceConfig, int i, Size size, DynamicRange dynamicRange, List list, Config config, Range range) {
        if (surfaceConfig == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f457a = surfaceConfig;
        this.b = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.c = size;
        if (dynamicRange == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.d = dynamicRange;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.e = list;
        this.f = config;
        this.g = range;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final List b() {
        return this.e;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final DynamicRange c() {
        return this.d;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final int d() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final Config e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttachedSurfaceInfo)) {
            return false;
        }
        AttachedSurfaceInfo attachedSurfaceInfo = (AttachedSurfaceInfo) obj;
        if (!this.f457a.equals(attachedSurfaceInfo.g()) || this.b != attachedSurfaceInfo.d() || !this.c.equals(attachedSurfaceInfo.f()) || !this.d.equals(attachedSurfaceInfo.c()) || !this.e.equals(attachedSurfaceInfo.b())) {
            return false;
        }
        Config config = this.f;
        if (config == null) {
            if (attachedSurfaceInfo.e() != null) {
                return false;
            }
        } else if (!config.equals(attachedSurfaceInfo.e())) {
            return false;
        }
        Range range = this.g;
        return range == null ? attachedSurfaceInfo.h() == null : range.equals(attachedSurfaceInfo.h());
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final Size f() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final SurfaceConfig g() {
        return this.f457a;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final Range h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f457a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        Config config = this.f;
        int iHashCode2 = (iHashCode ^ (config == null ? 0 : config.hashCode())) * 1000003;
        Range range = this.g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f457a + ", imageFormat=" + this.b + ", size=" + this.c + ", dynamicRange=" + this.d + ", captureTypes=" + this.e + ", implementationOptions=" + this.f + ", targetFrameRate=" + this.g + "}";
    }
}
