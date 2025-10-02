package au.com.woolworths.feature.shop.catalogue.listing.category.ui;

import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.PromotionListingScreenKt;
import au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function0;
import me.onebone.toolbar.CollapsingToolbarScaffoldState;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ CollapsingToolbarScaffoldState e;

    public /* synthetic */ h(CollapsingToolbarScaffoldState collapsingToolbarScaffoldState, int i) {
        this.d = i;
        this.e = collapsingToolbarScaffoldState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        CollapsingToolbarScaffoldState collapsingToolbarScaffoldState = this.e;
        switch (i) {
            case 0:
                float f = CategoryListingScreenKt.b;
                return Boolean.valueOf(collapsingToolbarScaffoldState.f24914a.j() == BitmapDescriptorFactory.HUE_RED);
            case 1:
                float f2 = PromotionListingScreenKt.b;
                return Boolean.valueOf(collapsingToolbarScaffoldState.f24914a.j() == BitmapDescriptorFactory.HUE_RED);
            default:
                float f3 = InstoreCartScreenKt.f7322a;
                return Boolean.valueOf(collapsingToolbarScaffoldState.f24914a.j() == BitmapDescriptorFactory.HUE_RED);
        }
    }
}
