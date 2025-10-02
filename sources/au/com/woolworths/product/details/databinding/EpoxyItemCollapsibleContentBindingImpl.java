package au.com.woolworths.product.details.databinding;

import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.customviews.HtmlLinkTextView;
import au.com.woolworths.product.details.generated.callback.OnClickListener;
import au.com.woolworths.product.details.ui.CollapsibleContentUiModel;
import com.woolworths.R;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyItemCollapsibleContentBindingImpl extends EpoxyItemCollapsibleContentBinding implements OnClickListener.Listener {
    public final OnClickListener F;
    public long G;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemCollapsibleContentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[4], (HtmlLinkTextView) objArrT[3], (Button) objArrT[5], (TextView) objArrT[2], (TextView) objArrT[1]);
        this.G = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.C.setTag(null);
        E(view);
        this.F = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.E = (ProductDetailsClickHandler) obj;
            synchronized (this) {
                this.G |= 1;
            }
            h(35);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.D = (CollapsibleContentUiModel) obj;
        synchronized (this) {
            this.G |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.product.details.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ProductDetailsClickHandler productDetailsClickHandler = this.E;
        CollapsibleContentUiModel collapsibleContentUiModel = this.D;
        if (productDetailsClickHandler != null) {
            productDetailsClickHandler.q1(collapsibleContentUiModel);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException, IOException {
        long j;
        long j2;
        String string;
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        CollapsibleContentUiModel collapsibleContentUiModel = this.D;
        long j3 = j & 6;
        boolean z3 = false;
        String str4 = null;
        if (j3 != 0) {
            if (collapsibleContentUiModel != null) {
                str4 = collapsibleContentUiModel.f9315a;
                str2 = collapsibleContentUiModel.c;
                z = collapsibleContentUiModel.e;
                str3 = collapsibleContentUiModel.b;
                z2 = collapsibleContentUiModel.d;
            } else {
                z = false;
                z2 = false;
                str2 = null;
                str3 = null;
            }
            if (j3 != 0) {
                j |= z ? 16L : 8L;
            }
            Intrinsics.h(collapsibleContentUiModel, "<this>");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(collapsibleContentUiModel.f9315a);
            j2 = 0;
            Appendable appendableAppend = spannableStringBuilder.append('\n');
            String str5 = collapsibleContentUiModel.c;
            if (str5 == null) {
                str5 = "";
            }
            Appendable appendableAppend2 = appendableAppend.append(str5);
            Intrinsics.g(appendableAppend2, "append(...)");
            Appendable appendableAppend3 = appendableAppend2.append('\n');
            String str6 = collapsibleContentUiModel.b;
            Intrinsics.h(str6, "<this>");
            appendableAppend3.append(Html.fromHtml(str6, 0));
            string = this.A.getResources().getString(z ? R.string.product_detail_see_more : R.string.product_detail_see_less);
            str = str4;
            z3 = z2;
            str4 = spannableStringBuilder;
        } else {
            j2 = 0;
            string = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        if ((j & 6) != j2) {
            TextViewBindingAdapter.b(this.y, str4);
            HtmlLinkTextView textView = this.z;
            Intrinsics.h(textView, "textView");
            textView.setText(Html.fromHtml(str3, 63));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            TextViewBindingAdapter.b(this.A, string);
            BindingAdaptersKt.o(this.A, z3);
            TextViewBindingAdapter.b(this.B, str2);
            BindingAdaptersKt.n(this.B, str2);
            TextViewBindingAdapter.b(this.C, str);
        }
        if ((j & 4) != j2) {
            this.y.setWillNotDraw(true);
            this.A.setOnClickListener(this.F);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
