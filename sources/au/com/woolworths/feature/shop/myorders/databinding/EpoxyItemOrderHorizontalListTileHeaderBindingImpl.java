package au.com.woolworths.feature.shop.myorders.databinding;

import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemOrderHorizontalListTileHeaderBindingImpl extends EpoxyItemOrderHorizontalListTileHeaderBinding implements OnClickListener.Listener {
    public static final SparseIntArray G;
    public final OnClickListener E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.banner_compose_view, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemOrderHorizontalListTileHeaderBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, G);
        super(dataBindingComponent, view, (Button) objArrT[3], (ComposeView) objArrT[4], (TextView) objArrT[2], (TextView) objArrT[1]);
        this.F = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        E(view);
        this.E = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 == i) {
            this.D = (HorizontalListActionClickListener) obj;
            synchronized (this) {
                this.F |= 1;
            }
            h(92);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.C = (HorizontalListData) obj;
        synchronized (this) {
            this.F |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        HorizontalListActionClickListener horizontalListActionClickListener = this.D;
        HorizontalListData horizontalListData = this.C;
        if (horizontalListActionClickListener != null) {
            horizontalListActionClickListener.G0(horizontalListData);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean zIsEmpty;
        String e;
        String d;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        HorizontalListData horizontalListData = this.C;
        long j2 = 6 & j;
        String f = null;
        if (j2 != 0) {
            if (horizontalListData != null) {
                f = horizontalListData.getF();
                d = horizontalListData.getD();
                e = horizontalListData.getE();
            } else {
                e = null;
                d = null;
            }
            z = f != null;
            zIsEmpty = true ^ TextUtils.isEmpty(e);
        } else {
            zIsEmpty = false;
            e = null;
            d = null;
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.E);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, f);
            BindingAdaptersKt.o(this.y, z);
            TextViewBindingAdapter.b(this.A, e);
            BindingAdaptersKt.o(this.A, zIsEmpty);
            TextViewBindingAdapter.b(this.B, d);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
