package au.com.woolworths.feature.rewards.account.settings.v2.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.feature.product.list.legacy.a0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountSettingsScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsContract.ViewState r33, final kotlin.jvm.functions.Function0 r34, final kotlin.jvm.functions.Function0 r35, final kotlin.jvm.functions.Function1 r36, final kotlin.jvm.functions.Function0 r37, final kotlin.jvm.functions.Function0 r38, final kotlin.jvm.functions.Function0 r39, final kotlin.jvm.functions.Function0 r40, final kotlin.jvm.functions.Function1 r41, final kotlin.jvm.functions.Function1 r42, final kotlin.jvm.functions.Function1 r43, final kotlin.jvm.functions.Function1 r44, androidx.compose.material.ScaffoldState r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.account.settings.v2.ui.AccountSettingsScreenKt.a(au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsContract$ViewState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.material.ScaffoldState, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void b(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(809817713);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
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
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(1862873712);
            for (int i3 = 0; i3 < 2; i3++) {
                LoadingPlaceholderItemUiKt.b(6, 0, composerImplV, SizeKt.e(companion, 0.5f));
                composerImplV.o(1862878135);
                for (int i4 = 0; i4 < 3; i4++) {
                    LoadingPlaceholderItemUiKt.b(6, 0, composerImplV, SizeKt.e(companion, 0.7f));
                }
                composerImplV.V(false);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a0(i, 11);
        }
    }
}
