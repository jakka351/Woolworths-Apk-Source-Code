package au.com.woolworths.sdui.legacy.banner.designcoreadapter;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.buyagain.ui.composable.ProductTileSkeletonKt;
import au.com.woolworths.shop.checkout.ui.common.component.WappleLoadingScreenKt;
import au.com.woolworths.shop.lists.ui.snapalist.ui.SnapAListLottieKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;

    public /* synthetic */ a(int i, int i2, Modifier modifier) {
        this.d = i2;
        this.e = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                StandardAlertKt.b(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                ProductTileSkeletonKt.b(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 2:
                ProductTileSkeletonKt.d(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 3:
                ProductTileSkeletonKt.e(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 4:
                ProductTileSkeletonKt.c(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 5:
                WappleLoadingScreenKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                SnapAListLottieKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
