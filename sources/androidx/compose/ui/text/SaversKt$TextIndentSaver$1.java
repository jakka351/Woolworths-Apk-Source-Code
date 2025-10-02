package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/style/TextIndent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaversKt$TextIndentSaver$1 extends Lambda implements Function2<SaverScope, TextIndent, Object> {
    public static final SaversKt$TextIndentSaver$1 h = new SaversKt$TextIndentSaver$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        TextIndent textIndent = (TextIndent) obj2;
        TextUnit textUnit = new TextUnit(textIndent.f2161a);
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.s;
        return CollectionsKt.k(SaversKt.a(textUnit, saversKt$NonNullValueClassSaver$1, saverScope), SaversKt.a(new TextUnit(textIndent.b), saversKt$NonNullValueClassSaver$1, saverScope));
    }
}
