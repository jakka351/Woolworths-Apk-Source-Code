package au.com.woolworths.feature.shop.recipes.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.feature.shop.recipes.generated.callback.OnClickListener;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes3.dex */
public class EpoxyItemRecipeSeeAllCardBindingImpl extends EpoxyItemRecipeSeeAllCardBinding implements OnClickListener.Listener {
    public final MaterialCardView A;
    public final OnClickListener B;
    public long C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemRecipeSeeAllCardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
        this.C = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArrT[0];
        this.A = materialCardView;
        materialCardView.setTag(null);
        E(view);
        this.B = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            this.z = (HorizontalListActionClickListener) obj;
            synchronized (this) {
                this.C |= 1;
            }
            h(157);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.y = (HorizontalListData) obj;
        synchronized (this) {
            this.C |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.recipes.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        HorizontalListActionClickListener horizontalListActionClickListener = this.z;
        HorizontalListData horizontalListData = this.y;
        if (horizontalListActionClickListener != null) {
            horizontalListActionClickListener.G0(horizontalListData);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        if ((j & 4) != 0) {
            this.A.setOnClickListener(this.B);
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
            this.C = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
