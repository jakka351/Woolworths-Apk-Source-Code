package au.com.woolworths.shop.buyagain.ui.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.navigation.fragment.e;
import au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-buy-again_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FilterChipsKt {
    public static final void a(List list, Function1 onChipClick, boolean z, CoachMarkState filterCoachMarkState, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        ComposerImpl composerImpl;
        Intrinsics.h(onChipClick, "onChipClick");
        Intrinsics.h(filterCoachMarkState, "filterCoachMarkState");
        ComposerImpl composerImplV = composer.v(-1463745814);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onChipClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerImplV.n(filterCoachMarkState) : composerImplV.I(filterCoachMarkState) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = SizeKt.A(companion, (3 & 1) != 0 ? Alignment.Companion.n : Alignment.Companion.o, false);
            Intrinsics.h(modifierA, "<this>");
            Modifier modifierA2 = OnGloballyPositionedModifierKt.a(modifierA, new e(filterCoachMarkState, 11));
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(8);
            float f = 16;
            PaddingValuesImpl paddingValuesImplB = PaddingKt.b(f, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 10);
            composerImplV.o(-1746271574);
            boolean zI = ((i3 & 896) == 256) | composerImplV.I(list) | ((i3 & 112) == 32);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.product.list.compose.facets.a(list, z, onChipClick, 2);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            modifier2 = companion;
            composerImpl = composerImplV;
            LazyDslKt.d(modifierA2, null, paddingValuesImplB, false, spacedAlignedG, null, null, false, null, (Function1) objG, composerImpl, 24960, 490);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.a(list, onChipClick, z, filterCoachMarkState, modifier2, i);
        }
    }
}
