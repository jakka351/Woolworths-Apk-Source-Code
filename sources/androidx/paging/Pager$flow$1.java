package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class Pager$flow$1 extends FunctionReferenceImpl implements Function1<Continuation<? super PagingSource<Object, Object>>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Continuation continuation) {
        SuspendingPagingSourceFactory suspendingPagingSourceFactory = (SuspendingPagingSourceFactory) this.receiver;
        return BuildersKt.f(suspendingPagingSourceFactory.d, new SuspendingPagingSourceFactory$create$2(suspendingPagingSourceFactory, null), continuation);
    }
}
