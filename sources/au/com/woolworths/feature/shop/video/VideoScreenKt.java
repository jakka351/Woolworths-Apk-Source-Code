package au.com.woolworths.feature.shop.video;

import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.media3.common.BasePlayer;
import androidx.media3.common.MediaItem;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.video.FullPageVideoPlayerContract;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import au.com.woolworths.shop.aem.components.ui.video.VideoUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"video_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class VideoScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final State viewState, final Function3 onVideoProgressUpdate, final Function0 onVideoPlayFromStart, final Function2 onVideoEnds, final Function0 onVideoError, Composer composer, final int i) {
        final Function2 function2;
        ComposerImpl composerImpl;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onVideoProgressUpdate, "onVideoProgressUpdate");
        Intrinsics.h(onVideoPlayFromStart, "onVideoPlayFromStart");
        Intrinsics.h(onVideoEnds, "onVideoEnds");
        Intrinsics.h(onVideoError, "onVideoError");
        ComposerImpl composerImplV = composer.v(-329441964);
        int i2 = i | (composerImplV.n(viewState) ? 4 : 2) | (composerImplV.I(onVideoProgressUpdate) ? 32 : 16) | (composerImplV.I(onVideoPlayFromStart) ? 256 : 128) | (composerImplV.I(onVideoEnds) ? 2048 : 1024) | (composerImplV.I(onVideoError) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            function2 = onVideoEnds;
            composerImpl = composerImplV;
        } else {
            if (((FullPageVideoPlayerContract.ViewState) viewState.getD()).f8214a == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i3 = 0;
                    recomposeScopeImplX.d = new Function2(viewState, onVideoProgressUpdate, onVideoPlayFromStart, onVideoEnds, onVideoError, i, i3) { // from class: au.com.woolworths.feature.shop.video.a
                        public final /* synthetic */ int d;
                        public final /* synthetic */ State e;
                        public final /* synthetic */ Function3 f;
                        public final /* synthetic */ Function0 g;
                        public final /* synthetic */ Function2 h;
                        public final /* synthetic */ Function0 i;

                        {
                            this.d = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.d) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iA = RecomposeScopeImplKt.a(1);
                                    VideoScreenKt.a(this.e, this.f, this.g, this.h, this.i, (Composer) obj, iA);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iA2 = RecomposeScopeImplKt.a(1);
                                    VideoScreenKt.a(this.e, this.f, this.g, this.h, this.i, (Composer) obj, iA2);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            function2 = onVideoEnds;
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            SnackbarHostState snackbarHostState = (SnackbarHostState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == obj) {
                objD = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objD);
            }
            MutableState mutableState = (MutableState) objD;
            Object objD2 = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD2 == obj) {
                VideoData videoData = ((FullPageVideoPlayerContract.ViewState) viewState.getD()).f8214a;
                Intrinsics.e(videoData);
                long j = ((FullPageVideoPlayerContract.ViewState) viewState.getD()).b;
                Intrinsics.h(context, "context");
                ExoPlayer exoPlayerA = new ExoPlayer.Builder(context).a();
                exoPlayerA.b(new ProgressiveMediaSource.Factory(new DefaultDataSource.Factory(context, new DefaultDataSource.Factory(context))).b(MediaItem.a(videoData.getUrl())));
                exoPlayerA.E(true);
                BasePlayer basePlayer = (BasePlayer) exoPlayerA;
                basePlayer.f0(j, basePlayer.S(), false);
                exoPlayerA.T(0);
                exoPlayerA.p();
                composerImplV.A(exoPlayerA);
                objD2 = exoPlayerA;
            }
            final ExoPlayer exoPlayer = (ExoPlayer) objD2;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            int i4 = i2 & 7168;
            boolean zI = (i4 == 2048) | composerImplV.I(exoPlayer);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == obj) {
                objG2 = new b(function2, exoPlayer, 0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            BackHandlerKt.a(false, (Function0) objG2, composerImplV, 0, 1);
            long j2 = Color.b;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(companion, j2, rectangleShapeKt$RectangleShape$1);
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i5 = composerImplV.P;
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
            Function2 function22 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function22);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            FillElement fillElement = SizeKt.c;
            boolean zD = ContextExtKt.d(context);
            composerImplV.o(-1633490746);
            boolean zI2 = ((i2 & 112) == 32) | composerImplV.I(exoPlayer);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == obj) {
                objG3 = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(17, onVideoProgressUpdate, exoPlayer);
                composerImplV.A(objG3);
            }
            Function1 function1 = (Function1) objG3;
            Object objD3 = au.com.woolworths.android.onesite.a.d(5004770, composerImplV, false);
            if (objD3 == obj) {
                objD3 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState, 15);
                composerImplV.A(objD3);
            }
            Function1 function12 = (Function1) objD3;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            boolean zI3 = composerImplV.I(exoPlayer) | (i4 == 2048);
            Object objG4 = composerImplV.G();
            if (zI3 || objG4 == obj) {
                objG4 = new b(function2, exoPlayer, 1);
                composerImplV.A(objG4);
            }
            Function0 function02 = (Function0) objG4;
            composerImplV.V(false);
            int i6 = i2 << 3;
            VideoUiKt.a(exoPlayer, function1, function12, onVideoPlayFromStart, function02, onVideoError, fillElement, zD, composerImplV, (i6 & 7168) | 1573248 | (i6 & 458752));
            boolean zBooleanValue = ((Boolean) mutableState.getD()).booleanValue();
            EnterTransition enterTransitionE = EnterExitTransitionKt.e(null, 3);
            ExitTransition exitTransitionF = EnterExitTransitionKt.f(null, 3);
            Modifier modifierD2 = WindowInsetsPaddingKt.d(SizeKt.q(companion, 56), WindowInsets_androidKt.c(composerImplV));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
            AnimatedVisibilityKt.d(zBooleanValue, boxScopeInstance.g(modifierD2, biasAlignment), enterTransitionE, exitTransitionF, null, ComposableLambdaKt.c(251061938, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.video.VideoScreenKt$VideoScreen$3$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    ((Number) obj4).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    ImageVector imageVectorA = CloseKt.a();
                    String strC = StringResources_androidKt.c(composer2, com.woolworths.R.string.content_description_close_button);
                    composer2.o(-1633490746);
                    Function2 function23 = function2;
                    boolean zN = composer2.n(function23);
                    ExoPlayer exoPlayer2 = exoPlayer;
                    boolean zI4 = zN | composer2.I(exoPlayer2);
                    Object objG5 = composer2.G();
                    if (zI4 || objG5 == Composer.Companion.f1624a) {
                        objG5 = new b(function23, exoPlayer2, 2);
                        composer2.A(objG5);
                    }
                    composer2.l();
                    IconButtonKt.c(imageVectorA, strC, (Function0) objG5, null, false, WxTheme.a(composer2).e(), composer2, 0, 24);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 200064, 16);
            composerImpl = composerImplV;
            SnackbarHostKt.b(snackbarHostState, PaddingKt.j(boxScopeInstance.g(companion, Alignment.Companion.h), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, 7), null, composerImpl, 6, 4);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImpl.X();
        if (recomposeScopeImplX2 != null) {
            final int i7 = 1;
            final Function2 function23 = function2;
            recomposeScopeImplX2.d = new Function2(viewState, onVideoProgressUpdate, onVideoPlayFromStart, function23, onVideoError, i, i7) { // from class: au.com.woolworths.feature.shop.video.a
                public final /* synthetic */ int d;
                public final /* synthetic */ State e;
                public final /* synthetic */ Function3 f;
                public final /* synthetic */ Function0 g;
                public final /* synthetic */ Function2 h;
                public final /* synthetic */ Function0 i;

                {
                    this.d = i7;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj22) {
                    switch (this.d) {
                        case 0:
                            ((Integer) obj22).getClass();
                            int iA = RecomposeScopeImplKt.a(1);
                            VideoScreenKt.a(this.e, this.f, this.g, this.h, this.i, (Composer) obj2, iA);
                            break;
                        default:
                            ((Integer) obj22).getClass();
                            int iA2 = RecomposeScopeImplKt.a(1);
                            VideoScreenKt.a(this.e, this.f, this.g, this.h, this.i, (Composer) obj2, iA2);
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }
}
