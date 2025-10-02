package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import au.com.woolworths.feature.shop.catalogue.productlist.ItemStateDiffUtilCallback;

/* loaded from: classes2.dex */
public abstract class ListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public final AsyncListDiffer g;
    public final AsyncListDiffer.ListListener h;

    /* renamed from: androidx.recyclerview.widget.ListAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements AsyncListDiffer.ListListener<T> {
        @Override // androidx.recyclerview.widget.AsyncListDiffer.ListListener
        public final void a() {
        }
    }

    public ListAdapter(ItemStateDiffUtilCallback itemStateDiffUtilCallback) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.h = anonymousClass1;
        AsyncListDiffer asyncListDiffer = new AsyncListDiffer(new AdapterListUpdateCallback(this), new AsyncDifferConfig.Builder(itemStateDiffUtilCallback).a());
        this.g = asyncListDiffer;
        asyncListDiffer.d.add(anonymousClass1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return this.g.f.size();
    }
}
