package au.com.woolworths.shop.aem.components.ui.buttonsection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.b;
import au.com.woolworths.sdui.common.button.ButtonKt;
import au.com.woolworths.shop.aem.components.model.buttonsection.ButtonSectionData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonSectionKt {
    public static final void a(ButtonSectionData buttonSectionData, Function1 onButtonClick, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(onButtonClick, "onButtonClick");
        ComposerImpl composerImplV = composer.v(1755049350);
        int i2 = (composerImplV.I(buttonSectionData) ? 4 : 2) | i | (composerImplV.I(onButtonClick) ? 32 : 16);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ButtonKt.a(buttonSectionData.f10146a, onButtonClick, SizeKt.e(modifier, 1.0f), composerImplV, (i2 & 112) | 8);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(buttonSectionData, onButtonClick, modifier, i, 20);
        }
    }
}
