package au.com.woolworths.feature.shop.instore.presence.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.storelocator.network.StoreLocatorApiInterface;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/presence/data/InstorePresenceRepository;", "", "instore-presence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InstorePresenceRepository {

    /* renamed from: a, reason: collision with root package name */
    public final StoreLocatorApiInterface f7440a;

    public InstorePresenceRepository(StoreLocatorApiInterface storeLocatorApiInterface) {
        this.f7440a = storeLocatorApiInterface;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.instore.presence.data.InstorePresenceRepository$getStoreDetail$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.instore.presence.data.InstorePresenceRepository$getStoreDetail$1 r0 = (au.com.woolworths.feature.shop.instore.presence.data.InstorePresenceRepository$getStoreDetail$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.instore.presence.data.InstorePresenceRepository$getStoreDetail$1 r0 = new au.com.woolworths.feature.shop.instore.presence.data.InstorePresenceRepository$getStoreDetail$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.foundation.shop.storelocator.network.StoreLocatorApiInterface r6 = r4.f7440a
            r2 = 0
            io.reactivex.Single r5 = r6.c(r5, r2, r2)
            r0.r = r3
            java.lang.Object r6 = kotlinx.coroutines.rx2.RxAwaitKt.b(r5, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.g(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.presence.data.InstorePresenceRepository.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
