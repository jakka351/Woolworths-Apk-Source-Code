package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/TextIndent;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SaversKt$TextIndentSaver$2 extends Lambda implements Function1<Object, TextIndent> {
    public static final SaversKt$TextIndentSaver$2 h = new SaversKt$TextIndentSaver$2(1);

    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.s;
        Boolean bool = Boolean.FALSE;
        TextUnit textUnit = null;
        TextUnit textUnit2 = ((Intrinsics.c(obj2, bool) && saversKt$NonNullValueClassSaver$1 == null) || obj2 == null) ? null : (TextUnit) saversKt$NonNullValueClassSaver$1.b.invoke(obj2);
        Intrinsics.e(textUnit2);
        long j = textUnit2.f2204a;
        Object obj3 = list.get(1);
        if ((!Intrinsics.c(obj3, bool) || saversKt$NonNullValueClassSaver$1 != null) && obj3 != null) {
            textUnit = (TextUnit) saversKt$NonNullValueClassSaver$1.b.invoke(obj3);
        }
        Intrinsics.e(textUnit);
        return new TextIndent(j, textUnit.f2204a);
    }
}
