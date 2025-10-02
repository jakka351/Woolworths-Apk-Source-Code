package au.com.woolworths.feature.rewards.account.preferences;

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
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContract;
import au.com.woolworths.rewards.base.data.RewardsWebLink;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsPreferenceDetailsActivity extends Hilt_RewardsPreferenceDetailsActivity {
    public static final /* synthetic */ int y = 0;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(RewardsPreferenceDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsActivity$Companion;", "", "", "PUSH_NOTIF_KEY", "Ljava/lang/String;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public final RewardsPreferenceDetailsViewModel O4() {
        return (RewardsPreferenceDetailsViewModel) this.x.getD();
    }

    @Override // au.com.woolworths.feature.rewards.account.preferences.Hilt_RewardsPreferenceDetailsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModelO4 = O4();
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.preferencesKey")) == null) {
            throw new IllegalArgumentException("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.preferencesKey cannot be null");
        }
        rewardsPreferenceDetailsViewModelO4.k = stringExtra;
        O4().l = O4().q6().equals("pushNotifications");
        RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModelO42 = O4();
        Intent intent2 = getIntent();
        rewardsPreferenceDetailsViewModelO42.m = intent2 != null ? intent2.getStringExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.sourceScreen") : null;
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final RewardsPreferenceDetailsActivity rewardsPreferenceDetailsActivity = RewardsPreferenceDetailsActivity.this;
                    CoreThemeKt.b(6, composer, ComposableLambdaKt.c(250916607, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final RewardsPreferenceDetailsActivity rewardsPreferenceDetailsActivity2 = rewardsPreferenceDetailsActivity;
                                ThemeKt.a(48, composer2, ComposableLambdaKt.c(-600163310, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsActivity.onCreate.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        Composer composer3 = (Composer) obj5;
                                        int iIntValue = ((Number) obj6).intValue() & 3;
                                        final int i = 2;
                                        if (iIntValue == 2 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            int i2 = RewardsPreferenceDetailsActivity.y;
                                            final RewardsPreferenceDetailsActivity rewardsPreferenceDetailsActivity3 = rewardsPreferenceDetailsActivity2;
                                            RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModelO43 = rewardsPreferenceDetailsActivity3.O4();
                                            RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModelO44 = rewardsPreferenceDetailsActivity3.O4();
                                            composer3.o(5004770);
                                            boolean zI = composer3.I(rewardsPreferenceDetailsViewModelO44);
                                            Object objG = composer3.G();
                                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                            if (zI || objG == composer$Companion$Empty$1) {
                                                RewardsPreferenceDetailsActivity$onCreate$1$1$1$1$1 rewardsPreferenceDetailsActivity$onCreate$1$1$1$1$1 = new RewardsPreferenceDetailsActivity$onCreate$1$1$1$1$1(0, rewardsPreferenceDetailsViewModelO44, RewardsPreferenceDetailsViewModel.class, "onRetry", "onRetry()V", 0);
                                                composer3.A(rewardsPreferenceDetailsActivity$onCreate$1$1$1$1$1);
                                                objG = rewardsPreferenceDetailsActivity$onCreate$1$1$1$1$1;
                                            }
                                            KFunction kFunction = (KFunction) objG;
                                            composer3.l();
                                            composer3.o(5004770);
                                            boolean zI2 = composer3.I(rewardsPreferenceDetailsActivity3);
                                            Object objG2 = composer3.G();
                                            if (zI2 || objG2 == composer$Companion$Empty$1) {
                                                objG2 = new au.com.woolworths.design.core.ui.component.experimental.chip.e(rewardsPreferenceDetailsActivity3, 12);
                                                composer3.A(objG2);
                                            }
                                            Function2 function2 = (Function2) objG2;
                                            composer3.l();
                                            composer3.o(5004770);
                                            boolean zI3 = composer3.I(rewardsPreferenceDetailsActivity3);
                                            Object objG3 = composer3.G();
                                            final int i3 = 0;
                                            if (zI3 || objG3 == composer$Companion$Empty$1) {
                                                objG3 = new Function1() { // from class: au.com.woolworths.feature.rewards.account.preferences.a
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj7) {
                                                        int i4 = i3;
                                                        Unit unit = Unit.f24250a;
                                                        RewardsPreferenceDetailsActivity rewardsPreferenceDetailsActivity4 = rewardsPreferenceDetailsActivity3;
                                                        switch (i4) {
                                                            case 0:
                                                                RewardsWebLink data = (RewardsWebLink) obj7;
                                                                Intrinsics.h(data, "data");
                                                                int i5 = RewardsPreferenceDetailsActivity.y;
                                                                rewardsPreferenceDetailsActivity4.O4().q.f(new RewardsPreferenceDetailsContract.Actions.OpenExternalLink(data.getUrl()));
                                                                break;
                                                            default:
                                                                String it = (String) obj7;
                                                                Intrinsics.h(it, "it");
                                                                ContextExtKt.e(rewardsPreferenceDetailsActivity4, it);
                                                                break;
                                                        }
                                                        return unit;
                                                    }
                                                };
                                                composer3.A(objG3);
                                            }
                                            Function1 function1 = (Function1) objG3;
                                            composer3.l();
                                            composer3.o(5004770);
                                            boolean zI4 = composer3.I(rewardsPreferenceDetailsActivity3);
                                            Object objG4 = composer3.G();
                                            if (zI4 || objG4 == composer$Companion$Empty$1) {
                                                objG4 = new Function0() { // from class: au.com.woolworths.feature.rewards.account.preferences.b
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        int i4 = i3;
                                                        Unit unit = Unit.f24250a;
                                                        RewardsPreferenceDetailsActivity rewardsPreferenceDetailsActivity4 = rewardsPreferenceDetailsActivity3;
                                                        switch (i4) {
                                                            case 0:
                                                                int i5 = RewardsPreferenceDetailsActivity.y;
                                                                rewardsPreferenceDetailsActivity4.O4().r6();
                                                                break;
                                                            case 1:
                                                                rewardsPreferenceDetailsActivity4.finish();
                                                                break;
                                                            default:
                                                                ContextExtKt.f(rewardsPreferenceDetailsActivity4);
                                                                break;
                                                        }
                                                        return unit;
                                                    }
                                                };
                                                composer3.A(objG4);
                                            }
                                            Function0 function0 = (Function0) objG4;
                                            composer3.l();
                                            composer3.o(5004770);
                                            boolean zI5 = composer3.I(rewardsPreferenceDetailsActivity3);
                                            Object objG5 = composer3.G();
                                            final int i4 = 1;
                                            if (zI5 || objG5 == composer$Companion$Empty$1) {
                                                objG5 = new Function0() { // from class: au.com.woolworths.feature.rewards.account.preferences.b
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        int i42 = i4;
                                                        Unit unit = Unit.f24250a;
                                                        RewardsPreferenceDetailsActivity rewardsPreferenceDetailsActivity4 = rewardsPreferenceDetailsActivity3;
                                                        switch (i42) {
                                                            case 0:
                                                                int i5 = RewardsPreferenceDetailsActivity.y;
                                                                rewardsPreferenceDetailsActivity4.O4().r6();
                                                                break;
                                                            case 1:
                                                                rewardsPreferenceDetailsActivity4.finish();
                                                                break;
                                                            default:
                                                                ContextExtKt.f(rewardsPreferenceDetailsActivity4);
                                                                break;
                                                        }
                                                        return unit;
                                                    }
                                                };
                                                composer3.A(objG5);
                                            }
                                            Function0 function02 = (Function0) objG5;
                                            composer3.l();
                                            Function0 function03 = (Function0) kFunction;
                                            composer3.o(5004770);
                                            boolean zI6 = composer3.I(rewardsPreferenceDetailsActivity3);
                                            Object objG6 = composer3.G();
                                            if (zI6 || objG6 == composer$Companion$Empty$1) {
                                                objG6 = new Function0() { // from class: au.com.woolworths.feature.rewards.account.preferences.b
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        int i42 = i;
                                                        Unit unit = Unit.f24250a;
                                                        RewardsPreferenceDetailsActivity rewardsPreferenceDetailsActivity4 = rewardsPreferenceDetailsActivity3;
                                                        switch (i42) {
                                                            case 0:
                                                                int i5 = RewardsPreferenceDetailsActivity.y;
                                                                rewardsPreferenceDetailsActivity4.O4().r6();
                                                                break;
                                                            case 1:
                                                                rewardsPreferenceDetailsActivity4.finish();
                                                                break;
                                                            default:
                                                                ContextExtKt.f(rewardsPreferenceDetailsActivity4);
                                                                break;
                                                        }
                                                        return unit;
                                                    }
                                                };
                                                composer3.A(objG6);
                                            }
                                            Function0 function04 = (Function0) objG6;
                                            composer3.l();
                                            composer3.o(5004770);
                                            boolean zI7 = composer3.I(rewardsPreferenceDetailsActivity3);
                                            Object objG7 = composer3.G();
                                            if (zI7 || objG7 == composer$Companion$Empty$1) {
                                                objG7 = new Function1() { // from class: au.com.woolworths.feature.rewards.account.preferences.a
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj7) {
                                                        int i42 = i4;
                                                        Unit unit = Unit.f24250a;
                                                        RewardsPreferenceDetailsActivity rewardsPreferenceDetailsActivity4 = rewardsPreferenceDetailsActivity3;
                                                        switch (i42) {
                                                            case 0:
                                                                RewardsWebLink data = (RewardsWebLink) obj7;
                                                                Intrinsics.h(data, "data");
                                                                int i5 = RewardsPreferenceDetailsActivity.y;
                                                                rewardsPreferenceDetailsActivity4.O4().q.f(new RewardsPreferenceDetailsContract.Actions.OpenExternalLink(data.getUrl()));
                                                                break;
                                                            default:
                                                                String it = (String) obj7;
                                                                Intrinsics.h(it, "it");
                                                                ContextExtKt.e(rewardsPreferenceDetailsActivity4, it);
                                                                break;
                                                        }
                                                        return unit;
                                                    }
                                                };
                                                composer3.A(objG7);
                                            }
                                            composer3.l();
                                            RewardsPreferenceDetailsContentKt.l(rewardsPreferenceDetailsViewModelO43, false, function2, function1, function0, function02, function03, function04, (Function1) objG7, composer3, 48);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2));
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 871132700));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        O4().p6();
        RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModelO4 = O4();
        rewardsPreferenceDetailsViewModelO4.h.a((Screens) rewardsPreferenceDetailsViewModelO4.o.getD());
    }
}
