package au.com.woolworths.foundation.shop.olive.voice.ui.permission;

import android.content.Context;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.compose.productfinder.g;
import au.com.woolworths.foundation.shop.nhp.ui.edr.c;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.AudioPermissionRationaleLottieKt;
import com.google.accompanist.permissions.PermissionState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"olive-voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PermissionRationaleContentKt {
    public static final void a(PaddingValues paddingValues, PermissionState permissionState, Function0 onPermissionRationaleShown, Function1 onPermissionRationaleAction, Function2 onClose, Composer composer, int i) {
        Function1 function1;
        Intrinsics.h(paddingValues, "paddingValues");
        Intrinsics.h(onPermissionRationaleShown, "onPermissionRationaleShown");
        Intrinsics.h(onPermissionRationaleAction, "onPermissionRationaleAction");
        Intrinsics.h(onClose, "onClose");
        ComposerImpl composerImplV = composer.v(-497313191);
        int i2 = i | (composerImplV.n(paddingValues) ? 4 : 2) | (composerImplV.n(permissionState) ? 32 : 16) | (composerImplV.I(onPermissionRationaleShown) ? 256 : 128) | (composerImplV.I(onPermissionRationaleAction) ? 2048 : 1024) | (composerImplV.I(onClose) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            function1 = onPermissionRationaleAction;
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerImplV.x(LocalLifecycleOwnerKt.f2808a);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(lifecycleOwner);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (zI || objG == obj) {
                objG = new au.com.woolworths.foundation.shop.olive.voice.ui.onboarding.a(lifecycleOwner, onPermissionRationaleShown, 2);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.c(lifecycleOwner, (Function1) objG, composerImplV);
            float f = 16;
            Modifier modifierJ = PaddingKt.j(PaddingKt.f(SizeKt.c, f), BitmapDescriptorFactory.HUE_RED, paddingValues.getB(), BitmapDescriptorFactory.HUE_RED, paddingValues.getD(), 5);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == obj) {
                objG2 = new c(14);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierJ, false, (Function1) objG2);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(columnScopeInstance.a(companion, 1.0f, true), 1.0f);
            float f2 = 8;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f2);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.n;
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(spacedAlignedG, horizontal, composerImplV, 54);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierE);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            AudioPermissionRationaleLottieKt.a(columnScopeInstance.a(companion, 1.0f, true), composerImplV, 0);
            Arrangement.SpacedAligned spacedAlignedI = Arrangement.i(f2, Alignment.Companion.k);
            Modifier modifierE2 = SizeKt.e(columnScopeInstance.a(companion, 1.0f, true), 1.0f);
            composerImplV.o(1849434622);
            Object objG3 = composerImplV.G();
            if (objG3 == obj) {
                objG3 = new c(15);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            Modifier modifierB2 = SemanticsModifierKt.b(modifierE2, true, (Function1) objG3);
            ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(spacedAlignedI, horizontal, composerImplV, 54);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierB2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA3, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            TextKt.a(StringResources_androidKt.c(composerImplV, R.string.olive_voice_permission_rationale_title), CoreTheme.f(composerImplV).d.f5129a.b, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7), CoreTheme.b(composerImplV).e.d.c.b, null, 3, 0, false, 0, null, composerImplV, KyberEngine.KyberPolyBytes, 976);
            TextKt.a(StringResources_androidKt.c(composerImplV, R.string.olive_voice_permission_rationale_desc), CoreTheme.f(composerImplV).f5120a.b.f5123a, null, Color.b(CoreTheme.b(composerImplV).e.d.c.b, 0.7f), null, 3, 0, false, 0, null, composerImplV, 0, 980);
            composerImplV.V(true);
            SpacerKt.a(composerImplV, columnScopeInstance.a(companion, 1.0f, true));
            Modifier modifierE3 = SizeKt.e(companion, 1.0f);
            String upperCase = StringResources_androidKt.c(composerImplV, R.string.olive_voice_permission_action_primary).toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            composerImplV.o(-1746271574);
            int i6 = i2 & 7168;
            boolean zI2 = (i6 == 2048) | composerImplV.I(context) | ((i2 & 112) == 32);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == obj) {
                objG4 = new androidx.work.impl.utils.c(15, onPermissionRationaleAction, context, permissionState);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            function1 = onPermissionRationaleAction;
            PrimaryButtonKt.a(upperCase, (Function0) objG4, modifierE3, false, null, null, null, null, composerImplV, KyberEngine.KyberPolyBytes, 248);
            Modifier modifierE4 = SizeKt.e(companion, 1.0f);
            composerImplV.o(-1746271574);
            boolean zI3 = composerImplV.I(context) | (i6 == 2048) | ((i2 & 57344) == 16384);
            Object objG5 = composerImplV.G();
            if (zI3 || objG5 == obj) {
                objG5 = new androidx.work.impl.utils.c(16, function1, context, onClose);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            ButtonKt.c((Function0) objG5, modifierE4, false, null, null, null, null, null, ComposableSingletons$PermissionRationaleContentKt.f8857a, composerImplV, 805306416, 508);
            composerImplV = composerImplV;
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(paddingValues, permissionState, onPermissionRationaleShown, function1, onClose, i, 12);
        }
    }
}
