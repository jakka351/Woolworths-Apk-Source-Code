package androidx.camera.video;

import androidx.camera.video.Quality;
import java.util.List;

/* loaded from: classes2.dex */
final class AutoValue_Quality_ConstantQuality extends Quality.ConstantQuality {
    public final int j;
    public final String k;
    public final List l;

    public AutoValue_Quality_ConstantQuality(String str, int i, List list) {
        this.j = i;
        this.k = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.l = list;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    public final String a() {
        return this.k;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    public final List b() {
        return this.l;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    public final int c() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Quality.ConstantQuality)) {
            return false;
        }
        Quality.ConstantQuality constantQuality = (Quality.ConstantQuality) obj;
        return this.j == constantQuality.c() && this.k.equals(constantQuality.a()) && this.l.equals(constantQuality.b());
    }

    public final int hashCode() {
        return ((((this.j ^ 1000003) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConstantQuality{value=");
        sb.append(this.j);
        sb.append(", name=");
        sb.append(this.k);
        sb.append(", typicalSizes=");
        return android.support.v4.media.session.a.t(sb, this.l, "}");
    }
}
