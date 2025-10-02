package au.com.woolworths.product.details.databinding;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.ui.HtmlTextBindingAdapterKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.a;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.generated.callback.OnClickListener;
import au.com.woolworths.product.details.ui.ProductNutritionInfoUiModel;
import com.woolworths.R;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyItemProductNutritionInfoBindingImpl extends EpoxyItemProductNutritionInfoBinding implements OnClickListener.Listener {
    public final OnClickListener H;
    public long I;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductNutritionInfoBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 7, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[5], (Button) objArrT[6], (ConstraintLayout) objArrT[0], (TextView) objArrT[3], (TextView) objArrT[2], (LinearLayout) objArrT[4], (TextView) objArrT[1]);
        this.I = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        E(view);
        this.H = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.G = (ProductDetailsClickHandler) obj;
            synchronized (this) {
                this.I |= 1;
            }
            h(35);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.F = (ProductNutritionInfoUiModel) obj;
        synchronized (this) {
            this.I |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.product.details.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ProductDetailsClickHandler productDetailsClickHandler = this.G;
        ProductNutritionInfoUiModel productNutritionInfoUiModel = this.F;
        if (productDetailsClickHandler != null) {
            productDetailsClickHandler.T1(productNutritionInfoUiModel);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        long j2;
        long j3;
        String string;
        String string2;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        ProductNutritionInfoUiModel productNutritionInfoUiModel = this.F;
        long j4 = j & 6;
        boolean z2 = false;
        if (j4 != 0) {
            if (productNutritionInfoUiModel != null) {
                String str5 = productNutritionInfoUiModel.f9317a;
                z = productNutritionInfoUiModel.g;
                String str6 = productNutritionInfoUiModel.d;
                String str7 = productNutritionInfoUiModel.b;
                str4 = productNutritionInfoUiModel.c;
                str3 = str7;
                str2 = str6;
                str = str5;
                z2 = z;
            } else {
                z = false;
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            if (j4 != 0) {
                j |= z2 ? 16L : 8L;
            }
            Intrinsics.h(productNutritionInfoUiModel, "<this>");
            StringBuilder sb = new StringBuilder();
            j2 = 0;
            sb.append(productNutritionInfoUiModel.f9317a);
            sb.append('\n');
            sb.append(productNutritionInfoUiModel.b);
            sb.append('\n');
            sb.append(productNutritionInfoUiModel.c);
            sb.append('\n');
            j3 = 6;
            sb.append(CollectionsKt.M(productNutritionInfoUiModel.e, ",", null, null, new a(21), 30));
            sb.append('\n');
            Iterator it = productNutritionInfoUiModel.f.iterator();
            while (it.hasNext()) {
                sb.append(CollectionsKt.M((List) it.next(), ",", null, null, new a(21), 30));
                sb.append('\n');
            }
            sb.append(productNutritionInfoUiModel.d);
            sb.append('\n');
            string = sb.toString();
            Intrinsics.g(string, "toString(...)");
            string2 = this.z.getResources().getString(z2 ? R.string.product_detail_see_more : R.string.product_detail_see_less);
            z2 = !z;
        } else {
            j2 = 0;
            j3 = 6;
            string = null;
            string2 = null;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        if ((j & j3) != j2) {
            TextViewBindingAdapter.b(this.y, str2);
            BindingAdaptersKt.o(this.y, z2);
            TextViewBindingAdapter.b(this.z, string2);
            HtmlTextBindingAdapterKt.a(this.B, str4, null);
            HtmlTextBindingAdapterKt.a(this.C, str3, null);
            BindingAdaptersKt.o(this.D, z2);
            TextViewBindingAdapter.b(this.E, str);
            if (ViewDataBinding.s >= 4) {
                this.A.setContentDescription(string);
            }
        }
        if ((j & 4) != j2) {
            this.z.setOnClickListener(this.H);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.I = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
