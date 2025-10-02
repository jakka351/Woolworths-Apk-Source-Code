package androidx.camera.video;

import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.encoder.Encoder;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Recorder.SetupVideoTask setupVideoTask = Recorder.SetupVideoTask.this;
                if (!setupVideoTask.d) {
                    Logger.a("Recorder", "Retry setupVideo #" + setupVideoTask.e);
                    SurfaceRequest surfaceRequest = setupVideoTask.f593a;
                    Timebase timebase = setupVideoTask.b;
                    Recorder recorder = Recorder.this;
                    Set set = Recorder.C;
                    recorder.o().addListener(new d(0, setupVideoTask, surfaceRequest, timebase), recorder.d);
                    break;
                }
                break;
            case 1:
                ((VideoEncoderSession) this.e).k.b(null);
                break;
            case 2:
                Encoder encoder = (Encoder) this.e;
                Set set2 = Recorder.C;
                Logger.a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                if (DeviceQuirks.f614a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                    Recorder.k(encoder);
                    break;
                }
                break;
            default:
                VideoCapture videoCapture = (VideoCapture) this.e;
                VideoCapture.Defaults defaults = VideoCapture.D;
                videoCapture.p();
                break;
        }
    }
}
