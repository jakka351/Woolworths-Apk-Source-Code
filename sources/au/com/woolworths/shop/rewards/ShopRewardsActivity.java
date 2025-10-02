package au.com.woolworths.shop.rewards;

import android.content.Intent;
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
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.offers.RewardsHomeBridgeViewModel;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsActivity;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/rewards/ShopRewardsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShopRewardsActivity extends Hilt_ShopRewardsActivity {
    public final ViewModelLazy A;
    public FeatureToggleManager x;
    public RewardsAccountInteractor y;
    public final ViewModelLazy z;

    public ShopRewardsActivity() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        };
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.z = new ViewModelLazy(reflectionFactory.b(ShopRewardsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, function0, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.A = new ViewModelLazy(reflectionFactory.b(RewardsHomeBridgeViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivity$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        RewardsAccountInteractor rewardsAccountInteractor = this.y;
        if (rewardsAccountInteractor != null) {
            rewardsAccountInteractor.setShouldIncludeUncachedVisitorIdInAnalytics(false);
        } else {
            Intrinsics.p("rewardsAccountInteractor");
            throw null;
        }
    }

    @Override // au.com.woolworths.shop.rewards.Hilt_ShopRewardsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ShopRewardsActivity shopRewardsActivity = ShopRewardsActivity.this;
                    ThemeKt.a(48, composer, ComposableLambdaKt.c(1558991352, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final ShopRewardsActivity shopRewardsActivity2 = shopRewardsActivity;
                                ShopRewardsViewModel shopRewardsViewModel = (ShopRewardsViewModel) shopRewardsActivity2.z.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(shopRewardsActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    final int i = 0;
                                    objG = new Function0() { // from class: au.com.woolworths.shop.rewards.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i2 = i;
                                            Unit unit = Unit.f24250a;
                                            ShopRewardsActivity shopRewardsActivity3 = shopRewardsActivity2;
                                            switch (i2) {
                                                case 0:
                                                    shopRewardsActivity3.finish();
                                                    break;
                                                default:
                                                    int i3 = RewardsSettingsActivity.C;
                                                    shopRewardsActivity3.startActivity(new Intent(shopRewardsActivity3, (Class<?>) RewardsSettingsActivity.class));
                                                    break;
                                            }
                                            return unit;
                                        }
                                    };
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(shopRewardsActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    final int i2 = 1;
                                    objG2 = new Function0() { // from class: au.com.woolworths.shop.rewards.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i22 = i2;
                                            Unit unit = Unit.f24250a;
                                            ShopRewardsActivity shopRewardsActivity3 = shopRewardsActivity2;
                                            switch (i22) {
                                                case 0:
                                                    shopRewardsActivity3.finish();
                                                    break;
                                                default:
                                                    int i3 = RewardsSettingsActivity.C;
                                                    shopRewardsActivity3.startActivity(new Intent(shopRewardsActivity3, (Class<?>) RewardsSettingsActivity.class));
                                                    break;
                                            }
                                            return unit;
                                        }
                                    };
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                ShopRewardsActivityUiKt.d(shopRewardsViewModel, function0, (Function0) objG2, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 624140517));
        Activities.ShopRewardsActivity.Extras extras = (Activities.ShopRewardsActivity.Extras) getIntent().getParcelableExtra("EXTRA_OFFER_INFO");
        if (extras == null || (str = extras.d) == null) {
            return;
        }
        ((RewardsHomeBridgeViewModel) this.A.getD()).i.f(str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String str;
        Intrinsics.h(intent, "intent");
        super.onNewIntent(intent);
        Activities.ShopRewardsActivity.Extras extras = (Activities.ShopRewardsActivity.Extras) intent.getParcelableExtra("EXTRA_OFFER_INFO");
        if (extras == null || (str = extras.d) == null) {
            return;
        }
        ((RewardsHomeBridgeViewModel) this.A.getD()).i.f(str);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        RewardsAccountInteractor rewardsAccountInteractor = this.y;
        if (rewardsAccountInteractor != null) {
            rewardsAccountInteractor.setShouldIncludeUncachedVisitorIdInAnalytics(true);
        } else {
            Intrinsics.p("rewardsAccountInteractor");
            throw null;
        }
    }
}
