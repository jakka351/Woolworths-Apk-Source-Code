package androidx.datastore.core;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {62, 87}, m = "tryLock")
/* loaded from: classes2.dex */
final class MultiProcessCoordinator$tryLock$1<T> extends ContinuationImpl {
    public MutexImpl p;
    public FileInputStream q;
    public FileLock r;
    public boolean s;
    public /* synthetic */ Object t;
    public final /* synthetic */ MultiProcessCoordinator u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$tryLock$1(MultiProcessCoordinator multiProcessCoordinator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = multiProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.d(null, this);
    }
}
