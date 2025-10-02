package com.woolworths.scanlibrary.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class ActivityWeightedArticleSelectionBinding extends ViewDataBinding {
    public final ContentWeightedArticleSelectionBinding y;
    public final LayoutDarkToolbarBinding z;

    public ActivityWeightedArticleSelectionBinding(DataBindingComponent dataBindingComponent, View view, ContentWeightedArticleSelectionBinding contentWeightedArticleSelectionBinding, LayoutDarkToolbarBinding layoutDarkToolbarBinding) {
        super(dataBindingComponent, view, 2);
        this.y = contentWeightedArticleSelectionBinding;
        this.z = layoutDarkToolbarBinding;
    }
}
