package androidx.camera.video.internal.audio;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class AudioStreamImpl implements AudioStream {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f610a = 0;

    @RequiresApi
    public class AudioRecordingApi29Callback extends AudioManager.AudioRecordingCallback {
        @Override // android.media.AudioManager.AudioRecordingCallback
        public final void onRecordingConfigChanged(List list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                ((AudioRecordingConfiguration) it.next()).getClientAudioSessionId();
                throw null;
            }
        }
    }

    static {
        TimeUnit.MILLISECONDS.toNanos(500L);
    }

    public final void a(boolean z) {
    }
}
