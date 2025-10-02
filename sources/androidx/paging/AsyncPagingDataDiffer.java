package androidx.paging;

import androidx.recyclerview.widget.DiffUtil;
import com.airbnb.epoxy.paging3.PagedDataModelCache$updateCallback$1;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/AsyncPagingDataDiffer;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AsyncPagingDataDiffer<T> {

    /* renamed from: a, reason: collision with root package name */
    public final DiffUtil.ItemCallback f3527a;
    public final PagedDataModelCache$updateCallback$1 b;
    public final HandlerContext c;
    public int e;
    public final AsyncPagingDataDiffer$presenter$1 g;
    public final AtomicInteger h;
    public final Flow i;
    public final Flow j;
    public final AtomicReference k;
    public final CopyOnWriteArrayList l;
    public final Function1 m;
    public final Lazy n;
    public final AsyncPagingDataDiffer$LoadStateListenerRunnable$1 o;
    public final MutableStateFlow d = StateFlowKt.a(Boolean.FALSE);
    public final AtomicReference f = new AtomicReference(null);

    public AsyncPagingDataDiffer(DiffUtil.ItemCallback itemCallback, PagedDataModelCache$updateCallback$1 pagedDataModelCache$updateCallback$1, HandlerContext handlerContext, HandlerContext handlerContext2) {
        this.f3527a = itemCallback;
        this.b = pagedDataModelCache$updateCallback$1;
        this.c = handlerContext2;
        AsyncPagingDataDiffer$presenter$1 asyncPagingDataDiffer$presenter$1 = new AsyncPagingDataDiffer$presenter$1(this, handlerContext);
        this.g = asyncPagingDataDiffer$presenter$1;
        this.h = new AtomicInteger(0);
        Flow flowB = FlowKt.B(new AsyncPagingDataDiffer$special$$inlined$transform$1(FlowKt.c(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(asyncPagingDataDiffer$presenter$1.k), -1), null, this));
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.i = FlowKt.D(flowB, MainDispatcherLoader.f24726a);
        this.j = FlowKt.a(asyncPagingDataDiffer$presenter$1.l);
        this.k = new AtomicReference(null);
        this.l = new CopyOnWriteArrayList();
        this.m = new AsyncPagingDataDiffer$internalLoadStateListener$1(this);
        this.n = LazyKt.b(AsyncPagingDataDiffer$LoadStateListenerHandler$2.h);
        this.o = new AsyncPagingDataDiffer$LoadStateListenerRunnable$1(this);
    }

    public final void a(Function1 function1) {
        AtomicReference atomicReference = this.k;
        if (atomicReference.get() == null) {
            Function1 listener = this.m;
            Intrinsics.h(listener, "listener");
            atomicReference.set(listener);
            AsyncPagingDataDiffer$presenter$1 asyncPagingDataDiffer$presenter$1 = this.g;
            asyncPagingDataDiffer$presenter$1.getClass();
            MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection = asyncPagingDataDiffer$presenter$1.e;
            mutableCombinedLoadStateCollection.getClass();
            mutableCombinedLoadStateCollection.f3549a.add(listener);
            CombinedLoadStates combinedLoadStates = (CombinedLoadStates) mutableCombinedLoadStateCollection.b.getValue();
            if (combinedLoadStates != null) {
                ((AsyncPagingDataDiffer$internalLoadStateListener$1) listener).invoke(combinedLoadStates);
            }
        }
        this.l.add(function1);
    }

    public final ItemSnapshotList b() {
        PlaceholderPaddedList placeholderPaddedList = (PlaceholderPaddedList) this.f.get();
        if (placeholderPaddedList == null) {
            return this.g.e();
        }
        int i = placeholderPaddedList.getE() - 1;
        ArrayList arrayList = new ArrayList();
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                arrayList.add(placeholderPaddedList.getItem(i2));
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return new ItemSnapshotList(placeholderPaddedList.getF(), placeholderPaddedList.getG(), arrayList);
    }
}
