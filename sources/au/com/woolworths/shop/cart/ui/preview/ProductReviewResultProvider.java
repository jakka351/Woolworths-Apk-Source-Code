package au.com.woolworths.shop.cart.ui.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionPlacementTypeApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionTypeApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerError;
import au.com.woolworths.android.onesite.network.ServerErrorCode;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.shop.cart.domain.model.PageResult;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import au.com.woolworths.shop.cart.domain.model.ProductReviewFeed;
import au.com.woolworths.shop.cart.domain.model.ProductReviewGroupType;
import au.com.woolworths.shop.cart.domain.model.ProductReviewResult;
import au.com.woolworths.shop.cart.ui.preview.ProductReviewCardProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/cart/ui/preview/ProductReviewResultProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/cart/domain/model/PageResult;", "Lau/com/woolworths/shop/cart/domain/model/ProductReviewResult;", "TestCase", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductReviewResultProvider implements PreviewParameterProvider<PageResult<? extends ProductReviewResult>> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/preview/ProductReviewResultProvider$TestCase;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final PageResult d;

        static {
            TestCase testCase = new TestCase("Loading", 0, PageResult.Uninitialized.f10439a);
            InsetBannerTypeApiData insetBannerTypeApiData = InsetBannerTypeApiData.WARNING;
            InsetBannerApiData insetBannerApiData = new InsetBannerApiData(insetBannerTypeApiData, "These items are unavailable.", null, null, null, null, 32, null);
            ProductReviewGroupType productReviewGroupType = ProductReviewGroupType.d;
            List listQ = CollectionsKt.Q(new ProductReviewFeed.ProductReviewGroup(insetBannerApiData, productReviewGroupType, CollectionsKt.R(ProductReviewCardProvider.TestCase.e.d, ProductReviewCardProvider.TestCase.f.d, ProductReviewCardProvider.TestCase.g.d), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)));
            EmptyList emptyList = EmptyList.d;
            TestCase testCase2 = new TestCase("Unavailable", 1, new PageResult.Success(new ProductReviewResult.Response("Before continuing to Checkout, the following products in your cart need to be reviewed.", listQ, emptyList)));
            InsetBannerApiData insetBannerApiData2 = new InsetBannerApiData(insetBannerTypeApiData, "These items are only available between 2:00pm and 10:00pm.", null, new InsetBannerActionApiData("Select a different time", null, InsetBannerActionTypeApiData.APPLOCAL, InsetBannerActionPlacementTypeApiData.BOTTOM, null), null, null, 32, null);
            ProductReviewCardProvider.TestCase testCase3 = ProductReviewCardProvider.TestCase.h;
            ProductReviewCard productReviewCard = testCase3.d;
            ProductReviewCardProvider.TestCase testCase4 = ProductReviewCardProvider.TestCase.i;
            ProductReviewCard productReviewCard2 = testCase4.d;
            ProductReviewCardProvider.TestCase testCase5 = ProductReviewCardProvider.TestCase.j;
            TestCase[] testCaseArr = {testCase, testCase2, new TestCase("RestrictedTime", 2, new PageResult.Success(new ProductReviewResult.Response("Before continuing to Checkout, the following products in your cart need to be reviewed.", CollectionsKt.Q(new ProductReviewFeed.ProductReviewGroup(insetBannerApiData2, productReviewGroupType, CollectionsKt.R(productReviewCard, productReviewCard2, testCase5.d), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), emptyList))), new TestCase("RestrictedItemLimit", 3, new PageResult.Success(new ProductReviewResult.Response("Before continuing to Checkout, the following products in your cart need to be reviewed.", CollectionsKt.Q(new ProductReviewFeed.ProductReviewGroup(new InsetBannerApiData(insetBannerTypeApiData, "These items have exceeded their combined limit of 2. Please update to continue", null, null, null, null, 32, null), productReviewGroupType, CollectionsKt.R(testCase3.d, testCase4.d, testCase5.d), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), emptyList))), new TestCase("RestrictedAtpLimit", 4, new PageResult.Success(new ProductReviewResult.Response("Before continuing to Checkout, the following products in your cart need to be reviewed.", CollectionsKt.Q(new ProductReviewFeed.ProductReviewGroup(new InsetBannerApiData(insetBannerTypeApiData, "The requested quantity is no longer available.", null, null, null, null, 32, null), productReviewGroupType, CollectionsKt.R(ProductReviewCardProvider.TestCase.k.d, ProductReviewCardProvider.TestCase.l.d, ProductReviewCardProvider.TestCase.m.d, ProductReviewCardProvider.TestCase.n.d), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), emptyList))), new TestCase("NoConnection", 5, new PageResult.Fail(new NoConnectivityException())), new TestCase("ServerError", 6, new PageResult.Fail(new ServerErrorException(new ServerError(ServerErrorCode.d, null))))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, PageResult pageResult) {
            this.d = pageResult;
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) e.clone();
        }
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
