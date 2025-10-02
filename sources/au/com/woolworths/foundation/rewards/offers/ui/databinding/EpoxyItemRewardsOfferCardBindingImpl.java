package au.com.woolworths.foundation.rewards.offers.ui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeTintableTextBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferActionListener;
import au.com.woolworths.foundation.rewards.offers.ui.generated.callback.OnClickListener;
import au.com.woolworths.foundation.rewards.offers.ui.generated.callback.StatefulButtonClickHandler;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemRewardsOfferCardBindingImpl extends EpoxyItemRewardsOfferCardBinding implements StatefulButtonClickHandler.Listener, OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts U;
    public static final SparseIntArray V;
    public final ImageView K;
    public final ImageView L;
    public final IncludeTintableTextBinding M;
    public final Button N;
    public final ImageView O;
    public final ImageView P;
    public final StatefulButtonClickHandler Q;
    public final OnClickListener R;
    public final OnClickListener S;
    public long T;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(19);
        U = includedLayouts;
        includedLayouts.a(12, new int[]{15}, new int[]{R.layout.include_tintable_text}, new String[]{"include_tintable_text"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(R.id.offer_tile_container, 16);
        sparseIntArray.put(R.id.offer_continuity_icon_container, 17);
        sparseIntArray.put(R.id.offer_expiry_and_continuity_barrier, 18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemRewardsOfferCardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 19, U, V);
        ImageView imageView = (ImageView) objArrT[3];
        ImageView imageView2 = (ImageView) objArrT[4];
        FrameLayout frameLayout = (FrameLayout) objArrT[12];
        TextView textView = (TextView) objArrT[7];
        TextView textView2 = (TextView) objArrT[6];
        MaterialCardView materialCardView = (MaterialCardView) objArrT[0];
        super(dataBindingComponent, view, imageView, imageView2, frameLayout, textView, textView2, materialCardView, (TextView) objArrT[5], (ImageView) objArrT[1], (LottieAnimationView) objArrT[2], (StatefulButton) objArrT[13]);
        this.T = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ImageView imageView3 = (ImageView) objArrT[10];
        this.K = imageView3;
        imageView3.setTag(null);
        ImageView imageView4 = (ImageView) objArrT[11];
        this.L = imageView4;
        imageView4.setTag(null);
        IncludeTintableTextBinding includeTintableTextBinding = (IncludeTintableTextBinding) objArrT[15];
        this.M = includeTintableTextBinding;
        if (includeTintableTextBinding != null) {
            includeTintableTextBinding.n = this;
        }
        Button button = (Button) objArrT[14];
        this.N = button;
        button.setTag(null);
        ImageView imageView5 = (ImageView) objArrT[8];
        this.O = imageView5;
        imageView5.setTag(null);
        ImageView imageView6 = (ImageView) objArrT[9];
        this.P = imageView6;
        imageView6.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        E(view);
        this.Q = new StatefulButtonClickHandler(this);
        this.R = new OnClickListener(this, 1);
        this.S = new OnClickListener(this, 3);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            this.J = (RewardsOfferActionListener) obj;
            synchronized (this) {
                this.T |= 1;
            }
            h(157);
            y();
            return true;
        }
        if (175 != i) {
            return false;
        }
        this.I = (OfferViewItem) obj;
        synchronized (this) {
            this.T |= 2;
        }
        h(175);
        y();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020b  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.rewards.offers.ui.databinding.EpoxyItemRewardsOfferCardBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.T != 0) {
                    return true;
                }
                return this.M.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.T = 4L;
        }
        this.M.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
