package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import android.os.Bundle;
import android.view.Window;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingViewModel;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderContract;
import au.com.woolworths.geolocation.location.DeviceLocationServiceCallback;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.geolocation.location.LocationsKt;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/geolocation/location/DeviceLocationServiceCallback;", "<init>", "()V", "Mode", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderActivity$Mode;", "mode", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductFinderActivity extends Hilt_ProductFinderActivity implements DeviceLocationServiceCallback {
    public static final /* synthetic */ int C = 0;
    public final ViewModelLazy A;
    public final ViewModelLazy B;
    public LocationInteractor x;
    public PermissionFlagInteractorImpl y;
    public final MutableStateFlow z = StateFlowKt.a(Mode.d);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderActivity$Mode;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Mode {
        public static final Mode d;
        public static final Mode e;
        public static final /* synthetic */ Mode[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            Mode mode = new Mode("ProductFinder", 0);
            d = mode;
            Mode mode2 = new Mode("Onboarding", 1);
            e = mode2;
            Mode[] modeArr = {mode, mode2};
            f = modeArr;
            g = EnumEntriesKt.a(modeArr);
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f.clone();
        }
    }

    public ProductFinderActivity() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        };
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.A = new ViewModelLazy(reflectionFactory.b(ProductFinderViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, function0, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.B = new ViewModelLazy(reflectionFactory.b(ProductFinderOnboardingViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void H4() {
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void I2() {
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void M() {
    }

    public final ProductFinderViewModel O4() {
        return (ProductFinderViewModel) this.A.getD();
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final int P() {
        return R.string.maps_device_location_unavailable_message;
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void i2() {
        LocationInteractor locationInteractor = this.x;
        if (locationInteractor != null) {
            locationInteractor.f(false);
        } else {
            Intrinsics.p("locationInteractor");
            throw null;
        }
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.Hilt_ProductFinderActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowCompat.b(getWindow(), false);
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        if (!O4().h.f7424a.a()) {
            this.z.f(Mode.e);
        }
        getF().a(this, new OnBackPressedCallback() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity$configureBackButtonHandler$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public final void e() {
                this.d.finish();
            }
        });
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity.onCreate.2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ProductFinderActivity productFinderActivity = ProductFinderActivity.this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1486607364, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity.onCreate.2.1

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity$onCreate$2$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            static {
                                int[] iArr = new int[Mode.values().length];
                                try {
                                    iArr[0] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    Mode mode = Mode.d;
                                    iArr[1] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ProductFinderActivity productFinderActivity2 = productFinderActivity;
                                int iOrdinal = ((Mode) FlowExtKt.a(productFinderActivity2.z, composer2).getD()).ordinal();
                                if (iOrdinal == 0) {
                                    composer2.o(2112341228);
                                    ProductFinderScreenKt.c((ProductFinderContract.ViewState) FlowExtKt.a(productFinderActivity2.O4().k, composer2).getD(), productFinderActivity2.O4(), composer2, 0);
                                    composer2.l();
                                } else {
                                    if (iOrdinal != 1) {
                                        throw au.com.woolworths.android.onesite.a.x(composer2, -1594429297);
                                    }
                                    composer2.o(2112624568);
                                    ProductFinderOnboardingViewModel productFinderOnboardingViewModel = (ProductFinderOnboardingViewModel) productFinderActivity2.B.getD();
                                    FillElement fillElement = SizeKt.c;
                                    composer2.o(5004770);
                                    boolean zI = composer2.I(productFinderActivity2);
                                    Object objG = composer2.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        ProductFinderActivity$onCreate$2$1$1$1 productFinderActivity$onCreate$2$1$1$1 = new ProductFinderActivity$onCreate$2$1$1$1(1, productFinderActivity2, ProductFinderActivity.class, "handleOnboardingAction", "handleOnboardingAction(Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$Actions;)V", 0);
                                        composer2.A(productFinderActivity$onCreate$2$1$1$1);
                                        objG = productFinderActivity$onCreate$2$1$1$1;
                                    }
                                    composer2.l();
                                    ProductFinderOnboardingScreenKt.a(productFinderOnboardingViewModel, (Function1) ((KFunction) objG), fillElement, composer2, KyberEngine.KyberPolyBytes);
                                    composer2.l();
                                }
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 2005246284));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ProductFinderActivity$observeActions$1(this, null), 3);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.h(permissions, "permissions");
        Intrinsics.h(grantResults, "grantResults");
        if (i == 101) {
            if (LocationsKt.d(this)) {
                LocationInteractor locationInteractor = this.x;
                if (locationInteractor == null) {
                    Intrinsics.p("locationInteractor");
                    throw null;
                }
                locationInteractor.f(true);
            }
            O4().q6();
        } else {
            super.onRequestPermissionsResult(i, permissions, grantResults);
        }
        PermissionFlagInteractorImpl permissionFlagInteractorImpl = this.y;
        if (permissionFlagInteractorImpl != null) {
            permissionFlagInteractorImpl.e(this, permissions, grantResults);
        } else {
            Intrinsics.p("permissionFlagInteractor");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        O4().q6();
        ProductFinderViewModel productFinderViewModelO4 = O4();
        CloseableCoroutineScope closeableCoroutineScopeA = ViewModelKt.a(productFinderViewModelO4);
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        BuildersKt.c(closeableCoroutineScopeA, DefaultIoScheduler.f, null, new ProductFinderViewModel$fetchContent$1(productFinderViewModelO4, null), 2);
    }
}
