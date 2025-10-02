package au.com.woolworths.feature.shared.instore.wifi.ui;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shared.instore.wifi.analytics.InstoreWifiAction;
import au.com.woolworths.feature.shared.instore.wifi.analytics.WifiScreens;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiContract;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiViewModel$onJoinCheckChanged$1", f = "InstoreWifiViewModel.kt", l = {138}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreWifiViewModel$onJoinCheckChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ InstoreWifiViewModel r;
    public final /* synthetic */ WifiScreens s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreWifiViewModel$onJoinCheckChanged$1(boolean z, InstoreWifiViewModel instoreWifiViewModel, WifiScreens wifiScreens, Continuation continuation) {
        super(2, continuation);
        this.q = z;
        this.r = instoreWifiViewModel;
        this.s = wifiScreens;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreWifiViewModel$onJoinCheckChanged$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstoreWifiViewModel$onJoinCheckChanged$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        InstoreWifiViewModel instoreWifiViewModel = this.r;
        try {
        } catch (Throwable th) {
            InstoreWifiViewModel.r6(instoreWifiViewModel, instoreWifiViewModel.h, null, false, null, InstoreWifiContract.ErrorType.d, 11);
            AnalyticsManager analyticsManager = instoreWifiViewModel.f;
            InstoreWifiAction.SetupCompleteErrorImpression setupCompleteErrorImpression = new InstoreWifiAction.SetupCompleteErrorImpression(this.s);
            TrackableValue trackableValue = TrackableValue.l0;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            analyticsManager.j(setupCompleteErrorImpression, TrackingMetadata.Companion.a(trackableValue, message));
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.c(new ReportOwner(ReportOwner.Squad.u), th, null, 12);
        }
        if (i == 0) {
            ResultKt.b(obj);
            if (this.q) {
                InStoreWifiInteractor inStoreWifiInteractor = instoreWifiViewModel.e;
                SharedFlowImpl sharedFlowImpl = instoreWifiViewModel.i;
                if (inStoreWifiInteractor.d()) {
                    sharedFlowImpl.f(InstoreWifiContract.Actions.ShowJoinScreen.f6530a);
                } else {
                    InstoreWifiViewModel.r6(instoreWifiViewModel, instoreWifiViewModel.h, Boolean.FALSE, false, null, null, 25);
                    sharedFlowImpl.f(InstoreWifiContract.Actions.LaunchLogin.f6529a);
                }
                return Unit.f24250a;
            }
            InstoreWifiViewModel.r6(instoreWifiViewModel, instoreWifiViewModel.h, null, true, null, null, 27);
            InStoreWifiInteractor inStoreWifiInteractor2 = instoreWifiViewModel.e;
            this.p = 1;
            if (inStoreWifiInteractor2.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        InstoreWifiViewModel.r6(instoreWifiViewModel, instoreWifiViewModel.h, Boolean.FALSE, false, null, null, 25);
        return Unit.f24250a;
    }
}
