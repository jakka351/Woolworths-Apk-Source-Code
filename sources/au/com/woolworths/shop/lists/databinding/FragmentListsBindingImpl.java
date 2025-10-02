package au.com.woolworths.shop.lists.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.shop.lists.ShoppingListsFeature;
import au.com.woolworths.shop.lists.ui.lists.ListsViewModel;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class FragmentListsBindingImpl extends FragmentListsBinding {
    public static final ViewDataBinding.IncludedLayouts D;
    public static final SparseIntArray E;
    public long C;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        D = includedLayouts;
        includedLayouts.a(0, new int[]{2}, new int[]{R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.lists_view_pager, 3);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (156 != i) {
            return false;
        }
        L((ListsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.lists.databinding.FragmentListsBinding
    public final void L(ListsViewModel listsViewModel) throws Throwable {
        this.B = listsViewModel;
        synchronized (this) {
            this.C |= 2;
        }
        h(156);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        ListsViewModel listsViewModel = this.B;
        long j2 = j & 6;
        boolean z = false;
        if (j2 != 0 && listsViewModel != null && listsViewModel.l.b() != Region.j && !listsViewModel.k.c(ShoppingListsFeature.g)) {
            z = true;
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.y, z);
        }
        this.A.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.C != 0) {
                    return true;
                }
                return this.A.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.C = 4L;
        }
        this.A.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }
}
