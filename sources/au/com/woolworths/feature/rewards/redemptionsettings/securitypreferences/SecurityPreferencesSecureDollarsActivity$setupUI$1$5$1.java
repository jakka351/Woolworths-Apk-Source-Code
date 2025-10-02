package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import androidx.compose.material.ModalBottomSheetState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesSecureDollarsActivity$setupUI$1$5$1", f = "SecurityPreferencesSecureDollarsActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SecurityPreferencesSecureDollarsActivity$setupUI$1$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ModalBottomSheetState p;
    public final /* synthetic */ SecurityPreferencesSecureDollarsActivity q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityPreferencesSecureDollarsActivity$setupUI$1$5$1(ModalBottomSheetState modalBottomSheetState, SecurityPreferencesSecureDollarsActivity securityPreferencesSecureDollarsActivity, Continuation continuation) {
        super(2, continuation);
        this.p = modalBottomSheetState;
        this.q = securityPreferencesSecureDollarsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SecurityPreferencesSecureDollarsActivity$setupUI$1$5$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SecurityPreferencesSecureDollarsActivity$setupUI$1$5$1 securityPreferencesSecureDollarsActivity$setupUI$1$5$1 = (SecurityPreferencesSecureDollarsActivity$setupUI$1$5$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        securityPreferencesSecureDollarsActivity$setupUI$1$5$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        if (!this.p.d()) {
            this.q.finish();
        }
        return Unit.f24250a;
    }
}
