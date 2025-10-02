package com.woolworths.scanlibrary.ui.payment.setup;

import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity;
import com.woolworths.scanlibrary.databinding.ActivityAddPaymentSetupBinding;
import com.woolworths.scanlibrary.ui.parking.a;
import com.woolworths.scanlibrary.ui.setupcomplete.SetupCompleteActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/setup/AddPaymentSetupActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseMvvmActivity;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AddPaymentSetupActivity extends DaggerBaseMvvmActivity {
    public static final /* synthetic */ int G = 0;
    public ActivityAddPaymentSetupBinding E;
    public final ViewModelLazy F = new ViewModelLazy(Reflection.f24268a.b(AddPaymentSetupViewModel.class), new Function0<ViewModelStore>() { // from class: com.woolworths.scanlibrary.ui.payment.setup.AddPaymentSetupActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new c(this, 17), new Function0<CreationExtras>() { // from class: com.woolworths.scanlibrary.ui.payment.setup.AddPaymentSetupActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/setup/AddPaymentSetupActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final int O4() {
        return R.layout.activity_add_payment_setup;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final void R4() {
        ActivityAddPaymentSetupBinding activityAddPaymentSetupBinding = (ActivityAddPaymentSetupBinding) DataBindingUtil.d(this, R.layout.activity_add_payment_setup);
        this.E = activityAddPaymentSetupBinding;
        if (activityAddPaymentSetupBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityAddPaymentSetupBinding.D(this);
        activityAddPaymentSetupBinding.L((AddPaymentSetupViewModel) this.F.getD());
        ActivityAddPaymentSetupBinding activityAddPaymentSetupBinding2 = this.E;
        if (activityAddPaymentSetupBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityAddPaymentSetupBinding2.z.setOnClickListener(new a(this, 2));
        ActivityAddPaymentSetupBinding activityAddPaymentSetupBinding3 = this.E;
        if (activityAddPaymentSetupBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        setSupportActionBar(activityAddPaymentSetupBinding3.y.y);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u();
            supportActionBar.t();
            supportActionBar.s(true);
        }
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AddPaymentSetupActivity$subscribeActions$1(this, null), 3);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final boolean S4() {
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 4001 && i2 == -1) {
            SetupCompleteActivity.Companion.a(this);
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                getOnBackPressedDispatcher().d();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((AddPaymentSetupViewModel) this.F.getD()).h.a(Screens.f);
    }
}
