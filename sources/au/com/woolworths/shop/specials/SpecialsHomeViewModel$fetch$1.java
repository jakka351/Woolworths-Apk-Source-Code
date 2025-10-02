package au.com.woolworths.shop.specials;

import android.content.Intent;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.specials.SpecialsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.AkamaiException;
import au.com.woolworths.android.onesite.network.AkamaiServerErrorType;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.shop.specials.SpecialsHomeContract;
import au.com.woolworths.shop.specials.model.SpecialsHome;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.specials.SpecialsHomeViewModel$fetch$1", f = "SpecialsHomeViewModel.kt", l = {144}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SpecialsHomeViewModel$fetch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SpecialsHomeViewModel q;
    public final /* synthetic */ Intent r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialsHomeViewModel$fetch$1(SpecialsHomeViewModel specialsHomeViewModel, Intent intent, Continuation continuation) {
        super(2, continuation);
        this.q = specialsHomeViewModel;
        this.r = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SpecialsHomeViewModel$fetch$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SpecialsHomeViewModel$fetch$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        String c;
        final String errorReason;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        SpecialsHomeViewModel specialsHomeViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                SpecialsHomeInteractor specialsHomeInteractor = specialsHomeViewModel.f;
                this.p = 1;
                obj = specialsHomeInteractor.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            SpecialsHome specialsHome = (SpecialsHome) obj;
            if (specialsHome.f12942a.isEmpty()) {
                specialsHomeViewModel.r6(new ServerErrorState(null, null));
            } else {
                MutableStateFlow mutableStateFlow = specialsHomeViewModel.o;
                mutableStateFlow.f(SpecialsHomeContract.ViewState.a((SpecialsHomeContract.ViewState) mutableStateFlow.getValue(), false, specialsHome, null, null, null, specialsHomeViewModel.k.d(), 24));
                SpecialsHomeViewModel.p6(specialsHomeViewModel, specialsHome, this.r);
            }
        } catch (NoConnectivityException unused) {
            specialsHomeViewModel.r6(ConnectionErrorState.d);
        } catch (ServerErrorException e) {
            AkamaiServerErrorType akamaiServerErrorTypeA = ExceptionExtKt.a(e);
            if (akamaiServerErrorTypeA != null) {
                String f4561a = akamaiServerErrorTypeA.getF4561a();
                if (f4561a == null || (c = androidx.camera.core.impl.b.o(akamaiServerErrorTypeA.getC(), " -> ", f4561a)) == null) {
                    c = akamaiServerErrorTypeA.getC();
                }
                AkamaiException akamaiException = new AkamaiException(c);
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.h(new ReportOwner(ReportOwner.Squad.v), akamaiException, "Specials page data fetch failed -> " + akamaiServerErrorTypeA.getC(), 24);
                String f4561a2 = akamaiServerErrorTypeA.getF4561a();
                if (f4561a2 == null || (errorReason = androidx.camera.core.impl.b.o(akamaiServerErrorTypeA.getD(), " -> ", f4561a2)) == null) {
                    errorReason = akamaiServerErrorTypeA.getD();
                }
                AnalyticsManager analyticsManager = specialsHomeViewModel.i;
                SpecialsAnalytics.Home.Action.Companion companion2 = SpecialsAnalytics.Home.Action.d;
                final String errorLabel = akamaiServerErrorTypeA.getC();
                companion2.getClass();
                Intrinsics.h(errorLabel, "errorLabel");
                Intrinsics.h(errorReason, "errorReason");
                analyticsManager.g(new Event(errorLabel, errorReason) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$fullScreenServerError$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                        spreadBuilder.b(SpecialsAnalytics.Home.f);
                        spreadBuilder.a(new Pair("event.Category", "error"));
                        spreadBuilder.a(new Pair("event.Action", "impression"));
                        spreadBuilder.a(new Pair("event.Label", errorLabel));
                        spreadBuilder.a(new Pair("error.Reason", errorReason));
                        a.y("error.Name", "Full Screen", spreadBuilder);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getE() {
                        return "error_impression";
                    }

                    public final boolean equals(Object obj2) {
                        if (!(obj2 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj2;
                        return "error_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
            }
            specialsHomeViewModel.r6(new ServerErrorState(ExceptionExtKt.c(e, akamaiServerErrorTypeA != null ? akamaiServerErrorTypeA.getF4561a() : null, akamaiServerErrorTypeA != null ? akamaiServerErrorTypeA.getB() : null), Boolean.valueOf(ExceptionExtKt.b(e))));
        }
        return Unit.f24250a;
    }
}
