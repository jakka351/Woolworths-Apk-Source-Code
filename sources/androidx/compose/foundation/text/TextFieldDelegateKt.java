package androidx.compose.foundation.text;

import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldDelegateKt {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1129a = StringsKt.P(10, "H");

    public static final long a(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i) {
        AndroidParagraph androidParagraphA = ParagraphKt.a(str, textStyle, ConstraintsKt.b(0, 0, 15), density, resolver, i, 64);
        return (TextDelegateKt.a(androidParagraphA.f2030a.b()) << 32) | (TextDelegateKt.a(androidParagraphA.d()) & 4294967295L);
    }
}
