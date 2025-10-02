package au.com.woolworths.feature.shop.myorders.databinding;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.utils.ScrimUtil;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class IncludePriceBreakdownBottomSheetBindingImpl extends IncludePriceBreakdownBottomSheetBinding implements OnClickListener.Listener {
    public static final SparseIntArray M;
    public final OnClickListener K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(R.id.total_label_section, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludePriceBreakdownBottomSheetBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, null, M);
        super(dataBindingComponent, view, (ImageButton) objArrT[2], (LinearLayout) objArrT[0], (View) objArrT[1], (TextView) objArrT[4], (FrameLayout) objArrT[7], (View) objArrT[3], (TextView) objArrT[6], (View) objArrT[5]);
        this.L = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        E(view);
        this.K = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (244 == i) {
            this.G = (Boolean) obj;
            synchronized (this) {
                this.L |= 1;
            }
            h(244);
            y();
            return true;
        }
        if (271 == i) {
            this.I = (String) obj;
            synchronized (this) {
                this.L |= 2;
            }
            h(271);
            y();
            return true;
        }
        if (263 == i) {
            this.H = (String) obj;
            synchronized (this) {
                this.L |= 4;
            }
            h(263);
            y();
            return true;
        }
        if (35 != i) {
            return false;
        }
        this.J = (YourGroceriesContract.YourGroceriesClickHandler) obj;
        synchronized (this) {
            this.L |= 8;
        }
        h(35);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        YourGroceriesContract.YourGroceriesClickHandler yourGroceriesClickHandler = this.J;
        if (yourGroceriesClickHandler != null) {
            yourGroceriesClickHandler.c3();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean zB;
        boolean z;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        Boolean bool = this.G;
        String str = this.I;
        String str2 = this.H;
        long j2 = 17 & j;
        if (j2 != 0) {
            zB = ViewDataBinding.B(bool);
            z = !zB;
        } else {
            zB = false;
            z = false;
        }
        long j3 = 18 & j;
        long j4 = 20 & j;
        if ((j & 16) != 0) {
            this.y.setOnClickListener(this.K);
            View view = this.A;
            ScrimUtil.a(view, 80, new ColorDrawable(ViewDataBinding.n(R.color.color_scrim_shadow, view)));
        }
        if (j4 != 0) {
            TextViewBindingAdapter.b(this.B, str2);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.B, z);
            BindingAdaptersKt.o(this.D, zB);
            BindingAdaptersKt.o(this.E, z);
            BindingAdaptersKt.o(this.F, zB);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.E, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.L = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
