package au.com.woolworths.shop.cart.ui.quickadd;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.cart.domain.model.OfferProductList;
import au.com.woolworths.shop.cart.domain.model.PageResult;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferViewModel$handleOfferOperation$1", f = "QuickAddOfferViewModel.kt", l = {157}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class QuickAddOfferViewModel$handleOfferOperation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SuspendLambda q;
    public final /* synthetic */ QuickAddOfferViewModel r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ Function0 t;
    public final /* synthetic */ Function0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QuickAddOfferViewModel$handleOfferOperation$1(Function1 function1, QuickAddOfferViewModel quickAddOfferViewModel, Function1 function12, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.q = (SuspendLambda) function1;
        this.r = quickAddOfferViewModel;
        this.s = function12;
        this.t = function0;
        this.u = function02;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuickAddOfferViewModel$handleOfferOperation$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QuickAddOfferViewModel$handleOfferOperation$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objInvoke;
        QuickAddOfferViewModel quickAddOfferViewModel = this.r;
        MutableStateFlow mutableStateFlow = quickAddOfferViewModel.i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            this.p = 1;
            objInvoke = this.q.invoke(this);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            objInvoke = obj;
        }
        PageResult pageResult = (PageResult) objInvoke;
        if (Intrinsics.c(pageResult, PageResult.Uninitialized.f10439a)) {
            ((QuickAddOfferContract.ViewState) mutableStateFlow.getValue()).getClass();
            mutableStateFlow.setValue(QuickAddOfferContract.ViewState.a(false, QuickAddOfferContract.Content.Empty.f10531a));
        } else if (pageResult instanceof PageResult.Success) {
            Object obj2 = ((PageResult.Success) pageResult).f10438a;
            OfferProductList offerProductList = (OfferProductList) obj2;
            if (offerProductList instanceof OfferProductList.Success) {
                OfferProductList.Success success = (OfferProductList.Success) offerProductList;
                Event eventA = AnalyticsDataKt.a(success.h);
                List list = success.g;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnalyticsData productCardAnalytics = ((ProductCard) it.next()).getProductCardAnalytics();
                    if (productCardAnalytics != null) {
                        arrayList.add(productCardAnalytics);
                    }
                }
                AnalyticsData analyticsData = new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    analyticsData = AnalyticsDataKt.c(analyticsData, (AnalyticsData) it2.next(), false);
                }
                this.s.invoke(AnalyticsDataKt.b(eventA, analyticsData));
                QuickAddOfferContract.ViewState viewState = (QuickAddOfferContract.ViewState) mutableStateFlow.getValue();
                QuickAddOfferContract.Content.Success success2 = new QuickAddOfferContract.Content.Success((OfferProductList.Success) offerProductList, EmptyMap.d);
                viewState.getClass();
                mutableStateFlow.setValue(QuickAddOfferContract.ViewState.a(false, success2));
            } else {
                if (!(offerProductList instanceof OfferProductList.Fail)) {
                    throw new NoWhenBranchMatchedException();
                }
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.i(new ReportOwner(ReportOwner.Squad.h), ((OfferProductList.Fail) obj2).f10434a, null, 12);
                quickAddOfferViewModel.j.f(QuickAddOfferContract.Action.NavigateAndRefreshCart.f10529a);
            }
        } else {
            if (!(pageResult instanceof PageResult.Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((PageResult.Fail) pageResult).f10437a instanceof NoConnectivityException) {
                this.t.invoke();
            } else {
                this.u.invoke();
            }
        }
        return Unit.f24250a;
    }
}
