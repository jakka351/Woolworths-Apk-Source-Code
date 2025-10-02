package au.com.woolworths.feature.shop.catalogue.listing.category.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.paging.LoadState;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.PromotionListingScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ LoadState.Error e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ c(LoadState.Error error, Function0 function0, int i, int i2) {
        this.d = i2;
        this.e = error;
        this.f = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                CategoryListingScreenKt.b(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                PromotionDetailsScreenKt.c(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                PromotionListingScreenKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
