package au.com.woolworths.feature.shared.instore.wifi.ui;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shared.instore.wifi.analytics.TermsAndConditionsInStoreWifiActions;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiContract;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiViewModel$observeDnaSpacesBackgroundException$2", f = "JoinWifiViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class JoinWifiViewModel$observeDnaSpacesBackgroundException$2 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ JoinWifiViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinWifiViewModel$observeDnaSpacesBackgroundException$2(JoinWifiViewModel joinWifiViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = joinWifiViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        JoinWifiViewModel$observeDnaSpacesBackgroundException$2 joinWifiViewModel$observeDnaSpacesBackgroundException$2 = new JoinWifiViewModel$observeDnaSpacesBackgroundException$2(this.q, continuation);
        joinWifiViewModel$observeDnaSpacesBackgroundException$2.p = obj;
        return joinWifiViewModel$observeDnaSpacesBackgroundException$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        JoinWifiViewModel$observeDnaSpacesBackgroundException$2 joinWifiViewModel$observeDnaSpacesBackgroundException$2 = (JoinWifiViewModel$observeDnaSpacesBackgroundException$2) create((Throwable) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        joinWifiViewModel$observeDnaSpacesBackgroundException$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Throwable th = (Throwable) this.p;
        JoinWifiViewModel joinWifiViewModel = this.q;
        JoinWifiViewModel.s6(joinWifiViewModel, joinWifiViewModel.i, false, false, 2);
        joinWifiViewModel.j.f(JoinWifiContract.Actions.ShowJoinError.f6536a);
        AnalyticsManager analyticsManager = joinWifiViewModel.f;
        TermsAndConditionsInStoreWifiActions termsAndConditionsInStoreWifiActions = TermsAndConditionsInStoreWifiActions.k;
        TrackableValue trackableValue = TrackableValue.l0;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        analyticsManager.j(termsAndConditionsInStoreWifiActions, TrackingMetadata.Companion.a(trackableValue, message));
        Bark.Companion companion = Bark.f8483a;
        Bark.Barker.c(new ReportOwner(ReportOwner.Squad.u), th, null, 12);
        return Unit.f24250a;
    }
}
