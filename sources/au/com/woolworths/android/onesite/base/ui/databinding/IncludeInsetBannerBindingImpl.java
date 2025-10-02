package au.com.woolworths.android.onesite.base.ui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class IncludeInsetBannerBindingImpl extends IncludeInsetBannerBinding {
    public static final SparseIntArray I;
    public final ConstraintLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.guideline, 7);
        sparseIntArray.put(R.id.icon_barrier, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeInsetBannerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 9, null, I);
        TextView textView = (TextView) objArrT[5];
        TextView textView2 = (TextView) objArrT[6];
        super(dataBindingComponent, view, textView, textView2, (ImageView) objArrT[2], (ImageView) objArrT[1], (TextView) objArrT[4], (TextView) objArrT[3]);
        this.H = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        this.D.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (14 == i) {
            L((InsetBanner) obj);
            return true;
        }
        if (35 != i) {
            return false;
        }
        M((InsetBannerClickListener) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding
    public final void L(InsetBanner insetBanner) throws Throwable {
        this.E = insetBanner;
        synchronized (this) {
            this.H |= 1;
        }
        h(14);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding
    public final void M(InsetBannerClickListener insetBannerClickListener) throws Throwable {
        this.F = insetBannerClickListener;
        synchronized (this) {
            this.H |= 2;
        }
        h(35);
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.H = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
