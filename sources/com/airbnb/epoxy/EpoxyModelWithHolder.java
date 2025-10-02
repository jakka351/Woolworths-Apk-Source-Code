package com.airbnb.epoxy;

import android.view.ViewParent;
import com.airbnb.epoxy.EpoxyHolder;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class EpoxyModelWithHolder<T extends EpoxyHolder> extends EpoxyModel<T> {
    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void h(EpoxyHolder epoxyHolder) {
    }

    public abstract EpoxyHolder D(ViewParent viewParent);

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void u(EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void v(EpoxyHolder epoxyHolder) {
    }

    public void G(EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void x(int i, EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void A(EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public /* bridge */ /* synthetic */ void g(EpoxyModel epoxyModel, Object obj) {
        e((EpoxyHolder) obj, epoxyModel);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public /* bridge */ /* synthetic */ void i(Object obj, List list) {
        f((EpoxyHolder) obj, list);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void s(Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
        G((EpoxyHolder) obj);
    }
}
