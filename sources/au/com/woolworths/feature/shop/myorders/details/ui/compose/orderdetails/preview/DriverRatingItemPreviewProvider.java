package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.models.Chip;
import au.com.woolworths.feature.shop.myorders.details.models.ChipText;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRating;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingFeedbackAndComments;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingStarsSurvey;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingThankYou;
import au.com.woolworths.feature.shop.myorders.details.models.StarCount;
import au.com.woolworths.sdui.common.alert.model.CoreAlertStyle;
import au.com.woolworths.sdui.common.alert.model.CoreInsetAlertModel;
import au.com.woolworths.sdui.common.button.model.CoreButtonModel;
import au.com.woolworths.sdui.common.button.model.CoreButtonStyle;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/preview/DriverRatingItemPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState;", "TestCase", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DriverRatingItemPreviewProvider implements PreviewParameterProvider<OrderDetailsContract.DriverRatingState> {

    /* renamed from: a, reason: collision with root package name */
    public static final DriverRating f7801a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/preview/DriverRatingItemPreviewProvider$Companion;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/preview/DriverRatingItemPreviewProvider$TestCase;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final OrderDetailsContract.DriverRatingState d;

        static {
            TestCase testCase = new TestCase("StarRatingInitial", 0, OrderDetailsContract.DriverRatingState.StarRating.InitialNoStar.e);
            TestCase testCase2 = new TestCase("StarRatingNoStarAlert", 1, OrderDetailsContract.DriverRatingState.StarRating.NoStarAlert.e);
            StarCount starCount = StarCount.h;
            TestCase testCase3 = new TestCase("StarRatingSelectedOneStar", 2, new OrderDetailsContract.DriverRatingState.StarRating.SelectedStar(starCount));
            StarCount starCount2 = StarCount.i;
            TestCase testCase4 = new TestCase("StarRatingSelectedTwoStar", 3, new OrderDetailsContract.DriverRatingState.StarRating.SelectedStar(starCount2));
            TestCase testCase5 = new TestCase("StarRatingSelectedThreeStar", 4, new OrderDetailsContract.DriverRatingState.StarRating.SelectedStar(StarCount.j));
            StarCount starCount3 = StarCount.k;
            TestCase testCase6 = new TestCase("StarRatingSelectedFourStar", 5, new OrderDetailsContract.DriverRatingState.StarRating.SelectedStar(starCount3));
            StarCount starCount4 = StarCount.l;
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, testCase4, testCase5, testCase6, new TestCase("StarRatingSelectedFiveStar", 6, new OrderDetailsContract.DriverRatingState.StarRating.SelectedStar(starCount4)), new TestCase("FeedbackInputWithChipsUnSelected", 7, new OrderDetailsContract.DriverRatingState.FeedbackInput(EmptySet.d, "This is input feedback with chip unselected. We will show toggle chips if star is 1 or 2", starCount, false)), new TestCase("FeedbackInputWithChipsSelected", 8, new OrderDetailsContract.DriverRatingState.FeedbackInput(ArraysKt.r0(new String[]{"instructions-not-followed", "late-delivery", "order-handling"}), "This is input feedback text with chip selected", starCount2, false)), new TestCase("FeedbackInputNoChip", 9, new OrderDetailsContract.DriverRatingState.FeedbackInput(null, "This is input text for testing, no chips on UI if selected star is 3, 4 or 5", starCount3, false)), new TestCase("FeedbackInputNoChipLongText", 10, new OrderDetailsContract.DriverRatingState.FeedbackInput(null, "I recently tried delivery service for the first time, and the experience genuinely exceeded my expectations. From the moment I placed my grocery order through their sleek mobile app, I received real‑time updates that felt genuinely helpful rather than spammy. The courier, Liam, called five minutes before arrival to confirm that my apartment building’s elevator was working, which showed initiative and respect for my schedule. He arrived within the promised thirty‑minute window, greeted me by name, and maintained a professional yet friendly demeanor throughout. What impressed me most was the care taken with packaging: my fragile produce was nested in insulated, recyclable padding, and the ice cream was still rock‑solid despite a surprisingly humid Melbourne afternoon. Liam offered to carry everything directly to my kitchen bench and even waited patiently while I checked the eggs for cracks. Payment and tipping were handled seamlessly in‑app, and I received an emailed receipt seconds later. If I had to nit‑pick, the delivery fee is a tad higher than some rivals, but the reliability and courtesy easily justify the premium. I will definitely use SwiftDrop again and recommend it to friends who value worry‑free, conscientious service. They have set a new benchmark for how last‑mile logistics should operate in a city that prizes convenience.", starCount4, false)), new TestCase("ThankYouNegative", 11, OrderDetailsContract.DriverRatingState.ThankYou.d), new TestCase("ThankYouNeutral", 12, OrderDetailsContract.DriverRatingState.ThankYou.e), new TestCase("ThankYouGood", 13, OrderDetailsContract.DriverRatingState.ThankYou.f)};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, OrderDetailsContract.DriverRatingState driverRatingState) {
            this.d = driverRatingState;
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) e.clone();
        }
    }

    static {
        CoreInsetAlertModel coreInsetAlertModel = new CoreInsetAlertModel("", "Please select star rating to submit review.", CoreAlertStyle.ERROR);
        CoreButtonStyle coreButtonStyle = CoreButtonStyle.d;
        ActionType actionType = ActionType.d;
        f7801a = new DriverRating("1", new DriverRatingStarsSurvey("Driver rating", "Step 1 of 2", "How would you rate your delivery driver, Alex I.?", coreInsetAlertModel, new CoreButtonModel(coreButtonStyle, "Submit", null, null, new ActionData("", actionType, "id", null), true)), new DriverRatingFeedbackAndComments("Driver rating", "Step 1 of 2", "Let us know why? (Optional)", CollectionsKt.R(new Chip("instructions-not-followed", new ChipText("Instructions not followed", "Instructions not followed"), false), new Chip("unfriendly", new ChipText("Unfriendly", "Unfriendly"), false), new Chip("late-delivery", new ChipText("Late delivery", "Late delivery"), false), new Chip("order-handling", new ChipText("Order handling", "Order handling"), false), new Chip("other-reasons", new ChipText("Other reasons", "Other reasons"), false)), "Additional comments feedback about the driver? (Optional)", new CoreButtonModel(coreButtonStyle, "Done", null, null, new ActionData("", actionType, "id", null), true)), new DriverRatingThankYou("Driver rating", "Thank you for your feedback", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/car_partner_driver.png", "We're sorry to hear you had a negative experience. Your feedback is important as we improve the delivery experience to offer you a better service.", "Want to discuss your experience further?", new CoreButtonModel(CoreButtonStyle.f, "Message us", null, null, new ActionData("https://chatwidget-test.woolworths.com.au/templates/wowo.html?currentPage=past-orders-page", ActionType.e, "id", null), true), "Your feedback is important as we improve the delivery experience to offer you a better service.", "We're glad you had a great delivery experience. Your feedback is important as we improve the delivery experience to offer you a better service."), "141043961");
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
