package au.com.woolworths.feature.shop.myorders.details.models;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderStatusTypeData;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabelType;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OrderStatusTypeData implements BrandLabelType {

    @NotNull
    public static final Parcelable.Creator<OrderStatusTypeData> CREATOR;
    public static final OrderStatusTypeData d;
    public static final OrderStatusTypeData e;
    public static final OrderStatusTypeData f;
    public static final OrderStatusTypeData g;
    public static final OrderStatusTypeData h;
    public static final /* synthetic */ OrderStatusTypeData[] i;
    public static final /* synthetic */ EnumEntries j;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderStatusTypeData> {
        @Override // android.os.Parcelable.Creator
        public final OrderStatusTypeData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return OrderStatusTypeData.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrderStatusTypeData[] newArray(int i) {
            return new OrderStatusTypeData[i];
        }
    }

    static {
        OrderStatusTypeData orderStatusTypeData = new OrderStatusTypeData() { // from class: au.com.woolworths.feature.shop.myorders.details.models.OrderStatusTypeData.PENDING
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.order_status_placed_bg;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.order_status_placed_bg;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColourAttr() {
                return android.R.attr.textColorSecondary;
            }
        };
        d = orderStatusTypeData;
        OrderStatusTypeData orderStatusTypeData2 = new OrderStatusTypeData() { // from class: au.com.woolworths.feature.shop.myorders.details.models.OrderStatusTypeData.READY
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.order_status_ready_bg;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.order_status_ready_bg;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColourAttr() {
                return R.attr.colorPrimary;
            }
        };
        e = orderStatusTypeData2;
        OrderStatusTypeData orderStatusTypeData3 = new OrderStatusTypeData() { // from class: au.com.woolworths.feature.shop.myorders.details.models.OrderStatusTypeData.COMPLETE
            @Override // au.com.woolworths.feature.shop.myorders.details.models.OrderStatusTypeData
            public final Drawable a(Context ctx) {
                Intrinsics.h(ctx, "ctx");
                return ctx.getDrawable(R.drawable.ic_order_status_collected_icon);
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.order_status_ready_bg;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.order_status_ready_bg;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColourAttr() {
                return R.attr.colorPrimary;
            }
        };
        f = orderStatusTypeData3;
        OrderStatusTypeData orderStatusTypeData4 = new OrderStatusTypeData() { // from class: au.com.woolworths.feature.shop.myorders.details.models.OrderStatusTypeData.CANCELLED
            @Override // au.com.woolworths.feature.shop.myorders.details.models.OrderStatusTypeData
            public final Drawable a(Context ctx) {
                Intrinsics.h(ctx, "ctx");
                return ctx.getDrawable(R.drawable.ic_order_status_cancelled_icon);
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.order_status_placed_bg;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.order_status_placed_bg;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColour() {
                return R.color.order_status_cancelled_text_color;
            }
        };
        g = orderStatusTypeData4;
        OrderStatusTypeData orderStatusTypeData5 = new OrderStatusTypeData() { // from class: au.com.woolworths.feature.shop.myorders.details.models.OrderStatusTypeData.UNKNOWN
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.order_status_placed_bg;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.order_status_placed_bg;
            }
        };
        h = orderStatusTypeData5;
        OrderStatusTypeData[] orderStatusTypeDataArr = {orderStatusTypeData, orderStatusTypeData2, orderStatusTypeData3, orderStatusTypeData4, orderStatusTypeData5};
        i = orderStatusTypeDataArr;
        j = EnumEntriesKt.a(orderStatusTypeDataArr);
        CREATOR = new Creator();
    }

    public static OrderStatusTypeData valueOf(String str) {
        return (OrderStatusTypeData) Enum.valueOf(OrderStatusTypeData.class, str);
    }

    public static OrderStatusTypeData[] values() {
        return (OrderStatusTypeData[]) i.clone();
    }

    public Drawable a(Context ctx) {
        Intrinsics.h(ctx, "ctx");
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.h(dest, "dest");
        dest.writeString(name());
    }
}
