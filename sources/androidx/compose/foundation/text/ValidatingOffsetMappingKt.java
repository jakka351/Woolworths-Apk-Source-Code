package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ValidatingOffsetMappingKt {

    /* renamed from: a, reason: collision with root package name */
    public static final OffsetMapping f1145a = new ValidatingOffsetMapping(OffsetMapping.Companion.f2121a, 0, 0);

    public static final TransformedText a(VisualTransformation visualTransformation, AnnotatedString annotatedString) {
        TransformedText transformedTextA = visualTransformation.a(annotatedString);
        int length = annotatedString.e.length();
        AnnotatedString annotatedString2 = transformedTextA.f2132a;
        OffsetMapping offsetMapping = transformedTextA.b;
        int length2 = annotatedString2.e.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(offsetMapping.b(i), length2, i);
        }
        b(offsetMapping.b(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(offsetMapping.a(i2), length, i2);
        }
        c(offsetMapping.a(length2), length, length2);
        return new TransformedText(annotatedString2, new ValidatingOffsetMapping(offsetMapping, annotatedString.e.length(), annotatedString2.e.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbQ = YU.a.q(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbQ.append(i2);
        sbQ.append(']');
        InlineClassHelperKt.c(sbQ.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbQ = YU.a.q(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbQ.append(i2);
        sbQ.append(']');
        InlineClassHelperKt.c(sbQ.toString());
    }
}
