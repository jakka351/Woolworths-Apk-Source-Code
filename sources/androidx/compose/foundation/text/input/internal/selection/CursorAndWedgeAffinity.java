package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;", "", "value", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CursorAndWedgeAffinity {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1178a;

        static {
            int[] iArr = new int[WedgeAffinity.values().length];
            try {
                WedgeAffinity wedgeAffinity = WedgeAffinity.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WedgeAffinity wedgeAffinity2 = WedgeAffinity.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1178a = iArr;
        }
    }

    public static final WedgeAffinity a(long j) {
        int i = (int) (j & 4294967295L);
        if (i < 0) {
            return null;
        }
        return i == 0 ? WedgeAffinity.d : WedgeAffinity.e;
    }

    public static long b(int i, WedgeAffinity wedgeAffinity) {
        int i2 = WhenMappings.f1178a[wedgeAffinity.ordinal()];
        int i3 = -1;
        if (i2 != -1) {
            i3 = 1;
            if (i2 == 1) {
                i3 = 0;
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return (i << 32) | (i3 & 4294967295L);
    }

    public final boolean equals(Object obj) {
        return obj instanceof CursorAndWedgeAffinity;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "CursorAndWedgeAffinity(value=0)";
    }
}
