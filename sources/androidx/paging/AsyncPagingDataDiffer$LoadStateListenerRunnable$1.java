package androidx.paging;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1", "Ljava/lang/Runnable;", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AsyncPagingDataDiffer$LoadStateListenerRunnable$1 implements Runnable {
    public final AtomicReference d = new AtomicReference(null);
    public final /* synthetic */ AsyncPagingDataDiffer e;

    public AsyncPagingDataDiffer$LoadStateListenerRunnable$1(AsyncPagingDataDiffer asyncPagingDataDiffer) {
        this.e = asyncPagingDataDiffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) this.d.get();
        if (combinedLoadStates != null) {
            Iterator it = this.e.l.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(combinedLoadStates);
            }
        }
    }
}
