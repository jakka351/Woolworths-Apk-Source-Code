package au.com.woolworths.feature.shop.catalogue.listing.category;

import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CategoryListingActivity$onCreate$1$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CategoryListingActivity categoryListingActivity = (CategoryListingActivity) this.receiver;
        int i = CategoryListingActivity.A;
        categoryListingActivity.getClass();
        categoryListingActivity.startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
        return Unit.f24250a;
    }
}
