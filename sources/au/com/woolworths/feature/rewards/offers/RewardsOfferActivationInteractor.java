package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.offers.OfferActivationScreen;
import au.com.woolworths.feature.rewards.offers.data.OfferSectionExtKt;
import au.com.woolworths.feature.rewards.offers.data.OffersSections;
import au.com.woolworths.feature.rewards.offers.data.ProductOffersSection;
import au.com.woolworths.feature.rewards.offers.data.StandardOffersSection;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import au.com.woolworths.rewards.base.optimizedrefresh.RefreshNotifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.internal.ContextScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOfferActivationInteractor;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsOfferActivationInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsOfferRepository f6236a;
    public final BranchInteractor b;
    public final RefreshNotifier c;

    public RewardsOfferActivationInteractor(RewardsOfferRepository rewardsOfferRepository, BranchInteractor branchInteractor, RefreshNotifier refreshNotifier) {
        Intrinsics.h(rewardsOfferRepository, "rewardsOfferRepository");
        Intrinsics.h(refreshNotifier, "refreshNotifier");
        this.f6236a = rewardsOfferRepository;
        this.b = branchInteractor;
        this.c = refreshNotifier;
    }

    public final void a(RewardsOfferData offer, OfferActivationScreen offerActivationScreen) {
        Object value;
        Intrinsics.h(offer, "offer");
        RewardsOfferRepository rewardsOfferRepository = this.f6236a;
        rewardsOfferRepository.getClass();
        String str = offer.d;
        boolean zEquals = offerActivationScreen.equals(OfferActivationScreen.Details.f6227a);
        MutableStateFlow mutableStateFlow = rewardsOfferRepository.h;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, SetsKt.h((Set) value, str)));
        BuildersKt.c(rewardsOfferRepository.g, null, null, new RewardsOfferRepository$activateOfferInFeed$2(rewardsOfferRepository, offer, offerActivationScreen, str, zEquals, null), 3);
        BranchInteractor branchInteractor = this.b;
        if (branchInteractor.c.c(RewardsBaseFeature.e)) {
            branchInteractor.b.a("boost", CollectionsKt.Q(offer));
        } else {
            branchInteractor.f6223a.a("Boost", CollectionsKt.Q(offer));
        }
    }

    public final void b(OffersSections offersSections) {
        Object value;
        RewardsOfferRepository rewardsOfferRepository = this.f6236a;
        rewardsOfferRepository.getClass();
        String strC = OfferSectionExtKt.c(offersSections);
        rewardsOfferRepository.i.add(strC);
        List listA = OfferSectionExtKt.a(offersSections);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((RewardsOfferData) it.next()).d);
        }
        MutableStateFlow mutableStateFlow = rewardsOfferRepository.h;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, SetsKt.g((Set) value, arrayList)));
        ContextScope contextScope = rewardsOfferRepository.g;
        RewardsOfferRepository$activateSectionInFeed$2 rewardsOfferRepository$activateSectionInFeed$2 = new RewardsOfferRepository$activateSectionInFeed$2(rewardsOfferRepository, offersSections, strC, arrayList, null);
        ArrayList arrayList2 = null;
        BuildersKt.c(contextScope, null, null, rewardsOfferRepository$activateSectionInFeed$2, 3);
        BranchInteractor branchInteractor = this.b;
        if (branchInteractor.c.c(RewardsBaseFeature.e)) {
            if (offersSections instanceof StandardOffersSection) {
                arrayList2 = ((StandardOffersSection) offersSections).c;
            } else if (offersSections instanceof ProductOffersSection) {
                arrayList2 = ((ProductOffersSection) offersSections).f;
            }
            if (arrayList2 != null) {
                branchInteractor.b.a("boost all", arrayList2);
                return;
            }
            return;
        }
        BranchRepository branchRepository = branchInteractor.f6223a;
        if (offersSections instanceof StandardOffersSection) {
            arrayList2 = ((StandardOffersSection) offersSections).c;
        } else if (offersSections instanceof ProductOffersSection) {
            arrayList2 = ((ProductOffersSection) offersSections).f;
        }
        if (arrayList2 != null) {
            branchRepository.a("Boost all", arrayList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final kotlin.jvm.functions.Function1 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor$onBoostOfferResult$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor$onBoostOfferResult$1 r0 = (au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor$onBoostOfferResult$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor$onBoostOfferResult$1 r0 = new au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor$onBoostOfferResult$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r0.r
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.KotlinNothingValueException r5 = android.support.v4.media.session.a.v(r6)
            throw r5
        L30:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.feature.rewards.offers.RewardsOfferRepository r6 = r4.f6236a
            kotlinx.coroutines.flow.SharedFlowImpl r6 = r6.k
            au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor$onBoostOfferResult$2 r1 = new au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor$onBoostOfferResult$2
            r1.<init>()
            r0.r = r2
            r6.getClass()
            kotlinx.coroutines.flow.SharedFlowImpl.m(r6, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor.c(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(final kotlin.jvm.functions.Function1 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor$onOfferActivationResult$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor$onOfferActivationResult$1 r0 = (au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor$onOfferActivationResult$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor$onOfferActivationResult$1 r0 = new au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor$onOfferActivationResult$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r0.r
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.KotlinNothingValueException r5 = android.support.v4.media.session.a.v(r6)
            throw r5
        L30:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.feature.rewards.offers.RewardsOfferRepository r6 = r4.f6236a
            kotlinx.coroutines.flow.SharedFlowImpl r6 = r6.k
            au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor$onOfferActivationResult$2 r1 = new au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor$onOfferActivationResult$2
            r1.<init>()
            r0.r = r2
            r6.getClass()
            kotlinx.coroutines.flow.SharedFlowImpl.m(r6, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor.d(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }
}
