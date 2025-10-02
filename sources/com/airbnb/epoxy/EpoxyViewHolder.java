package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewParent;
import androidx.camera.core.impl.b;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ViewHolderState;
import java.util.List;

/* loaded from: classes4.dex */
public class EpoxyViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public EpoxyModel f13318a;
    public List b;
    public EpoxyHolder c;
    public final ViewHolderState.ViewState d;
    public ViewParent e;

    public EpoxyViewHolder(ViewParent viewParent, View view, boolean z) {
        super(view);
        this.e = viewParent;
        if (z) {
            ViewHolderState.ViewState viewState = new ViewHolderState.ViewState();
            this.d = viewState;
            View view2 = this.itemView;
            int id = view2.getId();
            if (view2.getId() == -1) {
                view2.setId(com.woolworths.R.id.view_model_state_saving_id);
            }
            view2.saveHierarchyState(viewState);
            view2.setId(id);
        }
    }

    public final void c() {
        if (this.f13318a == null) {
            throw new IllegalStateException("This holder is not currently bound.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(EpoxyModel epoxyModel, EpoxyModel epoxyModel2, List list, int i) {
        this.b = list;
        if (this.c == null && (epoxyModel instanceof EpoxyModelWithHolder)) {
            EpoxyHolder epoxyHolderD = ((EpoxyModelWithHolder) epoxyModel).D(this.e);
            this.c = epoxyHolderD;
            epoxyHolderD.a(this.itemView);
        }
        this.e = null;
        if (epoxyModel instanceof GeneratedModel) {
            ((GeneratedModel) epoxyModel).b(i, e());
        }
        epoxyModel.getClass();
        if (epoxyModel2 != null) {
            epoxyModel.g(epoxyModel2, e());
        } else if (list.isEmpty()) {
            epoxyModel.h(e());
        } else {
            epoxyModel.i(e(), list);
        }
        if (epoxyModel instanceof GeneratedModel) {
            ((GeneratedModel) epoxyModel).a(i, e());
        }
        this.f13318a = epoxyModel;
    }

    public final Object e() {
        EpoxyHolder epoxyHolder = this.c;
        return epoxyHolder != null ? epoxyHolder : this.itemView;
    }

    public final void f(int i) {
        c();
        this.f13318a.x(i, e());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ViewHolder
    public final String toString() {
        StringBuilder sb = new StringBuilder("EpoxyViewHolder{epoxyModel=");
        sb.append(this.f13318a);
        sb.append(", view=");
        sb.append(this.itemView);
        sb.append(", super=");
        return b.r(sb, super.toString(), '}');
    }
}
