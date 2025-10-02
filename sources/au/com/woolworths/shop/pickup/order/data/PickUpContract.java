package au.com.woolworths.shop.pickup.order.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/pickup/order/data/PickUpContract;", "", "PickUpOrderStatus", "CustomerStatus", "shop-pickup-order-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PickUpContract {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/pickup/order/data/PickUpContract$CustomerStatus;", "", "shop-pickup-order-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CustomerStatus {
        public static final /* synthetic */ CustomerStatus[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            CustomerStatus[] customerStatusArr = {new CustomerStatus("WAITING", 0), new CustomerStatus("IN_15", 1), new CustomerStatus("READY_NOW", 2)};
            d = customerStatusArr;
            e = EnumEntriesKt.a(customerStatusArr);
        }

        public static CustomerStatus valueOf(String str) {
            return (CustomerStatus) Enum.valueOf(CustomerStatus.class, str);
        }

        public static CustomerStatus[] values() {
            return (CustomerStatus[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/pickup/order/data/PickUpContract$PickUpOrderStatus;", "", "shop-pickup-order-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PickUpOrderStatus {
        public static final /* synthetic */ PickUpOrderStatus[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            PickUpOrderStatus[] pickUpOrderStatusArr = {new PickUpOrderStatus("READY", 0), new PickUpOrderStatus("NOT_READY", 1)};
            d = pickUpOrderStatusArr;
            e = EnumEntriesKt.a(pickUpOrderStatusArr);
        }

        public static PickUpOrderStatus valueOf(String str) {
            return (PickUpOrderStatus) Enum.valueOf(PickUpOrderStatus.class, str);
        }

        public static PickUpOrderStatus[] values() {
            return (PickUpOrderStatus[]) d.clone();
        }
    }
}
