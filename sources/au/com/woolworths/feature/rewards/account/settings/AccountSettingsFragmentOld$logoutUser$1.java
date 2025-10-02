package au.com.woolworths.feature.rewards.account.settings;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld$logoutUser$1", f = "AccountSettingsFragmentOld.kt", l = {337, 342}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AccountSettingsFragmentOld$logoutUser$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AccountSettingsFragmentOld q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsFragmentOld$logoutUser$1(AccountSettingsFragmentOld accountSettingsFragmentOld, boolean z, Continuation continuation) {
        super(2, continuation);
        this.q = accountSettingsFragmentOld;
        this.r = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountSettingsFragmentOld$logoutUser$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountSettingsFragmentOld$logoutUser$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r8.c(r1, r7) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.p
            java.lang.String r2 = "authManager"
            r3 = 0
            r4 = 2
            r5 = 1
            au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld r6 = r7.q
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            goto L55
        L15:
            r8 = move-exception
            goto L6f
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            goto L33
        L23:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.auth.auth0.Auth0AuthManager r8 = r6.l     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            if (r8 == 0) goto L6b
            r7.p = r5     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            java.lang.Object r8 = r8.a(r7)     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            if (r8 != r0) goto L33
            goto L50
        L33:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            boolean r8 = r8.booleanValue()     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            if (r8 == 0) goto L55
            au.com.woolworths.auth.auth0.Auth0AuthManager r8 = r6.l     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            if (r8 == 0) goto L51
            android.content.Context r1 = r6.requireContext()     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            java.lang.String r2 = "requireContext(...)"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            r7.p = r4     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            java.lang.Object r8 = r8.c(r1, r7)     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            if (r8 != r0) goto L55
        L50:
            return r0
        L51:
            kotlin.jvm.internal.Intrinsics.p(r2)     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            throw r3     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
        L55:
            kotlin.reflect.KProperty[] r8 = au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld.r     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            au.com.woolworths.feature.rewards.account.settings.AccountSettingsViewModelOld r8 = r6.Q1()     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            boolean r0 = r7.r     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope r1 = androidx.lifecycle.ViewModelKt.a(r8)     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            au.com.woolworths.feature.rewards.account.settings.AccountSettingsViewModelOld$onLogoutConfirmed$1 r2 = new au.com.woolworths.feature.rewards.account.settings.AccountSettingsViewModelOld$onLogoutConfirmed$1     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            r2.<init>(r8, r0, r3)     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            r8 = 3
            kotlinx.coroutines.BuildersKt.c(r1, r3, r3, r2, r8)     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            goto L88
        L6b:
            kotlin.jvm.internal.Intrinsics.p(r2)     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
            throw r3     // Catch: au.com.woolworths.auth.auth0.Auth0Exception -> L15
        L6f:
            au.com.woolworths.foundation.bark.Bark$Companion r0 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r0 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.m
            au.com.woolworths.foundation.bark.common.ReportOwner r1 = new au.com.woolworths.foundation.bark.common.ReportOwner
            r1.<init>(r0)
            java.lang.String r0 = "Failed to logout"
            r2 = 24
            au.com.woolworths.foundation.bark.Bark.Barker.h(r1, r8, r0, r2)
            kotlin.reflect.KProperty[] r0 = au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld.r
            au.com.woolworths.feature.rewards.account.settings.AccountSettingsViewModelOld r0 = r6.Q1()
            r0.q6(r8)
        L88:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld$logoutUser$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
