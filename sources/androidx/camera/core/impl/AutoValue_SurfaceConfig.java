package androidx.camera.core.impl;

import androidx.camera.core.impl.SurfaceConfig;

/* loaded from: classes2.dex */
final class AutoValue_SurfaceConfig extends SurfaceConfig {

    /* renamed from: a, reason: collision with root package name */
    public final SurfaceConfig.ConfigType f469a;
    public final SurfaceConfig.ConfigSize b;
    public final long c;

    public AutoValue_SurfaceConfig(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, long j) {
        this.f469a = configType;
        this.b = configSize;
        this.c = j;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public final SurfaceConfig.ConfigSize c() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public final SurfaceConfig.ConfigType d() {
        return this.f469a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
        return this.f469a.equals(surfaceConfig.d()) && this.b.equals(surfaceConfig.c()) && this.c == surfaceConfig.f();
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public final long f() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = (((this.f469a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        sb.append(this.f469a);
        sb.append(", configSize=");
        sb.append(this.b);
        sb.append(", streamUseCase=");
        return android.support.v4.media.session.a.l(this.c, "}", sb);
    }
}
