package au.com.woolworths.product.tile;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckedTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.databinding.LayoutProductPriceBinding;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/product/tile/ProductPriceView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getBaseline", "()I", "", "checked", "", "setPriceChecked", "(Z)V", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductPriceView extends ConstraintLayout {
    public final LayoutProductPriceBinding d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductPriceView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    public final void d(String dollars, String str, String str2) {
        Intrinsics.h(dollars, "dollars");
        LayoutProductPriceBinding layoutProductPriceBinding = this.d;
        CheckedTextView checkedTextView = layoutProductPriceBinding.z;
        CheckedTextView checkedTextView2 = layoutProductPriceBinding.B;
        CheckedTextView checkedTextView3 = layoutProductPriceBinding.y;
        checkedTextView.setVisibility(dollars.length() == 0 ? 4 : 0);
        layoutProductPriceBinding.A.setText(dollars);
        if (str == null || str.length() == 0) {
            checkedTextView3.setVisibility(8);
        } else {
            checkedTextView3.setVisibility(0);
            checkedTextView3.setText(str);
        }
        if (str2 == null || str2.length() == 0) {
            checkedTextView2.setVisibility(8);
        } else {
            checkedTextView2.setVisibility(0);
            checkedTextView2.setText(str2);
        }
        Context context = getContext();
        if (str == null) {
            str = "";
        }
        setContentDescription(context.getString(R.string.product_price_content_description, dollars, str));
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.d.A.getBaseline();
    }

    public final void setPriceChecked(boolean checked) {
        LayoutProductPriceBinding layoutProductPriceBinding = this.d;
        layoutProductPriceBinding.z.setChecked(checked);
        layoutProductPriceBinding.A.setChecked(checked);
        layoutProductPriceBinding.y.setChecked(checked);
        layoutProductPriceBinding.B.setChecked(checked);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductPriceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ ProductPriceView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductPriceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = LayoutProductPriceBinding.C;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        LayoutProductPriceBinding layoutProductPriceBinding = (LayoutProductPriceBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.layout_product_price, this, true, null);
        Intrinsics.g(layoutProductPriceBinding, "inflate(...)");
        CheckedTextView checkedTextView = layoutProductPriceBinding.B;
        CheckedTextView checkedTextView2 = layoutProductPriceBinding.y;
        CheckedTextView checkedTextView3 = layoutProductPriceBinding.A;
        CheckedTextView checkedTextView4 = layoutProductPriceBinding.z;
        this.d = layoutProductPriceBinding;
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, au.com.woolworths.product.R.styleable.f9233a, 0, 0);
        ColorStateList colorStateListB = ResourcesCompat.b(R.color.themeable_content_color_selector, context.getTheme(), context.getResources());
        checkedTextView4.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(1, R.style.TextAppearance_Body_Fresh_Bold));
        checkedTextView4.setTextColor(colorStateListB);
        checkedTextView3.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(2, R.style.TextAppearance_Price_Dollar));
        checkedTextView3.setTextColor(colorStateListB);
        checkedTextView2.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(0, R.style.TextAppearance_Body_Fresh_Medium));
        checkedTextView2.setTextColor(colorStateListB);
        checkedTextView.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(3, R.style.TextAppearance_Body_Fresh_Medium));
        checkedTextView.setTextColor(colorStateListB);
        typedArrayObtainStyledAttributes.recycle();
    }
}
