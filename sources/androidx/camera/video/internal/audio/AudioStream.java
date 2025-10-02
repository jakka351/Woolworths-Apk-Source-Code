package androidx.camera.video.internal.audio;

import com.google.auto.value.AutoValue;

/* loaded from: classes2.dex */
public interface AudioStream {

    public interface AudioStreamCallback {
    }

    public static class AudioStreamException extends Exception {
    }

    @AutoValue
    public static abstract class PacketInfo {
        public abstract int a();

        public abstract long b();
    }
}
