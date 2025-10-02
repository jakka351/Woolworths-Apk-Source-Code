package androidx.camera.video.internal.encoder;

import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.encoder.EncoderImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                EncoderImpl encoderImpl = (EncoderImpl) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                Runnable runnable = (Runnable) this.g;
                if (encoderImpl.t != EncoderImpl.InternalState.k) {
                    if (!arrayList.isEmpty()) {
                        Logger.a(encoderImpl.f625a, "encoded data and input buffers are returned");
                    }
                    if ((encoderImpl.f instanceof EncoderImpl.SurfaceInput) && !encoderImpl.B && DeviceQuirks.f614a.b(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) == null) {
                        encoderImpl.e.flush();
                        encoderImpl.A = true;
                    } else {
                        encoderImpl.e.stop();
                    }
                }
                runnable.run();
                EncoderImpl.InternalState internalState = EncoderImpl.InternalState.i;
                EncoderImpl.InternalState internalState2 = encoderImpl.t;
                if (internalState2 != EncoderImpl.InternalState.j) {
                    if (!encoderImpl.A) {
                        encoderImpl.l();
                    }
                    encoderImpl.m(EncoderImpl.InternalState.d);
                    if (internalState2 == EncoderImpl.InternalState.h || internalState2 == internalState) {
                        encoderImpl.start();
                        if (internalState2 == internalState) {
                            encoderImpl.pause();
                            break;
                        }
                    }
                } else {
                    encoderImpl.j();
                    break;
                }
                break;
            case 1:
                EncoderImpl.ByteBufferInput byteBufferInput = (EncoderImpl.ByteBufferInput) this.e;
                Observable.Observer observer = (Observable.Observer) this.f;
                Executor executor = (Executor) this.g;
                LinkedHashMap linkedHashMap = byteBufferInput.f628a;
                observer.getClass();
                executor.getClass();
                linkedHashMap.put(observer, executor);
                executor.execute(new d(9, observer, byteBufferInput.b));
                break;
            case 2:
                EncoderImpl.MediaCodecCallback mediaCodecCallback = (EncoderImpl.MediaCodecCallback) this.e;
                Executor executor2 = (Executor) this.f;
                EncoderCallback encoderCallback = (EncoderCallback) this.g;
                EncoderImpl encoderImpl2 = EncoderImpl.this;
                if (encoderImpl2.t != EncoderImpl.InternalState.k) {
                    try {
                        Objects.requireNonNull(encoderCallback);
                        executor2.execute(new i(encoderCallback, 2));
                        break;
                    } catch (RejectedExecutionException e) {
                        Logger.c(encoderImpl2.f625a, "Unable to post to the supplied executor.", e);
                        return;
                    }
                }
                break;
            default:
                EncoderCallback encoderCallback2 = (EncoderCallback) this.e;
                String str = (String) this.f;
                Throwable th = (Throwable) this.g;
                Range range = EncoderImpl.E;
                encoderCallback2.a(new EncodeException(str, th));
                break;
        }
    }

    public /* synthetic */ e(EncoderCallback encoderCallback, int i, String str, Throwable th) {
        this.d = 3;
        this.e = encoderCallback;
        this.f = str;
        this.g = th;
    }
}
