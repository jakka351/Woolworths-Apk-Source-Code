package au.com.woolworths.feature.rewards.offers.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.feature.rewards.offers.SpinSurpriseBannerViewItem;
import au.com.woolworths.feature.rewards.offers.generated.callback.OnClickListener;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public class EpoxyItemSpinSurpriseBannerBindingImpl extends EpoxyItemSpinSurpriseBannerBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts E;
    public final IncludeSpinsurpriseDownloadableAssetBinding A;
    public final MaterialCardView B;
    public final OnClickListener C;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        E = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.include_spinsurprise_downloadable_asset}, new String[]{"include_spinsurprise_downloadable_asset"});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemSpinSurpriseBannerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, E, null);
        this.D = -1L;
        IncludeSpinsurpriseDownloadableAssetBinding includeSpinsurpriseDownloadableAssetBinding = (IncludeSpinsurpriseDownloadableAssetBinding) objArrT[1];
        this.A = includeSpinsurpriseDownloadableAssetBinding;
        if (includeSpinsurpriseDownloadableAssetBinding != null) {
            includeSpinsurpriseDownloadableAssetBinding.n = this;
        }
        MaterialCardView materialCardView = (MaterialCardView) objArrT[0];
        this.B = materialCardView;
        materialCardView.setTag(null);
        E(view);
        this.C = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (176 == i) {
            this.z = (Function0) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(176);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.y = (SpinSurpriseBannerViewItem) obj;
        synchronized (this) {
            this.D |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.offers.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        Function0 function0 = this.z;
        if (function0 != null) {
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        SpinSurpriseBannerViewItem spinSurpriseBannerViewItem = this.y;
        long j2 = 6 & j;
        DownloadableAsset downloadableAsset = (j2 == 0 || spinSurpriseBannerViewItem == null) ? null : spinSurpriseBannerViewItem.c;
        if (j2 != 0) {
            this.A.L(downloadableAsset);
        }
        if ((j & 4) != 0) {
            this.B.setOnClickListener(this.C);
        }
        this.A.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.D != 0) {
                    return true;
                }
                return this.A.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 4L;
        }
        this.A.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
