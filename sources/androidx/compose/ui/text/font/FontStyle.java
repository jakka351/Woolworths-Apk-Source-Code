package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/font/FontStyle;", "", "Companion", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class FontStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f2098a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/FontStyle$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public static String a(int i) {
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FontStyle) {
            return this.f2098a == ((FontStyle) obj).f2098a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2098a);
    }

    public final String toString() {
        return a(this.f2098a);
    }
}
