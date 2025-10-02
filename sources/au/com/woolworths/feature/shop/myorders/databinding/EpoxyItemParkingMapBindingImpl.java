package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemParkingMapBindingImpl extends EpoxyItemParkingMapBinding {
    public long A;
    public final ImageView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemParkingMapBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
        this.A = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        ImageView imageView = (ImageView) objArrT[1];
        this.z = imageView;
        imageView.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (107 != i) {
            return false;
        }
        this.y = (String) obj;
        synchronized (this) {
            this.A |= 1;
        }
        h(107);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        String str = this.y;
        if ((j & 3) != 0) {
            ImageView imageView = this.z;
            d.z(this.z, R.drawable.ic_parking_map_placeholder, imageView, str, AppCompatResources.b(R.drawable.ic_parking_map_placeholder, imageView.getContext()));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.A = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
