package au.com.woolworths.shop.productcard.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.d;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WatchlistIconButtonKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 onWatchlistClick, boolean z) {
        Pair pair;
        Modifier modifier2;
        Intrinsics.h(onWatchlistClick, "onWatchlistClick");
        ComposerImpl composerImplV = composer.v(-399335449);
        if (((i | KyberEngine.KyberPolyBytes) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            if (z) {
                composerImplV.o(457251720);
                pair = new Pair(StringResources_androidKt.c(composerImplV, R.string.remove_from_watchlist_description), CoreTheme.e(composerImplV).f4879a.l);
                composerImplV.V(false);
            } else {
                composerImplV.o(457371504);
                pair = new Pair(StringResources_androidKt.c(composerImplV, R.string.save_to_watchlist_description), CoreTheme.e(composerImplV).f4879a.k);
                composerImplV.V(false);
            }
            String str = (String) pair.d;
            ImageVector imageVector = (ImageVector) pair.e;
            long j = CoreTheme.b(composerImplV).e.c.f4854a;
            IconButtonSpec.Size size = IconButtonSpec.Size.g;
            modifier2 = Modifier.Companion.d;
            IconButtonKt.c(imageVector, str, onWatchlistClick, modifier2, false, size, j, composerImplV, 200064, 16);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(z, onWatchlistClick, modifier2, i, 4);
        }
    }
}
