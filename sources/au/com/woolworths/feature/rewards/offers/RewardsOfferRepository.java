package au.com.woolworths.feature.rewards.offers;

import androidx.collection.ArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractorKt;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.feature.rewards.offers.data.ActivationDetails;
import au.com.woolworths.feature.rewards.offers.data.ActivationDetailsError;
import au.com.woolworths.feature.rewards.offers.data.ActivationResult;
import au.com.woolworths.feature.rewards.offers.data.OfferSectionExtKt;
import au.com.woolworths.feature.rewards.offers.data.OffersSections;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferActivation;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFeed;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import au.com.woolworths.foundation.rewards.offers.event.routing.RewardsOffersEventRouter;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import au.com.woolworths.rewards.base.ShopAppInstallationInteractor;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.woolworths.rewards.offers.ActivateOfferInFeedMutation;
import com.woolworths.rewards.offers.ActivateSectionInFeedMutation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOfferRepository;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsOfferRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f6241a;
    public final DispatcherProvider b;
    public final FeatureToggleManager c;
    public final ShopAppInstallationInteractor d;
    public final RewardsOffersEventRouter e;
    public final RewardsAccountInteractor f;
    public final ContextScope g;
    public final MutableStateFlow h;
    public final ArraySet i;
    public final SharedFlowImpl j;
    public final SharedFlowImpl k;
    public final boolean l;
    public final boolean m;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6242a;

        static {
            int[] iArr = new int[Region.values().length];
            try {
                Region.Companion companion = Region.h;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Region.Companion companion2 = Region.h;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6242a = iArr;
        }
    }

    public RewardsOfferRepository(ApolloClient apolloClient, DispatcherProvider dispatcherProvider, FeatureToggleManager featureToggleManager, ShopAppInstallationInteractor shopAppInstallationInteractor, RewardsOffersEventRouter offersEventRouter, AppIdentifier appIdentifier, RewardsAccountInteractor rewardsAccountInteractor) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(offersEventRouter, "offersEventRouter");
        Intrinsics.h(appIdentifier, "appIdentifier");
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        this.f6241a = apolloClient;
        this.b = dispatcherProvider;
        this.c = featureToggleManager;
        this.d = shopAppInstallationInteractor;
        this.e = offersEventRouter;
        this.f = rewardsAccountInteractor;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.g = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
        this.h = StateFlowKt.a(EmptySet.d);
        this.i = new ArraySet(0);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.d, 1);
        this.j = sharedFlowImplB;
        this.k = sharedFlowImplB;
        AppIdentifier appIdentifier2 = AppIdentifier.d;
        this.l = appIdentifier != appIdentifier2;
        this.m = appIdentifier != appIdentifier2;
    }

    public static final boolean a(RewardsOfferRepository rewardsOfferRepository) {
        FeatureToggleManager featureToggleManager = rewardsOfferRepository.c;
        Region regionA = RewardsAccountInteractorKt.a(rewardsOfferRepository.f);
        int i = regionA == null ? -1 : WhenMappings.f6242a[regionA.ordinal()];
        if (i == 1) {
            return featureToggleManager.c(RewardsBaseFeature.m);
        }
        if (i != 2) {
            return false;
        }
        return featureToggleManager.c(RewardsBaseFeature.l);
    }

    public static final void b(RewardsOfferRepository rewardsOfferRepository, RewardsOfferData rewardsOfferData) {
        Object value;
        if (rewardsOfferData.n == RewardsOfferStatus.ACTIVATED) {
            MutableStateFlow mutableStateFlow = rewardsOfferRepository.h;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, SetsKt.d((Set) value, rewardsOfferData.d)));
        }
    }

    public static final ActivationResult.Offer c(RewardsOfferRepository rewardsOfferRepository, ApolloResponse apolloResponse, RewardsOfferData rewardsOfferData, OfferActivationScreen offerActivationScreen) {
        RewardsOfferActivation rewardsOfferActivation;
        ActivateOfferInFeedMutation.OnActivationDetailsError onActivationDetailsError;
        rewardsOfferRepository.getClass();
        Operation.Data dataK = ExceptionExtKt.k(apolloResponse);
        List list = apolloResponse.d;
        ActivateOfferInFeedMutation.ActivateOfferInFeed activateOfferInFeed = ((ActivateOfferInFeedMutation.Data) dataK).f20697a;
        Object obj = null;
        if (activateOfferInFeed != null) {
            RewardsOfferFeed rewardsOfferFeedA = RewardsOfferFeedFieldsExtKt.a(activateOfferInFeed.f20695a.b);
            ArrayList arrayList = activateOfferInFeed.b;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) it.next());
            }
            ActivateOfferInFeedMutation.ActivationDetails activationDetails = activateOfferInFeed.c;
            rewardsOfferActivation = new RewardsOfferActivation(rewardsOfferFeedA, arrayList2, (activationDetails == null || (onActivationDetailsError = activationDetails.b) == null) ? null : new ActivationDetailsError(onActivationDetailsError.f20699a));
        } else {
            rewardsOfferActivation = null;
        }
        if (rewardsOfferActivation == null) {
            throw ExceptionExtKt.i(list);
        }
        ActivationDetails activationDetails2 = rewardsOfferActivation.c;
        RewardsOfferFeed rewardsOfferFeed = rewardsOfferActivation.f6285a;
        Iterator it2 = OfferSectionExtKt.b(rewardsOfferFeed.e).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.c(((RewardsOfferData) next).d, rewardsOfferData.d)) {
                obj = next;
                break;
            }
        }
        RewardsOfferData rewardsOfferData2 = (RewardsOfferData) obj;
        return activationDetails2 instanceof ActivationDetailsError ? new ActivationResult.Offer.Error(rewardsOfferData, rewardsOfferFeed, ExceptionExtKt.i(list), ((ActivationDetailsError) activationDetails2).f6266a, offerActivationScreen, 32) : rewardsOfferData2 == null ? new ActivationResult.Offer.Error(rewardsOfferData, rewardsOfferFeed, ExceptionExtKt.i(list), null, offerActivationScreen, 40) : new ActivationResult.Offer.Success(rewardsOfferData2, rewardsOfferFeed, offerActivationScreen);
    }

    public static final ActivationResult.Section d(RewardsOfferRepository rewardsOfferRepository, ApolloResponse apolloResponse, OffersSections offersSections, OfferActivationScreen offerActivationScreen) {
        ActivateSectionInFeedMutation.ActivateAllOffersInFeed activateAllOffersInFeed;
        ActivateSectionInFeedMutation.OnActivationDetailsError onActivationDetailsError;
        rewardsOfferRepository.getClass();
        Operation.Data data = apolloResponse.c;
        List list = apolloResponse.d;
        ActivateSectionInFeedMutation.Data data2 = (ActivateSectionInFeedMutation.Data) data;
        if (data2 == null || (activateAllOffersInFeed = data2.f20703a) == null) {
            throw ExceptionExtKt.i(list);
        }
        RewardsOfferFeed rewardsOfferFeedA = RewardsOfferFeedFieldsExtKt.a(activateAllOffersInFeed.f20701a.b);
        ArrayList arrayList = activateAllOffersInFeed.b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        ActivateSectionInFeedMutation.ActivationDetails activationDetails = activateAllOffersInFeed.c;
        Object obj = null;
        ActivationDetailsError activationDetailsError = (activationDetails == null || (onActivationDetailsError = activationDetails.b) == null) ? null : new ActivationDetailsError(onActivationDetailsError.f20705a);
        Iterator it2 = rewardsOfferFeedA.e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.c(OfferSectionExtKt.c((OffersSections) next), OfferSectionExtKt.c(offersSections))) {
                obj = next;
                break;
            }
        }
        OffersSections offersSections2 = (OffersSections) obj;
        if (activationDetailsError != null) {
            return new ActivationResult.Section.Error(offersSections, rewardsOfferFeedA, ExceptionExtKt.i(list), activationDetailsError.f6266a, 16);
        }
        if (offersSections2 != null) {
            List listA = OfferSectionExtKt.a(offersSections);
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(listA, 10));
            Iterator it3 = listA.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((RewardsOfferData) it3.next()).d);
            }
            List listA2 = OfferSectionExtKt.a(offersSections2);
            ArrayList arrayList4 = new ArrayList(CollectionsKt.s(listA2, 10));
            Iterator it4 = listA2.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((RewardsOfferData) it4.next()).d);
            }
            if (CollectionsKt.Y(arrayList3, CollectionsKt.L0(arrayList4)).isEmpty()) {
                return new ActivationResult.Section.Success(offersSections2, rewardsOfferFeedA, offerActivationScreen);
            }
        }
        return new ActivationResult.Section.Error(offersSections, rewardsOfferFeedA, ExceptionExtKt.i(list), null, 24);
    }

    public final Object e(String str, Continuation continuation) {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new RewardsOfferRepository$getOfferListPage$2(this, str, null), continuation);
    }

    public final Object f(String str, String str2, Continuation continuation) {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new RewardsOfferRepository$getRewardsOfferDetails$2(this, str, str2, null), continuation);
    }

    public final Object g(String str, String str2, Continuation continuation) {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new RewardsOfferRepository$getRewardsOfferDetailsScreen$2(this, str, str2, null), continuation);
    }
}
