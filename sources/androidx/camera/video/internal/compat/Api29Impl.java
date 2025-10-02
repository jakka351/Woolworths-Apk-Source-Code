package androidx.camera.video.internal.compat;

import android.media.AudioRecordingConfiguration;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes2.dex */
public final class Api29Impl {
    public static boolean a(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }
}
