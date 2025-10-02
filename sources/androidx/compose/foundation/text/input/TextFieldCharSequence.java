package androidx.compose.foundation.text.input;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldCharSequence implements CharSequence {
    public final List d;
    public final CharSequence e;
    public final long f;
    public final TextRange g;
    public final Pair h;

    public TextFieldCharSequence(CharSequence charSequence, long j, TextRange textRange, List list, int i) {
        textRange = (i & 4) != 0 ? null : textRange;
        this.d = (i & 16) != 0 ? null : list;
        this.e = charSequence instanceof TextFieldCharSequence ? ((TextFieldCharSequence) charSequence).e : charSequence;
        this.f = TextRangeKt.b(charSequence.length(), j);
        this.g = textRange != null ? new TextRange(TextRangeKt.b(charSequence.length(), textRange.f2067a)) : null;
        this.h = null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.e.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextFieldCharSequence.class != obj.getClass()) {
            return false;
        }
        TextFieldCharSequence textFieldCharSequence = (TextFieldCharSequence) obj;
        if (TextRange.b(this.f, textFieldCharSequence.f) && Intrinsics.c(this.g, textFieldCharSequence.g) && Intrinsics.c(this.h, textFieldCharSequence.h) && Intrinsics.c(this.d, textFieldCharSequence.d)) {
            return StringsKt.q(this.e, textFieldCharSequence.e);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.e.hashCode() * 31;
        int i = TextRange.c;
        int iB = b.b(iHashCode, 31, this.f);
        TextRange textRange = this.g;
        int iHashCode2 = (iB + (textRange != null ? Long.hashCode(textRange.f2067a) : 0)) * 31;
        Pair pair = this.h;
        int iHashCode3 = (iHashCode2 + (pair != null ? pair.hashCode() : 0)) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.e.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.e.toString();
    }
}
