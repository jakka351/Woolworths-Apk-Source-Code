package au.com.woolworths.foundation.shop.video.advertising.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.common.BasePlayer;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.datasource.cache.SimpleCache;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.navigation.internal.f;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.feature.product.list.compose.productfinder.g;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdData;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdEventAnalytics;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerConfig;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import coil3.Extras;
import coil3.Image_androidKt;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0006²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdPlayerState;", "updatedVideoAdPlayerState", "", "playerCounter", "Landroid/graphics/Bitmap;", "bitmap", "video-advertising_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class VideoAdPlayerKt {
    public static final void a(ExoPlayer exoPlayer, Context context, Player.Listener listener, Modifier modifier, VideoAdPlayerConfig videoAdPlayerConfig, Composer composer, int i) {
        VideoAdPlayerConfig videoAdPlayerConfig2;
        VideoAdPlayerConfig videoAdPlayerConfig3;
        ComposerImpl composerImpl;
        VideoAdPlayerConfig videoAdPlayerConfig4;
        ComposerImpl composerImplV = composer.v(127025899);
        if ((((composerImplV.I(exoPlayer) ? 4 : 2) | i | (composerImplV.I(context) ? 32 : 16) | (composerImplV.I(listener) ? 256 : 128) | 8192) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            videoAdPlayerConfig4 = videoAdPlayerConfig;
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                videoAdPlayerConfig2 = new VideoAdPlayerConfig();
            } else {
                composerImplV.j();
                videoAdPlayerConfig2 = videoAdPlayerConfig;
            }
            composerImplV.W();
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(context) | composerImplV.n(videoAdPlayerConfig2) | composerImplV.I(exoPlayer) | composerImplV.I(listener);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                VideoAdPlayerConfig videoAdPlayerConfig5 = videoAdPlayerConfig2;
                androidx.navigation.internal.c cVar = new androidx.navigation.internal.c(context, videoAdPlayerConfig5, exoPlayer, listener, 7);
                videoAdPlayerConfig3 = videoAdPlayerConfig5;
                composerImplV.A(cVar);
                objG = cVar;
            } else {
                videoAdPlayerConfig3 = videoAdPlayerConfig2;
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            AndroidView_androidKt.a((Function1) objG, modifier, null, composerImpl, 48, 4);
            videoAdPlayerConfig4 = videoAdPlayerConfig3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(exoPlayer, context, listener, modifier, videoAdPlayerConfig4, i, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static final void b(final VideoAdData videoAdData, VideoAdPlayerState videoAdPlayerState, final Function1 onVideoAdPlayerStateChange, Function0 function0, final Function1 onVideoAdEvent, Modifier modifier, Composer composer, int i) {
        int i2;
        SimpleCache simpleCache;
        String str;
        int i3;
        Object obj;
        Bitmap bitmap;
        String str2;
        Object obj2;
        ?? r11;
        Context context;
        final MutableState mutableState;
        int i4;
        final ExoPlayer exoPlayer;
        MutableState mutableState2;
        VideoAdData videoAdData2;
        ComposerImpl composerImpl;
        Modifier modifier2;
        ComposerImpl composerImpl2;
        Intrinsics.h(videoAdData, "videoAdData");
        ImageWithAltText imageWithAltText = videoAdData.c;
        String videoUrl = videoAdData.f8887a;
        Intrinsics.h(videoAdPlayerState, "videoAdPlayerState");
        Intrinsics.h(onVideoAdPlayerStateChange, "onVideoAdPlayerStateChange");
        Intrinsics.h(onVideoAdEvent, "onVideoAdEvent");
        ComposerImpl composerImplV = composer.v(802125224);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(videoAdData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(videoAdPlayerState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onVideoAdPlayerStateChange) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onVideoAdEvent) ? 16384 : 8192;
        }
        int i5 = 196608 | i2;
        if ((74899 & i5) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl2 = composerImplV;
        } else {
            Context context2 = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            MutableState mutableStateL = SnapshotStateKt.l(videoAdPlayerState, composerImplV);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(context2);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                Intrinsics.h(context2, "context");
                SimpleCache simpleCache2 = SimpleCacheProvider.f8891a;
                if (simpleCache2 == null) {
                    try {
                        File file = new File(context2.getCacheDir(), "video_ad_cache");
                        LeastRecentlyUsedCacheEvictor leastRecentlyUsedCacheEvictor = new LeastRecentlyUsedCacheEvictor();
                        StandaloneDatabaseProvider standaloneDatabaseProvider = SimpleCacheProvider.b;
                        if (standaloneDatabaseProvider == null) {
                            standaloneDatabaseProvider = new StandaloneDatabaseProvider(context2);
                            SimpleCacheProvider.b = standaloneDatabaseProvider;
                        }
                        simpleCache = new SimpleCache(file, leastRecentlyUsedCacheEvictor, standaloneDatabaseProvider);
                    } catch (Exception e) {
                        Bark.Companion companion = Bark.f8483a;
                        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.o), "Unable to create simple cache - " + e.getMessage(), null, 12);
                        simpleCache = null;
                    }
                    SimpleCacheProvider.f8891a = simpleCache;
                    objG = simpleCache;
                } else {
                    objG = simpleCache2;
                }
                composerImplV.A(objG);
            }
            SimpleCache simpleCache3 = (SimpleCache) objG;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zN2 = composerImplV.n(videoUrl);
            Object objG2 = composerImplV.G();
            if (zN2 || objG2 == composer$Companion$Empty$1) {
                long j = ((VideoAdPlayerState) mutableStateL.getD()).c;
                Intrinsics.h(context2, "context");
                Intrinsics.h(videoUrl, "videoUrl");
                ExoPlayer exoPlayerA = new ExoPlayer.Builder(context2).a();
                DefaultDataSource.Factory factory = new DefaultDataSource.Factory(context2);
                if (simpleCache3 != null) {
                    CacheDataSource.Factory factory2 = new CacheDataSource.Factory();
                    str = videoUrl;
                    factory2.b = new FileDataSource.Factory();
                    factory2.f2974a = simpleCache3;
                    factory2.c = factory;
                    factory2.d = 2;
                    factory = factory2;
                } else {
                    str = videoUrl;
                }
                exoPlayerA.b(new ProgressiveMediaSource.Factory(factory).b(MediaItem.a(str)));
                i3 = 0;
                exoPlayerA.E(false);
                BasePlayer basePlayer = (BasePlayer) exoPlayerA;
                basePlayer.f0(j, basePlayer.S(), false);
                exoPlayerA.T(0);
                composerImplV.A(exoPlayerA);
                obj = exoPlayerA;
            } else {
                obj = objG2;
                i3 = 0;
            }
            ExoPlayer exoPlayer2 = (ExoPlayer) obj;
            composerImplV.V(i3);
            Object[] objArr = new Object[i3];
            composerImplV.o(1849434622);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new au.com.woolworths.feature.shop.bundles.ui.a(22);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            final MutableIntState mutableIntState = (MutableIntState) RememberSaveableKt.c(objArr, null, (Function0) objG3, composerImplV, 3072, 6);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            String str3 = videoAdData.f8887a;
            long j2 = videoAdData.h;
            composerImplV.o(-176597913);
            composerImplV.o(-1633490746);
            boolean zN3 = composerImplV.n(str3) | composerImplV.s(j2);
            Object objG4 = composerImplV.G();
            if (zN3 || objG4 == composer$Companion$Empty$1) {
                bitmap = null;
                objG4 = SnapshotStateKt.f(null);
                composerImplV.A(objG4);
            } else {
                bitmap = null;
            }
            MutableState mutableState3 = (MutableState) objG4;
            composerImplV.V(false);
            Long lValueOf = Long.valueOf(j2);
            composerImplV.o(-1746271574);
            boolean zN4 = composerImplV.n(mutableState3) | composerImplV.n(str3) | composerImplV.s(j2);
            Object objG5 = composerImplV.G();
            if (zN4 || objG5 == composer$Companion$Empty$1) {
                objG5 = new VideoAdPlayerKt$rememberLastFrameBitmap$1$1(str3, j2, mutableState3, null);
                str2 = str3;
                composerImplV.A(objG5);
            } else {
                str2 = str3;
            }
            composerImplV.V(false);
            EffectsKt.f(str2, lValueOf, (Function2) objG5, composerImplV);
            Bitmap bitmap2 = (Bitmap) mutableState3.getD();
            composerImplV.V(false);
            objectRef.d = bitmap2;
            composerImplV.o(1849434622);
            Object objG6 = composerImplV.G();
            if (objG6 == composer$Companion$Empty$1) {
                objG6 = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG6);
            }
            final MutableState mutableState4 = (MutableState) objG6;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zN5 = composerImplV.n(context2);
            Object objG7 = composerImplV.G();
            if (zN5 || objG7 == composer$Companion$Empty$1) {
                r11 = 0;
                context = context2;
                mutableState = mutableStateL;
                i4 = i5;
                exoPlayer = exoPlayer2;
                obj2 = new Player.Listener() { // from class: au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdPlayerKt$VideoAdPlayer$playerListener$1$1
                    @Override // androidx.media3.common.Player.Listener
                    public final void G(PlaybackException error) {
                        AnalyticsData analyticsData;
                        Intrinsics.h(error, "error");
                        mutableState4.setValue(Boolean.TRUE);
                        VideoAdData videoAdData3 = videoAdData;
                        VideoAdEventAnalytics videoAdEventAnalytics = videoAdData3.g;
                        if (videoAdEventAnalytics != null && (analyticsData = videoAdEventAnalytics.d) != null) {
                            onVideoAdEvent.invoke(AnalyticsDataKt.c(analyticsData, videoAdData3.f, false));
                        }
                        Bark.Companion companion2 = Bark.f8483a;
                        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.o), "Video player error " + error.getMessage(), null, 12);
                    }

                    @Override // androidx.media3.common.Player.Listener
                    public final void U(int i6) {
                        if (i6 == 3) {
                            mutableState4.setValue(Boolean.FALSE);
                            return;
                        }
                        if (i6 != 4) {
                            return;
                        }
                        MutableIntState mutableIntState2 = mutableIntState;
                        int iD = mutableIntState2.d();
                        MutableState mutableState5 = mutableState;
                        Function1 function1 = onVideoAdPlayerStateChange;
                        if (iD >= 3) {
                            function1.invoke(VideoAdPlayerState.a((VideoAdPlayerState) mutableState5.getD(), false, false, 0L, false, true, BitmapDescriptorFactory.HUE_RED, 46));
                            return;
                        }
                        exoPlayer.seekTo(0L);
                        mutableIntState2.i(mutableIntState2.d() + 1);
                        function1.invoke(VideoAdPlayerState.a((VideoAdPlayerState) mutableState5.getD(), true, false, 0L, false, false, BitmapDescriptorFactory.HUE_RED, 62));
                    }
                };
                mutableState2 = mutableState4;
                videoAdData2 = videoAdData;
                composerImplV.A(obj2);
            } else {
                mutableState2 = mutableState4;
                obj2 = objG7;
                mutableState = mutableStateL;
                context = context2;
                r11 = 0;
                videoAdData2 = videoAdData;
                i4 = i5;
                exoPlayer = exoPlayer2;
            }
            VideoAdPlayerKt$VideoAdPlayer$playerListener$1$1 videoAdPlayerKt$VideoAdPlayer$playerListener$1$1 = (VideoAdPlayerKt$VideoAdPlayer$playerListener$1$1) obj2;
            composerImplV.V(r11);
            f fVar = new f(onVideoAdPlayerStateChange, exoPlayer, videoAdPlayerKt$VideoAdPlayer$playerListener$1$1, objectRef, mutableState, 2);
            ExoPlayer exoPlayer3 = exoPlayer;
            EffectsKt.c(Unit.f24250a, fVar, composerImplV);
            boolean zBooleanValue = ((Boolean) mutableState2.getD()).booleanValue();
            Modifier.Companion companion2 = Modifier.Companion.d;
            if (zBooleanValue) {
                composerImplV.o(-1082070062);
                ImageRequest.Builder builder = new ImageRequest.Builder((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
                builder.c = imageWithAltText != null ? imageWithAltText.f10141a : bitmap;
                ColorDrawable colorDrawable = new ColorDrawable(ColorKt.j(Color.d));
                Extras.Key key = ImageRequests_androidKt.f13142a;
                builder.l = new i(Image_androidKt.b(colorDrawable), 9);
                d(builder.a(), imageWithAltText != null ? imageWithAltText.b : bitmap, composerImplV, r11, r11);
                composerImplV.V(r11);
                composerImpl = composerImplV;
            } else {
                composerImplV.o(-1081708757);
                boolean zB = ((VideoAdPlayerState) mutableState.getD()).b();
                Context context3 = context;
                int i6 = videoAdData2.b;
                if (((VideoAdPlayerState) mutableState.getD()).e) {
                    bitmap = (Bitmap) objectRef.d;
                }
                composerImplV.o(-1224400529);
                boolean zN6 = ((i4 & 896) == 256 ? true : r11) | composerImplV.n(mutableState) | composerImplV.I(videoAdData2) | ((57344 & i4) != 16384 ? r11 : true);
                Object objG8 = composerImplV.G();
                if (zN6 || objG8 == composer$Companion$Empty$1) {
                    MutableState mutableState5 = mutableState;
                    androidx.navigation.internal.c cVar = new androidx.navigation.internal.c(onVideoAdPlayerStateChange, videoAdData2, onVideoAdEvent, mutableState5, 8);
                    mutableState = mutableState5;
                    composerImplV.A(cVar);
                    objG8 = cVar;
                }
                composerImplV.V(r11);
                boolean z = r11;
                c(zB, exoPlayer3, context3, videoAdPlayerKt$VideoAdPlayer$playerListener$1$1, i6, bitmap, (Function1) objG8, function0, companion2, composerImplV, ((i4 << 12) & 29360128) | (234881024 & (i4 << 9)));
                ComposerImpl composerImpl3 = composerImplV;
                boolean zB2 = ((VideoAdPlayerState) mutableState.getD()).b();
                Intrinsics.h(exoPlayer3, "exoPlayer");
                if (zB2) {
                    if (exoPlayer3.s() == 4) {
                        exoPlayer3.seekTo(0L);
                    } else {
                        exoPlayer3.seekTo(exoPlayer3.getCurrentPosition());
                    }
                    exoPlayer3.q();
                } else {
                    exoPlayer3.pause();
                }
                composerImpl3.V(z);
                composerImpl = composerImpl3;
            }
            modifier2 = companion2;
            composerImpl2 = composerImpl;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.tag.d((Object) videoAdData, (Object) videoAdPlayerState, (Object) onVideoAdPlayerStateChange, (Object) function0, onVideoAdEvent, modifier2, i, 13);
        }
    }

    public static final void c(boolean z, final ExoPlayer exoPlayer, final Context context, final Player.Listener listener, int i, Bitmap bitmap, Function1 function1, Function0 function0, Modifier modifier, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(2055768817);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.p(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.I(exoPlayer) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(context) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.I(listener) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerImplV.r(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerImplV.I(bitmap) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerImplV.I(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerImplV.I(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerImplV.n(modifier) ? 67108864 : 33554432;
        }
        if ((38347923 & i3) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotIntStateKt.a(i);
                composerImplV.A(objG);
            }
            MutableIntState mutableIntState = (MutableIntState) objG;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(exoPlayer);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new VideoAdPlayerKt$VideoAdPlayerUi$1$1(exoPlayer, mutableIntState, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG2);
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i4 = composerImplV.P;
            int i5 = i3;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            int i6 = i5 >> 9;
            VideoAdTopPanelKt.a(z, mutableIntState.d(), i, function1, function0, ZIndexModifierKt.a(BoxScopeInstance.f944a.g(SizeKt.x(SizeKt.e(Modifier.Companion.d, 1.0f), Alignment.Companion.k, false), biasAlignment), 1.0f), composerImplV, (i5 & 14) | ((i5 >> 6) & 896) | (i6 & 7168) | (i6 & 57344));
            CrossfadeKt.b(bitmap, null, AnimationSpecKt.e(200, 0, EasingKt.d, 2), "video ad player", ComposableLambdaKt.c(445151823, new Function3<Bitmap, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdPlayerKt$VideoAdPlayerUi$2$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Bitmap bitmap2 = (Bitmap) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    if (bitmap2 != null) {
                        composer2.o(-1340979381);
                        ImageRequest.Builder builder = new ImageRequest.Builder((Context) composer2.x(AndroidCompositionLocals_androidKt.b));
                        builder.c = bitmap2;
                        ColorDrawable colorDrawable = new ColorDrawable(ColorKt.j(Color.d));
                        Extras.Key key = ImageRequests_androidKt.f13142a;
                        builder.l = new i(Image_androidKt.b(colorDrawable), 9);
                        VideoAdPlayerKt.d(builder.a(), null, composer2, 0, 2);
                        composer2.l();
                    } else {
                        composer2.o(-1340648239);
                        VideoAdPlayerKt.a(exoPlayer, context, listener, AspectRatioKt.a(SizeKt.e(Modifier.Companion.d, 1.0f), 1.7777778f), null, composer2, 3072);
                        composer2.l();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i5 >> 15) & 14) | 27648, 2);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.onboarding.ui.d(z, exoPlayer, context, listener, i, bitmap, function1, function0, modifier, i2);
        }
    }

    public static final void d(ImageRequest imageRequest, String str, Composer composer, int i, int i2) {
        int i3;
        ImageRequest imageRequest2;
        ComposerImpl composerImplV = composer.v(-720493628);
        int i4 = (composerImplV.I(imageRequest) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (composerImplV.n(str) ? 32 : 16);
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            imageRequest2 = imageRequest;
        } else {
            if (i5 != 0) {
                str = null;
            }
            String str2 = str;
            imageRequest2 = imageRequest;
            SingletonAsyncImageKt.a(imageRequest2, str2, AspectRatioKt.a(SizeKt.e(Modifier.Companion.d, 1.0f), 1.7777778f), null, ContentScale.Companion.b, composerImplV, (i3 & 14) | 1573248 | (i3 & 112), 1976);
            str = str2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(imageRequest2, str, i, i2);
        }
    }
}
