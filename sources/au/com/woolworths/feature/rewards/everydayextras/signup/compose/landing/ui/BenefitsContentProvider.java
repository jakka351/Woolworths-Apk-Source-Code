package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraComparisonSectionItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraKeyBenefitsSectionItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraKeyBenefitsTabSections;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTab;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTermsAndConditions;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/ui/BenefitsContentProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/ui/BenefitsContentItem;", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BenefitsContentProvider implements PreviewParameterProvider<BenefitsContentItem> {

    /* renamed from: a, reason: collision with root package name */
    public static final BenefitsContentItem f6100a = new BenefitsContentItem(new EverydayExtrasTab.EverydayExtrasKeyBenefitsTab("", "Extra Benefits", CollectionsKt.R(new EverydayExtraKeyBenefitsTabSections.EverydayExtrasKeyBenefitsSection(CollectionsKt.R(new EverydayExtraKeyBenefitsSectionItem.TitleTextItem("Benefits you’ll enjoy"), new EverydayExtraKeyBenefitsSectionItem.MediumIconListItem("", "30-day free trial", "See savings straight away. Get your first 30 days free†, plus cancel your subscription any time"), new EverydayExtraKeyBenefitsSectionItem.MediumIconListItem("", "Extra Discounts", "Enjoy 10% off every month on one shop at Woolworths and one shop at BIG W in-store or online - that's up to $100 in savings every month"))), new EverydayExtraKeyBenefitsTabSections.EverydayExtrasComparisonSection(CollectionsKt.R(new EverydayExtraComparisonSectionItem.TitleTextItem("Get even more value on top of what you already enjoy with Everyday Rewards"), new EverydayExtraComparisonSectionItem.BenefitsCompare(new EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableColumnHeadings(new EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableColumnHeader(null, null), new EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableColumnHeader("", "Rewards"), new EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableColumnHeader("", "Extra")), CollectionsKt.R(new EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableRow("", true, CollectionsKt.Q(new EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableRowValue(null, "Price")), CollectionsKt.Q(new EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableRowValue(null, "Free")), CollectionsKt.Q(new EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableRowValue(null, "$7/month\n(or $70 per year)"))), new EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableRow("", false, CollectionsKt.Q(new EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableRowValue(null, "Everyday Rewards points and boosters\n$10 off a future shop or 1000 Qantas Points for every 2000 Everyday Rewards points")), CollectionsKt.Q(new EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableRowValue("edx_green_tick", null)), CollectionsKt.Q(new EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableRowValue("edx_green_tick", null))))))))), new EverydayExtrasTermsAndConditions("Terms and Conditions", "*10% off discount\nExtra Discount only applies to 1 Woolworths and 1 BIG W shop, with single transaction value up to $500 each, each month. Min spends, bag and crate fees apply for online orders. Exclusions apply - for details, see this FAQ. For full T&Cs, click here."));

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/ui/BenefitsContentProvider$Companion;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
