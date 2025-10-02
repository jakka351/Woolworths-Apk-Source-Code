package au.com.woolworths.feature.shop.account.ui.delete;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountActivity$logoutUser$1", f = "DeleteAccountActivity.kt", l = {56, 61}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DeleteAccountActivity$logoutUser$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ DeleteAccountActivity q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteAccountActivity$logoutUser$1(DeleteAccountActivity deleteAccountActivity, Continuation continuation) {
        super(2, continuation);
        this.q = deleteAccountActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeleteAccountActivity$logoutUser$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DeleteAccountActivity$logoutUser$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r8.c(r6, r7) == r0) goto L24;
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
            r2 = 0
            java.lang.String r3 = "authManager"
            r4 = 2
            r5 = 1
            au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountActivity r6 = r7.q
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            goto L4a
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            goto L31
        L21:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.shop.auth.ShopAuthManager r8 = r6.y     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            if (r8 == 0) goto L56
            r7.p = r5     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            java.lang.Object r8 = r8.a(r7)     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            if (r8 != r0) goto L31
            goto L45
        L31:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            boolean r8 = r8.booleanValue()     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            if (r8 == 0) goto L4a
            au.com.woolworths.shop.auth.ShopAuthManager r8 = r6.y     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            if (r8 == 0) goto L46
            r7.p = r4     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            java.lang.Object r8 = r8.c(r6, r7)     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            if (r8 != r0) goto L4a
        L45:
            return r0
        L46:
            kotlin.jvm.internal.Intrinsics.p(r3)     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            throw r2     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
        L4a:
            androidx.lifecycle.ViewModelLazy r8 = r6.w     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            java.lang.Object r8 = r8.getD()     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel r8 = (au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel) r8     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            r8.s6()     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            goto L5a
        L56:
            kotlin.jvm.internal.Intrinsics.p(r3)     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
            throw r2     // Catch: au.com.woolworths.auth.api.AuthException -> L5a
        L5a:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountActivity$logoutUser$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
