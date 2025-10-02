package com.airbnb.epoxy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class DataBindingEpoxyModel extends EpoxyModelWithHolder<DataBindingHolder> {

    public static class DataBindingHolder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public ViewDataBinding f13309a;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View view) {
            this.f13309a = (ViewDataBinding) view.getTag();
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: C */
    public final void h(EpoxyHolder epoxyHolder) {
        DataBindingHolder dataBindingHolder = (DataBindingHolder) epoxyHolder;
        J(dataBindingHolder.f13309a);
        dataBindingHolder.f13309a.l();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final EpoxyHolder D(ViewParent viewParent) {
        return new DataBindingHolder();
    }

    public abstract void J(ViewDataBinding viewDataBinding);

    public void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        J(viewDataBinding);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void A(DataBindingHolder dataBindingHolder) {
        dataBindingHolder.f13309a.H();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void e(EpoxyHolder epoxyHolder, EpoxyModel epoxyModel) {
        DataBindingHolder dataBindingHolder = (DataBindingHolder) epoxyHolder;
        K(dataBindingHolder.f13309a, epoxyModel);
        dataBindingHolder.f13309a.l();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void f(EpoxyHolder epoxyHolder, List list) {
        DataBindingHolder dataBindingHolder = (DataBindingHolder) epoxyHolder;
        J(dataBindingHolder.f13309a);
        dataBindingHolder.f13309a.l();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void g(EpoxyModel epoxyModel, Object obj) {
        DataBindingHolder dataBindingHolder = (DataBindingHolder) obj;
        K(dataBindingHolder.f13309a, epoxyModel);
        dataBindingHolder.f13309a.l();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) {
        DataBindingHolder dataBindingHolder = (DataBindingHolder) obj;
        J(dataBindingHolder.f13309a);
        dataBindingHolder.f13309a.l();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void i(Object obj, List list) {
        DataBindingHolder dataBindingHolder = (DataBindingHolder) obj;
        J(dataBindingHolder.f13309a);
        dataBindingHolder.f13309a.l();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        ViewDataBinding viewDataBindingC = DataBindingUtil.c(LayoutInflater.from(viewGroup.getContext()), l(), viewGroup, false, null);
        View view = viewDataBindingC.h;
        view.setTag(viewDataBindingC);
        return view;
    }
}
