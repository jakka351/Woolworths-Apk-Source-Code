package au.com.woolworths.feature.shop.login;

import au.com.woolworths.shop.auth.data.MemberData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.login.LoginInteractor$finalizeLogin$2", f = "LoginInteractor.kt", l = {69, 70}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LoginInteractor$finalizeLogin$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LoginInteractor q;
    public final /* synthetic */ MemberData r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginInteractor$finalizeLogin$2(LoginInteractor loginInteractor, MemberData memberData, Continuation continuation) {
        super(2, continuation);
        this.q = loginInteractor;
        this.r = memberData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginInteractor$finalizeLogin$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginInteractor$finalizeLogin$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r7.L(r6) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.p
            kotlin.Unit r2 = kotlin.Unit.f24250a
            r3 = 2
            r4 = 1
            au.com.woolworths.feature.shop.login.LoginInteractor r5 = r6.q
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.b(r7)
            goto L61
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            kotlin.ResultKt.b(r7)
            goto L56
        L20:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor r7 = r5.h
            r6.p = r4
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r1 = r7.e
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r1 = r1.w()
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$InStore r4 = au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode.InStore.d
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L3e
            java.lang.Object r7 = r7.U(r6)
            if (r7 != r0) goto L3c
            goto L53
        L3c:
            r7 = r2
            goto L53
        L3e:
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$PickUp r4 = au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode.PickUp.d
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L4d
            java.lang.Object r7 = r7.V(r6)
            if (r7 != r0) goto L3c
            goto L53
        L4d:
            java.lang.Object r7 = r7.W(r6)
            if (r7 != r0) goto L3c
        L53:
            if (r7 != r0) goto L56
            goto L60
        L56:
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r7 = r5.g
            r6.p = r3
            java.lang.Object r7 = r7.L(r6)
            if (r7 != r0) goto L61
        L60:
            return r0
        L61:
            au.com.woolworths.base.shopapp.TrolleyInteractor r7 = r5.f
            r7.d()
            au.com.woolworths.shop.auth.data.MemberData r7 = r6.r
            java.lang.String r7 = r7.getShopperId()
            java.lang.String r0 = "shopperId"
            kotlin.jvm.internal.Intrinsics.h(r7, r0)
            com.adobe.marketing.mobile.VisitorID$AuthenticationState r0 = com.adobe.marketing.mobile.VisitorID.AuthenticationState.AUTHENTICATED
            com.adobe.marketing.mobile.Identity.b(r7, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.login.LoginInteractor$finalizeLogin$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
