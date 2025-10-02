package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImeEditCommand_androidKt {
    public static final void a(TextFieldBuffer textFieldBuffer, int i, int i2) {
        TextRange textRange = textFieldBuffer.h;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        textFieldBuffer.b(iMin, iMax, "", 0, 0);
        if (textRange != null) {
            long jA = TextFieldBufferKt.a(iMin, iMax, 0, textRange.f2067a);
            if (TextRange.c(jA)) {
                textFieldBuffer.d(null);
            } else {
                textFieldBuffer.c(TextRange.f(jA), TextRange.e(jA), null);
            }
        }
    }

    public static final void b(TextFieldBuffer textFieldBuffer, int i, int i2, CharSequence charSequence) {
        TextFieldBuffer textFieldBuffer2;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i3 = 0;
        int i4 = iMin;
        while (i4 < iMax && i3 < charSequence.length() && charSequence.charAt(i3) == textFieldBuffer.e.charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        int i5 = iMax;
        while (i5 > i4 && length > i3 && charSequence.charAt(length - 1) == textFieldBuffer.e.charAt(i5 - 1)) {
            length--;
            i5--;
        }
        if (i4 == i5 && i3 == length) {
            textFieldBuffer.d(null);
            textFieldBuffer2 = textFieldBuffer;
        } else {
            CharSequence charSequenceSubSequence = charSequence.subSequence(i3, length);
            textFieldBuffer.getClass();
            textFieldBuffer2 = textFieldBuffer;
            textFieldBuffer2.b(i4, i5, charSequenceSubSequence, 0, charSequenceSubSequence.length());
        }
        int length2 = charSequence.length() + iMin;
        textFieldBuffer2.e(TextRangeKt.a(length2, length2));
    }
}
