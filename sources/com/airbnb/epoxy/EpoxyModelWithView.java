package com.airbnb.epoxy;

import android.view.View;

/* loaded from: classes4.dex */
public abstract class EpoxyModelWithView<T extends View> extends EpoxyModel<T> {
    @Override // com.airbnb.epoxy.EpoxyModel
    public final int k() {
        throw new UnsupportedOperationException("Layout resources are unsupported. Views must be created with `buildView`");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int n() {
        return 0;
    }
}
