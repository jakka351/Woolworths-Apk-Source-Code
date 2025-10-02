package androidx.collection;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0004*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0002\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0003\"\u00020\u00002\u00020\u0000¨\u0006\u0004"}, d2 = {"", "Bitmask", "Group", "StaticBitmask", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ScatterMapKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f699a = {-9187201950435737345L, -1};
    public static final MutableScatterMap b = new MutableScatterMap(0);

    public static final int a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final MutableScatterMap b() {
        return new MutableScatterMap();
    }

    public static final int c(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int d(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int e(int i) {
        if (i == 7) {
            return 8;
        }
        return a.D(i, 1, 7, i);
    }
}
