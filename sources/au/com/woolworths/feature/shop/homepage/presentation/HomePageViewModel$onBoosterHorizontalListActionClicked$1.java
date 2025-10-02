package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionState;
import au.com.woolworths.feature.shop.homepage.data.BoosterHorizontalListData;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.product.offers.ProductBoostResult;
import au.com.woolworths.product.offers.TrackableBoostMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$onBoosterHorizontalListActionClicked$1", f = "HomePageViewModel.kt", l = {484}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class HomePageViewModel$onBoosterHorizontalListActionClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ HomePageViewModel q;
    public final /* synthetic */ BoosterHorizontalListData r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePageViewModel$onBoosterHorizontalListActionClicked$1(HomePageViewModel homePageViewModel, BoosterHorizontalListData boosterHorizontalListData, Continuation continuation) {
        super(2, continuation);
        this.q = homePageViewModel;
        this.r = boosterHorizontalListData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomePageViewModel$onBoosterHorizontalListActionClicked$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomePageViewModel$onBoosterHorizontalListActionClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object boostAllFail;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        HomePageViewModel homePageViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            HomePageViewModel.K6(homePageViewModel, homePageViewModel.H, null, HorizontalListActionState.e, null, null, null, 503);
            BoosterHorizontalListData boosterHorizontalListData = this.r;
            ArrayList arrayListB = CollectionsKt.B(boosterHorizontalListData.h);
            ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListB, 10));
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.f(next, "null cannot be cast to non-null type au.com.woolworths.product.models.ProductCard");
                arrayList.add((ProductCard) next);
            }
            List list = boosterHorizontalListData.i;
            this.p = 1;
            obj = ProductBoostInteractor.b(homePageViewModel.n, arrayList, new TrackableBoostMetadata(Screens.l, null), null, list, this, 2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ProductBoostResult productBoostResult = (ProductBoostResult) obj;
        SharedFlowImpl sharedFlowImpl = homePageViewModel.J;
        if (productBoostResult instanceof ProductBoostResult.Success) {
            ProductBoostResult.Success success = (ProductBoostResult.Success) productBoostResult;
            ?? r1 = success.c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : (Iterable) r1) {
                RewardsOfferInfo rewardsOfferInfo = ((ProductCard) obj2).getRewardsOfferInfo();
                if ((rewardsOfferInfo != null ? rewardsOfferInfo.getN() : null) != RewardsOfferStatus.ACTIVATED) {
                    arrayList2.add(obj2);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                RewardsOfferInfo rewardsOfferInfo2 = ((ProductCard) next2).getRewardsOfferInfo();
                String d = rewardsOfferInfo2 != null ? rewardsOfferInfo2.getD() : null;
                Object arrayList3 = linkedHashMap.get(d);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(d, arrayList3);
                }
                ((List) arrayList3).add(next2);
            }
            int size = linkedHashMap.size();
            TrackingMetadata trackingMetadataF = success.e.b;
            if (trackingMetadataF == null) {
                trackingMetadataF = ProductAnalyticsExtKt.f(r1);
            }
            if (size == 0) {
                boostAllFail = new HomePageContract.Actions.BoostAllSuccess(trackingMetadataF);
            } else {
                Integer numValueOf = Integer.valueOf(size);
                trackingMetadataF.a(TrackingMetadata.Companion.a(TrackableValue.o0, "unable to boost " + size + " offer"));
                boostAllFail = new HomePageContract.Actions.BoostAllFail(numValueOf, trackingMetadataF);
            }
            sharedFlowImpl.f(boostAllFail);
        } else {
            if (!(productBoostResult instanceof ProductBoostResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            ProductBoostResult.Failure failure = (ProductBoostResult.Failure) productBoostResult;
            HomePageViewModel.K6(homePageViewModel, homePageViewModel.H, null, HorizontalListActionState.d, null, null, null, 503);
            TrackingMetadata trackingMetadataF2 = failure.e.b;
            if (trackingMetadataF2 == null) {
                trackingMetadataF2 = ProductAnalyticsExtKt.f(failure.d);
            }
            sharedFlowImpl.f(new HomePageContract.Actions.BoostAllFail(null, trackingMetadataF2));
        }
        return Unit.f24250a;
    }
}
