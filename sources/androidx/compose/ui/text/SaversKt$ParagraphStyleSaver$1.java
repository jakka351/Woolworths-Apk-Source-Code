package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/ParagraphStyle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaversKt$ParagraphStyleSaver$1 extends Lambda implements Function2<SaverScope, ParagraphStyle, Object> {
    public static final SaversKt$ParagraphStyleSaver$1 h = new SaversKt$ParagraphStyleSaver$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj2;
        TextAlign textAlign = new TextAlign(paragraphStyle.f2049a);
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f2055a;
        TextDirection textDirection = new TextDirection(paragraphStyle.b);
        Object objA = SaversKt.a(new TextUnit(paragraphStyle.c), SaversKt.s, saverScope);
        TextIndent textIndent = paragraphStyle.d;
        TextIndent textIndent2 = TextIndent.c;
        Object objA2 = SaversKt.a(textIndent, SaversKt.m, saverScope);
        Object objA3 = SaversKt.a(paragraphStyle.e, Savers_androidKt.a(), saverScope);
        LineHeightStyle lineHeightStyle = paragraphStyle.f;
        LineHeightStyle lineHeightStyle2 = LineHeightStyle.c;
        return CollectionsKt.k(textAlign, textDirection, objA, objA2, objA3, SaversKt.a(lineHeightStyle, SaversKt.w, saverScope), SaversKt.a(new LineBreak(paragraphStyle.g), Savers_androidKt.b(), saverScope), new Hyphens(paragraphStyle.h), SaversKt.a(paragraphStyle.i, Savers_androidKt.c(), saverScope));
    }
}
