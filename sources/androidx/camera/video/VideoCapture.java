package androidx.camera.video;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.processing.util.OutConfig;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.impl.VideoCaptureConfig;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.SwappedVideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class VideoCapture<T extends VideoOutput> extends UseCase {
    public static final Defaults D = new Defaults();
    public SourceStreamRequirementObserver A;
    public SessionConfig.CloseableErrorListener B;
    public final Observable.Observer C;
    public DeferrableSurface p;
    public SurfaceEdge q;
    public StreamInfo r;
    public SessionConfig.Builder s;
    public ListenableFuture t;
    public SurfaceRequest u;
    public VideoOutput.SourceState v;
    public SurfaceProcessorNode w;
    public Rect x;
    public int y;
    public boolean z;

    @RestrictTo
    public static final class Defaults implements ConfigProvider<VideoCaptureConfig<?>> {

        /* renamed from: a, reason: collision with root package name */
        public static final VideoCaptureConfig f601a;
        public static final Range b;
        public static final DynamicRange c;

        static {
            i iVar = new i();
            b = new Range(30, 30);
            DynamicRange dynamicRange = DynamicRange.d;
            c = dynamicRange;
            Builder builder = new Builder(iVar);
            Config.Option option = UseCaseConfig.v;
            MutableOptionsBundle mutableOptionsBundle = builder.f600a;
            mutableOptionsBundle.G(option, 5);
            mutableOptionsBundle.G(VideoCaptureConfig.I, VideoEncoderInfoImpl.c);
            mutableOptionsBundle.G(ImageInputConfig.g, dynamicRange);
            f601a = new VideoCaptureConfig(OptionsBundle.U(mutableOptionsBundle));
        }
    }

    public static class SourceStreamRequirementObserver implements Observable.Observer<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public CameraControlInternal f602a;
        public boolean b;

        @Override // androidx.camera.core.impl.Observable.Observer
        public final void a(Object obj) {
            Preconditions.f("SourceStreamRequirementObserver can be updated from main thread only", Threads.b());
            boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
            if (this.b == zEquals) {
                return;
            }
            this.b = zEquals;
            CameraControlInternal cameraControlInternal = this.f602a;
            if (cameraControlInternal == null) {
                Logger.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            } else if (zEquals) {
                cameraControlInternal.g();
            } else {
                cameraControlInternal.a();
            }
        }

        public final void b() {
            Preconditions.f("SourceStreamRequirementObserver can be closed from main thread only", Threads.b());
            Logger.a("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.b);
            CameraControlInternal cameraControlInternal = this.f602a;
            if (cameraControlInternal == null) {
                Logger.a("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
                return;
            }
            if (this.b) {
                this.b = false;
                if (cameraControlInternal != null) {
                    cameraControlInternal.a();
                } else {
                    Logger.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
                }
            }
            this.f602a = null;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public final void onError(Throwable th) {
            Logger.f("VideoCapture", "SourceStreamRequirementObserver#onError", th);
        }
    }

    public VideoCapture(VideoCaptureConfig videoCaptureConfig) {
        super(videoCaptureConfig);
        this.r = StreamInfo.f595a;
        this.s = new SessionConfig.Builder();
        this.t = null;
        this.v = VideoOutput.SourceState.f;
        this.z = false;
        this.C = new Observable.Observer<StreamInfo>() { // from class: androidx.camera.video.VideoCapture.1
            @Override // androidx.camera.core.impl.Observable.Observer
            public final void a(Object obj) throws ExecutionException, InterruptedException {
                StreamInfo streamInfo = (StreamInfo) obj;
                if (streamInfo == null) {
                    throw new IllegalArgumentException("StreamInfo can't be null");
                }
                VideoCapture videoCapture = VideoCapture.this;
                if (videoCapture.v == VideoOutput.SourceState.f) {
                    return;
                }
                Logger.a("VideoCapture", "Stream info update: old: " + videoCapture.r + " new: " + streamInfo);
                StreamInfo streamInfo2 = videoCapture.r;
                videoCapture.r = streamInfo;
                StreamSpec streamSpec = videoCapture.g;
                streamSpec.getClass();
                int iA = streamInfo2.a();
                int iA2 = streamInfo.a();
                Set set = StreamInfo.b;
                if ((!set.contains(Integer.valueOf(iA)) && !set.contains(Integer.valueOf(iA2)) && iA != iA2) || (videoCapture.z && streamInfo2.b() != null && streamInfo.b() == null)) {
                    videoCapture.M();
                    return;
                }
                if ((streamInfo2.a() != -1 && streamInfo.a() == -1) || (streamInfo2.a() == -1 && streamInfo.a() != -1)) {
                    videoCapture.G(videoCapture.s, streamInfo, streamSpec);
                    Object[] objArr = {videoCapture.s.k()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    videoCapture.D(Collections.unmodifiableList(arrayList));
                    videoCapture.p();
                    return;
                }
                if (streamInfo2.c() != streamInfo.c()) {
                    videoCapture.G(videoCapture.s, streamInfo, streamSpec);
                    Object[] objArr2 = {videoCapture.s.k()};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj3 = objArr2[0];
                    Objects.requireNonNull(obj3);
                    arrayList2.add(obj3);
                    videoCapture.D(Collections.unmodifiableList(arrayList2));
                    Iterator it = videoCapture.f429a.iterator();
                    while (it.hasNext()) {
                        ((UseCase.StateChangeCallback) it.next()).c(videoCapture);
                    }
                }
            }

            @Override // androidx.camera.core.impl.Observable.Observer
            public final void onError(Throwable th) {
                Logger.f("VideoCapture", "Receive onError from StreamState observer", th);
            }
        };
    }

    public static void E(HashSet hashSet, int i, int i2, Size size, VideoEncoderInfo videoEncoderInfo) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, ((Integer) videoEncoderInfo.d(i).clamp(Integer.valueOf(i2))).intValue()));
        } catch (IllegalArgumentException e) {
            Logger.f("VideoCapture", "No supportedHeights for width: " + i, e);
        }
        try {
            hashSet.add(new Size(((Integer) videoEncoderInfo.a(i2).clamp(Integer.valueOf(i))).intValue(), i2));
        } catch (IllegalArgumentException e2) {
            Logger.f("VideoCapture", "No supportedWidths for height: " + i2, e2);
        }
    }

    public static int F(boolean z, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    public static VideoEncoderInfo N(Function function, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, MediaSpec mediaSpec, Size size, DynamicRange dynamicRange, Range range) {
        VideoEncoderInfo videoEncoderInfo = (VideoEncoderInfo) function.apply(VideoConfigUtil.b(VideoConfigUtil.c(mediaSpec, dynamicRange, videoValidatedEncoderProfilesProxy), Timebase.d, mediaSpec.d(), size, dynamicRange, range));
        if (videoEncoderInfo != null) {
            return VideoEncoderInfoWrapper.k(videoEncoderInfo, videoValidatedEncoderProfilesProxy != null ? new Size(videoValidatedEncoderProfilesProxy.g().k(), videoValidatedEncoderProfilesProxy.g().h()) : null);
        }
        Logger.e("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    @Override // androidx.camera.core.UseCase
    public final void B(Rect rect) {
        this.i = rect;
        O();
    }

    public final void G(SessionConfig.Builder builder, StreamInfo streamInfo, StreamSpec streamSpec) {
        DeferrableSurface deferrableSurface;
        boolean z = streamInfo.a() == -1;
        final boolean z2 = streamInfo.c() == StreamInfo.StreamState.d;
        if (z && z2) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        builder.l();
        DynamicRange dynamicRangeB = streamSpec.b();
        if (!z && (deferrableSurface = this.p) != null) {
            if (z2) {
                builder.i(deferrableSurface, dynamicRangeB, -1);
            } else {
                builder.f(deferrableSurface, dynamicRangeB);
            }
        }
        ListenableFuture listenableFuture = this.t;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            Logger.a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        final ListenableFuture listenableFutureA = CallbackToFutureAdapter.a(new b(this, builder));
        this.t = listenableFutureA;
        Futures.a(listenableFutureA, new FutureCallback<Void>() { // from class: androidx.camera.video.VideoCapture.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
                if (th instanceof CancellationException) {
                    return;
                }
                Logger.c("VideoCapture", "Surface update completed with unexpected exception", th);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onSuccess(Object obj) {
                VideoOutput.SourceState sourceState;
                VideoCapture videoCapture = VideoCapture.this;
                if (listenableFutureA != videoCapture.t || (sourceState = videoCapture.v) == VideoOutput.SourceState.f) {
                    return;
                }
                VideoOutput.SourceState sourceState2 = z2 ? VideoOutput.SourceState.d : VideoOutput.SourceState.e;
                if (sourceState2 != sourceState) {
                    videoCapture.v = sourceState2;
                    videoCapture.K().e(sourceState2);
                }
            }
        }, CameraXExecutors.d());
    }

    public final void H() {
        Threads.a();
        SessionConfig.CloseableErrorListener closeableErrorListener = this.B;
        if (closeableErrorListener != null) {
            closeableErrorListener.b();
            this.B = null;
        }
        DeferrableSurface deferrableSurface = this.p;
        if (deferrableSurface != null) {
            deferrableSurface.a();
            this.p = null;
        }
        SurfaceProcessorNode surfaceProcessorNode = this.w;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.b();
            this.w = null;
        }
        SurfaceEdge surfaceEdge = this.q;
        if (surfaceEdge != null) {
            surfaceEdge.c();
            this.q = null;
        }
        this.x = null;
        this.u = null;
        this.r = StreamInfo.f595a;
        this.y = 0;
        this.z = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SessionConfig.Builder I(final VideoCaptureConfig videoCaptureConfig, StreamSpec streamSpec) throws ExecutionException, InterruptedException {
        MediaSpec mediaSpec;
        e eVar;
        VideoEncoderInfo videoEncoderInfo;
        int i;
        Rect rect;
        Size size;
        SurfaceProcessorNode surfaceProcessorNode;
        Threads.a();
        final CameraInternal cameraInternalB = b();
        cameraInternalB.getClass();
        Size sizeE = streamSpec.e();
        e eVar2 = new e(this, 3);
        Range rangeC = streamSpec.c();
        if (Objects.equals(rangeC, StreamSpec.f502a)) {
            rangeC = Defaults.b;
        }
        Range range = rangeC;
        ListenableFuture listenableFutureB = K().c().b();
        if (listenableFutureB.isDone()) {
            try {
                mediaSpec = listenableFutureB.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } else {
            mediaSpec = null;
        }
        MediaSpec mediaSpec2 = mediaSpec;
        Objects.requireNonNull(mediaSpec2);
        VideoCapabilities videoCapabilitiesF = K().f(cameraInternalB.b());
        DynamicRange dynamicRangeB = streamSpec.b();
        VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxyA = videoCapabilitiesF.a(sizeE, dynamicRangeB);
        Function function = (Function) videoCaptureConfig.a(VideoCaptureConfig.I);
        Objects.requireNonNull(function);
        VideoEncoderInfo videoEncoderInfoN = N(function, videoValidatedEncoderProfilesProxyA, mediaSpec2, sizeE, dynamicRangeB, range);
        this.y = J(cameraInternalB);
        final Rect rect2 = this.i;
        if (rect2 == null) {
            rect2 = new Rect(0, 0, sizeE.getWidth(), sizeE.getHeight());
        }
        if (videoEncoderInfoN == null || videoEncoderInfoN.b(rect2.width(), rect2.height())) {
            eVar = eVar2;
            videoEncoderInfo = videoEncoderInfoN;
        } else {
            Logger.a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", TransformUtils.f(rect2), Integer.valueOf(videoEncoderInfoN.j()), Integer.valueOf(videoEncoderInfoN.h()), videoEncoderInfoN.e(), videoEncoderInfoN.f()));
            VideoEncoderInfo swappedVideoEncoderInfo = (!(videoEncoderInfoN.e().contains((Range) Integer.valueOf(rect2.width())) && videoEncoderInfoN.f().contains((Range) Integer.valueOf(rect2.height()))) && videoEncoderInfoN.g() && videoEncoderInfoN.f().contains((Range) Integer.valueOf(rect2.width())) && videoEncoderInfoN.e().contains((Range) Integer.valueOf(rect2.height()))) ? new SwappedVideoEncoderInfo(videoEncoderInfoN) : videoEncoderInfoN;
            int iJ = swappedVideoEncoderInfo.j();
            int iH = swappedVideoEncoderInfo.h();
            Range rangeE = swappedVideoEncoderInfo.e();
            Range rangeF = swappedVideoEncoderInfo.f();
            videoEncoderInfo = videoEncoderInfoN;
            int iF = F(true, rect2.width(), iJ, rangeE);
            eVar = eVar2;
            int iF2 = F(false, rect2.width(), iJ, rangeE);
            int iF3 = F(true, rect2.height(), iH, rangeF);
            int iF4 = F(false, rect2.height(), iH, rangeF);
            HashSet hashSet = new HashSet();
            E(hashSet, iF, iF3, sizeE, swappedVideoEncoderInfo);
            E(hashSet, iF, iF4, sizeE, swappedVideoEncoderInfo);
            E(hashSet, iF2, iF3, sizeE, swappedVideoEncoderInfo);
            E(hashSet, iF2, iF4, sizeE, swappedVideoEncoderInfo);
            if (hashSet.isEmpty()) {
                Logger.e("VideoCapture", "Can't find valid cropped size");
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                Logger.a("VideoCapture", "candidatesList = " + arrayList);
                Collections.sort(arrayList, new Comparator() { // from class: androidx.camera.video.h
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        Size size2 = (Size) obj;
                        Size size3 = (Size) obj2;
                        VideoCapture.Defaults defaults = VideoCapture.D;
                        int width = size2.getWidth();
                        Rect rect3 = rect2;
                        return (Math.abs(size2.getHeight() - rect3.height()) + Math.abs(width - rect3.width())) - (Math.abs(size3.getHeight() - rect3.height()) + Math.abs(size3.getWidth() - rect3.width()));
                    }
                });
                Logger.a("VideoCapture", "sorted candidatesList = " + arrayList);
                Size size2 = (Size) arrayList.get(0);
                int width = size2.getWidth();
                int height = size2.getHeight();
                if (width == rect2.width() && height == rect2.height()) {
                    Logger.a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
                } else {
                    Preconditions.f(null, width % 2 == 0 && height % 2 == 0 && width <= sizeE.getWidth() && height <= sizeE.getHeight());
                    Rect rect3 = new Rect(rect2);
                    if (width != rect2.width()) {
                        int iMax = Math.max(0, rect2.centerX() - (width / 2));
                        rect3.left = iMax;
                        int i2 = iMax + width;
                        rect3.right = i2;
                        if (i2 > sizeE.getWidth()) {
                            int width2 = sizeE.getWidth();
                            rect3.right = width2;
                            rect3.left = width2 - width;
                        }
                    }
                    if (height != rect2.height()) {
                        int iMax2 = Math.max(0, rect2.centerY() - (height / 2));
                        rect3.top = iMax2;
                        int i3 = iMax2 + height;
                        rect3.bottom = i3;
                        if (i3 > sizeE.getHeight()) {
                            int height2 = sizeE.getHeight();
                            rect3.bottom = height2;
                            rect3.top = height2 - height;
                        }
                    }
                    Logger.a("VideoCapture", "Adjust cropRect from " + TransformUtils.f(rect2) + " to " + TransformUtils.f(rect3));
                    rect2 = rect3;
                }
            }
        }
        int i4 = this.y;
        if (this.r.b() != null) {
            SurfaceRequest.TransformationInfo transformationInfoB = this.r.b();
            transformationInfoB.getClass();
            Size sizeG = TransformUtils.g(TransformUtils.e(transformationInfoB.a()), i4);
            i = 0;
            rect = new Rect(0, 0, sizeG.getWidth(), sizeG.getHeight());
        } else {
            i = 0;
            rect = rect2;
        }
        this.x = rect;
        if (this.r.b() == null || rect.equals(rect2)) {
            size = sizeE;
        } else {
            float fHeight = rect.height() / rect2.height();
            size = new Size((int) Math.ceil(sizeE.getWidth() * fHeight), (int) Math.ceil(sizeE.getHeight() * fHeight));
        }
        if (this.r.b() != null) {
            this.z = true;
        }
        Rect rect4 = this.x;
        int i5 = this.y;
        boolean zL = L(cameraInternalB, videoCaptureConfig, rect4, sizeE);
        if (((SizeCannotEncodeVideoQuirk) DeviceQuirks.f614a.b(SizeCannotEncodeVideoQuirk.class)) != null) {
            if (!zL) {
                i5 = i;
            }
            Size sizeG2 = TransformUtils.g(TransformUtils.e(rect4), i5);
            if ((("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET).contains(sizeG2)) {
                int iH2 = videoEncoderInfo != null ? videoEncoderInfo.h() / 2 : 8;
                Rect rect5 = new Rect(rect4);
                if (rect4.width() == sizeG2.getHeight()) {
                    rect5.left += iH2;
                    rect5.right -= iH2;
                } else {
                    rect5.top += iH2;
                    rect5.bottom -= iH2;
                }
                rect4 = rect5;
            }
        }
        this.x = rect4;
        if (L(cameraInternalB, videoCaptureConfig, rect4, sizeE)) {
            Logger.a("VideoCapture", "Surface processing is enabled.");
            CameraInternal cameraInternalB2 = b();
            Objects.requireNonNull(cameraInternalB2);
            if (this.m != null) {
                throw null;
            }
            surfaceProcessorNode = new SurfaceProcessorNode(cameraInternalB2, new DefaultSurfaceProcessor(dynamicRangeB));
        } else {
            surfaceProcessorNode = null;
        }
        this.w = surfaceProcessorNode;
        final Timebase timebaseN = (surfaceProcessorNode == null && cameraInternalB.p()) ? Timebase.d : cameraInternalB.d().n();
        Logger.a("VideoCapture", "camera timebase = " + cameraInternalB.d().n() + ", processing timebase = " + timebaseN);
        StreamSpec.Builder builderG = streamSpec.g();
        builderG.e(size);
        builderG.c(range);
        StreamSpec streamSpecA = builderG.a();
        Preconditions.f(null, this.q == null ? 1 : i);
        SurfaceEdge surfaceEdge = new SurfaceEdge(2, 34, streamSpecA, this.j, cameraInternalB.p(), this.x, this.y, ((ImageOutputConfig) this.f).D(), (cameraInternalB.p() && m(cameraInternalB)) ? 1 : i);
        this.q = surfaceEdge;
        surfaceEdge.a(eVar);
        if (this.w != null) {
            SurfaceEdge surfaceEdge2 = this.q;
            int i6 = surfaceEdge2.f;
            int i7 = surfaceEdge2.f550a;
            Rect rect6 = surfaceEdge2.d;
            OutConfig outConfigH = OutConfig.h(i6, i7, rect6, TransformUtils.g(TransformUtils.e(rect6), surfaceEdge2.i), surfaceEdge2.i, surfaceEdge2.e);
            final SurfaceEdge surfaceEdge3 = this.w.c(SurfaceProcessorNode.In.c(this.q, Collections.singletonList(outConfigH))).get(outConfigH);
            Objects.requireNonNull(surfaceEdge3);
            surfaceEdge3.a(new Runnable() { // from class: androidx.camera.video.f
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapture.Defaults defaults = VideoCapture.D;
                    VideoCapture videoCapture = this.d;
                    CameraInternal cameraInternalB3 = videoCapture.b();
                    CameraInternal cameraInternal = cameraInternalB;
                    if (cameraInternal == cameraInternalB3) {
                        videoCapture.u = surfaceEdge3.d(cameraInternal, true);
                        VideoOutput videoOutput = (VideoOutput) videoCaptureConfig.a(VideoCaptureConfig.H);
                        Objects.requireNonNull(videoOutput);
                        videoOutput.b(videoCapture.u, timebaseN);
                        videoCapture.O();
                    }
                }
            });
            this.u = surfaceEdge3.d(cameraInternalB, true);
            SurfaceEdge surfaceEdge4 = this.q;
            surfaceEdge4.getClass();
            Threads.a();
            surfaceEdge4.b();
            Preconditions.f("Consumer can only be linked once.", !surfaceEdge4.j);
            surfaceEdge4.j = true;
            SurfaceEdge.SettableSurface settableSurface = surfaceEdge4.l;
            this.p = settableSurface;
            Futures.h(settableSurface.e).addListener(new c(4, this, settableSurface), CameraXExecutors.d());
        } else {
            SurfaceRequest surfaceRequestD = this.q.d(cameraInternalB, true);
            this.u = surfaceRequestD;
            this.p = surfaceRequestD.l;
        }
        VideoOutput videoOutput = (VideoOutput) videoCaptureConfig.a(VideoCaptureConfig.H);
        Objects.requireNonNull(videoOutput);
        videoOutput.b(this.u, timebaseN);
        O();
        this.p.j = MediaCodec.class;
        SessionConfig.Builder builderM = SessionConfig.Builder.m(videoCaptureConfig, streamSpec.e());
        builderM.p(streamSpec.c());
        builderM.v(videoCaptureConfig.o());
        SessionConfig.CloseableErrorListener closeableErrorListener = this.B;
        if (closeableErrorListener != null) {
            closeableErrorListener.b();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.video.g
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void a(SessionConfig sessionConfig) throws ExecutionException, InterruptedException {
                VideoCapture.Defaults defaults = VideoCapture.D;
                this.f606a.M();
            }
        });
        this.B = closeableErrorListener2;
        builderM.o(closeableErrorListener2);
        if (streamSpec.d() != null) {
            builderM.e(streamSpec.d());
        }
        return builderM;
    }

    public final int J(CameraInternal cameraInternal) {
        boolean zM = m(cameraInternal);
        int iG = g(cameraInternal, zM);
        if (this.r.b() == null) {
            return iG;
        }
        SurfaceRequest.TransformationInfo transformationInfoB = this.r.b();
        Objects.requireNonNull(transformationInfoB);
        int iB = transformationInfoB.b();
        if (zM != transformationInfoB.f()) {
            iB = -iB;
        }
        return TransformUtils.h(iG - iB);
    }

    public final VideoOutput K() {
        VideoOutput videoOutput = (VideoOutput) ((VideoCaptureConfig) this.f).a(VideoCaptureConfig.H);
        Objects.requireNonNull(videoOutput);
        return videoOutput;
    }

    public final boolean L(CameraInternal cameraInternal, VideoCaptureConfig videoCaptureConfig, Rect rect, Size size) {
        if (this.m != null) {
            return true;
        }
        if (cameraInternal.p()) {
            Boolean bool = (Boolean) videoCaptureConfig.c(VideoCaptureConfig.J, Boolean.FALSE);
            Objects.requireNonNull(bool);
            if (bool.booleanValue()) {
                return true;
            }
        }
        if (!(cameraInternal.p() && (SurfaceProcessingQuirk.c(DeviceQuirks.f614a) || SurfaceProcessingQuirk.c(cameraInternal.d().j()))) && size.getWidth() == rect.width() && size.getHeight() == rect.height()) {
            return (cameraInternal.p() && m(cameraInternal)) || this.r.b() != null;
        }
        return true;
    }

    public final void M() throws ExecutionException, InterruptedException {
        if (b() == null) {
            return;
        }
        H();
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) this.f;
        StreamSpec streamSpec = this.g;
        streamSpec.getClass();
        SessionConfig.Builder builderI = I(videoCaptureConfig, streamSpec);
        this.s = builderI;
        G(builderI, this.r, this.g);
        Object[] objArr = {this.s.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        D(Collections.unmodifiableList(arrayList));
        p();
    }

    public final void O() {
        CameraInternal cameraInternalB = b();
        SurfaceEdge surfaceEdge = this.q;
        if (cameraInternalB == null || surfaceEdge == null) {
            return;
        }
        int iJ = J(cameraInternalB);
        this.y = iJ;
        Threads.c(new androidx.camera.core.processing.k(surfaceEdge, iJ, ((ImageOutputConfig) this.f).D()));
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig e(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        D.getClass();
        VideoCaptureConfig videoCaptureConfig = Defaults.f601a;
        Config configA = useCaseConfigFactory.a(videoCaptureConfig.Q(), 1);
        if (z) {
            configA = Config.R(configA, videoCaptureConfig);
        }
        if (configA == null) {
            return null;
        }
        return new VideoCaptureConfig(OptionsBundle.U(((Builder) k(configA)).f600a));
    }

    @Override // androidx.camera.core.UseCase
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig.Builder k(Config config) {
        return new Builder(MutableOptionsBundle.W(config));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    @Override // androidx.camera.core.UseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.UseCaseConfig t(androidx.camera.core.impl.CameraInfoInternal r22, androidx.camera.core.impl.UseCaseConfig.Builder r23) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.VideoCapture.t(androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.impl.UseCaseConfig$Builder):androidx.camera.core.impl.UseCaseConfig");
    }

    public final String toString() {
        return "VideoCapture:".concat(f());
    }

    @Override // androidx.camera.core.UseCase
    public final void u() throws ExecutionException, InterruptedException {
        Logger.a("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + d());
        StreamSpec streamSpec = this.g;
        if (streamSpec == null || this.u != null) {
            return;
        }
        Observable observableD = K().d();
        Object obj = StreamInfo.f595a;
        ListenableFuture listenableFutureB = observableD.b();
        if (listenableFutureB.isDone()) {
            try {
                obj = listenableFutureB.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        this.r = (StreamInfo) obj;
        SessionConfig.Builder builderI = I((VideoCaptureConfig) this.f, streamSpec);
        this.s = builderI;
        G(builderI, this.r, streamSpec);
        Object[] objArr = {this.s.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        D(Collections.unmodifiableList(arrayList));
        o();
        K().d().c(CameraXExecutors.d(), this.C);
        SourceStreamRequirementObserver sourceStreamRequirementObserver = this.A;
        if (sourceStreamRequirementObserver != null) {
            sourceStreamRequirementObserver.b();
        }
        CameraControlInternal cameraControlInternalC = c();
        SourceStreamRequirementObserver sourceStreamRequirementObserver2 = new SourceStreamRequirementObserver();
        sourceStreamRequirementObserver2.b = false;
        sourceStreamRequirementObserver2.f602a = cameraControlInternalC;
        this.A = sourceStreamRequirementObserver2;
        K().g().c(CameraXExecutors.d(), this.A);
        VideoOutput.SourceState sourceState = this.v;
        VideoOutput.SourceState sourceState2 = VideoOutput.SourceState.e;
        if (sourceState2 != sourceState) {
            this.v = sourceState2;
            K().e(sourceState2);
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void v() {
        Logger.a("VideoCapture", "VideoCapture#onStateDetached");
        Preconditions.f("VideoCapture can only be detached on the main thread.", Threads.b());
        if (this.A != null) {
            K().g().d(this.A);
            this.A.b();
            this.A = null;
        }
        VideoOutput.SourceState sourceState = this.v;
        VideoOutput.SourceState sourceState2 = VideoOutput.SourceState.f;
        if (sourceState2 != sourceState) {
            this.v = sourceState2;
            K().e(sourceState2);
        }
        K().d().d(this.C);
        ListenableFuture listenableFuture = this.t;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            Logger.a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        H();
    }

    @Override // androidx.camera.core.UseCase
    public final StreamSpec w(Config config) {
        this.s.e(config);
        Object[] objArr = {this.s.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        D(Collections.unmodifiableList(arrayList));
        StreamSpec streamSpec = this.g;
        Objects.requireNonNull(streamSpec);
        StreamSpec.Builder builderG = streamSpec.g();
        builderG.d(config);
        return builderG.a();
    }

    @Override // androidx.camera.core.UseCase
    public final StreamSpec x(StreamSpec streamSpec, StreamSpec streamSpec2) {
        Logger.a("VideoCapture", "onSuggestedStreamSpecUpdated: " + streamSpec);
        ArrayList arrayListZ = ((VideoCaptureConfig) this.f).z();
        if (arrayListZ != null && !arrayListZ.contains(streamSpec.e())) {
            Logger.e("VideoCapture", "suggested resolution " + streamSpec.e() + " is not in custom ordered resolutions " + arrayListZ);
        }
        return streamSpec;
    }

    public static final class Builder<T extends VideoOutput> implements UseCaseConfig.Builder<VideoCapture<T>, VideoCaptureConfig<T>, Builder<T>>, ImageOutputConfig.Builder<Builder<T>>, ImageInputConfig.Builder<Builder<T>>, ThreadConfig.Builder<Builder<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final MutableOptionsBundle f600a;

        public Builder(MutableOptionsBundle mutableOptionsBundle) {
            Object objA;
            this.f600a = mutableOptionsBundle;
            if (!mutableOptionsBundle.G.containsKey(VideoCaptureConfig.H)) {
                throw new IllegalArgumentException("VideoOutput is required");
            }
            Object objA2 = null;
            try {
                objA = mutableOptionsBundle.a(TargetConfig.E);
            } catch (IllegalArgumentException unused) {
                objA = null;
            }
            Class cls = (Class) objA;
            if (cls != null && !cls.equals(VideoCapture.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f600a.G(UseCaseConfig.z, UseCaseConfigFactory.CaptureType.g);
            MutableOptionsBundle mutableOptionsBundle2 = this.f600a;
            mutableOptionsBundle2.G(TargetConfig.E, VideoCapture.class);
            try {
                objA2 = mutableOptionsBundle2.a(TargetConfig.D);
            } catch (IllegalArgumentException unused2) {
            }
            if (objA2 == null) {
                mutableOptionsBundle2.G(TargetConfig.D, VideoCapture.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object a(int i) {
            this.f600a.G(ImageOutputConfig.i, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final MutableConfig b() {
            return this.f600a;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object c(ResolutionSelector resolutionSelector) {
            this.f600a.G(ImageOutputConfig.p, resolutionSelector);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object d(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final UseCaseConfig e() {
            return new VideoCaptureConfig(OptionsBundle.U(this.f600a));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(VideoOutput videoOutput) {
            MutableOptionsBundle mutableOptionsBundleV = MutableOptionsBundle.V();
            mutableOptionsBundleV.G(VideoCaptureConfig.H, videoOutput);
            this(mutableOptionsBundleV);
        }
    }
}
