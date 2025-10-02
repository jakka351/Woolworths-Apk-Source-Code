package au.com.woolworths.base.shopapp.modules.collectionmode.data;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/data/ShoppingModeVariantStateData;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "AVAILABLE", "DISABLED", "SELECTED", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShoppingModeVariantStateData {

    @DefaultValue
    @SerializedName("AVAILABLE")
    public static final ShoppingModeVariantStateData AVAILABLE;

    @SerializedName("DISABLED")
    public static final ShoppingModeVariantStateData DISABLED;

    @SerializedName("SELECTED")
    public static final ShoppingModeVariantStateData SELECTED;
    public static final /* synthetic */ ShoppingModeVariantStateData[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ShoppingModeVariantStateData shoppingModeVariantStateData = new ShoppingModeVariantStateData("AVAILABLE", 0, "AVAILABLE");
        AVAILABLE = shoppingModeVariantStateData;
        ShoppingModeVariantStateData shoppingModeVariantStateData2 = new ShoppingModeVariantStateData("DISABLED", 1, "DISABLED");
        DISABLED = shoppingModeVariantStateData2;
        ShoppingModeVariantStateData shoppingModeVariantStateData3 = new ShoppingModeVariantStateData("SELECTED", 2, "SELECTED");
        SELECTED = shoppingModeVariantStateData3;
        ShoppingModeVariantStateData[] shoppingModeVariantStateDataArr = {shoppingModeVariantStateData, shoppingModeVariantStateData2, shoppingModeVariantStateData3};
        d = shoppingModeVariantStateDataArr;
        e = EnumEntriesKt.a(shoppingModeVariantStateDataArr);
    }

    private ShoppingModeVariantStateData(String str, int i, String str2) {
    }

    public static ShoppingModeVariantStateData valueOf(String str) {
        return (ShoppingModeVariantStateData) Enum.valueOf(ShoppingModeVariantStateData.class, str);
    }

    public static ShoppingModeVariantStateData[] values() {
        return (ShoppingModeVariantStateData[]) d.clone();
    }
}
