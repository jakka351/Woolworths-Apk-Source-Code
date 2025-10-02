package au.com.woolworths.feature.product.list.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.pagingutils.PageData;
import au.com.woolworths.product.models.ProductCard;
import java.util.Collections;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Bï\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0002HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0002\u0010-J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0011\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005HÆ\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010!HÆ\u0003J\u0080\u0002\u0010_\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00052\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!HÆ\u0001¢\u0006\u0002\u0010`J\u0013\u0010a\u001a\u00020I2\b\u0010b\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010c\u001a\u00020\u0002HÖ\u0001J\t\u0010d\u001a\u00020\u001fHÖ\u0001R$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0016\u0010\t\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010'R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010'R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010'R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010'R\u001a\u0010H\u001a\u00020IX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006e"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductListData;", "Lau/com/woolworths/pagingutils/PageData;", "", "", "products", "", "Lau/com/woolworths/product/models/ProductCard;", "productsFeed", "analytics", "totalCount", "nextPageKey", "filterList", "Lau/com/woolworths/feature/product/list/data/FilterOptionApiData;", "sortList", "Lau/com/woolworths/feature/product/list/data/SortOption;", "sortOptionsBanner", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerData;", "marketplaceProductsSwitch", "Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;", "customMessages", "Lau/com/woolworths/feature/product/list/data/CustomMessage;", "infoSection", "Lau/com/woolworths/base/shopapp/data/models/InfoSection;", "bottomSheet", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "zeroResultContent", "Lau/com/woolworths/feature/product/list/data/ZeroResultPageData;", "chips", "Lau/com/woolworths/feature/product/list/data/ProductListChip;", "facetChips", "pageTitle", "", "zeroResult", "Lau/com/woolworths/feature/product/list/data/ProductListZeroResults;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerData;Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;Ljava/util/List;Lau/com/woolworths/base/shopapp/data/models/InfoSection;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;Lau/com/woolworths/feature/product/list/data/ZeroResultPageData;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lau/com/woolworths/feature/product/list/data/ProductListZeroResults;)V", "getProducts$annotations", "()V", "getProducts", "()Ljava/util/List;", "getProductsFeed", "getAnalytics", "getTotalCount", "()I", "getNextPageKey", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFilterList", "getSortList", "getSortOptionsBanner", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerData;", "getMarketplaceProductsSwitch", "()Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;", "getCustomMessages", "getInfoSection", "()Lau/com/woolworths/base/shopapp/data/models/InfoSection;", "setInfoSection", "(Lau/com/woolworths/base/shopapp/data/models/InfoSection;)V", "getBottomSheet", "()Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "setBottomSheet", "(Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;)V", "getZeroResultContent", "()Lau/com/woolworths/feature/product/list/data/ZeroResultPageData;", "getChips", "getFacetChips", "getPageTitle", "()Ljava/lang/String;", "getZeroResult", "()Lau/com/woolworths/feature/product/list/data/ProductListZeroResults;", "items", "getItems", "fromCache", "", "getFromCache", "()Z", "setFromCache", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerData;Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;Ljava/util/List;Lau/com/woolworths/base/shopapp/data/models/InfoSection;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;Lau/com/woolworths/feature/product/list/data/ZeroResultPageData;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lau/com/woolworths/feature/product/list/data/ProductListZeroResults;)Lau/com/woolworths/feature/product/list/data/ProductListData;", "equals", "other", "hashCode", "toString", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListData implements PageData<Integer, Object> {
    public static final int $stable = 8;

    @Nullable
    private final List<Object> analytics;

    @MappedName
    @Nullable
    private BottomSheetContent.Marketplace bottomSheet;

    @NotNull
    private final List<ProductListChip> chips;

    @Nullable
    private final List<CustomMessage> customMessages;

    @NotNull
    private final List<ProductListChip> facetChips;

    @MappedName
    @NotNull
    private final List<FilterOptionApiData> filterList;
    private boolean fromCache;

    @MappedName
    @Nullable
    private InfoSection infoSection;

    @MappedName
    @Nullable
    private final ProductFilterSwitch marketplaceProductsSwitch;

    @MappedName
    @Nullable
    private final Integer nextPageKey;

    @Nullable
    private final String pageTitle;

    @Nullable
    private final List<ProductCard> products;

    @Nullable
    private final List<Object> productsFeed;

    @MappedName
    @NotNull
    private final List<SortOption> sortList;

    @MappedName
    @Nullable
    private final InsetBannerData sortOptionsBanner;

    @MappedName
    private final int totalCount;

    @Nullable
    private final ProductListZeroResults zeroResult;

    @Nullable
    private final ZeroResultPageData zeroResultContent;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductListData(@Nullable List<ProductCard> list, @Nullable List<? extends Object> list2, @Nullable List<? extends Object> list3, int i, @Nullable Integer num, @NotNull List<FilterOptionApiData> filterList, @NotNull List<SortOption> sortList, @Nullable InsetBannerData insetBannerData, @Nullable ProductFilterSwitch productFilterSwitch, @Nullable List<? extends CustomMessage> list4, @Nullable InfoSection infoSection, @Nullable BottomSheetContent.Marketplace marketplace, @Nullable ZeroResultPageData zeroResultPageData, @NotNull List<ProductListChip> chips, @NotNull List<ProductListChip> facetChips, @Nullable String str, @Nullable ProductListZeroResults productListZeroResults) {
        Intrinsics.h(filterList, "filterList");
        Intrinsics.h(sortList, "sortList");
        Intrinsics.h(chips, "chips");
        Intrinsics.h(facetChips, "facetChips");
        this.products = list;
        this.productsFeed = list2;
        this.analytics = list3;
        this.totalCount = i;
        this.nextPageKey = num;
        this.filterList = filterList;
        this.sortList = sortList;
        this.sortOptionsBanner = insetBannerData;
        this.marketplaceProductsSwitch = productFilterSwitch;
        this.customMessages = list4;
        this.infoSection = infoSection;
        this.bottomSheet = marketplace;
        this.zeroResultContent = zeroResultPageData;
        this.chips = chips;
        this.facetChips = facetChips;
        this.pageTitle = str;
        this.zeroResult = productListZeroResults;
    }

    public static /* synthetic */ ProductListData copy$default(ProductListData productListData, List list, List list2, List list3, int i, Integer num, List list4, List list5, InsetBannerData insetBannerData, ProductFilterSwitch productFilterSwitch, List list6, InfoSection infoSection, BottomSheetContent.Marketplace marketplace, ZeroResultPageData zeroResultPageData, List list7, List list8, String str, ProductListZeroResults productListZeroResults, int i2, Object obj) {
        ProductListZeroResults productListZeroResults2;
        String str2;
        List list9;
        ProductListData productListData2;
        List list10;
        List list11;
        List list12;
        int i3;
        Integer num2;
        List list13;
        List list14;
        InsetBannerData insetBannerData2;
        ProductFilterSwitch productFilterSwitch2;
        List list15;
        InfoSection infoSection2;
        BottomSheetContent.Marketplace marketplace2;
        ZeroResultPageData zeroResultPageData2;
        List list16;
        List list17 = (i2 & 1) != 0 ? productListData.products : list;
        List list18 = (i2 & 2) != 0 ? productListData.productsFeed : list2;
        List list19 = (i2 & 4) != 0 ? productListData.analytics : list3;
        int i4 = (i2 & 8) != 0 ? productListData.totalCount : i;
        Integer num3 = (i2 & 16) != 0 ? productListData.nextPageKey : num;
        List list20 = (i2 & 32) != 0 ? productListData.filterList : list4;
        List list21 = (i2 & 64) != 0 ? productListData.sortList : list5;
        InsetBannerData insetBannerData3 = (i2 & 128) != 0 ? productListData.sortOptionsBanner : insetBannerData;
        ProductFilterSwitch productFilterSwitch3 = (i2 & 256) != 0 ? productListData.marketplaceProductsSwitch : productFilterSwitch;
        List list22 = (i2 & 512) != 0 ? productListData.customMessages : list6;
        InfoSection infoSection3 = (i2 & 1024) != 0 ? productListData.infoSection : infoSection;
        BottomSheetContent.Marketplace marketplace3 = (i2 & 2048) != 0 ? productListData.bottomSheet : marketplace;
        ZeroResultPageData zeroResultPageData3 = (i2 & 4096) != 0 ? productListData.zeroResultContent : zeroResultPageData;
        List list23 = (i2 & 8192) != 0 ? productListData.chips : list7;
        List list24 = list17;
        List list25 = (i2 & 16384) != 0 ? productListData.facetChips : list8;
        String str3 = (i2 & 32768) != 0 ? productListData.pageTitle : str;
        if ((i2 & 65536) != 0) {
            str2 = str3;
            productListZeroResults2 = productListData.zeroResult;
            list10 = list25;
            list11 = list18;
            list12 = list19;
            i3 = i4;
            num2 = num3;
            list13 = list20;
            list14 = list21;
            insetBannerData2 = insetBannerData3;
            productFilterSwitch2 = productFilterSwitch3;
            list15 = list22;
            infoSection2 = infoSection3;
            marketplace2 = marketplace3;
            zeroResultPageData2 = zeroResultPageData3;
            list16 = list23;
            list9 = list24;
            productListData2 = productListData;
        } else {
            productListZeroResults2 = productListZeroResults;
            str2 = str3;
            list9 = list24;
            productListData2 = productListData;
            list10 = list25;
            list11 = list18;
            list12 = list19;
            i3 = i4;
            num2 = num3;
            list13 = list20;
            list14 = list21;
            insetBannerData2 = insetBannerData3;
            productFilterSwitch2 = productFilterSwitch3;
            list15 = list22;
            infoSection2 = infoSection3;
            marketplace2 = marketplace3;
            zeroResultPageData2 = zeroResultPageData3;
            list16 = list23;
        }
        return productListData2.copy(list9, list11, list12, i3, num2, list13, list14, insetBannerData2, productFilterSwitch2, list15, infoSection2, marketplace2, zeroResultPageData2, list16, list10, str2, productListZeroResults2);
    }

    @Deprecated
    public static /* synthetic */ void getProducts$annotations() {
    }

    @Nullable
    public final List<ProductCard> component1() {
        return this.products;
    }

    @Nullable
    public final List<CustomMessage> component10() {
        return this.customMessages;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final InfoSection getInfoSection() {
        return this.infoSection;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final BottomSheetContent.Marketplace getBottomSheet() {
        return this.bottomSheet;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final ZeroResultPageData getZeroResultContent() {
        return this.zeroResultContent;
    }

    @NotNull
    public final List<ProductListChip> component14() {
        return this.chips;
    }

    @NotNull
    public final List<ProductListChip> component15() {
        return this.facetChips;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getPageTitle() {
        return this.pageTitle;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final ProductListZeroResults getZeroResult() {
        return this.zeroResult;
    }

    @Nullable
    public final List<Object> component2() {
        return this.productsFeed;
    }

    @Nullable
    public final List<Object> component3() {
        return this.analytics;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getNextPageKey() {
        return this.nextPageKey;
    }

    @NotNull
    public final List<FilterOptionApiData> component6() {
        return this.filterList;
    }

    @NotNull
    public final List<SortOption> component7() {
        return this.sortList;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final InsetBannerData getSortOptionsBanner() {
        return this.sortOptionsBanner;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final ProductFilterSwitch getMarketplaceProductsSwitch() {
        return this.marketplaceProductsSwitch;
    }

    @NotNull
    public final ProductListData copy(@Nullable List<ProductCard> products, @Nullable List<? extends Object> productsFeed, @Nullable List<? extends Object> analytics, int totalCount, @Nullable Integer nextPageKey, @NotNull List<FilterOptionApiData> filterList, @NotNull List<SortOption> sortList, @Nullable InsetBannerData sortOptionsBanner, @Nullable ProductFilterSwitch marketplaceProductsSwitch, @Nullable List<? extends CustomMessage> customMessages, @Nullable InfoSection infoSection, @Nullable BottomSheetContent.Marketplace bottomSheet, @Nullable ZeroResultPageData zeroResultContent, @NotNull List<ProductListChip> chips, @NotNull List<ProductListChip> facetChips, @Nullable String pageTitle, @Nullable ProductListZeroResults zeroResult) {
        Intrinsics.h(filterList, "filterList");
        Intrinsics.h(sortList, "sortList");
        Intrinsics.h(chips, "chips");
        Intrinsics.h(facetChips, "facetChips");
        return new ProductListData(products, productsFeed, analytics, totalCount, nextPageKey, filterList, sortList, sortOptionsBanner, marketplaceProductsSwitch, customMessages, infoSection, bottomSheet, zeroResultContent, chips, facetChips, pageTitle, zeroResult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListData)) {
            return false;
        }
        ProductListData productListData = (ProductListData) other;
        return Intrinsics.c(this.products, productListData.products) && Intrinsics.c(this.productsFeed, productListData.productsFeed) && Intrinsics.c(this.analytics, productListData.analytics) && this.totalCount == productListData.totalCount && Intrinsics.c(this.nextPageKey, productListData.nextPageKey) && Intrinsics.c(this.filterList, productListData.filterList) && Intrinsics.c(this.sortList, productListData.sortList) && Intrinsics.c(this.sortOptionsBanner, productListData.sortOptionsBanner) && Intrinsics.c(this.marketplaceProductsSwitch, productListData.marketplaceProductsSwitch) && Intrinsics.c(this.customMessages, productListData.customMessages) && Intrinsics.c(this.infoSection, productListData.infoSection) && Intrinsics.c(this.bottomSheet, productListData.bottomSheet) && Intrinsics.c(this.zeroResultContent, productListData.zeroResultContent) && Intrinsics.c(this.chips, productListData.chips) && Intrinsics.c(this.facetChips, productListData.facetChips) && Intrinsics.c(this.pageTitle, productListData.pageTitle) && Intrinsics.c(this.zeroResult, productListData.zeroResult);
    }

    @Nullable
    public final List<Object> getAnalytics() {
        return this.analytics;
    }

    @Nullable
    public final BottomSheetContent.Marketplace getBottomSheet() {
        return this.bottomSheet;
    }

    @NotNull
    public final List<ProductListChip> getChips() {
        return this.chips;
    }

    @Nullable
    public final List<CustomMessage> getCustomMessages() {
        return this.customMessages;
    }

    @NotNull
    public final List<ProductListChip> getFacetChips() {
        return this.facetChips;
    }

    @NotNull
    public final List<FilterOptionApiData> getFilterList() {
        return this.filterList;
    }

    public final boolean getFromCache() {
        return this.fromCache;
    }

    @Nullable
    public final InfoSection getInfoSection() {
        return this.infoSection;
    }

    @Override // au.com.woolworths.pagingutils.PageData
    @NotNull
    public List<Object> getItems() {
        List<Object> list = this.productsFeed;
        if (list != null) {
            return list;
        }
        List<ProductCard> list2 = this.products;
        if (list2 != null) {
            return list2;
        }
        List<Object> list3 = Collections.EMPTY_LIST;
        Intrinsics.g(list3, "emptyList(...)");
        return list3;
    }

    @Nullable
    public final ProductFilterSwitch getMarketplaceProductsSwitch() {
        return this.marketplaceProductsSwitch;
    }

    @Nullable
    public final String getPageTitle() {
        return this.pageTitle;
    }

    @Nullable
    public final List<ProductCard> getProducts() {
        return this.products;
    }

    @Nullable
    public final List<Object> getProductsFeed() {
        return this.productsFeed;
    }

    @NotNull
    public final List<SortOption> getSortList() {
        return this.sortList;
    }

    @Nullable
    public final InsetBannerData getSortOptionsBanner() {
        return this.sortOptionsBanner;
    }

    @Override // au.com.woolworths.pagingutils.PageData
    public int getTotalCount() {
        return this.totalCount;
    }

    @Nullable
    public final ProductListZeroResults getZeroResult() {
        return this.zeroResult;
    }

    @Nullable
    public final ZeroResultPageData getZeroResultContent() {
        return this.zeroResultContent;
    }

    public int hashCode() {
        List<ProductCard> list = this.products;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Object> list2 = this.productsFeed;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Object> list3 = this.analytics;
        int iA = b.a(this.totalCount, (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31, 31);
        Integer num = this.nextPageKey;
        int iD = b.d(b.d((iA + (num == null ? 0 : num.hashCode())) * 31, 31, this.filterList), 31, this.sortList);
        InsetBannerData insetBannerData = this.sortOptionsBanner;
        int iHashCode3 = (iD + (insetBannerData == null ? 0 : insetBannerData.hashCode())) * 31;
        ProductFilterSwitch productFilterSwitch = this.marketplaceProductsSwitch;
        int iHashCode4 = (iHashCode3 + (productFilterSwitch == null ? 0 : productFilterSwitch.hashCode())) * 31;
        List<CustomMessage> list4 = this.customMessages;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        InfoSection infoSection = this.infoSection;
        int iHashCode6 = (iHashCode5 + (infoSection == null ? 0 : infoSection.hashCode())) * 31;
        BottomSheetContent.Marketplace marketplace = this.bottomSheet;
        int iHashCode7 = (iHashCode6 + (marketplace == null ? 0 : marketplace.hashCode())) * 31;
        ZeroResultPageData zeroResultPageData = this.zeroResultContent;
        int iD2 = b.d(b.d((iHashCode7 + (zeroResultPageData == null ? 0 : zeroResultPageData.hashCode())) * 31, 31, this.chips), 31, this.facetChips);
        String str = this.pageTitle;
        int iHashCode8 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        ProductListZeroResults productListZeroResults = this.zeroResult;
        return iHashCode8 + (productListZeroResults != null ? productListZeroResults.hashCode() : 0);
    }

    public final void setBottomSheet(@Nullable BottomSheetContent.Marketplace marketplace) {
        this.bottomSheet = marketplace;
    }

    public final void setFromCache(boolean z) {
        this.fromCache = z;
    }

    public final void setInfoSection(@Nullable InfoSection infoSection) {
        this.infoSection = infoSection;
    }

    @NotNull
    public String toString() {
        return "ProductListData(products=" + this.products + ", productsFeed=" + this.productsFeed + ", analytics=" + this.analytics + ", totalCount=" + this.totalCount + ", nextPageKey=" + this.nextPageKey + ", filterList=" + this.filterList + ", sortList=" + this.sortList + ", sortOptionsBanner=" + this.sortOptionsBanner + ", marketplaceProductsSwitch=" + this.marketplaceProductsSwitch + ", customMessages=" + this.customMessages + ", infoSection=" + this.infoSection + ", bottomSheet=" + this.bottomSheet + ", zeroResultContent=" + this.zeroResultContent + ", chips=" + this.chips + ", facetChips=" + this.facetChips + ", pageTitle=" + this.pageTitle + ", zeroResult=" + this.zeroResult + ")";
    }

    @Override // au.com.woolworths.pagingutils.PageData
    @Nullable
    public Integer getNextPageKey() {
        return this.nextPageKey;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ProductListData(java.util.List r21, java.util.List r22, java.util.List r23, int r24, java.lang.Integer r25, java.util.List r26, java.util.List r27, au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData r28, au.com.woolworths.feature.product.list.data.ProductFilterSwitch r29, java.util.List r30, au.com.woolworths.base.shopapp.data.models.InfoSection r31, au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent.Marketplace r32, au.com.woolworths.feature.product.list.data.ZeroResultPageData r33, java.util.List r34, java.util.List r35, java.lang.String r36, au.com.woolworths.feature.product.list.data.ProductListZeroResults r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r20 = this;
            r0 = r38
            r1 = r0 & 8
            if (r1 == 0) goto L9
            r1 = 0
            r6 = r1
            goto Lb
        L9:
            r6 = r24
        Lb:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L12
            r7 = r2
            goto L14
        L12:
            r7 = r25
        L14:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L1a
            r10 = r2
            goto L1c
        L1a:
            r10 = r28
        L1c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L22
            r11 = r2
            goto L24
        L22:
            r11 = r29
        L24:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L2a
            r12 = r2
            goto L2c
        L2a:
            r12 = r30
        L2c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L32
            r13 = r2
            goto L34
        L32:
            r13 = r31
        L34:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L3a
            r14 = r2
            goto L3c
        L3a:
            r14 = r32
        L3c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L42
            r15 = r2
            goto L44
        L42:
            r15 = r33
        L44:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.d
            if (r1 == 0) goto L4d
            r16 = r3
            goto L4f
        L4d:
            r16 = r34
        L4f:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L56
            r17 = r3
            goto L58
        L56:
            r17 = r35
        L58:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L61
            r18 = r2
            goto L63
        L61:
            r18 = r36
        L63:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L77
            r19 = r2
            r3 = r21
            r4 = r22
            r5 = r23
            r8 = r26
            r9 = r27
            r2 = r20
            goto L85
        L77:
            r19 = r37
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r8 = r26
            r9 = r27
        L85:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.data.ProductListData.<init>(java.util.List, java.util.List, java.util.List, int, java.lang.Integer, java.util.List, java.util.List, au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData, au.com.woolworths.feature.product.list.data.ProductFilterSwitch, java.util.List, au.com.woolworths.base.shopapp.data.models.InfoSection, au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent$Marketplace, au.com.woolworths.feature.product.list.data.ZeroResultPageData, java.util.List, java.util.List, java.lang.String, au.com.woolworths.feature.product.list.data.ProductListZeroResults, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
