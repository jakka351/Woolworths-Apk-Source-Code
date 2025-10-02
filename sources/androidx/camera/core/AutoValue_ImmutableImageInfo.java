package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.TagBundle;

/* loaded from: classes2.dex */
final class AutoValue_ImmutableImageInfo extends ImmutableImageInfo {

    /* renamed from: a, reason: collision with root package name */
    public final TagBundle f388a;
    public final long b;
    public final int c;
    public final Matrix d;

    public AutoValue_ImmutableImageInfo(TagBundle tagBundle, long j, int i, Matrix matrix) {
        if (tagBundle == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f388a = tagBundle;
        this.b = j;
        this.c = i;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.d = matrix;
    }

    @Override // androidx.camera.core.ImageInfo
    public final TagBundle a() {
        return this.f388a;
    }

    @Override // androidx.camera.core.ImageInfo
    public final int c() {
        return this.c;
    }

    @Override // androidx.camera.core.ImmutableImageInfo
    public final Matrix e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableImageInfo)) {
            return false;
        }
        ImmutableImageInfo immutableImageInfo = (ImmutableImageInfo) obj;
        AutoValue_ImmutableImageInfo autoValue_ImmutableImageInfo = (AutoValue_ImmutableImageInfo) immutableImageInfo;
        return this.f388a.equals(autoValue_ImmutableImageInfo.f388a) && this.b == autoValue_ImmutableImageInfo.b && this.c == autoValue_ImmutableImageInfo.c && this.d.equals(immutableImageInfo.e());
    }

    @Override // androidx.camera.core.ImageInfo
    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.f388a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f388a + ", timestamp=" + this.b + ", rotationDegrees=" + this.c + ", sensorToBufferTransformMatrix=" + this.d + "}";
    }
}
