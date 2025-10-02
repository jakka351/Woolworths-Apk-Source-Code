package au.com.woolworths.shop.addtolist.databinding;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonBindingKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListContract;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListViewModel;
import au.com.woolworths.shop.addtolist.generated.callback.AfterTextChanged;
import au.com.woolworths.shop.addtolist.generated.callback.Function0;
import au.com.woolworths.shop.addtolist.generated.callback.StatefulButtonClickHandler;
import au.com.woolworths.shop.addtolist.utils.a;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class ActivityCreateUpdateShoppingListBindingImpl extends ActivityCreateUpdateShoppingListBinding implements Function0.Listener, StatefulButtonClickHandler.Listener, AfterTextChanged.Listener {
    public static final SparseIntArray L;
    public final Function0 H;
    public final StatefulButtonClickHandler I;
    public final AfterTextChanged J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 6);
        sparseIntArray.put(R.id.title_layout, 7);
        sparseIntArray.put(R.id.color_picker, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityCreateUpdateShoppingListBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 9, null, L);
        super(dataBindingComponent, view, (LinearLayout) objArrT[8], (CoordinatorLayout) objArrT[0], (ImageView) objArrT[2], (StatefulButton) objArrT[5], (TextInputEditText) objArrT[4], (TextInputLayout) objArrT[3], (ConstraintLayout) objArrT[7], (Toolbar) objArrT[1]);
        this.K = -1L;
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.F.setTag(null);
        E(view);
        this.H = new Function0(this);
        this.I = new StatefulButtonClickHandler(this, 3);
        this.J = new AfterTextChanged(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((CreateUpdateShoppingListViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.addtolist.databinding.ActivityCreateUpdateShoppingListBinding
    public final void L(CreateUpdateShoppingListViewModel createUpdateShoppingListViewModel) throws Throwable {
        this.G = createUpdateShoppingListViewModel;
        synchronized (this) {
            this.K |= 2;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.shop.addtolist.generated.callback.StatefulButtonClickHandler.Listener
    public final void b(int i) {
        CreateUpdateShoppingListViewModel createUpdateShoppingListViewModel = this.G;
        if (createUpdateShoppingListViewModel != null) {
            createUpdateShoppingListViewModel.r6();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        long j2;
        int i;
        String string;
        String string2;
        String title;
        StatefulButtonState statefulButtonState;
        CreateUpdateShoppingListContract.ActivityMode activityMode;
        ShoppingList shoppingList;
        int color;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        CreateUpdateShoppingListViewModel createUpdateShoppingListViewModel = this.G;
        long j3 = j & 7;
        if (j3 != 0) {
            MutableLiveData mutableLiveData = createUpdateShoppingListViewModel != null ? createUpdateShoppingListViewModel.k : null;
            I(0, mutableLiveData);
            CreateUpdateShoppingListContract.ViewState viewState = mutableLiveData != null ? (CreateUpdateShoppingListContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                shoppingList = viewState.b;
                statefulButtonState = viewState.c ? StatefulButtonState.e : !viewState.d ? StatefulButtonState.f : StatefulButtonState.d;
                activityMode = viewState.f10124a;
                i = 40;
            } else {
                i = 0;
                activityMode = null;
                shoppingList = null;
                statefulButtonState = null;
            }
            if (shoppingList != null) {
                color = shoppingList.getColor();
                title = shoppingList.getTitle();
            } else {
                color = 0;
                title = null;
            }
            boolean z = activityMode == CreateUpdateShoppingListContract.ActivityMode.d;
            j2 = 0;
            i = activityMode == CreateUpdateShoppingListContract.ActivityMode.f ? 1 : 0;
            if (j3 != 0) {
                j |= z ? 64L : 32L;
            }
            if ((j & 7) != 0) {
                j |= i != 0 ? 16L : 8L;
            }
            string = this.F.getResources().getString(z ? R.string.shop_lists_create_list_title : R.string.shop_lists_edit_list_title);
            string2 = this.B.getResources().getString(i != 0 ? R.string.shop_lists_button_update : R.string.shop_lists_button_create);
            i = color;
        } else {
            j2 = 0;
            i = 0;
            string = null;
            string2 = null;
            title = null;
            statefulButtonState = null;
        }
        if ((j & 7) != j2) {
            ImageView imageView = this.A;
            Intrinsics.h(imageView, "imageView");
            ColorStateList backgroundTintList = imageView.getBackgroundTintList();
            Integer numValueOf = backgroundTintList != null ? Integer.valueOf(backgroundTintList.getDefaultColor()) : null;
            if (numValueOf == null || numValueOf.intValue() != i) {
                if (numValueOf == null) {
                    imageView.setBackgroundTintList(ColorStateList.valueOf(i));
                } else {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(numValueOf.intValue(), i);
                    valueAnimatorOfInt.setDuration(1000L);
                    valueAnimatorOfInt.setEvaluator(new ArgbEvaluator());
                    valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator(2.0f));
                    valueAnimatorOfInt.addUpdateListener(new a(imageView, 0));
                    valueAnimatorOfInt.start();
                }
            }
            this.B.setStatefulButtonState(statefulButtonState);
            StatefulButtonBindingKt.a(this.B, string2);
            TextViewBindingAdapter.b(this.C, title);
            this.D.setCounterMaxLength(i);
            this.F.setTitle(string);
        }
        if ((j & 4) != j2) {
            this.B.setClickHandler(this.I);
            TextInputEditText editText = this.C;
            Function0 action = this.H;
            Intrinsics.h(editText, "editText");
            Intrinsics.h(action, "action");
            editText.setOnEditorActionListener(new au.com.woolworths.android.onesite.bindings.a(action));
            TextViewBindingAdapter.c(this.C, null, this.J);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.K = 4L;
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
            this.K |= 1;
        }
        return true;
    }
}
