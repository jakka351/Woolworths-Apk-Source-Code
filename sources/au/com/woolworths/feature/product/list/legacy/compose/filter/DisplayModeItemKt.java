package au.com.woolworths.feature.product.list.legacy.compose.filter;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.wx.component.FilterChipKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.legacy.ProductsDisplayMode;
import au.com.woolworths.feature.product.list.legacy.ProductsDisplayModeKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DisplayModeItemKt {
    public static final void a(final ProductsDisplayMode item, boolean z, Function1 onDisplayModeClicked, Composer composer, int i) {
        int i2;
        boolean z2;
        ComposerImpl composerImpl;
        Intrinsics.h(item, "item");
        Intrinsics.h(onDisplayModeClicked, "onDisplayModeClicked");
        ComposerImpl composerImplV = composer.v(-1917084931);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(item.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= composerImplV.p(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onDisplayModeClicked) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Modifier modifierA = AspectRatioKt.a(Modifier.Companion.d, 3.8f);
            composerImplV.o(-1633490746);
            boolean z3 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objG = composerImplV.G();
            if (z3 || objG == Composer.Companion.f1624a) {
                objG = new androidx.navigation.compose.a(15, onDisplayModeClicked, item);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            FilterChipKt.a(true, z2, (Function0) objG, modifierA, null, 0L, 0L, null, null, null, ComposableLambdaKt.c(-1376342498, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.filter.DisplayModeItemKt$DisplayModeItem$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope FilterChip = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(FilterChip, "$this$FilterChip");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(FilterChip) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierA2 = FilterChip.a(Modifier.Companion.d, 1.0f, true);
                        BlendModeColorFilter blendModeColorFilterA = ColorFilter.Companion.a(WxTheme.a(composer2).c());
                        ProductsDisplayMode productsDisplayMode = item;
                        ImageKt.a(PainterResources_androidKt.a(ProductsDisplayModeKt.c(productsDisplayMode), 0, composer2), ProductsDisplayModeKt.b(productsDisplayMode, (Context) composer2.x(AndroidCompositionLocals_androidKt.b)), modifierA2, null, null, BitmapDescriptorFactory.HUE_RED, blendModeColorFilterA, composer2, 0, 56);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, (i2 & 112) | 3078, 48, 2032);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(item, z, onDisplayModeClicked, i, 1);
        }
    }
}
