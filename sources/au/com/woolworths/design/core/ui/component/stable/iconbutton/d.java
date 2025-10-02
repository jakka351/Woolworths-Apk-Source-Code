package au.com.woolworths.design.core.ui.component.stable.iconbutton;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContentKt;
import au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.CollapsingToolbarBackButtonKt;
import au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core.ComposableSingletons$CollapsingTopAppBarPreviewKt;
import au.com.woolworths.shop.cart.ui.shared.CartFooterKt;
import au.com.woolworths.shop.productcard.ui.components.WatchlistIconButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Modifier g;

    public /* synthetic */ d(Function0 function0, Modifier modifier, boolean z, int i) {
        this.d = 0;
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$CollapsingTopAppBarPreviewKt.f8930a;
        this.f = function0;
        this.g = modifier;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Modifier modifier = this.g;
        Function0 function0 = this.f;
        boolean z = this.e;
        switch (i) {
            case 0:
                ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$CollapsingTopAppBarPreviewKt.f8930a;
                ((Integer) obj2).getClass();
                IconButtonKt.a(RecomposeScopeImplKt.a(3079), (Composer) obj, modifier, function0, z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                WPayForOrderContentKt.a(RecomposeScopeImplKt.a(49), (Composer) obj, modifier, function0, z);
                break;
            case 2:
                ((Integer) obj2).getClass();
                CollapsingToolbarBackButtonKt.a(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, function0, z);
                break;
            case 3:
                ((Integer) obj2).getClass();
                CartFooterKt.b(RecomposeScopeImplKt.a(433), (Composer) obj, modifier, function0, z);
                break;
            default:
                ((Integer) obj2).getClass();
                WatchlistIconButtonKt.a(RecomposeScopeImplKt.a(55), (Composer) obj, modifier, function0, z);
                break;
        }
        return unit;
    }

    public /* synthetic */ d(boolean z, Modifier modifier, Function0 function0, int i) {
        this.d = 2;
        this.e = z;
        this.g = modifier;
        this.f = function0;
    }

    public /* synthetic */ d(boolean z, Function0 function0, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = z;
        this.f = function0;
        this.g = modifier;
    }
}
