package com.airbnb.epoxy;

import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.AsyncEpoxyDiffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class EpoxyControllerAdapter extends BaseEpoxyAdapter implements AsyncEpoxyDiffer.ResultCallback {
    public static final DiffUtil.ItemCallback q = new AnonymousClass1();
    public final NotifyBlocker l;
    public final AsyncEpoxyDiffer m;
    public final EpoxyController n;
    public int o;
    public final ArrayList p;

    /* renamed from: com.airbnb.epoxy.EpoxyControllerAdapter$1, reason: invalid class name */
    public class AnonymousClass1 extends DiffUtil.ItemCallback<EpoxyModel<?>> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final boolean a(Object obj, Object obj2) {
            return ((EpoxyModel) obj).equals((EpoxyModel) obj2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final boolean b(Object obj, Object obj2) {
            return ((EpoxyModel) obj).d == ((EpoxyModel) obj2).d;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final Object c(Object obj, Object obj2) {
            return new DiffPayload((EpoxyModel) obj);
        }
    }

    public EpoxyControllerAdapter(EpoxyController epoxyController, Handler handler) {
        NotifyBlocker notifyBlocker = new NotifyBlocker();
        this.l = notifyBlocker;
        this.p = new ArrayList();
        this.n = epoxyController;
        this.m = new AsyncEpoxyDiffer(handler, this);
        D(notifyBlocker);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public final BoundViewHolders G() {
        return this.i;
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public final List H() {
        return this.m.f;
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public final boolean J(int i) {
        return this.n.isStickyHeader(i);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public final void L(RuntimeException runtimeException) {
        this.n.onExceptionSwallowed(runtimeException);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public final void M(EpoxyViewHolder epoxyViewHolder, EpoxyModel epoxyModel) {
        this.n.onModelUnbound(epoxyViewHolder, epoxyModel);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void A(EpoxyViewHolder epoxyViewHolder) {
        super.A(epoxyViewHolder);
        epoxyViewHolder.c();
        this.n.onViewAttachedToWindow(epoxyViewHolder, epoxyViewHolder.f13318a);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void B(EpoxyViewHolder epoxyViewHolder) {
        super.B(epoxyViewHolder);
        epoxyViewHolder.c();
        this.n.onViewDetachedFromWindow(epoxyViewHolder, epoxyViewHolder.f13318a);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public final void P(View view) {
        this.n.setupStickyHeaderView(view);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public final void Q(View view) {
        this.n.teardownStickyHeaderView(view);
    }

    public final List R() {
        return this.m.f;
    }

    public final EpoxyModel S(int i) {
        return (EpoxyModel) this.m.f.get(i);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return this.o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void u(RecyclerView recyclerView) {
        this.n.onAttachedToRecyclerViewInternal(recyclerView);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void y(RecyclerView recyclerView) {
        super.y(recyclerView);
        this.n.onDetachedFromRecyclerViewInternal(recyclerView);
    }
}
