package au.com.woolworths.feature.product.list.legacy.compose.filter.child;

import androidx.compose.ui.state.ToggleableState;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel;
import au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListChildFilterScreenKt$ProductListChildFilterScreen$2$2$1 extends FunctionReferenceImpl implements Function2<FilterMenuItem, ToggleableState, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FilterMenuItem p0 = (FilterMenuItem) obj;
        ToggleableState p1 = (ToggleableState) obj2;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        ((ProductListOptionsViewModel) this.receiver).V0(p0, p1);
        return Unit.f24250a;
    }
}
