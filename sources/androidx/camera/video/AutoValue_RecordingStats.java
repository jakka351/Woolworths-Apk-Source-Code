package androidx.camera.video;

/* loaded from: classes2.dex */
final class AutoValue_RecordingStats extends RecordingStats {
    @Override // androidx.camera.video.RecordingStats
    public final AudioStats a() {
        return null;
    }

    @Override // androidx.camera.video.RecordingStats
    public final long b() {
        return 0L;
    }

    @Override // androidx.camera.video.RecordingStats
    public final long c() {
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecordingStats)) {
            return false;
        }
        RecordingStats recordingStats = (RecordingStats) obj;
        if (0 != recordingStats.c() || 0 != recordingStats.b()) {
            return false;
        }
        recordingStats.a();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=0, numBytesRecorded=0, audioStats=" + ((Object) null) + "}";
    }
}
