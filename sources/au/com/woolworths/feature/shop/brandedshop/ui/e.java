package au.com.woolworths.feature.shop.brandedshop.ui;

import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.brandedshop.data.SnackbarContent;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Function1 g;

    public /* synthetic */ e(int i, int i2, Object obj, Object obj2, Function1 function1) {
        this.d = i2;
        this.e = obj;
        this.f = obj2;
        this.g = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(7);
                BrandedShopHomeKt.c((SnackbarHostState) this.e, (SnackbarContent) this.f, this.g, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                BrandedShopHorizontalListKt.a((HorizontalListData) this.e, (au.com.woolworths.design.wx.component.searchbar.a) this.f, (au.com.woolworths.design.wx.component.searchbar.a) this.g, (Composer) obj, RecomposeScopeImplKt.a(9));
                break;
        }
        return Unit.f24250a;
    }
}
