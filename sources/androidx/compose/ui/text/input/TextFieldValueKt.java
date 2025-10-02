package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldValueKt {
    public static final AnnotatedString a(TextFieldValue textFieldValue) {
        AnnotatedString annotatedString = textFieldValue.f2127a;
        long j = textFieldValue.b;
        annotatedString.getClass();
        return annotatedString.subSequence(TextRange.f(j), TextRange.e(j));
    }

    public static final AnnotatedString b(TextFieldValue textFieldValue, int i) {
        AnnotatedString annotatedString = textFieldValue.f2127a;
        long j = textFieldValue.b;
        return annotatedString.subSequence(TextRange.e(j), Math.min(TextRange.e(j) + i, textFieldValue.f2127a.e.length()));
    }

    public static final AnnotatedString c(TextFieldValue textFieldValue, int i) {
        AnnotatedString annotatedString = textFieldValue.f2127a;
        long j = textFieldValue.b;
        return annotatedString.subSequence(Math.max(0, TextRange.f(j) - i), TextRange.f(j));
    }
}
