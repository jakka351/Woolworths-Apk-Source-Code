package au.com.woolworths.shop.lists.data;

import au.com.woolworths.shop.auth.ShopAccountInteractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$onUserLogin$2", f = "ShoppingListSyncInteractor.kt", l = {140, 147}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListSyncInteractor$onUserLogin$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public String p;
    public int q;
    public final /* synthetic */ ShopAccountInteractor.LoginDetails r;
    public final /* synthetic */ ShoppingListSyncInteractor s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListSyncInteractor$onUserLogin$2(ShopAccountInteractor.LoginDetails loginDetails, ShoppingListSyncInteractor shoppingListSyncInteractor, Continuation continuation) {
        super(2, continuation);
        this.r = loginDetails;
        this.s = shoppingListSyncInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListSyncInteractor$onUserLogin$2(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListSyncInteractor$onUserLogin$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor.a(r2, r6) == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5, types: [au.com.woolworths.shop.lists.data.sync.scheduler.SyncScheduler] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws au.com.woolworths.android.onesite.network.NoConnectivityException {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.q
            au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor r2 = r6.s
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L13
            kotlin.ResultKt.b(r7)
            goto L60
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            java.lang.String r1 = r6.p
            kotlin.ResultKt.b(r7)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21
            goto L53
        L21:
            r7 = move-exception
            goto L4e
        L23:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.shop.auth.ShopAccountInteractor$LoginDetails r7 = r6.r
            boolean r1 = r7.f10229a
            if (r1 == 0) goto L30
            java.lang.String r7 = r7.b
            r1 = r7
            goto L31
        L30:
            r1 = r3
        L31:
            au.com.woolworths.shop.lists.data.sync.scheduler.SyncScheduler r7 = r2.f12260a     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21
            r6.p = r1     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21
            r6.q = r5     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21
            au.com.woolworths.android.onesite.utils.ConnectionManager r5 = r7.c     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21
            boolean r5 = r5.isConnected()     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21
            if (r5 == 0) goto L48
            au.com.woolworths.shop.lists.data.sync.scheduler.SyncType r5 = au.com.woolworths.shop.lists.data.sync.scheduler.SyncType.d     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21
            java.lang.Object r7 = r7.e(r1, r5, r6)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21
            if (r7 != r0) goto L53
            goto L5f
        L48:
            au.com.woolworths.android.onesite.network.NoConnectivityException r7 = new au.com.woolworths.android.onesite.network.NoConnectivityException     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21
            r7.<init>()     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21
            throw r7     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L21
        L4e:
            timber.log.Timber$Forest r5 = timber.log.Timber.f27013a
            r5.p(r7)
        L53:
            if (r1 != 0) goto L60
            r6.p = r3
            r6.q = r4
            java.lang.Object r7 = au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor.a(r2, r6)
            if (r7 != r0) goto L60
        L5f:
            return r0
        L60:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$onUserLogin$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
