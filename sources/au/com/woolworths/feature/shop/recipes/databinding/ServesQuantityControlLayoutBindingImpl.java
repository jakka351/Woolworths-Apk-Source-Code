package au.com.woolworths.feature.shop.recipes.databinding;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.shop.recipes.details.ServesQuantityClickListener;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeServesData;
import au.com.woolworths.feature.shop.recipes.generated.callback.OnClickListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class ServesQuantityControlLayoutBindingImpl extends ServesQuantityControlLayoutBinding implements OnClickListener.Listener {
    public final OnClickListener D;
    public final OnClickListener E;
    public long F;

    /* JADX WARN: Illegal instructions before constructor call */
    public ServesQuantityControlLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(dataBindingComponent, view, (ImageButton) objArrT[1], (ImageButton) objArrT[3], (TextView) objArrT[2]);
        this.F = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        E(view);
        this.D = new OnClickListener(this, 1);
        this.E = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (227 == i) {
            this.B = (RecipeServesData) obj;
            synchronized (this) {
                this.F |= 1;
            }
            h(227);
            y();
            return true;
        }
        if (228 != i) {
            return false;
        }
        this.C = (ServesQuantityClickListener) obj;
        synchronized (this) {
            this.F |= 2;
        }
        h(228);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.recipes.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        if (i == 1) {
            RecipeServesData recipeServesData = this.B;
            ServesQuantityClickListener servesQuantityClickListener = this.C;
            if (servesQuantityClickListener == null || recipeServesData == null) {
                return;
            }
            servesQuantityClickListener.Y(recipeServesData.f8022a);
            return;
        }
        if (i != 2) {
            return;
        }
        RecipeServesData recipeServesData2 = this.B;
        ServesQuantityClickListener servesQuantityClickListener2 = this.C;
        if (servesQuantityClickListener2 == null || recipeServesData2 == null) {
            return;
        }
        servesQuantityClickListener2.D0(recipeServesData2.f8022a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String strValueOf;
        boolean z;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        RecipeServesData recipeServesData = this.B;
        long j2 = 5 & j;
        if (j2 != 0) {
            Intrinsics.h(recipeServesData, "<this>");
            z = recipeServesData.f8022a < recipeServesData.d;
            int i = recipeServesData.f8022a;
            z = i > recipeServesData.c;
            strValueOf = String.valueOf(i);
        } else {
            strValueOf = null;
            z = false;
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.D);
            this.z.setOnClickListener(this.E);
        }
        if (j2 != 0) {
            this.y.setEnabled(z);
            this.z.setEnabled(z);
            TextViewBindingAdapter.b(this.A, strValueOf);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
