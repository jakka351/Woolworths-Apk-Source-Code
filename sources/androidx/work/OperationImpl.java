package androidx.work;

import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/OperationImpl;", "Landroidx/work/Operation;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OperationImpl implements Operation {
    public final ListenableFuture c;

    public OperationImpl(MutableLiveData mutableLiveData, ListenableFuture listenableFuture) {
        this.c = listenableFuture;
    }
}
