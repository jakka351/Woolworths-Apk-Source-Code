package au.com.woolworths.feature.shop.instore.presence.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.presence.data.InstorePresenceRepository", f = "InstorePresenceRepository.kt", l = {15}, m = "getStoreDetail")
/* loaded from: classes3.dex */
final class InstorePresenceRepository$getStoreDetail$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ InstorePresenceRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstorePresenceRepository$getStoreDetail$1(InstorePresenceRepository instorePresenceRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = instorePresenceRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
