package au.com.woolworths.android.onesite.base.ui.databinding;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.generated.callback.OnClickListener;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardClickListener;
import au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardImageLoaderListener;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardMargins;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class ItemDynamicSizeCardBindingImpl extends ItemDynamicSizeCardBinding implements OnClickListener.Listener {
    public final MaterialCardView F;
    public final OnClickListener G;
    public long H;

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemDynamicSizeCardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(view, (ImageView) objArrT[2], (TextView) objArrT[3], (ConstraintLayout) objArrT[0], dataBindingComponent);
        this.H = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArrT[1];
        this.F = materialCardView;
        materialCardView.setTag(null);
        E(view);
        this.G = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (165 == i) {
            O((DynamicSizeCardMargins) obj);
            return true;
        }
        if (106 == i) {
            N((DynamicSizeCardImageLoaderListener) obj);
            return true;
        }
        if (37 == i) {
            L((DynamicSizeCardClickListener) obj);
            return true;
        }
        if (53 != i) {
            return false;
        }
        M((DynamicSizeCardData) obj);
        return true;
    }

    public final void L(DynamicSizeCardClickListener dynamicSizeCardClickListener) throws Throwable {
        this.D = dynamicSizeCardClickListener;
        synchronized (this) {
            this.H |= 4;
        }
        h(37);
        y();
    }

    public final void M(DynamicSizeCardData dynamicSizeCardData) throws Throwable {
        this.B = dynamicSizeCardData;
        synchronized (this) {
            this.H |= 8;
        }
        h(53);
        y();
    }

    public final void N(DynamicSizeCardImageLoaderListener dynamicSizeCardImageLoaderListener) throws Throwable {
        this.E = dynamicSizeCardImageLoaderListener;
        synchronized (this) {
            this.H |= 2;
        }
        h(106);
        y();
    }

    public final void O(DynamicSizeCardMargins dynamicSizeCardMargins) throws Throwable {
        this.C = dynamicSizeCardMargins;
        synchronized (this) {
            this.H |= 1;
        }
        h(165);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        DynamicSizeCardClickListener dynamicSizeCardClickListener = this.D;
        DynamicSizeCardData dynamicSizeCardData = this.B;
        if (dynamicSizeCardClickListener != null) {
            dynamicSizeCardClickListener.m(dynamicSizeCardData);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        ImageView.ScaleType scaleTypeB;
        String str;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        DynamicSizeCardMargins margins = this.C;
        DynamicSizeCardImageLoaderListener dynamicSizeCardImageLoaderListener = this.E;
        DynamicSizeCardData data = this.B;
        long j2 = 25 & j;
        long j3 = 26 & j;
        String altText = null;
        if ((27 & j) != 0) {
            String imageUrl = (j3 == 0 || data == null) ? null : data.getImageUrl();
            if ((j & 24) == 0 || data == null) {
                str = imageUrl;
                scaleTypeB = null;
            } else {
                str = imageUrl;
                scaleTypeB = data.b();
                altText = data.getAltText();
            }
        } else {
            scaleTypeB = null;
            str = null;
        }
        if ((24 & j) != 0) {
            TextViewBindingAdapter.b(this.y, altText);
            this.z.setScaleType(scaleTypeB);
            if (ViewDataBinding.s >= 4) {
                this.F.setContentDescription(altText);
            }
        }
        if (j3 != 0) {
            BindingAdaptersKt.e(this.z, str, dynamicSizeCardImageLoaderListener);
        }
        if ((j & 16) != 0) {
            this.F.setOnClickListener(this.G);
        }
        if (j2 != 0) {
            MaterialCardView view = this.F;
            Intrinsics.h(view, "view");
            Intrinsics.h(data, "data");
            Intrinsics.h(margins, "margins");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            Resources resources = view.getContext().getResources();
            layoutParams2.G = resources.getString(data.getHeight().getF());
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) resources.getDimension(R.dimen.default_margin);
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) resources.getDimension(margins.f10031a);
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) resources.getDimension(R.dimen.default_margin);
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) resources.getDimension(R.dimen.default_margin);
            int dimension = (int) resources.getDimension(data.c());
            if (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + dimension < resources.getDisplayMetrics().widthPixels) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = dimension;
            }
            view.setLayoutParams(layoutParams2);
        }
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
            this.H = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
