package com.woolworths.scanlibrary.databinding;

import androidx.databinding.ViewDataBinding;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class ActivityWeightedArticleSelectionBindingImpl extends ActivityWeightedArticleSelectionBinding {
    public static final ViewDataBinding.IncludedLayouts B;
    public long A;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        B = includedLayouts;
        includedLayouts.a(0, new int[]{1, 2}, new int[]{R.layout.layout_dark_toolbar, R.layout.content_weighted_article_selection}, new String[]{"layout_dark_toolbar", "content_weighted_article_selection"});
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.A = 0L;
        }
        this.z.k();
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.A != 0) {
                    return true;
                }
                return this.z.p() || this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.A = 4L;
        }
        this.z.r();
        this.y.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.A |= 1;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 2;
        }
        return true;
    }
}
