package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.data.RewardsErrorDialog;
import au.com.woolworths.feature.rewards.offers.data.RewardsHomeOfferFeed;
import au.com.woolworths.feature.rewards.offers.data.RewardsOffersHeader;
import au.com.woolworths.feature.rewards.offers.data.RewardsSummaryCta;
import au.com.woolworths.feature.rewards.offers.data.RewardsSummaryText;
import com.woolworths.rewards.offers.fragment.RewardsHomeOfferFeedFields;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsHomeOfferFeedFieldsExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [au.com.woolworths.feature.rewards.offers.data.RewardsSummaryCta] */
    public static final RewardsHomeOfferFeed a(RewardsHomeOfferFeedFields rewardsHomeOfferFeedFields) {
        RewardsOffersHeader rewardsOffersHeader;
        RewardsErrorDialog rewardsErrorDialog;
        ContentCta contentCta;
        RewardsSummaryText rewardsSummaryCta;
        RewardsHomeOfferFeedFields.Header header = rewardsHomeOfferFeedFields.f20894a;
        ContentCta contentCta2 = null;
        if (header != null) {
            String str = header.f20896a;
            RewardsHomeOfferFeedFields.Summary summary = header.b;
            if (summary != null) {
                RewardsHomeOfferFeedFields.OnRewardsSummaryText onRewardsSummaryText = summary.b;
                if (onRewardsSummaryText != null) {
                    rewardsSummaryCta = new RewardsSummaryText(onRewardsSummaryText.f20897a);
                } else {
                    ContentCtaFields contentCtaFields = summary.c;
                    if (contentCtaFields == null) {
                        throw new IllegalStateException("Type not implemented");
                    }
                    rewardsSummaryCta = new RewardsSummaryCta(ContentCtaFieldsExtKt.a(contentCtaFields));
                }
            } else {
                rewardsSummaryCta = null;
            }
            rewardsOffersHeader = new RewardsOffersHeader(str, rewardsSummaryCta);
        } else {
            rewardsOffersHeader = null;
        }
        RewardsHomeOfferFeedFields.ErrorMessage errorMessage = rewardsHomeOfferFeedFields.b;
        if (errorMessage != null) {
            String str2 = errorMessage.f20895a;
            String str3 = errorMessage.b;
            RewardsHomeOfferFeedFields.PrimaryCta primaryCta = errorMessage.c;
            if (primaryCta != null) {
                ContentCtaFields contentCtaFields2 = primaryCta.b;
                String str4 = contentCtaFields2.f20974a;
                String str5 = contentCtaFields2.b;
                Boolean bool = contentCtaFields2.c;
                ContentCtaFields.OnCtaClickAnalytics onCtaClickAnalytics = contentCtaFields2.d;
                contentCta = new ContentCta(str4, str5, (String) null, bool, onCtaClickAnalytics != null ? ContentCtaFieldsOnCtaClickAnalyticsExtKt.a(onCtaClickAnalytics) : null, 4, (DefaultConstructorMarker) null);
            } else {
                contentCta = null;
            }
            RewardsHomeOfferFeedFields.SecondaryCta secondaryCta = errorMessage.d;
            if (secondaryCta != null) {
                ContentCtaFields contentCtaFields3 = secondaryCta.b;
                String str6 = contentCtaFields3.f20974a;
                String str7 = contentCtaFields3.b;
                Boolean bool2 = contentCtaFields3.c;
                ContentCtaFields.OnCtaClickAnalytics onCtaClickAnalytics2 = contentCtaFields3.d;
                contentCta2 = new ContentCta(str6, str7, (String) null, bool2, onCtaClickAnalytics2 != null ? ContentCtaFieldsOnCtaClickAnalyticsExtKt.a(onCtaClickAnalytics2) : null, 4, (DefaultConstructorMarker) null);
            }
            rewardsErrorDialog = new RewardsErrorDialog(str2, str3, contentCta, contentCta2);
        } else {
            rewardsErrorDialog = null;
        }
        ArrayList<RewardsHomeOfferFeedFields.Section> arrayList = rewardsHomeOfferFeedFields.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        for (RewardsHomeOfferFeedFields.Section section : arrayList) {
            Intrinsics.h(section, "<this>");
            arrayList2.add(RewardsOfferRepositoryKt.d(section.b));
        }
        return new RewardsHomeOfferFeed(rewardsOffersHeader, rewardsErrorDialog, null, arrayList2, rewardsHomeOfferFeedFields.d, rewardsHomeOfferFeedFields.e, rewardsHomeOfferFeedFields.f);
    }
}
