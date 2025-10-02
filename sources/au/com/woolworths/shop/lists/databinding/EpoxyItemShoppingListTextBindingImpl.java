package au.com.woolworths.shop.lists.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.a;
import au.com.woolworths.shop.lists.generated.callback.AfterTextChanged;
import au.com.woolworths.shop.lists.generated.callback.Function0;
import au.com.woolworths.shop.lists.generated.callback.OnCheckedChangeListener;
import au.com.woolworths.shop.lists.generated.callback.OnClickListener;
import au.com.woolworths.shop.lists.generated.callback.OnFocusChangeListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel;
import au.com.woolworths.shop.lists.ui.utils.BindingAdaptersKt;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyItemShoppingListTextBindingImpl extends EpoxyItemShoppingListTextBinding implements OnClickListener.Listener, Function0.Listener, AfterTextChanged.Listener, OnFocusChangeListener.Listener, OnCheckedChangeListener.Listener {
    public static final SparseIntArray N;
    public final OnClickListener G;
    public final Function0 H;
    public final AfterTextChanged I;
    public final OnClickListener J;
    public final OnFocusChangeListener K;
    public final OnCheckedChangeListener L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.vertical_guideline, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemShoppingListTextBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, N);
        CheckBox checkBox = (CheckBox) objArrT[1];
        ImageView imageView = (ImageView) objArrT[4];
        FrameLayout frameLayout = (FrameLayout) objArrT[3];
        EditText editText = (EditText) objArrT[2];
        super(dataBindingComponent, view, checkBox, imageView, frameLayout, editText);
        this.M = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.B.setTag(null);
        E(view);
        this.G = new OnClickListener(this, 6);
        this.H = new Function0(this, 4);
        this.I = new AfterTextChanged(this);
        this.J = new OnClickListener(this, 5);
        this.K = new OnFocusChangeListener(this);
        this.L = new OnCheckedChangeListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (62 == i) {
            this.E = (Boolean) obj;
            synchronized (this) {
                this.M |= 1;
            }
            h(62);
            y();
            return true;
        }
        if (126 == i) {
            return true;
        }
        if (157 == i) {
            this.F = (ShoppingListItemListener) obj;
            synchronized (this) {
                this.M |= 4;
            }
            h(157);
            y();
            return true;
        }
        if (53 == i) {
            this.C = (TextItemUiModel) obj;
            synchronized (this) {
                this.M |= 8;
            }
            h(53);
            y();
            return true;
        }
        if (63 != i) {
            return false;
        }
        this.D = (Boolean) obj;
        synchronized (this) {
            this.M |= 16;
        }
        h(63);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.lists.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        if (i == 5) {
            ShoppingListItemListener shoppingListItemListener = this.F;
            TextItemUiModel textItemUiModel = this.C;
            if (shoppingListItemListener == null || textItemUiModel == null) {
                return;
            }
            shoppingListItemListener.u(textItemUiModel.g);
            return;
        }
        if (i != 6) {
            return;
        }
        ShoppingListItemListener shoppingListItemListener2 = this.F;
        TextItemUiModel textItemUiModel2 = this.C;
        if (shoppingListItemListener2 != null) {
            shoppingListItemListener2.n(textItemUiModel2);
        }
    }

    @Override // au.com.woolworths.shop.lists.generated.callback.OnCheckedChangeListener.Listener
    public final void c(CompoundButton compoundButton, boolean z) {
        ShoppingListItemListener shoppingListItemListener = this.F;
        TextItemUiModel textItemUiModel = this.C;
        if (shoppingListItemListener != null) {
            shoppingListItemListener.d(textItemUiModel, z);
        }
    }

    @Override // au.com.woolworths.shop.lists.generated.callback.Function0.Listener
    public final void d() {
        ShoppingListItemListener shoppingListItemListener = this.F;
        if (shoppingListItemListener != null) {
            shoppingListItemListener.J();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        synchronized (this) {
            j = this.M;
            this.M = 0L;
        }
        Boolean bool = this.E;
        TextItemUiModel textItemUiModel = this.C;
        Boolean bool2 = this.D;
        long j2 = 33 & j;
        boolean zB = j2 != 0 ? ViewDataBinding.B(bool) : false;
        long j3 = 40 & j;
        if (j3 != 0) {
            if (textItemUiModel != null) {
                z2 = textItemUiModel.e;
                String str2 = textItemUiModel.g;
                z4 = textItemUiModel.f12435a.length() == 0;
                str = str2;
            } else {
                z4 = false;
                z2 = false;
                str = null;
            }
            z3 = z2;
            z = !z4;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            str = null;
        }
        long j4 = j & 48;
        boolean zB2 = j4 != 0 ? ViewDataBinding.B(bool2) : false;
        if (j3 != 0) {
            CompoundButtonBindingAdapter.a(this.y, z3);
            this.y.setClickable(z);
            TextViewBindingAdapter.b(this.B, str);
            BindingAdaptersKt.a(this.B, z3);
            BindingAdaptersKt.b(this.B, z2);
        }
        if ((j & 32) != 0) {
            this.y.setOnCheckedChangeListener(this.L);
            this.z.setOnClickListener(this.G);
            this.A.setOnClickListener(this.J);
            this.B.setOnFocusChangeListener(this.K);
            EditText editText = this.B;
            Function0 action = this.H;
            Intrinsics.h(editText, "editText");
            Intrinsics.h(action, "action");
            editText.setOnEditorActionListener(new a(action));
            TextViewBindingAdapter.c(this.B, null, this.I);
        }
        if (j2 != 0) {
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.z, zB);
        }
        if (j4 != 0) {
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(this.A, zB2);
        }
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
            this.M = 32L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
