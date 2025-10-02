package au.com.woolworths.foundation.shop.video.advertising.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonSpec;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.k;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"video-advertising_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class VideoAdPlayerFunctionsKt {
    public static final void a(boolean z, Function1 onPlayButtonClick, Modifier modifier, Composer composer, int i) {
        int i2;
        ImageVector imageVector;
        Modifier modifier2;
        Intrinsics.h(onPlayButtonClick, "onPlayButtonClick");
        ComposerImpl composerImplV = composer.v(2044386957);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.p(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onPlayButtonClick) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            long jB = Color.b(CoreTheme.b(composerImplV).e.f4848a.c, 0.6f);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.f1100a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierQ = SizeKt.q(BackgroundKt.b(companion, jB, roundedCornerShape), 28);
            if (z) {
                composerImplV.o(1855826354);
                imageVector = CoreTheme.e(composerImplV).f4879a.o;
                composerImplV.V(false);
            } else {
                composerImplV.o(1855828081);
                imageVector = CoreTheme.e(composerImplV).f4879a.p;
                composerImplV.V(false);
            }
            String strL = z ? au.com.woolworths.dynamic.page.ui.content.d.l(composerImplV, 1855830129, R.string.video_pause_button_content_description, composerImplV, false) : au.com.woolworths.dynamic.page.ui.content.d.l(composerImplV, 1855833136, R.string.video_play_button_content_description, composerImplV, false);
            IconButtonSpec.Size size = IconButtonSpec.Size.g;
            long j = CoreTheme.b(composerImplV).e.c.d;
            composerImplV.o(-1633490746);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new c(onPlayButtonClick, z, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            IconButtonKt.c(imageVector, strL, (Function0) objG, modifierQ, false, size, j, composerImplV, 196608, 16);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(z, onPlayButtonClick, modifier2, i, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(int r17, int r18, int r19, androidx.compose.runtime.Composer r20, androidx.compose.ui.Modifier r21) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdPlayerFunctionsKt.b(int, int, int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier):void");
    }

    public static final void c(int i, Composer composer, Modifier modifier, Function0 onVideoTranscriptClick) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(onVideoTranscriptClick, "onVideoTranscriptClick");
        ComposerImpl composerImplV = composer.v(-1119827733);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onVideoTranscriptClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            long jB = Color.b(CoreTheme.b(composerImplV).e.f4848a.c, 0.6f);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.f1100a;
            modifier2 = Modifier.Companion.d;
            Modifier modifierQ = SizeKt.q(BackgroundKt.b(modifier2, jB, roundedCornerShape), 28);
            ImageVector imageVector = CoreTheme.e(composerImplV).k.k;
            String strC = StringResources_androidKt.c(composerImplV, R.string.video_transcript_content_description);
            IconButtonSpec.Size size = IconButtonSpec.Size.g;
            long j = CoreTheme.b(composerImplV).e.c.d;
            composerImplV.o(5004770);
            boolean z = (i3 & 14) == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new k(28, onVideoTranscriptClick);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            IconButtonKt.c(imageVector, strC, (Function0) objG, modifierQ, false, size, j, composerImplV, 196608, 16);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.b(onVideoTranscriptClick, modifier2, i, 9);
        }
    }
}
