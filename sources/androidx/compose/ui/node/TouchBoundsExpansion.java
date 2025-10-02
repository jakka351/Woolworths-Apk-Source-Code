package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion;", "", "Companion", "packedValue", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class TouchBoundsExpansion {

    /* renamed from: a, reason: collision with root package name */
    public static final long f1933a = Companion.c(0, 0, 0, 0);
    public static final /* synthetic */ int b = 0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion$Companion;", "", "", "IS_LAYOUT_DIRECTION_AWARE", "J", "", "MASK", "I", "MAX_VALUE", "SHIFT", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static final int a(int i, long j) {
            int i2 = TouchBoundsExpansion.b;
            return ((int) (j >> (i * 15))) & 32767;
        }

        public static long b() {
            return TouchBoundsExpansion.f1933a;
        }

        public static long c(int i, int i2, int i3, int i4) {
            return ((i2 & 32767) << 15) | (i & 32767) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
        }
    }

    public static final int a(long j, LayoutDirection layoutDirection) {
        return ((Long.MIN_VALUE & j) == 0 || layoutDirection == LayoutDirection.d) ? Companion.a(0, j) : Companion.a(2, j);
    }

    public static final int b(long j, LayoutDirection layoutDirection) {
        return ((Long.MIN_VALUE & j) == 0 || layoutDirection == LayoutDirection.d) ? Companion.a(2, j) : Companion.a(0, j);
    }

    public static final int c(long j) {
        return Companion.a(3, j);
    }

    public static final int d(long j) {
        return Companion.a(1, j);
    }

    public final boolean equals(Object obj) {
        return obj instanceof TouchBoundsExpansion;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "TouchBoundsExpansion(packedValue=0)";
    }
}
