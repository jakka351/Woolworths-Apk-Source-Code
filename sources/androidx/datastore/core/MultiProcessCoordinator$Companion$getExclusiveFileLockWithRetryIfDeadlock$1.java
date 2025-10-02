package androidx.datastore.core;

import androidx.datastore.core.MultiProcessCoordinator;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$Companion", f = "MultiProcessCoordinator.android.kt", l = {182}, m = "getExclusiveFileLockWithRetryIfDeadlock")
/* loaded from: classes.dex */
final class MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 extends ContinuationImpl {
    public FileOutputStream p;
    public long q;
    public /* synthetic */ Object r;
    public int s;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return MultiProcessCoordinator.Companion.a(null, this);
    }
}
