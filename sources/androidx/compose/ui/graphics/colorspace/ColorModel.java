package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel;", "", "Companion", "packedValue", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ColorModel {

    /* renamed from: a, reason: collision with root package name */
    public static final long f1789a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final /* synthetic */ int e = 0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        long j = 3;
        long j2 = j << 32;
        f1789a = (0 & 4294967295L) | j2;
        b = (1 & 4294967295L) | j2;
        c = j2 | (2 & 4294967295L);
        d = (j & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        return a(j, f1789a) ? "Rgb" : a(j, b) ? "Xyz" : a(j, c) ? "Lab" : a(j, d) ? "Cmyk" : "Unknown";
    }

    public final boolean equals(Object obj) {
        return obj instanceof ColorModel;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return b(0L);
    }
}
