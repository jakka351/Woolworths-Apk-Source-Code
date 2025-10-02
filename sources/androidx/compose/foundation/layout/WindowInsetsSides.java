package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides;", "", "Companion", "value", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class WindowInsetsSides {

    /* renamed from: a, reason: collision with root package name */
    public static final int f987a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 15;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides$Companion;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public static String a(int i) {
        StringBuilder sb = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb2 = new StringBuilder();
        int i2 = f987a;
        if ((i & i2) == i2) {
            b(sb2, "Start");
        }
        int i3 = c;
        if ((i & i3) == i3) {
            b(sb2, "Left");
        }
        if ((i & 16) == 16) {
            b(sb2, "Top");
        }
        int i4 = b;
        if ((i & i4) == i4) {
            b(sb2, "End");
        }
        int i5 = d;
        if ((i & i5) == i5) {
            b(sb2, "Right");
        }
        if ((i & 32) == 32) {
            b(sb2, "Bottom");
        }
        String string = sb2.toString();
        Intrinsics.g(string, "toString(...)");
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }

    public static final void b(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public final boolean equals(Object obj) {
        return obj instanceof WindowInsetsSides;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return a(0);
    }
}
