package com.halilibo.richtext.ui;

import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ c(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                b bVar = FormattedListKt.d;
                return 0;
            case 1:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = RichTextLocalsKt.f16288a;
                return TextStyle.d;
            case 2:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = RichTextStyleKt.f16291a;
                return RichTextStyle.i;
            default:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal3 = RichTextThemeConfigurationKt.f16293a;
                return new RichTextThemeConfiguration();
        }
    }
}
