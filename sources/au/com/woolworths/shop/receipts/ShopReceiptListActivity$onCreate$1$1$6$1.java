package au.com.woolworths.shop.receipts;

import android.content.Intent;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class ShopReceiptListActivity$onCreate$1$1$6$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        ShopReceiptListActivity shopReceiptListActivity = (ShopReceiptListActivity) this.receiver;
        int i = ShopReceiptListActivity.y;
        shopReceiptListActivity.getClass();
        Activities.SharedEReceiptDetails.ReceiptDetailsExtras receiptDetailsExtras = new Activities.SharedEReceiptDetails.ReceiptDetailsExtras(p0);
        Intent intent = new Intent(shopReceiptListActivity, (Class<?>) EReceiptDetailsActivity.class);
        intent.putExtra("EXTRA_DATA", receiptDetailsExtras);
        shopReceiptListActivity.startActivity(intent);
        return Unit.f24250a;
    }
}
