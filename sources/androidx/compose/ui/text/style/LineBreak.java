package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Immutable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0088\u0001\u0006\u0092\u0001\u00020\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak;", "", "Companion", "Strategy", "Strictness", "WordBreak", "mask", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class LineBreak {
    public static final int b = 66305;

    /* renamed from: a, reason: collision with root package name */
    public final int f2152a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy;", "", "Companion", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Strategy {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            return obj instanceof Strategy;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "Strategy.Unspecified";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness;", "", "Companion", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Strictness {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
        }

        public static String a(int i) {
            return i == 1 ? "Strictness.None" : i == 2 ? "Strictness.Loose" : i == 3 ? "Strictness.Normal" : i == 4 ? "Strictness.Strict" : i == 0 ? "Strictness.Unspecified" : "Invalid";
        }

        public final boolean equals(Object obj) {
            return obj instanceof Strictness;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return a(0);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "", "Companion", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class WordBreak {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            return obj instanceof WordBreak;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "WordBreak.Unspecified";
        }
    }

    public static int a(int i) {
        int i2 = (i >> 8) & 255;
        return (((i >> 16) & 255) << 16) | (i2 << 8) | 3;
    }

    public static String b(int i) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i2 = i & 255;
        String str = "Invalid";
        sb.append((Object) (i2 == 1 ? "Strategy.Simple" : i2 == 2 ? "Strategy.HighQuality" : i2 == 3 ? "Strategy.Balanced" : i2 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        sb.append((Object) Strictness.a((i >> 8) & 255));
        sb.append(", wordBreak=");
        int i3 = (i >> 16) & 255;
        if (i3 == 1) {
            str = "WordBreak.None";
        } else if (i3 == 2) {
            str = "WordBreak.Phrase";
        } else if (i3 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LineBreak) {
            return this.f2152a == ((LineBreak) obj).f2152a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2152a);
    }

    public final String toString() {
        return b(this.f2152a);
    }
}
