package au.com.woolworths.feature.product.list.legacy.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.product.list.legacy.ProductListClickHandler;
import au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData;
import au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemIngredientCardSeparatorBindingImpl extends EpoxyItemIngredientCardSeparatorBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts G;
    public static final SparseIntArray H;
    public final IncludeHorizontalDividerBinding D;
    public final OnClickListener E;
    public long F;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        G = includedLayouts;
        includedLayouts.a(0, new int[]{3}, new int[]{R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.top_spacer, 4);
        sparseIntArray.put(R.id.ingredient_content, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemIngredientCardSeparatorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, G, H);
        super(dataBindingComponent, view, (ImageView) objArrT[2], (TextView) objArrT[1], (View) objArrT[4]);
        this.F = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = (IncludeHorizontalDividerBinding) objArrT[3];
        this.D = includeHorizontalDividerBinding;
        if (includeHorizontalDividerBinding != null) {
            includeHorizontalDividerBinding.n = this;
        }
        this.y.setTag(null);
        this.z.setTag(null);
        E(view);
        this.E = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.C = (ProductListClickHandler) obj;
            synchronized (this) {
                this.F |= 1;
            }
            h(35);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.B = (IngredientCardApiData) obj;
        synchronized (this) {
            this.F |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ProductListClickHandler productListClickHandler = this.C;
        IngredientCardApiData ingredientCardApiData = this.B;
        if (productListClickHandler != null) {
            productListClickHandler.p4(ingredientCardApiData);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String label;
        String iconUrl;
        ButtonApiData buttonApiData;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        IngredientCardApiData ingredientCardApiData = this.B;
        long j2 = 6 & j;
        boolean z = false;
        if (j2 != 0) {
            if (ingredientCardApiData != null) {
                str = ingredientCardApiData.d;
                buttonApiData = ingredientCardApiData.e;
            } else {
                buttonApiData = null;
                str = null;
            }
            if (buttonApiData != null) {
                label = buttonApiData.getLabel();
                iconUrl = buttonApiData.getIconUrl();
            } else {
                label = null;
                iconUrl = null;
            }
            if (buttonApiData != null) {
                z = true;
            }
        } else {
            str = null;
            label = null;
            iconUrl = null;
        }
        if (j2 != 0) {
            if (ViewDataBinding.s >= 4) {
                this.y.setContentDescription(label);
            }
            BindingAdaptersKt.o(this.y, z);
            ImageView imageView = this.y;
            d.z(imageView, R.drawable.ic_swap, imageView, iconUrl, null);
            TextViewBindingAdapter.b(this.z, str);
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.E);
        }
        this.D.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.D.p();
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
        this.D.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
