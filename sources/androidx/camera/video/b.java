package androidx.camera.video;

import android.os.SystemClock;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.utils.ArrayRingBuffer;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements CallbackToFutureAdapter.Resolver, Encoder.SurfaceInput.OnSurfaceUpdateListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Recorder recorder, int i) {
        this.d = i;
        this.e = recorder;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener
    public void a(Surface surface) {
        ((Recorder) this.e).p(surface);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(final CallbackToFutureAdapter.Completer completer) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                final Recorder recorder = (Recorder) obj;
                recorder.t.a(new EncoderCallback() { // from class: androidx.camera.video.Recorder.3
                    public final /* synthetic */ CallbackToFutureAdapter.Completer b;

                    public AnonymousClass3(final CallbackToFutureAdapter.Completer completer2) {
                        completer = completer2;
                    }

                    @Override // androidx.camera.video.internal.encoder.EncoderCallback
                    public final void a(EncodeException encodeException) {
                        completer.d(encodeException);
                    }

                    @Override // androidx.camera.video.internal.encoder.EncoderCallback
                    public final void b(androidx.camera.core.internal.a aVar) {
                    }

                    @Override // androidx.camera.video.internal.encoder.EncoderCallback
                    public final void c() {
                        completer.b(null);
                    }

                    @Override // androidx.camera.video.internal.encoder.EncoderCallback
                    public final void d(EncodedData encodedData) throws Exception {
                        boolean z;
                        Recorder recorder2 = Recorder.this;
                        ArrayRingBuffer arrayRingBuffer = recorder2.w;
                        if (recorder2.l) {
                            Logger.a("Recorder", "Drop video data since recording is stopping.");
                            encodedData.close();
                            return;
                        }
                        EncodedData encodedData2 = recorder2.v;
                        if (encodedData2 != null) {
                            encodedData2.close();
                            recorder2.v = null;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!encodedData.X()) {
                            if (z) {
                                Logger.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                            }
                            Logger.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                            recorder2.t.e();
                            encodedData.close();
                            return;
                        }
                        recorder2.v = encodedData;
                        AudioState audioState = recorder2.u;
                        AudioState audioState2 = AudioState.e;
                        if (audioState == audioState2 && arrayRingBuffer.b()) {
                            if (z) {
                                Logger.a("Recorder", "Replaced cached video keyframe with newer keyframe.");
                                return;
                            } else {
                                Logger.a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
                                return;
                            }
                        }
                        Logger.a("Recorder", "Received video keyframe. Starting muxer...");
                        if (recorder2.u == audioState2 && arrayRingBuffer.b()) {
                            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
                        }
                        EncodedData encodedData3 = recorder2.v;
                        if (encodedData3 == null) {
                            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
                        }
                        try {
                            recorder2.v = null;
                            long jH0 = encodedData3.h0();
                            ArrayList arrayList = new ArrayList();
                            while (!arrayRingBuffer.b()) {
                                EncodedData encodedData4 = (EncodedData) arrayRingBuffer.a();
                                if (encodedData4.h0() >= jH0) {
                                    arrayList.add(encodedData4);
                                }
                            }
                            encodedData3.size();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((EncodedData) it.next()).size();
                            }
                            try {
                                if (((MediaSpec) Recorder.i(recorder2.s)).c() != -1) {
                                    throw null;
                                }
                                VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy = recorder2.m;
                                Recorder.G.getClass();
                                if (videoValidatedEncoderProfilesProxy == null) {
                                    throw null;
                                }
                                int iA = videoValidatedEncoderProfilesProxy.a();
                                if (iA != 1 && iA != 2) {
                                    throw null;
                                }
                                throw null;
                            } catch (IOException e) {
                                recorder2.l(e, 5);
                                encodedData3.close();
                            }
                        } catch (Throwable th) {
                            try {
                                encodedData3.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, recorder.d);
                return "videoEncodingFuture";
            default:
                final SessionConfig.Builder builder = (SessionConfig.Builder) obj;
                VideoCapture.Defaults defaults = VideoCapture.D;
                builder.j(Integer.valueOf(completer2.hashCode()), "androidx.camera.video.VideoCapture.streamUpdate");
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                CameraCaptureCallback cameraCaptureCallback = new CameraCaptureCallback() { // from class: androidx.camera.video.VideoCapture.2

                    /* renamed from: a, reason: collision with root package name */
                    public boolean f598a = true;

                    @Override // androidx.camera.core.impl.CameraCaptureCallback
                    public final void b(int i2, CameraCaptureResult cameraCaptureResult) {
                        Object obj2;
                        if (this.f598a) {
                            this.f598a = false;
                            Logger.a("VideoCapture", "cameraCaptureResult timestampNs = " + cameraCaptureResult.getTimestamp() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        if (atomicBoolean2.get() || (obj2 = cameraCaptureResult.a().f504a.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
                            return;
                        }
                        int iIntValue = ((Integer) obj2).intValue();
                        CallbackToFutureAdapter.Completer completer2 = completer2;
                        if (iIntValue == completer2.hashCode() && completer2.b(null) && !atomicBoolean2.getAndSet(true)) {
                            CameraXExecutors.d().execute(new c(1, this, builder));
                        }
                    }
                };
                completer2.a(new d(2, atomicBoolean, builder, cameraCaptureCallback), CameraXExecutors.a());
                builder.g(cameraCaptureCallback);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(completer2.hashCode()));
        }
    }

    public /* synthetic */ b(VideoCapture videoCapture, SessionConfig.Builder builder) {
        this.d = 2;
        this.e = builder;
    }
}
