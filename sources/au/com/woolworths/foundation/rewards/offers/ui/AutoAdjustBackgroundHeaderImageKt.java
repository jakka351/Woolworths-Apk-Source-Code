package au.com.woolworths.foundation.rewards.offers.ui;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil3.Extras;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "backgroundColor", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "offers-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AutoAdjustBackgroundHeaderImageKt {
    public static final void a(String str, Modifier modifier, Painter painter, Composer composer, int i, int i2) {
        Painter painter2;
        int i3;
        Painter painter3;
        ComposerImpl composerImplV = composer.v(1377737322);
        int i4 = i | (composerImplV.n(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= composerImplV.n(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | KyberEngine.KyberPolyBytes;
            painter2 = painter;
        } else {
            painter2 = painter;
            i3 = i4 | (composerImplV.I(painter2) ? 256 : 128);
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            painter3 = painter2;
        } else {
            Painter painter4 = i5 != 0 ? null : painter2;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(new Color(Color.j));
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = SnapshotStateKt.f(ContentScale.Companion.f1880a);
                composerImplV.A(objD);
            }
            MutableState mutableState2 = (MutableState) objD;
            composerImplV.V(false);
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            ImageRequest.Builder builder = new ImageRequest.Builder(context);
            builder.c = str;
            Extras.Key key = ImageRequests_androidKt.f13142a;
            builder.b().b(ImageRequests_androidKt.h, Boolean.FALSE);
            ImageRequest imageRequestA = builder.a();
            Modifier modifierB = BackgroundKt.b(modifier, ((Color) mutableState.getD()).f1766a, RectangleShapeKt.f1779a);
            ContentScale contentScale = (ContentScale) mutableState2.getD();
            composerImplV.o(-1746271574);
            boolean zI = composerImplV.I(context);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new androidx.lifecycle.compose.b(28, context, mutableState2, mutableState);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            SingletonAsyncImageKt.b(imageRequestA, null, modifierB, painter4, painter4, null, null, (Function1) objG2, null, null, contentScale, null, composerImplV, ((i3 << 3) & 7168) | 48 | ((i3 << 6) & 57344), 0, 31584);
            painter3 = painter4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.base.rewards.account.ui.a(str, modifier, painter3, i, i2, 15);
        }
    }
}
