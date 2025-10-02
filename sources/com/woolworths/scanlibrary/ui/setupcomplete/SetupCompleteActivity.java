package com.woolworths.scanlibrary.ui.setupcomplete;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity;
import com.woolworths.scanlibrary.base.dagger.NoBackHandler;
import com.woolworths.scanlibrary.databinding.ActivitySetupCompleteBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/setupcomplete/SetupCompleteActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseMvvmActivity;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SetupCompleteActivity extends DaggerBaseMvvmActivity {
    public static final /* synthetic */ int F = 0;
    public final ViewModelLazy E = new ViewModelLazy(Reflection.f24268a.b(SetupUpCompleteViewModel.class), new Function0<ViewModelStore>() { // from class: com.woolworths.scanlibrary.ui.setupcomplete.SetupCompleteActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new c(this, 23), new Function0<CreationExtras>() { // from class: com.woolworths.scanlibrary.ui.setupcomplete.SetupCompleteActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/setupcomplete/SetupCompleteActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(FragmentActivity fragmentActivity) {
            Intent intent = new Intent(fragmentActivity, (Class<?>) SetupCompleteActivity.class);
            intent.addFlags(0);
            fragmentActivity.startActivity(intent);
            fragmentActivity.finish();
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final int O4() {
        return R.layout.activity_setup_complete;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final void R4() {
        ActivitySetupCompleteBinding activitySetupCompleteBinding = (ActivitySetupCompleteBinding) DataBindingUtil.d(this, R.layout.activity_setup_complete);
        if (activitySetupCompleteBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activitySetupCompleteBinding.L((SetupUpCompleteViewModel) this.E.getD());
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new SetupCompleteActivity$subscribeActions$1(this, null), 3);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final boolean S4() {
        return false;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getOnBackPressedDispatcher().a(this, new NoBackHandler(true));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((SetupUpCompleteViewModel) this.E.getD()).k.a(Screens.n);
    }
}
