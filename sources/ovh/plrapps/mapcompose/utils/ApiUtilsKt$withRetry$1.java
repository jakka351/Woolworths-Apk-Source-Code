package ovh.plrapps.mapcompose.utils;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.utils.ApiUtilsKt", f = "ApiUtils.kt", l = {7, 9, 10}, m = "withRetry")
/* loaded from: classes8.dex */
final class ApiUtilsKt$withRetry$1 extends ContinuationImpl {
    public int p;
    public int q;
    public long r;
    public Function1 s;
    public /* synthetic */ Object t;
    public int u;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return ApiUtilsKt.a(0, 0L, null, this);
    }
}
