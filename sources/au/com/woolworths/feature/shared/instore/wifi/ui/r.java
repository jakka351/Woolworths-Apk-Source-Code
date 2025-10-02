package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.editorder.review.components.CmoReviewContentScreenKt;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ r(int i) {
        this.d = 2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        int i2 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                JoinInStoreWifiScreenKt.d(i2, RecomposeScopeImplKt.a(1), (Composer) obj);
                return unit;
            case 1:
                ((Integer) obj2).getClass();
                CmoReviewContentScreenKt.d(i2, RecomposeScopeImplKt.a(1), (Composer) obj);
                return unit;
            default:
                ((Integer) obj).intValue();
                ProductReviewCard productReviewCard = (ProductReviewCard) obj2;
                Timber.Forest forest = ProductReviewScreenKt.f10526a;
                Intrinsics.h(productReviewCard, "productReviewCard");
                return "banner_" + i2 + "_" + productReviewCard.b;
        }
    }

    public /* synthetic */ r(int i, int i2, int i3) {
        this.d = i3;
        this.e = i;
    }
}
