package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFullfilmentStatusItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesSubstitutedProduct;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsData;
import com.woolworths.R;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract;", "", "ViewState", "ErrorState", "YourGroceriesItem", "YourGroceriesClickHandler", "Action", "PaymentSummaryInfo", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YourGroceriesContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action;", "", "OpenProductDetails", "ShowMessageDialog", "OpenPaymentSummary", "OpenOrderDetailsHelpActivity", "ShowRatingSuccess", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action$OpenOrderDetailsHelpActivity;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action$OpenPaymentSummary;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action$OpenProductDetails;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action$ShowMessageDialog;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action$ShowRatingSuccess;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action$OpenOrderDetailsHelpActivity;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenOrderDetailsHelpActivity extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final OrderHelpDataList f7811a;

            public OpenOrderDetailsHelpActivity(OrderHelpDataList helpList) {
                Intrinsics.h(helpList, "helpList");
                this.f7811a = helpList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenOrderDetailsHelpActivity) && Intrinsics.c(this.f7811a, ((OpenOrderDetailsHelpActivity) obj).f7811a);
            }

            public final int hashCode() {
                return this.f7811a.hashCode();
            }

            public final String toString() {
                return "OpenOrderDetailsHelpActivity(helpList=" + this.f7811a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action$OpenPaymentSummary;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenPaymentSummary extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final PaymentSummaryInfo f7812a;

            public OpenPaymentSummary(PaymentSummaryInfo paymentInfo) {
                Intrinsics.h(paymentInfo, "paymentInfo");
                this.f7812a = paymentInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenPaymentSummary) && Intrinsics.c(this.f7812a, ((OpenPaymentSummary) obj).f7812a);
            }

            public final int hashCode() {
                return this.f7812a.hashCode();
            }

            public final String toString() {
                return "OpenPaymentSummary(paymentInfo=" + this.f7812a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action$OpenProductDetails;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenProductDetails extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f7813a;

            public OpenProductDetails(String productId) {
                Intrinsics.h(productId, "productId");
                this.f7813a = productId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenProductDetails) && Intrinsics.c(this.f7813a, ((OpenProductDetails) obj).f7813a);
            }

            public final int hashCode() {
                return this.f7813a.hashCode();
            }

            public final String toString() {
                return a.h("OpenProductDetails(productId=", this.f7813a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action$ShowMessageDialog;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowMessageDialog extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f7814a;
            public final String b;

            public ShowMessageDialog(String str, String message) {
                Intrinsics.h(message, "message");
                this.f7814a = str;
                this.b = message;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowMessageDialog)) {
                    return false;
                }
                ShowMessageDialog showMessageDialog = (ShowMessageDialog) obj;
                return Intrinsics.c(this.f7814a, showMessageDialog.f7814a) && Intrinsics.c(this.b, showMessageDialog.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f7814a.hashCode() * 31);
            }

            public final String toString() {
                return a.j("ShowMessageDialog(title=", this.f7814a, ", message=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action$ShowRatingSuccess;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowRatingSuccess extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowRatingSuccess f7815a = new ShowRatingSuccess();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowRatingSuccess);
            }

            public final int hashCode() {
                return 1152739137;
            }

            public final String toString() {
                return "ShowRatingSuccess";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$ErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorState implements FullPageErrorCause {
        public static final ErrorState d;
        public static final ErrorState e;
        public static final /* synthetic */ ErrorState[] f;
        public static final /* synthetic */ EnumEntries g;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract.ErrorState.NETWORK_ERROR", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$ErrorState;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NETWORK_ERROR extends ErrorState {
            public NETWORK_ERROR() {
                super("NETWORK_ERROR", 1);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_order_network_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.your_groceries_network_error_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.my_orders_network_error_heading);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract.ErrorState.SERVER_ERROR", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$ErrorState;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SERVER_ERROR extends ErrorState {
            public SERVER_ERROR() {
                super("SERVER_ERROR", 0);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_order_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.your_groceries_server_error_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.server_error_heading);
            }
        }

        static {
            SERVER_ERROR server_error = new SERVER_ERROR();
            d = server_error;
            NETWORK_ERROR network_error = new NETWORK_ERROR();
            e = network_error;
            ErrorState[] errorStateArr = {server_error, network_error};
            f = errorStateArr;
            g = EnumEntriesKt.a(errorStateArr);
        }

        public static ErrorState valueOf(String str) {
            return (ErrorState) Enum.valueOf(ErrorState.class, str);
        }

        public static ErrorState[] values() {
            return (ErrorState[]) f.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$PaymentSummaryInfo;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentSummaryInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f7816a;
        public final String b;
        public final OrderPaymentDetailsData c;

        public PaymentSummaryInfo(String str, String str2, OrderPaymentDetailsData orderPaymentDetailsData) {
            this.f7816a = str;
            this.b = str2;
            this.c = orderPaymentDetailsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentSummaryInfo)) {
                return false;
            }
            PaymentSummaryInfo paymentSummaryInfo = (PaymentSummaryInfo) obj;
            return Intrinsics.c(this.f7816a, paymentSummaryInfo.f7816a) && Intrinsics.c(this.b, paymentSummaryInfo.b) && Intrinsics.c(this.c, paymentSummaryInfo.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f7816a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = a.v("PaymentSummaryInfo(totalLabel=", this.f7816a, ", totalValue=", this.b, ", orderPaymentDetails=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$YourGroceriesClickHandler;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface YourGroceriesClickHandler {
        default void O4(YourGroceriesSubstitutedProduct item) {
            Intrinsics.h(item, "item");
        }

        default void X0(YourGroceriesProductItem item) {
            Intrinsics.h(item, "item");
        }

        default void c3() {
        }

        default void y3(YourGroceriesFullfilmentStatusItem status) {
            Intrinsics.h(status, "status");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$YourGroceriesItem;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface YourGroceriesItem {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$ViewState;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7817a;
        public final List b;
        public final PaymentSummaryInfo c;
        public final OrderHelpDataList d;
        public final ErrorState e;
        public final Map f;

        public ViewState(boolean z, List items, PaymentSummaryInfo paymentSummaryInfo, OrderHelpDataList orderHelpDataList, ErrorState errorState, Map ratingUpMap) {
            Intrinsics.h(items, "items");
            Intrinsics.h(ratingUpMap, "ratingUpMap");
            this.f7817a = z;
            this.b = items;
            this.c = paymentSummaryInfo;
            this.d = orderHelpDataList;
            this.e = errorState;
            this.f = ratingUpMap;
        }

        public static ViewState a(ViewState viewState, boolean z, List list, ErrorState errorState, Map map, int i) {
            if ((i & 1) != 0) {
                z = viewState.f7817a;
            }
            boolean z2 = z;
            if ((i & 2) != 0) {
                list = viewState.b;
            }
            List items = list;
            PaymentSummaryInfo paymentSummaryInfo = (i & 4) != 0 ? viewState.c : null;
            OrderHelpDataList orderHelpDataList = viewState.d;
            if ((i & 16) != 0) {
                errorState = viewState.e;
            }
            ErrorState errorState2 = errorState;
            if ((i & 32) != 0) {
                map = viewState.f;
            }
            Map ratingUpMap = map;
            viewState.getClass();
            Intrinsics.h(items, "items");
            Intrinsics.h(ratingUpMap, "ratingUpMap");
            return new ViewState(z2, items, paymentSummaryInfo, orderHelpDataList, errorState2, ratingUpMap);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7817a == viewState.f7817a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && this.e == viewState.e && Intrinsics.c(this.f, viewState.f);
        }

        public final int hashCode() {
            int iD = b.d(Boolean.hashCode(this.f7817a) * 31, 31, this.b);
            PaymentSummaryInfo paymentSummaryInfo = this.c;
            int iHashCode = (iD + (paymentSummaryInfo == null ? 0 : paymentSummaryInfo.hashCode())) * 31;
            OrderHelpDataList orderHelpDataList = this.d;
            int iHashCode2 = (iHashCode + (orderHelpDataList == null ? 0 : orderHelpDataList.hashCode())) * 31;
            ErrorState errorState = this.e;
            return this.f.hashCode() + ((iHashCode2 + (errorState != null ? errorState.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f7817a + ", items=" + this.b + ", paymentInfo=" + this.c + ", helpList=" + this.d + ", errorState=" + this.e + ", ratingUpMap=" + this.f + ")";
        }

        public /* synthetic */ ViewState(boolean z, List list, PaymentSummaryInfo paymentSummaryInfo, OrderHelpDataList orderHelpDataList, ErrorState errorState, Map map, int i) {
            this(z, list, (i & 4) != 0 ? null : paymentSummaryInfo, (i & 8) != 0 ? null : orderHelpDataList, (i & 16) != 0 ? null : errorState, (i & 32) != 0 ? EmptyMap.d : map);
        }
    }
}
