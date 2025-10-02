package au.com.woolworths.feature.product.list.legacy.databinding;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderApiData;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderTypeApiData;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListSectionHeaderType;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListSectionHeaderTypeKt;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class EpoxyItemProductListSectionHeaderBindingImpl extends EpoxyItemProductListSectionHeaderBinding {
    public static final ViewDataBinding.IncludedLayouts D;
    public static final SparseIntArray E;
    public final IncludeHorizontalDividerBinding B;
    public long C;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        D = includedLayouts;
        includedLayouts.a(0, new int[]{2}, new int[]{R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.top_spacer, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductListSectionHeaderBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, D, E);
        super(view, (View) objArrT[3], (TextView) objArrT[1], dataBindingComponent);
        this.C = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = (IncludeHorizontalDividerBinding) objArrT[2];
        this.B = includeHorizontalDividerBinding;
        if (includeHorizontalDividerBinding != null) {
            includeHorizontalDividerBinding.n = this;
        }
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        this.A = (ListSectionHeaderApiData) obj;
        synchronized (this) {
            this.C |= 1;
        }
        h(53);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        ListSectionHeaderApiData listSectionHeaderApiData = this.A;
        long j2 = j & 3;
        String text = (j2 == 0 || listSectionHeaderApiData == null) ? null : listSectionHeaderApiData.getText();
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, text);
            TextView textView = this.y;
            Intrinsics.h(textView, "textView");
            if (listSectionHeaderApiData != null) {
                ListSectionHeaderTypeApiData type = listSectionHeaderApiData.getType();
                Intrinsics.h(type, "<this>");
                int i = ProductListSectionHeaderTypeKt.WhenMappings.f5386a[type.ordinal()];
                ProductListSectionHeaderType productListSectionHeaderType = i != 1 ? i != 2 ? ProductListSectionHeaderType.e : ProductListSectionHeaderType.e : ProductListSectionHeaderType.d;
                textView.setTextAppearance(productListSectionHeaderType.a());
                Context context = textView.getContext();
                Intrinsics.g(context, "getContext(...)");
                textView.setTextColor(Extensions.a(productListSectionHeaderType.b(), context));
            }
        }
        this.B.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.C != 0) {
                    return true;
                }
                return this.B.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.C = 2L;
        }
        this.B.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
