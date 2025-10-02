package au.com.woolworths.android.onesite.app;

import au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.app.BaseShopApplication$syncShoppingLists$1$1", f = "BaseShopApplication.kt", l = {303}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BaseShopApplication$syncShoppingLists$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListSyncInteractor q;
    public final /* synthetic */ Boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseShopApplication$syncShoppingLists$1$1(ShoppingListSyncInteractor shoppingListSyncInteractor, Boolean bool, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListSyncInteractor;
        this.r = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseShopApplication$syncShoppingLists$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseShopApplication$syncShoppingLists$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
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
            kotlin.Unit r2 = kotlin.Unit.f24250a
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            kotlin.ResultKt.b(r8)
            return r2
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.ResultKt.b(r8)
            java.lang.Boolean r8 = r7.r
            kotlin.jvm.internal.Intrinsics.e(r8)
            boolean r8 = r8.booleanValue()
            r7.p = r3
            au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor r1 = r7.q
            au.com.woolworths.shop.lists.data.sync.scheduler.SyncScheduler r4 = r1.f12260a
            au.com.woolworths.shop.auth.ShopAccountInteractor r1 = r1.k
            boolean r1 = r1.S()
            if (r1 != 0) goto L33
        L31:
            r8 = r2
            goto L58
        L33:
            if (r8 != r3) goto L4d
            androidx.work.WorkInfo$State r8 = r4.a()
            androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.d
            if (r8 != r1) goto L4a
            androidx.work.impl.WorkManagerImpl r8 = r4.d
            r8.getClass()
            androidx.work.impl.utils.CancelWorkRunnable.c(r8)
            r5 = 0
            r4.c(r5)
        L4a:
            au.com.woolworths.shop.lists.data.sync.scheduler.SyncType r8 = au.com.woolworths.shop.lists.data.sync.scheduler.SyncType.f
            goto L51
        L4d:
            if (r8 != 0) goto L5c
            au.com.woolworths.shop.lists.data.sync.scheduler.SyncType r8 = au.com.woolworths.shop.lists.data.sync.scheduler.SyncType.e
        L51:
            r1 = 0
            java.lang.Object r8 = r4.e(r1, r8, r7)
            if (r8 != r0) goto L31
        L58:
            if (r8 != r0) goto L5b
            return r0
        L5b:
            return r2
        L5c:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.app.BaseShopApplication$syncShoppingLists$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
