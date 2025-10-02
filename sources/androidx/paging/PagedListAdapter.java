package androidx.paging;

import androidx.paging.AsyncPagedListDiffer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Deprecated
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/PagedListAdapter;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PagedListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public final AsyncPagedListDiffer g;
    public final Function2 h;

    public PagedListAdapter() {
        Function2<PagedList<Object>, PagedList<Object>, Unit> function2 = new Function2<PagedList<Object>, PagedList<Object>, Unit>() { // from class: androidx.paging.PagedListAdapter$listener$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                this.h.getClass();
                return Unit.f24250a;
            }
        };
        this.h = function2;
        AsyncPagedListDiffer asyncPagedListDiffer = new AsyncPagedListDiffer(this);
        this.g = asyncPagedListDiffer;
        asyncPagedListDiffer.d.add(new AsyncPagedListDiffer.OnCurrentListChangedWrapper(function2));
    }

    public final Object G(int i) {
        AsyncPagedListDiffer asyncPagedListDiffer = this.g;
        PagedList pagedList = asyncPagedListDiffer.f;
        PagedList pagedList2 = asyncPagedListDiffer.e;
        if (pagedList != null) {
            return pagedList.g.get(i);
        }
        if (pagedList2 == null) {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        pagedList2.k(i);
        return pagedList2.g.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int i() {
        return this.g.b();
    }
}
