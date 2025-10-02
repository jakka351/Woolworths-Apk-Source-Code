package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;

/* loaded from: classes2.dex */
final class AutoValue_SurfaceSizeDefinition extends SurfaceSizeDefinition {

    /* renamed from: a, reason: collision with root package name */
    public final Size f470a;
    public final Map b;
    public final Size c;
    public final Map d;
    public final Size e;
    public final Map f;
    public final Map g;

    public AutoValue_SurfaceSizeDefinition(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f470a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.g = map4;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final Size b() {
        return this.f470a;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final Map c() {
        return this.f;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final Size d() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final Size e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceSizeDefinition)) {
            return false;
        }
        SurfaceSizeDefinition surfaceSizeDefinition = (SurfaceSizeDefinition) obj;
        return this.f470a.equals(surfaceSizeDefinition.b()) && this.b.equals(surfaceSizeDefinition.g()) && this.c.equals(surfaceSizeDefinition.d()) && this.d.equals(surfaceSizeDefinition.f()) && this.e.equals(surfaceSizeDefinition.e()) && this.f.equals(surfaceSizeDefinition.c()) && this.g.equals(surfaceSizeDefinition.h());
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final Map f() {
        return this.d;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final Map g() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final Map h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((this.f470a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f470a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", ultraMaximumSizeMap=" + this.g + "}";
    }
}
