package au.com.woolworths.feature.rewards.card.overlay.ui;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.navigation.compose.d;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract;
import au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayViewModel;
import au.com.woolworths.foundation.barcode.encoder.BarcodeType;
import au.com.woolworths.foundation.barcode.ui.BarcodeUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$ViewState;", "viewState", "card_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsCardOverlayScreenKt {
    public static final void a(final RewardsCardData rewardsCardData, final Function1 function1, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1120670548);
        if ((((composerImplV.I(rewardsCardData) ? 4 : 2) | i | (composerImplV.I(function1) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CardKt.a(SizeKt.e(Modifier.Companion.d, 1.0f), RoundedCornerShapeKt.b(16), 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(10818103, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.card.overlay.ui.RewardsCardOverlayScreenKt$BarcodeCard$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
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
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, columnMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        float f = 16;
                        SpacerKt.a(composer2, SizeKt.g(companion, f));
                        RewardsCardData rewardsCardData2 = rewardsCardData;
                        String number = rewardsCardData2.getNumber();
                        BarcodeType barcodeType = BarcodeType.d;
                        BarcodeUiKt.a(number, SizeKt.g(SizeKt.o(companion, 256), 64), ComposableSingletons$RewardsCardOverlayScreenKt.c, composer2, 3504);
                        SpacerKt.a(composer2, SizeKt.g(companion, f));
                        float f2 = 32;
                        Modifier modifierH = PaddingKt.h(SizeKt.e(companion, 1.0f), f2, BitmapDescriptorFactory.HUE_RED, 2);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer2, 0);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierH);
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
                        Updater.b(composer2, rowMeasurePolicyA, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        RewardsCardOverlayScreenKt.b(StringResources_androidKt.c(composer2, R.string.rewards_card_number_title), rewardsCardData2.getDisplayCardNumber(), RowScopeInstance.f974a.a(companion, 1.0f, true), composer2, 0);
                        SpacerKt.a(composer2, SizeKt.u(companion, 24));
                        Painter painterA = PainterResources_androidKt.a(R.drawable.ic_copy_alt, 0, composer2);
                        String strC = StringResources_androidKt.c(composer2, R.string.rewards_card_copy_icon_content_description);
                        composer2.o(-1633490746);
                        Object obj3 = function1;
                        boolean zN = composer2.n(obj3) | composer2.I(rewardsCardData2);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new b(0, obj3, rewardsCardData2);
                            composer2.A(objG);
                        }
                        composer2.l();
                        IconButtonKt.b(painterA, strC, (Function0) objG, SizeKt.k(companion, 40), false, WxTheme.a(composer2).h(), composer2, 3072, 16);
                        composer2.f();
                        String ccv = rewardsCardData2.getCcv();
                        composer2.o(1605083336);
                        if (ccv != null) {
                            SpacerKt.a(composer2, SizeKt.g(companion, 8));
                            RewardsCardOverlayScreenKt.b(StringResources_androidKt.c(composer2, R.string.rewards_card_cvv_title), ccv, PaddingKt.h(SizeKt.e(companion, 1.0f), f2, BitmapDescriptorFactory.HUE_RED, 2), composer2, KyberEngine.KyberPolyBytes);
                        }
                        composer2.l();
                        SpacerKt.a(composer2, SizeKt.g(companion, f));
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572870, 60);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(rewardsCardData, i, 17, function1);
        }
    }

    public static final void b(String str, String str2, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(820377563);
        int i2 = (composerImplV.n(str) ? 4 : 2) | i | (composerImplV.n(str2) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b(str, null, WxTheme.a(composerImplV).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, i2 & 14, 0, 65530);
            TextKt.b(str2, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).l, composerImplV, (i2 >> 3) & 14, 0, 65534);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(str, str2, modifier, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract.ViewState r24, final kotlin.jvm.functions.Function1 r25, kotlin.jvm.functions.Function0 r26, androidx.compose.ui.Modifier r27, androidx.compose.material.ScaffoldState r28, kotlin.jvm.functions.Function0 r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.card.overlay.ui.RewardsCardOverlayScreenKt.c(au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract$ViewState, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void d(RewardsCardOverlayViewModel rewardsCardOverlayViewModel, Function0 closeScreen, Function1 copyToClipboard, Function1 saveToDigitalWallet, Composer composer, int i) {
        boolean z;
        ScaffoldState scaffoldState;
        ComposerImpl composerImpl;
        RewardsCardOverlayViewModel viewModel = rewardsCardOverlayViewModel;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(closeScreen, "closeScreen");
        Intrinsics.h(copyToClipboard, "copyToClipboard");
        Intrinsics.h(saveToDigitalWallet, "saveToDigitalWallet");
        ComposerImpl composerImplV = composer.v(405193963);
        int i2 = i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.I(closeScreen) ? 32 : 16) | (composerImplV.I(copyToClipboard) ? 256 : 128) | (composerImplV.I(saveToDigitalWallet) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            MutableState mutableStateA = FlowExtKt.a(viewModel.j, composerImplV);
            ScaffoldState scaffoldStateD = ScaffoldKt.d(null, composerImplV, 3);
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objG;
            Flow flow = viewModel.l;
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(viewModel) | composerImplV.I(coroutineScope) | composerImplV.n(scaffoldStateD) | composerImplV.I(context) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                z = false;
                RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$1$1 rewardsCardOverlayScreenKt$RewardsCardOverlayScreen$1$1 = new RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$1$1(viewModel, closeScreen, coroutineScope, copyToClipboard, saveToDigitalWallet, scaffoldStateD, context, null);
                viewModel = viewModel;
                scaffoldState = scaffoldStateD;
                composerImplV.A(rewardsCardOverlayScreenKt$RewardsCardOverlayScreen$1$1);
                objG2 = rewardsCardOverlayScreenKt$RewardsCardOverlayScreen$1$1;
            } else {
                z = false;
                scaffoldState = scaffoldStateD;
            }
            composerImplV.V(z);
            EffectsKt.e(composerImplV, flow, (Function2) objG2);
            RewardsCardOverlayContract.ViewState viewState = (RewardsCardOverlayContract.ViewState) mutableStateA.getD();
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(viewModel);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == composer$Companion$Empty$1) {
                RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$2$1 rewardsCardOverlayScreenKt$RewardsCardOverlayScreen$2$1 = new RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$2$1(1, viewModel, RewardsCardOverlayViewModel.class, "onCopyIconClick", "onCopyIconClick(Ljava/lang/String;)V", 0);
                composerImplV.A(rewardsCardOverlayScreenKt$RewardsCardOverlayScreen$2$1);
                objG3 = rewardsCardOverlayScreenKt$RewardsCardOverlayScreen$2$1;
            }
            KFunction kFunction = (KFunction) objG3;
            composerImplV.V(z);
            composerImplV.o(5004770);
            boolean zI3 = composerImplV.I(viewModel);
            Object objG4 = composerImplV.G();
            if (zI3 || objG4 == composer$Companion$Empty$1) {
                RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$3$1 rewardsCardOverlayScreenKt$RewardsCardOverlayScreen$3$1 = new RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$3$1(0, viewModel, RewardsCardOverlayViewModel.class, "onSaveToGoogleWalletClick", "onSaveToGoogleWalletClick()V", 0);
                composerImplV.A(rewardsCardOverlayScreenKt$RewardsCardOverlayScreen$3$1);
                objG4 = rewardsCardOverlayScreenKt$RewardsCardOverlayScreen$3$1;
            }
            KFunction kFunction2 = (KFunction) objG4;
            composerImplV.V(z);
            composerImplV.o(5004770);
            boolean zI4 = composerImplV.I(viewModel);
            Object objG5 = composerImplV.G();
            if (zI4 || objG5 == composer$Companion$Empty$1) {
                RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$4$1 rewardsCardOverlayScreenKt$RewardsCardOverlayScreen$4$1 = new RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$4$1(0, viewModel, RewardsCardOverlayViewModel.class, "onClose", "onClose()V", 0);
                composerImplV.A(rewardsCardOverlayScreenKt$RewardsCardOverlayScreen$4$1);
                objG5 = rewardsCardOverlayScreenKt$RewardsCardOverlayScreen$4$1;
            }
            composerImplV.V(z);
            composerImpl = composerImplV;
            c(viewState, (Function1) kFunction, (Function0) kFunction2, null, scaffoldState, (Function0) ((KFunction) objG5), composerImpl, 0, 8);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(rewardsCardOverlayViewModel, closeScreen, copyToClipboard, saveToDigitalWallet, i, 5);
        }
    }
}
