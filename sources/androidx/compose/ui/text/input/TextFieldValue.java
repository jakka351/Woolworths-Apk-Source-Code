package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldValue {
    public static final SaverKt$Saver$1 d;

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f2127a;
    public final long b;
    public final TextRange c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f1701a;
        d = new SaverKt$Saver$1(TextFieldValue$Companion$Saver$2.h, TextFieldValue$Companion$Saver$1.h);
    }

    public TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange) {
        TextRange textRange2;
        this.f2127a = annotatedString;
        this.b = TextRangeKt.b(annotatedString.e.length(), j);
        if (textRange != null) {
            textRange2 = new TextRange(TextRangeKt.b(annotatedString.e.length(), textRange.f2067a));
        } else {
            textRange2 = null;
        }
        this.c = textRange2;
    }

    public static TextFieldValue a(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j, int i) {
        if ((i & 1) != 0) {
            annotatedString = textFieldValue.f2127a;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.b;
        }
        TextRange textRange = (i & 4) != 0 ? textFieldValue.c : null;
        textFieldValue.getClass();
        return new TextFieldValue(annotatedString, j, textRange);
    }

    public static TextFieldValue b(TextFieldValue textFieldValue, String str, long j, int i) {
        if ((i & 2) != 0) {
            j = textFieldValue.b;
        }
        TextRange textRange = textFieldValue.c;
        textFieldValue.getClass();
        return new TextFieldValue(new AnnotatedString(str), j, textRange);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return TextRange.b(this.b, textFieldValue.b) && Intrinsics.c(this.c, textFieldValue.c) && Intrinsics.c(this.f2127a, textFieldValue.f2127a);
    }

    public final int hashCode() {
        int iHashCode = this.f2127a.hashCode() * 31;
        int i = TextRange.c;
        int iB = androidx.camera.core.impl.b.b(iHashCode, 31, this.b);
        TextRange textRange = this.c;
        return iB + (textRange != null ? Long.hashCode(textRange.f2067a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f2127a) + "', selection=" + ((Object) TextRange.h(this.b)) + ", composition=" + this.c + ')';
    }

    public TextFieldValue(String str, long j, int i) {
        this(new AnnotatedString((i & 1) != 0 ? "" : str), (i & 2) != 0 ? TextRange.b : j, (TextRange) null);
    }
}
