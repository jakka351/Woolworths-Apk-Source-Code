package au.com.woolworths.feature.shop.healthylifefoodtracker;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.core.content.IntentCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerContract;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerContentFeed;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerPage;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.FoodTrackerPageKt;
import com.google.accompanist.systemuicontroller.AndroidSystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/healthylifefoodtracker/FoodTrackerActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FoodTrackerActivity extends Hilt_FoodTrackerActivity {
    public static final /* synthetic */ int z = 0;
    public FeatureToggleManager w;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(FoodTrackerViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy y = LazyKt.b(new Function0<Activities.ShopHealthyLifeFoodTrackerActivity.FoodTrackerExtras>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerActivity$special$$inlined$extraOrNull$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return (Parcelable) IntentCompat.a(this.d.getIntent(), "EXTRA_DATA", Activities.ShopHealthyLifeFoodTrackerActivity.FoodTrackerExtras.class);
        }
    });

    public final FoodTrackerViewModel N4() {
        return (FoodTrackerViewModel) this.x.getD();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [au.com.woolworths.feature.shop.healthylifefoodtracker.b] */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10006) {
            final FoodTrackerViewModel foodTrackerViewModelN4 = N4();
            if (i2 == -1) {
                foodTrackerViewModelN4.p6(new Function1() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        if (((FoodTrackerPage) obj) instanceof FoodTrackerContentFeed) {
                            FoodTrackerViewModel foodTrackerViewModel = foodTrackerViewModelN4;
                            BuildersKt.c(ViewModelKt.a(foodTrackerViewModel), null, null, new FoodTrackerViewModel$onEdrLinkResult$1$1$1(foodTrackerViewModel, null), 3);
                        }
                        return Unit.f24250a;
                    }
                });
            }
        }
    }

    @Override // au.com.woolworths.feature.shop.healthylifefoodtracker.Hilt_FoodTrackerActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowCompat.b(getWindow(), false);
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FoodTrackerActivity$collectActions$1(2, this, FoodTrackerActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/healthylifefoodtracker/FoodTrackerContract$Action;)V", 4), FlowExtKt.a(N4().i, getD(), Lifecycle.State.h)), LifecycleOwnerKt.a(this));
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue() & 3;
                Unit unit = Unit.f24250a;
                if (iIntValue == 2 && composer.c()) {
                    composer.j();
                    return unit;
                }
                AndroidSystemUiController androidSystemUiControllerA = SystemUiControllerKt.a(composer);
                composer.o(5004770);
                boolean zN = composer.n(androidSystemUiControllerA);
                Object objG = composer.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    objG = new FoodTrackerActivity$onCreate$1$1$1(androidSystemUiControllerA, null);
                    composer.A(objG);
                }
                composer.l();
                EffectsKt.e(composer, unit, (Function2) objG);
                final FoodTrackerActivity foodTrackerActivity = FoodTrackerActivity.this;
                ThemeKt.b(6, composer, ComposableLambdaKt.c(-549544264, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerActivity.onCreate.1.2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Composer composer2 = (Composer) obj3;
                        if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            int i = FoodTrackerActivity.z;
                            final FoodTrackerActivity foodTrackerActivity2 = foodTrackerActivity;
                            MutableState mutableStateB = LiveDataAdapterKt.b(foodTrackerActivity2.N4().j, FoodTrackerContract.ViewState.h, composer2);
                            FoodTrackerViewModel foodTrackerViewModelN4 = foodTrackerActivity2.N4();
                            composer2.o(5004770);
                            boolean zI = composer2.I(foodTrackerActivity2);
                            Object objG2 = composer2.G();
                            if (zI || objG2 == Composer.Companion.f1624a) {
                                objG2 = new Function0() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.a
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        foodTrackerActivity2.finish();
                                        return Unit.f24250a;
                                    }
                                };
                                composer2.A(objG2);
                            }
                            composer2.l();
                            FoodTrackerPageKt.a(mutableStateB, foodTrackerViewModelN4, (Function0) objG2, composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composer));
                return unit;
            }
        }, true, 1222232576));
        FoodTrackerViewModel foodTrackerViewModelN4 = N4();
        Activities.ShopHealthyLifeFoodTrackerActivity.FoodTrackerExtras foodTrackerExtras = (Activities.ShopHealthyLifeFoodTrackerActivity.FoodTrackerExtras) this.y.getD();
        foodTrackerViewModelN4.k = foodTrackerExtras != null ? foodTrackerExtras.d : null;
        N4().p6(null);
    }
}
