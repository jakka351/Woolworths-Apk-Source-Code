package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StringAnnotationKt {
    public static final AnnotatedString.Range a(AnnotatedString.Range range) {
        Object obj = range.f2032a;
        Intrinsics.f(obj, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
        return new AnnotatedString.Range(range.b, range.c, ((StringAnnotation) obj).f2060a, range.d);
    }
}
