package au.com.woolworths.feature.rewards.offers.points;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract;
import au.com.woolworths.feature.rewards.offers.data.RewardsErrorDialog;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData;
import au.com.woolworths.feature.rewards.offers.data.RewardsOffersHeader;
import au.com.woolworths.feature.rewards.offers.data.RewardsOffersMessage;
import au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState;
import au.com.woolworths.foundation.rewards.offers.model.OfferActivationMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract;", "", "Actions", "ViewState", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsPointsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions;", "Lau/com/woolworths/feature/rewards/offers/RewardsOfferBaseContract$Actions;", "CloseScreen", "ShowOfferDetailsScreen", "ShowOfferActivationError", "ShowOfferListRefreshFailedError", "ShowOfferActivationMessage", "PerformHapticFeedbackForActivationSuccess", "PerformHapticFeedbackForActivationFailure", "Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions$CloseScreen;", "Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions$PerformHapticFeedbackForActivationFailure;", "Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions$PerformHapticFeedbackForActivationSuccess;", "Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions$ShowOfferActivationError;", "Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions$ShowOfferActivationMessage;", "Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions$ShowOfferDetailsScreen;", "Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions$ShowOfferListRefreshFailedError;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions extends RewardsOfferBaseContract.Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions$CloseScreen;", "Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CloseScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final CloseScreen f6367a = new CloseScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CloseScreen);
            }

            public final int hashCode() {
                return -1370479045;
            }

            public final String toString() {
                return "CloseScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions$PerformHapticFeedbackForActivationFailure;", "Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformHapticFeedbackForActivationFailure extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformHapticFeedbackForActivationFailure f6368a = new PerformHapticFeedbackForActivationFailure();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PerformHapticFeedbackForActivationFailure);
            }

            public final int hashCode() {
                return 676266463;
            }

            public final String toString() {
                return "PerformHapticFeedbackForActivationFailure";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions$PerformHapticFeedbackForActivationSuccess;", "Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformHapticFeedbackForActivationSuccess extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformHapticFeedbackForActivationSuccess f6369a = new PerformHapticFeedbackForActivationSuccess();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PerformHapticFeedbackForActivationSuccess);
            }

            public final int hashCode() {
                return -104329128;
            }

            public final String toString() {
                return "PerformHapticFeedbackForActivationSuccess";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions$ShowOfferActivationError;", "Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowOfferActivationError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f6370a;

            public ShowOfferActivationError(Text text) {
                this.f6370a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOfferActivationError) && Intrinsics.c(this.f6370a, ((ShowOfferActivationError) obj).f6370a);
            }

            public final int hashCode() {
                return this.f6370a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("ShowOfferActivationError(message=", this.f6370a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions$ShowOfferActivationMessage;", "Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowOfferActivationMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final OfferActivationMessage f6371a;

            public ShowOfferActivationMessage(OfferActivationMessage message) {
                Intrinsics.h(message, "message");
                this.f6371a = message;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOfferActivationMessage) && Intrinsics.c(this.f6371a, ((ShowOfferActivationMessage) obj).f6371a);
            }

            public final int hashCode() {
                return this.f6371a.hashCode();
            }

            public final String toString() {
                return "ShowOfferActivationMessage(message=" + this.f6371a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions$ShowOfferDetailsScreen;", "Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowOfferDetailsScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6372a;

            public ShowOfferDetailsScreen(String offerId) {
                Intrinsics.h(offerId, "offerId");
                this.f6372a = offerId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOfferDetailsScreen) && Intrinsics.c(this.f6372a, ((ShowOfferDetailsScreen) obj).f6372a);
            }

            public final int hashCode() {
                return this.f6372a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ShowOfferDetailsScreen(offerId=", this.f6372a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions$ShowOfferListRefreshFailedError;", "Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowOfferListRefreshFailedError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final int f6373a;

            public ShowOfferListRefreshFailedError(int i) {
                this.f6373a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOfferListRefreshFailedError) && this.f6373a == ((ShowOfferListRefreshFailedError) obj).f6373a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f6373a);
            }

            public final String toString() {
                return YU.a.e(this.f6373a, "ShowOfferListRefreshFailedError(message=", ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsContract$ViewState;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6374a;
        public final boolean b;
        public final RewardsOfferListFullPageErrorState c;
        public final RewardsErrorDialog d;
        public final List e;
        public final RewardsOffersMessage f;
        public final RewardsOffersHeader g;
        public final Set h;
        public final RewardsOfferFilterData i;
        public final boolean j;
        public final Region k;
        public final List l;
        public final ArrayList m;
        public final boolean n;
        public final Object o;
        public final Object p;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v13, types: [au.com.woolworths.feature.rewards.offers.OfferSectionViewItem] */
        /* JADX WARN: Type inference failed for: r4v8, types: [au.com.woolworths.feature.rewards.offers.SectionViewItem] */
        /* JADX WARN: Type inference failed for: r4v9, types: [au.com.woolworths.feature.rewards.offers.PersonalisedOffersBannerViewItem] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public ViewState(boolean r1, boolean r2, au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState r3, au.com.woolworths.feature.rewards.offers.data.RewardsErrorDialog r4, java.util.List r5, au.com.woolworths.feature.rewards.offers.data.RewardsOffersMessage r6, au.com.woolworths.feature.rewards.offers.data.RewardsOffersHeader r7, java.util.Set r8, au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData r9, boolean r10, au.com.woolworths.android.onesite.modules.common.Region r11, java.util.List r12) {
            /*
                r0 = this;
                r0.<init>()
                r0.f6374a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.f = r6
                r0.g = r7
                r0.h = r8
                r0.i = r9
                r0.j = r10
                r0.k = r11
                r0.l = r12
                r1 = 0
                if (r5 == 0) goto L98
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r3 = r5.iterator()
            L29:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L99
                java.lang.Object r4 = r3.next()
                au.com.woolworths.feature.rewards.offers.SectionViewItem r4 = (au.com.woolworths.feature.rewards.offers.SectionViewItem) r4
                boolean r5 = r4 instanceof au.com.woolworths.feature.rewards.offers.OfferSectionViewItem
                if (r5 == 0) goto L46
                au.com.woolworths.feature.rewards.offers.OfferSectionViewItem r4 = (au.com.woolworths.feature.rewards.offers.OfferSectionViewItem) r4
                au.com.woolworths.feature.rewards.offers.points.a r5 = new au.com.woolworths.feature.rewards.offers.points.a
                r6 = 0
                r5.<init>(r0, r6)
                au.com.woolworths.feature.rewards.offers.OfferSectionViewItem r4 = au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt.g(r4, r5)
                goto L92
            L46:
                boolean r5 = r4 instanceof au.com.woolworths.feature.rewards.offers.PersonalisedOffersBannerViewItem
                if (r5 == 0) goto L92
                au.com.woolworths.feature.rewards.offers.PersonalisedOffersBannerViewItem r4 = (au.com.woolworths.feature.rewards.offers.PersonalisedOffersBannerViewItem) r4
                au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData r5 = r0.i
                if (r5 == 0) goto L91
                java.lang.Object r5 = r5.f
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r5 = r5.iterator()
            L5d:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L6f
                java.lang.Object r7 = r5.next()
                boolean r8 = r7 instanceof au.com.woolworths.feature.rewards.offers.data.BannerSectionConfig
                if (r8 == 0) goto L5d
                r6.add(r7)
                goto L5d
            L6f:
                boolean r5 = r6.isEmpty()
                if (r5 == 0) goto L76
                goto L91
            L76:
                java.util.Iterator r5 = r6.iterator()
            L7a:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L91
                java.lang.Object r6 = r5.next()
                au.com.woolworths.feature.rewards.offers.data.BannerSectionConfig r6 = (au.com.woolworths.feature.rewards.offers.data.BannerSectionConfig) r6
                java.lang.String r6 = r6.f6269a
                java.lang.String r7 = r4.b
                boolean r6 = r6.equals(r7)
                if (r6 == 0) goto L7a
                goto L92
            L91:
                r4 = r1
            L92:
                if (r4 == 0) goto L29
                r2.add(r4)
                goto L29
            L98:
                r2 = r1
            L99:
                r0.m = r2
                r3 = 0
                if (r2 == 0) goto Lba
                boolean r4 = r2.isEmpty()
                if (r4 == 0) goto La5
                goto Lba
            La5:
                java.util.Iterator r2 = r2.iterator()
            La9:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto Lba
                java.lang.Object r4 = r2.next()
                au.com.woolworths.feature.rewards.offers.SectionViewItem r4 = (au.com.woolworths.feature.rewards.offers.SectionViewItem) r4
                boolean r4 = r4 instanceof au.com.woolworths.feature.rewards.offers.PersonalisedOffersBannerViewItem
                if (r4 == 0) goto La9
                r3 = 1
            Lba:
                r0.n = r3
                java.util.ArrayList r2 = r0.m
                if (r2 == 0) goto Lc9
                java.util.ArrayList r2 = au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt.b(r2)
                java.util.List r2 = au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt.d(r2)
                goto Lca
            Lc9:
                r2 = r1
            Lca:
                r0.o = r2
                java.util.List r2 = r0.e
                if (r2 == 0) goto Ld8
                java.util.ArrayList r1 = au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt.b(r2)
                java.util.List r1 = au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt.d(r1)
            Ld8:
                r0.p = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract.ViewState.<init>(boolean, boolean, au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState, au.com.woolworths.feature.rewards.offers.data.RewardsErrorDialog, java.util.List, au.com.woolworths.feature.rewards.offers.data.RewardsOffersMessage, au.com.woolworths.feature.rewards.offers.data.RewardsOffersHeader, java.util.Set, au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData, boolean, au.com.woolworths.android.onesite.modules.common.Region, java.util.List):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13, types: [java.util.List] */
        public static ViewState a(ViewState viewState, boolean z, ArrayList arrayList, RewardsOfferFilterData rewardsOfferFilterData, boolean z2, Region region, List list, int i) {
            boolean z3 = (i & 1) != 0 ? viewState.f6374a : z;
            boolean z4 = (i & 2) != 0 ? viewState.b : true;
            RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState = (i & 4) != 0 ? viewState.c : null;
            RewardsErrorDialog rewardsErrorDialog = (i & 8) != 0 ? viewState.d : null;
            ArrayList arrayList2 = (i & 16) != 0 ? viewState.e : arrayList;
            RewardsOffersMessage rewardsOffersMessage = viewState.f;
            RewardsOffersHeader rewardsOffersHeader = viewState.g;
            Set set = viewState.h;
            RewardsOfferFilterData rewardsOfferFilterData2 = (i & 256) != 0 ? viewState.i : rewardsOfferFilterData;
            boolean z5 = (i & 512) != 0 ? viewState.j : z2;
            Region supportedRegion = (i & 1024) != 0 ? viewState.k : region;
            List dismissedBannerIds = (i & 2048) != 0 ? viewState.l : list;
            viewState.getClass();
            Intrinsics.h(supportedRegion, "supportedRegion");
            Intrinsics.h(dismissedBannerIds, "dismissedBannerIds");
            return new ViewState(z3, z4, rewardsOfferListFullPageErrorState, rewardsErrorDialog, arrayList2, rewardsOffersMessage, rewardsOffersHeader, set, rewardsOfferFilterData2, z5, supportedRegion, dismissedBannerIds);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6374a == viewState.f6374a && this.b == viewState.b && this.c == viewState.c && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f) && Intrinsics.c(this.g, viewState.g) && Intrinsics.c(this.h, viewState.h) && Intrinsics.c(this.i, viewState.i) && this.j == viewState.j && this.k == viewState.k && Intrinsics.c(this.l, viewState.l);
        }

        public final int hashCode() {
            int iE = androidx.camera.core.impl.b.e(Boolean.hashCode(this.f6374a) * 31, 31, this.b);
            RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState = this.c;
            int iHashCode = (iE + (rewardsOfferListFullPageErrorState == null ? 0 : rewardsOfferListFullPageErrorState.hashCode())) * 31;
            RewardsErrorDialog rewardsErrorDialog = this.d;
            int iHashCode2 = (iHashCode + (rewardsErrorDialog == null ? 0 : rewardsErrorDialog.hashCode())) * 31;
            List list = this.e;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            RewardsOffersMessage rewardsOffersMessage = this.f;
            int iHashCode4 = (iHashCode3 + (rewardsOffersMessage == null ? 0 : rewardsOffersMessage.hashCode())) * 31;
            RewardsOffersHeader rewardsOffersHeader = this.g;
            int iHashCode5 = (iHashCode4 + (rewardsOffersHeader == null ? 0 : rewardsOffersHeader.hashCode())) * 31;
            Set set = this.h;
            int iHashCode6 = (iHashCode5 + (set == null ? 0 : set.hashCode())) * 31;
            RewardsOfferFilterData rewardsOfferFilterData = this.i;
            return this.l.hashCode() + ((this.k.hashCode() + androidx.camera.core.impl.b.e((iHashCode6 + (rewardsOfferFilterData != null ? rewardsOfferFilterData.hashCode() : 0)) * 31, 31, this.j)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = androidx.camera.core.impl.b.v("ViewState(isLoading=", ", isRefreshing=", ", errorState=", this.f6374a, this.b);
            sbV.append(this.c);
            sbV.append(", errorDialog=");
            sbV.append(this.d);
            sbV.append(", sections=");
            sbV.append(this.e);
            sbV.append(", offersMessage=");
            sbV.append(this.f);
            sbV.append(", header=");
            sbV.append(this.g);
            sbV.append(", filters=");
            sbV.append(this.h);
            sbV.append(", selectedFilter=");
            sbV.append(this.i);
            sbV.append(", showKonfettiView=");
            sbV.append(this.j);
            sbV.append(", supportedRegion=");
            sbV.append(this.k);
            sbV.append(", dismissedBannerIds=");
            sbV.append(this.l);
            sbV.append(")");
            return sbV.toString();
        }

        public /* synthetic */ ViewState(RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState, RewardsErrorDialog rewardsErrorDialog, ArrayList arrayList, RewardsOffersMessage rewardsOffersMessage, RewardsOffersHeader rewardsOffersHeader, Set set, RewardsOfferFilterData rewardsOfferFilterData, Region region, int i) {
            this((i & 1) == 0, false, (i & 4) != 0 ? null : rewardsOfferListFullPageErrorState, (i & 8) != 0 ? null : rewardsErrorDialog, (i & 16) != 0 ? null : arrayList, (i & 32) != 0 ? null : rewardsOffersMessage, (i & 64) != 0 ? null : rewardsOffersHeader, (i & 128) != 0 ? null : set, (i & 256) != 0 ? null : rewardsOfferFilterData, false, region, EmptyList.d);
        }
    }
}
