package au.com.woolworths.feature.rewards.offers.points.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.data.RewardsErrorDialog;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsErrorDialogUiKt {
    public static final void a(RewardsErrorDialog item, Function1 onCtaClick, Function0 onDismiss, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.h(item, "item");
        Intrinsics.h(onCtaClick, "onCtaClick");
        Intrinsics.h(onDismiss, "onDismiss");
        ComposerImpl composerImplV = composer.v(-1838077577);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(item) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onCtaClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onDismiss) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            b(item.f6282a, item.b, item.c, item.d, onCtaClick, onDismiss, composerImplV, (i3 << 9) & 4186112);
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(i, 9, item, onCtaClick, onDismiss, modifier2, false);
        }
    }

    public static final void b(final String str, final String str2, final ContentCta contentCta, final ContentCta contentCta2, final Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Function0 function02;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1596318819);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(contentCta) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(contentCta2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function02 = function0;
            i2 |= composerImplV.I(function02) ? 131072 : 65536;
        } else {
            function02 = function0;
        }
        int i3 = 1572864 & i;
        Modifier.Companion companion = Modifier.Companion.d;
        if (i3 == 0) {
            i2 |= composerImplV.n(companion) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            AndroidAlertDialog_androidKt.a(function02, ComposableLambdaKt.c(1417670315, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.RewardsErrorDialogUiKt$RewardsErrorDialogUi$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.b, Alignment.Companion.j, composer2, 6);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, Modifier.Companion.d);
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
                        Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        composer2.o(-2078140372);
                        ContentCta contentCta3 = contentCta;
                        Function1 function12 = function1;
                        if (contentCta3 != null) {
                            RewardsErrorDialogUiKt.c(function12, contentCta3, composer2);
                        }
                        composer2.l();
                        composer2.o(-2078138452);
                        ContentCta contentCta4 = contentCta2;
                        if (contentCta4 != null) {
                            RewardsErrorDialogUiKt.c(function12, contentCta4, composer2);
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), companion, null, ComposableLambdaKt.c(977890606, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.RewardsErrorDialogUiKt$RewardsErrorDialogUi$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-2032014161, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.RewardsErrorDialogUiKt$RewardsErrorDialogUi$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String str3 = str2;
                        if (str3 == null) {
                            str3 = "";
                        }
                        TextKt.b(str3, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, 0L, 0L, null, composerImpl, ((i2 >> 15) & 14) | 224304 | ((i2 >> 12) & 896), 960);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.tag.d(str, str2, contentCta, contentCta2, function1, function0, i);
        }
    }

    public static final void c(Function1 function1, final ContentCta contentCta, Composer composer) {
        composer.o(305909344);
        composer.o(-1633490746);
        boolean zN = composer.n(function1) | composer.I(contentCta);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new d(1, contentCta, function1);
            composer.A(objG);
        }
        composer.l();
        ButtonKt.c((Function0) objG, Modifier.Companion.d, false, null, null, null, null, null, ComposableLambdaKt.c(-426698493, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.RewardsErrorDialogUiKt$RewardsErrorDialogUi$ContentCtaButton$2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                RowScope TextButton = (RowScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                Intrinsics.h(TextButton, "$this$TextButton");
                if ((iIntValue & 17) == 16 && composer2.c()) {
                    composer2.j();
                } else {
                    String upperCase = contentCta.getLabel().toUpperCase(Locale.ROOT);
                    Intrinsics.g(upperCase, "toUpperCase(...)");
                    TextKt.b(upperCase, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                }
                return Unit.f24250a;
            }
        }, composer), composer, 805306368, 508);
        composer.l();
    }
}
