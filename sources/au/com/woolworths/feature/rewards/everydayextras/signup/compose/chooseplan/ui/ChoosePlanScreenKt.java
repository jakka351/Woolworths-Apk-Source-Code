package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.navigation.fragment.e;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopBarLiftOnScrollElevationKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.LoadingUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFeed;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonActionType;
import au.com.woolworths.foundation.rewards.common.ui.errors.FullPageErrorContentKt;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.rewards.servicemessages.ui.ServiceMessageUiKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$ViewState;", "viewState", "", "topNavBarTitle", "everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ChoosePlanScreenKt {
    public static final void a(final EverydayExtraChoosePlanViewModel everydayExtraChoosePlanViewModel, final boolean z, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1376359520);
        if ((((composerImplV.I(everydayExtraChoosePlanViewModel) ? 4 : 2) | i | (composerImplV.p(z) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final MutableState mutableStateA = FlowExtKt.a(everydayExtraChoosePlanViewModel.j, composerImplV);
            final LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f("");
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            ScaffoldKt.a(TestTagKt.a(SizeKt.c, "NavigationTitle"), null, ComposableLambdaKt.c(-1129039131, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanScreenKt$ChoosePlanScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String str = (String) mutableState.getD();
                        long j = ToneColors.k;
                        long jC = WxTheme.a(composer2).c();
                        float fA = TopBarLiftOnScrollElevationKt.a(lazyListStateA, composer2);
                        final EverydayExtraChoosePlanViewModel everydayExtraChoosePlanViewModel2 = everydayExtraChoosePlanViewModel;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-919224778, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanScreenKt$ChoosePlanScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = ArrowBackKt.a();
                                    String strC = StringResources_androidKt.c(composer3, R.string.content_description_back_button);
                                    composer3.o(5004770);
                                    EverydayExtraChoosePlanViewModel everydayExtraChoosePlanViewModel3 = everydayExtraChoosePlanViewModel2;
                                    boolean zI = composer3.I(everydayExtraChoosePlanViewModel3);
                                    Object objG2 = composer3.G();
                                    if (zI || objG2 == Composer.Companion.f1624a) {
                                        ChoosePlanScreenKt$ChoosePlanScreen$1$1$1$1 choosePlanScreenKt$ChoosePlanScreen$1$1$1$1 = new ChoosePlanScreenKt$ChoosePlanScreen$1$1$1$1(0, everydayExtraChoosePlanViewModel3, EverydayExtraChoosePlanViewModel.class, "onSignUpBackBtnClicked", "onSignUpBackBtnClicked()V", 0);
                                        composer3.A(choosePlanScreenKt$ChoosePlanScreen$1$1$1$1);
                                        objG2 = choosePlanScreenKt$ChoosePlanScreen$1$1$1$1;
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, strC, (Function0) ((KFunction) objG2), null, false, 0L, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final boolean z2 = z;
                        TopNavBarKt.b(str, null, null, null, 0L, j, jC, null, fA, composableLambdaImplC, ComposableLambdaKt.c(-1584126512, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanScreenKt$ChoosePlanScreen$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TopNavBar = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else if (z2) {
                                    ImageVector imageVectorA = CloseKt.a();
                                    String strC = StringResources_androidKt.c(composer3, R.string.content_description_close_button);
                                    composer3.o(5004770);
                                    EverydayExtraChoosePlanViewModel everydayExtraChoosePlanViewModel3 = everydayExtraChoosePlanViewModel2;
                                    boolean zI = composer3.I(everydayExtraChoosePlanViewModel3);
                                    Object objG2 = composer3.G();
                                    if (zI || objG2 == Composer.Companion.f1624a) {
                                        ChoosePlanScreenKt$ChoosePlanScreen$1$2$1$1 choosePlanScreenKt$ChoosePlanScreen$1$2$1$1 = new ChoosePlanScreenKt$ChoosePlanScreen$1$2$1$1(0, everydayExtraChoosePlanViewModel3, EverydayExtraChoosePlanViewModel.class, "onSignUpCloseBtnClicked", "onSignUpCloseBtnClicked()V", 0);
                                        composer3.A(choosePlanScreenKt$ChoosePlanScreen$1$2$1$1);
                                        objG2 = choosePlanScreenKt$ChoosePlanScreen$1$2$1$1;
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, strC, (Function0) ((KFunction) objG2), null, false, 0L, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 805306368, 6, 158);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, WxTheme.a(composerImplV).b(), 0L, null, null, ComposableLambdaKt.c(382756823, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanScreenKt$ChoosePlanScreen$2

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[EverydayExtrasButtonActionType.values().length];
                        try {
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            EverydayExtrasButtonActionType everydayExtrasButtonActionType = EverydayExtrasButtonActionType.d;
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            EverydayExtrasButtonActionType everydayExtrasButtonActionType2 = EverydayExtrasButtonActionType.d;
                            iArr[2] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(it) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierB = BackgroundKt.b(PaddingKt.e(SizeKt.c, it), ToneColors.k, RectangleShapeKt.f1779a);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierB);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        EverydayExtraChoosePlanContract.ViewState viewState = (EverydayExtraChoosePlanContract.ViewState) mutableStateA.getD();
                        composer2.o(5004770);
                        EverydayExtraChoosePlanViewModel everydayExtraChoosePlanViewModel2 = everydayExtraChoosePlanViewModel;
                        boolean zI = composer2.I(everydayExtraChoosePlanViewModel2);
                        Object objG2 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                        if (zI || objG2 == composer$Companion$Empty$12) {
                            ChoosePlanScreenKt$ChoosePlanScreen$2$1$1$1 choosePlanScreenKt$ChoosePlanScreen$2$1$1$1 = new ChoosePlanScreenKt$ChoosePlanScreen$2$1$1$1(1, everydayExtraChoosePlanViewModel2, EverydayExtraChoosePlanViewModel.class, "onSubscribePlanSelect", "onSubscribePlanSelect(Lau/com/woolworths/feature/rewards/everydayextras/signup/data/chooseplan/EverydayExtrasChoosePlanContentItem$SubscribePlan;)V", 0);
                            composer2.A(choosePlanScreenKt$ChoosePlanScreen$2$1$1$1);
                            objG2 = choosePlanScreenKt$ChoosePlanScreen$2$1$1$1;
                        }
                        composer2.l();
                        Function1 function1 = (Function1) ((KFunction) objG2);
                        composer2.o(5004770);
                        boolean zI2 = composer2.I(everydayExtraChoosePlanViewModel2);
                        Object objG3 = composer2.G();
                        if (zI2 || objG3 == composer$Companion$Empty$12) {
                            objG3 = new e(everydayExtraChoosePlanViewModel2, 27);
                            composer2.A(objG3);
                        }
                        Function1 function12 = (Function1) objG3;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI3 = composer2.I(everydayExtraChoosePlanViewModel2);
                        Object objG4 = composer2.G();
                        if (zI3 || objG4 == composer$Companion$Empty$12) {
                            objG4 = new ChoosePlanScreenKt$ChoosePlanScreen$2$1$3$1(0, everydayExtraChoosePlanViewModel2, EverydayExtraChoosePlanViewModel.class, "fetchChoosePlanFeed", "fetchChoosePlanFeed()V", 0);
                            composer2.A(objG4);
                        }
                        composer2.l();
                        Function0 function02 = (Function0) ((KFunction) objG4);
                        composer2.o(5004770);
                        Object objG5 = composer2.G();
                        if (objG5 == composer$Companion$Empty$12) {
                            objG5 = new b(mutableState, 0);
                            composer2.A(objG5);
                        }
                        composer2.l();
                        ChoosePlanScreenKt.b(viewState, function1, function12, function02, (Function1) objG5, composer2, 24576);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 390, 954);
            composerImpl = composerImplV;
            composerImpl.o(5004770);
            boolean zI = composerImpl.I(everydayExtraChoosePlanViewModel);
            Object objG2 = composerImpl.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new ChoosePlanScreenKt$ChoosePlanScreen$3$1(everydayExtraChoosePlanViewModel, null);
                composerImpl.A(objG2);
            }
            composerImpl.V(false);
            EffectsKt.e(composerImpl, Unit.f24250a, (Function2) objG2);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.navigation.compose.internal.a(i, 1, everydayExtraChoosePlanViewModel, z);
        }
    }

    public static final void b(EverydayExtraChoosePlanContract.ViewState viewState, final Function1 function1, final Function1 function12, final Function0 function0, Function1 function13, Composer composer, int i) {
        final Function1 function14;
        ComposerImpl composerImplV = composer.v(1003201422);
        int i2 = ((i & 8) == 0 ? composerImplV.n(viewState) : composerImplV.I(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function0) ? 2048 : 1024;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            function14 = function13;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.rewards.account.closeaccount.ui.d(9);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            function14 = function13;
            AnimatedContentKt.b(viewState, null, null, null, "viewState", (Function1) objG, ComposableLambdaKt.c(-1629022699, new Function4<AnimatedContentScope, EverydayExtraChoosePlanContract.ViewState, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanScreenKt$ScaffoldedContent$2
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
                    EverydayExtraChoosePlanContract.ViewState state = (EverydayExtraChoosePlanContract.ViewState) obj2;
                    Composer composer2 = (Composer) obj3;
                    ((Number) obj4).intValue();
                    Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.h(state, "state");
                    if (state.equals(EverydayExtraChoosePlanContract.ViewState.Loading.f6070a)) {
                        composer2.o(-1379648862);
                        LoadingUiKt.a(composer2, 0);
                        composer2.l();
                    } else {
                        if (state instanceof EverydayExtraChoosePlanContract.ViewState.Error) {
                            composer2.o(-1379534565);
                            FullPageErrorContentKt.a(((EverydayExtraChoosePlanContract.ViewState.Error) state).f6069a, null, function0, composer2, 0);
                            composer2.l();
                        } else if (state instanceof EverydayExtraChoosePlanContract.ViewState.Content) {
                            composer2.o(-1379266508);
                            EverydayExtraChoosePlanContract.ViewState.Content content = (EverydayExtraChoosePlanContract.ViewState.Content) state;
                            String str = content.f6068a.f6147a;
                            if (str == null) {
                                str = "";
                            }
                            function14.invoke(str);
                            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                            int p = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                            Modifier modifierD = ComposedModifierKt.d(composer2, Modifier.Companion.d);
                            ComposeUiNode.e3.getClass();
                            Function0 function02 = ComposeUiNode.Companion.b;
                            if (composer2.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer2.i();
                            if (composer2.getO()) {
                                composer2.K(function02);
                            } else {
                                composer2.e();
                            }
                            Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                            Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function2 = ComposeUiNode.Companion.j;
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                androidx.camera.core.impl.b.z(p, composer2, p, function2);
                            }
                            Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                            composer2.o(-146197267);
                            RewardsServiceMessage rewardsServiceMessage = content.c;
                            if (rewardsServiceMessage != null) {
                                RewardsServiceMessage.Companion companion = RewardsServiceMessage.INSTANCE;
                                ServiceMessageUiKt.b(rewardsServiceMessage, null, composer2, 8, 2);
                            }
                            composer2.l();
                            FillElement fillElement = SizeKt.c;
                            Screen screen = Screen.d;
                            EverydayExtrasChoosePlanFeed everydayExtrasChoosePlanFeed = content.f6068a;
                            boolean z = content.b;
                            EverydayExtrasChoosePlanContentItem.SubscribePlan subscribePlan = content.d;
                            ChoosePlanContentKt.a(screen, everydayExtrasChoosePlanFeed, z, subscribePlan != null ? subscribePlan.d : null, function1, function12, fillElement, composer2, 1572870, 0);
                            composer2.f();
                            composer2.l();
                        } else {
                            if (!(state instanceof EverydayExtraChoosePlanContract.ViewState.ServiceMessage)) {
                                throw au.com.woolworths.android.onesite.a.x(composer2, -2122715798);
                            }
                            composer2.o(-1378330401);
                            RewardsServiceMessage rewardsServiceMessage2 = ((EverydayExtraChoosePlanContract.ViewState.ServiceMessage) state).f6071a;
                            RewardsServiceMessage.Companion companion2 = RewardsServiceMessage.INSTANCE;
                            ServiceMessageUiKt.a(rewardsServiceMessage2, null, function0, composer2, 8, 2);
                            composer2.l();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i2 & 14) | 1794048, 14);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(viewState, function1, function12, function0, function14, i, 5);
        }
    }
}
