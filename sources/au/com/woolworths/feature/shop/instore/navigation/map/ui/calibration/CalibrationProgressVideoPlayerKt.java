package au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.common.BasePlayer;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import com.google.common.collect.ImmutableList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CalibrationProgressVideoPlayerKt {
    public static final void a(Uri videoUri, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(videoUri, "videoUri");
        ComposerImpl composerImplV = composer.v(1575541258);
        if ((((composerImplV.I(videoUri) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            Object obj2 = objG;
            if (objG == obj) {
                Player playerA = new ExoPlayer.Builder(context).a();
                MediaItem.Builder builder = new MediaItem.Builder();
                builder.b = videoUri;
                ((BasePlayer) playerA).B(ImmutableList.w(builder.a()));
                playerA.p();
                composerImplV.A(playerA);
                obj2 = playerA;
            }
            ExoPlayer exoPlayer = (ExoPlayer) obj2;
            composerImplV.V(false);
            Intrinsics.e(exoPlayer);
            MutableState mutableStateL = SnapshotStateKt.l(composerImplV.x(LocalLifecycleOwnerKt.f2808a), composerImplV);
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(exoPlayer);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == obj) {
                objG2 = new c(exoPlayer, 0);
                composerImplV.A(objG2);
            }
            LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) objG2;
            composerImplV.V(false);
            ((LifecycleOwner) mutableStateL.getD()).getD().a(lifecycleEventObserver);
            composerImplV.o(-1746271574);
            boolean zN = composerImplV.n(mutableStateL) | composerImplV.I(lifecycleEventObserver) | composerImplV.I(exoPlayer);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == obj) {
                objG3 = new androidx.lifecycle.compose.b(20, mutableStateL, lifecycleEventObserver, exoPlayer);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EffectsKt.c(Unit.f24250a, (Function1) objG3, composerImplV);
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(exoPlayer);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == obj) {
                objG4 = new CalibrationProgressVideoPlayerKt$CalibrationProgressVideoPlayer$2$1(exoPlayer, null);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, videoUri, (Function2) objG4);
            composerImplV.o(5004770);
            boolean zI3 = composerImplV.I(exoPlayer);
            Object objG5 = composerImplV.G();
            if (zI3 || objG5 == obj) {
                objG5 = new l(exoPlayer, 29);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            modifier2 = modifier;
            AndroidView_androidKt.a((Function1) objG5, modifier2, null, composerImplV, 48, 4);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(videoUri, i, 13, modifier2);
        }
    }
}
