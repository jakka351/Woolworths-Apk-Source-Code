package au.com.woolworths.foundation.shop.editorder.data;

import au.com.woolworths.foundation.shop.editorder.SetEditOrderStatusMutation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"edit-order_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SetEditOrderStatusMutationSetEditOrderStatusExtKt {
    public static final SetEditOrderStatusResponse a(SetEditOrderStatusMutation.SetEditOrderStatus setEditOrderStatus) {
        EditOrderReason editOrderReason;
        Intrinsics.h(setEditOrderStatus, "<this>");
        boolean z = setEditOrderStatus.f8731a;
        String str = setEditOrderStatus.c;
        au.com.woolworths.shop.graphql.type.EditOrderReason editOrderReason2 = setEditOrderStatus.b;
        if (editOrderReason2 != null) {
            int iOrdinal = editOrderReason2.ordinal();
            editOrderReason = iOrdinal != 0 ? iOrdinal != 1 ? EditOrderReason.d : EditOrderReason.NOT_FOUND : EditOrderReason.WINDOW_CLOSED;
        } else {
            editOrderReason = null;
        }
        int iOrdinal2 = setEditOrderStatus.d.ordinal();
        return new SetEditOrderStatusResponse(z, str, editOrderReason, iOrdinal2 != 0 ? iOrdinal2 != 1 ? EditOrderMode.NOT_EDITING : EditOrderMode.NOT_EDITING : EditOrderMode.EDITING);
    }
}
