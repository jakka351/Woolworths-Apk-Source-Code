package com.woolworths.scanlibrary.ui.home;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaFormEvent;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor$formFlow$$inlined$filter$1;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.analytics.medallia.MedalliaActionData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.woolworths.scanlibrary.ui.home.HomeActivityPresenter$logFormEventsToAnalytics$1", f = "HomeActivityPresenter.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class HomeActivityPresenter$logFormEventsToAnalytics$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ HomeActivityPresenter r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivityPresenter$logFormEventsToAnalytics$1(HomeActivityPresenter homeActivityPresenter, String str, Continuation continuation) {
        super(2, continuation);
        this.r = homeActivityPresenter;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HomeActivityPresenter$logFormEventsToAnalytics$1 homeActivityPresenter$logFormEventsToAnalytics$1 = new HomeActivityPresenter$logFormEventsToAnalytics$1(this.r, this.s, continuation);
        homeActivityPresenter$logFormEventsToAnalytics$1.q = obj;
        return homeActivityPresenter$logFormEventsToAnalytics$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeActivityPresenter$logFormEventsToAnalytics$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.q;
            final HomeActivityPresenter homeActivityPresenter = this.r;
            MedalliaInteractor$formFlow$$inlined$filter$1 medalliaInteractor$formFlow$$inlined$filter$1A = homeActivityPresenter.h.a(this.s);
            FlowCollector flowCollector = new FlowCollector() { // from class: com.woolworths.scanlibrary.ui.home.HomeActivityPresenter$logFormEventsToAnalytics$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    MedalliaFormEvent medalliaFormEvent = (MedalliaFormEvent) obj2;
                    AnalyticsManager analyticsManager = homeActivityPresenter.g;
                    if (medalliaFormEvent instanceof MedalliaFormEvent.FormDisplayed) {
                        analyticsManager.a(Screens.j);
                    } else if (medalliaFormEvent instanceof MedalliaFormEvent.FormSubmitted) {
                        analyticsManager.c(MedalliaActionData.e);
                    } else {
                        boolean z = medalliaFormEvent instanceof MedalliaFormEvent.FormDismissed;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        if (z) {
                            analyticsManager.c(MedalliaActionData.f);
                            CoroutineScopeKt.b(coroutineScope2, null);
                        } else if (medalliaFormEvent instanceof MedalliaFormEvent.FormClosed) {
                            analyticsManager.c(MedalliaActionData.g);
                            CoroutineScopeKt.b(coroutineScope2, null);
                        } else if (medalliaFormEvent instanceof MedalliaFormEvent.FormThankYouPrompt) {
                            analyticsManager.c(MedalliaActionData.h);
                        }
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (medalliaInteractor$formFlow$$inlined$filter$1A.collect(flowCollector, this) == coroutineSingletons) {
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
