package com.halilibo.richtext.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                final RichTextScope richTextScope = (RichTextScope) obj;
                b bVar = FormattedListKt.d;
                Intrinsics.h(richTextScope, "<this>");
                final Function1[] function1Arr = {new b(2), new b(3), new b(4), new b(5)};
                final ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new Function4<Integer, Integer, Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.FormattedListKt$textOrderedMarkers$1
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i2;
                        int iIntValue = ((Number) obj2).intValue();
                        int iIntValue2 = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue3 = ((Number) obj5).intValue();
                        if ((iIntValue3 & 6) == 0) {
                            i2 = (composer.r(iIntValue) ? 4 : 2) | iIntValue3;
                        } else {
                            i2 = iIntValue3;
                        }
                        if ((iIntValue3 & 48) == 0) {
                            i2 |= composer.r(iIntValue2) ? 32 : 16;
                        }
                        if ((i2 & 147) == 146 && composer.c()) {
                            composer.j();
                        } else {
                            Function1[] function1Arr2 = function1Arr;
                            RichTextLocalsKt.b(richTextScope, (String) function1Arr2[iIntValue % function1Arr2.length].invoke(Integer.valueOf(iIntValue2)), null, null, 0, false, 0, composer, 0, 62);
                        }
                        return Unit.f24250a;
                    }
                }, true, -373393724);
                break;
            case 1:
                final RichTextScope richTextScope2 = (RichTextScope) obj;
                b bVar2 = FormattedListKt.d;
                Intrinsics.h(richTextScope2, "<this>");
                final String[] strArr = {"•", "◦", "▸", "▹"};
                final ComposableLambdaImpl composableLambdaImpl2 = new ComposableLambdaImpl(new Function3<Integer, Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.FormattedListKt$textUnorderedMarkers$1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int iIntValue = ((Number) obj2).intValue();
                        Composer composer = (Composer) obj3;
                        int iIntValue2 = ((Number) obj4).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= composer.r(iIntValue) ? 4 : 2;
                        }
                        if ((iIntValue2 & 19) == 18 && composer.c()) {
                            composer.j();
                        } else {
                            String[] strArr2 = strArr;
                            RichTextLocalsKt.b(richTextScope2, strArr2[iIntValue % strArr2.length], null, null, 0, false, 0, composer, 0, 62);
                        }
                        return Unit.f24250a;
                    }
                }, true, 15273025);
                break;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                b bVar3 = FormattedListKt.d;
                break;
            case 3:
                int iIntValue2 = ((Integer) obj).intValue();
                b bVar4 = FormattedListKt.d;
                break;
            case 4:
                int iIntValue3 = ((Integer) obj).intValue();
                b bVar5 = FormattedListKt.d;
                break;
            case 5:
                int iIntValue4 = ((Integer) obj).intValue();
                b bVar6 = FormattedListKt.d;
                break;
            case 6:
                Measurable marker = (Measurable) obj;
                Intrinsics.h(marker, "marker");
                break;
            case 7:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
                semantics.b(SemanticsProperties.h, unit);
                break;
            default:
                TextLayoutResult it = (TextLayoutResult) obj;
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = RichTextLocalsKt.f16288a;
                Intrinsics.h(it, "it");
                break;
        }
        return unit;
    }
}
