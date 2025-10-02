package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/ParagraphStyle;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SaversKt$ParagraphStyleSaver$2 extends Lambda implements Function1<Object, ParagraphStyle> {
    public static final SaversKt$ParagraphStyleSaver$2 h = new SaversKt$ParagraphStyleSaver$2(1);

    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextMotion textMotion = null;
        TextAlign textAlign = obj2 != null ? (TextAlign) obj2 : null;
        Intrinsics.e(textAlign);
        int i = textAlign.f2156a;
        Object obj3 = list.get(1);
        TextDirection textDirection = obj3 != null ? (TextDirection) obj3 : null;
        Intrinsics.e(textDirection);
        int i2 = textDirection.f2158a;
        Object obj4 = list.get(2);
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.s;
        Boolean bool = Boolean.FALSE;
        TextUnit textUnit = ((Intrinsics.c(obj4, bool) && saversKt$NonNullValueClassSaver$1 == null) || obj4 == null) ? null : (TextUnit) saversKt$NonNullValueClassSaver$1.b.invoke(obj4);
        Intrinsics.e(textUnit);
        long j = textUnit.f2204a;
        Object obj5 = list.get(3);
        TextIndent textIndent = TextIndent.c;
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.m;
        TextIndent textIndent2 = ((!Intrinsics.c(obj5, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj5 != null) ? (TextIndent) saverKt$Saver$1.b.invoke(obj5) : null;
        Object obj6 = list.get(4);
        SaverKt$Saver$1 saverKt$Saver$1A = Savers_androidKt.a();
        PlatformParagraphStyle platformParagraphStyle = ((!Intrinsics.c(obj6, bool) || (saverKt$Saver$1A instanceof NonNullValueClassSaver)) && obj6 != null) ? (PlatformParagraphStyle) saverKt$Saver$1A.b.invoke(obj6) : null;
        Object obj7 = list.get(5);
        LineHeightStyle lineHeightStyle = LineHeightStyle.c;
        SaverKt$Saver$1 saverKt$Saver$12 = SaversKt.w;
        LineHeightStyle lineHeightStyle2 = ((!Intrinsics.c(obj7, bool) || (saverKt$Saver$12 instanceof NonNullValueClassSaver)) && obj7 != null) ? (LineHeightStyle) saverKt$Saver$12.b.invoke(obj7) : null;
        Object obj8 = list.get(6);
        SaverKt$Saver$1 saverKt$Saver$1B = Savers_androidKt.b();
        LineBreak lineBreak = ((!Intrinsics.c(obj8, bool) || (saverKt$Saver$1B instanceof NonNullValueClassSaver)) && obj8 != null) ? (LineBreak) saverKt$Saver$1B.b.invoke(obj8) : null;
        Intrinsics.e(lineBreak);
        int i3 = lineBreak.f2152a;
        Object obj9 = list.get(7);
        Hyphens hyphens = obj9 != null ? (Hyphens) obj9 : null;
        Intrinsics.e(hyphens);
        int i4 = hyphens.f2151a;
        Object obj10 = list.get(8);
        SaverKt$Saver$1 saverKt$Saver$1C = Savers_androidKt.c();
        if ((!Intrinsics.c(obj10, bool) || (saverKt$Saver$1C instanceof NonNullValueClassSaver)) && obj10 != null) {
            textMotion = (TextMotion) saverKt$Saver$1C.b.invoke(obj10);
        }
        return new ParagraphStyle(i, i2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, i3, i4, textMotion);
    }
}
