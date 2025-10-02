package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextIndent {
    public static final TextIndent c = new TextIndent(TextUnitKt.c(0), TextUnitKt.c(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f2161a;
    public final long b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public TextIndent(long j, long j2) {
        this.f2161a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) obj;
        return TextUnit.a(this.f2161a, textIndent.f2161a) && TextUnit.a(this.b, textIndent.b);
    }

    public final int hashCode() {
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f2161a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.e(this.f2161a)) + ", restLine=" + ((Object) TextUnit.e(this.b)) + ')';
    }
}
