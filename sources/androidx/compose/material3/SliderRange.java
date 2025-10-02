package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/SliderRange;", "", "Companion", "packedValue", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SliderRange {

    /* renamed from: a, reason: collision with root package name */
    public static final long f1500a = SliderKt.c(Float.NaN, Float.NaN);
    public static final /* synthetic */ int b = 0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/SliderRange$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public static final float a(long j) {
        if (j != f1500a) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    public static final float b(long j) {
        if (j != f1500a) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof SliderRange) && 0 == 0;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        float f = SliderKt.f1498a;
        if (0 == f1500a) {
            return "FloatRange.Unspecified";
        }
        return b(0L) + ".." + a(0L);
    }
}
