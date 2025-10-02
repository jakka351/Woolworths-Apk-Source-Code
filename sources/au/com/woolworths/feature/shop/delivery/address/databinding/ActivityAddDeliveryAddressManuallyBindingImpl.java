package au.com.woolworths.feature.shop.delivery.address.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel;
import au.com.woolworths.feature.shop.delivery.address.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.delivery.address.generated.callback.OnFocusChangeListener;
import au.com.woolworths.feature.shop.delivery.address.generated.callback.OnTextChanged;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityAddDeliveryAddressManuallyBindingImpl extends ActivityAddDeliveryAddressManuallyBinding implements OnTextChanged.Listener, OnClickListener.Listener, OnFocusChangeListener.Listener {
    public static final SparseIntArray N;
    public final OnTextChanged H;
    public final OnTextChanged I;
    public final OnClickListener J;
    public final OnFocusChangeListener K;
    public final OnTextChanged L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 7);
        sparseIntArray.put(R.id.toolbar, 8);
        sparseIntArray.put(R.id.street_text_input_layout, 9);
        sparseIntArray.put(R.id.street2_text_input_layout, 10);
        sparseIntArray.put(R.id.suburb_autocomplete_textview, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityAddDeliveryAddressManuallyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 12, null, N);
        Button button = (Button) objArrT[6];
        TextInputEditText textInputEditText = (TextInputEditText) objArrT[4];
        TextInputLayout textInputLayout = (TextInputLayout) objArrT[3];
        TextInputEditText textInputEditText2 = (TextInputEditText) objArrT[1];
        TextInputEditText textInputEditText3 = (TextInputEditText) objArrT[2];
        super(dataBindingComponent, view, button, textInputEditText, textInputLayout, textInputEditText2, textInputEditText3, (AutoCompleteTextView) objArrT[11], (TextInputLayout) objArrT[5], (Toolbar) objArrT[8]);
        this.M = -1L;
        this.y.setTag(null);
        ((CoordinatorLayout) objArrT[0]).setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.E.setTag(null);
        E(view);
        this.H = new OnTextChanged(this, 4);
        this.I = new OnTextChanged(this, 2);
        this.J = new OnClickListener(this);
        this.K = new OnFocusChangeListener(this);
        this.L = new OnTextChanged(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((AddDeliveryAddressManuallyViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.delivery.address.databinding.ActivityAddDeliveryAddressManuallyBinding
    public final void L(AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel) throws Throwable {
        this.G = addDeliveryAddressManuallyViewModel;
        synchronized (this) {
            this.M |= 2;
        }
        h(273);
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() throws android.content.res.Resources.NotFoundException {
        /*
            r12 = this;
            monitor-enter(r12)
            long r0 = r12.M     // Catch: java.lang.Throwable -> Lb9
            r2 = 0
            r12.M = r2     // Catch: java.lang.Throwable -> Lb9
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lb9
            au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel r4 = r12.G
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L6c
            if (r4 == 0) goto L18
            androidx.lifecycle.MutableLiveData r4 = r4.i
            goto L19
        L18:
            r4 = r7
        L19:
            r12.I(r6, r4)
            if (r4 == 0) goto L25
            java.lang.Object r4 = r4.e()
            au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyContract$ViewState r4 = (au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyContract.ViewState) r4
            goto L26
        L25:
            r4 = r7
        L26:
            r8 = 1
            r9 = 4
            if (r4 == 0) goto L3e
            java.lang.String r10 = r4.d
            int r10 = r10.length()
            if (r10 != r9) goto L3e
            java.util.List r10 = r4.e
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L3e
            r10 = r8
            goto L3f
        L3e:
            r10 = r6
        L3f:
            if (r4 == 0) goto L5c
            java.lang.String r11 = r4.b
            boolean r11 = kotlin.text.StringsKt.D(r11)
            if (r11 != 0) goto L5c
            java.lang.String r11 = r4.d
            int r11 = r11.length()
            if (r11 != r9) goto L5c
            java.util.List r9 = r4.e
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L5c
            r6 = r8
        L5c:
            if (r4 == 0) goto L67
            java.lang.String r8 = r4.d
            java.lang.String r9 = r4.c
            java.lang.String r11 = r4.b
            java.lang.String r4 = r4.g
            goto L6e
        L67:
            r4 = r7
            r8 = r4
            r9 = r8
            r11 = r9
            goto L6e
        L6c:
            r10 = r6
            goto L67
        L6e:
            if (r5 == 0) goto L8e
            android.widget.Button r5 = r12.y
            r5.setEnabled(r6)
            com.google.android.material.textfield.TextInputEditText r5 = r12.z
            androidx.databinding.adapters.TextViewBindingAdapter.b(r5, r8)
            com.google.android.material.textfield.TextInputLayout r5 = r12.A
            r5.setError(r4)
            com.google.android.material.textfield.TextInputEditText r4 = r12.B
            androidx.databinding.adapters.TextViewBindingAdapter.b(r4, r11)
            com.google.android.material.textfield.TextInputEditText r4 = r12.C
            androidx.databinding.adapters.TextViewBindingAdapter.b(r4, r9)
            com.google.android.material.textfield.TextInputLayout r4 = r12.E
            r4.setEnabled(r10)
        L8e:
            r4 = 4
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb8
            android.widget.Button r0 = r12.y
            au.com.woolworths.feature.shop.delivery.address.generated.callback.OnClickListener r1 = r12.J
            r0.setOnClickListener(r1)
            com.google.android.material.textfield.TextInputEditText r0 = r12.z
            au.com.woolworths.feature.shop.delivery.address.generated.callback.OnFocusChangeListener r1 = r12.K
            r0.setOnFocusChangeListener(r1)
            com.google.android.material.textfield.TextInputEditText r0 = r12.z
            au.com.woolworths.feature.shop.delivery.address.generated.callback.OnTextChanged r1 = r12.H
            androidx.databinding.adapters.TextViewBindingAdapter.c(r0, r1, r7)
            com.google.android.material.textfield.TextInputEditText r0 = r12.B
            au.com.woolworths.feature.shop.delivery.address.generated.callback.OnTextChanged r1 = r12.L
            androidx.databinding.adapters.TextViewBindingAdapter.c(r0, r1, r7)
            com.google.android.material.textfield.TextInputEditText r0 = r12.C
            au.com.woolworths.feature.shop.delivery.address.generated.callback.OnTextChanged r1 = r12.I
            androidx.databinding.adapters.TextViewBindingAdapter.c(r0, r1, r7)
        Lb8:
            return
        Lb9:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lb9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.delivery.address.databinding.ActivityAddDeliveryAddressManuallyBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.M = 4L;
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
            this.M |= 1;
        }
        return true;
    }
}
