package au.com.woolworths.shop.checkout.ui.timeselector;

import android.os.Build;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TimeSelectorActivity extends Hilt_TimeSelectorActivity {
    public static final /* synthetic */ int y = 0;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(TimeSelectorViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Override // au.com.woolworths.shop.checkout.ui.timeselector.Hilt_TimeSelectorActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Integer num;
        super.onCreate(bundle);
        Activities.TimeSelectorActivity.Extras extras = null;
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle extras2 = getIntent().getExtras();
            if (extras2 != null) {
                extras = (Activities.TimeSelectorActivity.Extras) extras2.getParcelable("EXTRA_DATA", Activities.TimeSelectorActivity.Extras.class);
            }
        } else {
            Bundle extras3 = getIntent().getExtras();
            if (extras3 != null) {
                extras = (Activities.TimeSelectorActivity.Extras) extras3.getParcelable("EXTRA_DATA");
            }
        }
        if (extras != null && (num = extras.d) != null) {
            ((TimeSelectorViewModel) this.x.getD()).m = Integer.valueOf(num.intValue());
        }
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorActivity.onCreate.2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final TimeSelectorActivity timeSelectorActivity = TimeSelectorActivity.this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-489371483, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorActivity.onCreate.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = TimeSelectorActivity.y;
                                TimeSelectorActivity timeSelectorActivity2 = timeSelectorActivity;
                                TimeSelectorViewModel timeSelectorViewModel = (TimeSelectorViewModel) timeSelectorActivity2.x.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(timeSelectorActivity2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new a(timeSelectorActivity2, 1);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                TimeSelectorScreenKt.a(timeSelectorViewModel, (Function0) objG, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 343464521));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((TimeSelectorViewModel) this.x.getD()).s6();
    }
}
