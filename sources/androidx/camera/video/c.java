package androidx.camera.video;

import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.internal.encoder.Encoder;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture scheduledFuture;
        Encoder encoder;
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                Recorder recorder = (Recorder) obj2;
                VideoOutput.SourceState sourceState = (VideoOutput.SourceState) obj;
                VideoOutput.SourceState sourceState2 = recorder.x;
                recorder.x = sourceState;
                if (sourceState2 == sourceState) {
                    Logger.a("Recorder", "Video source transitions to the same state: " + sourceState);
                    break;
                } else {
                    Logger.a("Recorder", "Video source has transitioned to state: " + sourceState);
                    if (sourceState != VideoOutput.SourceState.f) {
                        if (sourceState == VideoOutput.SourceState.e && (scheduledFuture = recorder.y) != null && scheduledFuture.cancel(false) && (encoder = recorder.t) != null) {
                            Recorder.k(encoder);
                            break;
                        }
                    } else if (recorder.r == null) {
                        Recorder.SetupVideoTask setupVideoTask = recorder.B;
                        if (setupVideoTask != null) {
                            if (!setupVideoTask.d) {
                                setupVideoTask.d = true;
                                ScheduledFuture scheduledFuture2 = setupVideoTask.f;
                                if (scheduledFuture2 != null) {
                                    scheduledFuture2.cancel(false);
                                    setupVideoTask.f = null;
                                }
                            }
                            recorder.B = null;
                        }
                        recorder.m(false);
                        break;
                    }
                }
                break;
            case 1:
                ((SessionConfig.Builder) obj).n((VideoCapture.AnonymousClass2) obj2);
                break;
            case 2:
                ((VideoEncoderSession) obj2).h.a((Surface) obj);
                break;
            case 3:
                Set set = Recorder.C;
                ((Executor) obj2).execute((Runnable) obj);
                break;
            default:
                VideoCapture videoCapture = (VideoCapture) obj2;
                if (((DeferrableSurface) obj) == videoCapture.p) {
                    videoCapture.H();
                    break;
                }
                break;
        }
    }
}
