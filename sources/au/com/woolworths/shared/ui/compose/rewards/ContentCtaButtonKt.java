package au.com.woolworths.shared.ui.compose.rewards;

import android.webkit.URLUtil;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.intl.Locale;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.feature.rewards.account.closeaccount.ui.e;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shared-ui-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ContentCtaButtonKt {
    public static final void a(ContentCta contentCta, Composer composer, int i) {
        String url;
        ComposerImpl composerImplV = composer.v(1331698576);
        int i2 = (composerImplV.I(contentCta) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else if (Intrinsics.c(contentCta.getIsExternalUrl(), Boolean.TRUE) || ((url = contentCta.getUrl()) != null && URLUtil.isNetworkUrl(url))) {
            composerImplV.o(19531773);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            e(contentCta, composerImplV, i2 & 14);
            IconKt.a(PainterResources_androidKt.a(R.drawable.ic_open_external, 0, composerImplV), null, null, 0L, composerImplV, 48, 12);
            composerImplV.V(true);
            composerImplV.V(false);
        } else {
            composerImplV.o(19866728);
            e(contentCta, composerImplV, i2 & 14);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(contentCta, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final au.com.woolworths.android.onesite.data.ContentCta r14, kotlin.jvm.functions.Function0 r15, androidx.compose.ui.Modifier r16, boolean r17, androidx.compose.runtime.Composer r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shared.ui.compose.rewards.ContentCtaButtonKt.b(au.com.woolworths.android.onesite.data.ContentCta, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(ContentCta contentCta, Function1 onContentCtaClick, Modifier modifier, boolean z, Composer composer, int i, int i2) {
        int i3;
        ComposerImpl composerImpl;
        boolean z2;
        Modifier modifier2;
        Intrinsics.h(contentCta, "contentCta");
        Intrinsics.h(onContentCtaClick, "onContentCtaClick");
        ComposerImpl composerImplV = composer.v(-1543052171);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(contentCta) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(onContentCtaClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        int i5 = i3 | 3072;
        if ((i5 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
            z2 = z;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.d : modifier;
            composerImplV.o(-1633490746);
            boolean zI = ((i5 & 112) == 32) | composerImplV.I(contentCta);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new e(onContentCtaClick, contentCta, 4);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            b(contentCta, (Function0) objG, modifier3, true, composerImplV, i5 & 8078, 0);
            composerImpl = composerImplV;
            z2 = true;
            modifier2 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.a(contentCta, onContentCtaClick, modifier2, z2, i, i2, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final au.com.woolworths.android.onesite.data.ContentCta r13, kotlin.jvm.functions.Function0 r14, androidx.compose.ui.Modifier r15, boolean r16, androidx.compose.runtime.Composer r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shared.ui.compose.rewards.ContentCtaButtonKt.d(au.com.woolworths.android.onesite.data.ContentCta, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void e(ContentCta contentCta, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1349193522);
        if ((((composerImplV.I(contentCta) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            TextKt.b(StringKt.a(contentCta.getLabel(), Locale.Companion.a()), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerImpl, 0, 0, 131070);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(contentCta, i, 1);
        }
    }
}
