package au.com.woolworths.feature.shop.foryou;

import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import au.com.woolworths.feature.shop.foryou.analytics.RewardsBoostersActionData;
import au.com.woolworths.foundation.rewards.offers.model.analytics.RewardsOffersSwrveEvent;
import au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent;
import au.com.woolworths.rewards.base.RewardsDeepLink;
import au.com.woolworths.rewards.tooltip.Tooltip;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/RewardsBoostersContractLegacy;", "", "ViewState", "Page", "Actions", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsBoostersContractLegacy {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/RewardsBoostersContractLegacy$Actions;", "", "ShowTooltip", "Lau/com/woolworths/feature/shop/foryou/RewardsBoostersContractLegacy$Actions$ShowTooltip;", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/RewardsBoostersContractLegacy$Actions$ShowTooltip;", "Lau/com/woolworths/feature/shop/foryou/RewardsBoostersContractLegacy$Actions;", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowTooltip extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Tooltip.BalanceIndicator f7133a;

            public ShowTooltip(Tooltip.BalanceIndicator balanceIndicator) {
                this.f7133a = balanceIndicator;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowTooltip) && this.f7133a.equals(((ShowTooltip) obj).f7133a);
            }

            public final int hashCode() {
                return this.f7133a.d.hashCode();
            }

            public final String toString() {
                return "ShowTooltip(tooltip=" + this.f7133a + ")";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/RewardsBoostersContractLegacy$Page;", "", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Page {
        public static final Page d;
        public static final /* synthetic */ Page[] e;
        public static final /* synthetic */ EnumEntries f;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/foryou/RewardsBoostersContractLegacy.Page.POINTS", "Lau/com/woolworths/feature/shop/foryou/RewardsBoostersContractLegacy$Page;", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class POINTS extends Page {
            public final RewardsOfferScreen g;
            public final RewardsOffersSwrveEvent h;

            public POINTS() {
                super("POINTS", 0);
                new ResText(com.woolworths.R.string.rewards_boosters_tab_points);
                RewardsDeepLink.BoostersTabs[] boostersTabsArr = RewardsDeepLink.BoostersTabs.d;
                this.g = RewardsOfferScreen.f;
                this.h = RewardsOffersSwrveEvent.d;
                RewardsBoostersActionData[] rewardsBoostersActionDataArr = RewardsBoostersActionData.e;
            }

            @Override // au.com.woolworths.feature.shop.foryou.RewardsBoostersContractLegacy.Page
            public final Screen a() {
                return this.g;
            }

            @Override // au.com.woolworths.feature.shop.foryou.RewardsBoostersContractLegacy.Page
            public final SwrveEvent b() {
                return this.h;
            }
        }

        static {
            POINTS points = new POINTS();
            d = points;
            Page[] pageArr = {points};
            e = pageArr;
            f = EnumEntriesKt.a(pageArr);
        }

        public static Page valueOf(String str) {
            return (Page) Enum.valueOf(Page.class, str);
        }

        public static Page[] values() {
            return (Page[]) e.clone();
        }

        public abstract Screen a();

        public abstract SwrveEvent b();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/RewardsBoostersContractLegacy$ViewState;", "", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsPointsBalance f7134a;
        public final boolean b;
        public final InlineMessage c;

        public ViewState(RewardsPointsBalance rewardsPointsBalance, boolean z, InlineMessage inlineMessage) {
            this.f7134a = rewardsPointsBalance;
            this.b = z;
            this.c = inlineMessage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f7134a, viewState.f7134a) && this.b == viewState.b && Intrinsics.c(this.c, viewState.c);
        }

        public final int hashCode() {
            RewardsPointsBalance rewardsPointsBalance = this.f7134a;
            int iE = b.e((rewardsPointsBalance == null ? 0 : rewardsPointsBalance.hashCode()) * 31, 31, this.b);
            InlineMessage inlineMessage = this.c;
            return iE + (inlineMessage != null ? inlineMessage.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(rewardsPointsBalance=" + this.f7134a + ", isRewardsPlus=" + this.b + ", message=" + this.c + ")";
        }
    }
}
