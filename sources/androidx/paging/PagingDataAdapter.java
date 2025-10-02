package androidx.paging;

import androidx.paging.LoadState;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/PagingDataAdapter;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PagingDataAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/paging/PagingDataAdapter$1", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.paging.PagingDataAdapter$1, reason: invalid class name */
    public final class AnonymousClass1 extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void d(int i, int i2) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/paging/PagingDataAdapter$2", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", "", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.paging.PagingDataAdapter$2, reason: invalid class name */
    public final class AnonymousClass2 implements Function1<CombinedLoadStates, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            CombinedLoadStates loadStates = (CombinedLoadStates) obj;
            Intrinsics.h(loadStates, "loadStates");
            if (loadStates.d.f3547a instanceof LoadState.NotLoading) {
                throw null;
            }
            return Unit.f24250a;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long j(int i) {
        return -1L;
    }
}
