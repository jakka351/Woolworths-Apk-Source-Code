package au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.shop.cart.ui.cart.l;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.DateItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DateSelectorKt {
    public static final void a(ArrayList arrayList, Modifier modifier, Function1 onDateClicked, Composer composer, int i) {
        Intrinsics.h(onDateClicked, "onDateClicked");
        ComposerImpl composerImplV = composer.v(1433836114);
        int i2 = (composerImplV.I(arrayList) ? 4 : 2) | i;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onDateClicked) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (((DateItem) it.next()).e) {
                    break;
                } else {
                    i3++;
                }
            }
            int iR1 = ((Density) composerImplV.x(CompositionLocalsKt.h)).r1(32);
            Integer numValueOf = Integer.valueOf(i3);
            composerImplV.o(-1746271574);
            boolean zN = composerImplV.n(lazyListStateA) | composerImplV.r(i3) | composerImplV.r(iR1);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (zN || objG == obj) {
                objG = new DateSelectorKt$DateSelector$1$1(lazyListStateA, i3, iR1, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, numValueOf, (Function2) objG);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(12);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(arrayList);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == obj) {
                objG2 = new l(15, arrayList, onDateClicked);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            LazyDslKt.d(modifier, lazyListStateA, null, false, spacedAlignedG, null, null, false, null, (Function1) objG2, composerImplV, 24582, 492);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(arrayList, modifier, onDateClicked, i, 20);
        }
    }
}
