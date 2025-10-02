package coil3.network.okhttp.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.Call;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", f = "utils.kt", l = {24, 24, 25}, m = "executeRequest-impl")
/* loaded from: classes.dex */
final class CallFactoryNetworkClient$executeRequest$1<T> extends ContinuationImpl {
    public Object p;
    public Call.Factory q;
    public /* synthetic */ Object r;
    public int s;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return CallFactoryNetworkClient.b(null, null, null, this);
    }
}
