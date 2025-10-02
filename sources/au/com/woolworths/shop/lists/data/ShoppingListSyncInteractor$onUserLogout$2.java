package au.com.woolworths.shop.lists.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$onUserLogout$2", f = "ShoppingListSyncInteractor.kt", l = {152, 154}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListSyncInteractor$onUserLogout$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListSyncInteractor q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListSyncInteractor$onUserLogout$2(ShoppingListSyncInteractor shoppingListSyncInteractor, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListSyncInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListSyncInteractor$onUserLogout$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListSyncInteractor$onUserLogout$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor.a(r2, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.p
            au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor r2 = r5.q
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.b(r6)
            goto L42
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.ResultKt.b(r6)
            goto L39
        L1e:
            kotlin.ResultKt.b(r6)
            r5.p = r4
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r6 = r2.l
            r6.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r6 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.scheduling.DefaultIoScheduler r6 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f
            au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$clearLocalData$2 r1 = new au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$clearLocalData$2
            r4 = 0
            r1.<init>(r2, r4)
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.f(r6, r1, r5)
            if (r6 != r0) goto L39
            goto L41
        L39:
            r5.p = r3
            java.lang.Object r6 = au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor.a(r2, r5)
            if (r6 != r0) goto L42
        L41:
            return r0
        L42:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$onUserLogout$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
