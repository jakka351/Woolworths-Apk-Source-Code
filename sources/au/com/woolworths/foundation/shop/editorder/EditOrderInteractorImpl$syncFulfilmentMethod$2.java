package au.com.woolworths.foundation.shop.editorder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl$syncFulfilmentMethod$2", f = "EditOrderInteractorImpl.kt", l = {131, 140}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class EditOrderInteractorImpl$syncFulfilmentMethod$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EditOrderInteractorImpl q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditOrderInteractorImpl$syncFulfilmentMethod$2(EditOrderInteractorImpl editOrderInteractorImpl, Continuation continuation) {
        super(2, continuation);
        this.q = editOrderInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditOrderInteractorImpl$syncFulfilmentMethod$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EditOrderInteractorImpl$syncFulfilmentMethod$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
    
        if (kotlinx.coroutines.rx2.RxAwaitKt.b(r1, r7) == r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        if (kotlinx.coroutines.rx2.RxAwaitKt.b(r1, r7) == r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cd, code lost:
    
        return r3;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl r0 = r7.q
            au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository r1 = r0.c
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r2 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r7.p
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L20
            if (r4 == r6) goto L1b
            if (r4 != r5) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.ResultKt.b(r8)
            goto Lce
        L20:
            kotlin.ResultKt.b(r8)
            boolean r8 = r2.G()
            if (r8 == 0) goto L7b
            java.lang.String r8 = r2.B()
            if (r8 == 0) goto Lce
            au.com.woolworths.foundation.shop.storelocator.PickUpLocatorRepository r0 = r0.e
            au.com.woolworths.android.onesite.network.ApiInterface r0 = r0.c
            au.com.woolworths.android.onesite.modules.collectionmode.api.UpdateSelectedPickUpLocationRequest r1 = new au.com.woolworths.android.onesite.modules.collectionmode.api.UpdateSelectedPickUpLocationRequest
            r1.<init>(r8)
            io.reactivex.Single r8 = r0.a(r1)
            io.reactivex.internal.operators.single.SingleMap r8 = au.com.woolworths.android.onesite.rxutils.RxExtKt.a(r8)
            au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a r0 = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a
            r1 = 21
            r0.<init>(r1)
            au.com.woolworths.feature.shop.delivery.address.a r1 = new au.com.woolworths.feature.shop.delivery.address.a
            r2 = 24
            r1.<init>(r0, r2)
            io.reactivex.internal.operators.single.SingleMap r0 = new io.reactivex.internal.operators.single.SingleMap
            r0.<init>(r8, r1)
            au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a r8 = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a
            r1 = 22
            r8.<init>(r1)
            au.com.woolworths.feature.shop.delivery.address.a r1 = new au.com.woolworths.feature.shop.delivery.address.a
            r2 = 25
            r1.<init>(r8, r2)
            io.reactivex.internal.operators.single.SingleDoOnError r8 = new io.reactivex.internal.operators.single.SingleDoOnError
            r8.<init>(r0, r1)
            au.com.woolworths.feature.product.list.legacy.k r0 = new au.com.woolworths.feature.product.list.legacy.k
            r1 = 20
            r0.<init>(r1)
            io.reactivex.internal.operators.single.SingleOnErrorReturn r1 = new io.reactivex.internal.operators.single.SingleOnErrorReturn
            r1.<init>(r8, r0)
            r7.p = r6
            java.lang.Object r8 = kotlinx.coroutines.rx2.RxAwaitKt.b(r1, r7)
            if (r8 != r3) goto Lce
            goto Lcd
        L7b:
            boolean r8 = r2.R()
            if (r8 == 0) goto Ld1
            au.com.woolworths.android.onesite.appdata.AccountInteractor r8 = r0.f
            boolean r8 = r8.d()
            if (r8 == 0) goto Lce
            au.com.woolworths.base.shopapp.models.address.SaveAddressResult$Address r8 = r1.m()
            if (r8 == 0) goto Lce
            io.reactivex.internal.operators.single.SingleObserveOn r8 = r1.d()
            au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a r0 = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a
            r1 = 23
            r0.<init>(r1)
            au.com.woolworths.feature.shop.delivery.address.a r1 = new au.com.woolworths.feature.shop.delivery.address.a
            r2 = 26
            r1.<init>(r0, r2)
            io.reactivex.internal.operators.single.SingleMap r0 = new io.reactivex.internal.operators.single.SingleMap
            r0.<init>(r8, r1)
            au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a r8 = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a
            r1 = 24
            r8.<init>(r1)
            au.com.woolworths.feature.shop.delivery.address.a r1 = new au.com.woolworths.feature.shop.delivery.address.a
            r2 = 27
            r1.<init>(r8, r2)
            io.reactivex.internal.operators.single.SingleDoOnError r8 = new io.reactivex.internal.operators.single.SingleDoOnError
            r8.<init>(r0, r1)
            au.com.woolworths.feature.product.list.legacy.k r0 = new au.com.woolworths.feature.product.list.legacy.k
            r1 = 21
            r0.<init>(r1)
            io.reactivex.internal.operators.single.SingleOnErrorReturn r1 = new io.reactivex.internal.operators.single.SingleOnErrorReturn
            r1.<init>(r8, r0)
            r7.p = r5
            java.lang.Object r8 = kotlinx.coroutines.rx2.RxAwaitKt.b(r1, r7)
            if (r8 != r3) goto Lce
        Lcd:
            return r3
        Lce:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        Ld1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use trolley while in In Store mode"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl$syncFulfilmentMethod$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
