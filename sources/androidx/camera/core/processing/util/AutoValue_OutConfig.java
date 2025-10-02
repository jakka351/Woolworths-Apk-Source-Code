package androidx.camera.core.processing.util;

import YU.a;
import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes2.dex */
final class AutoValue_OutConfig extends OutConfig {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f559a;
    public final int b;
    public final int c;
    public final Rect d;
    public final Size e;
    public final int f;
    public final boolean g;

    public AutoValue_OutConfig(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f559a = uuid;
        this.b = i;
        this.c = i2;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.e = size;
        this.f = i3;
        this.g = z;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final Rect a() {
        return this.d;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final int b() {
        return this.c;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final int c() {
        return this.f;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final Size d() {
        return this.e;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutConfig)) {
            return false;
        }
        OutConfig outConfig = (OutConfig) obj;
        return this.f559a.equals(outConfig.f()) && this.b == outConfig.e() && this.c == outConfig.b() && this.d.equals(outConfig.a()) && this.e.equals(outConfig.d()) && this.f == outConfig.c() && this.g == outConfig.g() && !outConfig.i();
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final UUID f() {
        return this.f559a;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((this.f559a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ 1237;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final boolean i() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.f559a);
        sb.append(", getTargets=");
        sb.append(this.b);
        sb.append(", getFormat=");
        sb.append(this.c);
        sb.append(", getCropRect=");
        sb.append(this.d);
        sb.append(", getSize=");
        sb.append(this.e);
        sb.append(", getRotationDegrees=");
        sb.append(this.f);
        sb.append(", isMirroring=");
        return a.k(", shouldRespectInputCropRect=false}", sb, this.g);
    }
}
