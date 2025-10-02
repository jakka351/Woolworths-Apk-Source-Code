package au.com.woolworths.shop.checkout.databinding;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProduct;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductRewards;
import au.com.woolworths.shop.checkout.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutProductBindingImpl extends EpoxyItemCheckoutProductBinding implements OnClickListener.Listener {
    public static final SparseIntArray M;
    public final OnClickListener J;
    public final OnClickListener K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(R.id.barrier, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemCheckoutProductBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 11, null, M);
        super(dataBindingComponent, view, (ImageButton) objArrT[4], (ImageView) objArrT[1], (ImageView) objArrT[5], (TextView) objArrT[6], (ImageView) objArrT[7], (TextView) objArrT[2], (TextView) objArrT[9], (TextView) objArrT[8], (TextView) objArrT[3]);
        this.L = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        E(view);
        this.J = new OnClickListener(this, 1);
        this.K = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (202 == i) {
            this.H = (CheckoutProduct) obj;
            synchronized (this) {
                this.L |= 1;
            }
            h(DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER);
            y();
            return true;
        }
        if (157 != i) {
            return false;
        }
        this.I = (CheckoutProductListener) obj;
        synchronized (this) {
            this.L |= 2;
        }
        h(157);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.checkout.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        if (i == 1) {
            CheckoutProduct checkoutProduct = this.H;
            CheckoutProductListener checkoutProductListener = this.I;
            if (checkoutProductListener != null) {
                checkoutProductListener.x1(checkoutProduct);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        CheckoutProduct checkoutProduct2 = this.H;
        CheckoutProductListener checkoutProductListener2 = this.I;
        if (checkoutProductListener2 != null) {
            checkoutProductListener2.O0(checkoutProduct2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        int i2;
        boolean z2;
        String str7;
        String str8;
        CheckoutProductRewards checkoutProductRewards;
        String str9;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        CheckoutProduct checkoutProduct = this.H;
        long j2 = 5 & j;
        boolean z3 = false;
        String str10 = null;
        if (j2 != 0) {
            if (checkoutProduct != null) {
                str7 = checkoutProduct.e;
                z2 = checkoutProduct.k;
                str8 = checkoutProduct.d;
                str3 = checkoutProduct.f10565a;
                checkoutProductRewards = checkoutProduct.i;
                str9 = checkoutProduct.g;
                str6 = checkoutProduct.f;
                z = checkoutProduct.m;
            } else {
                z = false;
                z2 = false;
                str7 = null;
                str8 = null;
                str3 = null;
                checkoutProductRewards = null;
                str9 = null;
                str6 = null;
            }
            if (checkoutProductRewards != null) {
                String str11 = checkoutProductRewards.f10570a;
                str4 = checkoutProductRewards.b;
                String str12 = str8;
                str2 = str7;
                z3 = z2;
                str = str11;
                str10 = str9;
                str5 = str12;
            } else {
                str4 = null;
                str10 = str9;
                str5 = str8;
                str2 = str7;
                z3 = z2;
                str = null;
            }
        } else {
            z = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.J);
            this.C.setOnClickListener(this.K);
        }
        if (j2 != 0) {
            ImageView imageView = this.z;
            d.z(this.z, R.drawable.ic_product_image_unavailable, imageView, str10, AppCompatResources.b(R.drawable.ic_product_image_loading, imageView.getContext()));
            BindingAdaptersKt.d(this.A, str4);
            TextViewBindingAdapter.b(this.B, str);
            ImageView imageView2 = this.C;
            Intrinsics.h(imageView2, "imageView");
            if (z3) {
                i = R.drawable.ic_substitution_button_allowed;
                i2 = R.string.substitution_on_content_description;
            } else {
                i = R.drawable.ic_substitution_button_not_allowed;
                i2 = R.string.substitution_off_content_description;
            }
            Context context = imageView2.getContext();
            imageView2.setImageDrawable(VectorDrawableCompat.a(i, context.getTheme(), context.getResources()));
            imageView2.setContentDescription(context.getString(i2));
            BindingAdaptersKt.o(this.C, z);
            TextViewBindingAdapter.b(this.D, str3);
            TextViewBindingAdapter.b(this.E, str2);
            TextViewBindingAdapter.b(this.F, str6);
            TextViewBindingAdapter.b(this.G, str5);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.L = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
