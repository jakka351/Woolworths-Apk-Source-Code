package au.com.woolworths.shop.checkout.ui.timeselector.compose.timeofdayselector;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.component.experimental.chip.ToggleChipKt;
import au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipSelectionType;
import au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipVariant;
import au.com.woolworths.feature.shop.inbox.ui.component.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimeOfDayItemKt {
    public static final void a(boolean z, String label, ImageVector leadingIcon, Function0 onClick, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        Intrinsics.h(label, "label");
        Intrinsics.h(leadingIcon, "leadingIcon");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-2083220996);
        if ((i & 6) == 0) {
            i3 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(label) ? 32 : 16;
        }
        int i5 = i3 | (composerImplV.n(leadingIcon) ? 256 : 128);
        if ((i & 3072) == 0) {
            i5 |= composerImplV.I(onClick) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i4 = i5 | 24576;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i5 | (composerImplV.n(modifier2) ? 16384 : 8192);
        }
        if ((i4 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i6 != 0 ? Modifier.Companion.d : modifier2;
            int i7 = i4 << 9;
            ToggleChipKt.a(z, label, null, ChipSelectionType.d, ChipVariant.e, onClick, modifier4, z ? "selected" : "not selected", leadingIcon, Arrangement.e, composerImplV, (i4 & 14) | 224640 | (i4 & 112) | (3670016 & i7) | (i7 & 29360128) | ((i4 << 21) & 1879048192), 6, 0);
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(z, label, leadingIcon, onClick, modifier3, i, i2);
        }
    }
}
