package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InputState_androidKt {
    public static final ExtractedText a(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        String str = textFieldValue.f2127a.e;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = textFieldValue.b;
        extractedText.selectionStart = TextRange.f(j);
        extractedText.selectionEnd = TextRange.e(j);
        extractedText.flags = !StringsKt.p(textFieldValue.f2127a.e, '\n') ? 1 : 0;
        return extractedText;
    }
}
