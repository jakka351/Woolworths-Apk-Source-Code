package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.VideoFrameReleaseHelper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public final class VideoFrameReleaseControl {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodecVideoRenderer f3203a;
    public final VideoFrameReleaseHelper b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public Clock l = Clock.f2906a;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface FrameReleaseAction {
    }

    public static class FrameReleaseInfo {

        /* renamed from: a, reason: collision with root package name */
        public long f3204a = -9223372036854775807L;
        public long b = -9223372036854775807L;
    }

    public interface FrameTimingEvaluator {
    }

    public VideoFrameReleaseControl(Context context, MediaCodecVideoRenderer mediaCodecVideoRenderer, long j) {
        this.f3203a = mediaCodecVideoRenderer;
        this.c = j;
        this.b = new VideoFrameReleaseHelper(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(long r27, long r29, long r31, long r33, boolean r35, boolean r36, androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameReleaseInfo r37) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.VideoFrameReleaseControl.a(long, long, long, long, boolean, boolean, androidx.media3.exoplayer.video.VideoFrameReleaseControl$FrameReleaseInfo):int");
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (!this.m && this.n))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        if (this.l.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        this.j = z;
        long j = this.c;
        this.i = j > 0 ? this.l.elapsedRealtime() + j : -9223372036854775807L;
    }

    public final void d(int i) {
        this.e = Math.min(this.e, i);
    }

    public final void e() {
        this.d = true;
        this.g = Util.I(this.l.elapsedRealtime());
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.b;
        videoFrameReleaseHelper.d = true;
        videoFrameReleaseHelper.m = 0L;
        videoFrameReleaseHelper.p = -1L;
        videoFrameReleaseHelper.n = -1L;
        VideoFrameReleaseHelper.DisplayHelper displayHelper = videoFrameReleaseHelper.b;
        if (displayHelper != null) {
            DisplayManager displayManager = displayHelper.f3206a;
            VideoFrameReleaseHelper.VSyncSampler vSyncSampler = videoFrameReleaseHelper.c;
            vSyncSampler.getClass();
            vSyncSampler.e.sendEmptyMessage(2);
            displayManager.registerDisplayListener(displayHelper, Util.m(null));
            VideoFrameReleaseHelper.a(VideoFrameReleaseHelper.this, displayManager.getDisplay(0));
        }
        videoFrameReleaseHelper.d(false);
    }

    public final void f() {
        this.d = false;
        this.i = -9223372036854775807L;
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.b;
        videoFrameReleaseHelper.d = false;
        VideoFrameReleaseHelper.DisplayHelper displayHelper = videoFrameReleaseHelper.b;
        if (displayHelper != null) {
            displayHelper.f3206a.unregisterDisplayListener(displayHelper);
            VideoFrameReleaseHelper.VSyncSampler vSyncSampler = videoFrameReleaseHelper.c;
            vSyncSampler.getClass();
            vSyncSampler.e.sendEmptyMessage(3);
        }
        videoFrameReleaseHelper.b();
    }

    public final void g(Surface surface) {
        this.m = surface != null;
        this.n = false;
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.b;
        if (videoFrameReleaseHelper.e != surface) {
            videoFrameReleaseHelper.b();
            videoFrameReleaseHelper.e = surface;
            videoFrameReleaseHelper.d(true);
        }
        d(1);
    }

    public final void h(float f) {
        Assertions.b(f > BitmapDescriptorFactory.HUE_RED);
        if (f == this.k) {
            return;
        }
        this.k = f;
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.b;
        videoFrameReleaseHelper.i = f;
        videoFrameReleaseHelper.m = 0L;
        videoFrameReleaseHelper.p = -1L;
        videoFrameReleaseHelper.n = -1L;
        videoFrameReleaseHelper.d(false);
    }
}
