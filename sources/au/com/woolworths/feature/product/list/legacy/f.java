package au.com.woolworths.feature.product.list.legacy;

import androidx.compose.material.ModalBottomSheetState;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.product.models.DietaryDisclaimer;
import au.com.woolworths.product.models.DietaryInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                BuildersKt.c((CoroutineScope) this.e, null, null, new ComposeProductListActivity$initUi$1$1$1$1$1$1$1((ModalBottomSheetState) this.f, null), 3);
                break;
            default:
                DietaryDisclaimer dietaryDisclaimer = (DietaryDisclaimer) this.e;
                ProductListController productListController = (ProductListController) this.f;
                InsetBanner it = (InsetBanner) obj;
                Intrinsics.h(it, "it");
                DietaryInfo dietaryInfo = dietaryDisclaimer.getDietaryInfo();
                if (dietaryInfo != null) {
                    productListController.productListViewModel.v.f(new ProductListContract.Actions.LaunchNutritionInfo(dietaryInfo));
                }
                break;
        }
        return Unit.f24250a;
    }
}
