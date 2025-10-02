package au.com.woolworths.feature.shop.imagegallery.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import au.com.woolworths.feature.shop.imagegallery.ProductImageGalleryViewModel;
import au.com.woolworths.feature.shop.imagegallery.generated.callback.OnPageSelectedListener;

/* loaded from: classes3.dex */
public class ActivityProductImageGalleryBindingImpl extends ActivityProductImageGalleryBinding implements OnPageSelectedListener.Listener {
    public final OnPageSelectedListener B;
    public long C;

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityProductImageGalleryBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, (Toolbar) objArrT[1], (ViewPager) objArrT[2]);
        this.C = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        E(view);
        this.B = new OnPageSelectedListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((ProductImageGalleryViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.imagegallery.databinding.ActivityProductImageGalleryBinding
    public final void L(ProductImageGalleryViewModel productImageGalleryViewModel) throws Throwable {
        this.A = productImageGalleryViewModel;
        synchronized (this) {
            this.C |= 2;
        }
        h(273);
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[PHI: r7
  0x0028: PHI (r7v1 'extras' au.com.woolworths.android.onesite.navigation.Activities$ImageGallery$Extras) = 
  (r7v0 'extras' au.com.woolworths.android.onesite.navigation.Activities$ImageGallery$Extras)
  (r7v9 'extras' au.com.woolworths.android.onesite.navigation.Activities$ImageGallery$Extras)
 binds: [B:6:0x0011, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() throws android.content.res.Resources.NotFoundException {
        /*
            r10 = this;
            monitor-enter(r10)
            long r0 = r10.C     // Catch: java.lang.Throwable -> L76
            r2 = 0
            r10.C = r2     // Catch: java.lang.Throwable -> L76
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L76
            au.com.woolworths.feature.shop.imagegallery.ProductImageGalleryViewModel r4 = r10.A
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L28
            if (r4 == 0) goto L18
            androidx.databinding.ObservableField r4 = r4.g
            goto L19
        L18:
            r4 = r7
        L19:
            r10.J(r6, r4)
            if (r4 == 0) goto L23
            java.lang.Object r4 = r4.e
            r7 = r4
            au.com.woolworths.android.onesite.navigation.Activities$ImageGallery$Extras r7 = (au.com.woolworths.android.onesite.navigation.Activities.ImageGallery.Extras) r7
        L23:
            if (r7 == 0) goto L28
            int r4 = r7.f
            goto L29
        L28:
            r4 = r6
        L29:
            if (r5 == 0) goto L67
            androidx.appcompat.widget.Toolbar r5 = r10.y
            java.lang.String r8 = "toolbar"
            kotlin.jvm.internal.Intrinsics.h(r5, r8)
            java.lang.String r8 = "extras"
            kotlin.jvm.internal.Intrinsics.h(r7, r8)
            android.content.Context r8 = r5.getContext()
            int r9 = r7.f
            int r9 = r9 + 1
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.util.List r7 = r7.e
            int r7 = r7.size()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r9, r7}
            r9 = 2132018691(0x7f140603, float:1.9675696E38)
            java.lang.String r7 = r8.getString(r9, r7)
            r5.setTitle(r7)
            androidx.viewpager.widget.ViewPager r5 = r10.z
            java.lang.String r7 = "viewPager"
            kotlin.jvm.internal.Intrinsics.h(r5, r7)
            r5.y = r6
            r5.w(r4, r6, r6, r6)
        L67:
            r4 = 4
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L75
            androidx.viewpager.widget.ViewPager r0 = r10.z
            au.com.woolworths.feature.shop.imagegallery.generated.callback.OnPageSelectedListener r1 = r10.B
            au.com.woolworths.android.onesite.bindings.ViewPagerBindingKt.a(r0, r1)
        L75:
            return
        L76:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L76
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.imagegallery.databinding.ActivityProductImageGalleryBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.C = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }
}
