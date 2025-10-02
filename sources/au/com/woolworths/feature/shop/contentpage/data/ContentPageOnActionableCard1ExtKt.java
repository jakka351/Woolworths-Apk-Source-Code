package au.com.woolworths.feature.shop.contentpage.data;

import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.dynamicsizecard.DefaultCardHeight;
import com.woolworths.feature.shop.contentpage.fragment.ContentPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentPageOnActionableCard1ExtKt {
    public static final ActionableCard a(ContentPage.OnActionableCard1 onActionableCard1) {
        Intrinsics.h(onActionableCard1, "<this>");
        String str = onActionableCard1.f19583a;
        String str2 = onActionableCard1.b;
        int iOrdinal = onActionableCard1.c.ordinal();
        DefaultCardHeight defaultCardHeight = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? DefaultCardHeight.SMALL : DefaultCardHeight.LARGE : DefaultCardHeight.MEDIUM : DefaultCardHeight.SMALL;
        String str3 = onActionableCard1.d;
        TealiumAnalytics tealiumAnalytics = onActionableCard1.f;
        ContentPage.ActionableCardImpressionAnalytics1 actionableCardImpressionAnalytics1 = onActionableCard1.g;
        AnalyticsData analyticsDataB = actionableCardImpressionAnalytics1 != null ? ContentPageMapperUtilKt.b(actionableCardImpressionAnalytics1.b) : null;
        ContentPage.ActionableCardClickAnalytics1 actionableCardClickAnalytics1 = onActionableCard1.h;
        return new ActionableCard(str, str2, defaultCardHeight, str3, tealiumAnalytics, analyticsDataB, actionableCardClickAnalytics1 != null ? ContentPageMapperUtilKt.b(actionableCardClickAnalytics1.b) : null);
    }
}
