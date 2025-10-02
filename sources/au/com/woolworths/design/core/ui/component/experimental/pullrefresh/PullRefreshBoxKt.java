package au.com.woolworths.design.core.ui.component.experimental.pullrefresh;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PullRefreshBoxKt {
    public static final void a(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 onRefresh, final boolean z) {
        int i2;
        Intrinsics.h(onRefresh, "onRefresh");
        ComposerImpl composerImplV = composer.v(1938392712);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onRefresh) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final PullToRefreshStateImpl pullToRefreshStateImplD = PullToRefreshKt.d(composerImplV);
            PullToRefreshKt.a(z, onRefresh, modifier, pullToRefreshStateImplD, null, ComposableLambdaKt.c(1024223329, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.experimental.pullrefresh.PullRefreshBoxKt$PullRefreshBox$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxScope PullToRefreshBox = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(PullToRefreshBox, "$this$PullToRefreshBox");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(PullToRefreshBox) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        PullToRefreshDefaults.f1566a.a(pullToRefreshStateImplD, z, PullToRefreshBox.g(Modifier.Companion.d, Alignment.Companion.b), CoreTheme.b(composer2).e.f4848a.c, CoreTheme.b(composer2).f4782a.f4783a.b.b, BitmapDescriptorFactory.HUE_RED, composer2, 0, 32);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composableLambdaImpl, composerImplV, (i2 & 14) | 196608 | (i2 & 112) | (i2 & 896) | ((i2 << 9) & 3670016));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, composableLambdaImpl, modifier, onRefresh, z);
        }
    }
}
