package au.com.woolworths.feature.rewards.account.closeaccount.ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.feature.product.list.legacy.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CloseAccountScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountContract.ViewState r26, final kotlin.jvm.functions.Function0 r27, final kotlin.jvm.functions.Function1 r28, final kotlin.jvm.functions.Function1 r29, final kotlin.jvm.functions.Function0 r30, final kotlin.jvm.functions.Function0 r31, androidx.compose.material.ScaffoldState r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.account.closeaccount.ui.CloseAccountScreenKt.a(au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountContract$ViewState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.material.ScaffoldState, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1983854496);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 31, 0L, 0L, composerImplV, null);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a0(i, 9);
        }
    }
}
