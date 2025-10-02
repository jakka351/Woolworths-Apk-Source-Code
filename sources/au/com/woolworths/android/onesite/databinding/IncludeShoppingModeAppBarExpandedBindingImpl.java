package au.com.woolworths.android.onesite.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.generated.callback.OnClickListener;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionModeBindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.main.CollectionModeHeaderInterface;
import au.com.woolworths.android.onesite.modules.main.HomepageModeSelectorBadge;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.CollectionModeLabel;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class IncludeShoppingModeAppBarExpandedBindingImpl extends IncludeShoppingModeAppBarExpandedBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts H;
    public static final SparseIntArray I;
    public final ConstraintLayout E;
    public final OnClickListener F;
    public long G;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        H = includedLayouts;
        includedLayouts.a(0, new int[]{3}, new int[]{R.layout.include_brand_label}, new String[]{"include_brand_label"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.change_button_barrier_expanded, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeShoppingModeAppBarExpandedBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, H, I);
        super(view, (TextView) objArrT[2], (TextView) objArrT[1], dataBindingComponent, (IncludeBrandLabelBinding) objArrT[3]);
        this.G = -1L;
        IncludeBrandLabelBinding includeBrandLabelBinding = this.y;
        if (includeBrandLabelBinding != null) {
            includeBrandLabelBinding.n = this;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        E(view);
        this.F = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (41 == i) {
            this.C = (CollectionModeLabel) obj;
            synchronized (this) {
                this.G |= 2;
            }
            h(41);
            y();
            return true;
        }
        if (35 == i) {
            this.B = (CollectionModeHeaderInterface) obj;
            synchronized (this) {
                this.G |= 4;
            }
            h(35);
            y();
            return true;
        }
        if (42 != i) {
            return false;
        }
        this.D = (Text) obj;
        synchronized (this) {
            this.G |= 8;
        }
        h(42);
        y();
        return true;
    }

    @Override // au.com.woolworths.android.onesite.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CollectionModeHeaderInterface collectionModeHeaderInterface = this.B;
        if (collectionModeHeaderInterface != null) {
            collectionModeHeaderInterface.m3();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        CollectionModeLabel collectionModeLabel = this.C;
        Text text = this.D;
        long j2 = 18 & j;
        long j3 = 24 & j;
        CharSequence text2 = (j3 == 0 || text == null) ? null : text.getText(this.h.getContext());
        if ((j & 16) != 0) {
            this.y.L(HomepageModeSelectorBadge.g);
            this.y.M(2);
            this.E.setOnClickListener(this.F);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.z, text2);
        }
        if (j2 != 0) {
            CollectionModeBindingAdaptersKt.a(this.A, collectionModeLabel);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.G != 0) {
                    return true;
                }
                return this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 16L;
        }
        this.y.r();
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
            this.G |= 1;
        }
        return true;
    }
}
