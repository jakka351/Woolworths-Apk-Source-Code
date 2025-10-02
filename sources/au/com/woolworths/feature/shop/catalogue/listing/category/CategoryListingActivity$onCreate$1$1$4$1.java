package au.com.woolworths.feature.shop.catalogue.listing.category;

import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CategoryListingActivity$onCreate$1$1$4$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        CategoryListingViewModel categoryListingViewModel = (CategoryListingViewModel) this.receiver;
        categoryListingViewModel.getClass();
        categoryListingViewModel.h.k(new CategoryListingContract.Action.LaunchViewShoppingList(p0));
        return Unit.f24250a;
    }
}
