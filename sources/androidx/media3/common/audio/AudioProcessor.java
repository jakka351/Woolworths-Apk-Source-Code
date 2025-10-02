package androidx.media3.common.audio;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public interface AudioProcessor {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f2893a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class AudioFormat {
        public static final AudioFormat e = new AudioFormat(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f2894a;
        public final int b;
        public final int c;
        public final int d;

        public AudioFormat(int i, int i2, int i3) {
            this.f2894a = i;
            this.b = i2;
            this.c = i3;
            this.d = Util.F(i3) ? Util.r(i3) * i2 : -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioFormat)) {
                return false;
            }
            AudioFormat audioFormat = (AudioFormat) obj;
            return this.f2894a == audioFormat.f2894a && this.b == audioFormat.b && this.c == audioFormat.c;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f2894a), Integer.valueOf(this.b), Integer.valueOf(this.c));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.f2894a);
            sb.append(", channelCount=");
            sb.append(this.b);
            sb.append(", encoding=");
            return YU.a.l(sb, this.c, ']');
        }
    }

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(AudioFormat audioFormat) {
            this("Unhandled input format:", audioFormat);
        }

        public UnhandledAudioFormatException(String str, AudioFormat audioFormat) {
            super(str + " " + audioFormat);
        }
    }

    boolean b();

    void c(ByteBuffer byteBuffer);

    void d();

    ByteBuffer e();

    AudioFormat f(AudioFormat audioFormat);

    void flush();

    boolean isActive();

    void reset();
}
