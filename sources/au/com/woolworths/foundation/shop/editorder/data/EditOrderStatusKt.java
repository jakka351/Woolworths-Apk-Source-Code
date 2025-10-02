package au.com.woolworths.foundation.shop.editorder.data;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"edit-order_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class EditOrderStatusKt {
    public static final boolean a(EditOrderStatus editOrderStatus) {
        return (editOrderStatus == null || editOrderStatus.getMode() != EditOrderMode.EDITING || editOrderStatus.getDetails() == null) ? false : true;
    }
}
