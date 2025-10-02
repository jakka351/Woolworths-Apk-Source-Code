package au.com.woolworths.feature.shared.instore.wifi.ui;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shared.instore.wifi.analytics.InstoreWifiAction;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiContract;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor;
import com.cisco.or.sdk.exceptions.Hotspot2NotSupportedException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiViewModel$updateProfileState$1", f = "InstoreWifiViewModel.kt", l = {73}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreWifiViewModel$updateProfileState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public InstoreWifiViewModel p;
    public Object q;
    public int r;
    public final /* synthetic */ InstoreWifiViewModel s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreWifiViewModel$updateProfileState$1(InstoreWifiViewModel instoreWifiViewModel, boolean z, Continuation continuation) {
        super(2, continuation);
        this.s = instoreWifiViewModel;
        this.t = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreWifiViewModel$updateProfileState$1(this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstoreWifiViewModel$updateProfileState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        InstoreWifiViewModel instoreWifiViewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        boolean z = this.t;
        InstoreWifiViewModel instoreWifiViewModel2 = this.s;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                InstoreWifiViewModel.r6(instoreWifiViewModel2, instoreWifiViewModel2.h, null, true, null, null, 27);
                MutableStateFlow mutableStateFlow2 = instoreWifiViewModel2.h;
                InStoreWifiInteractor inStoreWifiInteractor = instoreWifiViewModel2.e;
                this.p = instoreWifiViewModel2;
                this.q = mutableStateFlow2;
                this.r = 1;
                Object objC = inStoreWifiInteractor.c(this);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mutableStateFlow = mutableStateFlow2;
                obj = objC;
                instoreWifiViewModel = instoreWifiViewModel2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                MutableStateFlow mutableStateFlow3 = (MutableStateFlow) this.q;
                InstoreWifiViewModel instoreWifiViewModel3 = this.p;
                ResultKt.b(obj);
                mutableStateFlow = mutableStateFlow3;
                instoreWifiViewModel = instoreWifiViewModel3;
            }
            InstoreWifiViewModel.r6(instoreWifiViewModel, mutableStateFlow, (Boolean) obj, false, null, null, 25);
        } catch (Hotspot2NotSupportedException e) {
            InstoreWifiViewModel.p6(instoreWifiViewModel2, e, z);
        } catch (NoSuchMethodError e2) {
            InstoreWifiViewModel.p6(instoreWifiViewModel2, e2, z);
        } catch (Throwable th) {
            InstoreWifiViewModel.r6(instoreWifiViewModel2, instoreWifiViewModel2.h, null, false, null, InstoreWifiContract.ErrorType.e, 11);
            AnalyticsManager analyticsManager = instoreWifiViewModel2.f;
            InstoreWifiAction.SetupCompleteErrorImpression setupCompleteErrorImpression = new InstoreWifiAction.SetupCompleteErrorImpression(InstoreWifiViewModel.q6(z));
            TrackableValue trackableValue = TrackableValue.l0;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            analyticsManager.j(setupCompleteErrorImpression, TrackingMetadata.Companion.a(trackableValue, message));
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.c(new ReportOwner(ReportOwner.Squad.u), th, "Failed to update profile state", 8);
        }
        return Unit.f24250a;
    }
}
