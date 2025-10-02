package au.com.woolworths.product.models;

import au.com.woolworths.graphql.DefaultValue;
import au.com.woolworths.graphql.MappedValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/product/models/ProductInlineTypeApiData;", "", "<init>", "(Ljava/lang/String;I)V", "NEW", "SPONSORED", "UNKNOWN", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductInlineTypeApiData {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProductInlineTypeApiData[] $VALUES;

    @MappedValue
    @SerializedName("NEW")
    public static final ProductInlineTypeApiData NEW = new ProductInlineTypeApiData("NEW", 0);

    @MappedValue
    @SerializedName("SPONSORED")
    public static final ProductInlineTypeApiData SPONSORED = new ProductInlineTypeApiData("SPONSORED", 1);

    @DefaultValue
    public static final ProductInlineTypeApiData UNKNOWN = new ProductInlineTypeApiData("UNKNOWN", 2);

    private static final /* synthetic */ ProductInlineTypeApiData[] $values() {
        return new ProductInlineTypeApiData[]{NEW, SPONSORED, UNKNOWN};
    }

    static {
        ProductInlineTypeApiData[] productInlineTypeApiDataArr$values = $values();
        $VALUES = productInlineTypeApiDataArr$values;
        $ENTRIES = EnumEntriesKt.a(productInlineTypeApiDataArr$values);
    }

    private ProductInlineTypeApiData(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ProductInlineTypeApiData> getEntries() {
        return $ENTRIES;
    }

    public static ProductInlineTypeApiData valueOf(String str) {
        return (ProductInlineTypeApiData) Enum.valueOf(ProductInlineTypeApiData.class, str);
    }

    public static ProductInlineTypeApiData[] values() {
        return (ProductInlineTypeApiData[]) $VALUES.clone();
    }
}
