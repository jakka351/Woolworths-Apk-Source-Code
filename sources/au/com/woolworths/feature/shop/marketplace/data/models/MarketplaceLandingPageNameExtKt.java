package au.com.woolworths.feature.shop.marketplace.data.models;

import au.com.woolworths.shop.graphql.type.MarketplaceLandingPageName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"marketplace_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MarketplaceLandingPageNameExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[au.com.woolworths.shop.graphql.type.MarketplaceLandingPageName.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MarketplaceLandingPageName.Companion companion = au.com.woolworths.shop.graphql.type.MarketplaceLandingPageName.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MarketplaceLandingPageName.Companion companion2 = au.com.woolworths.shop.graphql.type.MarketplaceLandingPageName.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MarketplaceLandingPageName.Companion companion3 = au.com.woolworths.shop.graphql.type.MarketplaceLandingPageName.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MarketplaceLandingPageName.Companion companion4 = au.com.woolworths.shop.graphql.type.MarketplaceLandingPageName.e;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final MarketplaceLandingPageName a(au.com.woolworths.shop.graphql.type.MarketplaceLandingPageName marketplaceLandingPageName) {
        int iOrdinal = marketplaceLandingPageName.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? MarketplaceLandingPageName.d : MarketplaceLandingPageName.SELLERS : MarketplaceLandingPageName.BRANDS : MarketplaceLandingPageName.CATEGORIES : MarketplaceLandingPageName.PERSONALISED : MarketplaceLandingPageName.DEFAULT;
    }
}
