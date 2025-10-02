package au.com.woolworths.shop.lists.ui.guest.onboarding;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.supers.lists.WatchlistAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.shop.cart.ui.c;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/lists/ui/guest/onboarding/ShopListGuestOnboardingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class ShopListGuestOnboardingActivity extends Hilt_ShopListGuestOnboardingActivity {
    public static final /* synthetic */ int C = 0;
    public final ActivityResultLauncher A;
    public final Lazy B = LazyKt.b(new c(this, 16));
    public FeatureToggleManager x;
    public AnalyticsManager y;
    public final ActivityResultLauncher z;

    public ShopListGuestOnboardingActivity() {
        final int i = 0;
        this.z = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.shop.lists.ui.guest.onboarding.a
            public final /* synthetic */ ShopListGuestOnboardingActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                int i2 = i;
                Activities.MainActivity mainActivity = Activities.MainActivity.f4487a;
                ShopListGuestOnboardingActivity shopListGuestOnboardingActivity = this.e;
                ActivityResult result = (ActivityResult) obj;
                switch (i2) {
                    case 0:
                        int i3 = ShopListGuestOnboardingActivity.C;
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            shopListGuestOnboardingActivity.startActivity(mainActivity.b());
                            shopListGuestOnboardingActivity.finish();
                            break;
                        }
                        break;
                    default:
                        int i4 = ShopListGuestOnboardingActivity.C;
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            shopListGuestOnboardingActivity.startActivity(mainActivity.b());
                            shopListGuestOnboardingActivity.finish();
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        this.A = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.shop.lists.ui.guest.onboarding.a
            public final /* synthetic */ ShopListGuestOnboardingActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                int i22 = i2;
                Activities.MainActivity mainActivity = Activities.MainActivity.f4487a;
                ShopListGuestOnboardingActivity shopListGuestOnboardingActivity = this.e;
                ActivityResult result = (ActivityResult) obj;
                switch (i22) {
                    case 0:
                        int i3 = ShopListGuestOnboardingActivity.C;
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            shopListGuestOnboardingActivity.startActivity(mainActivity.b());
                            shopListGuestOnboardingActivity.finish();
                            break;
                        }
                        break;
                    default:
                        int i4 = ShopListGuestOnboardingActivity.C;
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            shopListGuestOnboardingActivity.startActivity(mainActivity.b());
                            shopListGuestOnboardingActivity.finish();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static final void O4(ShopListGuestOnboardingActivity shopListGuestOnboardingActivity) {
        if (((Activities.ShopListGuestOnboardingActivity.Extras) shopListGuestOnboardingActivity.B.getD()).d == Activities.ShopListGuestOnboardingActivity.ListFeature.d) {
            AnalyticsManager analyticsManager = shopListGuestOnboardingActivity.y;
            if (analyticsManager == null) {
                Intrinsics.p("analyticsManager");
                throw null;
            }
            analyticsManager.g(WatchlistAnalytics.Guest.Action.d);
        }
        shopListGuestOnboardingActivity.z.a(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), null);
    }

    public static final void P4(ShopListGuestOnboardingActivity shopListGuestOnboardingActivity) {
        if (((Activities.ShopListGuestOnboardingActivity.Extras) shopListGuestOnboardingActivity.B.getD()).d == Activities.ShopListGuestOnboardingActivity.ListFeature.d) {
            AnalyticsManager analyticsManager = shopListGuestOnboardingActivity.y;
            if (analyticsManager == null) {
                Intrinsics.p("analyticsManager");
                throw null;
            }
            analyticsManager.g(WatchlistAnalytics.Guest.Action.e);
        }
        shopListGuestOnboardingActivity.A.a(ActivityNavigatorKt.a(Activities.SignUp.f4536a, ApplicationType.e), null);
    }

    @Override // au.com.woolworths.shop.lists.ui.guest.onboarding.Hilt_ShopListGuestOnboardingActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.guest.onboarding.ShopListGuestOnboardingActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ShopListGuestOnboardingActivity shopListGuestOnboardingActivity = ShopListGuestOnboardingActivity.this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(294365685, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.guest.onboarding.ShopListGuestOnboardingActivity.onCreate.1.1

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: au.com.woolworths.shop.lists.ui.guest.onboarding.ShopListGuestOnboardingActivity$onCreate$1$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            static {
                                int[] iArr = new int[Activities.ShopListGuestOnboardingActivity.ListFeature.values().length];
                                try {
                                    iArr[0] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    Activities.ShopListGuestOnboardingActivity.ListFeature listFeature = Activities.ShopListGuestOnboardingActivity.ListFeature.d;
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
                                int i = ShopListGuestOnboardingActivity.C;
                                ShopListGuestOnboardingActivity shopListGuestOnboardingActivity2 = shopListGuestOnboardingActivity;
                                int iOrdinal = ((Activities.ShopListGuestOnboardingActivity.Extras) shopListGuestOnboardingActivity2.B.getD()).d.ordinal();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (iOrdinal == 0) {
                                    composer2.o(-874943238);
                                    composer2.o(5004770);
                                    boolean zI = composer2.I(shopListGuestOnboardingActivity2);
                                    Object objG = composer2.G();
                                    if (zI || objG == composer$Companion$Empty$1) {
                                        objG = new ShopListGuestOnboardingActivity$onCreate$1$1$1$1(0, shopListGuestOnboardingActivity2, ShopListGuestOnboardingActivity.class, "launchLogIn", "launchLogIn()V", 0);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    Function0 function0 = (Function0) ((KFunction) objG);
                                    composer2.o(5004770);
                                    boolean zI2 = composer2.I(shopListGuestOnboardingActivity2);
                                    Object objG2 = composer2.G();
                                    if (zI2 || objG2 == composer$Companion$Empty$1) {
                                        ShopListGuestOnboardingActivity$onCreate$1$1$2$1 shopListGuestOnboardingActivity$onCreate$1$1$2$1 = new ShopListGuestOnboardingActivity$onCreate$1$1$2$1(0, shopListGuestOnboardingActivity2, ShopListGuestOnboardingActivity.class, "launchSignUp", "launchSignUp()V", 0);
                                        composer2.A(shopListGuestOnboardingActivity$onCreate$1$1$2$1);
                                        objG2 = shopListGuestOnboardingActivity$onCreate$1$1$2$1;
                                    }
                                    composer2.l();
                                    Function0 function02 = (Function0) ((KFunction) objG2);
                                    composer2.o(5004770);
                                    boolean zI3 = composer2.I(shopListGuestOnboardingActivity2);
                                    Object objG3 = composer2.G();
                                    if (zI3 || objG3 == composer$Companion$Empty$1) {
                                        ShopListGuestOnboardingActivity$onCreate$1$1$3$1 shopListGuestOnboardingActivity$onCreate$1$1$3$1 = new ShopListGuestOnboardingActivity$onCreate$1$1$3$1(0, shopListGuestOnboardingActivity2, ShopListGuestOnboardingActivity.class, "finish", "finish()V", 0);
                                        composer2.A(shopListGuestOnboardingActivity$onCreate$1$1$3$1);
                                        objG3 = shopListGuestOnboardingActivity$onCreate$1$1$3$1;
                                    }
                                    composer2.l();
                                    ShopListGuestOnboardingScreenKt.a(R.string.shop_lists_watchlist_onboarding_screen_title, R.drawable.shop_lists_watchlist_onboarding_image, R.string.shop_lists_watchlist_onboarding_title, R.string.shop_lists_watchlist_onboarding_subtitle, function0, function02, (Function0) ((KFunction) objG3), composer2, 0);
                                    composer2.l();
                                } else {
                                    if (iOrdinal != 1) {
                                        throw au.com.woolworths.android.onesite.a.x(composer2, -582416213);
                                    }
                                    composer2.o(-874230579);
                                    composer2.o(5004770);
                                    boolean zI4 = composer2.I(shopListGuestOnboardingActivity2);
                                    Object objG4 = composer2.G();
                                    if (zI4 || objG4 == composer$Companion$Empty$1) {
                                        objG4 = new ShopListGuestOnboardingActivity$onCreate$1$1$4$1(0, shopListGuestOnboardingActivity2, ShopListGuestOnboardingActivity.class, "launchLogIn", "launchLogIn()V", 0);
                                        composer2.A(objG4);
                                    }
                                    composer2.l();
                                    Function0 function03 = (Function0) ((KFunction) objG4);
                                    composer2.o(5004770);
                                    boolean zI5 = composer2.I(shopListGuestOnboardingActivity2);
                                    Object objG5 = composer2.G();
                                    if (zI5 || objG5 == composer$Companion$Empty$1) {
                                        ShopListGuestOnboardingActivity$onCreate$1$1$5$1 shopListGuestOnboardingActivity$onCreate$1$1$5$1 = new ShopListGuestOnboardingActivity$onCreate$1$1$5$1(0, shopListGuestOnboardingActivity2, ShopListGuestOnboardingActivity.class, "launchSignUp", "launchSignUp()V", 0);
                                        composer2.A(shopListGuestOnboardingActivity$onCreate$1$1$5$1);
                                        objG5 = shopListGuestOnboardingActivity$onCreate$1$1$5$1;
                                    }
                                    composer2.l();
                                    Function0 function04 = (Function0) ((KFunction) objG5);
                                    composer2.o(5004770);
                                    boolean zI6 = composer2.I(shopListGuestOnboardingActivity2);
                                    Object objG6 = composer2.G();
                                    if (zI6 || objG6 == composer$Companion$Empty$1) {
                                        ShopListGuestOnboardingActivity$onCreate$1$1$6$1 shopListGuestOnboardingActivity$onCreate$1$1$6$1 = new ShopListGuestOnboardingActivity$onCreate$1$1$6$1(0, shopListGuestOnboardingActivity2, ShopListGuestOnboardingActivity.class, "finish", "finish()V", 0);
                                        composer2.A(shopListGuestOnboardingActivity$onCreate$1$1$6$1);
                                        objG6 = shopListGuestOnboardingActivity$onCreate$1$1$6$1;
                                    }
                                    composer2.l();
                                    ShopListGuestOnboardingScreenKt.a(R.string.shop_lists_snap_onboarding_screen_title, R.drawable.img_onboarding_welcome, R.string.shop_lists_snap_onboarding_title, R.string.shop_lists_snap_onboarding_subtitle, function03, function04, (Function0) ((KFunction) objG6), composer2, 0);
                                    composer2.l();
                                }
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -756809775));
    }
}
