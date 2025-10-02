package com.woolworths.scanlibrary.ui.scanner;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.woolworths.scanlibrary.base.message.NotificationMessageReceiver;
import com.woolworths.scanlibrary.di.ComponentAndroidInjection;
import com.woolworths.scanlibrary.di.user.UserComponent;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.ui.scanner.delegate.InjectionDelegate;
import com.woolworths.scanlibrary.ui.scanner.delegate.InjectionDelegateImpl;
import com.woolworths.scanlibrary.ui.scanner.delegate.SngBaseEvenHost;
import com.woolworths.scanlibrary.ui.scanner.delegate.SngBaseEventDelegate;
import com.woolworths.scanlibrary.ui.scanner.delegate.SngBaseEventDelegateImpl;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/ScannerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/woolworths/scanlibrary/ui/scanner/delegate/SngBaseEvenHost;", "Lcom/woolworths/scanlibrary/ui/scanner/delegate/InjectionDelegate;", "Lcom/woolworths/scanlibrary/ui/scanner/delegate/SngBaseEventDelegate;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ScannerActivity extends AppCompatActivity implements SngBaseEvenHost, InjectionDelegate, SngBaseEventDelegate {
    public static final /* synthetic */ int x = 0;
    public final /* synthetic */ InjectionDelegateImpl t = new InjectionDelegateImpl();
    public final /* synthetic */ SngBaseEventDelegateImpl u = new SngBaseEventDelegateImpl();
    public final ViewModelLazy v = new ViewModelLazy(Reflection.f24268a.b(ScannerViewModel.class), new Function0<ViewModelStore>() { // from class: com.woolworths.scanlibrary.ui.scanner.ScannerActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new c(this, 21), new Function0<CreationExtras>() { // from class: com.woolworths.scanlibrary.ui.scanner.ScannerActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public FeatureToggleManager w;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/ScannerActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InjectionDelegateImpl injectionDelegateImpl = this.t;
        injectionDelegateImpl.getClass();
        injectionDelegateImpl.d = this;
        UserManager componentManager = injectionDelegateImpl.a();
        Intrinsics.h(componentManager, "componentManager");
        if (componentManager.a()) {
            UserComponent userComponent = injectionDelegateImpl.a().k;
            Intrinsics.e(userComponent);
            if (ComponentAndroidInjection.a(userComponent.e(), this)) {
                ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: com.woolworths.scanlibrary.ui.scanner.ScannerActivity.onCreate.1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                            composer.j();
                        } else {
                            final ScannerActivity scannerActivity = ScannerActivity.this;
                            ThemeKt.b(6, composer, ComposableLambdaKt.c(-497522881, new Function2<Composer, Integer, Unit>() { // from class: com.woolworths.scanlibrary.ui.scanner.ScannerActivity.onCreate.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    ScannerActivity scannerActivity2 = scannerActivity;
                                    ViewModelLazy viewModelLazy = scannerActivity2.v;
                                    if ((iIntValue & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        ScannerViewModel scannerViewModel = (ScannerViewModel) viewModelLazy.getD();
                                        composer2.o(5004770);
                                        boolean zI = composer2.I(scannerActivity2);
                                        Object objG = composer2.G();
                                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                        if (zI || objG == composer$Companion$Empty$1) {
                                            ScannerActivity$onCreate$1$1$1$1 scannerActivity$onCreate$1$1$1$1 = new ScannerActivity$onCreate$1$1$1$1(0, scannerActivity2, ScannerActivity.class, "finish", "finish()V", 0);
                                            composer2.A(scannerActivity$onCreate$1$1$1$1);
                                            objG = scannerActivity$onCreate$1$1$1$1;
                                        }
                                        composer2.l();
                                        Function0 function0 = (Function0) ((KFunction) objG);
                                        ScannerViewModel scannerViewModel2 = (ScannerViewModel) viewModelLazy.getD();
                                        composer2.o(5004770);
                                        boolean zI2 = composer2.I(scannerViewModel2);
                                        Object objG2 = composer2.G();
                                        if (zI2 || objG2 == composer$Companion$Empty$1) {
                                            ScannerActivity$onCreate$1$1$2$1 scannerActivity$onCreate$1$1$2$1 = new ScannerActivity$onCreate$1$1$2$1(0, scannerViewModel2, ScannerViewModel.class, "onSettingsClick", "onSettingsClick()V", 0);
                                            composer2.A(scannerActivity$onCreate$1$1$2$1);
                                            objG2 = scannerActivity$onCreate$1$1$2$1;
                                        }
                                        composer2.l();
                                        ScannerScreenKt.a(scannerViewModel, function0, (Function0) ((KFunction) objG2), composer2, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer));
                        }
                        return Unit.f24250a;
                    }
                }, true, -520689017));
                SngBaseEventDelegateImpl sngBaseEventDelegateImpl = this.u;
                sngBaseEventDelegateImpl.getClass();
                sngBaseEventDelegateImpl.d = new WeakReference(this);
                Context applicationContext = getApplication().getApplicationContext();
                Intrinsics.g(applicationContext, "getApplicationContext(...)");
                sngBaseEventDelegateImpl.e = new NotificationMessageReceiver(applicationContext, sngBaseEventDelegateImpl);
                getD().a(sngBaseEventDelegateImpl);
                BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ScannerActivity$observeAction$1(this, null), 3);
                return;
            }
        }
        finish();
    }
}
