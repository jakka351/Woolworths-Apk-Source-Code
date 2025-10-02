package au.com.woolworths.android.onesite.base.ui.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes3.dex */
public class IncludeDownloadableAssetBindingImpl extends IncludeDownloadableAssetBinding {
    public final ConstraintLayout F;
    public long G;

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeDownloadableAssetBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, (ImageView) objArrT[1], (LottieAnimationView) objArrT[2]);
        this.G = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (8 == i) {
            M((Integer) obj);
            return true;
        }
        if (163 == i) {
            P((Boolean) obj);
            return true;
        }
        if (161 == i) {
            N((Boolean) obj);
            return true;
        }
        if (7 == i) {
            L((DownloadableAsset) obj);
            return true;
        }
        if (162 != i) {
            return false;
        }
        O((Integer) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeDownloadableAssetBinding
    public final void L(DownloadableAsset downloadableAsset) throws Throwable {
        this.A = downloadableAsset;
        synchronized (this) {
            this.G |= 8;
        }
        h(7);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeDownloadableAssetBinding
    public final void M(Integer num) throws Throwable {
        this.B = num;
        synchronized (this) {
            this.G |= 1;
        }
        h(8);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeDownloadableAssetBinding
    public final void N(Boolean bool) throws Throwable {
        this.D = bool;
        synchronized (this) {
            this.G |= 4;
        }
        h(161);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeDownloadableAssetBinding
    public final void O(Integer num) throws Throwable {
        this.C = num;
        synchronized (this) {
            this.G |= 16;
        }
        h(162);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeDownloadableAssetBinding
    public final void P(Boolean bool) throws Throwable {
        this.E = bool;
        synchronized (this) {
            this.G |= 2;
        }
        h(163);
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0135  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.base.ui.databinding.IncludeDownloadableAssetBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 32L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
