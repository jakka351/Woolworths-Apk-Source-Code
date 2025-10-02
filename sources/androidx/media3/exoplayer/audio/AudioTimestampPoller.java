package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes2.dex */
final class AudioTimestampPoller {

    /* renamed from: a, reason: collision with root package name */
    public final AudioTimestampWrapper f3050a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static final class AudioTimestampWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final AudioTrack f3051a;
        public final AudioTimestamp b = new AudioTimestamp();
        public long c;
        public long d;
        public long e;
        public boolean f;
        public long g;

        public AudioTimestampWrapper(AudioTrack audioTrack) {
            this.f3051a = audioTrack;
        }
    }

    public AudioTimestampPoller(AudioTrack audioTrack) {
        this.f3050a = new AudioTimestampWrapper(audioTrack);
        a();
    }

    public final void a() {
        if (this.f3050a != null) {
            b(0);
        }
    }

    public final void b(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = 10000L;
            return;
        }
        if (i == 1) {
            this.d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.d = 500000L;
        }
    }
}
