package au.com.woolworths.feature.shop.myorders.details.help.models;

import androidx.annotation.IdRes;
import com.google.gson.annotations.SerializedName;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/models/OrderHelpItemType;", "", "", "iconRes", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "FAQ", "CHAT", "CALL_US", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderHelpItemType {

    @SerializedName("CALL_US")
    public static final OrderHelpItemType CALL_US;

    @SerializedName("CHAT")
    public static final OrderHelpItemType CHAT;

    @SerializedName("FAQ")
    public static final OrderHelpItemType FAQ;
    public static final OrderHelpItemType e;
    public static final /* synthetic */ OrderHelpItemType[] f;
    public static final /* synthetic */ EnumEntries g;
    public final Integer d;

    static {
        OrderHelpItemType orderHelpItemType = new OrderHelpItemType("FAQ", 0, Integer.valueOf(R.drawable.ic_top_right_arrow));
        FAQ = orderHelpItemType;
        OrderHelpItemType orderHelpItemType2 = new OrderHelpItemType("CHAT", 1, null, 1, null);
        CHAT = orderHelpItemType2;
        OrderHelpItemType orderHelpItemType3 = new OrderHelpItemType("NONE", 2, null, 1, null);
        e = orderHelpItemType3;
        OrderHelpItemType orderHelpItemType4 = new OrderHelpItemType("CALL_US", 3, null, 1, null);
        CALL_US = orderHelpItemType4;
        OrderHelpItemType[] orderHelpItemTypeArr = {orderHelpItemType, orderHelpItemType2, orderHelpItemType3, orderHelpItemType4};
        f = orderHelpItemTypeArr;
        g = EnumEntriesKt.a(orderHelpItemTypeArr);
    }

    private OrderHelpItemType(@IdRes String str, int i, Integer num) {
        this.d = num;
    }

    public static OrderHelpItemType valueOf(String str) {
        return (OrderHelpItemType) Enum.valueOf(OrderHelpItemType.class, str);
    }

    public static OrderHelpItemType[] values() {
        return (OrderHelpItemType[]) f.clone();
    }

    public /* synthetic */ OrderHelpItemType(String str, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? null : num);
    }
}
