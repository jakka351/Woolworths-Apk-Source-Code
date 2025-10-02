package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.FixedFrameRateEstimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@UnstableApi
/* loaded from: classes2.dex */
public final class VideoFrameReleaseHelper {

    /* renamed from: a, reason: collision with root package name */
    public final FixedFrameRateEstimator f3205a;
    public final DisplayHelper b;
    public final VSyncSampler c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    @RequiresApi
    public static final class Api30 {
    }

    public final class DisplayHelper implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayManager f3206a;

        public DisplayHelper(DisplayManager displayManager) {
            this.f3206a = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            if (i == 0) {
                VideoFrameReleaseHelper.a(VideoFrameReleaseHelper.this, this.f3206a.getDisplay(0));
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }

    public static final class VSyncSampler implements Choreographer.FrameCallback, Handler.Callback {
        public static final VSyncSampler h = new VSyncSampler();
        public volatile long d = -9223372036854775807L;
        public final Handler e;
        public Choreographer f;
        public int g;

        public VSyncSampler() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i = Util.f2928a;
            Handler handler = new Handler(looper, this);
            this.e = handler;
            handler.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.d = j;
            Choreographer choreographer = this.f;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    this.f = Choreographer.getInstance();
                } catch (RuntimeException e) {
                    Log.h("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                }
                return true;
            }
            if (i == 2) {
                Choreographer choreographer = this.f;
                if (choreographer != null) {
                    int i2 = this.g + 1;
                    this.g = i2;
                    if (i2 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i != 3) {
                return false;
            }
            Choreographer choreographer2 = this.f;
            if (choreographer2 != null) {
                int i3 = this.g - 1;
                this.g = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.d = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    public VideoFrameReleaseHelper(@Nullable Context context) {
        DisplayManager displayManager;
        FixedFrameRateEstimator fixedFrameRateEstimator = new FixedFrameRateEstimator();
        fixedFrameRateEstimator.f3193a = new FixedFrameRateEstimator.Matcher();
        fixedFrameRateEstimator.b = new FixedFrameRateEstimator.Matcher();
        fixedFrameRateEstimator.d = -9223372036854775807L;
        this.f3205a = fixedFrameRateEstimator;
        DisplayHelper displayHelper = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new DisplayHelper(displayManager);
        this.b = displayHelper;
        this.c = displayHelper != null ? VSyncSampler.h : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static void a(VideoFrameReleaseHelper videoFrameReleaseHelper, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            videoFrameReleaseHelper.k = refreshRate;
            videoFrameReleaseHelper.l = (refreshRate * 80) / 100;
        } else {
            Log.g("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            videoFrameReleaseHelper.k = -9223372036854775807L;
            videoFrameReleaseHelper.l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (Util.f2928a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this.h = BitmapDescriptorFactory.HUE_RED;
        try {
            surface.setFrameRate(BitmapDescriptorFactory.HUE_RED, 0);
        } catch (IllegalStateException e) {
            Log.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = androidx.media3.common.util.Util.f2928a
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            androidx.media3.exoplayer.video.FixedFrameRateEstimator r0 = r9.f3205a
            androidx.media3.exoplayer.video.FixedFrameRateEstimator$Matcher r2 = r0.f3193a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            androidx.media3.exoplayer.video.FixedFrameRateEstimator$Matcher r2 = r0.f3193a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            androidx.media3.exoplayer.video.FixedFrameRateEstimator$Matcher r2 = r0.f3193a
            long r4 = r2.e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3b
        L37:
            r2 = r3
            goto L3b
        L39:
            float r2 = r9.f
        L3b:
            float r4 = r9.g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            goto L8d
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            androidx.media3.exoplayer.video.FixedFrameRateEstimator$Matcher r1 = r0.f3193a
            boolean r1 = r1.a()
            if (r1 == 0) goto L71
            androidx.media3.exoplayer.video.FixedFrameRateEstimator$Matcher r1 = r0.f3193a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5f
            androidx.media3.exoplayer.video.FixedFrameRateEstimator$Matcher r0 = r0.f3193a
            long r0 = r0.f
            goto L64
        L5f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L64:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L71
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L73
        L71:
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            float r1 = r9.g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.e
            if (r0 < r1) goto L8d
        L87:
            r9.g = r2
            r0 = 0
            r9.d(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.VideoFrameReleaseHelper.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(boolean r5) {
        /*
            r4 = this;
            int r0 = androidx.media3.common.util.Util.f2928a
            r1 = 30
            if (r0 < r1) goto L41
            android.view.Surface r0 = r4.e
            if (r0 == 0) goto L41
            int r1 = r4.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L41
        L11:
            boolean r1 = r4.d
            r2 = 0
            if (r1 == 0) goto L22
            float r1 = r4.g
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            float r3 = r4.i
            float r1 = r1 * r3
            goto L23
        L22:
            r1 = r2
        L23:
            if (r5 != 0) goto L2c
            float r5 = r4.h
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2c
            goto L41
        L2c:
            r4.h = r1
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L34
            r5 = 0
            goto L35
        L34:
            r5 = 1
        L35:
            androidx.media3.exoplayer.source.f.x(r0, r1, r5)     // Catch: java.lang.IllegalStateException -> L39
            return
        L39:
            r5 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            androidx.media3.common.util.Log.d(r0, r1, r5)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.VideoFrameReleaseHelper.d(boolean):void");
    }
}
