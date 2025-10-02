package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraFaqsSectionItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraFaqsTabSections;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTab;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTermsAndConditions;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasDividerType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/ui/FaqsContentProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/ui/FaqsContentItem;", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FaqsContentProvider implements PreviewParameterProvider<FaqsContentItem> {

    /* renamed from: a, reason: collision with root package name */
    public static final FaqsContentItem f6107a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/ui/FaqsContentProvider$Companion;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        EverydayExtraFaqsSectionItem.TitleTextItem titleTextItem = new EverydayExtraFaqsSectionItem.TitleTextItem("Frequently Asked Questions");
        EverydayExtraFaqsSectionItem.SubheadTextItem subheadTextItem = new EverydayExtraFaqsSectionItem.SubheadTextItem("Joining");
        EverydayExtraFaqsSectionItem.FaqsFaqUiItem faqsFaqUiItem = new EverydayExtraFaqsSectionItem.FaqsFaqUiItem(new EverydayExtraFaqsSectionItem.FaqsFaqUiItem.Item("", "What is Everyday Extra?", "Everyday Extra from Everyday Rewards is a subscription service designed to save you extra on your everyday shopping. Your Everyday Extra subscription is linked to your Everyday Rewards membership, and gives you access to a whole new level of extra benefits to help you get extra value from your everyday shopping."), false);
        EverydayExtrasDividerType everydayExtrasDividerType = EverydayExtrasDividerType.d;
        f6107a = new FaqsContentItem(new EverydayExtrasTab.EverydayExtrasFaqsTab("", "Faqs", CollectionsKt.Q(new EverydayExtraFaqsTabSections.EverydayExtrasFaqsSection(CollectionsKt.R(titleTextItem, subheadTextItem, faqsFaqUiItem, new EverydayExtraFaqsSectionItem.Divider(), new EverydayExtraFaqsSectionItem.FaqsFaqUiItem(new EverydayExtraFaqsSectionItem.FaqsFaqUiItem.Item("", "Do I need to be an Everyday Rewards member to join Everyday Extra?", "Yes, Everyday Extra is only available to registered Everyday Rewards members. You must also remain an Everyday Rewards member if you wish to continue enjoying the benefits of Everyday Extra. If you cancel your Everyday Rewards membership your Everyday Extra subscription will also be cancelled."), true), new EverydayExtraFaqsSectionItem.Divider(), new EverydayExtraFaqsSectionItem.SubheadTextItem("Extra Discounts"), new EverydayExtraFaqsSectionItem.FaqsFaqUiItem(new EverydayExtraFaqsSectionItem.FaqsFaqUiItem.Item("", "What is my Extra Discount, and how do I use it?", "You'll receive your 10% discount each month, which you can choose to use on both one shop at Woolworths and one shop at BIG W, in-store or online, every month."), false), new EverydayExtraFaqsSectionItem.Divider(), new EverydayExtraFaqsSectionItem.NoteTextItem("Need more help? [Contact us](https://www.everyday.com.au/contact.html)"))))), new EverydayExtrasTermsAndConditions("Terms and Conditions", "*10% off discount\nExtra Discount only applies to 1 Woolworths and 1 BIG W shop, with single transaction value up to $500 each, each month. Min spends, bag and crate fees apply for online orders. Exclusions apply - for details, see this FAQ. For full T&Cs, click here."));
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
