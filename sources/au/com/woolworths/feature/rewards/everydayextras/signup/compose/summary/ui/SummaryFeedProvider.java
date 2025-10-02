package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonActionType;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonStyle;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasDividerType;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryContent;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryFeed;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryFooter;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryFooterItem;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/ui/SummaryFeedProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryFeed;", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SummaryFeedProvider implements PreviewParameterProvider<EverydayExtrasSummaryFeed> {

    /* renamed from: a, reason: collision with root package name */
    public static final EverydayExtrasSummaryFeed f6141a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/ui/SummaryFeedProvider$Companion;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        EverydayExtrasSummaryContentItem.TitleTextItem titleTextItem = new EverydayExtrasSummaryContentItem.TitleTextItem("Enter your payment details");
        EverydayExtrasSummaryContentItem.ParagraphTextItem paragraphTextItem = new EverydayExtrasSummaryContentItem.ParagraphTextItem("Your card will be only charged **after your 30-day free trial**.");
        EverydayExtrasSummaryContentItem.WpayPayment wpayPayment = new EverydayExtrasSummaryContentItem.WpayPayment("credit_card", "Credit or Debit Card", "Encrypted Payment", "closed_lock", new EverydayExtrasSummaryContentItem.WpayPayment.Error(new EverydayExtrasSummaryContentItem.WpayPayment.CardError("**Please correct the following errors:**", CollectionsKt.R(new EverydayExtrasSummaryContentItem.WpayPayment.ErrorItem("Card No. Required", "**Card number:** This field is required", "cardNumberError"), new EverydayExtrasSummaryContentItem.WpayPayment.ErrorItem("Invalid Card No.", "**Card number:** Enter a valid card number", "cardNumberError"))), new EverydayExtrasSummaryContentItem.WpayPayment.ExternalSystemError("**Oops! Something went wrong.**", "Please contact your bank")), "We accept", CollectionsKt.R(new EverydayExtrasSummaryContentItem.WpayPayment.CardProviderIcon("", "Visa"), new EverydayExtrasSummaryContentItem.WpayPayment.CardProviderIcon("", "MasterCard")));
        EverydayExtrasSummaryContentItem.TitleTextItem titleTextItem2 = new EverydayExtrasSummaryContentItem.TitleTextItem("Summary");
        EverydayExtrasButtonActionType everydayExtrasButtonActionType = EverydayExtrasButtonActionType.d;
        EverydayExtrasSummaryContentItem.SelectedPlan selectedPlan = new EverydayExtrasSummaryContentItem.SelectedPlan("Annual payment", AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, new EverydayExtrasSummaryContentItem.SelectedPlan.Button("Change my plan", everydayExtrasButtonActionType, "", EverydayExtrasButtonStyle.e));
        EverydayExtrasSummaryContentItem.SmallIconListItem smallIconListItem = new EverydayExtrasSummaryContentItem.SmallIconListItem("", "You’re saving 50% on an annual plan for your first year (normally $70/year)");
        EverydayExtrasDividerType everydayExtrasDividerType = EverydayExtrasDividerType.d;
        List listR = CollectionsKt.R(titleTextItem, paragraphTextItem, wpayPayment, titleTextItem2, selectedPlan, smallIconListItem, new EverydayExtrasSummaryContentItem.Divider(), new EverydayExtrasSummaryContentItem.SubheadTextItem("30 day free trial"), new EverydayExtrasSummaryContentItem.ParagraphTextItem("We will let you know when your trial is about to expire"), new EverydayExtrasSummaryContentItem.Divider(), new EverydayExtrasSummaryContentItem.SubheadTextItem("First billing date"), new EverydayExtrasSummaryContentItem.ParagraphTextItem("8 November 2023"), new EverydayExtrasSummaryContentItem.Divider(), new EverydayExtrasSummaryContentItem.CheckableTextItem("I agree to the [Everyday Extra Terms & Conditions](https://www.everyday.com.au/extra/terms.html)\n\nView our [Privacy Policy](https://www.woolworthsgroup.com.au/privacy-policy) and [Collection Notice](https://www.everyday.com.au/extra/collection.html) to understand how we manage your personal information.", "You need to agree to the Terms & Conditions.", true));
        f6141a = new EverydayExtrasSummaryFeed("Summary", new EverydayExtrasSummaryContent("", listR), new EverydayExtrasSummaryFooter("", CollectionsKt.Q(new EverydayExtrasSummaryFooterItem.Button("Subscribe to Everyday Extra", everydayExtrasButtonActionType, "", EverydayExtrasButtonStyle.d))));
        List<EverydayExtrasSummaryContentItem> list = listR;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (EverydayExtrasSummaryContentItem selectedPlan2 : list) {
            if (selectedPlan2 instanceof EverydayExtrasSummaryContentItem.SelectedPlan) {
                EverydayExtrasSummaryContentItem.SelectedPlan selectedPlan3 = (EverydayExtrasSummaryContentItem.SelectedPlan) selectedPlan2;
                selectedPlan2 = new EverydayExtrasSummaryContentItem.SelectedPlan(selectedPlan3.d, 3050, selectedPlan3.f);
            }
            arrayList.add(selectedPlan2);
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
