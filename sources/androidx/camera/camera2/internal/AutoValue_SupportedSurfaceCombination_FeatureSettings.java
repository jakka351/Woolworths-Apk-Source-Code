package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.SupportedSurfaceCombination;

/* loaded from: classes2.dex */
final class AutoValue_SupportedSurfaceCombination_FeatureSettings extends SupportedSurfaceCombination.FeatureSettings {

    /* renamed from: a, reason: collision with root package name */
    public final int f226a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public AutoValue_SupportedSurfaceCombination_FeatureSettings(int i, int i2, boolean z, boolean z2) {
        this.f226a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public final int a() {
        return this.f226a;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public final int b() {
        return this.b;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public final boolean c() {
        return this.c;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SupportedSurfaceCombination.FeatureSettings)) {
            return false;
        }
        SupportedSurfaceCombination.FeatureSettings featureSettings = (SupportedSurfaceCombination.FeatureSettings) obj;
        return this.f226a == featureSettings.a() && this.b == featureSettings.b() && this.c == featureSettings.c() && this.d == featureSettings.d();
    }

    public final int hashCode() {
        return ((((((this.f226a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings{cameraMode=");
        sb.append(this.f226a);
        sb.append(", requiredMaxBitDepth=");
        sb.append(this.b);
        sb.append(", previewStabilizationOn=");
        sb.append(this.c);
        sb.append(", ultraHdrOn=");
        return YU.a.k("}", sb, this.d);
    }
}
