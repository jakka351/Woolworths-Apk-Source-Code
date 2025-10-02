package au.com.woolworths.feature.shop.wpay.ui.wpay;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import com.google.android.gms.wallet.contract.TaskResultContracts;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class WPayForOrderFragment extends Hilt_WPayForOrderFragment {
    public boolean i;
    public final ViewModelLazy j = new ViewModelLazy(Reflection.f24268a.b(WPayForOrderViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });
    public final ActivityResultLauncher k;

    public WPayForOrderFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new TaskResultContracts.GetPaymentDataResult(), new androidx.activity.compose.a(this, 12));
        Intrinsics.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.k = activityResultLauncherRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final WPayForOrderFragment wPayForOrderFragment = this.d;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1631777565, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                WPayForOrderFragment wPayForOrderFragment2 = wPayForOrderFragment;
                                WPayForOrderViewModel wPayForOrderViewModel = (WPayForOrderViewModel) wPayForOrderFragment2.j.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(wPayForOrderFragment2);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI || objG == obj5) {
                                    objG = new au.com.woolworths.feature.shop.myorders.details.infomodal.a(wPayForOrderFragment2, 17);
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(wPayForOrderFragment2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == obj5) {
                                    objG2 = new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(wPayForOrderFragment2, 19);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                WPayForOrderScreenKt.b(wPayForOrderViewModel, function0, (Function1) objG2, null, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1794070393));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.i) {
            WPayForOrderViewModel.s6((WPayForOrderViewModel) this.j.getD(), null, 15);
        }
        this.i = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        ((WPayForOrderViewModel) this.j.getD()).v = androidx.constraintlayout.core.state.a.h("toString(...)");
    }
}
