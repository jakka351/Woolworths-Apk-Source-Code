package au.com.woolworths.feature.shop.myorders.details;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.models.FeedData;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryInstructionsData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsItemData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsItemIcon;
import au.com.woolworths.feature.shop.myorders.details.models.OrderSummaryData;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderDetailsExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7672a;

        static {
            int[] iArr = new int[OrderPaymentDetailsItemIcon.values().length];
            try {
                OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon = OrderPaymentDetailsItemIcon.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon2 = OrderPaymentDetailsItemIcon.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon3 = OrderPaymentDetailsItemIcon.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon4 = OrderPaymentDetailsItemIcon.d;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon5 = OrderPaymentDetailsItemIcon.d;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon6 = OrderPaymentDetailsItemIcon.d;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon7 = OrderPaymentDetailsItemIcon.d;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon8 = OrderPaymentDetailsItemIcon.d;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon9 = OrderPaymentDetailsItemIcon.d;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon10 = OrderPaymentDetailsItemIcon.d;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon11 = OrderPaymentDetailsItemIcon.d;
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f7672a = iArr;
        }
    }

    public static final int a(OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon) {
        switch (orderPaymentDetailsItemIcon == null ? -1 : WhenMappings.f7672a[orderPaymentDetailsItemIcon.ordinal()]) {
            case -1:
            case 11:
                return 0;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return R.drawable.ic_payment_method_credit_card;
            case 2:
                return R.drawable.ic_payment_method_gift_card;
            case 3:
                return R.drawable.ic_payment_method_paypal;
            case 4:
                return R.drawable.ic_payment_method_rewards;
            case 5:
            case 6:
            case 7:
            case 8:
                return R.drawable.ic_payment_method_generic;
            case 9:
                return R.drawable.ic_payment_method_apple_pay;
            case 10:
                return R.drawable.ic_payment_method_google_pay;
        }
    }

    public static final TrackingMetadata b(OrderSummaryData orderSummaryData) {
        TrackableCollectionMethod trackableCollectionMethod;
        OrderPaymentDetailsItemData orderPaymentDetailsItemData;
        Intrinsics.h(orderSummaryData, "<this>");
        FeedData feedData = orderSummaryData.c;
        List<Object> items = feedData.getItems();
        if ((items instanceof Collection) && items.isEmpty()) {
            trackableCollectionMethod = TrackableCollectionMethod.f;
        } else {
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof DeliveryInstructionsData) {
                    trackableCollectionMethod = TrackableCollectionMethod.e;
                    break;
                }
            }
            trackableCollectionMethod = TrackableCollectionMethod.f;
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.h1, Integer.valueOf(orderSummaryData.f7770a));
        trackingMetadataA.b(TrackableValue.c1, trackableCollectionMethod.d);
        String str = orderSummaryData.h;
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            trackingMetadataA.b(TrackableValue.s1, str);
        }
        trackingMetadataA.b(TrackableValue.g1, orderSummaryData.f.a());
        trackingMetadataA.b(TrackableValue.r1, orderSummaryData.g);
        List<Object> items2 = feedData.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items2) {
            if (obj instanceof OrderPaymentDetailsData) {
                arrayList.add(obj);
            }
        }
        OrderPaymentDetailsData orderPaymentDetailsData = (OrderPaymentDetailsData) CollectionsKt.F(arrayList);
        if (orderPaymentDetailsData != null && (orderPaymentDetailsItemData = (OrderPaymentDetailsItemData) CollectionsKt.F(orderPaymentDetailsData.d)) != null) {
            trackingMetadataA.b(TrackableValue.x1, orderPaymentDetailsItemData.f);
        }
        return trackingMetadataA;
    }
}
