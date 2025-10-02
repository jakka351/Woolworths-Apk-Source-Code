package au.com.woolworths.feature.shop.inbox;

import android.os.Bundle;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffset;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.v2.ui.d;
import au.com.woolworths.feature.shop.inbox.InboxUiEvent;
import au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt;
import au.com.woolworths.feature.shop.inbox.ui.TermsAndConditionsScreenKt;
import au.com.woolworths.markdown.RichTextMarkdownKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InboxActivity extends Hilt_InboxActivity {
    public static final /* synthetic */ int z = 0;
    public final ViewModelLazy w = new ViewModelLazy(Reflection.f24268a.b(InboxViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.inbox.InboxActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.inbox.InboxActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.inbox.InboxActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public FeatureToggleManager x;
    public boolean y;

    public final InboxViewModel N4() {
        return (InboxViewModel) this.w.getD();
    }

    @Override // au.com.woolworths.feature.shop.inbox.Hilt_InboxActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FeatureToggleManager featureToggleManager = this.x;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        final String string = featureToggleManager.c(InboxFeature.d) ? getString(com.woolworths.R.string.inbox_screen_title_messages) : getString(com.woolworths.R.string.inbox_screen_title_notifications);
        Intrinsics.e(string);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.InboxActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final InboxActivity inboxActivity = InboxActivity.this;
                    final String str = string;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(47972567, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.InboxActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Number) obj4).intValue() & 3;
                            Unit unit = Unit.f24250a;
                            if (iIntValue == 2 && composer2.c()) {
                                composer2.j();
                                return unit;
                            }
                            composer2.o(1849434622);
                            Object objG = composer2.G();
                            Object obj5 = Composer.Companion.f1624a;
                            if (objG == obj5) {
                                objG = SnapshotStateKt.f(null);
                                composer2.A(objG);
                            }
                            final MutableState mutableState = (MutableState) objG;
                            composer2.l();
                            int i = InboxActivity.z;
                            final InboxActivity inboxActivity2 = inboxActivity;
                            InboxViewModel inboxViewModelN4 = inboxActivity2.N4();
                            composer2.o(-1633490746);
                            boolean zI = composer2.I(inboxActivity2);
                            Object objG2 = composer2.G();
                            if (zI || objG2 == obj5) {
                                objG2 = new au.com.woolworths.feature.shared.receipt.details.compose.a(mutableState, inboxActivity2);
                                composer2.A(objG2);
                            }
                            Function2 function2 = (Function2) objG2;
                            composer2.l();
                            composer2.o(5004770);
                            boolean zI2 = composer2.I(inboxActivity2);
                            Object objG3 = composer2.G();
                            final int i2 = 0;
                            if (zI2 || objG3 == obj5) {
                                objG3 = new Function0() { // from class: au.com.woolworths.feature.shop.inbox.a
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i2) {
                                            case 0:
                                                inboxActivity2.finish();
                                                break;
                                            default:
                                                InboxActivity inboxActivity3 = inboxActivity2;
                                                inboxActivity3.y = true;
                                                inboxActivity3.startActivity(Activities.AskOliveActivity.b(7, null, null, null));
                                                break;
                                        }
                                        return Unit.f24250a;
                                    }
                                };
                                composer2.A(objG3);
                            }
                            Function0 function0 = (Function0) objG3;
                            composer2.l();
                            composer2.o(5004770);
                            boolean zI3 = composer2.I(inboxActivity2);
                            Object objG4 = composer2.G();
                            final int i3 = 1;
                            if (zI3 || objG4 == obj5) {
                                objG4 = new Function0() { // from class: au.com.woolworths.feature.shop.inbox.a
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i3) {
                                            case 0:
                                                inboxActivity2.finish();
                                                break;
                                            default:
                                                InboxActivity inboxActivity3 = inboxActivity2;
                                                inboxActivity3.y = true;
                                                inboxActivity3.startActivity(Activities.AskOliveActivity.b(7, null, null, null));
                                                break;
                                        }
                                        return Unit.f24250a;
                                    }
                                };
                                composer2.A(objG4);
                            }
                            composer2.l();
                            InboxScreenKt.c(inboxViewModelN4, function2, function0, (Function0) objG4, str, composer2, 0);
                            boolean z2 = mutableState.getD() != null;
                            composer2.o(1849434622);
                            Object objG5 = composer2.G();
                            int i4 = 4;
                            if (objG5 == obj5) {
                                objG5 = new d(i4);
                                composer2.A(objG5);
                            }
                            composer2.l();
                            EnterTransition enterTransitionN = EnterExitTransitionKt.n(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), (Function1) objG5);
                            composer2.o(1849434622);
                            Object objG6 = composer2.G();
                            if (objG6 == obj5) {
                                objG6 = new d(i4);
                                composer2.A(objG6);
                            }
                            composer2.l();
                            AnimatedVisibilityKt.d(z2, null, enterTransitionN, EnterExitTransitionKt.q(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), (Function1) objG6), null, ComposableLambdaKt.c(1967011583, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.InboxActivity.onCreate.1.1.6
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj6;
                                    Composer composer3 = (Composer) obj7;
                                    ((Number) obj8).intValue();
                                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                                    final MutableState mutableState2 = mutableState;
                                    CoreThemeKt.c(6, composer3, ComposableLambdaKt.c(1666497627, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.InboxActivity.onCreate.1.1.6.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj9, Object obj10) {
                                            Composer composer4 = (Composer) obj9;
                                            if ((((Number) obj10).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                composer4.o(5004770);
                                                Object objG7 = composer4.G();
                                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                                final MutableState mutableState3 = mutableState2;
                                                if (objG7 == composer$Companion$Empty$1) {
                                                    objG7 = new b(mutableState3, 1);
                                                    composer4.A(objG7);
                                                }
                                                composer4.l();
                                                TermsAndConditionsScreenKt.a((Function0) objG7, ComposableLambdaKt.c(-68907939, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.InboxActivity.onCreate.1.1.6.1.2
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj11, Object obj12) {
                                                        Composer composer5 = (Composer) obj11;
                                                        if ((((Number) obj12).intValue() & 3) == 2 && composer5.c()) {
                                                            composer5.j();
                                                        } else {
                                                            String str2 = (String) mutableState3.getD();
                                                            if (str2 == null) {
                                                                str2 = "";
                                                            }
                                                            RichTextMarkdownKt.b(str2, null, null, false, composer5, 0, 14);
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                }, composer4), composer4, 54);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3));
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 200064, 18);
                            boolean z3 = mutableState.getD() != null;
                            composer2.o(5004770);
                            Object objG7 = composer2.G();
                            if (objG7 == obj5) {
                                objG7 = new b(mutableState, 0);
                                composer2.A(objG7);
                            }
                            composer2.l();
                            BackHandlerKt.a(z3, (Function0) objG7, composer2, 48, 0);
                            composer2.o(5004770);
                            boolean zI4 = composer2.I(inboxActivity2);
                            Object objG8 = composer2.G();
                            if (zI4 || objG8 == obj5) {
                                objG8 = new c(inboxActivity2, 1);
                                composer2.A(objG8);
                            }
                            composer2.l();
                            LifecycleEffectKt.a(null, (Function1) objG8, composer2, 6);
                            return unit;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -2047176561));
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (this.y) {
            N4().p.invoke(InboxUiEvent.SyncMessageUsBanner.f7277a);
            this.y = false;
        }
    }
}
