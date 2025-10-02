package au.com.woolworths.feature.shop.recipes.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagSummaryData;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeListener;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagImageViewState;
import au.com.woolworths.feature.shop.recipes.generated.callback.OnClickListener;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes3.dex */
public class EpoxyItemFreshMagHomeBindingImpl extends EpoxyItemFreshMagHomeBinding implements OnClickListener.Listener {
    public final ImageView G;
    public final OnClickListener H;
    public final OnClickListener I;
    public long J;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemFreshMagHomeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[4], (MaterialCardView) objArrT[1], (Button) objArrT[5], (ProgressBar) objArrT[3]);
        this.J = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        ImageView imageView = (ImageView) objArrT[2];
        this.G = imageView;
        imageView.setTag(null);
        this.B.setTag(null);
        E(view);
        this.H = new OnClickListener(this, 2);
        this.I = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (106 == i) {
            this.E = (ImageLoaderListener) obj;
            synchronized (this) {
                this.J |= 1;
            }
            h(106);
            y();
            return true;
        }
        if (251 == i) {
            L((FreshMagImageViewState) obj);
            return true;
        }
        if (85 == i) {
            this.C = (FreshMagHomeListener) obj;
            synchronized (this) {
                this.J |= 4;
            }
            h(85);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.D = (FreshMagSummaryData) obj;
        synchronized (this) {
            this.J |= 8;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.recipes.databinding.EpoxyItemFreshMagHomeBinding
    public final void L(FreshMagImageViewState freshMagImageViewState) throws Throwable {
        this.F = freshMagImageViewState;
        synchronized (this) {
            this.J |= 2;
        }
        h(251);
        y();
    }

    @Override // au.com.woolworths.feature.shop.recipes.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        if (i == 1) {
            FreshMagHomeListener freshMagHomeListener = this.C;
            FreshMagSummaryData freshMagSummaryData = this.D;
            if (freshMagHomeListener == null || freshMagSummaryData == null) {
                return;
            }
            freshMagHomeListener.k5(freshMagSummaryData.c);
            return;
        }
        if (i != 2) {
            return;
        }
        FreshMagHomeListener freshMagHomeListener2 = this.C;
        FreshMagSummaryData freshMagSummaryData2 = this.D;
        if (freshMagHomeListener2 == null || freshMagSummaryData2 == null) {
            return;
        }
        freshMagHomeListener2.k5(freshMagSummaryData2.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            long r2 = r1.J     // Catch: java.lang.Throwable -> La0
            r4 = 0
            r1.J = r4     // Catch: java.lang.Throwable -> La0
            monitor-exit(r19)     // Catch: java.lang.Throwable -> La0
            au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener r10 = r1.E
            au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagImageViewState r0 = r1.F
            au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagSummaryData r6 = r1.D
            r7 = 25
            long r7 = r7 & r2
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r8 = 1
            r11 = 24
            r9 = 0
            r13 = 0
            if (r7 == 0) goto L3f
            long r14 = r2 & r11
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 == 0) goto L30
            if (r6 == 0) goto L29
            java.lang.String r14 = r6.d
            java.lang.String r15 = r6.b
            goto L2b
        L29:
            r14 = r9
            r15 = r14
        L2b:
            if (r14 == 0) goto L32
            r16 = r8
            goto L34
        L30:
            r14 = r9
            r15 = r14
        L32:
            r16 = r13
        L34:
            if (r6 == 0) goto L38
            java.lang.String r9 = r6.f8054a
        L38:
            r6 = r14
            r14 = r7
            r7 = r9
            r9 = r6
            r6 = r16
            goto L43
        L3f:
            r14 = r7
            r7 = r9
            r15 = r7
            r6 = r13
        L43:
            r16 = 18
            long r16 = r2 & r16
            int r16 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            r17 = r4
            if (r16 == 0) goto L54
            au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagImageViewState r4 = au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagImageViewState.d
            if (r0 != r4) goto L52
            goto L53
        L52:
            r8 = r13
        L53:
            r13 = r8
        L54:
            long r4 = r2 & r11
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r0 == 0) goto L6e
            android.widget.TextView r0 = r1.y
            androidx.databinding.adapters.TextViewBindingAdapter.b(r0, r15)
            android.widget.TextView r0 = r1.y
            au.com.woolworths.base.shopapp.bindings.TextViewBindingsKt.a(r0, r15)
            android.widget.Button r0 = r1.A
            androidx.databinding.adapters.TextViewBindingAdapter.b(r0, r9)
            android.widget.Button r0 = r1.A
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(r0, r6)
        L6e:
            r4 = 16
            long r2 = r2 & r4
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 == 0) goto L83
            com.google.android.material.card.MaterialCardView r0 = r1.z
            au.com.woolworths.feature.shop.recipes.generated.callback.OnClickListener r2 = r1.I
            r0.setOnClickListener(r2)
            android.widget.Button r0 = r1.A
            au.com.woolworths.feature.shop.recipes.generated.callback.OnClickListener r2 = r1.H
            r0.setOnClickListener(r2)
        L83:
            if (r14 == 0) goto L98
            android.widget.ImageView r6 = r1.G
            android.content.Context r0 = r6.getContext()
            r2 = 2131231237(0x7f080205, float:1.807855E38)
            android.graphics.drawable.Drawable r8 = androidx.appcompat.content.res.AppCompatResources.b(r2, r0)
            r9 = 0
            r11 = 96
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.i(r6, r7, r8, r9, r10, r11)
        L98:
            if (r16 == 0) goto L9f
            android.widget.ProgressBar r0 = r1.B
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(r0, r13)
        L9f:
            return
        La0:
            r0 = move-exception
            monitor-exit(r19)     // Catch: java.lang.Throwable -> La0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.recipes.databinding.EpoxyItemFreshMagHomeBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.J = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
