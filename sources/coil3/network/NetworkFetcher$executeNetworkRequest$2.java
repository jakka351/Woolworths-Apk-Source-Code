package coil3.network;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "response", "Lcoil3/network/NetworkResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", f = "NetworkFetcher.kt", l = {204}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NetworkFetcher$executeNetworkRequest$2 extends SuspendLambda implements Function2<NetworkResponse, Continuation<Object>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ SuspendLambda r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NetworkFetcher$executeNetworkRequest$2(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.r = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkFetcher$executeNetworkRequest$2 networkFetcher$executeNetworkRequest$2 = new NetworkFetcher$executeNetworkRequest$2(this.r, continuation);
        networkFetcher$executeNetworkRequest$2.q = obj;
        return networkFetcher$executeNetworkRequest$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkFetcher$executeNetworkRequest$2) create((NetworkResponse) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        NetworkResponse networkResponse = (NetworkResponse) this.q;
        int i2 = networkResponse.f13131a;
        if ((200 > i2 || i2 >= 300) && i2 != 304) {
            throw new HttpException(networkResponse);
        }
        this.p = 1;
        Object objInvoke = this.r.invoke(networkResponse, this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }
}
