package au.com.woolworths.feature.shop.recipes.freshmag.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.a;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shared.ui.compose.shop.CartIconButtonKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FreshMagTopNavBarKt {
    public static final void a(final Integer num, final Function0 onCartClicked, final Function0 onNavigateUp, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImpl;
        Modifier modifier2;
        Intrinsics.h(onCartClicked, "onCartClicked");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(-1054901745);
        if (((i | (composerImplV.n(num) ? 4 : 2) | (composerImplV.I(onCartClicked) ? 32 : 16) | (composerImplV.I(onNavigateUp) ? 256 : 128) | 3072) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            String strC = StringResources_androidKt.c(composerImplV, R.string.freshmag_toolbar_title);
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-1202060579, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.ui.FreshMagTopNavBarKt$FreshMagTopNavBar$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer2, R.string.content_description_back_button), onNavigateUp, null, false, null, 0L, composer2, 0, 120);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            ComposableLambdaImpl composableLambdaImplC2 = ComposableLambdaKt.c(-264894714, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.ui.FreshMagTopNavBarKt$FreshMagTopNavBar$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope TopNavBar = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(TopNavBar, "$this$TopNavBar");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        Integer num2 = num;
                        if (num2 != null) {
                            CartIconButtonKt.a(Integer.valueOf(num2.intValue()), onCartClicked, null, CoreTheme.b(composer2).e.c.f4854a, composer2, 0, 4);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            Modifier.Companion companion = Modifier.Companion.d;
            composerImpl = composerImplV;
            TopNavBarKt.a(strC, companion, 0L, 0L, 0L, null, null, composableLambdaImplC, composableLambdaImplC2, composerImpl, 905969712, 252);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a((Object) num, (Object) onCartClicked, (Object) onNavigateUp, modifier2, i, 19);
        }
    }
}
