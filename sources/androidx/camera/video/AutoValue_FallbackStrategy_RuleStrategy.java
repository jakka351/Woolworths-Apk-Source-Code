package androidx.camera.video;

import androidx.camera.video.FallbackStrategy;

/* loaded from: classes2.dex */
final class AutoValue_FallbackStrategy_RuleStrategy extends FallbackStrategy.RuleStrategy {
    public final Quality b;
    public final int c;

    public AutoValue_FallbackStrategy_RuleStrategy(Quality quality, int i) {
        if (quality == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.b = quality;
        this.c = i;
    }

    @Override // androidx.camera.video.FallbackStrategy.RuleStrategy
    public final Quality a() {
        return this.b;
    }

    @Override // androidx.camera.video.FallbackStrategy.RuleStrategy
    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FallbackStrategy.RuleStrategy)) {
            return false;
        }
        FallbackStrategy.RuleStrategy ruleStrategy = (FallbackStrategy.RuleStrategy) obj;
        return this.b.equals(ruleStrategy.a()) && this.c == ruleStrategy.b();
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.b);
        sb.append(", fallbackRule=");
        return YU.a.m(sb, this.c, "}");
    }
}
