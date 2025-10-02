package au.com.woolworths.shop.cart.ui.quickadd;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.ProductTileButtonType;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.PurchaseRestriction;
import au.com.woolworths.shop.cart.domain.model.OfferProductList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/OfferProductListProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/cart/domain/model/OfferProductList$Success;", "TestCase", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OfferProductListProvider implements PreviewParameterProvider<OfferProductList.Success> {

    /* renamed from: a, reason: collision with root package name */
    public static final List f10528a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/OfferProductListProvider$Companion;", "", "", "Lau/com/woolworths/product/models/ProductCard;", "products", "Ljava/util/List;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/OfferProductListProvider$TestCase;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final OfferProductList.Success d;

        static {
            OfferProductList.Success.Progress.ProgressStepType progressStepType = OfferProductList.Success.Progress.ProgressStepType.f;
            OfferProductList.Success.Progress progress = new OfferProductList.Success.Progress("", 1, progressStepType, 2);
            OfferProductList.Success.OfferType offerType = OfferProductList.Success.OfferType.e;
            List list = OfferProductListProvider.f10528a;
            TestCase testCase = new TestCase("BuyMoreSaveMoreNoBadgeNoProgress", 0, new OfferProductList.Success(false, "https://www.woolworths.com.au/content/promotiontags/online-only-special-green-roundel.png", "Buy 2 or more for $3.50 each", "Add 1 more item to enjoy savings", progress, offerType, list, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)));
            OfferProductList.Success.Progress.ProgressStepType progressStepType2 = OfferProductList.Success.Progress.ProgressStepType.d;
            TestCase testCase2 = new TestCase("BuyMoreSaveMoreInProgress", 1, new OfferProductList.Success(false, "https://uatcdn0.woolworths.media/content/promotiontags/roundel-buy-more-save-more-200x200.png", "Buy 2 or more for $3.50 each", "Add 1 more item to enjoy savings", new OfferProductList.Success.Progress("", 1, progressStepType2, 2), offerType, list, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)));
            TestCase testCase3 = new TestCase("BuyMoreSaveMoreDone", 2, new OfferProductList.Success(true, "https://uatcdn0.woolworths.media/content/promotiontags/roundel-buy-more-save-more-200x200.png", "Enjoy more savings", "You can now add more items at $3.50 each", new OfferProductList.Success.Progress("", 2, progressStepType2, 2), offerType, list, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)));
            OfferProductList.Success.Progress progress2 = new OfferProductList.Success.Progress("", 1, progressStepType, 2);
            OfferProductList.Success.OfferType offerType2 = OfferProductList.Success.OfferType.f;
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, new TestCase("MemberPriceNoBadgeNoProgress", 3, new OfferProductList.Success(false, "https://uatcdn0.woolworths.media/content/promotiontags/roundel-buy-more-save-more-200x200.png", "Buy 2 or more for $3.50 each", "Add 1 more item to enjoy savings", progress2, offerType2, list, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), new TestCase("MemberPriceInProgress", 4, new OfferProductList.Success(false, "https://uatcdn0.woolworths.media/content/promotiontags/roundel-buy-more-save-more-200x200.png", "Buy 2 or more for $3.50 each", "Add 1 more item to enjoy savings", new OfferProductList.Success.Progress("", 1, progressStepType2, 2), offerType2, list, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), new TestCase("MemberPriceDone", 5, new OfferProductList.Success(true, "https://uatcdn0.woolworths.media/content/promotiontags/roundel-buy-more-save-more-200x200.png", "Enjoy more savings", "You can now add more items at $3.50 each", new OfferProductList.Success.Progress("", 2, progressStepType2, 2), offerType2, list, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, OfferProductList.Success success) {
            this.d = success;
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) e.clone();
        }
    }

    static {
        PurchaseRestriction purchaseRestriction = PurchaseRestriction.NO_RESTRICTION;
        ProductShoppingList productShoppingList = new ProductShoppingList(1.0d, 7.0d, 1.0d, 1.0d, null, 16, null);
        ProductTileButtonType productTileButtonType = ProductTileButtonType.ADD;
        f10528a = CollectionsKt.R(new ProductCard("000000000000036066", "Arnott's Tim Tam Original Chocolate Biscuits 200g", "https://assets.woolworths.com.au/images/1005/36066.jpg?impolicy=wowsmmobeac&w=260&h=260", "https://www.woolworths.com.au/content/promotiontags/online-only-special-green-roundel.png", 600, null, null, null, "$3.00 per 100 g", true, false, null, null, null, null, new ProductTrolleyData(1.0d, 36.0d, 1.0d, 1.0d, null, null, productTileButtonType, "Add", null, null), null, productShoppingList, null, purchaseRestriction, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, -689952, 255, null), new ProductCard("000000000000084628", "Arnott's Tim Tam Original Family Pack Chocolate Biscuits 365g", "https://assets.woolworths.com.au/images/1005/84628.jpg?impolicy=wowsmmobeac&w=260&h=260", null, 600, null, null, null, "$2.05 per 100g", true, false, null, null, null, null, new ProductTrolleyData(1.0d, 36.0d, 1.0d, 1.0d, Double.valueOf(1.0d), null, ProductTileButtonType.UPDATE, "Update", "1", null), null, new ProductShoppingList(1.0d, 36.0d, 1.0d, 1.0d, null, 16, null), null, purchaseRestriction, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, -689944, 255, null), new ProductCard("000000001120150709", "Arnott's Tim Tam Original Share Box 6 x 200g", "https://assets.woolworths.com.au/images/1005/1120150709.jpg?impolicy=wowsmmobeac&w=260&h=260", "https://www.woolworths.com.au/content/promotiontags/everyday-market-free-shipping.png", 600, null, null, null, "$4.02 per 100g", true, false, null, null, null, null, new ProductTrolleyData(1.0d, 36.0d, 1.0d, 1.0d, null, null, productTileButtonType, "Add", null, null), null, new ProductShoppingList(1.0d, 7.0d, 1.0d, 1.0d, null, 16, null), null, purchaseRestriction, null, null, null, null, new ProductListMarketplace("https://www.woolworths.com.au/content/promotiontags/em-roundel-circle.png", "Sold & Shipped by Market Partner", "Solly's Online Grocery", "Arnott's", null), null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, -17467168, 255, null));
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        List list = TestCase.f;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = ((AbstractList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((TestCase) it.next()).d);
        }
        return CollectionsKt.n(arrayList);
    }
}
