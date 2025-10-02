package au.com.woolworths.feature.shop.myorders.details.models;

import au.com.woolworths.shop.graphql.type.OrderHelpItemType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderHelpItemTypeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[OrderHelpItemType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OrderHelpItemType.Companion companion = OrderHelpItemType.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OrderHelpItemType.Companion companion2 = OrderHelpItemType.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpItemType a(OrderHelpItemType orderHelpItemType) {
        int iOrdinal = orderHelpItemType.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpItemType.e : au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpItemType.CALL_US : au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpItemType.CHAT : au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpItemType.FAQ;
    }
}
