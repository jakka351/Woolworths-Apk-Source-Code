package au.com.woolworths.shop.lists.ui.magicmatch;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchViewModel$getMatchedProducts$2", f = "MagicMatchViewModel.kt", l = {50, 51}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class MagicMatchViewModel$getMatchedProducts$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MagicMatchViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicMatchViewModel$getMatchedProducts$2(MagicMatchViewModel magicMatchViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = magicMatchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MagicMatchViewModel$getMatchedProducts$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MagicMatchViewModel$getMatchedProducts$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r0.a((java.util.List) r8, r7) == r2) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchViewModel r0 = r7.q
            kotlinx.coroutines.flow.MutableStateFlow r1 = r0.h
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r7.p
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L23
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L17
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L15 au.com.woolworths.android.onesite.network.ServerErrorException -> L60 au.com.woolworths.android.onesite.network.NoConnectivityException -> L6f
            goto L3c
        L15:
            r8 = move-exception
            goto L4e
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L15 au.com.woolworths.android.onesite.network.ServerErrorException -> L60 au.com.woolworths.android.onesite.network.NoConnectivityException -> L6f
            goto L2f
        L23:
            kotlin.ResultKt.b(r8)
            r7.p = r5     // Catch: java.lang.Throwable -> L15 au.com.woolworths.android.onesite.network.ServerErrorException -> L60 au.com.woolworths.android.onesite.network.NoConnectivityException -> L6f
            java.io.Serializable r8 = r0.p6(r7)     // Catch: java.lang.Throwable -> L15 au.com.woolworths.android.onesite.network.ServerErrorException -> L60 au.com.woolworths.android.onesite.network.NoConnectivityException -> L6f
            if (r8 != r2) goto L2f
            goto L3b
        L2f:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L15 au.com.woolworths.android.onesite.network.ServerErrorException -> L60 au.com.woolworths.android.onesite.network.NoConnectivityException -> L6f
            au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchInteractor r0 = r0.f     // Catch: java.lang.Throwable -> L15 au.com.woolworths.android.onesite.network.ServerErrorException -> L60 au.com.woolworths.android.onesite.network.NoConnectivityException -> L6f
            r7.p = r4     // Catch: java.lang.Throwable -> L15 au.com.woolworths.android.onesite.network.ServerErrorException -> L60 au.com.woolworths.android.onesite.network.NoConnectivityException -> L6f
            java.io.Serializable r8 = r0.a(r8, r7)     // Catch: java.lang.Throwable -> L15 au.com.woolworths.android.onesite.network.ServerErrorException -> L60 au.com.woolworths.android.onesite.network.NoConnectivityException -> L6f
            if (r8 != r2) goto L3c
        L3b:
            return r2
        L3c:
            java.lang.Object r8 = r1.getValue()
            au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract$ViewState r8 = (au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract.ViewState) r8
            r8.getClass()
            au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract$ViewState r8 = new au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract$ViewState
            r8.<init>(r6)
        L4a:
            r1.setValue(r8)
            goto L7e
        L4e:
            java.lang.Object r0 = r1.getValue()
            au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract$ViewState r0 = (au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract.ViewState) r0
            r0.getClass()
            au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract$ViewState r0 = new au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract$ViewState
            r0.<init>(r6)
            r1.setValue(r0)
            throw r8
        L60:
            java.lang.Object r8 = r1.getValue()
            au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract$ViewState r8 = (au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract.ViewState) r8
            r8.getClass()
            au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract$ViewState r8 = new au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract$ViewState
            r8.<init>(r6)
            goto L4a
        L6f:
            java.lang.Object r8 = r1.getValue()
            au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract$ViewState r8 = (au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract.ViewState) r8
            r8.getClass()
            au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract$ViewState r8 = new au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract$ViewState
            r8.<init>(r6)
            goto L4a
        L7e:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchViewModel$getMatchedProducts$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
