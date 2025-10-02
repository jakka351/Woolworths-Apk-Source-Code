package au.com.woolworths.foundation.shop.editorder.data;

import au.com.woolworths.foundation.shop.editorder.EditOrderStatusQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"edit-order_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EditOrderStatusQueryEditOrderStatusExtKt {
    public static final EditOrderStatus a(EditOrderStatusQuery.EditOrderStatus editOrderStatus) {
        EditOrderDetails editOrderDetails;
        Intrinsics.h(editOrderStatus, "<this>");
        int iOrdinal = editOrderStatus.f8727a.ordinal();
        EditOrderMode editOrderMode = iOrdinal != 0 ? iOrdinal != 1 ? EditOrderMode.NOT_EDITING : EditOrderMode.NOT_EDITING : EditOrderMode.EDITING;
        EditOrderStatusQuery.Details details = editOrderStatus.b;
        if (details != null) {
            String str = details.f8726a;
            EditOrderStatusQuery.Banner banner = details.b;
            String str2 = banner.f8723a;
            String str3 = banner.b;
            String str4 = banner.c;
            EditOrderStatusQuery.Confirmation confirmation = banner.d;
            editOrderDetails = new EditOrderDetails(str, new EditOrderBanner(str2, str3, str4, new EditOrderConfirmation(confirmation.f8724a, confirmation.b)));
        } else {
            editOrderDetails = null;
        }
        EditOrderStatusQuery.Message message = editOrderStatus.c;
        return new EditOrderStatus(editOrderMode, editOrderDetails, message != null ? new EditOrderMessage(message.f8728a, message.b, message.c) : null);
    }
}
