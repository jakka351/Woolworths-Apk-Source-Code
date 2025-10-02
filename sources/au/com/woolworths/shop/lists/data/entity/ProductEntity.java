package au.com.woolworths.shop.lists.data.entity;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.MultiBuyPriceInfo;
import au.com.woolworths.product.models.ProductCategory;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductInlineLabelApiData;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Entity
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bÿ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0004\b+\u0010,J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010a\u001a\u00020\fHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010f\u001a\u00020\u0012HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\"HÆ\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010MJ\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010&HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010(HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010*HÆ\u0003J¸\u0002\u0010t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*HÆ\u0001¢\u0006\u0002\u0010uJ\u0013\u0010v\u001a\u00020\f2\b\u0010w\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010x\u001a\u00020\tHÖ\u0001J\t\u0010y\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00100R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u00107R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00100R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00100R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00100R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00100R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00100R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u001a\u0010#\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010N\u001a\u0004\b#\u0010MR\u0018\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00100R\u0018\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0018\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0018\u0010)\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR&\u0010V\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010A\"\u0004\bY\u0010Z¨\u0006z"}, d2 = {"Lau/com/woolworths/shop/lists/data/entity/ProductEntity;", "", "productId", "Lau/com/woolworths/product/models/ProductId;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "productImage", "badgeImage", "price", "", "unitPriceDescription", "isAvailable", "", "wasPrice", "multiBuyPrice", "multiBuyUnitPrice", "purchaseWarning", "productShoppingList", "Lau/com/woolworths/product/models/ProductShoppingList;", "inStoreDetails", "Lau/com/woolworths/product/models/InstoreDetailsData;", "inlineLabels", "", "Lau/com/woolworths/product/models/ProductInlineLabelApiData;", "promotionInfo", "Lau/com/woolworths/android/onesite/models/products/PromotionInfo;", "rewardsOfferInfo", "Lau/com/woolworths/product/models/RewardsOfferInfo;", "disclaimer", "tagLabel", "Lau/com/woolworths/product/models/TagLabel;", "inStoreAvailabilityInfo", "Lau/com/woolworths/product/models/InStoreAvailabilityInfo;", "marketplace", "Lau/com/woolworths/android/onesite/models/products/ProductListMarketplace;", "isTobacco", "source", "multiBuyPriceInfo", "Lau/com/woolworths/product/models/MultiBuyPriceInfo;", "memberPriceInfo", "Lau/com/woolworths/product/models/MemberPriceInfo;", "inStoreLocationData", "Lau/com/woolworths/product/models/InStoreLocationData;", "<init>", "(Lau/com/woolworths/product/models/ProductId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/product/models/ProductShoppingList;Lau/com/woolworths/product/models/InstoreDetailsData;Ljava/util/List;Lau/com/woolworths/android/onesite/models/products/PromotionInfo;Lau/com/woolworths/product/models/RewardsOfferInfo;Ljava/lang/String;Lau/com/woolworths/product/models/TagLabel;Lau/com/woolworths/product/models/InStoreAvailabilityInfo;Lau/com/woolworths/android/onesite/models/products/ProductListMarketplace;Ljava/lang/Boolean;Ljava/lang/String;Lau/com/woolworths/product/models/MultiBuyPriceInfo;Lau/com/woolworths/product/models/MemberPriceInfo;Lau/com/woolworths/product/models/InStoreLocationData;)V", "getProductId", "()Lau/com/woolworths/product/models/ProductId;", "getName", "()Ljava/lang/String;", "getProductImage", "getBadgeImage", "getPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnitPriceDescription", "()Z", "getWasPrice", "getMultiBuyPrice", "getMultiBuyUnitPrice", "getPurchaseWarning", "getProductShoppingList", "()Lau/com/woolworths/product/models/ProductShoppingList;", "getInStoreDetails", "()Lau/com/woolworths/product/models/InstoreDetailsData;", "getInlineLabels", "()Ljava/util/List;", "getPromotionInfo", "()Lau/com/woolworths/android/onesite/models/products/PromotionInfo;", "getRewardsOfferInfo", "()Lau/com/woolworths/product/models/RewardsOfferInfo;", "getDisclaimer", "getTagLabel", "()Lau/com/woolworths/product/models/TagLabel;", "getInStoreAvailabilityInfo", "()Lau/com/woolworths/product/models/InStoreAvailabilityInfo;", "getMarketplace", "()Lau/com/woolworths/android/onesite/models/products/ProductListMarketplace;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSource", "getMultiBuyPriceInfo", "()Lau/com/woolworths/product/models/MultiBuyPriceInfo;", "getMemberPriceInfo", "()Lau/com/woolworths/product/models/MemberPriceInfo;", "getInStoreLocationData", "()Lau/com/woolworths/product/models/InStoreLocationData;", "categories", "Lau/com/woolworths/product/models/ProductCategory;", "getCategories", "setCategories", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "(Lau/com/woolworths/product/models/ProductId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/product/models/ProductShoppingList;Lau/com/woolworths/product/models/InstoreDetailsData;Ljava/util/List;Lau/com/woolworths/android/onesite/models/products/PromotionInfo;Lau/com/woolworths/product/models/RewardsOfferInfo;Ljava/lang/String;Lau/com/woolworths/product/models/TagLabel;Lau/com/woolworths/product/models/InStoreAvailabilityInfo;Lau/com/woolworths/android/onesite/models/products/ProductListMarketplace;Ljava/lang/Boolean;Ljava/lang/String;Lau/com/woolworths/product/models/MultiBuyPriceInfo;Lau/com/woolworths/product/models/MemberPriceInfo;Lau/com/woolworths/product/models/InStoreLocationData;)Lau/com/woolworths/shop/lists/data/entity/ProductEntity;", "equals", "other", "hashCode", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductEntity {

    @ColumnInfo
    @Nullable
    private final String badgeImage;

    @Ignore
    @Nullable
    private List<ProductCategory> categories;

    @ColumnInfo
    @Nullable
    private final String disclaimer;

    @Embedded
    @Nullable
    private final InStoreAvailabilityInfo inStoreAvailabilityInfo;

    @Embedded
    @Nullable
    private final InstoreDetailsData inStoreDetails;

    @SerializedName("inStoreLocation")
    @Embedded
    @Nullable
    private final InStoreLocationData inStoreLocationData;

    @ColumnInfo
    @Nullable
    private final List<ProductInlineLabelApiData> inlineLabels;

    @ColumnInfo
    private final boolean isAvailable;

    @ColumnInfo
    @Nullable
    private final Boolean isTobacco;

    @Embedded
    @Nullable
    private final ProductListMarketplace marketplace;

    @Embedded
    @Nullable
    private final MemberPriceInfo memberPriceInfo;

    @ColumnInfo
    @Nullable
    private final String multiBuyPrice;

    @Embedded
    @Nullable
    private final MultiBuyPriceInfo multiBuyPriceInfo;

    @ColumnInfo
    @Nullable
    private final String multiBuyUnitPrice;

    @ColumnInfo
    @NotNull
    private final String name;

    @ColumnInfo
    @Nullable
    private final Integer price;

    @PrimaryKey
    @ColumnInfo
    @NotNull
    private final ProductId productId;

    @ColumnInfo
    @Nullable
    private final String productImage;

    @Embedded
    @NotNull
    private final ProductShoppingList productShoppingList;

    @Embedded
    @Nullable
    private final PromotionInfo promotionInfo;

    @ColumnInfo
    @Nullable
    private final String purchaseWarning;

    @Embedded
    @Nullable
    private final RewardsOfferInfo rewardsOfferInfo;

    @ColumnInfo
    @Nullable
    private final String source;

    @Embedded
    @Nullable
    private final TagLabel tagLabel;

    @ColumnInfo
    @Nullable
    private final String unitPriceDescription;

    @ColumnInfo
    @Nullable
    private final String wasPrice;

    public ProductEntity(@NotNull ProductId productId, @NotNull String name, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, boolean z, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull ProductShoppingList productShoppingList, @Nullable InstoreDetailsData instoreDetailsData, @Nullable List<ProductInlineLabelApiData> list, @Nullable PromotionInfo promotionInfo, @Nullable RewardsOfferInfo rewardsOfferInfo, @Nullable String str8, @Nullable TagLabel tagLabel, @Nullable InStoreAvailabilityInfo inStoreAvailabilityInfo, @Nullable ProductListMarketplace productListMarketplace, @Nullable Boolean bool, @Nullable String str9, @Nullable MultiBuyPriceInfo multiBuyPriceInfo, @Nullable MemberPriceInfo memberPriceInfo, @Nullable InStoreLocationData inStoreLocationData) {
        Intrinsics.h(productId, "productId");
        Intrinsics.h(name, "name");
        Intrinsics.h(productShoppingList, "productShoppingList");
        this.productId = productId;
        this.name = name;
        this.productImage = str;
        this.badgeImage = str2;
        this.price = num;
        this.unitPriceDescription = str3;
        this.isAvailable = z;
        this.wasPrice = str4;
        this.multiBuyPrice = str5;
        this.multiBuyUnitPrice = str6;
        this.purchaseWarning = str7;
        this.productShoppingList = productShoppingList;
        this.inStoreDetails = instoreDetailsData;
        this.inlineLabels = list;
        this.promotionInfo = promotionInfo;
        this.rewardsOfferInfo = rewardsOfferInfo;
        this.disclaimer = str8;
        this.tagLabel = tagLabel;
        this.inStoreAvailabilityInfo = inStoreAvailabilityInfo;
        this.marketplace = productListMarketplace;
        this.isTobacco = bool;
        this.source = str9;
        this.multiBuyPriceInfo = multiBuyPriceInfo;
        this.memberPriceInfo = memberPriceInfo;
        this.inStoreLocationData = inStoreLocationData;
    }

    public static /* synthetic */ ProductEntity copy$default(ProductEntity productEntity, ProductId productId, String str, String str2, String str3, Integer num, String str4, boolean z, String str5, String str6, String str7, String str8, ProductShoppingList productShoppingList, InstoreDetailsData instoreDetailsData, List list, PromotionInfo promotionInfo, RewardsOfferInfo rewardsOfferInfo, String str9, TagLabel tagLabel, InStoreAvailabilityInfo inStoreAvailabilityInfo, ProductListMarketplace productListMarketplace, Boolean bool, String str10, MultiBuyPriceInfo multiBuyPriceInfo, MemberPriceInfo memberPriceInfo, InStoreLocationData inStoreLocationData, int i, Object obj) {
        InStoreLocationData inStoreLocationData2;
        MemberPriceInfo memberPriceInfo2;
        ProductId productId2 = (i & 1) != 0 ? productEntity.productId : productId;
        String str11 = (i & 2) != 0 ? productEntity.name : str;
        String str12 = (i & 4) != 0 ? productEntity.productImage : str2;
        String str13 = (i & 8) != 0 ? productEntity.badgeImage : str3;
        Integer num2 = (i & 16) != 0 ? productEntity.price : num;
        String str14 = (i & 32) != 0 ? productEntity.unitPriceDescription : str4;
        boolean z2 = (i & 64) != 0 ? productEntity.isAvailable : z;
        String str15 = (i & 128) != 0 ? productEntity.wasPrice : str5;
        String str16 = (i & 256) != 0 ? productEntity.multiBuyPrice : str6;
        String str17 = (i & 512) != 0 ? productEntity.multiBuyUnitPrice : str7;
        String str18 = (i & 1024) != 0 ? productEntity.purchaseWarning : str8;
        ProductShoppingList productShoppingList2 = (i & 2048) != 0 ? productEntity.productShoppingList : productShoppingList;
        InstoreDetailsData instoreDetailsData2 = (i & 4096) != 0 ? productEntity.inStoreDetails : instoreDetailsData;
        List list2 = (i & 8192) != 0 ? productEntity.inlineLabels : list;
        ProductId productId3 = productId2;
        PromotionInfo promotionInfo2 = (i & 16384) != 0 ? productEntity.promotionInfo : promotionInfo;
        RewardsOfferInfo rewardsOfferInfo2 = (i & 32768) != 0 ? productEntity.rewardsOfferInfo : rewardsOfferInfo;
        String str19 = (i & 65536) != 0 ? productEntity.disclaimer : str9;
        TagLabel tagLabel2 = (i & 131072) != 0 ? productEntity.tagLabel : tagLabel;
        InStoreAvailabilityInfo inStoreAvailabilityInfo2 = (i & 262144) != 0 ? productEntity.inStoreAvailabilityInfo : inStoreAvailabilityInfo;
        ProductListMarketplace productListMarketplace2 = (i & 524288) != 0 ? productEntity.marketplace : productListMarketplace;
        Boolean bool2 = (i & 1048576) != 0 ? productEntity.isTobacco : bool;
        String str20 = (i & 2097152) != 0 ? productEntity.source : str10;
        MultiBuyPriceInfo multiBuyPriceInfo2 = (i & 4194304) != 0 ? productEntity.multiBuyPriceInfo : multiBuyPriceInfo;
        MemberPriceInfo memberPriceInfo3 = (i & 8388608) != 0 ? productEntity.memberPriceInfo : memberPriceInfo;
        if ((i & 16777216) != 0) {
            memberPriceInfo2 = memberPriceInfo3;
            inStoreLocationData2 = productEntity.inStoreLocationData;
        } else {
            inStoreLocationData2 = inStoreLocationData;
            memberPriceInfo2 = memberPriceInfo3;
        }
        return productEntity.copy(productId3, str11, str12, str13, num2, str14, z2, str15, str16, str17, str18, productShoppingList2, instoreDetailsData2, list2, promotionInfo2, rewardsOfferInfo2, str19, tagLabel2, inStoreAvailabilityInfo2, productListMarketplace2, bool2, str20, multiBuyPriceInfo2, memberPriceInfo2, inStoreLocationData2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductId getProductId() {
        return this.productId;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getMultiBuyUnitPrice() {
        return this.multiBuyUnitPrice;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getPurchaseWarning() {
        return this.purchaseWarning;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final ProductShoppingList getProductShoppingList() {
        return this.productShoppingList;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final InstoreDetailsData getInStoreDetails() {
        return this.inStoreDetails;
    }

    @Nullable
    public final List<ProductInlineLabelApiData> component14() {
        return this.inlineLabels;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final PromotionInfo getPromotionInfo() {
        return this.promotionInfo;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final RewardsOfferInfo getRewardsOfferInfo() {
        return this.rewardsOfferInfo;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final TagLabel getTagLabel() {
        return this.tagLabel;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final InStoreAvailabilityInfo getInStoreAvailabilityInfo() {
        return this.inStoreAvailabilityInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final ProductListMarketplace getMarketplace() {
        return this.marketplace;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Boolean getIsTobacco() {
        return this.isTobacco;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final MultiBuyPriceInfo getMultiBuyPriceInfo() {
        return this.multiBuyPriceInfo;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final MemberPriceInfo getMemberPriceInfo() {
        return this.memberPriceInfo;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final InStoreLocationData getInStoreLocationData() {
        return this.inStoreLocationData;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getProductImage() {
        return this.productImage;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getBadgeImage() {
        return this.badgeImage;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getPrice() {
        return this.price;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getUnitPriceDescription() {
        return this.unitPriceDescription;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getWasPrice() {
        return this.wasPrice;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getMultiBuyPrice() {
        return this.multiBuyPrice;
    }

    @NotNull
    public final ProductEntity copy(@NotNull ProductId productId, @NotNull String name, @Nullable String productImage, @Nullable String badgeImage, @Nullable Integer price, @Nullable String unitPriceDescription, boolean isAvailable, @Nullable String wasPrice, @Nullable String multiBuyPrice, @Nullable String multiBuyUnitPrice, @Nullable String purchaseWarning, @NotNull ProductShoppingList productShoppingList, @Nullable InstoreDetailsData inStoreDetails, @Nullable List<ProductInlineLabelApiData> inlineLabels, @Nullable PromotionInfo promotionInfo, @Nullable RewardsOfferInfo rewardsOfferInfo, @Nullable String disclaimer, @Nullable TagLabel tagLabel, @Nullable InStoreAvailabilityInfo inStoreAvailabilityInfo, @Nullable ProductListMarketplace marketplace, @Nullable Boolean isTobacco, @Nullable String source, @Nullable MultiBuyPriceInfo multiBuyPriceInfo, @Nullable MemberPriceInfo memberPriceInfo, @Nullable InStoreLocationData inStoreLocationData) {
        Intrinsics.h(productId, "productId");
        Intrinsics.h(name, "name");
        Intrinsics.h(productShoppingList, "productShoppingList");
        return new ProductEntity(productId, name, productImage, badgeImage, price, unitPriceDescription, isAvailable, wasPrice, multiBuyPrice, multiBuyUnitPrice, purchaseWarning, productShoppingList, inStoreDetails, inlineLabels, promotionInfo, rewardsOfferInfo, disclaimer, tagLabel, inStoreAvailabilityInfo, marketplace, isTobacco, source, multiBuyPriceInfo, memberPriceInfo, inStoreLocationData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductEntity)) {
            return false;
        }
        ProductEntity productEntity = (ProductEntity) other;
        return Intrinsics.c(this.productId, productEntity.productId) && Intrinsics.c(this.name, productEntity.name) && Intrinsics.c(this.productImage, productEntity.productImage) && Intrinsics.c(this.badgeImage, productEntity.badgeImage) && Intrinsics.c(this.price, productEntity.price) && Intrinsics.c(this.unitPriceDescription, productEntity.unitPriceDescription) && this.isAvailable == productEntity.isAvailable && Intrinsics.c(this.wasPrice, productEntity.wasPrice) && Intrinsics.c(this.multiBuyPrice, productEntity.multiBuyPrice) && Intrinsics.c(this.multiBuyUnitPrice, productEntity.multiBuyUnitPrice) && Intrinsics.c(this.purchaseWarning, productEntity.purchaseWarning) && Intrinsics.c(this.productShoppingList, productEntity.productShoppingList) && Intrinsics.c(this.inStoreDetails, productEntity.inStoreDetails) && Intrinsics.c(this.inlineLabels, productEntity.inlineLabels) && Intrinsics.c(this.promotionInfo, productEntity.promotionInfo) && Intrinsics.c(this.rewardsOfferInfo, productEntity.rewardsOfferInfo) && Intrinsics.c(this.disclaimer, productEntity.disclaimer) && Intrinsics.c(this.tagLabel, productEntity.tagLabel) && Intrinsics.c(this.inStoreAvailabilityInfo, productEntity.inStoreAvailabilityInfo) && Intrinsics.c(this.marketplace, productEntity.marketplace) && Intrinsics.c(this.isTobacco, productEntity.isTobacco) && Intrinsics.c(this.source, productEntity.source) && Intrinsics.c(this.multiBuyPriceInfo, productEntity.multiBuyPriceInfo) && Intrinsics.c(this.memberPriceInfo, productEntity.memberPriceInfo) && Intrinsics.c(this.inStoreLocationData, productEntity.inStoreLocationData);
    }

    @Nullable
    public final String getBadgeImage() {
        return this.badgeImage;
    }

    @Nullable
    public final List<ProductCategory> getCategories() {
        return this.categories;
    }

    @Nullable
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @Nullable
    public final InStoreAvailabilityInfo getInStoreAvailabilityInfo() {
        return this.inStoreAvailabilityInfo;
    }

    @Nullable
    public final InstoreDetailsData getInStoreDetails() {
        return this.inStoreDetails;
    }

    @Nullable
    public final InStoreLocationData getInStoreLocationData() {
        return this.inStoreLocationData;
    }

    @Nullable
    public final List<ProductInlineLabelApiData> getInlineLabels() {
        return this.inlineLabels;
    }

    @Nullable
    public final ProductListMarketplace getMarketplace() {
        return this.marketplace;
    }

    @Nullable
    public final MemberPriceInfo getMemberPriceInfo() {
        return this.memberPriceInfo;
    }

    @Nullable
    public final String getMultiBuyPrice() {
        return this.multiBuyPrice;
    }

    @Nullable
    public final MultiBuyPriceInfo getMultiBuyPriceInfo() {
        return this.multiBuyPriceInfo;
    }

    @Nullable
    public final String getMultiBuyUnitPrice() {
        return this.multiBuyUnitPrice;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getPrice() {
        return this.price;
    }

    @NotNull
    public final ProductId getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getProductImage() {
        return this.productImage;
    }

    @NotNull
    public final ProductShoppingList getProductShoppingList() {
        return this.productShoppingList;
    }

    @Nullable
    public final PromotionInfo getPromotionInfo() {
        return this.promotionInfo;
    }

    @Nullable
    public final String getPurchaseWarning() {
        return this.purchaseWarning;
    }

    @Nullable
    public final RewardsOfferInfo getRewardsOfferInfo() {
        return this.rewardsOfferInfo;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final TagLabel getTagLabel() {
        return this.tagLabel;
    }

    @Nullable
    public final String getUnitPriceDescription() {
        return this.unitPriceDescription;
    }

    @Nullable
    public final String getWasPrice() {
        return this.wasPrice;
    }

    public int hashCode() {
        int iC = b.c(this.productId.hashCode() * 31, 31, this.name);
        String str = this.productImage;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.badgeImage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.price;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.unitPriceDescription;
        int iE = b.e((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isAvailable);
        String str4 = this.wasPrice;
        int iHashCode4 = (iE + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.multiBuyPrice;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.multiBuyUnitPrice;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.purchaseWarning;
        int iHashCode7 = (this.productShoppingList.hashCode() + ((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31;
        InstoreDetailsData instoreDetailsData = this.inStoreDetails;
        int iHashCode8 = (iHashCode7 + (instoreDetailsData == null ? 0 : instoreDetailsData.hashCode())) * 31;
        List<ProductInlineLabelApiData> list = this.inlineLabels;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        PromotionInfo promotionInfo = this.promotionInfo;
        int iHashCode10 = (iHashCode9 + (promotionInfo == null ? 0 : promotionInfo.hashCode())) * 31;
        RewardsOfferInfo rewardsOfferInfo = this.rewardsOfferInfo;
        int iHashCode11 = (iHashCode10 + (rewardsOfferInfo == null ? 0 : rewardsOfferInfo.hashCode())) * 31;
        String str8 = this.disclaimer;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        TagLabel tagLabel = this.tagLabel;
        int iHashCode13 = (iHashCode12 + (tagLabel == null ? 0 : tagLabel.hashCode())) * 31;
        InStoreAvailabilityInfo inStoreAvailabilityInfo = this.inStoreAvailabilityInfo;
        int iHashCode14 = (iHashCode13 + (inStoreAvailabilityInfo == null ? 0 : inStoreAvailabilityInfo.hashCode())) * 31;
        ProductListMarketplace productListMarketplace = this.marketplace;
        int iHashCode15 = (iHashCode14 + (productListMarketplace == null ? 0 : productListMarketplace.hashCode())) * 31;
        Boolean bool = this.isTobacco;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.source;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        MultiBuyPriceInfo multiBuyPriceInfo = this.multiBuyPriceInfo;
        int iHashCode18 = (iHashCode17 + (multiBuyPriceInfo == null ? 0 : multiBuyPriceInfo.hashCode())) * 31;
        MemberPriceInfo memberPriceInfo = this.memberPriceInfo;
        int iHashCode19 = (iHashCode18 + (memberPriceInfo == null ? 0 : memberPriceInfo.hashCode())) * 31;
        InStoreLocationData inStoreLocationData = this.inStoreLocationData;
        return iHashCode19 + (inStoreLocationData != null ? inStoreLocationData.hashCode() : 0);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    @Nullable
    public final Boolean isTobacco() {
        return this.isTobacco;
    }

    public final void setCategories(@Nullable List<ProductCategory> list) {
        this.categories = list;
    }

    @NotNull
    public String toString() {
        ProductId productId = this.productId;
        String str = this.name;
        String str2 = this.productImage;
        String str3 = this.badgeImage;
        Integer num = this.price;
        String str4 = this.unitPriceDescription;
        boolean z = this.isAvailable;
        String str5 = this.wasPrice;
        String str6 = this.multiBuyPrice;
        String str7 = this.multiBuyUnitPrice;
        String str8 = this.purchaseWarning;
        ProductShoppingList productShoppingList = this.productShoppingList;
        InstoreDetailsData instoreDetailsData = this.inStoreDetails;
        List<ProductInlineLabelApiData> list = this.inlineLabels;
        PromotionInfo promotionInfo = this.promotionInfo;
        RewardsOfferInfo rewardsOfferInfo = this.rewardsOfferInfo;
        String str9 = this.disclaimer;
        TagLabel tagLabel = this.tagLabel;
        InStoreAvailabilityInfo inStoreAvailabilityInfo = this.inStoreAvailabilityInfo;
        ProductListMarketplace productListMarketplace = this.marketplace;
        Boolean bool = this.isTobacco;
        String str10 = this.source;
        MultiBuyPriceInfo multiBuyPriceInfo = this.multiBuyPriceInfo;
        MemberPriceInfo memberPriceInfo = this.memberPriceInfo;
        InStoreLocationData inStoreLocationData = this.inStoreLocationData;
        StringBuilder sb = new StringBuilder("ProductEntity(productId=");
        sb.append(productId);
        sb.append(", name=");
        sb.append(str);
        sb.append(", productImage=");
        a.B(sb, str2, ", badgeImage=", str3, ", price=");
        sb.append(num);
        sb.append(", unitPriceDescription=");
        sb.append(str4);
        sb.append(", isAvailable=");
        au.com.woolworths.android.onesite.a.y(", wasPrice=", str5, ", multiBuyPrice=", sb, z);
        a.B(sb, str6, ", multiBuyUnitPrice=", str7, ", purchaseWarning=");
        sb.append(str8);
        sb.append(", productShoppingList=");
        sb.append(productShoppingList);
        sb.append(", inStoreDetails=");
        sb.append(instoreDetailsData);
        sb.append(", inlineLabels=");
        sb.append(list);
        sb.append(", promotionInfo=");
        sb.append(promotionInfo);
        sb.append(", rewardsOfferInfo=");
        sb.append(rewardsOfferInfo);
        sb.append(", disclaimer=");
        sb.append(str9);
        sb.append(", tagLabel=");
        sb.append(tagLabel);
        sb.append(", inStoreAvailabilityInfo=");
        sb.append(inStoreAvailabilityInfo);
        sb.append(", marketplace=");
        sb.append(productListMarketplace);
        sb.append(", isTobacco=");
        sb.append(bool);
        sb.append(", source=");
        sb.append(str10);
        sb.append(", multiBuyPriceInfo=");
        sb.append(multiBuyPriceInfo);
        sb.append(", memberPriceInfo=");
        sb.append(memberPriceInfo);
        sb.append(", inStoreLocationData=");
        sb.append(inStoreLocationData);
        sb.append(")");
        return sb.toString();
    }
}
