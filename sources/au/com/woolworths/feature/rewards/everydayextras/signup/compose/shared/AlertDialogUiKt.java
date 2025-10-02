package au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
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
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.intl.Locale;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.product.list.compose.productfinder.g;
import au.com.woolworths.feature.product.list.v2.ui.f;
import au.com.woolworths.feature.rewards.account.closeaccount.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AlertDialogUiKt {
    public static final void a(final String str, final String str2, final ContentCta contentCta, final ContentCta contentCta2, final Function1 onCloseAlertDialogClick, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(onCloseAlertDialogClick, "onCloseAlertDialogClick");
        ComposerImpl composerImplV = composer.v(-892589509);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.I(contentCta) ? 256 : 128) | (composerImplV.I(contentCta2) ? 2048 : 1024) | (composerImplV.I(onCloseAlertDialogClick) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(5004770);
            boolean z = (i2 & 57344) == 16384;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new f(6, onCloseAlertDialogClick);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            AndroidAlertDialog_androidKt.a((Function0) objG, ComposableLambdaKt.c(-1148777741, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.AlertDialogUiKt$AlertDialogUi$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.o, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, Modifier.Companion.d);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        composer2.o(-1633490746);
                        Function1 function1 = onCloseAlertDialogClick;
                        boolean zN = composer2.n(function1);
                        final ContentCta contentCta3 = contentCta;
                        boolean zI = zN | composer2.I(contentCta3);
                        Object objG2 = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (zI || objG2 == obj3) {
                            objG2 = new e(function1, contentCta3, 1);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        ButtonKt.c((Function0) objG2, null, false, null, null, null, null, null, ComposableLambdaKt.c(-479317344, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.AlertDialogUiKt$AlertDialogUi$2$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                RowScope TextButton = (RowScope) obj4;
                                Composer composer3 = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(TextButton, "$this$TextButton");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    String label = contentCta3.getLabel();
                                    String strA = label != null ? StringKt.a(label, Locale.Companion.a()) : null;
                                    if (strA == null) {
                                        strA = "";
                                    }
                                    TextKt.b(strA, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 805306368, 510);
                        composer2.o(-823292925);
                        final ContentCta contentCta4 = contentCta2;
                        if (contentCta4 != null) {
                            composer2.o(-1633490746);
                            boolean zN2 = composer2.n(function1) | composer2.I(contentCta4);
                            Object objG3 = composer2.G();
                            if (zN2 || objG3 == obj3) {
                                objG3 = new e(function1, contentCta4, 2);
                                composer2.A(objG3);
                            }
                            composer2.l();
                            ButtonKt.c((Function0) objG3, null, false, null, null, null, null, null, ComposableLambdaKt.c(1477485042, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.AlertDialogUiKt$AlertDialogUi$2$1$3$2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    RowScope TextButton = (RowScope) obj4;
                                    Composer composer3 = (Composer) obj5;
                                    int iIntValue = ((Number) obj6).intValue();
                                    Intrinsics.h(TextButton, "$this$TextButton");
                                    if ((iIntValue & 17) == 16 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        TextKt.b(StringKt.a(contentCta4.getLabel(), Locale.Companion.a()), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 805306368, 510);
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, ComposableLambdaKt.c(1136866192, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.AlertDialogUiKt$AlertDialogUi$3
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
            }, composerImplV), ComposableLambdaKt.c(1898747503, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.AlertDialogUiKt$AlertDialogUi$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextKt.b(str2, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, 0L, 0L, null, composerImpl, 224304, 964);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(str, str2, contentCta, contentCta2, onCloseAlertDialogClick, i, 3);
        }
    }
}
