package androidx.media3.exoplayer.video;

import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.Renderer;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public interface VideoSink {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    public interface Listener {

        /* renamed from: a, reason: collision with root package name */
        public static final Listener f3209a = new AnonymousClass1();

        /* renamed from: androidx.media3.exoplayer.video.VideoSink$Listener$1, reason: invalid class name */
        public class AnonymousClass1 implements Listener {
            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public final void a(VideoSize videoSize) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public final void b() {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public final void c() {
            }
        }

        void a(VideoSize videoSize);

        void b();

        void c();
    }

    public interface VideoFrameHandler {
        void a();

        void b(long j);
    }

    public static final class VideoSinkException extends Exception {
        public final Format d;

        public VideoSinkException(Exception exc, Format format) {
            super(exc);
            this.d = format;
        }
    }

    void d();

    void e(long j, long j2);

    void f(Renderer.WakeupListener wakeupListener);
}
