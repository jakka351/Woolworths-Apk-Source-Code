package com.airbnb.epoxy;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyModel;

/* loaded from: classes4.dex */
public abstract class EpoxyModelTouchCallback<T extends EpoxyModel> extends EpoxyTouchHelperCallback implements EpoxyDragCallback<T>, EpoxySwipeCallback<T> {
    public final EpoxyController d;
    public EpoxyViewHolder e;
    public EpoxyViewHolder f;

    public EpoxyModelTouchCallback(EpoxyController epoxyController) {
        this.f3672a = -1;
        this.d = epoxyController;
    }

    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    public final void j(final RecyclerView recyclerView, EpoxyViewHolder epoxyViewHolder) {
        super.j(recyclerView, epoxyViewHolder);
        epoxyViewHolder.c();
        p();
        recyclerView.postDelayed(new Runnable() { // from class: com.airbnb.epoxy.EpoxyModelTouchCallback.1
            @Override // java.lang.Runnable
            public final void run() {
                EpoxyModelTouchCallback.this.getClass();
                recyclerView.setTag(com.woolworths.R.id.epoxy_touch_helper_selection_status, null);
            }
        }, 300L);
    }

    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    public final int l(RecyclerView recyclerView, EpoxyViewHolder epoxyViewHolder) {
        epoxyViewHolder.c();
        EpoxyModel epoxyModel = epoxyViewHolder.f13318a;
        if ((this.e == null && this.f == null && recyclerView.getTag(com.woolworths.R.id.epoxy_touch_helper_selection_status) != null) || !q(epoxyModel)) {
            return 0;
        }
        epoxyViewHolder.getAdapterPosition();
        return a(epoxyModel);
    }

    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    public void n(Canvas canvas, RecyclerView recyclerView, EpoxyViewHolder epoxyViewHolder, float f, float f2, int i, boolean z) {
        super.n(canvas, recyclerView, epoxyViewHolder, f, f2, i, z);
        try {
            epoxyViewHolder.c();
            EpoxyModel epoxyModel = epoxyViewHolder.f13318a;
            if (!q(epoxyModel)) {
                throw new IllegalStateException("A model was selected that is not a valid target: " + epoxyModel.getClass());
            }
            View view = epoxyViewHolder.itemView;
            Math.max(-1.0f, Math.min(1.0f, Math.abs(f) > Math.abs(f2) ? f / view.getWidth() : f2 / view.getHeight()));
            v();
        } catch (IllegalStateException unused) {
        }
    }

    public void p() {
    }

    public boolean q(EpoxyModel epoxyModel) {
        return EpoxyModel.class.isInstance(epoxyModel);
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u(EpoxyModel epoxyModel, View view) {
    }

    public void v() {
    }

    public void w() {
    }

    public void x() {
    }
}
