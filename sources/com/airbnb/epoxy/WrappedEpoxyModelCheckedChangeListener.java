package com.airbnb.epoxy;

import android.widget.CompoundButton;
import com.airbnb.epoxy.EpoxyModel;

/* loaded from: classes4.dex */
public class WrappedEpoxyModelCheckedChangeListener<T extends EpoxyModel<?>, V> implements CompoundButton.OnCheckedChangeListener {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WrappedEpoxyModelCheckedChangeListener) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCheckedChanged(android.widget.CompoundButton r3, boolean r4) {
        /*
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r4 = com.airbnb.epoxy.ListenersUtils.a(r3)
            r0 = 0
            if (r4 != 0) goto L8
            goto L1b
        L8:
            android.view.View r3 = r4.F(r3)
            if (r3 != 0) goto L10
            r3 = r0
            goto L14
        L10:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r4.O(r3)
        L14:
            if (r3 != 0) goto L17
            goto L1b
        L17:
            boolean r4 = r3 instanceof com.airbnb.epoxy.EpoxyViewHolder
            if (r4 != 0) goto L1d
        L1b:
            r3 = r0
            goto L1f
        L1d:
            com.airbnb.epoxy.EpoxyViewHolder r3 = (com.airbnb.epoxy.EpoxyViewHolder) r3
        L1f:
            if (r3 != 0) goto L22
            goto L29
        L22:
            int r4 = r3.getAdapterPosition()
            r1 = -1
            if (r4 != r1) goto L2a
        L29:
            return
        L2a:
            r3.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.WrappedEpoxyModelCheckedChangeListener.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
