package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/TextLinkStyles;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SaversKt$TextLinkStylesSaver$2 extends Lambda implements Function1<Object, TextLinkStyles> {
    public static final SaversKt$TextLinkStylesSaver$2 h = new SaversKt$TextLinkStylesSaver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.i;
        Boolean bool = Boolean.FALSE;
        SpanStyle spanStyle = null;
        SpanStyle spanStyle2 = ((!Intrinsics.c(obj2, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj2 != null) ? (SpanStyle) saverKt$Saver$1.b.invoke(obj2) : null;
        Object obj3 = list.get(1);
        SpanStyle spanStyle3 = ((!Intrinsics.c(obj3, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj3 != null) ? (SpanStyle) saverKt$Saver$1.b.invoke(obj3) : null;
        Object obj4 = list.get(2);
        SpanStyle spanStyle4 = ((!Intrinsics.c(obj4, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj4 != null) ? (SpanStyle) saverKt$Saver$1.b.invoke(obj4) : null;
        Object obj5 = list.get(3);
        if ((!Intrinsics.c(obj5, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj5 != null) {
            spanStyle = (SpanStyle) saverKt$Saver$1.b.invoke(obj5);
        }
        return new TextLinkStyles(spanStyle2, spanStyle3, spanStyle4, spanStyle);
    }
}
