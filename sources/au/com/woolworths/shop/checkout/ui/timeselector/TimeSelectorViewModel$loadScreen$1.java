package au.com.woolworths.shop.checkout.ui.timeselector;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.checkout.TimeSelectorAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.shop.checkout.domain.interactor.timeselector.GetTimeSelectorDataInteractor;
import au.com.woolworths.shop.checkout.domain.model.DeliveryNowWindow;
import au.com.woolworths.shop.checkout.domain.model.DirectToBootNowWindow;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorContract;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.DateItem;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeSelectorDataMapperKt;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeSelectorUiItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorViewModel$loadScreen$1", f = "TimeSelectorViewModel.kt", l = {66}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class TimeSelectorViewModel$loadScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ TimeSelectorViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeSelectorViewModel$loadScreen$1(TimeSelectorViewModel timeSelectorViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = timeSelectorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TimeSelectorViewModel$loadScreen$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TimeSelectorViewModel$loadScreen$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DirectToBootNowWindow directToBootNowWindow;
        DeliveryNowWindow deliveryNowWindow;
        DateItem dateItem;
        TimeSelectorViewModel timeSelectorViewModel = this.q;
        AnalyticsManager analyticsManager = timeSelectorViewModel.g;
        MutableStateFlow mutableStateFlow = timeSelectorViewModel.i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            try {
                try {
                    if (i == 0) {
                        ResultKt.b(obj);
                        mutableStateFlow.setValue(TimeSelectorContract.ViewState.a((TimeSelectorContract.ViewState) mutableStateFlow.getValue(), null, null, null, TimeSelectorContract.LoadingState.d, null, 111));
                        GetTimeSelectorDataInteractor getTimeSelectorDataInteractor = timeSelectorViewModel.e;
                        this.p = 1;
                        obj = getTimeSelectorDataInteractor.f10552a.a(this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    }
                    FulfilmentWindows fulfilmentWindows = (FulfilmentWindows) obj;
                    TimeSelectorContract.ViewState viewStateE = TimeSelectorDataMapperKt.e(fulfilmentWindows, timeSelectorViewModel.r6());
                    List list = fulfilmentWindows.e;
                    if (viewStateE.d instanceof TimeSelectorContract.TimeSelectorErrorState.TimeSelectorFullEmpty) {
                        analyticsManager.g(TimeSelectorAnalytics.WindowSelection.Action.h);
                    } else {
                        TimeSelectorAnalytics.WindowSelection.Action.Companion companion = TimeSelectorAnalytics.WindowSelection.Action.d;
                        FulfilmentWindowsOption fulfilmentWindowsOption = (FulfilmentWindowsOption) CollectionsKt.F(list);
                        final boolean zC = false;
                        final boolean zEquals = (fulfilmentWindowsOption == null || (deliveryNowWindow = fulfilmentWindowsOption.n) == null) ? false : deliveryNowWindow.l.equals(Boolean.TRUE);
                        FulfilmentWindowsOption fulfilmentWindowsOption2 = (FulfilmentWindowsOption) CollectionsKt.F(list);
                        if (fulfilmentWindowsOption2 != null && (directToBootNowWindow = fulfilmentWindowsOption2.o) != null) {
                            zC = Intrinsics.c(directToBootNowWindow.i, Boolean.TRUE);
                        }
                        companion.getClass();
                        analyticsManager.g(new Event(zEquals, zC) { // from class: au.com.woolworths.analytics.supers.checkout.TimeSelectorAnalytics$WindowSelection$Action$Companion$windowSelectionScreen$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                spreadBuilder.b(TimeSelectorAnalytics.WindowSelection.e);
                                spreadBuilder.a(new Pair("window.IsDeliveryNowAvailable", String.valueOf(zEquals)));
                                androidx.constraintlayout.core.state.a.y("window.IsDirectToBootNowAvailable", String.valueOf(zC), spreadBuilder);
                                ArrayList arrayList = spreadBuilder.f24269a;
                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                            }

                            @Override // au.com.woolworths.analytics.Event
                            /* renamed from: d */
                            public final String getE() {
                                return "window_selection_screen";
                            }

                            public final boolean equals(Object obj2) {
                                if (!(obj2 instanceof Event)) {
                                    return false;
                                }
                                Event event = (Event) obj2;
                                return "window_selection_screen".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                            }

                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                            @Override // au.com.woolworths.analytics.Event
                            public final Map getData() {
                                return this.d;
                            }
                        });
                    }
                    mutableStateFlow.setValue(viewStateE);
                    Integer num = timeSelectorViewModel.m;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        List list2 = ((TimeSelectorContract.ViewState) timeSelectorViewModel.j.getValue()).f10838a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list2) {
                            if (obj2 instanceof TimeSelectorUiItem.DateSelectorUiItem) {
                                arrayList.add(obj2);
                            }
                        }
                        TimeSelectorUiItem.DateSelectorUiItem dateSelectorUiItem = (TimeSelectorUiItem.DateSelectorUiItem) CollectionsKt.F(arrayList);
                        if (dateSelectorUiItem != null && (dateItem = (DateItem) CollectionsKt.J(iIntValue, dateSelectorUiItem.f10844a)) != null) {
                            timeSelectorViewModel.t6(dateItem);
                        }
                    }
                    mutableStateFlow.setValue(TimeSelectorContract.ViewState.a((TimeSelectorContract.ViewState) mutableStateFlow.getValue(), null, null, null, TimeSelectorContract.LoadingState.f, null, 111));
                } catch (NoConnectivityException unused) {
                    mutableStateFlow.setValue(TimeSelectorContract.ViewState.a((TimeSelectorContract.ViewState) mutableStateFlow.getValue(), null, null, TimeSelectorContract.TimeSelectorErrorState.TimeSelectorNetworkError.f10836a, null, null, 119));
                    analyticsManager.g(TimeSelectorAnalytics.WindowSelection.Action.g);
                    mutableStateFlow.setValue(TimeSelectorContract.ViewState.a((TimeSelectorContract.ViewState) mutableStateFlow.getValue(), null, null, null, TimeSelectorContract.LoadingState.f, null, 111));
                }
            } catch (ServerErrorException unused2) {
                mutableStateFlow.setValue(TimeSelectorContract.ViewState.a((TimeSelectorContract.ViewState) mutableStateFlow.getValue(), null, null, TimeSelectorContract.TimeSelectorErrorState.TimeSelectorServerError.f10837a, null, null, 119));
                analyticsManager.g(TimeSelectorAnalytics.WindowSelection.Action.f);
                mutableStateFlow.setValue(TimeSelectorContract.ViewState.a((TimeSelectorContract.ViewState) mutableStateFlow.getValue(), null, null, null, TimeSelectorContract.LoadingState.f, null, 111));
            }
            return Unit.f24250a;
        } catch (Throwable th) {
            mutableStateFlow.setValue(TimeSelectorContract.ViewState.a((TimeSelectorContract.ViewState) mutableStateFlow.getValue(), null, null, null, TimeSelectorContract.LoadingState.f, null, 111));
            throw th;
        }
    }
}
