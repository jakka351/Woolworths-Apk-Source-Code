package au.com.woolworths.feature.rewards.offers.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes3.dex */
public class IncludeSpinsurpriseDownloadableAssetBindingImpl extends IncludeSpinsurpriseDownloadableAssetBinding {
    public final ConstraintLayout F;
    public long G;

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeSpinsurpriseDownloadableAssetBindingImpl(DataBindingComponent dataBindingComponent, View view) {
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
            this.B = (Integer) obj;
            synchronized (this) {
                this.G |= 1;
            }
            h(8);
            y();
            return true;
        }
        if (163 == i) {
            this.E = (Boolean) obj;
            synchronized (this) {
                this.G |= 2;
            }
            h(163);
            y();
            return true;
        }
        if (161 == i) {
            this.D = (Boolean) obj;
            synchronized (this) {
                this.G |= 4;
            }
            h(161);
            y();
            return true;
        }
        if (7 == i) {
            L((DownloadableAsset) obj);
            return true;
        }
        if (162 != i) {
            return false;
        }
        this.C = (Integer) obj;
        synchronized (this) {
            this.G |= 16;
        }
        h(162);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.offers.databinding.IncludeSpinsurpriseDownloadableAssetBinding
    public final void L(DownloadableAsset downloadableAsset) throws Throwable {
        this.A = downloadableAsset;
        synchronized (this) {
            this.G |= 8;
        }
        h(7);
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0142  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.databinding.IncludeSpinsurpriseDownloadableAssetBindingImpl.j():void");
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
