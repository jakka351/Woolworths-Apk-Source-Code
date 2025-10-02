package coil3.network.okhttp.internal;

import coil3.network.NetworkRequest;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.Request;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.network.okhttp.internal.UtilsKt", f = "utils.kt", l = {32}, m = "toRequest")
/* loaded from: classes.dex */
final class UtilsKt$toRequest$1 extends ContinuationImpl {
    public NetworkRequest p;
    public Request.Builder q;
    public Request.Builder r;
    public String s;
    public /* synthetic */ Object t;
    public int u;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return UtilsKt.b(null, this);
    }
}
