package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryMethodsTooltip;
import au.com.woolworths.feature.shop.myorders.details.models.StarCount;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(Object obj, int i, int i2, Object obj2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ApplicableDeliveryMethodScreenKt.a((DeliveryMethodsTooltip) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                CurrentDeliveryOrderOverviewItemKt.f((List) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                CurrentPickupOrderOverviewItemKt.b((ButtonApiData) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                DriverRatingSectionItemKt.e((StarCount) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                OrderHorizontalListItemKt.d((ArrayList) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                PickupOrderFulfilmentDetailsItemKt.a((String) this.f, (List) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
        }
        return Unit.f24250a;
    }
}
