package com.xwray.groupie.databinding;

import android.view.View;
import androidx.camera.core.impl.b;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xwray.groupie.Item;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class BindableItem<T extends ViewDataBinding> extends Item<GroupieViewHolder<T>> {
    @Override // com.xwray.groupie.Item
    public final void b(com.xwray.groupie.GroupieViewHolder groupieViewHolder) {
        throw new RuntimeException("Doesn't get called");
    }

    @Override // com.xwray.groupie.Item
    public final void c(com.xwray.groupie.GroupieViewHolder groupieViewHolder, int i) {
        i(((GroupieViewHolder) groupieViewHolder).c);
    }

    @Override // com.xwray.groupie.Item
    public final void f(com.xwray.groupie.GroupieViewHolder groupieViewHolder, int i, List list) {
        GroupieViewHolder groupieViewHolder2 = (GroupieViewHolder) groupieViewHolder;
        groupieViewHolder2.f23758a = this;
        c(groupieViewHolder2, i);
        groupieViewHolder2.c.l();
    }

    @Override // com.xwray.groupie.Item
    public final com.xwray.groupie.GroupieViewHolder g(View view) {
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ViewDataBinding viewDataBindingM = ViewDataBinding.m(view);
        if (viewDataBindingM == null) {
            Object tag = view.getTag();
            if (!(tag instanceof String)) {
                throw new IllegalArgumentException("View is not a binding layout");
            }
            DataBinderMapperImpl dataBinderMapperImpl2 = DataBindingUtil.f2545a;
            int iD = dataBinderMapperImpl2.d((String) tag);
            if (iD == 0) {
                throw new IllegalArgumentException(b.m(tag, "View is not a binding layout. Tag: "));
            }
            viewDataBindingM = dataBinderMapperImpl2.b(null, view, iD);
        }
        return new GroupieViewHolder(viewDataBindingM);
    }

    public abstract void i(ViewDataBinding viewDataBinding);
}
