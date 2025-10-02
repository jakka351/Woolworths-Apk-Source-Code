package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.base.wallet.digipay.framesview.FramesSDKConfig;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopBarLiftOnScrollElevationKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.FooterButtonKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.LoadingUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.TitleTextItemUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonStyle;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryFeed;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryFooter;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayData;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayError;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayLoadingState;
import au.com.woolworths.foundation.rewards.common.ui.buttons.SmallIconItemUiKt;
import au.com.woolworths.foundation.rewards.common.ui.errors.FullPageErrorContentKt;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.rewards.servicemessages.ui.ServiceMessageUiKt;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import au.com.woolworths.shared.ui.compose.StatefulButtonKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$ViewState;", "viewState", "", "topNavBarTitle", "everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SummaryScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6142a;

        static {
            int[] iArr = new int[EverydayExtrasButtonStyle.values().length];
            try {
                EverydayExtrasButtonStyle everydayExtrasButtonStyle = EverydayExtrasButtonStyle.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6142a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(EverydayExtrasSummaryFooter everydayExtrasSummaryFooter, StatefulButtonState statefulButtonState, Function0 function0, Composer composer, int i) {
        Modifier.Companion companion;
        boolean z;
        ComposerImpl composerImplV = composer.v(-1441319819);
        int i2 = 16;
        int i3 = i | (composerImplV.I(everydayExtrasSummaryFooter) ? 4 : 2) | (composerImplV.r(statefulButtonState.ordinal()) ? 32 : 16) | (composerImplV.I(function0) ? 256 : 128);
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(SizeKt.e(companion2, 1.0f), ToneColors.k, RectangleShapeKt.f1779a);
            boolean z2 = false;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composerImplV, null);
            composerImplV.o(-334668991);
            Iterator it = everydayExtrasSummaryFooter.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                EverydayExtrasSummaryFooterItem.Button button = (EverydayExtrasSummaryFooterItem.Button) it.next();
                EverydayExtrasButtonStyle everydayExtrasButtonStyle = button.g;
                int i5 = everydayExtrasButtonStyle == null ? -1 : WhenMappings.f6142a[everydayExtrasButtonStyle.ordinal()];
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                if (i5 == 1) {
                    composerImplV.o(-1657730489);
                    Modifier modifierF = PaddingKt.f(companion2, i2);
                    String str = button.d;
                    composerImplV.o(5004770);
                    boolean z3 = (i3 & 896) != 256 ? z2 : true;
                    Object objG = composerImplV.G();
                    if (z3 || objG == composer$Companion$Empty$1) {
                        objG = new au.com.woolworths.design.core.ui.component.experimental.dialog.a(18, function0);
                        composerImplV.A(objG);
                    }
                    composerImplV.V(z2);
                    companion = companion2;
                    z = z2;
                    StatefulButtonKt.b(str, str, modifierF, statefulButtonState, 0L, (Function0) objG, composerImplV, ((i3 << 6) & 7168) | KyberEngine.KyberPolyBytes, 16);
                    composerImplV.V(z);
                } else {
                    companion = companion2;
                    z = z2;
                    composerImplV.o(-1657358210);
                    String str2 = button.d;
                    EverydayExtrasButtonStyle everydayExtrasButtonStyle2 = button.g;
                    composerImplV.o(5004770);
                    byte b = (i3 & 896) == 256 ? true : z ? 1 : 0;
                    Object objG2 = composerImplV.G();
                    if (b != false || objG2 == composer$Companion$Empty$1) {
                        objG2 = new au.com.woolworths.design.core.ui.component.experimental.dialog.a(19, function0);
                        composerImplV.A(objG2);
                    }
                    composerImplV.V(z);
                    FooterButtonKt.a(str2, everydayExtrasButtonStyle2, (Function0) objG2, composerImplV, z ? 1 : 0);
                    composerImplV.V(z);
                }
                z2 = z;
                companion2 = companion;
                i2 = 16;
            }
            composerImplV.V(z2);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(everydayExtrasSummaryFooter, statefulButtonState, function0, i, 7);
        }
    }

    public static final void b(final EverydayExtraSummaryContract.ViewState viewState, final LazyListState lazyListState, final boolean z, final Function1 function1, final Function1 function12, final Function1 function13, final Function0 function0, final Function0 function02, final Function1 function14, final Function0 function03, final Function0 function04, boolean z2, Composer composer, final int i, final int i2, final int i3) {
        boolean z3;
        Function1 function15;
        Function1 function16;
        Function0 function05;
        Function0 function06;
        final Function0 function07;
        int i4;
        boolean z4;
        final boolean z5;
        ComposerImpl composerImplV = composer.v(-830857082);
        int i5 = ((i & 8) == 0 ? composerImplV.n(viewState) : composerImplV.I(viewState) ? 4 : 2) | i | (composerImplV.n(lazyListState) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            z3 = z;
            i5 |= composerImplV.p(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            function15 = function1;
            i5 |= composerImplV.I(function15) ? 2048 : 1024;
        } else {
            function15 = function1;
        }
        if ((i & 24576) == 0) {
            function16 = function12;
            i5 |= composerImplV.I(function16) ? 16384 : 8192;
        } else {
            function16 = function12;
        }
        if ((1572864 & i) == 0) {
            function05 = function0;
            i5 |= composerImplV.I(function05) ? 1048576 : 524288;
        } else {
            function05 = function0;
        }
        if ((12582912 & i) == 0) {
            function06 = function02;
            i5 |= composerImplV.I(function06) ? 8388608 : 4194304;
        } else {
            function06 = function02;
        }
        if ((100663296 & i) == 0) {
            i5 |= composerImplV.I(function14) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            function07 = function03;
            i5 |= composerImplV.I(function07) ? 536870912 : 268435456;
        } else {
            function07 = function03;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerImplV.I(function04) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i6 = i5;
        int i7 = i3 & 2048;
        if (i7 != 0) {
            i4 |= 48;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i2 & 48) == 0) {
                i4 |= composerImplV.p(z4) ? 32 : 16;
            }
        }
        if ((i6 & 306783379) == 306783378 && (i4 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            z5 = z4;
        } else {
            final boolean z6 = i7 != 0 ? false : z4;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.b(9);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            final boolean z7 = z3;
            final Function1 function17 = function15;
            final Function1 function18 = function16;
            final Function0 function08 = function05;
            final Function0 function09 = function06;
            AnimatedContentKt.b(viewState, null, null, null, "viewState", (Function1) objG, ComposableLambdaKt.c(486398733, new Function4<AnimatedContentScope, EverydayExtraSummaryContract.ViewState, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$ScaffoldedContent$2
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
                    EverydayExtraSummaryContract.ViewState state = (EverydayExtraSummaryContract.ViewState) obj2;
                    Composer composer2 = (Composer) obj3;
                    ((Number) obj4).intValue();
                    Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.h(state, "state");
                    if (state.equals(EverydayExtraSummaryContract.ViewState.Loading.f6133a)) {
                        composer2.o(-914905334);
                        LoadingUiKt.a(composer2, 0);
                        composer2.l();
                    } else if (state instanceof EverydayExtraSummaryContract.ViewState.Error) {
                        composer2.o(-914794385);
                        FullPageErrorContentKt.a(((EverydayExtraSummaryContract.ViewState.Error) state).f6132a, null, function07, composer2, 0);
                        composer2.l();
                    } else if (state instanceof EverydayExtraSummaryContract.ViewState.Content) {
                        composer2.o(-914531195);
                        EverydayExtraSummaryContract.ViewState.Content content = (EverydayExtraSummaryContract.ViewState.Content) state;
                        function13.invoke(content.f6131a.f6172a);
                        EverydayExtrasSummaryFeed everydayExtrasSummaryFeed = content.f6131a;
                        boolean z8 = content.f;
                        WPayLoadingState wPayLoadingState = content.c;
                        WPayData wPayData = content.d;
                        WPayError wPayError = content.e;
                        boolean z9 = content.g;
                        boolean z10 = content.h;
                        RewardsServiceMessage rewardsServiceMessage = content.j;
                        FramesSDKConfig.Companion companion = FramesSDKConfig.INSTANCE;
                        RewardsServiceMessage.Companion companion2 = RewardsServiceMessage.INSTANCE;
                        SummaryScreenKt.c(lazyListState, everydayExtrasSummaryFeed, z8, wPayLoadingState, wPayData, wPayError, z7, z9, z10, rewardsServiceMessage, function08, function17, function09, function18, function14, z6, function04, composer2, 1073741824, 0);
                        composer2.l();
                    } else {
                        if (!(state instanceof EverydayExtraSummaryContract.ViewState.ServiceMessage)) {
                            throw au.com.woolworths.android.onesite.a.x(composer2, -722250379);
                        }
                        composer2.o(-913299565);
                        RewardsServiceMessage rewardsServiceMessage2 = ((EverydayExtraSummaryContract.ViewState.ServiceMessage) state).f6134a;
                        RewardsServiceMessage.Companion companion3 = RewardsServiceMessage.INSTANCE;
                        ServiceMessageUiKt.a(rewardsServiceMessage2, null, function07, composer2, 8, 2);
                        composer2.l();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i6 & 14) | 1794048, 14);
            z5 = z6;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    SummaryScreenKt.b(viewState, lazyListState, z, function1, function12, function13, function0, function02, function14, function03, function04, z5, (Composer) obj, iA, iA2, i3);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(final LazyListState listState, final EverydayExtrasSummaryFeed summaryFeed, final boolean z, final WPayLoadingState wPayLoadingState, final WPayData wPayData, final WPayError wPayError, final boolean z2, final boolean z3, final boolean z4, final RewardsServiceMessage rewardsServiceMessage, final Function0 onWPayClearFormClick, final Function1 onWPayWebViewBindingCreate, final Function0 onScanCardClick, final Function1 onChangePlanClick, final Function1 onUserAgreementCheckboxToggle, final boolean z5, final Function0 onFooterButtonClick, Composer composer, final int i, final int i2) {
        WPayData wPayData2;
        int i3;
        Modifier modifier;
        ComposerImpl composerImpl;
        int i4;
        boolean z6;
        ComposerImpl composerImpl2;
        Intrinsics.h(listState, "listState");
        Intrinsics.h(summaryFeed, "summaryFeed");
        Intrinsics.h(wPayLoadingState, "wPayLoadingState");
        Intrinsics.h(onWPayClearFormClick, "onWPayClearFormClick");
        Intrinsics.h(onWPayWebViewBindingCreate, "onWPayWebViewBindingCreate");
        Intrinsics.h(onScanCardClick, "onScanCardClick");
        Intrinsics.h(onChangePlanClick, "onChangePlanClick");
        Intrinsics.h(onUserAgreementCheckboxToggle, "onUserAgreementCheckboxToggle");
        Intrinsics.h(onFooterButtonClick, "onFooterButtonClick");
        ComposerImpl composerImplV = composer.v(1265995754);
        int i5 = (composerImplV.n(listState) ? 4 : 2) | i | (composerImplV.I(summaryFeed) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= composerImplV.r(wPayLoadingState.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            wPayData2 = wPayData;
            i5 |= composerImplV.n(wPayData2) ? 16384 : 8192;
        } else {
            wPayData2 = wPayData;
        }
        if ((i & 196608) == 0) {
            i5 |= composerImplV.n(wPayError) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= composerImplV.p(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= composerImplV.p(z3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= composerImplV.p(z4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= (i & 1073741824) == 0 ? composerImplV.n(rewardsServiceMessage) : composerImplV.I(rewardsServiceMessage) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerImplV.I(onWPayClearFormClick) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.I(onWPayWebViewBindingCreate) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(onScanCardClick) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.I(onChangePlanClick) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerImplV.I(onUserAgreementCheckboxToggle) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= composerImplV.p(z5) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= composerImplV.I(onFooterButtonClick) ? 1048576 : 524288;
        }
        int i6 = i3;
        if ((i5 & 306783379) == 306783378 && (599187 & i6) == 599186 && composerImplV.c()) {
            composerImplV.j();
            composerImpl2 = composerImplV;
        } else {
            Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
            Boolean boolValueOf = Boolean.valueOf(z);
            composerImplV.o(5004770);
            int i7 = i5 & 896;
            boolean z7 = i7 == 256;
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z7 || objG == composer$Companion$Empty$1) {
                objG = new PointerInputEventHandler() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryContent$1$1

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryContent$1$1$1", f = "SummaryScreen.kt", l = {313}, m = "invokeSuspend")
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryContent$1$1$1, reason: invalid class name */
                    final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                        public int q;
                        public /* synthetic */ Object r;
                        public final /* synthetic */ boolean s;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(boolean z, Continuation continuation) {
                            super(2, continuation);
                            this.s = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.s, continuation);
                            anonymousClass1.r = obj;
                            return anonymousClass1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ((AnonymousClass1) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
                        /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002f -> B:14:0x0032). Please report as a decompilation issue!!! */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                            /*
                                r7 = this;
                                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r1 = r7.q
                                r2 = 1
                                if (r1 == 0) goto L19
                                if (r1 != r2) goto L11
                                java.lang.Object r1 = r7.r
                                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                                kotlin.ResultKt.b(r8)
                                goto L32
                            L11:
                                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r8.<init>(r0)
                                throw r8
                            L19:
                                kotlin.ResultKt.b(r8)
                                java.lang.Object r8 = r7.r
                                androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
                                r1 = r8
                            L21:
                                boolean r8 = r7.s
                                if (r8 == 0) goto L56
                                androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.d
                                r7.r = r1
                                r7.q = r2
                                java.lang.Object r8 = r1.x1(r8, r7)
                                if (r8 != r0) goto L32
                                return r0
                            L32:
                                androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
                                java.lang.Object r3 = r8.f1851a
                                java.lang.Iterable r3 = (java.lang.Iterable) r3
                                java.util.Iterator r3 = r3.iterator()
                            L3c:
                                boolean r4 = r3.hasNext()
                                if (r4 == 0) goto L21
                                java.lang.Object r4 = r3.next()
                                androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                                int r5 = r8.e
                                r6 = 3
                                if (r5 != r6) goto L4e
                                goto L3c
                            L4e:
                                r6 = 6
                                if (r5 != r6) goto L52
                                goto L3c
                            L52:
                                r4.a()
                                goto L3c
                            L56:
                                kotlin.Unit r8 = kotlin.Unit.f24250a
                                return r8
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryContent$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                        Object objC1 = pointerInputScope.c1(new AnonymousClass1(z, null), continuation);
                        return objC1 == CoroutineSingletons.d ? objC1 : Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierD = SuspendingPointerInputFilterKt.d(modifierE, boolValueOf, (PointerInputEventHandler) objG);
            composerImplV.o(-1224400529);
            boolean zI = ((i6 & 7168) == 2048) | ((1879048192 & i5) == 536870912 || ((i5 & 1073741824) != 0 && composerImplV.I(rewardsServiceMessage))) | composerImplV.I(summaryFeed) | ((29360128 & i5) == 8388608) | ((234881024 & i5) == 67108864) | ((i6 & 57344) == 16384) | ((i5 & 7168) == 2048) | ((i5 & 57344) == 16384) | ((i5 & 458752) == 131072) | ((i5 & 3670016) == 1048576) | ((i6 & 112) == 32) | ((i6 & 14) == 4) | ((i6 & 458752) == 131072) | ((i6 & 896) == 256) | (i7 == 256) | ((i6 & 3670016) == 1048576);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                modifier = modifierD;
                composerImpl = composerImplV;
                i4 = i5;
                final WPayData wPayData3 = wPayData2;
                z6 = false;
                Function1 function1 = new Function1() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final RewardsServiceMessage rewardsServiceMessage2 = rewardsServiceMessage;
                        Object obj2 = null;
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryContent$2$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                LazyItemScope item = (LazyItemScope) obj3;
                                Composer composer2 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    RewardsServiceMessage rewardsServiceMessage3 = rewardsServiceMessage2;
                                    if (rewardsServiceMessage3 != null) {
                                        RewardsServiceMessage.Companion companion = RewardsServiceMessage.INSTANCE;
                                        ServiceMessageUiKt.b(rewardsServiceMessage3, null, composer2, 8, 2);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1758127051), 3);
                        final EverydayExtrasSummaryFeed everydayExtrasSummaryFeed = summaryFeed;
                        for (EverydayExtrasSummaryContentItem everydayExtrasSummaryContentItem : everydayExtrasSummaryFeed.b.b) {
                            if (everydayExtrasSummaryContentItem instanceof EverydayExtrasSummaryContentItem.TitleTextItem) {
                                final EverydayExtrasSummaryContentItem.TitleTextItem titleTextItem = (EverydayExtrasSummaryContentItem.TitleTextItem) everydayExtrasSummaryContentItem;
                                LazyListScope.i(LazyColumn, obj2, obj2, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryContent$2$1$2$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            TitleTextItemUiKt.a(48, 0, composer2, PaddingKt.g(Modifier.Companion.d, 16, 8), titleTextItem.d);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, 1765910278), 3);
                            } else if (everydayExtrasSummaryContentItem instanceof EverydayExtrasSummaryContentItem.Divider) {
                                LazyListScope.i(LazyColumn, obj2, obj2, ComposableSingletons$SummaryScreenKt.f6140a, 3);
                            } else if (everydayExtrasSummaryContentItem instanceof EverydayExtrasSummaryContentItem.SelectedPlan) {
                                final EverydayExtrasSummaryContentItem.SelectedPlan selectedPlan = (EverydayExtrasSummaryContentItem.SelectedPlan) everydayExtrasSummaryContentItem;
                                final Function1 function12 = onChangePlanClick;
                                LazyListScope.i(LazyColumn, obj2, obj2, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryContent$2$1$2$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            SelectedPlanUiKt.a(selectedPlan, function12, composer2, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, 1762871566), 3);
                            } else if (everydayExtrasSummaryContentItem instanceof EverydayExtrasSummaryContentItem.SmallIconListItem) {
                                final EverydayExtrasSummaryContentItem.SmallIconListItem smallIconListItem = (EverydayExtrasSummaryContentItem.SmallIconListItem) everydayExtrasSummaryContentItem;
                                LazyListScope.i(LazyColumn, obj2, obj2, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryContent$2$1$2$3
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            EverydayExtrasSummaryContentItem.SmallIconListItem smallIconListItem2 = smallIconListItem;
                                            SmallIconItemUiKt.a(smallIconListItem2.d, smallIconListItem2.e, null, composer2, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, 1414243949), 3);
                            } else if (everydayExtrasSummaryContentItem instanceof EverydayExtrasSummaryContentItem.SubheadTextItem) {
                                final EverydayExtrasSummaryContentItem.SubheadTextItem subheadTextItem = (EverydayExtrasSummaryContentItem.SubheadTextItem) everydayExtrasSummaryContentItem;
                                LazyListScope.i(LazyColumn, obj2, obj2, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryContent$2$1$2$4
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            SummarySubheadTextItemUiKt.a(48, 0, composer2, PaddingKt.j(PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, 7), subheadTextItem.d);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, 1065616332), 3);
                            } else if (everydayExtrasSummaryContentItem instanceof EverydayExtrasSummaryContentItem.ParagraphTextItem) {
                                final EverydayExtrasSummaryContentItem.ParagraphTextItem paragraphTextItem = (EverydayExtrasSummaryContentItem.ParagraphTextItem) everydayExtrasSummaryContentItem;
                                LazyListScope.i(LazyColumn, obj2, obj2, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryContent$2$1$2$5
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            SummaryParagraphTextKt.a(paragraphTextItem.d, composer2, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, 716988715), 3);
                            } else if (everydayExtrasSummaryContentItem instanceof EverydayExtrasSummaryContentItem.CheckableTextItem) {
                                final EverydayExtrasSummaryContentItem.CheckableTextItem checkableTextItem = (EverydayExtrasSummaryContentItem.CheckableTextItem) everydayExtrasSummaryContentItem;
                                final boolean z8 = z3;
                                final boolean z9 = z4;
                                final Function1 function13 = onUserAgreementCheckboxToggle;
                                LazyListScope.i(LazyColumn, obj2, obj2, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryContent$2$1$2$6
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            CheckableTextUiKt.a(checkableTextItem, z8, z9, function13, composer2, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, 368361098), 3);
                            } else {
                                if (!(everydayExtrasSummaryContentItem instanceof EverydayExtrasSummaryContentItem.WpayPayment)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                final EverydayExtrasSummaryContentItem.WpayPayment wpayPayment = (EverydayExtrasSummaryContentItem.WpayPayment) everydayExtrasSummaryContentItem;
                                final WPayLoadingState wPayLoadingState2 = wPayLoadingState;
                                final WPayData wPayData4 = wPayData3;
                                final WPayError wPayError2 = wPayError;
                                final boolean z10 = z2;
                                final Function1 function14 = onWPayWebViewBindingCreate;
                                final Function0 function0 = onWPayClearFormClick;
                                final boolean z11 = z5;
                                final Function0 function02 = onScanCardClick;
                                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryContent$2$1$2$7
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            FramesSDKConfig.Companion companion = FramesSDKConfig.INSTANCE;
                                            WPayPaymentUiKt.a(wpayPayment, wPayLoadingState2, wPayData4, wPayError2, z10, function14, function0, z11, function02, composer2, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, 19733481), 3);
                            }
                            obj2 = null;
                        }
                        final boolean z12 = z;
                        final Function0 function03 = onFooterButtonClick;
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryContent$2$1$3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                LazyItemScope item = (LazyItemScope) obj3;
                                Composer composer2 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    SummaryScreenKt.a(everydayExtrasSummaryFeed.c, z12 ? StatefulButtonState.e : StatefulButtonState.d, function03, composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1013412958), 3);
                        return Unit.f24250a;
                    }
                };
                composerImpl.A(function1);
                objG2 = function1;
            } else {
                modifier = modifierD;
                composerImpl = composerImplV;
                i4 = i5;
                z6 = false;
            }
            composerImpl.V(z6);
            ComposerImpl composerImpl3 = composerImpl;
            LazyDslKt.b(modifier, listState, null, false, null, null, null, false, null, (Function1) objG2, composerImpl3, (i4 << 3) & 112, 508);
            composerImpl2 = composerImpl3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    SummaryScreenKt.c(listState, summaryFeed, z, wPayLoadingState, wPayData, wPayError, z2, z3, z4, rewardsServiceMessage, onWPayClearFormClick, onWPayWebViewBindingCreate, onScanCardClick, onChangePlanClick, onUserAgreementCheckboxToggle, z5, onFooterButtonClick, (Composer) obj, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(EverydayExtraSummaryViewModel everydayExtraSummaryViewModel, String str, final Function1 onWPayWebViewBindingCreate, final Function0 onClearWPayFramesForm, final Function0 onSubmitWPayFramesForm, final Function1 onChangePlanClick, final Function0 onScanCard, final Function0 onRequestCameraPermission, final Function0 onShowCameraPermissionRationale, final Function0 onShowGoogleWalletScanner, final Function1 onInjectCardDetails, final Function1 onShowSubscribeAlertDialog, final Function2 onShowErrorAlertDialog, final Function1 onOpenUrl, ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        Object summaryScreenKt$SummaryScreen$1$1;
        int i2;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        Flow flow;
        ComposerImpl composerImpl;
        final LazyListState lazyListState;
        final MutableState mutableState;
        ComposableLambdaImpl composableLambdaImpl2;
        String str2;
        final EverydayExtraSummaryViewModel viewModel = everydayExtraSummaryViewModel;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onWPayWebViewBindingCreate, "onWPayWebViewBindingCreate");
        Intrinsics.h(onClearWPayFramesForm, "onClearWPayFramesForm");
        Intrinsics.h(onSubmitWPayFramesForm, "onSubmitWPayFramesForm");
        Intrinsics.h(onChangePlanClick, "onChangePlanClick");
        Intrinsics.h(onScanCard, "onScanCard");
        Intrinsics.h(onRequestCameraPermission, "onRequestCameraPermission");
        Intrinsics.h(onShowCameraPermissionRationale, "onShowCameraPermissionRationale");
        Intrinsics.h(onShowGoogleWalletScanner, "onShowGoogleWalletScanner");
        Intrinsics.h(onInjectCardDetails, "onInjectCardDetails");
        Intrinsics.h(onShowSubscribeAlertDialog, "onShowSubscribeAlertDialog");
        Intrinsics.h(onShowErrorAlertDialog, "onShowErrorAlertDialog");
        Intrinsics.h(onOpenUrl, "onOpenUrl");
        ComposerImpl composerImplV = composer.v(1672604647);
        int i3 = i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.n(str) ? 32 : 16) | (composerImplV.I(onWPayWebViewBindingCreate) ? 256 : 128) | (composerImplV.I(onClearWPayFramesForm) ? 2048 : 1024) | (composerImplV.I(onSubmitWPayFramesForm) ? 16384 : 8192) | (composerImplV.I(onChangePlanClick) ? 131072 : 65536) | (composerImplV.I(onScanCard) ? 1048576 : 524288) | (composerImplV.I(onRequestCameraPermission) ? 8388608 : 4194304) | (composerImplV.I(onShowCameraPermissionRationale) ? 67108864 : 33554432) | (composerImplV.I(onShowGoogleWalletScanner) ? 536870912 : 268435456);
        int i4 = 24576 | (composerImplV.I(onInjectCardDetails) ? (char) 4 : (char) 2) | (composerImplV.I(onShowSubscribeAlertDialog) ? ' ' : (char) 16) | (composerImplV.I(onShowErrorAlertDialog) ? (char) 256 : (char) 128) | (composerImplV.I(onOpenUrl) ? (char) 2048 : (char) 1024);
        if ((i3 & 306783379) == 306783378 && (i4 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composableLambdaImpl2 = composableLambdaImpl;
            str2 = str;
            composerImpl = composerImplV;
        } else {
            MutableState mutableStateA = FlowExtKt.a(viewModel.q, composerImplV);
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            Flow flow2 = viewModel.o;
            composerImplV.o(-1224400529);
            boolean zI = ((i4 & 7168) == 2048) | composerImplV.I(viewModel) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864) | ((1879048192 & i3) == 536870912) | ((i4 & 14) == 4) | ((i4 & 112) == 32) | ((i4 & 896) == 256) | composerImplV.n(mutableStateA) | composerImplV.n(lazyListStateA);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$12) {
                i2 = i3;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                flow = flow2;
                viewModel = everydayExtraSummaryViewModel;
                composerImpl = composerImplV;
                summaryScreenKt$SummaryScreen$1$1 = new SummaryScreenKt$SummaryScreen$1$1(viewModel, onClearWPayFramesForm, onSubmitWPayFramesForm, onScanCard, onRequestCameraPermission, onShowCameraPermissionRationale, onShowGoogleWalletScanner, onInjectCardDetails, onShowSubscribeAlertDialog, onShowErrorAlertDialog, onOpenUrl, lazyListStateA, mutableStateA, null);
                lazyListState = lazyListStateA;
                mutableState = mutableStateA;
                composerImpl.A(summaryScreenKt$SummaryScreen$1$1);
            } else {
                summaryScreenKt$SummaryScreen$1$1 = objG;
                mutableState = mutableStateA;
                lazyListState = lazyListStateA;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                i2 = i3;
                flow = flow2;
                viewModel = everydayExtraSummaryViewModel;
                composerImpl = composerImplV;
            }
            composerImpl.V(false);
            EffectsKt.e(composerImpl, flow, (Function2) summaryScreenKt$SummaryScreen$1$1);
            composerImpl.o(1849434622);
            Object objG2 = composerImpl.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$13 = composer$Companion$Empty$1;
            if (objG2 == composer$Companion$Empty$13) {
                objG2 = SnapshotStateKt.f("");
                composerImpl.A(objG2);
            }
            final MutableState mutableState2 = (MutableState) objG2;
            composerImpl.V(false);
            ScaffoldKt.a(TestTagKt.a(SizeKt.c, "NavigationTitle"), null, ComposableLambdaKt.c(-1511133182, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String str3 = (String) mutableState2.getD();
                        long j = ToneColors.k;
                        long jC = WxTheme.a(composer2).c();
                        float fA = TopBarLiftOnScrollElevationKt.a(lazyListState, composer2);
                        final EverydayExtraSummaryViewModel everydayExtraSummaryViewModel2 = viewModel;
                        TopNavBarKt.b(str3, null, null, null, 0L, j, jC, null, fA, ComposableLambdaKt.c(255741585, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = ArrowBackKt.a();
                                    String strC = StringResources_androidKt.c(composer3, R.string.content_description_back_button);
                                    composer3.o(5004770);
                                    EverydayExtraSummaryViewModel everydayExtraSummaryViewModel3 = everydayExtraSummaryViewModel2;
                                    boolean zI2 = composer3.I(everydayExtraSummaryViewModel3);
                                    Object objG3 = composer3.G();
                                    if (zI2 || objG3 == Composer.Companion.f1624a) {
                                        SummaryScreenKt$SummaryScreen$2$1$1$1 summaryScreenKt$SummaryScreen$2$1$1$1 = new SummaryScreenKt$SummaryScreen$2$1$1$1(0, everydayExtraSummaryViewModel3, EverydayExtraSummaryViewModel.class, "onSignUpBackBtnClicked", "onSignUpBackBtnClicked()V", 0);
                                        composer3.A(summaryScreenKt$SummaryScreen$2$1$1$1);
                                        objG3 = summaryScreenKt$SummaryScreen$2$1$1$1;
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, strC, (Function0) ((KFunction) objG3), null, false, 0L, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), ComposableLambdaKt.c(227486647, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryScreen$2.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TopNavBar = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = CloseKt.a();
                                    String strC = StringResources_androidKt.c(composer3, R.string.content_description_close_button);
                                    composer3.o(5004770);
                                    EverydayExtraSummaryViewModel everydayExtraSummaryViewModel3 = everydayExtraSummaryViewModel2;
                                    boolean zI2 = composer3.I(everydayExtraSummaryViewModel3);
                                    Object objG3 = composer3.G();
                                    if (zI2 || objG3 == Composer.Companion.f1624a) {
                                        SummaryScreenKt$SummaryScreen$2$2$1$1 summaryScreenKt$SummaryScreen$2$2$1$1 = new SummaryScreenKt$SummaryScreen$2$2$1$1(0, everydayExtraSummaryViewModel3, EverydayExtraSummaryViewModel.class, "onSignUpCloseBtnClicked", "onSignUpCloseBtnClicked()V", 0);
                                        composer3.A(summaryScreenKt$SummaryScreen$2$2$1$1);
                                        objG3 = summaryScreenKt$SummaryScreen$2$2$1$1;
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, strC, (Function0) ((KFunction) objG3), null, false, 0L, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 805306368, 6, 158);
                    }
                    return Unit.f24250a;
                }
            }, composerImpl), null, null, 0, WxTheme.a(composerImpl).b(), 0L, null, null, ComposableLambdaKt.c(249855184, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryScreen$3
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
                        Modifier modifierB = BackgroundKt.b(PaddingKt.e(Modifier.Companion.d, it), ToneColors.k, RectangleShapeKt.f1779a);
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
                        EverydayExtraSummaryContract.ViewState viewState = (EverydayExtraSummaryContract.ViewState) mutableState.getD();
                        EverydayExtraSummaryViewModel everydayExtraSummaryViewModel2 = viewModel;
                        boolean zC = everydayExtraSummaryViewModel2.j.c(RewardsBaseFeature.i);
                        composer2.o(5004770);
                        boolean zI2 = composer2.I(everydayExtraSummaryViewModel2);
                        Object objG3 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$14 = Composer.Companion.f1624a;
                        if (zI2 || objG3 == composer$Companion$Empty$14) {
                            SummaryScreenKt$SummaryScreen$3$1$1$1 summaryScreenKt$SummaryScreen$3$1$1$1 = new SummaryScreenKt$SummaryScreen$3$1$1$1(0, everydayExtraSummaryViewModel2, EverydayExtraSummaryViewModel.class, "clearWPayFramesForm", "clearWPayFramesForm()V", 0);
                            composer2.A(summaryScreenKt$SummaryScreen$3$1$1$1);
                            objG3 = summaryScreenKt$SummaryScreen$3$1$1$1;
                        }
                        KFunction kFunction = (KFunction) objG3;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI3 = composer2.I(everydayExtraSummaryViewModel2);
                        Object objG4 = composer2.G();
                        if (zI3 || objG4 == composer$Companion$Empty$14) {
                            SummaryScreenKt$SummaryScreen$3$1$2$1 summaryScreenKt$SummaryScreen$3$1$2$1 = new SummaryScreenKt$SummaryScreen$3$1$2$1(0, everydayExtraSummaryViewModel2, EverydayExtraSummaryViewModel.class, "requestStartScanCard", "requestStartScanCard()V", 0);
                            composer2.A(summaryScreenKt$SummaryScreen$3$1$2$1);
                            objG4 = summaryScreenKt$SummaryScreen$3$1$2$1;
                        }
                        KFunction kFunction2 = (KFunction) objG4;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI4 = composer2.I(everydayExtraSummaryViewModel2);
                        Object objG5 = composer2.G();
                        if (zI4 || objG5 == composer$Companion$Empty$14) {
                            SummaryScreenKt$SummaryScreen$3$1$3$1 summaryScreenKt$SummaryScreen$3$1$3$1 = new SummaryScreenKt$SummaryScreen$3$1$3$1(1, everydayExtraSummaryViewModel2, EverydayExtraSummaryViewModel.class, "onUserAgreementCheckboxToggle", "onUserAgreementCheckboxToggle(Z)V", 0);
                            composer2.A(summaryScreenKt$SummaryScreen$3$1$3$1);
                            objG5 = summaryScreenKt$SummaryScreen$3$1$3$1;
                        }
                        KFunction kFunction3 = (KFunction) objG5;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI5 = composer2.I(everydayExtraSummaryViewModel2);
                        Object objG6 = composer2.G();
                        if (zI5 || objG6 == composer$Companion$Empty$14) {
                            SummaryScreenKt$SummaryScreen$3$1$4$1 summaryScreenKt$SummaryScreen$3$1$4$1 = new SummaryScreenKt$SummaryScreen$3$1$4$1(0, everydayExtraSummaryViewModel2, EverydayExtraSummaryViewModel.class, "onSubscribeClicked", "onSubscribeClicked()V", 0);
                            composer2.A(summaryScreenKt$SummaryScreen$3$1$4$1);
                            objG6 = summaryScreenKt$SummaryScreen$3$1$4$1;
                        }
                        KFunction kFunction4 = (KFunction) objG6;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI6 = composer2.I(everydayExtraSummaryViewModel2);
                        Object objG7 = composer2.G();
                        if (zI6 || objG7 == composer$Companion$Empty$14) {
                            SummaryScreenKt$SummaryScreen$3$1$5$1 summaryScreenKt$SummaryScreen$3$1$5$1 = new SummaryScreenKt$SummaryScreen$3$1$5$1(0, everydayExtraSummaryViewModel2, EverydayExtraSummaryViewModel.class, "retry", "retry()V", 0);
                            composer2.A(summaryScreenKt$SummaryScreen$3$1$5$1);
                            objG7 = summaryScreenKt$SummaryScreen$3$1$5$1;
                        }
                        KFunction kFunction5 = (KFunction) objG7;
                        Object objE = au.com.woolworths.android.onesite.a.e(composer2, 5004770);
                        if (objE == composer$Companion$Empty$14) {
                            objE = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState2, 1);
                            composer2.A(objE);
                        }
                        composer2.l();
                        SummaryScreenKt.b(viewState, lazyListState, zC, onWPayWebViewBindingCreate, onChangePlanClick, (Function1) objE, (Function0) kFunction, (Function0) kFunction2, (Function1) kFunction3, (Function0) kFunction5, (Function0) kFunction4, false, composer2, 196608, 0, 2048);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImpl), composerImpl, 390, 954);
            composableLambdaImpl2 = composableLambdaImpl;
            composableLambdaImpl2.invoke(composerImpl, 6);
            composerImpl.o(-1633490746);
            boolean zI2 = composerImpl.I(viewModel) | ((i2 & 112) == 32);
            Object objG3 = composerImpl.G();
            if (zI2 || objG3 == composer$Companion$Empty$13) {
                str2 = str;
                objG3 = new SummaryScreenKt$SummaryScreen$4$1(viewModel, str2, null);
                composerImpl.A(objG3);
            } else {
                str2 = str;
            }
            composerImpl.V(false);
            EffectsKt.e(composerImpl, Unit.f24250a, (Function2) objG3);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
            final String str3 = str2;
            recomposeScopeImplX.d = new Function2(str3, onWPayWebViewBindingCreate, onClearWPayFramesForm, onSubmitWPayFramesForm, onChangePlanClick, onScanCard, onRequestCameraPermission, onShowCameraPermissionRationale, onShowGoogleWalletScanner, onInjectCardDetails, onShowSubscribeAlertDialog, onShowErrorAlertDialog, onOpenUrl, composableLambdaImpl3, i) { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.g
                public final /* synthetic */ String e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function0 g;
                public final /* synthetic */ Function0 h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ Function0 k;
                public final /* synthetic */ Function0 l;
                public final /* synthetic */ Function0 m;
                public final /* synthetic */ Function1 n;
                public final /* synthetic */ Function1 o;
                public final /* synthetic */ Function2 p;
                public final /* synthetic */ Function1 q;
                public final /* synthetic */ ComposableLambdaImpl r;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    SummaryScreenKt.d(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
