package com.woolworths.scanlibrary.ui.scanner;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import au.com.woolworths.shop.cart.ui.cart.l;
import com.google.accompanist.permissions.MultiplePermissionsStateKt;
import com.google.accompanist.permissions.MutableMultiplePermissionsState;
import com.woolworths.scanlibrary.ui.message.Messages;
import com.woolworths.scanlibrary.ui.scanner.ScannerContract;
import com.woolworths.scanlibrary.util.composable.SngPermissionRequiredKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"scanGoLibrary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ScannerScreenKt {
    public static final void a(ScannerViewModel scannerViewModel, Function0 function0, Function0 function02, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1217389501);
        int i2 = (composerImplV.I(scannerViewModel) ? 4 : 2) | i | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.I(function02) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final ScannerContract.ViewState viewState = (ScannerContract.ViewState) FlowExtKt.a(scannerViewModel.h, composerImplV).getD();
            int i3 = i2 >> 3;
            b(function0, function02, ComposableLambdaKt.c(589702914, new Function2<Composer, Integer, Unit>() { // from class: com.woolworths.scanlibrary.ui.scanner.ScannerScreenKt$ScannerScreen$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        FillElement fillElement = SizeKt.c;
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, fillElement);
                        ComposeUiNode.e3.getClass();
                        Function0 function03 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function03);
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
                        ScannerContract.ViewState viewState2 = viewState;
                        TextKt.b(androidx.camera.core.impl.b.i(viewState2.b, viewState2.f21323a, "Scanner uplift\nStore: ", ", Items: "), PaddingKt.f(Modifier.Companion.d, 16), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 48, 0, 131068);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i3 & 112) | (i3 & 14) | KyberEngine.KyberPolyBytes);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.product.details.ui.linkdedicatedviews.a((ViewModel) scannerViewModel, function0, (Object) function02, i, 5);
        }
    }

    public static final void b(Function0 onUpClicked, Function0 onSettingsClick, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Intrinsics.h(onUpClicked, "onUpClicked");
        Intrinsics.h(onSettingsClick, "onSettingsClick");
        ComposerImpl composerImplV = composer.v(-1679448344);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onUpClicked) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onSettingsClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MutableMultiplePermissionsState mutableMultiplePermissionsStateA = MultiplePermissionsStateKt.a(CollectionsKt.Q("android.permission.CAMERA"), composerImplV);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerImplV.x(LocalLifecycleOwnerKt.f2808a);
            composerImplV.o(-1633490746);
            boolean zN = composerImplV.n(mutableMultiplePermissionsStateA) | composerImplV.I(lifecycleOwner);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new l(29, lifecycleOwner, mutableMultiplePermissionsStateA);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.c(lifecycleOwner, (Function1) objG, composerImplV);
            if (((Boolean) mutableMultiplePermissionsStateA.d.getD()).booleanValue()) {
                composerImplV.o(-370739039);
                android.support.v4.media.session.a.y((i2 >> 6) & 14, composableLambdaImpl, composerImplV, false);
            } else {
                composerImplV.o(-370702986);
                Messages.Companion companion = Messages.h;
                int i3 = i2 << 3;
                SngPermissionRequiredKt.a(onUpClicked, onSettingsClick, composerImplV, (i3 & 896) | (i3 & 112) | 6);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(onUpClicked, onSettingsClick, composableLambdaImpl, i, 0);
        }
    }
}
