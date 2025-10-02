package au.com.woolworths.shop.receipts;

import YU.a;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/receipts/ReceiptListContract;", "", "Action", "ViewState", "ReceiptListAnalyticsHandler", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReceiptListContract {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/receipts/ReceiptListContract$Action;", "", "OpenReceiptDetails", "OpenMyOrders", "OpenChatToUs", "Lau/com/woolworths/shop/receipts/ReceiptListContract$Action$OpenChatToUs;", "Lau/com/woolworths/shop/receipts/ReceiptListContract$Action$OpenMyOrders;", "Lau/com/woolworths/shop/receipts/ReceiptListContract$Action$OpenReceiptDetails;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/ReceiptListContract$Action$OpenChatToUs;", "Lau/com/woolworths/shop/receipts/ReceiptListContract$Action;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class OpenChatToUs implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenChatToUs f12822a = new OpenChatToUs();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/ReceiptListContract$Action$OpenMyOrders;", "Lau/com/woolworths/shop/receipts/ReceiptListContract$Action;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class OpenMyOrders implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenMyOrders f12823a = new OpenMyOrders();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/ReceiptListContract$Action$OpenReceiptDetails;", "Lau/com/woolworths/shop/receipts/ReceiptListContract$Action;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenReceiptDetails implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f12824a;

            public OpenReceiptDetails(String str) {
                this.f12824a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenReceiptDetails) && Intrinsics.c(this.f12824a, ((OpenReceiptDetails) obj).f12824a);
            }

            public final int hashCode() {
                return this.f12824a.hashCode();
            }

            public final String toString() {
                return a.h("OpenReceiptDetails(id=", this.f12824a, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/receipts/ReceiptListContract$ReceiptListAnalyticsHandler;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ReceiptListAnalyticsHandler {
        void H4();

        void M1();

        void O5();

        void R2();

        void S(Throwable th);

        void Y0();

        void Y3();

        void f3(Throwable th);

        void k2();

        void m2();

        void r4();
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/ReceiptListContract$ViewState;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewState);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) * 31;
        }

        public final String toString() {
            return "ViewState(items=null, isRefreshing=true, error=null)";
        }
    }
}
