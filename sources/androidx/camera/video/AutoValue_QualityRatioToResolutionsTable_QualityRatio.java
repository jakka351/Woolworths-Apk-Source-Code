package androidx.camera.video;

import androidx.camera.video.QualityRatioToResolutionsTable;

/* loaded from: classes2.dex */
final class AutoValue_QualityRatioToResolutionsTable_QualityRatio extends QualityRatioToResolutionsTable.QualityRatio {

    /* renamed from: a, reason: collision with root package name */
    public final Quality f582a;
    public final int b;

    public AutoValue_QualityRatioToResolutionsTable_QualityRatio(Quality quality, int i) {
        if (quality == null) {
            throw new NullPointerException("Null quality");
        }
        this.f582a = quality;
        this.b = i;
    }

    @Override // androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio
    public final int a() {
        return this.b;
    }

    @Override // androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio
    public final Quality b() {
        return this.f582a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QualityRatioToResolutionsTable.QualityRatio)) {
            return false;
        }
        QualityRatioToResolutionsTable.QualityRatio qualityRatio = (QualityRatioToResolutionsTable.QualityRatio) obj;
        return this.f582a.equals(qualityRatio.b()) && this.b == qualityRatio.a();
    }

    public final int hashCode() {
        return ((this.f582a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.f582a);
        sb.append(", aspectRatio=");
        return YU.a.m(sb, this.b, "}");
    }
}
