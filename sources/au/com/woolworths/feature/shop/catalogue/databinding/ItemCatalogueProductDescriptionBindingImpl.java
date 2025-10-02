package au.com.woolworths.feature.shop.catalogue.databinding;

import android.content.res.Resources;
import android.text.Layout;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.OneShotPreDrawListener;
import au.com.woolworths.android.onesite.ui.HtmlTextBindingAdapterKt;
import au.com.woolworths.feature.shop.catalogue.productlist.OnMaxLinesToggleListener;
import au.com.woolworths.feature.shop.catalogue.productlist.description.ProductDescriptionItemState;
import com.woolworths.R;
import com.woolworths.scanlibrary.util.widget.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class ItemCatalogueProductDescriptionBindingImpl extends ItemCatalogueProductDescriptionBinding {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.see_more_less_button, 2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (179 == i) {
            M((OnMaxLinesToggleListener) obj);
            return true;
        }
        if (148 == i) {
            L((ProductDescriptionItemState) obj);
            return true;
        }
        if (273 != i) {
            return false;
        }
        return true;
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueProductDescriptionBinding
    public final void L(ProductDescriptionItemState productDescriptionItemState) throws Throwable {
        this.A = productDescriptionItemState;
        synchronized (this) {
            this.D |= 2;
        }
        h(148);
        y();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueProductDescriptionBinding
    public final void M(OnMaxLinesToggleListener onMaxLinesToggleListener) throws Throwable {
        this.B = onMaxLinesToggleListener;
        synchronized (this) {
            this.D |= 1;
        }
        h(179);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        OnMaxLinesToggleListener onMaxLinesToggleListener = this.B;
        ProductDescriptionItemState productDescriptionItemState = this.A;
        long j2 = 9 & j;
        long j3 = j & 10;
        String str = (j3 == 0 || productDescriptionItemState == null) ? null : productDescriptionItemState.f6934a;
        if (j2 != 0) {
            final TextView textView = this.y;
            final int integer = textView.getResources().getInteger(R.integer.max_line_length);
            final Button maxLinesToggleView = this.z;
            Intrinsics.h(maxLinesToggleView, "maxLinesToggleView");
            Intrinsics.h(onMaxLinesToggleListener, "onMaxLinesToggleListener");
            textView.setMaxLines(integer);
            OneShotPreDrawListener.a(textView, new Runnable() { // from class: au.com.woolworths.feature.shop.catalogue.bindings.BindingAdaptersKt$maxLinesClickListener$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    TextView textView2 = textView;
                    int lineCount = textView2.getLineCount();
                    Layout layout = textView2.getLayout();
                    View view = maxLinesToggleView;
                    View view2 = textView;
                    if ((layout != null && layout.getEllipsisCount(lineCount - 1) > 0) || lineCount > integer) {
                        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), 0);
                        view.setVisibility(0);
                    } else {
                        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), (int) textView2.getContext().getResources().getDimension(R.dimen.default_padding));
                        view.setVisibility(8);
                    }
                }
            });
            maxLinesToggleView.setOnClickListener(new a(textView, integer, onMaxLinesToggleListener));
        }
        if (j3 != 0) {
            HtmlTextBindingAdapterKt.a(this.y, str, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
