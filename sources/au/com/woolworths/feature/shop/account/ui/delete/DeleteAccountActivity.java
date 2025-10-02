package au.com.woolworths.feature.shop.account.ui.delete;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel;
import au.com.woolworths.shop.auth.ShopAuthManager;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/account/ui/delete/DeleteAccountActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DeleteAccountActivity extends Hilt_DeleteAccountActivity {
    public static final /* synthetic */ int z = 0;
    public final ViewModelLazy w = new ViewModelLazy(Reflection.f24268a.b(DeleteAccountViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public FeatureToggleManager x;
    public ShopAuthManager y;

    @Override // au.com.woolworths.feature.shop.account.ui.delete.Hilt_DeleteAccountActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final DeleteAccountActivity deleteAccountActivity = DeleteAccountActivity.this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-500021767, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                DeleteAccountActivity deleteAccountActivity2 = deleteAccountActivity;
                                boolean zI = composer2.I(deleteAccountActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    DeleteAccountActivity$onCreate$1$1$1$1 deleteAccountActivity$onCreate$1$1$1$1 = new DeleteAccountActivity$onCreate$1$1$1$1(0, deleteAccountActivity2, DeleteAccountActivity.class, "finish", "finish()V", 0);
                                    composer2.A(deleteAccountActivity$onCreate$1$1$1$1);
                                    objG = deleteAccountActivity$onCreate$1$1$1$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(deleteAccountActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    DeleteAccountActivity$onCreate$1$1$2$1 deleteAccountActivity$onCreate$1$1$2$1 = new DeleteAccountActivity$onCreate$1$1$2$1(0, deleteAccountActivity2, DeleteAccountActivity.class, "launchHome", "launchHome()V", 0);
                                    composer2.A(deleteAccountActivity$onCreate$1$1$2$1);
                                    objG2 = deleteAccountActivity$onCreate$1$1$2$1;
                                }
                                composer2.l();
                                Function0 function02 = (Function0) ((KFunction) objG2);
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(deleteAccountActivity2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    DeleteAccountActivity$onCreate$1$1$3$1 deleteAccountActivity$onCreate$1$1$3$1 = new DeleteAccountActivity$onCreate$1$1$3$1(0, deleteAccountActivity2, DeleteAccountActivity.class, "logoutUser", "logoutUser()V", 0);
                                    composer2.A(deleteAccountActivity$onCreate$1$1$3$1);
                                    objG3 = deleteAccountActivity$onCreate$1$1$3$1;
                                }
                                composer2.l();
                                DeleteAccountScreenKt.b(function0, function02, (Function0) ((KFunction) objG3), (DeleteAccountViewModel) deleteAccountActivity2.w.getD(), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1508695595));
    }
}
