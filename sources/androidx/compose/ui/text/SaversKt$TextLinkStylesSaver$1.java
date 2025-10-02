package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/TextLinkStyles;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaversKt$TextLinkStylesSaver$1 extends Lambda implements Function2<SaverScope, TextLinkStyles, Object> {
    public static final SaversKt$TextLinkStylesSaver$1 h = new SaversKt$TextLinkStylesSaver$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        TextLinkStyles textLinkStyles = (TextLinkStyles) obj2;
        SpanStyle f2065a = textLinkStyles.getF2065a();
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.i;
        return CollectionsKt.k(SaversKt.a(f2065a, saverKt$Saver$1, saverScope), SaversKt.a(textLinkStyles.getB(), saverKt$Saver$1, saverScope), SaversKt.a(textLinkStyles.getC(), saverKt$Saver$1, saverScope), SaversKt.a(textLinkStyles.getD(), saverKt$Saver$1, saverScope));
    }
}
