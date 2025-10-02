package au.com.woolworths.feature.shop.myorders.details.models;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderSubtitleIcon;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderSubtitleIcon {
    public static final OrderSubtitleIcon e;
    public static final OrderSubtitleIcon f;
    public static final /* synthetic */ OrderSubtitleIcon[] g;
    public static final /* synthetic */ EnumEntries h;
    public final Integer d;

    static {
        OrderSubtitleIcon orderSubtitleIcon = new OrderSubtitleIcon("NONE", 0, null);
        e = orderSubtitleIcon;
        OrderSubtitleIcon orderSubtitleIcon2 = new OrderSubtitleIcon("WARNING", 1, Integer.valueOf(R.drawable.ic_warning));
        f = orderSubtitleIcon2;
        OrderSubtitleIcon[] orderSubtitleIconArr = {orderSubtitleIcon, orderSubtitleIcon2};
        g = orderSubtitleIconArr;
        h = EnumEntriesKt.a(orderSubtitleIconArr);
    }

    public OrderSubtitleIcon(String str, int i, Integer num) {
        this.d = num;
    }

    public static OrderSubtitleIcon valueOf(String str) {
        return (OrderSubtitleIcon) Enum.valueOf(OrderSubtitleIcon.class, str);
    }

    public static OrderSubtitleIcon[] values() {
        return (OrderSubtitleIcon[]) g.clone();
    }
}
