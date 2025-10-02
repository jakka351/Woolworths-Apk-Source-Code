package androidx.compose.ui.node;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/DistanceAndFlags;", "", "packedValue", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DistanceAndFlags {
    public static final int a(long j, long j2) {
        boolean zD = d(j);
        if (zD != d(j2)) {
            return zD ? -1 : 1;
        }
        return (Math.min(b(j), b(j2)) >= BitmapDescriptorFactory.HUE_RED && c(j) != c(j2)) ? c(j) ? -1 : 1 : (int) Math.signum(b(j) - b(j2));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean c(long j) {
        return (j & 2) != 0;
    }

    public static final boolean d(long j) {
        return (j & 1) != 0;
    }

    public final boolean equals(Object obj) {
        return obj instanceof DistanceAndFlags;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "DistanceAndFlags(packedValue=0)";
    }
}
