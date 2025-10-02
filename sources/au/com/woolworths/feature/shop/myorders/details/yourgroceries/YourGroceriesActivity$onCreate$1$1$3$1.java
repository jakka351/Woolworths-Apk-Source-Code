package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.feature.shop.myorders.details.analytics.YourGroceriesActions;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class YourGroceriesActivity$onCreate$1$1$3$1 extends FunctionReferenceImpl implements Function1<YourGroceriesFilterGroupItem.YourGroceriesFilterItem, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        YourGroceriesFilterGroupItem.YourGroceriesFilterItem filter = (YourGroceriesFilterGroupItem.YourGroceriesFilterItem) obj;
        Intrinsics.h(filter, "p0");
        YourGroceriesViewModel yourGroceriesViewModel = (YourGroceriesViewModel) this.receiver;
        yourGroceriesViewModel.getClass();
        Intrinsics.h(filter, "filter");
        BuildersKt.c(ViewModelKt.a(yourGroceriesViewModel), null, null, new YourGroceriesViewModel$onFullfilmentFilterSelected$1(yourGroceriesViewModel, filter, null), 3);
        yourGroceriesViewModel.f.j(YourGroceriesActions.f, TrackingMetadata.Companion.a(TrackableValue.q0, filter.b));
        return Unit.f24250a;
    }
}
