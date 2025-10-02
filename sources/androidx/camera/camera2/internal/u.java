package androidx.camera.camera2.internal;

import android.util.Log;
import androidx.camera.camera2.internal.Camera2CapturePipeline;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int d;

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                int i = Camera2CapturePipeline.ScreenFlashTask.g;
                Log.d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
                break;
        }
    }
}
