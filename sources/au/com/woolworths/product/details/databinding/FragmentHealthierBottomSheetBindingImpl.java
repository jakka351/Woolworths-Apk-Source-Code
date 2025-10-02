package au.com.woolworths.product.details.databinding;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.work.impl.utils.b;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.extensions.SpannableStringExtKt;
import au.com.woolworths.product.details.HealthierBottomSheetContract;
import au.com.woolworths.product.details.HealthierBottomSheetFragment;
import au.com.woolworths.product.details.HealthierBottomSheetViewModel;
import au.com.woolworths.product.details.generated.callback.OnClickListener;
import com.woolworths.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class FragmentHealthierBottomSheetBindingImpl extends FragmentHealthierBottomSheetBinding implements OnClickListener.Listener {
    public static final SparseIntArray H;
    public final OnClickListener F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.grab_handle_image_view, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentHealthierBottomSheetBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, H);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        ImageView imageView = (ImageView) objArrT[2];
        TextView textView = (TextView) objArrT[3];
        super(dataBindingComponent, view, constraintLayout, imageView, textView, (TextView) objArrT[4], (TextView) objArrT[1]);
        this.G = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        this.F = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 == i) {
            L((HealthierBottomSheetFragment) obj);
            return true;
        }
        if (273 != i) {
            return false;
        }
        M((HealthierBottomSheetViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.product.details.databinding.FragmentHealthierBottomSheetBinding
    public final void L(HealthierBottomSheetFragment healthierBottomSheetFragment) throws Throwable {
        this.D = healthierBottomSheetFragment;
        synchronized (this) {
            this.G |= 2;
        }
        h(92);
        y();
    }

    @Override // au.com.woolworths.product.details.databinding.FragmentHealthierBottomSheetBinding
    public final void M(HealthierBottomSheetViewModel healthierBottomSheetViewModel) throws Throwable {
        this.E = healthierBottomSheetViewModel;
        synchronized (this) {
            this.G |= 4;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.product.details.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        HealthierBottomSheetFragment healthierBottomSheetFragment = this.D;
        if (healthierBottomSheetFragment != null) {
            healthierBottomSheetFragment.dismiss();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        String text;
        ArrayList links;
        String str;
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        HealthierBottomSheetViewModel healthierBottomSheetViewModel = this.E;
        long j2 = 13 & j;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = healthierBottomSheetViewModel != null ? healthierBottomSheetViewModel.h : null;
            I(0, mutableLiveData);
            HealthierBottomSheetContract.ViewState viewState = mutableLiveData != null ? (HealthierBottomSheetContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                text = viewState.b;
                str4 = viewState.f9286a;
                links = viewState.d;
                str3 = viewState.c;
            } else {
                str3 = null;
                text = null;
                str4 = null;
                links = null;
            }
            boolean z3 = str3 == null;
            z2 = str3 != null;
            boolean z4 = z3;
            str = str3;
            z = z4;
            str2 = str4;
        } else {
            z = false;
            z2 = false;
            text = null;
            links = null;
            str = null;
            str2 = null;
        }
        if ((j & 8) != 0) {
            this.z.setOnClickListener(this.F);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.A, z);
            TextView textView = this.A;
            Intrinsics.h(textView, "textView");
            Intrinsics.h(text, "text");
            Intrinsics.h(links, "links");
            ArrayList<Pair> arrayList = links;
            Context context = textView.getContext();
            SpannableString spannableString = new SpannableString(text);
            for (Pair pair : arrayList) {
                String str5 = (String) pair.d;
                SpannableStringExtKt.a(spannableString, str5, null, new b(healthierBottomSheetViewModel, (String) pair.e, str5, context, 2));
                z2 = z2;
            }
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            BindingAdaptersKt.o(this.B, z2);
            BindingAdaptersKt.l(this.B, str, false, healthierBottomSheetViewModel, null);
            TextViewBindingAdapter.b(this.C, str2);
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
            this.G = 8L;
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
            this.G |= 1;
        }
        return true;
    }
}
