package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection;", "", "Companion", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class TextDirection {

    /* renamed from: a, reason: collision with root package name */
    public final int f2158a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public static String a(int i) {
        return i == 1 ? "Ltr" : i == 2 ? "Rtl" : i == 3 ? "Content" : i == 4 ? "ContentOrLtr" : i == 5 ? "ContentOrRtl" : i == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextDirection) {
            return this.f2158a == ((TextDirection) obj).f2158a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2158a);
    }

    public final String toString() {
        return a(this.f2158a);
    }
}
