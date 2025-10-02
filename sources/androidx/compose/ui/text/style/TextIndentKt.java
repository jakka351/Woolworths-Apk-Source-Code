package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextIndentKt {
    public static final TextIndent a(TextIndent textIndent, TextIndent textIndent2, float f) {
        return new TextIndent(SpanStyleKt.c(textIndent.f2161a, f, textIndent2.f2161a), SpanStyleKt.c(textIndent.b, f, textIndent2.b));
    }
}
