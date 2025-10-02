package au.com.woolworths.shop.receipts;

import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class ShopReceiptListActivity$onCreate$1$1$4$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ShopReceiptListActivity shopReceiptListActivity = (ShopReceiptListActivity) this.receiver;
        int i = ShopReceiptListActivity.y;
        shopReceiptListActivity.getClass();
        shopReceiptListActivity.startActivity(ActivityNavigatorKt.a(Activities.MyOrders.f4491a, ApplicationType.e));
        return Unit.f24250a;
    }
}
