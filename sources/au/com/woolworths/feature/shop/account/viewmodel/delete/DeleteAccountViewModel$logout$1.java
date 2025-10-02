package au.com.woolworths.feature.shop.account.viewmodel.delete;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel$logout$1", f = "DeleteAccountViewModel.kt", l = {62, 70}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DeleteAccountViewModel$logout$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ DeleteAccountViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteAccountViewModel$logout$1(DeleteAccountViewModel deleteAccountViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = deleteAccountViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeleteAccountViewModel$logout$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DeleteAccountViewModel$logout$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(2:6|19)(2:7|8))(1:9))(3:10|(0)|18)|13|21|14|(1:16)|(1:18)(1:19)) */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel r0 = r8.q
            au.com.woolworths.feature.shop.account.domain.delete.DeleteAccountInteractorImpl r1 = r0.f
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r8.p
            kotlin.Unit r4 = kotlin.Unit.f24250a
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L22
            if (r3 == r6) goto L1e
            if (r3 != r5) goto L16
            kotlin.ResultKt.b(r9)
            goto L7b
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            kotlin.ResultKt.b(r9)
            goto L2e
        L22:
            kotlin.ResultKt.b(r9)
            r8.p = r6
            java.lang.Object r9 = r1.a(r8)
            if (r9 != r2) goto L2e
            goto L7a
        L2e:
            au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl r9 = r1.b
            io.reactivex.Completable r9 = r9.c()
            io.reactivex.internal.operators.completable.CompletableCache r3 = new io.reactivex.internal.operators.completable.CompletableCache
            r3.<init>(r9)
            au.com.woolworths.android.onesite.rxutils.SchedulersProvider r9 = r0.g
            io.reactivex.Scheduler r9 = r9.b()
            io.reactivex.internal.operators.completable.CompletableObserveOn r6 = new io.reactivex.internal.operators.completable.CompletableObserveOn
            r6.<init>(r3, r9)
            au.com.woolworths.feature.shop.account.viewmodel.delete.a r9 = new au.com.woolworths.feature.shop.account.viewmodel.delete.a
            r3 = 0
            r9.<init>(r0, r3)
            au.com.woolworths.feature.shop.account.ui.delete.a r3 = new au.com.woolworths.feature.shop.account.ui.delete.a
            r7 = 1
            r3.<init>(r0, r7)
            au.com.woolworths.android.onesite.modules.deliveryaddress.search.e r0 = new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e
            r7 = 26
            r0.<init>(r3, r7)
            io.reactivex.internal.observers.CallbackCompletableObserver r3 = new io.reactivex.internal.observers.CallbackCompletableObserver
            r3.<init>(r0, r9)
            r6.a(r3)
            au.com.woolworths.android.onesite.rxutils.RxBus r9 = au.com.woolworths.android.onesite.rxutils.RxBus.a()
            au.com.woolworths.base.shopapp.events.LogoutStatusEvent r0 = au.com.woolworths.base.shopapp.events.LogoutStatusEvent.f4618a
            io.reactivex.subjects.PublishSubject r9 = r9.f4592a
            r9.onNext(r0)
            r8.p = r5
            r1.getClass()
            okhttp3.OkHttpClient r9 = r1.f     // Catch: java.io.IOException -> L78
            okhttp3.Cache r9 = r9.k     // Catch: java.io.IOException -> L78
            if (r9 == 0) goto L78
            r9.a()     // Catch: java.io.IOException -> L78
        L78:
            if (r4 != r2) goto L7b
        L7a:
            return r2
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel$logout$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
