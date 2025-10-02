package au.com.woolworths.feature.shop.myorders.details;

import android.os.Parcelable;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((OrderDetailsController) obj).analyticsManager.c(OrderDetailsActions.i);
                return unit;
            case 1:
                ((OrderDetailsController) obj).analyticsManager.c(OrderDetailsActions.f);
                return unit;
            case 2:
                ((OrderDetailsController) obj).analyticsManager.c(OrderDetailsActions.T);
                return unit;
            case 3:
                ((OrderDetailsController) obj).analyticsManager.c(OrderDetailsActions.R);
                return unit;
            case 4:
                ((OrderDetailsController) obj).analyticsManager.c(OrderDetailsActions.O);
                return unit;
            case 5:
                ((OrderDetailsController) obj).analyticsManager.c(OrderDetailsActions.i);
                return unit;
            case 6:
                ((OrderDetailsController) obj).analyticsManager.c(OrderDetailsActions.f);
                return unit;
            default:
                int i2 = OrderDetailsActivity.N;
                Parcelable parcelableExtra = ((OrderDetailsActivity) obj).getIntent().getParcelableExtra("EXTRA_DATA");
                if (parcelableExtra != null) {
                    return (Activities.OrderDetails.Extras) parcelableExtra;
                }
                throw new IllegalArgumentException("Required value was null.");
        }
    }
}
