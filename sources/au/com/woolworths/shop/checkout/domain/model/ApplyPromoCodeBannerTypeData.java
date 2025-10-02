package au.com.woolworths.shop.checkout.domain.model;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/ApplyPromoCodeBannerTypeData;", "", "<init>", "(Ljava/lang/String;I)V", "CREDIT", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApplyPromoCodeBannerTypeData {

    @DefaultValue
    @SerializedName("CREDIT")
    public static final ApplyPromoCodeBannerTypeData CREDIT;
    public static final /* synthetic */ ApplyPromoCodeBannerTypeData[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ApplyPromoCodeBannerTypeData applyPromoCodeBannerTypeData = new ApplyPromoCodeBannerTypeData("CREDIT", 0);
        CREDIT = applyPromoCodeBannerTypeData;
        ApplyPromoCodeBannerTypeData[] applyPromoCodeBannerTypeDataArr = {applyPromoCodeBannerTypeData};
        d = applyPromoCodeBannerTypeDataArr;
        e = EnumEntriesKt.a(applyPromoCodeBannerTypeDataArr);
    }

    private ApplyPromoCodeBannerTypeData(String str, int i) {
    }

    public static ApplyPromoCodeBannerTypeData valueOf(String str) {
        return (ApplyPromoCodeBannerTypeData) Enum.valueOf(ApplyPromoCodeBannerTypeData.class, str);
    }

    public static ApplyPromoCodeBannerTypeData[] values() {
        return (ApplyPromoCodeBannerTypeData[]) d.clone();
    }
}
