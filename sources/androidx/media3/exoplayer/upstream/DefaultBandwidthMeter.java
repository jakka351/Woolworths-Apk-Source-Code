package androidx.media3.exoplayer.upstream;

import android.content.Context;
import android.os.Handler;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    public static final ImmutableList p = ImmutableList.u(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final ImmutableList q = ImmutableList.u(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final ImmutableList r = ImmutableList.u(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final ImmutableList s = ImmutableList.u(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final ImmutableList t = ImmutableList.u(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final ImmutableList u = ImmutableList.u(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static DefaultBandwidthMeter v;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3179a;
    public final ImmutableMap b;
    public final BandwidthMeter.EventListener.EventDispatcher c;
    public final Clock d;
    public final boolean e;
    public final SlidingPercentile f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public int n;
    public String o;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Context f3180a;
        public final HashMap b;
        public final int c;
        public final SystemClock d;
        public final boolean e;

        public Builder(Context context) {
            this.f3180a = context == null ? null : context.getApplicationContext();
            this.c = 2000;
            this.d = Clock.f2906a;
            this.e = true;
            HashMap map = new HashMap(8);
            this.b = map;
            map.put(0, 1000000L);
            map.put(2, -9223372036854775807L);
            map.put(3, -9223372036854775807L);
            map.put(4, -9223372036854775807L);
            map.put(5, -9223372036854775807L);
            map.put(10, -9223372036854775807L);
            map.put(9, -9223372036854775807L);
            map.put(7, -9223372036854775807L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.media3.exoplayer.upstream.b] */
    public DefaultBandwidthMeter(Context context, Map map, int i, Clock clock, boolean z) {
        this.f3179a = context == null ? null : context.getApplicationContext();
        this.b = ImmutableMap.c(map);
        this.c = new BandwidthMeter.EventListener.EventDispatcher();
        this.f = new SlidingPercentile(i);
        this.d = clock;
        this.e = z;
        if (context == null) {
            this.n = 0;
            this.l = 1000000L;
            return;
        }
        NetworkTypeObserver networkTypeObserverA = NetworkTypeObserver.a(context);
        int iB = networkTypeObserverA.b();
        this.n = iB;
        this.l = h(iB);
        networkTypeObserverA.c(new NetworkTypeObserver.Listener() { // from class: androidx.media3.exoplayer.upstream.b
            /* JADX WARN: Removed duplicated region for block: B:32:0x004b A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:13:0x0015, B:17:0x001b, B:23:0x0028, B:25:0x002c, B:27:0x0032, B:29:0x003c, B:31:0x0046, B:33:0x0057, B:32:0x004b, B:34:0x0059, B:36:0x006a, B:38:0x0072, B:42:0x007e, B:51:0x00ab, B:45:0x0085, B:46:0x008f, B:48:0x0095, B:50:0x00a0), top: B:58:0x0005 }] */
            @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(int r15) {
                /*
                    r14 = this;
                    androidx.media3.exoplayer.upstream.DefaultBandwidthMeter r1 = r14.f3186a
                    com.google.common.collect.ImmutableList r0 = androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.p
                    monitor-enter(r1)
                    int r0 = r1.n     // Catch: java.lang.Throwable -> Lf
                    if (r0 == 0) goto L13
                    boolean r2 = r1.e     // Catch: java.lang.Throwable -> Lf
                    if (r2 != 0) goto L13
                    monitor-exit(r1)
                    return
                Lf:
                    r0 = move-exception
                    r15 = r0
                    goto Lc5
                L13:
                    if (r0 != r15) goto L1b
                    java.lang.String r0 = r1.o     // Catch: java.lang.Throwable -> Lf
                    if (r0 == 0) goto L1b
                    monitor-exit(r1)
                    return
                L1b:
                    r1.n = r15     // Catch: java.lang.Throwable -> Lf
                    r0 = 1
                    if (r15 == r0) goto Lc3
                    if (r15 == 0) goto Lc3
                    r0 = 8
                    if (r15 != r0) goto L28
                    goto Lc3
                L28:
                    java.lang.String r0 = r1.o     // Catch: java.lang.Throwable -> Lf
                    if (r0 != 0) goto L59
                    android.content.Context r0 = r1.f3179a     // Catch: java.lang.Throwable -> Lf
                    int r2 = androidx.media3.common.util.Util.f2928a     // Catch: java.lang.Throwable -> Lf
                    if (r0 == 0) goto L4b
                    java.lang.String r2 = "phone"
                    java.lang.Object r0 = r0.getSystemService(r2)     // Catch: java.lang.Throwable -> Lf
                    android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Throwable -> Lf
                    if (r0 == 0) goto L4b
                    java.lang.String r0 = r0.getNetworkCountryIso()     // Catch: java.lang.Throwable -> Lf
                    boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lf
                    if (r2 != 0) goto L4b
                    java.lang.String r0 = com.google.common.base.Ascii.c(r0)     // Catch: java.lang.Throwable -> Lf
                    goto L57
                L4b:
                    java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> Lf
                    java.lang.String r0 = r0.getCountry()     // Catch: java.lang.Throwable -> Lf
                    java.lang.String r0 = com.google.common.base.Ascii.c(r0)     // Catch: java.lang.Throwable -> Lf
                L57:
                    r1.o = r0     // Catch: java.lang.Throwable -> Lf
                L59:
                    long r2 = r1.h(r15)     // Catch: java.lang.Throwable -> Lf
                    r1.l = r2     // Catch: java.lang.Throwable -> Lf
                    androidx.media3.common.util.Clock r15 = r1.d     // Catch: java.lang.Throwable -> Lf
                    long r2 = r15.elapsedRealtime()     // Catch: java.lang.Throwable -> Lf
                    int r15 = r1.g     // Catch: java.lang.Throwable -> Lf
                    r0 = 0
                    if (r15 <= 0) goto L71
                    long r4 = r1.h     // Catch: java.lang.Throwable -> Lf
                    long r4 = r2 - r4
                    int r15 = (int) r4     // Catch: java.lang.Throwable -> Lf
                    r6 = r15
                    goto L72
                L71:
                    r6 = r0
                L72:
                    long r7 = r1.i     // Catch: java.lang.Throwable -> Lf
                    long r9 = r1.l     // Catch: java.lang.Throwable -> Lf
                    r11 = 0
                    if (r6 != 0) goto L85
                    int r15 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                    if (r15 != 0) goto L85
                    long r4 = r1.m     // Catch: java.lang.Throwable -> Lf
                    int r15 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                    if (r15 != 0) goto L85
                    goto Lab
                L85:
                    r1.m = r9     // Catch: java.lang.Throwable -> Lf
                    androidx.media3.exoplayer.upstream.BandwidthMeter$EventListener$EventDispatcher r15 = r1.c     // Catch: java.lang.Throwable -> Lf
                    java.util.concurrent.CopyOnWriteArrayList r15 = r15.f3176a     // Catch: java.lang.Throwable -> Lf
                    java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> Lf
                L8f:
                    boolean r4 = r15.hasNext()     // Catch: java.lang.Throwable -> Lf
                    if (r4 == 0) goto Lab
                    java.lang.Object r4 = r15.next()     // Catch: java.lang.Throwable -> Lf
                    r5 = r4
                    androidx.media3.exoplayer.upstream.BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener r5 = (androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener) r5     // Catch: java.lang.Throwable -> Lf
                    boolean r4 = r5.c     // Catch: java.lang.Throwable -> Lf
                    if (r4 != 0) goto L8f
                    android.os.Handler r13 = r5.f3177a     // Catch: java.lang.Throwable -> Lf
                    androidx.media3.exoplayer.upstream.a r4 = new androidx.media3.exoplayer.upstream.a     // Catch: java.lang.Throwable -> Lf
                    r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> Lf
                    r13.post(r4)     // Catch: java.lang.Throwable -> Lf
                    goto L8f
                Lab:
                    r1.h = r2     // Catch: java.lang.Throwable -> Lf
                    r1.i = r11     // Catch: java.lang.Throwable -> Lf
                    r1.k = r11     // Catch: java.lang.Throwable -> Lf
                    r1.j = r11     // Catch: java.lang.Throwable -> Lf
                    androidx.media3.exoplayer.upstream.SlidingPercentile r15 = r1.f     // Catch: java.lang.Throwable -> Lf
                    java.util.ArrayList r2 = r15.b     // Catch: java.lang.Throwable -> Lf
                    r2.clear()     // Catch: java.lang.Throwable -> Lf
                    r2 = -1
                    r15.d = r2     // Catch: java.lang.Throwable -> Lf
                    r15.e = r0     // Catch: java.lang.Throwable -> Lf
                    r15.f = r0     // Catch: java.lang.Throwable -> Lf
                    monitor-exit(r1)
                    return
                Lc3:
                    monitor-exit(r1)
                    return
                Lc5:
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
                    throw r15
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.upstream.b.a(int):void");
            }
        }, BackgroundExecutor.a());
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public final void a(BandwidthMeter.EventListener eventListener) {
        this.c.a(eventListener);
    }

    @Override // androidx.media3.datasource.TransferListener
    public final void b(DataSpec dataSpec, boolean z) {
    }

    @Override // androidx.media3.datasource.TransferListener
    public final synchronized void c(DataSpec dataSpec, boolean z) {
        boolean z2;
        if (z) {
            int i = dataSpec.i;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Assertions.f(this.g > 0);
            long jElapsedRealtime = this.d.elapsedRealtime();
            int i2 = (int) (jElapsedRealtime - this.h);
            this.j += i2;
            long j = this.k;
            long j2 = this.i;
            this.k = j + j2;
            if (i2 > 0) {
                this.f.a((j2 * 8000.0f) / i2, (int) Math.sqrt(j2));
                if (this.j >= 2000 || this.k >= 524288) {
                    this.l = (long) this.f.b();
                }
                long j3 = this.i;
                long j4 = this.l;
                if (i2 != 0 || j3 != 0 || j4 != this.m) {
                    this.m = j4;
                    Iterator it = this.c.f3176a.iterator();
                    while (it.hasNext()) {
                        BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener = (BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener) it.next();
                        if (!handlerAndListener.c) {
                            handlerAndListener.f3177a.post(new a(handlerAndListener, i2, j3, j4));
                        }
                    }
                }
                this.h = jElapsedRealtime;
                this.i = 0L;
            }
            this.g--;
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public final synchronized void d(DataSpec dataSpec, boolean z, int i) {
        boolean z2;
        if (z) {
            int i2 = dataSpec.i;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.i += i;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public final void e(Handler handler, BandwidthMeter.EventListener eventListener) {
        eventListener.getClass();
        BandwidthMeter.EventListener.EventDispatcher eventDispatcher = this.c;
        eventDispatcher.getClass();
        eventDispatcher.a(eventListener);
        eventDispatcher.f3176a.add(new BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener(handler, eventListener));
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public final TransferListener f() {
        return this;
    }

    @Override // androidx.media3.datasource.TransferListener
    public final synchronized void g(DataSpec dataSpec, boolean z) {
        boolean z2;
        if (z) {
            int i = dataSpec.i;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.g == 0) {
                this.h = this.d.elapsedRealtime();
            }
            this.g++;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1149:0x1225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(int r18) {
        /*
            Method dump skipped, instructions count: 8770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.h(int):long");
    }
}
