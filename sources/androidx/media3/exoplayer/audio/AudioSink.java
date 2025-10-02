package androidx.media3.exoplayer.audio;

import androidx.media3.common.Format;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public interface AudioSink {

    public static final class AudioTrackConfig {

        /* renamed from: a, reason: collision with root package name */
        public final int f3049a;
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final int f;

        public AudioTrackConfig(int i, int i2, int i3, boolean z, boolean z2, int i4) {
            this.f3049a = i;
            this.b = i2;
            this.c = i3;
            this.d = z;
            this.e = z2;
            this.f = i4;
        }
    }

    public static final class InitializationException extends Exception {
        public final int d;
        public final boolean e;
        public final Format f;

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i, int i2, int i3, int i4, Format format, boolean z, RuntimeException runtimeException) {
            StringBuilder sbQ = YU.a.q(i, i2, "AudioTrack init failed ", " Config(", ", ");
            YU.a.w(i3, i4, ", ", ") ", sbQ);
            sbQ.append(format);
            sbQ.append(z ? " (recoverable)" : "");
            super(sbQ.toString(), runtimeException);
            this.d = i;
            this.e = z;
            this.f = format;
        }
    }

    public interface Listener {
        default void b(AudioTrackConfig audioTrackConfig) {
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
    }

    public static final class WriteException extends Exception {
        public final int d;
        public final boolean e;
        public final Format f;

        public WriteException(int i, Format format, boolean z) {
            super(YU.a.d(i, "AudioTrack write failed: "));
            this.e = z;
            this.d = i;
            this.f = format;
        }
    }

    public static final class ConfigurationException extends Exception {
        public final Format d;

        public ConfigurationException(AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, Format format) {
            super(unhandledAudioFormatException);
            this.d = format;
        }

        public ConfigurationException(String str, Format format) {
            super(str);
            this.d = format;
        }
    }
}
