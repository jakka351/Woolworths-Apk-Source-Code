package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class WatchlistIconKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(int r21, int r22, androidx.compose.runtime.Composer r23, androidx.compose.ui.Modifier r24, kotlin.jvm.functions.Function0 r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.composeui.WatchlistIconKt.a(int, int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, boolean):void");
    }

    public static final void b(int i, Composer composer, Modifier modifier, Function0 onWatchlistClick, boolean z) {
        int i2;
        Pair pair;
        Modifier modifier2;
        Intrinsics.h(onWatchlistClick, "onWatchlistClick");
        ComposerImpl composerImplV = composer.v(-1744743811);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onWatchlistClick) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            if (z) {
                composerImplV.o(31545650);
                pair = new Pair(StringResources_androidKt.c(composerImplV, R.string.remove_from_watchlist_description), CoreTheme.e(composerImplV).f4879a.l);
                composerImplV.V(false);
            } else {
                composerImplV.o(31665434);
                pair = new Pair(StringResources_androidKt.c(composerImplV, R.string.save_to_watchlist_description), CoreTheme.e(composerImplV).f4879a.k);
                composerImplV.V(false);
            }
            String str = (String) pair.d;
            modifier2 = Modifier.Companion.d;
            IconButtonKt.c((ImageVector) pair.e, str, onWatchlistClick, modifier2, false, null, 0L, composerImplV, (i3 << 3) & 8064, 112);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new q(z, onWatchlistClick, modifier2, i, 0);
        }
    }
}
