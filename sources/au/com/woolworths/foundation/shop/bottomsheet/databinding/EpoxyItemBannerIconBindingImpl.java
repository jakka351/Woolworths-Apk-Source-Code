package au.com.woolworths.foundation.shop.bottomsheet.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.shop.bottomsheet.BindingAdaptersKt;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetBannerIcon;
import com.woolworths.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyItemBannerIconBindingImpl extends EpoxyItemBannerIconBinding {
    public final ImageView A;
    public long B;
    public final FrameLayout z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemBannerIconBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
        this.B = -1L;
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.z = frameLayout;
        frameLayout.setTag(null);
        ImageView imageView = (ImageView) objArrT[1];
        this.A = imageView;
        imageView.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (13 != i) {
            return false;
        }
        this.y = (BottomSheetBannerIcon) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(13);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        BottomSheetBannerIcon bannerIcon = this.y;
        if ((j & 3) != 0) {
            ImageView imageView = this.A;
            Intrinsics.h(imageView, "imageView");
            Intrinsics.h(bannerIcon, "bannerIcon");
            if (BindingAdaptersKt.WhenMappings.f8666a[bannerIcon.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            imageView.setImageResource(R.drawable.ic_everyday_market_logo_small);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.B = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
