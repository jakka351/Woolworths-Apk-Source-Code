package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.SessionConfig;
import java.util.List;

/* loaded from: classes2.dex */
final class AutoValue_SessionConfig_OutputConfig extends SessionConfig.OutputConfig {

    /* renamed from: a, reason: collision with root package name */
    public final DeferrableSurface f466a;
    public final List b;
    public final int c;
    public final int d;
    public final DynamicRange e;

    public static final class Builder extends SessionConfig.OutputConfig.Builder {

        /* renamed from: a, reason: collision with root package name */
        public DeferrableSurface f467a;
        public List b;
        public Integer c;
        public Integer d;
        public DynamicRange e;

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public final SessionConfig.OutputConfig a() {
            String strG = this.f467a == null ? " surface" : "";
            if (this.b == null) {
                strG = strG.concat(" sharedSurfaces");
            }
            if (this.c == null) {
                strG = YU.a.g(strG, " mirrorMode");
            }
            if (this.d == null) {
                strG = YU.a.g(strG, " surfaceGroupId");
            }
            if (this.e == null) {
                strG = YU.a.g(strG, " dynamicRange");
            }
            if (strG.isEmpty()) {
                return new AutoValue_SessionConfig_OutputConfig(this.f467a, this.b, this.c.intValue(), this.d.intValue(), this.e);
            }
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }
    }

    public AutoValue_SessionConfig_OutputConfig(DeferrableSurface deferrableSurface, List list, int i, int i2, DynamicRange dynamicRange) {
        this.f466a = deferrableSurface;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = dynamicRange;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final DynamicRange b() {
        return this.e;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final int c() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final String d() {
        return null;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final List e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SessionConfig.OutputConfig)) {
            return false;
        }
        SessionConfig.OutputConfig outputConfig = (SessionConfig.OutputConfig) obj;
        return this.f466a.equals(outputConfig.f()) && this.b.equals(outputConfig.e()) && outputConfig.d() == null && this.c == outputConfig.c() && this.d == outputConfig.g() && this.e.equals(outputConfig.b());
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final DeferrableSurface f() {
        return this.f466a;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final int g() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((this.f466a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f466a + ", sharedSurfaces=" + this.b + ", physicalCameraId=null, mirrorMode=" + this.c + ", surfaceGroupId=" + this.d + ", dynamicRange=" + this.e + "}";
    }
}
