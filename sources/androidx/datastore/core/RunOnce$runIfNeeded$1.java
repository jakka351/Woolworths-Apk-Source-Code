package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
/* loaded from: classes.dex */
final class RunOnce$runIfNeeded$1 extends ContinuationImpl {
    public RunOnce p;
    public Mutex q;
    public /* synthetic */ Object r;
    public final /* synthetic */ RunOnce s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunOnce$runIfNeeded$1(RunOnce runOnce, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = runOnce;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(this);
    }
}
