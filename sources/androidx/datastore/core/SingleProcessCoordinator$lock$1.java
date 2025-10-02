package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {66, 41}, m = "lock")
/* loaded from: classes.dex */
final class SingleProcessCoordinator$lock$1<T> extends ContinuationImpl {
    public Object p;
    public MutexImpl q;
    public /* synthetic */ Object r;
    public final /* synthetic */ SingleProcessCoordinator s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessCoordinator$lock$1(SingleProcessCoordinator singleProcessCoordinator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = singleProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.c(null, this);
    }
}
