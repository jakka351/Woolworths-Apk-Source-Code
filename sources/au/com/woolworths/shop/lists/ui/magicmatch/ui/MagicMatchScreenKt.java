package au.com.woolworths.shop.lists.ui.magicmatch.ui;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MagicMatchScreenKt {
    public static final void a(final MagicMatchContract.ViewState viewState, final byte[] bitmapByteArray, final MagicMatchContract.Listener listener, Composer composer, int i) {
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(bitmapByteArray, "bitmapByteArray");
        ComposerImpl composerImplV = composer.v(-100608571);
        if (((i | (composerImplV.n(viewState) ? 4 : 2) | (composerImplV.I(bitmapByteArray) ? 32 : 16) | (composerImplV.n(listener) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ScaffoldKt.a(SizeKt.c, null, null, null, 0L, null, ComposableLambdaKt.c(-1935381166, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.ui.MagicMatchScreenKt$MagicMatchScreen$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        MagicMatchScreenKt.b(viewState, bitmapByteArray, listener, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582918, 126);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(viewState, bitmapByteArray, listener, i, 0);
        }
    }

    public static final void b(MagicMatchContract.ViewState viewState, byte[] bitmapByteArray, MagicMatchContract.Listener listener, Composer composer, int i) {
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(bitmapByteArray, "bitmapByteArray");
        ComposerImpl composerImplV = composer.v(-981057591);
        int i2 = i | (composerImplV.n(viewState) ? 4 : 2) | (composerImplV.I(bitmapByteArray) ? 32 : 16) | (composerImplV.n(listener) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            SurfaceKt.b(SizeKt.c, null, 0L, 0L, null, null, ComposableSingletons$MagicMatchScreenKt.f12363a, composerImplV, 62);
            if (viewState.f12356a) {
                composerImplV.o(5004770);
                boolean z = (i2 & 896) == 256;
                Object objG = composerImplV.G();
                if (z || objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.shop.cart.ui.c(listener, 18);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                MagicMatchLoadingScreenKt.a(bitmapByteArray, (Function0) objG, composerImplV, (i2 >> 3) & 14);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(viewState, bitmapByteArray, listener, i, 1);
        }
    }
}
