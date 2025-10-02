package au.com.woolworths.feature.rewards.card.overlay;

import android.os.Bundle;
import android.view.WindowManager;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.a;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.card.analytics.RewardsCardScreen;
import au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract;
import au.com.woolworths.feature.rewards.card.overlay.ui.RewardsCardOverlayScreenKt;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsCardOverlayActivity extends Hilt_RewardsCardOverlayActivity {
    public static final /* synthetic */ int z = 0;
    public AppIdentifier x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(RewardsCardOverlayViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Override // au.com.woolworths.feature.rewards.card.overlay.Hilt_RewardsCardOverlayActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object value;
        super.onCreate(bundle);
        setRequestedOrientation(1);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final RewardsCardOverlayActivity rewardsCardOverlayActivity = RewardsCardOverlayActivity.this;
                    ThemeKt.a(48, composer, ComposableLambdaKt.c(-1781323116, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = RewardsCardOverlayActivity.z;
                                RewardsCardOverlayActivity rewardsCardOverlayActivity2 = rewardsCardOverlayActivity;
                                RewardsCardOverlayViewModel rewardsCardOverlayViewModel = (RewardsCardOverlayViewModel) rewardsCardOverlayActivity2.y.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(rewardsCardOverlayActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    objG = new a(rewardsCardOverlayActivity2, 24);
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(rewardsCardOverlayActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    RewardsCardOverlayActivity$onCreate$1$1$2$1 rewardsCardOverlayActivity$onCreate$1$1$2$1 = new RewardsCardOverlayActivity$onCreate$1$1$2$1(1, rewardsCardOverlayActivity2, RewardsCardOverlayActivity.class, "copyToClipboard", "copyToClipboard(Ljava/lang/String;)V", 0);
                                    composer2.A(rewardsCardOverlayActivity$onCreate$1$1$2$1);
                                    objG2 = rewardsCardOverlayActivity$onCreate$1$1$2$1;
                                }
                                composer2.l();
                                Function1 function1 = (Function1) ((KFunction) objG2);
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(rewardsCardOverlayActivity2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    RewardsCardOverlayActivity$onCreate$1$1$3$1 rewardsCardOverlayActivity$onCreate$1$1$3$1 = new RewardsCardOverlayActivity$onCreate$1$1$3$1(1, rewardsCardOverlayActivity2, RewardsCardOverlayActivity.class, "saveToDigitalWallet", "saveToDigitalWallet(Ljava/lang/String;)V", 0);
                                    composer2.A(rewardsCardOverlayActivity$onCreate$1$1$3$1);
                                    objG3 = rewardsCardOverlayActivity$onCreate$1$1$3$1;
                                }
                                composer2.l();
                                RewardsCardOverlayScreenKt.d(rewardsCardOverlayViewModel, function0, function1, (Function1) ((KFunction) objG3), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 811556033));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        getWindow().setAttributes(attributes);
        RewardsCardOverlayViewModel rewardsCardOverlayViewModel = (RewardsCardOverlayViewModel) this.y.getD();
        RewardsAccountInteractor rewardsAccountInteractor = rewardsCardOverlayViewModel.e;
        rewardsAccountInteractor.setShouldIncludeUncachedVisitorIdInAnalytics(true);
        RewardsCardData cardData = rewardsAccountInteractor.getCardData();
        if (cardData == null) {
            rewardsCardOverlayViewModel.k.k(RewardsCardOverlayContract.Action.Close.f5827a);
            return;
        }
        MutableStateFlow mutableStateFlow = rewardsCardOverlayViewModel.i;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, RewardsCardOverlayContract.ViewState.a((RewardsCardOverlayContract.ViewState) value, RewardsCardData.a(cardData, null, null, "", null, null, 123), false, !rewardsCardOverlayViewModel.m, 2)));
    }

    @Override // au.com.woolworths.feature.rewards.card.overlay.Hilt_RewardsCardOverlayActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((RewardsCardOverlayViewModel) this.y.getD()).e.setShouldIncludeUncachedVisitorIdInAnalytics(false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((RewardsCardOverlayViewModel) this.y.getD()).g.a(RewardsCardScreen.d);
    }
}
