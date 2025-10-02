package au.com.woolworths.shop.checkout.domain.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindowsFooterIconData;", "", "<init>", "(Ljava/lang/String;I)V", "GREEN_DELIVERY", "PARTNER_DELIVERY", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FulfilmentWindowsFooterIconData {

    @SerializedName("GREEN_DELIVERY")
    public static final FulfilmentWindowsFooterIconData GREEN_DELIVERY;

    @SerializedName("PARTNER_DELIVERY")
    public static final FulfilmentWindowsFooterIconData PARTNER_DELIVERY;
    public static final FulfilmentWindowsFooterIconData d;
    public static final /* synthetic */ FulfilmentWindowsFooterIconData[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        FulfilmentWindowsFooterIconData fulfilmentWindowsFooterIconData = new FulfilmentWindowsFooterIconData("GREEN_DELIVERY", 0);
        GREEN_DELIVERY = fulfilmentWindowsFooterIconData;
        FulfilmentWindowsFooterIconData fulfilmentWindowsFooterIconData2 = new FulfilmentWindowsFooterIconData("PARTNER_DELIVERY", 1);
        PARTNER_DELIVERY = fulfilmentWindowsFooterIconData2;
        FulfilmentWindowsFooterIconData fulfilmentWindowsFooterIconData3 = new FulfilmentWindowsFooterIconData("NONE", 2);
        d = fulfilmentWindowsFooterIconData3;
        FulfilmentWindowsFooterIconData[] fulfilmentWindowsFooterIconDataArr = {fulfilmentWindowsFooterIconData, fulfilmentWindowsFooterIconData2, fulfilmentWindowsFooterIconData3};
        e = fulfilmentWindowsFooterIconDataArr;
        f = EnumEntriesKt.a(fulfilmentWindowsFooterIconDataArr);
    }

    private FulfilmentWindowsFooterIconData(String str, int i) {
    }

    public static FulfilmentWindowsFooterIconData valueOf(String str) {
        return (FulfilmentWindowsFooterIconData) Enum.valueOf(FulfilmentWindowsFooterIconData.class, str);
    }

    public static FulfilmentWindowsFooterIconData[] values() {
        return (FulfilmentWindowsFooterIconData[]) e.clone();
    }
}
