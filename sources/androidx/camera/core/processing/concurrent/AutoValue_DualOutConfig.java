package androidx.camera.core.processing.concurrent;

import androidx.camera.core.processing.util.OutConfig;

/* loaded from: classes2.dex */
final class AutoValue_DualOutConfig extends DualOutConfig {

    /* renamed from: a, reason: collision with root package name */
    public final OutConfig f553a;
    public final OutConfig b;

    public AutoValue_DualOutConfig(OutConfig outConfig, OutConfig outConfig2) {
        this.f553a = outConfig;
        this.b = outConfig2;
    }

    @Override // androidx.camera.core.processing.concurrent.DualOutConfig
    public final OutConfig a() {
        return this.f553a;
    }

    @Override // androidx.camera.core.processing.concurrent.DualOutConfig
    public final OutConfig b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DualOutConfig)) {
            return false;
        }
        DualOutConfig dualOutConfig = (DualOutConfig) obj;
        return this.f553a.equals(dualOutConfig.a()) && this.b.equals(dualOutConfig.b());
    }

    public final int hashCode() {
        return ((this.f553a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f553a + ", secondaryOutConfig=" + this.b + "}";
    }
}
