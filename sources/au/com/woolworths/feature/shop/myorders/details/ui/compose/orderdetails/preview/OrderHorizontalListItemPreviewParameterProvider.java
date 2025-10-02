package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.feature.shop.myorders.details.models.MyGroceriesProductListBadge;
import au.com.woolworths.feature.shop.myorders.details.models.MyGroceriesProductListBadgeType;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailsProductCardData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/preview/OrderHorizontalListItemPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/android/onesite/data/HorizontalListData;", "TestCase", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderHorizontalListItemPreviewParameterProvider implements PreviewParameterProvider<HorizontalListData> {

    /* renamed from: a, reason: collision with root package name */
    public static final List f7802a = CollectionsKt.R(new OrderDetailsProductCardData(1111, "Product 1", "", 1.0d, "", null), new OrderDetailsProductCardData(2222, "Product 2", "", 1.0d, "", null));
    public static final MyGroceriesProductListBadge b = new MyGroceriesProductListBadge(MyGroceriesProductListBadgeType.e, "1");
    public static final MyGroceriesProductListBadge c = new MyGroceriesProductListBadge(MyGroceriesProductListBadgeType.f, "2");
    public static final MyGroceriesProductListBadge d = new MyGroceriesProductListBadge(MyGroceriesProductListBadgeType.d, "3");
    public static final MyGroceriesProductListBadge e = new MyGroceriesProductListBadge(MyGroceriesProductListBadgeType.g, "4");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/preview/OrderHorizontalListItemPreviewParameterProvider$Companion;", "", "", "Lau/com/woolworths/feature/shop/myorders/details/models/OrderDetailsProductCardData;", "items", "Ljava/util/List;", "Lau/com/woolworths/feature/shop/myorders/details/models/MyGroceriesProductListBadge;", "outOfStockBadge", "Lau/com/woolworths/feature/shop/myorders/details/models/MyGroceriesProductListBadge;", "substitutedBadge", "suppliedBadge", "totalItemBadge", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/preview/OrderHorizontalListItemPreviewParameterProvider$TestCase;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            List list = OrderHorizontalListItemPreviewParameterProvider.f7802a;
            MyGroceriesProductListBadge myGroceriesProductListBadge = OrderHorizontalListItemPreviewParameterProvider.b;
            MyGroceriesProductListBadge myGroceriesProductListBadge2 = OrderHorizontalListItemPreviewParameterProvider.c;
            MyGroceriesProductListBadge myGroceriesProductListBadge3 = OrderHorizontalListItemPreviewParameterProvider.d;
            new HorizontalListData("My items", null, null, null, null, list, null, null, null, CollectionsKt.R(myGroceriesProductListBadge, myGroceriesProductListBadge2, myGroceriesProductListBadge3));
            TestCase testCase = new TestCase("AllBadges", 0);
            new HorizontalListData("My items", null, null, null, null, list, null, null, null, CollectionsKt.Q(myGroceriesProductListBadge));
            TestCase testCase2 = new TestCase("OutOfStockBadge", 1);
            new HorizontalListData("My items", null, null, null, null, list, null, null, null, CollectionsKt.Q(myGroceriesProductListBadge2));
            TestCase testCase3 = new TestCase("SubstitutedBadge", 2);
            new HorizontalListData("My items", null, null, null, null, list, null, null, null, CollectionsKt.Q(myGroceriesProductListBadge3));
            TestCase testCase4 = new TestCase("SuppliedBadge", 3);
            new HorizontalListData("My items", null, null, null, null, list, null, null, null, CollectionsKt.Q(OrderHorizontalListItemPreviewParameterProvider.e));
            TestCase testCase5 = new TestCase("TotalItemBadge", 4);
            new HorizontalListData("My items", null, null, null, null, list, null, null, null, null);
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, testCase4, testCase5, new TestCase("NoBadge", 5)};
            d = testCaseArr;
            e = EnumEntriesKt.a(testCaseArr);
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) d.clone();
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
