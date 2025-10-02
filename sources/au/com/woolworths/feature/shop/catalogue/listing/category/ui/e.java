package au.com.woolworths.feature.shop.catalogue.listing.category.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.PromotionListingScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ e(int i, int i2, long j) {
        this.d = i2;
        this.e = j;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                CategoryListingScreenKt.g(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
            default:
                PromotionListingScreenKt.g(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
        }
        return Unit.f24250a;
    }
}
