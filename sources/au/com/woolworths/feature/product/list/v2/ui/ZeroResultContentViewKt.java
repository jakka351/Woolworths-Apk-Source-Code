package au.com.woolworths.feature.product.list.v2.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shared.ui.compose.shop.chatentrycard.ChatEntryBannerUiKt;
import au.com.woolworths.shared.ui.compose.shop.chatentrycard.ChatEntryCardV3;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ZeroResultContentViewKt {
    public static final void a(int i, Composer composer, Function1 function1) {
        ComposerImpl composerImplV = composer.v(-519798);
        int i2 = (composerImplV.I(function1) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ActionData actionData = new ActionData("", ActionType.e, null, null);
            Modifier modifierB = BackgroundKt.b(SizeKt.e(Modifier.Companion.d, 1.0f), CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
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
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            String strC = StringResources_androidKt.c(composerImplV, R.string.ask_olive_entry_banner_title);
            ChatEntryCardV3 chatEntryCardV3 = new ChatEntryCardV3(strC, Boolean.TRUE, CollectionsKt.R(StringResources_androidKt.c(composerImplV, R.string.ask_olive_entry_banner_subtitle_gluten_free_snack), StringResources_androidKt.c(composerImplV, R.string.ask_olive_entry_banner_subtitle_lunchbox_specials_under_10)), actionData);
            composerImplV.o(-1633490746);
            boolean zN = ((i2 & 14) == 4) | composerImplV.n(strC);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.product.list.compose.errorscreen.b(function1, strC, 2);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            ChatEntryBannerUiKt.a(chatEntryCardV3, (Function1) objG, composerImplV, 8);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.errorscreen.c(i, 2, function1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final au.com.woolworths.feature.product.list.v2.data.ProductListZeroResults.ZeroResultData r24, final boolean r25, final au.com.woolworths.product.tile.ProductClickListener r26, boolean r27, final kotlin.jvm.functions.Function1 r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.v2.ui.ZeroResultContentViewKt.b(au.com.woolworths.feature.product.list.v2.data.ProductListZeroResults$ZeroResultData, boolean, au.com.woolworths.product.tile.ProductClickListener, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
