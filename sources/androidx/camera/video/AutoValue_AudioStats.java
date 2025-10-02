package androidx.camera.video;

/* loaded from: classes2.dex */
final class AutoValue_AudioStats extends AudioStats {
    @Override // androidx.camera.video.AudioStats
    public final double a() {
        return 0.0d;
    }

    @Override // androidx.camera.video.AudioStats
    public final int b() {
        return 0;
    }

    @Override // androidx.camera.video.AudioStats
    public final Throwable c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioStats)) {
            return false;
        }
        AudioStats audioStats = (AudioStats) obj;
        return audioStats.b() == 0 && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(audioStats.a()) && audioStats.c() == null;
    }

    public final int hashCode() {
        return ((((1000003 ^ 0) * 1000003) ^ ((int) (Double.doubleToLongBits(0.0d) ^ (Double.doubleToLongBits(0.0d) >>> 32)))) * 1000003) ^ 0;
    }

    public final String toString() {
        return "AudioStats{audioState=0, audioAmplitudeInternal=0.0, errorCause=" + ((Object) null) + "}";
    }
}
