package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ViewHolderState;
import com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class BaseEpoxyAdapter extends RecyclerView.Adapter<EpoxyViewHolder> implements StickyHeaderCallbacks {
    public int g = 1;
    public final ViewTypeManager h = new ViewTypeManager();
    public final BoundViewHolders i = new BoundViewHolders();
    public ViewHolderState j = new ViewHolderState(null);
    public final GridLayoutManager.SpanSizeLookup k;

    public BaseEpoxyAdapter() {
        final EpoxyControllerAdapter epoxyControllerAdapter = (EpoxyControllerAdapter) this;
        GridLayoutManager.SpanSizeLookup spanSizeLookup = new GridLayoutManager.SpanSizeLookup() { // from class: com.airbnb.epoxy.BaseEpoxyAdapter.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public final int c(int i) {
                EpoxyControllerAdapter epoxyControllerAdapter2 = epoxyControllerAdapter;
                try {
                    return epoxyControllerAdapter2.I(i).z(epoxyControllerAdapter2.g, i, epoxyControllerAdapter2.o);
                } catch (IndexOutOfBoundsException e) {
                    epoxyControllerAdapter2.L(e);
                    return 1;
                }
            }
        };
        this.k = spanSizeLookup;
        E(true);
        spanSizeLookup.c = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void C(RecyclerView.ViewHolder viewHolder) {
        EpoxyViewHolder epoxyViewHolder = (EpoxyViewHolder) viewHolder;
        this.j.m(epoxyViewHolder);
        this.i.d.i(epoxyViewHolder.getItemId());
        epoxyViewHolder.c();
        EpoxyModel epoxyModel = epoxyViewHolder.f13318a;
        epoxyViewHolder.c();
        epoxyViewHolder.f13318a.A(epoxyViewHolder.e());
        epoxyViewHolder.f13318a = null;
        M(epoxyViewHolder, epoxyModel);
    }

    public BoundViewHolders G() {
        return this.i;
    }

    public abstract List H();

    public EpoxyModel I(int i) {
        return (EpoxyModel) H().get(i);
    }

    public boolean J(int i) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void w(EpoxyViewHolder epoxyViewHolder, int i, List list) {
        EpoxyModel<?> epoxyModelI = I(i);
        boolean z = this instanceof EpoxyControllerAdapter;
        EpoxyModel<?> epoxyModel = null;
        if (z) {
            long j = j(i);
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DiffPayload diffPayload = (DiffPayload) it.next();
                    EpoxyModel<?> epoxyModel2 = diffPayload.f13311a;
                    if (epoxyModel2 == null) {
                        EpoxyModel<?> epoxyModel3 = (EpoxyModel) diffPayload.b.c(j);
                        if (epoxyModel3 != null) {
                            epoxyModel = epoxyModel3;
                            break;
                        }
                    } else if (epoxyModel2.d == j) {
                        epoxyModel = epoxyModel2;
                        break;
                    }
                }
            }
        }
        epoxyViewHolder.d(epoxyModelI, epoxyModel, list, i);
        if (list.isEmpty()) {
            ViewHolderState viewHolderState = this.j;
            viewHolderState.getClass();
            epoxyViewHolder.c();
            if (epoxyViewHolder.f13318a.y()) {
                ViewHolderState.ViewState viewState = (ViewHolderState.ViewState) viewHolderState.c(epoxyViewHolder.getItemId());
                if (viewState != null) {
                    View view = epoxyViewHolder.itemView;
                    int id = view.getId();
                    if (view.getId() == -1) {
                        view.setId(com.woolworths.R.id.view_model_state_saving_id);
                    }
                    view.restoreHierarchyState(viewState);
                    view.setId(id);
                } else {
                    ViewHolderState.ViewState viewState2 = epoxyViewHolder.d;
                    if (viewState2 != null) {
                        View view2 = epoxyViewHolder.itemView;
                        int id2 = view2.getId();
                        if (view2.getId() == -1) {
                            view2.setId(com.woolworths.R.id.view_model_state_saving_id);
                        }
                        view2.restoreHierarchyState(viewState2);
                        view2.setId(id2);
                    }
                }
            }
        }
        this.i.d.h(epoxyViewHolder.getItemId(), epoxyViewHolder);
        if (z) {
            ((EpoxyControllerAdapter) this).n.onModelBound(epoxyViewHolder, epoxyModelI, i, epoxyModel);
        }
    }

    public void L(RuntimeException runtimeException) {
    }

    public void M(EpoxyViewHolder epoxyViewHolder, EpoxyModel epoxyModel) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: N */
    public void A(EpoxyViewHolder epoxyViewHolder) {
        epoxyViewHolder.c();
        epoxyViewHolder.f13318a.u(epoxyViewHolder.e());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: O */
    public void B(EpoxyViewHolder epoxyViewHolder) {
        epoxyViewHolder.c();
        epoxyViewHolder.f13318a.v(epoxyViewHolder.e());
    }

    public void P(View view) {
    }

    public void Q(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int i() {
        return H().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long j(int i) {
        return ((EpoxyModel) H().get(i)).d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int k(int i) {
        EpoxyModel epoxyModelI = I(i);
        this.h.f13326a = epoxyModelI;
        return ViewTypeManager.a(epoxyModelI);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        w((EpoxyViewHolder) viewHolder, i, Collections.EMPTY_LIST);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        EpoxyModel epoxyModel;
        ViewTypeManager viewTypeManager = this.h;
        EpoxyModel epoxyModel2 = viewTypeManager.f13326a;
        if (epoxyModel2 == null || ViewTypeManager.a(epoxyModel2) != i) {
            L(new IllegalStateException("Last model did not match expected view type"));
            Iterator it = H().iterator();
            while (true) {
                if (it.hasNext()) {
                    EpoxyModel epoxyModel3 = (EpoxyModel) it.next();
                    if (ViewTypeManager.a(epoxyModel3) == i) {
                        epoxyModel = epoxyModel3;
                        break;
                    }
                } else {
                    HiddenEpoxyModel hiddenEpoxyModel = new HiddenEpoxyModel();
                    if (i != hiddenEpoxyModel.l()) {
                        throw new IllegalStateException(YU.a.d(i, "Could not find model for view type: "));
                    }
                    epoxyModel = hiddenEpoxyModel;
                }
            }
        } else {
            epoxyModel = viewTypeManager.f13326a;
        }
        return new EpoxyViewHolder(viewGroup, epoxyModel.j(viewGroup), epoxyModel.y());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void y(RecyclerView recyclerView) {
        this.h.f13326a = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean z(RecyclerView.ViewHolder viewHolder) {
        EpoxyViewHolder epoxyViewHolder = (EpoxyViewHolder) viewHolder;
        epoxyViewHolder.c();
        epoxyViewHolder.f13318a.s(epoxyViewHolder.e());
        return false;
    }
}
