package au.com.woolworths.feature.shop.editorder.review.components.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import au.com.woolworths.feature.shop.editorder.review.data.ChangeMyOrderDetailsSection;
import au.com.woolworths.feature.shop.editorder.review.data.ChangeMyOrderDetailsSectionItems;
import au.com.woolworths.feature.shop.editorder.review.data.ChangeMyOrderSummary;
import au.com.woolworths.feature.shop.editorder.review.data.FooterCtaSection;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderConfirmation;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerModel;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerStyle;
import au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/components/preview/CmoReviewViewStateProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$ViewState;", "TestCase", "Companion", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CmoReviewViewStateProvider implements PreviewParameterProvider<CmoReviewContract.ViewState> {

    /* renamed from: a, reason: collision with root package name */
    public static final ChangeMyOrderDetailsSectionItems.Cart f7119a;
    public static final ChangeMyOrderSummary b;
    public static final EditOrderConfirmation c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/components/preview/CmoReviewViewStateProvider$Companion;", "", "Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderSummary;", "content", "Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderSummary;", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderConfirmation;", "confirmDialog", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderConfirmation;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/components/preview/CmoReviewViewStateProvider$TestCase;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final CmoReviewContract.ViewState d;

        static {
            TestCase testCase = new TestCase("Loading", 0, CmoReviewContract.ViewState.Loading.f7097a);
            TestCase testCase2 = new TestCase("ServerError", 1, new CmoReviewContract.ViewState.Error(FullPageMessage.Error.ServerError.f8916a));
            TestCase testCase3 = new TestCase("ConnectionError", 2, new CmoReviewContract.ViewState.Error(FullPageMessage.Error.ConnectionError.f8915a));
            ChangeMyOrderSummary changeMyOrderSummary = CmoReviewViewStateProvider.b;
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, new TestCase("Content", 3, new CmoReviewContract.ViewState.Content(changeMyOrderSummary, (EditOrderConfirmation) null, 6)), new TestCase("ContentWithDialog", 4, new CmoReviewContract.ViewState.Content(changeMyOrderSummary, CmoReviewViewStateProvider.c, 4)), new TestCase("ContentWithLoadingOverlay", 5, new CmoReviewContract.ViewState.Content(changeMyOrderSummary, (EditOrderConfirmation) null, true))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, CmoReviewContract.ViewState viewState) {
            this.d = viewState;
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) e.clone();
        }
    }

    static {
        ChangeMyOrderDetailsSectionItems.Cart cart = new ChangeMyOrderDetailsSectionItems.Cart("Cart", "Manage items and add products to your order", 99, CollectionsKt.R(new ChangeMyOrderDetailsSectionItems.Cart.ActionTile("shop", "Shop", ""), new ChangeMyOrderDetailsSectionItems.Cart.ActionTile("buy-again", "Buy again", ""), new ChangeMyOrderDetailsSectionItems.Cart.ActionTile("past-shops", "Past shops", ""), new ChangeMyOrderDetailsSectionItems.Cart.ActionTile("specials", "Specials", ""), new ChangeMyOrderDetailsSectionItems.Cart.ActionTile("offers", "Offers", "")));
        f7119a = cart;
        b = new ChangeMyOrderSummary(new BasicCoreBroadcastBannerModel(null, new CoreBroadcastBannerModel("Making changes. Finalise in Checkout by 10pm, Thursday 5 December.", null, CoreBroadcastBannerStyle.f, new IconAsset.HostedIcon("")), null, null, null, null, false), new ChangeMyOrderDetailsSection("Get started", "Manage order details, update existing items and add additional products to your order", CollectionsKt.R(new ChangeMyOrderDetailsSectionItems.FulfilmentMethod("Delivery", "463 Newfinland Road, Alexander Heights", ""), new ChangeMyOrderDetailsSectionItems.FulfilmentTimeSlot(new TextWithAltApiData("Friday, 6 Dec • 12pm-3pm", "Friday, 6 Dec • 12pm-3pm"), null, ""), new ChangeMyOrderDetailsSectionItems.DeliveryInstructions("Delivery instructions", "Meet at my door. Ring doorbell on arrival. Then wait for me at the door first.", ""), cart)), new FooterCtaSection(new ButtonApiData("Cancel changes", null, ButtonStyleApiData.DESTRUCTIVE, true, null, null, null, null, null, 498, null), new ButtonApiData("Checkout", null, ButtonStyleApiData.PRIMARY, true, null, null, null, null, null, 498, null)));
        c = new EditOrderConfirmation("Cancel changes?", "You’ll still receive your original order as scheduled. Are you sure you want to cancel these changes?");
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
