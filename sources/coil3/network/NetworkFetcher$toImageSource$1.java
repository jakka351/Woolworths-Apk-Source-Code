package coil3.network;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okio.Buffer;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {244}, m = "toImageSource")
/* loaded from: classes4.dex */
final class NetworkFetcher$toImageSource$1 extends ContinuationImpl {
    public NetworkFetcher p;
    public Buffer q;
    public /* synthetic */ Object r;
    public final /* synthetic */ NetworkFetcher s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$toImageSource$1(NetworkFetcher networkFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return NetworkFetcher.b(this.s, null, this);
    }
}
