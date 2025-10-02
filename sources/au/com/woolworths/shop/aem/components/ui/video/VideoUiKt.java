package au.com.woolworths.shop.aem.components.ui.video;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.navigation.internal.d;
import au.com.woolworths.android.onesite.deeplink.f;
import au.com.woolworths.design.core.ui.component.stable.button.g;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration.c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0007\n\u0002\b\u0003*\u0001\u0000¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"au/com/woolworths/shop/aem/components/ui/video/VideoUiKt$VideoUi$playerListener$2$1$1", "playerListener", "shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class VideoUiKt {
    public static final void a(ExoPlayer exoPlayer, Function1 onIsPlayingChanged, Function1 onControllerVisibilityChange, Function0 onVideoPlayFromStart, Function0 onVideoEnds, Function0 onVideoError, Modifier modifier, boolean z, Composer composer, int i) {
        int i2;
        int i3;
        Object fVar;
        boolean z2;
        ExoPlayer exoPlayer2;
        Lazy lazy;
        ComposerImpl composerImpl;
        Intrinsics.h(exoPlayer, "exoPlayer");
        Intrinsics.h(onIsPlayingChanged, "onIsPlayingChanged");
        Intrinsics.h(onControllerVisibilityChange, "onControllerVisibilityChange");
        Intrinsics.h(onVideoPlayFromStart, "onVideoPlayFromStart");
        Intrinsics.h(onVideoEnds, "onVideoEnds");
        Intrinsics.h(onVideoError, "onVideoError");
        ComposerImpl composerImplV = composer.v(-99931167);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(exoPlayer) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onIsPlayingChanged) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onControllerVisibilityChange) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onVideoPlayFromStart) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onVideoEnds) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onVideoError) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.p(z) ? 8388608 : 4194304;
        }
        if ((i2 & 4793491) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 112) == 32) | ((i2 & 458752) == 131072) | composerImplV.I(exoPlayer) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                i3 = i2;
                z2 = false;
                fVar = new f(onVideoError, onIsPlayingChanged, exoPlayer, onVideoPlayFromStart, onVideoEnds, 3);
                composerImplV.A(fVar);
            } else {
                i3 = i2;
                fVar = objG;
                z2 = false;
            }
            composerImplV.V(z2);
            Lazy lazyB = LazyKt.b((Function0) fVar);
            MutableState mutableStateL = SnapshotStateKt.l(composerImplV.x(LocalLifecycleOwnerKt.f2808a), composerImplV);
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(exoPlayer);
            Object objG2 = composerImplV.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new c(exoPlayer, 1);
                composerImplV.A(objG2);
            }
            LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) objG2;
            composerImplV.V(z2);
            ((LifecycleOwner) mutableStateL.getD()).getD().a(lifecycleEventObserver);
            Modifier modifierA = TestTagKt.a(BackgroundKt.b(SizeKt.e(modifier, 1.0f), Color.b, RectangleShapeKt.f1779a), "video");
            composerImplV.o(-1224400529);
            boolean zI3 = composerImplV.I(context) | composerImplV.I(exoPlayer) | ((29360128 & i3) == 8388608 ? true : z2) | composerImplV.I(lazyB) | ((i3 & 896) != 256 ? z2 : true);
            Object objG3 = composerImplV.G();
            if (zI3 || objG3 == composer$Companion$Empty$1) {
                d dVar = new d(context, exoPlayer, z, lazyB, onControllerVisibilityChange);
                exoPlayer2 = exoPlayer;
                lazy = lazyB;
                composerImplV.A(dVar);
                objG3 = dVar;
            } else {
                exoPlayer2 = exoPlayer;
                lazy = lazyB;
            }
            composerImplV.V(z2);
            AndroidView_androidKt.a((Function1) objG3, modifierA, null, composerImplV, 0, 4);
            composerImpl = composerImplV;
            composerImpl.o(-1224400529);
            boolean zN = composerImpl.n(mutableStateL) | composerImpl.I(lifecycleEventObserver) | composerImpl.I(exoPlayer2) | composerImpl.I(lazy);
            Object objG4 = composerImpl.G();
            if (zN || objG4 == composer$Companion$Empty$1) {
                androidx.navigation.internal.c cVar = new androidx.navigation.internal.c(mutableStateL, lifecycleEventObserver, exoPlayer2, lazy, 11);
                composerImpl.A(cVar);
                objG4 = cVar;
            }
            composerImpl.V(z2);
            EffectsKt.c(Unit.f24250a, (Function1) objG4, composerImpl);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(exoPlayer, onIsPlayingChanged, onControllerVisibilityChange, onVideoPlayFromStart, onVideoEnds, onVideoError, modifier, z, i);
        }
    }
}
