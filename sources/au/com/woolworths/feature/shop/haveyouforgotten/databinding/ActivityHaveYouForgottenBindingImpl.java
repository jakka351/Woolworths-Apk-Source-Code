package au.com.woolworths.feature.shop.haveyouforgotten.databinding;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.utils.ScrimUtil;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityHaveYouForgottenBindingImpl extends ActivityHaveYouForgottenBinding {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.fragment_container, 4);
        sparseIntArray.put(R.id.footer_container, 5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        if (273 != i) {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        if ((j & 2) != 0) {
            View view = this.A;
            ScrimUtil.a(view, 80, new ColorDrawable(ViewDataBinding.n(R.color.color_scrim_shadow, view)));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.C = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
