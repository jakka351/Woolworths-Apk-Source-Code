package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/DateVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DateVisualTransformation implements VisualTransformation {

    /* renamed from: a, reason: collision with root package name */
    public final DateInputFormat f1436a;
    public final int b;
    public final int c;
    public final int d;
    public final DateVisualTransformation$dateOffsetTranslator$1 e;

    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(DateInputFormat dateInputFormat) {
        this.f1436a = dateInputFormat;
        String str = dateInputFormat.f1553a;
        char c = dateInputFormat.b;
        this.b = StringsKt.B(str, c, 0, 6);
        this.c = StringsKt.G(str, c, 0, 6);
        this.d = dateInputFormat.c.length();
        this.e = new OffsetMapping() { // from class: androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int a(int i) {
                DateVisualTransformation dateVisualTransformation = this.f1437a;
                if (i <= dateVisualTransformation.b - 1) {
                    return i;
                }
                if (i <= dateVisualTransformation.c - 1) {
                    return i - 1;
                }
                int i2 = dateVisualTransformation.d;
                return i <= i2 + 1 ? i - 2 : i2;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int b(int i) {
                DateVisualTransformation dateVisualTransformation = this.f1437a;
                if (i < dateVisualTransformation.b) {
                    return i;
                }
                if (i < dateVisualTransformation.c) {
                    return i + 1;
                }
                int i2 = dateVisualTransformation.d;
                return i <= i2 ? i + 2 : i2 + 2;
            }
        };
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText a(AnnotatedString annotatedString) {
        String strSubstring = annotatedString.e;
        int length = strSubstring.length();
        int i = 0;
        int i2 = this.d;
        if (length > i2) {
            IntRange range = RangesKt.o(0, i2);
            Intrinsics.h(strSubstring, "<this>");
            Intrinsics.h(range, "range");
            strSubstring = strSubstring.substring(range.d, range.e + 1);
            Intrinsics.g(strSubstring, "substring(...)");
        }
        String string = "";
        int i3 = 0;
        while (i < strSubstring.length()) {
            int i4 = i3 + 1;
            string = string + strSubstring.charAt(i);
            if (i4 == this.b || i3 + 2 == this.c) {
                StringBuilder sbS = YU.a.s(string);
                sbS.append(this.f1436a.b);
                string = sbS.toString();
            }
            i++;
            i3 = i4;
        }
        return new TransformedText(new AnnotatedString(6, string, null), this.e);
    }
}
