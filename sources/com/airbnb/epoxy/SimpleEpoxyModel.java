package com.airbnb.epoxy;

import android.view.View;

/* loaded from: classes4.dex */
public class SimpleEpoxyModel extends EpoxyModel<View> {
    public final int n;
    public final int o = 1;

    public SimpleEpoxyModel(int i) {
        this.n = i;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        ((View) obj).setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleEpoxyModel) || !super.equals(obj)) {
            return false;
        }
        SimpleEpoxyModel simpleEpoxyModel = (SimpleEpoxyModel) obj;
        return this.n == simpleEpoxyModel.n && this.o == simpleEpoxyModel.o;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) {
        View view = (View) obj;
        view.setOnClickListener(null);
        view.setClickable(false);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        return (((super.hashCode() * 31) + this.n) * 961) + this.o;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int k() {
        return this.n;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int m(int i, int i2, int i3) {
        return this.o;
    }
}
