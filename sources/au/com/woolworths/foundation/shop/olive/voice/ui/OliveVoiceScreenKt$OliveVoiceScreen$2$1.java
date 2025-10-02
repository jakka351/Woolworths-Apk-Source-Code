package au.com.woolworths.foundation.shop.olive.voice.ui;

import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import com.google.accompanist.permissions.PermissionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.olive.voice.ui.OliveVoiceScreenKt$OliveVoiceScreen$2$1", f = "OliveVoiceScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OliveVoiceScreenKt$OliveVoiceScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ OliveVoiceViewModel p;
    public final /* synthetic */ PermissionState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OliveVoiceScreenKt$OliveVoiceScreen$2$1(OliveVoiceViewModel oliveVoiceViewModel, PermissionState permissionState, Continuation continuation) {
        super(2, continuation);
        this.p = oliveVoiceViewModel;
        this.q = permissionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OliveVoiceScreenKt$OliveVoiceScreen$2$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OliveVoiceScreenKt$OliveVoiceScreen$2$1 oliveVoiceScreenKt$OliveVoiceScreen$2$1 = (OliveVoiceScreenKt$OliveVoiceScreen$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        oliveVoiceScreenKt$OliveVoiceScreen$2$1.invokeSuspend(unit);
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            kotlin.ResultKt.b(r6)
            com.google.accompanist.permissions.PermissionState r6 = r5.q
            com.google.accompanist.permissions.PermissionStatus r6 = r6.getStatus()
            boolean r6 = com.google.accompanist.permissions.PermissionsUtilKt.d(r6)
            au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel r0 = r5.p
            au.com.woolworths.foundation.shop.olive.voice.OliveVoiceInteractorImpl r1 = r0.e
            boolean r2 = r1.a()
            if (r2 == 0) goto L49
            au.com.woolworths.foundation.shop.olive.voice.OliveVoiceInteractorImpl r2 = r0.e
            boolean r3 = r0.n
            r4 = 0
            if (r3 == 0) goto L2b
            au.com.woolworths.foundation.shop.olive.voice.OliveVoiceRepositoryImpl r2 = r2.f8803a
            android.content.SharedPreferences r2 = r2.f8804a
            java.lang.String r3 = "oliveVoiceSearchOnboardingShown"
            boolean r2 = r2.getBoolean(r3, r4)
            goto L35
        L2b:
            au.com.woolworths.foundation.shop.olive.voice.OliveVoiceRepositoryImpl r2 = r2.f8803a
            android.content.SharedPreferences r2 = r2.f8804a
            java.lang.String r3 = "oliveVoiceOnboardingShown"
            boolean r2 = r2.getBoolean(r3, r4)
        L35:
            if (r2 != 0) goto L49
            kotlinx.coroutines.flow.MutableStateFlow r2 = r0.l
        L39:
            java.lang.Object r6 = r2.getValue()
            r0 = r6
            au.com.woolworths.foundation.shop.olive.voice.OliveVoiceContract$ViewState r0 = (au.com.woolworths.foundation.shop.olive.voice.OliveVoiceContract.ViewState) r0
            au.com.woolworths.foundation.shop.olive.voice.OliveVoiceContract$ViewState$Onboarding r0 = au.com.woolworths.foundation.shop.olive.voice.OliveVoiceContract.ViewState.Onboarding.f8800a
            boolean r6 = r2.d(r6, r0)
            if (r6 == 0) goto L39
            goto L56
        L49:
            boolean r1 = r1.a()
            if (r1 == 0) goto L56
            if (r6 != 0) goto L56
            au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState$Idle r6 = au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState.Idle.f8832a
            r0.s6(r6)
        L56:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.olive.voice.ui.OliveVoiceScreenKt$OliveVoiceScreen$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
