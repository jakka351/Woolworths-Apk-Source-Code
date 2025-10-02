package androidx.camera.video;

import androidx.camera.video.Recorder;

/* loaded from: classes2.dex */
final class AutoValue_Recorder_RecordingRecord extends Recorder.RecordingRecord {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Recorder.RecordingRecord) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "RecordingRecord{getOutputOptions=null, getCallbackExecutor=null, getEventListener=null, hasAudioEnabled=false, isPersistent=false, getRecordingId=0}";
    }
}
