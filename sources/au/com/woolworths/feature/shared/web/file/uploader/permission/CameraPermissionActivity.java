package au.com.woolworths.feature.shared.web.file.uploader.permission;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.design.wx.foundation.ThemeContext;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shared/web/file/uploader/permission/CameraPermissionActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "web-file-uploader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CameraPermissionActivity extends Hilt_CameraPermissionActivity {
    public static final /* synthetic */ int z = 0;
    public AppIdentifier w;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(CameraPermissionViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final ActivityResultLauncher y = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new androidx.activity.compose.a(this, 7));

    @Override // au.com.woolworths.feature.shared.web.file.uploader.permission.Hilt_CameraPermissionActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new CameraPermissionActivity$observeData$1(this, null), 3);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionActivity.onCreate.1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionActivity$onCreate$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[AppIdentifier.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        AppIdentifier appIdentifier = AppIdentifier.d;
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ThemeContext themeContext;
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final CameraPermissionActivity cameraPermissionActivity = CameraPermissionActivity.this;
                    AppIdentifier appIdentifier = cameraPermissionActivity.w;
                    if (appIdentifier == null) {
                        Intrinsics.p("appIdentifier");
                        throw null;
                    }
                    int iOrdinal = appIdentifier.ordinal();
                    if (iOrdinal == 0) {
                        themeContext = ThemeContext.d;
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        themeContext = ThemeContext.e;
                    }
                    ThemeKt.c(themeContext, ComposableLambdaKt.c(894015307, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            final CameraPermissionActivity cameraPermissionActivity2 = cameraPermissionActivity;
                            ViewModelLazy viewModelLazy = cameraPermissionActivity2.x;
                            if ((iIntValue & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = CameraPermissionActivity.z;
                                CameraPermissionViewModel cameraPermissionViewModel = (CameraPermissionViewModel) viewModelLazy.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(cameraPermissionActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    CameraPermissionActivity$onCreate$1$1$1$1 cameraPermissionActivity$onCreate$1$1$1$1 = new CameraPermissionActivity$onCreate$1$1$1$1(0, cameraPermissionActivity2, CameraPermissionActivity.class, "openSettings", "openSettings()V", 0);
                                    composer2.A(cameraPermissionActivity$onCreate$1$1$1$1);
                                    objG = cameraPermissionActivity$onCreate$1$1$1$1;
                                }
                                KFunction kFunction = (KFunction) objG;
                                composer2.l();
                                CameraPermissionViewModel cameraPermissionViewModel2 = (CameraPermissionViewModel) viewModelLazy.getD();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(cameraPermissionViewModel2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    CameraPermissionActivity$onCreate$1$1$2$1 cameraPermissionActivity$onCreate$1$1$2$1 = new CameraPermissionActivity$onCreate$1$1$2$1(0, cameraPermissionViewModel2, CameraPermissionViewModel.class, "onEnableButtonClick", "onEnableButtonClick()V", 0);
                                    composer2.A(cameraPermissionActivity$onCreate$1$1$2$1);
                                    objG2 = cameraPermissionActivity$onCreate$1$1$2$1;
                                }
                                KFunction kFunction2 = (KFunction) objG2;
                                composer2.l();
                                AppIdentifier appIdentifier2 = cameraPermissionActivity2.w;
                                if (appIdentifier2 == null) {
                                    Intrinsics.p("appIdentifier");
                                    throw null;
                                }
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(cameraPermissionActivity2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    final int i2 = 0;
                                    objG3 = new Function0() { // from class: au.com.woolworths.feature.shared.web.file.uploader.permission.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i3 = i2;
                                            Unit unit = Unit.f24250a;
                                            CameraPermissionActivity cameraPermissionActivity3 = cameraPermissionActivity2;
                                            switch (i3) {
                                                case 0:
                                                    if (!cameraPermissionActivity3.isFinishing()) {
                                                        cameraPermissionActivity3.finish();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    int i4 = CameraPermissionActivity.z;
                                                    if (!cameraPermissionActivity3.isFinishing()) {
                                                        cameraPermissionActivity3.setResult(-1);
                                                        cameraPermissionActivity3.finish();
                                                        break;
                                                    }
                                                    break;
                                            }
                                            return unit;
                                        }
                                    };
                                    composer2.A(objG3);
                                }
                                Function0 function0 = (Function0) objG3;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(cameraPermissionActivity2);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    final int i3 = 1;
                                    objG4 = new Function0() { // from class: au.com.woolworths.feature.shared.web.file.uploader.permission.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i32 = i3;
                                            Unit unit = Unit.f24250a;
                                            CameraPermissionActivity cameraPermissionActivity3 = cameraPermissionActivity2;
                                            switch (i32) {
                                                case 0:
                                                    if (!cameraPermissionActivity3.isFinishing()) {
                                                        cameraPermissionActivity3.finish();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    int i4 = CameraPermissionActivity.z;
                                                    if (!cameraPermissionActivity3.isFinishing()) {
                                                        cameraPermissionActivity3.setResult(-1);
                                                        cameraPermissionActivity3.finish();
                                                        break;
                                                    }
                                                    break;
                                            }
                                            return unit;
                                        }
                                    };
                                    composer2.A(objG4);
                                }
                                composer2.l();
                                CameraPermissionActivityKt.a(function0, (Function0) objG4, (Function0) kFunction2, (Function0) kFunction, cameraPermissionViewModel, appIdentifier2, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer), composer, 48);
                }
                return Unit.f24250a;
            }
        }, true, -1679669081));
    }
}
