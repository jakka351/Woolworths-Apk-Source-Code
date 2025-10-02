package androidx.camera.core.internal;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.UnsupportedSchemeException;
import android.view.Surface;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.OutputConfig;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.FocusFinderCompat;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.datasource.BitmapUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheKeyFactory;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DummyExoMediaDrm;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import androidx.media3.exoplayer.drm.FrameworkMediaDrm;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.image.BitmapFactoryImageDecoder;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic;
import com.google.common.base.Function;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Preview.SurfaceProvider, SurfaceRequest.TransformationInfoListener, EncoderFactory, OutputConfig, FocusFinderCompat.UserSpecifiedFocusComparator.NextFocusGetter, TextInclusionStrategy, Function, CacheKeyFactory, ListenerSet.Event, ListenerSet.IterationFinishedEvent, DrmSessionManager.DrmSessionReference, ExoMediaDrm.Provider, BitmapFactoryImageDecoder.BitmapDecoder, SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // androidx.camera.core.Preview.SurfaceProvider
    public void a(SurfaceRequest surfaceRequest) throws ExecutionException, InterruptedException {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(surfaceRequest.b.getWidth(), surfaceRequest.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        surfaceRequest.a(surface, CameraXExecutors.a(), new b(0, surface, surfaceTexture));
    }

    @Override // com.google.common.base.Function
    public Object apply(Object obj) {
        Label label = (Label) obj;
        int i = Format.O;
        return label.f2856a + ": " + label.b;
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void b(Object obj, FlagSet flagSet) {
    }

    @Override // androidx.media3.datasource.cache.CacheKeyFactory
    public String c(DataSpec dataSpec) {
        String str = dataSpec.h;
        return str != null ? str : dataSpec.f2957a.toString();
    }

    @Override // androidx.camera.video.internal.encoder.EncoderFactory
    public EncoderImpl d(Executor executor, VideoEncoderConfig videoEncoderConfig) {
        return new EncoderImpl(executor, videoEncoderConfig);
    }

    @Override // androidx.compose.ui.text.TextInclusionStrategy
    public boolean e(Rect rect, Rect rect2) {
        switch (this.d) {
            case 5:
                return rect.i(rect2);
            default:
                return rect2.a(rect.d());
        }
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void f(SurfaceRequest.TransformationInfo transformationInfo) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.Provider
    public ExoMediaDrm g(UUID uuid) throws UnsupportedDrmException {
        try {
            try {
                return new FrameworkMediaDrm(uuid);
            } catch (UnsupportedSchemeException e) {
                throw new UnsupportedDrmException(e);
            } catch (Exception e2) {
                throw new UnsupportedDrmException(e2);
            }
        } catch (UnsupportedDrmException unused) {
            Log.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new DummyExoMediaDrm();
        }
    }

    public Bitmap h(int i, byte[] bArr) throws ImageDecoderException {
        try {
            return BitmapUtil.a(i, bArr);
        } catch (ParserException e) {
            throw new ImageDecoderException(androidx.compose.ui.input.pointer.a.i(bArr.length, i, ", input length = ", ")", new StringBuilder("Could not decode image data with BitmapFactory. (data.length = ")), e);
        } catch (IOException e2) {
            throw new ImageDecoderException(e2);
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.d) {
            case 9:
                analyticsListener.getClass();
                break;
            case 10:
                analyticsListener.getClass();
                break;
            case 11:
                analyticsListener.getClass();
                break;
            case 12:
                analyticsListener.getClass();
                break;
            case 13:
                analyticsListener.getClass();
                break;
            case 14:
                analyticsListener.getClass();
                break;
            case 15:
                analyticsListener.getClass();
                break;
            case 16:
                analyticsListener.getClass();
                break;
            case 17:
                analyticsListener.getClass();
                break;
            case 18:
                analyticsListener.getClass();
                break;
            case 19:
                analyticsListener.getClass();
                break;
            case 20:
                analyticsListener.getClass();
                break;
            case 21:
                analyticsListener.getClass();
                break;
            case 22:
            default:
                analyticsListener.getClass();
                break;
            case 23:
                analyticsListener.getClass();
                break;
            case 24:
                analyticsListener.getClass();
                break;
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
    public void release() {
    }

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
    }
}
