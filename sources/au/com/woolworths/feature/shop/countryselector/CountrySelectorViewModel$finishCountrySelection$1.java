package au.com.woolworths.feature.shop.countryselector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel$finishCountrySelection$1", f = "CountrySelectorViewModel.kt", l = {85, 89, 90, 93}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class CountrySelectorViewModel$finishCountrySelection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CountrySelectorViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountrySelectorViewModel$finishCountrySelection$1(CountrySelectorViewModel countrySelectorViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = countrySelectorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CountrySelectorViewModel$finishCountrySelection$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CountrySelectorViewModel$finishCountrySelection$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r13.z(au.com.woolworths.feature.shop.countryselector.CountrySelectorContract.Actions.PerformIdpLogout.f7032a, r12) == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel.p6(r0, r13, r12) == r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel r0 = r12.q
            au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl r1 = r0.f
            au.com.woolworths.android.onesite.navigation.Activities$CountrySelector$Source r2 = r0.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r12.p
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L2d
            if (r4 == r8) goto L29
            if (r4 == r7) goto L25
            if (r4 == r6) goto L21
            if (r4 != r5) goto L19
            goto L21
        L19:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L21:
            kotlin.ResultKt.b(r13)
            goto L89
        L25:
            kotlin.ResultKt.b(r13)
            goto L5b
        L29:
            kotlin.ResultKt.b(r13)
            goto L50
        L2d:
            kotlin.ResultKt.b(r13)
            au.com.woolworths.android.onesite.navigation.Activities$CountrySelector$Source r13 = au.com.woolworths.android.onesite.navigation.Activities.CountrySelector.Source.e
            if (r2 != r13) goto L50
            kotlinx.coroutines.flow.MutableStateFlow r13 = r0.g
            java.lang.Object r4 = r13.getValue()
            au.com.woolworths.feature.shop.countryselector.CountrySelectorContract$ViewState r4 = (au.com.woolworths.feature.shop.countryselector.CountrySelectorContract.ViewState) r4
            r9 = 0
            r10 = 47
            r11 = 0
            au.com.woolworths.feature.shop.countryselector.CountrySelectorContract$ViewState r4 = au.com.woolworths.feature.shop.countryselector.CountrySelectorContract.ViewState.a(r4, r9, r11, r11, r10)
            r13.setValue(r4)
            r12.p = r8
            java.lang.Object r13 = r1.c(r12)
            if (r13 != r3) goto L50
            goto L88
        L50:
            r12.p = r7
            au.com.woolworths.shop.auth.ShopAuthManager r13 = r1.h
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r3) goto L5b
            goto L88
        L5b:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L74
            au.com.woolworths.android.onesite.navigation.Activities$CountrySelector$Source r13 = au.com.woolworths.android.onesite.navigation.Activities.CountrySelector.Source.e
            if (r2 != r13) goto L74
            kotlinx.coroutines.channels.BufferedChannel r13 = r0.i
            r12.p = r6
            au.com.woolworths.feature.shop.countryselector.CountrySelectorContract$Actions$PerformIdpLogout r0 = au.com.woolworths.feature.shop.countryselector.CountrySelectorContract.Actions.PerformIdpLogout.f7032a
            java.lang.Object r13 = r13.z(r0, r12)
            if (r13 != r3) goto L89
            goto L88
        L74:
            kotlinx.coroutines.flow.StateFlow r13 = r0.h
            java.lang.Object r13 = r13.getValue()
            au.com.woolworths.feature.shop.countryselector.CountrySelectorContract$ViewState r13 = (au.com.woolworths.feature.shop.countryselector.CountrySelectorContract.ViewState) r13
            au.com.woolworths.android.onesite.modules.common.Region r13 = r13.f7035a
            if (r13 == 0) goto L89
            r12.p = r5
            java.lang.Object r13 = au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel.p6(r0, r13, r12)
            if (r13 != r3) goto L89
        L88:
            return r3
        L89:
            kotlin.Unit r13 = kotlin.Unit.f24250a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel$finishCountrySelection$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
