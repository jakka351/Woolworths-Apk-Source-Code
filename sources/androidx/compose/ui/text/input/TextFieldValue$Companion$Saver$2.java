package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.NonNullValueClassSaver;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/TextFieldValue;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TextFieldValue$Companion$Saver$2 extends Lambda implements Function1<Object, TextFieldValue> {
    public static final TextFieldValue$Companion$Saver$2 h = new TextFieldValue$Companion$Saver$2(1);

    public static TextFieldValue a(Object obj) {
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f2055a;
        Boolean bool = Boolean.FALSE;
        AnnotatedString annotatedString = ((!Intrinsics.c(obj2, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj2 != null) ? (AnnotatedString) saverKt$Saver$1.b.invoke(obj2) : null;
        Intrinsics.e(annotatedString);
        Object obj3 = list.get(1);
        int i = TextRange.c;
        SaverKt$Saver$1 saverKt$Saver$12 = SaversKt.p;
        TextRange textRange = ((!Intrinsics.c(obj3, bool) || (saverKt$Saver$12 instanceof NonNullValueClassSaver)) && obj3 != null) ? (TextRange) saverKt$Saver$12.b.invoke(obj3) : null;
        Intrinsics.e(textRange);
        return new TextFieldValue(annotatedString, textRange.f2067a, (TextRange) null);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(obj);
    }
}
