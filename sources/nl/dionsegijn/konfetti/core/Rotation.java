package nl.dionsegijn.konfetti.core;

import android.support.v4.media.session.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lnl/dionsegijn/konfetti/core/Rotation;", "", "Companion", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Rotation {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/Rotation$Companion;", "", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        Object objValueOf = Float.valueOf(1.5f);
        Object objValueOf2 = Float.valueOf(8.0f);
        Object objValueOf3 = Float.valueOf(0.5f);
        Object objValueOf4 = Float.valueOf(1.0f);
        if (this == obj) {
            return true;
        }
        return (obj instanceof Rotation) && objValueOf4.equals(objValueOf4) && objValueOf3.equals(objValueOf3) && objValueOf2.equals(objValueOf2) && objValueOf.equals(objValueOf);
    }

    public final int hashCode() {
        return Float.hashCode(1.5f) + a.b(8.0f, a.b(0.5f, a.b(1.0f, 31, 31), 31), 31);
    }

    public final String toString() {
        return "Rotation(enabled=true, speed=1.0, variance=0.5, multiplier2D=8.0, multiplier3D=1.5)";
    }
}
