package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToCharArray_androidKt {
    public static final void a(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof TextFieldCharSequence) {
            a(((TextFieldCharSequence) charSequence).e, cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }
}
