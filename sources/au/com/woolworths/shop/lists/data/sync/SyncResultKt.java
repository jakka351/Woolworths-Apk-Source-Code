package au.com.woolworths.shop.lists.data.sync;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SyncResultKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlin.jvm.functions.Function1 r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof au.com.woolworths.shop.lists.data.sync.SyncResultKt$wrapSyncExceptions$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.shop.lists.data.sync.SyncResultKt$wrapSyncExceptions$1 r0 = (au.com.woolworths.shop.lists.data.sync.SyncResultKt$wrapSyncExceptions$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.sync.SyncResultKt$wrapSyncExceptions$1 r0 = new au.com.woolworths.shop.lists.data.sync.SyncResultKt$wrapSyncExceptions$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L3c au.com.woolworths.android.onesite.network.NoConnectivityException -> L43
            return r5
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.ResultKt.b(r5)
            r0.q = r3     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L3c au.com.woolworths.android.onesite.network.NoConnectivityException -> L43
            java.lang.Object r4 = r4.invoke(r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L3c au.com.woolworths.android.onesite.network.NoConnectivityException -> L43
            if (r4 != r1) goto L3b
            return r1
        L3b:
            return r4
        L3c:
            r4 = move-exception
            timber.log.Timber$Forest r5 = timber.log.Timber.f27013a
            r5.p(r4)
            goto L49
        L43:
            r4 = move-exception
            timber.log.Timber$Forest r5 = timber.log.Timber.f27013a
            r5.p(r4)
        L49:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.sync.SyncResultKt.a(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
