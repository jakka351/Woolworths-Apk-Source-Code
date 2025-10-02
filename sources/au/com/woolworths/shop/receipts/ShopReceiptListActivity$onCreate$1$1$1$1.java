package au.com.woolworths.shop.receipts;

import au.com.woolworths.shop.receipts.ReceiptListContract;
import au.com.woolworths.shop.receipts.data.ReceiptListItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class ShopReceiptListActivity$onCreate$1$1$1$1 extends FunctionReferenceImpl implements Function1<ReceiptListItem, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ReceiptListItem p0 = (ReceiptListItem) obj;
        Intrinsics.h(p0, "p0");
        ShopReceiptListViewModel shopReceiptListViewModel = (ShopReceiptListViewModel) this.receiver;
        shopReceiptListViewModel.getClass();
        shopReceiptListViewModel.g.f(new ReceiptListContract.Action.OpenReceiptDetails(p0.f12869a));
        return Unit.f24250a;
    }
}
