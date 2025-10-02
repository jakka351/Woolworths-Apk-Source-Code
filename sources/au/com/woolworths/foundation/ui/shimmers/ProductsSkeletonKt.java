package au.com.woolworths.foundation.ui.shimmers;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.feature.rewards.account.settings.v2.ui.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shimmers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductsSkeletonKt {
    public static final void a(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-600196478);
        if (((i | 6) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$ProductsSkeletonKt.b;
            modifier2 = Modifier.Companion.d;
            composerImpl = composerImplV;
            CardKt.b((Function0) objG, modifier2, false, null, 0L, 0L, 0L, 0L, null, null, null, composableLambdaImpl, composerImpl, 54, 2044);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 29, modifier2);
        }
    }

    public static final void b(int i, int i2, Composer composer, Modifier modifier) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        ComposerImpl composerImplV = composer.v(-1002701737);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerImplV.n(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.Companion.d : modifier2;
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            PaddingValuesImpl paddingValuesImplA = PaddingKt.a(16, BitmapDescriptorFactory.HUE_RED, 2);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(12);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.foundation.shop.olive.voice.ui.search.a(15);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            modifier3 = modifier4;
            LazyDslKt.d(modifier3, lazyListStateA, paddingValuesImplA, false, spacedAlignedG, null, null, false, null, (Function1) objG, composerImplV, (i3 & 14) | 805331328, 488);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(modifier3, i, i2, 5);
        }
    }
}
