package au.com.woolworths.feature.shop.catalogue.listing.category;

import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CategoryListingActivity$onCreate$1$1$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableStateFlow mutableStateFlow = ((CategoryListingViewModel) this.receiver).g;
        mutableStateFlow.f(CategoryListingContract.ViewState.a((CategoryListingContract.ViewState) mutableStateFlow.getValue(), null, null, null, null, 31));
        return Unit.f24250a;
    }
}
