package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$processAnalyticResponse$1", f = "HomePageViewModel.kt", l = {1230}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class HomePageViewModel$processAnalyticResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ HomePageViewModel q;
    public final /* synthetic */ ArrayList r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePageViewModel$processAnalyticResponse$1(HomePageViewModel homePageViewModel, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.q = homePageViewModel;
        this.r = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomePageViewModel$processAnalyticResponse$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomePageViewModel$processAnalyticResponse$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final HomePageViewModel homePageViewModel = this.q;
            GoogleAdManagerInteractor googleAdManagerInteractor = homePageViewModel.k;
            GoogleAdConsumer googleAdConsumer = GoogleAdConsumer.e;
            Flow flowC = googleAdManagerInteractor.c(this.r);
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$processAnalyticResponse$1.1
                /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[PHI: r3
  0x003f: PHI (r3v2 au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard) = (r3v1 T), (r3v3 au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard) binds: [B:11:0x002d, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r7 = (au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard) r7
                        au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel r8 = r1
                        kotlinx.coroutines.flow.StateFlow r0 = r8.I
                        java.lang.Object r0 = r0.getValue()
                        au.com.woolworths.feature.shop.homepage.presentation.HomePageContract$ViewState r0 = (au.com.woolworths.feature.shop.homepage.presentation.HomePageContract.ViewState) r0
                        if (r0 == 0) goto L55
                        au.com.woolworths.feature.shop.homepage.data.HomeListData r0 = r0.b
                        if (r0 != 0) goto L13
                        goto L55
                    L13:
                        java.util.List r1 = r0.c
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        java.util.Iterator r1 = r1.iterator()
                    L20:
                        boolean r3 = r1.hasNext()
                        r4 = 0
                        if (r3 == 0) goto L46
                        java.lang.Object r3 = r1.next()
                        boolean r5 = r3 instanceof au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard
                        if (r5 == 0) goto L3f
                        au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r3 = (au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard) r3
                        boolean r5 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt.b(r7, r3)
                        if (r5 == 0) goto L3f
                        boolean r3 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt.c(r7)
                        if (r3 == 0) goto L40
                        r4 = r7
                        goto L40
                    L3f:
                        r4 = r3
                    L40:
                        if (r4 == 0) goto L20
                        r2.add(r4)
                        goto L20
                    L46:
                        kotlinx.coroutines.flow.MutableStateFlow r7 = r8.H
                        au.com.woolworths.feature.shop.homepage.data.HomeListData r0 = au.com.woolworths.feature.shop.homepage.data.HomeListData.a(r0, r2)
                        r1 = 29
                        au.com.woolworths.feature.shop.homepage.presentation.HomePageContract$ViewState r8 = au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel.z6(r8, r0, r4, r4, r1)
                        r7.setValue(r8)
                    L55:
                        kotlin.Unit r7 = kotlin.Unit.f24250a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$processAnalyticResponse$1.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            };
            this.p = 1;
            if (((AbstractFlow) flowC).collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
