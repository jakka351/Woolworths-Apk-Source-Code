package au.com.woolworths.android.onesite.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ToolTipContentWithTitleBindingImpl extends ToolTipContentWithTitleBinding {
    public static final SparseIntArray E;
    public final RelativeLayout C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.description_text_view, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ToolTipContentWithTitleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, E);
        Button button = (Button) objArrT[3];
        super(dataBindingComponent, view, button, (ImageView) objArrT[1], (TextView) objArrT[2]);
        this.D = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArrT[0];
        this.C = relativeLayout;
        relativeLayout.setTag(null);
        this.A.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (38 != i) {
            return false;
        }
        this.B = (CoachMark) obj;
        synchronized (this) {
            this.D |= 1;
        }
        h(38);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int iZ;
        int iZ2;
        Drawable drawable;
        int iB;
        Integer numD;
        Integer numA;
        Integer numH;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        CoachMark coachMark = this.B;
        long j2 = j & 3;
        int iZ3 = 0;
        if (j2 != 0) {
            if (coachMark != null) {
                numD = coachMark.d();
                numA = coachMark.a();
                numH = coachMark.h();
                iB = coachMark.b();
            } else {
                iB = 0;
                numD = null;
                numA = null;
                numH = null;
            }
            iZ3 = ViewDataBinding.z(numD);
            iZ = ViewDataBinding.z(numA);
            iZ2 = ViewDataBinding.z(numH);
            drawable = this.h.getContext().getDrawable(iB);
        } else {
            iZ = 0;
            iZ2 = 0;
            drawable = null;
        }
        if (j2 != 0) {
            BindingAdaptersKt.r(this.y, iZ3);
            BindingAdaptersKt.q(this.z, iZ2);
            BindingAdaptersKt.m(this.z, iZ2, null);
            this.C.setBackground(drawable);
            this.A.setText(iZ);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
