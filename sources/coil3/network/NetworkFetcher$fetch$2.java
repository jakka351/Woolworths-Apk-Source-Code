package coil3.network;

import coil3.decode.DataSource;
import coil3.decode.ImageSource;
import coil3.fetch.SourceFetchResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcoil3/fetch/SourceFetchResult;", "response", "Lcoil3/network/NetworkResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.network.NetworkFetcher$fetch$2", f = "NetworkFetcher.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NetworkFetcher$fetch$2 extends SuspendLambda implements Function2<NetworkResponse, Continuation<? super SourceFetchResult>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ NetworkFetcher r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$2(NetworkFetcher networkFetcher, Continuation continuation) {
        super(2, continuation);
        this.r = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(this.r, continuation);
        networkFetcher$fetch$2.q = obj;
        return networkFetcher$fetch$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkFetcher$fetch$2) create((NetworkResponse) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NetworkResponse networkResponse;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        NetworkFetcher networkFetcher = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            NetworkResponse networkResponse2 = (NetworkResponse) this.q;
            NetworkResponseBody networkResponseBody = networkResponse2.e;
            if (networkResponseBody == null) {
                throw new IllegalStateException("body == null");
            }
            this.q = networkResponse2;
            this.p = 1;
            Object objB = NetworkFetcher.b(networkFetcher, networkResponseBody, this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            networkResponse = networkResponse2;
            obj = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            networkResponse = (NetworkResponse) this.q;
            ResultKt.b(obj);
        }
        return new SourceFetchResult((ImageSource) obj, NetworkFetcher.f(networkFetcher.f13126a, networkResponse.d.a()), DataSource.g);
    }
}
