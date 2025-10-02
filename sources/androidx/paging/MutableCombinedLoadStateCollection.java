package androidx.paging;

import androidx.paging.LoadState;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/MutableCombinedLoadStateCollection;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MutableCombinedLoadStateCollection {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f3549a = new CopyOnWriteArrayList();
    public final MutableStateFlow b;
    public final StateFlow c;

    public MutableCombinedLoadStateCollection() {
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.b = mutableStateFlowA;
        this.c = FlowKt.b(mutableStateFlowA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [androidx.paging.LoadState] */
    public static final CombinedLoadStates a(MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection, CombinedLoadStates combinedLoadStates, LoadStates loadStates, LoadStates loadStates2) {
        LoadState loadState;
        LoadState loadState2;
        ?? r11;
        mutableCombinedLoadStateCollection.getClass();
        LoadState.NotLoading notLoading = LoadState.NotLoading.c;
        if (combinedLoadStates == null || (loadState = combinedLoadStates.f3529a) == null) {
            loadState = notLoading;
        }
        LoadState loadState3 = loadStates.f3547a;
        LoadState loadStateB = b(loadState, loadState3, loadState3, loadStates2 != null ? loadStates2.f3547a : null);
        if (combinedLoadStates == null || (loadState2 = combinedLoadStates.b) == null) {
            loadState2 = notLoading;
        }
        LoadState loadStateB2 = b(loadState2, loadState3, loadStates.b, loadStates2 != null ? loadStates2.b : null);
        if (combinedLoadStates != null && (r11 = combinedLoadStates.c) != 0) {
            notLoading = r11;
        }
        return new CombinedLoadStates(loadStateB, loadStateB2, b(notLoading, loadState3, loadStates.c, loadStates2 != null ? loadStates2.c : null), loadStates, loadStates2);
    }

    public static LoadState b(LoadState loadState, LoadState loadState2, LoadState loadState3, LoadState loadState4) {
        return loadState4 == null ? loadState3 : loadState instanceof LoadState.Loading ? (((loadState2 instanceof LoadState.NotLoading) && (loadState4 instanceof LoadState.NotLoading)) || (loadState4 instanceof LoadState.Error)) ? loadState4 : loadState : loadState4;
    }

    public final void c(Function1 function1) {
        MutableStateFlow mutableStateFlow;
        Object value;
        CombinedLoadStates combinedLoadStates;
        do {
            mutableStateFlow = this.b;
            value = mutableStateFlow.getValue();
            CombinedLoadStates combinedLoadStates2 = (CombinedLoadStates) value;
            combinedLoadStates = (CombinedLoadStates) function1.invoke(combinedLoadStates2);
            if (Intrinsics.c(combinedLoadStates2, combinedLoadStates)) {
                return;
            }
        } while (!mutableStateFlow.d(value, combinedLoadStates));
        if (combinedLoadStates != null) {
            Iterator it = this.f3549a.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(combinedLoadStates);
            }
        }
    }

    public final void d(final LoadStates sourceLoadStates, final LoadStates loadStates) {
        Intrinsics.h(sourceLoadStates, "sourceLoadStates");
        c(new Function1<CombinedLoadStates, CombinedLoadStates>() { // from class: androidx.paging.MutableCombinedLoadStateCollection$set$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                LoadStates loadStates2 = sourceLoadStates;
                LoadStates loadStates3 = loadStates;
                return MutableCombinedLoadStateCollection.a(this.h, (CombinedLoadStates) obj, loadStates2, loadStates3);
            }
        });
    }
}
