package nl.dionsegijn.konfetti.core.models;

import android.support.v4.media.session.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lnl/dionsegijn/konfetti/core/models/Size;", "", "Companion", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Size {
    public static final Size c = new Size(4.0f, 6, 4);
    public static final Size d = new Size(BitmapDescriptorFactory.HUE_RED, 8, 6);
    public static final Size e = new Size(6.0f, 10, 4);

    /* renamed from: a, reason: collision with root package name */
    public final int f26647a;
    public final float b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/models/Size$Companion;", "", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public Size(float f, int i, int i2) {
        f = (i2 & 2) != 0 ? 5.0f : f;
        this.f26647a = i;
        this.b = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        throw new IllegalArgumentException(("mass=" + f + " must be != 0").toString());
    }

    public final boolean equals(Object obj) {
        Object objValueOf = Float.valueOf(0.2f);
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.f26647a == size.f26647a && Float.valueOf(this.b).equals(Float.valueOf(size.b)) && objValueOf.equals(objValueOf);
    }

    public final int hashCode() {
        return Float.hashCode(0.2f) + a.b(this.b, Integer.hashCode(this.f26647a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Size(sizeInDp=");
        sb.append(this.f26647a);
        sb.append(", mass=");
        return a.j(this.b, ", massVariance=0.2)", sb);
    }
}
