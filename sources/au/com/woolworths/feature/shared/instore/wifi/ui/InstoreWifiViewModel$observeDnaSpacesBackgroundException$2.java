package au.com.woolworths.feature.shared.instore.wifi.ui;

import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiContract;
import com.cisco.or.sdk.exceptions.Hotspot2NotSupportedException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiViewModel$observeDnaSpacesBackgroundException$2", f = "InstoreWifiViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreWifiViewModel$observeDnaSpacesBackgroundException$2 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ InstoreWifiViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreWifiViewModel$observeDnaSpacesBackgroundException$2(InstoreWifiViewModel instoreWifiViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = instoreWifiViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InstoreWifiViewModel$observeDnaSpacesBackgroundException$2 instoreWifiViewModel$observeDnaSpacesBackgroundException$2 = new InstoreWifiViewModel$observeDnaSpacesBackgroundException$2(this.q, continuation);
        instoreWifiViewModel$observeDnaSpacesBackgroundException$2.p = obj;
        return instoreWifiViewModel$observeDnaSpacesBackgroundException$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InstoreWifiViewModel$observeDnaSpacesBackgroundException$2 instoreWifiViewModel$observeDnaSpacesBackgroundException$2 = (InstoreWifiViewModel$observeDnaSpacesBackgroundException$2) create((Throwable) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        instoreWifiViewModel$observeDnaSpacesBackgroundException$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        boolean z = ((Throwable) this.p) instanceof Hotspot2NotSupportedException;
        InstoreWifiViewModel instoreWifiViewModel = this.q;
        if (z) {
            InstoreWifiViewModel.r6(instoreWifiViewModel, instoreWifiViewModel.h, null, false, null, null, 26);
        } else {
            InstoreWifiViewModel.r6(instoreWifiViewModel, instoreWifiViewModel.h, null, false, null, InstoreWifiContract.ErrorType.d, 11);
        }
        return Unit.f24250a;
    }
}
