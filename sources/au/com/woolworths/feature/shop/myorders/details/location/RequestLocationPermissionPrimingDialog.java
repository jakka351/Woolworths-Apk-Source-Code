package au.com.woolworths.feature.shop.myorders.details.location;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.myorders.databinding.PrimingDialogBinding;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel;
import au.com.woolworths.feature.shop.myorders.details.models.LocationTrackingPrimingPageContent;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/location/RequestLocationPermissionPrimingDialog;", "Landroidx/fragment/app/DialogFragment;", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RequestLocationPermissionPrimingDialog extends Hilt_RequestLocationPermissionPrimingDialog {
    public final LocationTrackingPrimingPageContent i;
    public final ViewModelLazy j = new ViewModelLazy(Reflection.f24268a.b(OrderDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialog$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialog$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialog$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/location/RequestLocationPermissionPrimingDialog$Companion;", "", "", "TAG", "Ljava/lang/String;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RequestLocationPermissionPrimingDialog(LocationTrackingPrimingPageContent locationTrackingPrimingPageContent) {
        this.i = locationTrackingPrimingPageContent;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.Theme_Wow_Light);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = PrimingDialogBinding.z;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        PrimingDialogBinding primingDialogBinding = (PrimingDialogBinding) ViewDataBinding.q(layoutInflater, R.layout.priming_dialog, viewGroup, false, null);
        ComposeView composeView = primingDialogBinding.y;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialog$onCreateView$1$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final RequestLocationPermissionPrimingDialog requestLocationPermissionPrimingDialog = this.d;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(480330364, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialog$onCreateView$1$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                RequestLocationPermissionPrimingDialog requestLocationPermissionPrimingDialog2 = requestLocationPermissionPrimingDialog;
                                LocationTrackingPrimingPageContent locationTrackingPrimingPageContent = requestLocationPermissionPrimingDialog2.i;
                                String str = locationTrackingPrimingPageContent.f7760a;
                                List list = locationTrackingPrimingPageContent.b;
                                List list2 = locationTrackingPrimingPageContent.c;
                                String str2 = locationTrackingPrimingPageContent.d;
                                composer2.o(5004770);
                                boolean zI = composer2.I(requestLocationPermissionPrimingDialog2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(requestLocationPermissionPrimingDialog2, 3);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                RequestLocationPermissionPrimingDialogContentKt.c(str, list, list2, str2, (Function1) objG, composer2, 0, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1994778052));
        View view = primingDialogBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }
}
