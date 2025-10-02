package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/SpanStyle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaversKt$SpanStyleSaver$1 extends Lambda implements Function2<SaverScope, SpanStyle, Object> {
    public static final SaversKt$SpanStyleSaver$1 h = new SaversKt$SpanStyleSaver$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        SpanStyle spanStyle = (SpanStyle) obj2;
        Color color = new Color(spanStyle.f2058a.getF2150a());
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.r;
        Object objA = SaversKt.a(color, saversKt$NonNullValueClassSaver$1, saverScope);
        TextUnit textUnit = new TextUnit(spanStyle.fontSize);
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$12 = SaversKt.s;
        Object objA2 = SaversKt.a(textUnit, saversKt$NonNullValueClassSaver$12, saverScope);
        FontWeight fontWeight = spanStyle.fontWeight;
        FontWeight fontWeight2 = FontWeight.e;
        Object objA3 = SaversKt.a(fontWeight, SaversKt.n, saverScope);
        FontStyle fontStyle = spanStyle.fontStyle;
        FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
        String str = spanStyle.fontFeatureSettings;
        Object objA4 = SaversKt.a(new TextUnit(spanStyle.letterSpacing), saversKt$NonNullValueClassSaver$12, saverScope);
        Object objA5 = SaversKt.a(spanStyle.baselineShift, SaversKt.o, saverScope);
        Object objA6 = SaversKt.a(spanStyle.textGeometricTransform, SaversKt.l, saverScope);
        LocaleList localeList = spanStyle.localeList;
        LocaleList localeList2 = LocaleList.f;
        Object objA7 = SaversKt.a(localeList, SaversKt.u, saverScope);
        Object objA8 = SaversKt.a(new Color(spanStyle.l), saversKt$NonNullValueClassSaver$1, saverScope);
        Object objA9 = SaversKt.a(spanStyle.background, SaversKt.k, saverScope);
        Shadow shadow = spanStyle.shadow;
        Shadow shadow2 = Shadow.d;
        return CollectionsKt.k(objA, objA2, objA3, fontStyle, fontSynthesis, -1, str, objA4, objA5, objA6, objA7, objA8, objA9, SaversKt.a(shadow, SaversKt.q, saverScope));
    }
}
