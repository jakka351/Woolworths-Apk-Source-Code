package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowSource;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FulfilmentWindowSource {
    public static final FulfilmentWindowSource e;
    public static final FulfilmentWindowSource f;
    public static final /* synthetic */ FulfilmentWindowSource[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    static {
        FulfilmentWindowSource fulfilmentWindowSource = new FulfilmentWindowSource("CHECKOUT", 0, "Checkout");
        e = fulfilmentWindowSource;
        FulfilmentWindowSource fulfilmentWindowSource2 = new FulfilmentWindowSource("UPFRONT_FULFILMENT", 1, "Upfront Fulfilment");
        f = fulfilmentWindowSource2;
        FulfilmentWindowSource[] fulfilmentWindowSourceArr = {fulfilmentWindowSource, fulfilmentWindowSource2};
        g = fulfilmentWindowSourceArr;
        h = EnumEntriesKt.a(fulfilmentWindowSourceArr);
    }

    public FulfilmentWindowSource(String str, int i, String str2) {
        this.d = str2;
    }

    public static FulfilmentWindowSource valueOf(String str) {
        return (FulfilmentWindowSource) Enum.valueOf(FulfilmentWindowSource.class, str);
    }

    public static FulfilmentWindowSource[] values() {
        return (FulfilmentWindowSource[]) g.clone();
    }
}
