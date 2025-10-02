package au.com.woolworths.feature.shop.recipes.details.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsScreenKt;
import au.com.woolworths.shared.ui.compose.breadcrumb.ProgressStepItemsKt;
import au.com.woolworths.shop.ratingsandreviews.ui.shared.RatingDistributionChartKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Modifier f;

    public /* synthetic */ i(List list, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = list;
        this.f = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                RecipeDetailsFeaturesKt.b(this.e, this.f, composer, RecomposeScopeImplKt.a(49));
                break;
            case 1:
                StoreDetailsScreenKt.d(this.e, this.f, composer, RecomposeScopeImplKt.a(49));
                break;
            case 2:
                StoreDetailsScreenKt.m(this.e, this.f, composer, RecomposeScopeImplKt.a(49));
                break;
            case 3:
                au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsScreenKt.d(this.e, this.f, composer, RecomposeScopeImplKt.a(49));
                break;
            case 4:
                au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsScreenKt.m(this.e, this.f, composer, RecomposeScopeImplKt.a(49));
                break;
            case 5:
                ProgressStepItemsKt.b(this.e, this.f, composer, RecomposeScopeImplKt.a(55));
                break;
            default:
                RatingDistributionChartKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
