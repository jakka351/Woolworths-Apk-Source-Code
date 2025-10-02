package au.com.woolworths.foundation.shop.olive.voice.ui.permission;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f;
import au.com.woolworths.foundation.shop.nhp.ui.edr.c;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.AudioPermissionLottieKt;
import com.google.accompanist.permissions.PermissionState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
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
public final class PermissionDescContentKt {
    public static final void a(DescItem descItem, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1807404877);
        if ((((composerImplV.n(descItem) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new c(13);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierE, true, (Function1) objG);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(12), Alignment.Companion.j, composerImplV, 6);
            int i2 = composerImplV.P;
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
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            IconKt.a(PainterResources_androidKt.a(descItem.f8858a, 0, composerImplV), "", null, CoreTheme.b(composerImplV).e.c.c.b, composerImplV, 48, 4);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(4), Alignment.Companion.m, composerImplV, 6);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            String strC = StringResources_androidKt.c(composerImplV, descItem.b);
            TextStyle textStyle = CoreTheme.f(composerImplV).e.f5133a.b;
            long j = CoreTheme.b(composerImplV).e.d.c.b;
            composerImplV = composerImplV;
            TextKt.a(strC, textStyle, null, j, null, 1, 0, false, 0, null, composerImplV, 0, 980);
            TextKt.a(StringResources_androidKt.c(composerImplV, descItem.c), CoreTheme.f(composerImplV).f5120a.c.f5124a, null, Color.b(CoreTheme.b(composerImplV).e.d.c.b, 0.7f), null, 1, 0, false, 0, null, composerImplV, 0, 980);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 18, descItem);
        }
    }

    public static final void b(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-386083354);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierB = ScrollKt.b(SizeKt.e(Modifier.Companion.d, 1.0f), ScrollKt.a(composerImplV), true);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(24), Alignment.Companion.n, composerImplV, 54);
            int i2 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1289666022);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new DescItem(R.drawable.icon_waveform, R.string.olive_voice_permission_onboarding_item_1_title, R.string.olive_voice_permission_onboarding_item_1_desc));
            arrayList.add(new DescItem(R.drawable.icon_settings, R.string.olive_voice_permission_onboarding_item_2_title, R.string.olive_voice_permission_onboarding_item_2_desc));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((DescItem) it.next(), composerImplV, 0);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, 0);
        }
    }

    public static final void c(PaddingValues paddingValues, PermissionState permissionState, Function0 onPrimaryAction, Function0 onPermissionScreenShown, Composer composer, int i) {
        Intrinsics.h(paddingValues, "paddingValues");
        Intrinsics.h(onPrimaryAction, "onPrimaryAction");
        Intrinsics.h(onPermissionScreenShown, "onPermissionScreenShown");
        ComposerImpl composerImplV = composer.v(441877670);
        int i2 = i | (composerImplV.n(paddingValues) ? 4 : 2) | (composerImplV.n(permissionState) ? 32 : 16) | (composerImplV.I(onPrimaryAction) ? 256 : 128) | (composerImplV.I(onPermissionScreenShown) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerImplV.x(LocalLifecycleOwnerKt.f2808a);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 7168) == 2048) | composerImplV.I(lifecycleOwner);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (zI || objG == obj) {
                objG = new au.com.woolworths.foundation.shop.olive.voice.ui.onboarding.a(lifecycleOwner, onPermissionScreenShown, 1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.c(lifecycleOwner, (Function1) objG, composerImplV);
            Modifier modifierJ = PaddingKt.j(PaddingKt.f(SizeKt.c, 16), BitmapDescriptorFactory.HUE_RED, paddingValues.getB(), BitmapDescriptorFactory.HUE_RED, paddingValues.getD(), 5);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == obj) {
                objG2 = new c(11);
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
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.g(8), Alignment.Companion.n, composerImplV, 54);
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
            d(composerImplV, 6);
            composerImplV.V(true);
            Modifier modifierE2 = SizeKt.e(companion, 1.0f);
            composerImplV.o(1849434622);
            Object objG3 = composerImplV.G();
            if (objG3 == obj) {
                objG3 = new c(12);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            Modifier modifierB2 = SemanticsModifierKt.b(modifierE2, false, (Function1) objG3);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierB2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            Modifier modifierG = BoxScopeInstance.f944a.g(SizeKt.e(companion, 1.0f), Alignment.Companion.h);
            String strC = StringResources_androidKt.c(composerImplV, R.string.olive_voice_action_continue);
            composerImplV.o(-1633490746);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objG4 = composerImplV.G();
            if (z || objG4 == obj) {
                objG4 = new f(25, onPrimaryAction, permissionState);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            PrimaryButtonKt.a(strC, (Function0) objG4, modifierG, false, null, null, null, null, composerImplV, 0, 248);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(paddingValues, permissionState, onPrimaryAction, onPermissionScreenShown, i, 24);
        }
    }

    public static final void d(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(582198695);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(columnScopeInstance.a(companion, 1.0f, true), 1.0f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            float f = 8;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.n;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(spacedAlignedG, horizontal, composerImplV, 54);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Arrangement.SpacedAligned spacedAlignedI = Arrangement.i(f, Alignment.Companion.k);
            Modifier modifierE2 = SizeKt.e(columnScopeInstance.a(companion, 1.0f, true), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(spacedAlignedI, horizontal, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierE2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            AudioPermissionLottieKt.a(composerImplV, 6);
            composerImplV.V(true);
            Modifier modifierE3 = SizeKt.e(PaddingKt.h(columnScopeInstance.a(companion, 2.0f, true), BitmapDescriptorFactory.HUE_RED, 16, 1), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(Arrangement.c, horizontal, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierE3);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA3, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            TextKt.a(StringResources_androidKt.c(composerImplV, R.string.olive_voice_permission_onboarding_title), CoreTheme.f(composerImplV).d.f5129a.b, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 32, BitmapDescriptorFactory.HUE_RED, 64, 5), CoreTheme.b(composerImplV).e.d.c.b, null, 3, 0, false, 0, null, composerImplV, KyberEngine.KyberPolyBytes, 976);
            b(composerImplV, 0);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.modeselector.ui.b(i, 29);
        }
    }
}
