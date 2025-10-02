package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CopyOnWriteMultiset;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes2.dex */
class DefaultDrmSession implements DrmSession {

    /* renamed from: a, reason: collision with root package name */
    public final List f3071a;
    public final ExoMediaDrm b;
    public final ProvisioningManager c;
    public final ReferenceCountListener d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final CopyOnWriteMultiset h;
    public final LoadErrorHandlingPolicy i;
    public final PlayerId j;
    public final MediaDrmCallback k;
    public final UUID l;
    public final Looper m;
    public final ResponseHandler n;
    public int o;
    public int p;
    public HandlerThread q;
    public RequestHandler r;
    public CryptoConfig s;
    public DrmSession.DrmSessionException t;
    public byte[] u;
    public byte[] v;
    public ExoMediaDrm.KeyRequest w;
    public ExoMediaDrm.ProvisionRequest x;

    public interface ProvisioningManager {
        void a(Exception exc, boolean z);

        void b();

        void c(DefaultDrmSession defaultDrmSession);
    }

    public interface ReferenceCountListener {
        void a(DefaultDrmSession defaultDrmSession);

        void b(DefaultDrmSession defaultDrmSession, int i);
    }

    @SuppressLint
    public class RequestHandler extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3072a;

        public RequestHandler(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Exception excB;
            RequestTask requestTask = (RequestTask) message.obj;
            try {
                int i = message.what;
                if (i == 1) {
                    excB = DefaultDrmSession.this.k.b((ExoMediaDrm.ProvisionRequest) requestTask.c);
                } else {
                    if (i != 2) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    excB = defaultDrmSession.k.a(defaultDrmSession.l, (ExoMediaDrm.KeyRequest) requestTask.c);
                }
            } catch (MediaDrmCallbackException e) {
                RequestTask requestTask2 = (RequestTask) message.obj;
                if (requestTask2.b) {
                    int i2 = requestTask2.d + 1;
                    requestTask2.d = i2;
                    if (i2 <= DefaultDrmSession.this.i.b(3)) {
                        SystemClock.elapsedRealtime();
                        SystemClock.elapsedRealtime();
                        long jA = DefaultDrmSession.this.i.a(new LoadErrorHandlingPolicy.LoadErrorInfo(e.getCause() instanceof IOException ? (IOException) e.getCause() : new UnexpectedDrmSessionException(e.getCause()), requestTask2.d));
                        if (jA != -9223372036854775807L) {
                            synchronized (this) {
                                try {
                                    if (!this.f3072a) {
                                        sendMessageDelayed(Message.obtain(message), jA);
                                        return;
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
                excB = e;
            } catch (Exception e2) {
                Log.h("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                excB = e2;
            }
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = DefaultDrmSession.this.i;
            long j = requestTask.f3073a;
            loadErrorHandlingPolicy.getClass();
            synchronized (this) {
                try {
                    if (!this.f3072a) {
                        DefaultDrmSession.this.n.obtainMessage(message.what, Pair.create(requestTask.c, excB)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    public static final class RequestTask {

        /* renamed from: a, reason: collision with root package name */
        public final long f3073a;
        public final boolean b;
        public final Object c;
        public int d;

        public RequestTask(long j, boolean z, long j2, Object obj) {
            this.f3073a = j;
            this.b = z;
            this.c = obj;
        }
    }

    @SuppressLint
    public class ResponseHandler extends Handler {
        public ResponseHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Set set;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 1) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                ProvisioningManager provisioningManager = defaultDrmSession.c;
                if (obj == defaultDrmSession.x) {
                    if (defaultDrmSession.o == 2 || defaultDrmSession.i()) {
                        defaultDrmSession.x = null;
                        if (obj2 instanceof Exception) {
                            provisioningManager.a((Exception) obj2, false);
                            return;
                        }
                        try {
                            defaultDrmSession.b.h((byte[]) obj2);
                            provisioningManager.b();
                            return;
                        } catch (Exception e) {
                            provisioningManager.a(e, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
            if (obj == defaultDrmSession2.w && defaultDrmSession2.i()) {
                defaultDrmSession2.w = null;
                if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                    defaultDrmSession2.k((Throwable) obj2, false);
                    return;
                }
                try {
                    byte[] bArrE = defaultDrmSession2.b.e(defaultDrmSession2.u, (byte[]) obj2);
                    if (defaultDrmSession2.v != null && bArrE != null && bArrE.length != 0) {
                        defaultDrmSession2.v = bArrE;
                    }
                    defaultDrmSession2.o = 4;
                    CopyOnWriteMultiset copyOnWriteMultiset = defaultDrmSession2.h;
                    synchronized (copyOnWriteMultiset.d) {
                        set = copyOnWriteMultiset.f;
                    }
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((DrmSessionEventListener.EventDispatcher) it.next()).b();
                    }
                } catch (Exception e2) {
                    e = e2;
                    defaultDrmSession2.k(e, true);
                } catch (NoSuchMethodError e3) {
                    e = e3;
                    defaultDrmSession2.k(e, true);
                }
            }
        }
    }

    public static final class UnexpectedDrmSessionException extends IOException {
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm exoMediaDrm, ProvisioningManager provisioningManager, ReferenceCountListener referenceCountListener, List list, boolean z, boolean z2, byte[] bArr, HashMap map, HttpMediaDrmCallback httpMediaDrmCallback, Looper looper, LoadErrorHandlingPolicy loadErrorHandlingPolicy, PlayerId playerId) {
        this.l = uuid;
        this.c = provisioningManager;
        this.d = referenceCountListener;
        this.b = exoMediaDrm;
        this.e = z;
        this.f = z2;
        if (bArr != null) {
            this.v = bArr;
            this.f3071a = null;
        } else {
            list.getClass();
            this.f3071a = Collections.unmodifiableList(list);
        }
        this.g = map;
        this.k = httpMediaDrmCallback;
        this.h = new CopyOnWriteMultiset();
        this.i = loadErrorHandlingPolicy;
        this.j = playerId;
        this.o = 2;
        this.m = looper;
        this.n = new ResponseHandler(looper);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean a() {
        m();
        return this.e;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException c() {
        m();
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final CryptoConfig d() {
        m();
        return this.s;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void e(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        m();
        int i = this.p;
        if (i <= 0) {
            Log.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.p = i2;
        if (i2 == 0) {
            this.o = 0;
            ResponseHandler responseHandler = this.n;
            int i3 = Util.f2928a;
            responseHandler.removeCallbacksAndMessages(null);
            RequestHandler requestHandler = this.r;
            synchronized (requestHandler) {
                requestHandler.removeCallbacksAndMessages(null);
                requestHandler.f3072a = true;
            }
            this.r = null;
            this.q.quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.w = null;
            this.x = null;
            byte[] bArr = this.u;
            if (bArr != null) {
                this.b.k(bArr);
                this.u = null;
            }
        }
        if (eventDispatcher != null) {
            CopyOnWriteMultiset copyOnWriteMultiset = this.h;
            synchronized (copyOnWriteMultiset.d) {
                try {
                    Integer num = (Integer) copyOnWriteMultiset.e.get(eventDispatcher);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(copyOnWriteMultiset.g);
                        arrayList.remove(eventDispatcher);
                        copyOnWriteMultiset.g = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            copyOnWriteMultiset.e.remove(eventDispatcher);
                            HashSet hashSet = new HashSet(copyOnWriteMultiset.f);
                            hashSet.remove(eventDispatcher);
                            copyOnWriteMultiset.f = Collections.unmodifiableSet(hashSet);
                        } else {
                            copyOnWriteMultiset.e.put(eventDispatcher, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } finally {
                }
            }
            if (this.h.b(eventDispatcher) == 0) {
                eventDispatcher.f();
            }
        }
        this.d.b(this, this.p);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID f() {
        m();
        return this.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0125  */
    @Override // androidx.media3.exoplayer.drm.DrmSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher r11) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.DefaultDrmSession.g(androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher):void");
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        m();
        return this.o;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean h(String str) {
        m();
        byte[] bArr = this.u;
        Assertions.g(bArr);
        return this.b.g(str, bArr);
    }

    public final boolean i() {
        int i = this.o;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            androidx.media3.exoplayer.drm.DrmSession$DrmSessionException r0 = new androidx.media3.exoplayer.drm.DrmSession$DrmSessionException
            boolean r1 = r7 instanceof android.media.MediaDrm.MediaDrmStateException
            r2 = 1
            if (r1 == 0) goto L17
            r6 = r7
            android.media.MediaDrm$MediaDrmStateException r6 = (android.media.MediaDrm.MediaDrmStateException) r6
            java.lang.String r6 = r6.getDiagnosticInfo()
            int r6 = androidx.media3.common.util.Util.t(r6)
            int r6 = androidx.media3.common.util.Util.s(r6)
            goto L62
        L17:
            int r1 = androidx.media3.common.util.Util.f2928a
            r3 = 23
            r4 = 6006(0x1776, float:8.416E-42)
            if (r1 < r3) goto L25
            boolean r1 = r7 instanceof android.media.MediaDrmResetException
            if (r1 == 0) goto L25
        L23:
            r6 = r4
            goto L62
        L25:
            boolean r1 = r7 instanceof android.media.NotProvisionedException
            r3 = 6002(0x1772, float:8.41E-42)
            if (r1 != 0) goto L5a
            boolean r1 = androidx.media3.exoplayer.drm.DrmUtil.b(r7)
            if (r1 == 0) goto L32
            goto L5a
        L32:
            boolean r1 = r7 instanceof android.media.DeniedByServerException
            if (r1 == 0) goto L39
            r6 = 6007(0x1777, float:8.418E-42)
            goto L62
        L39:
            boolean r1 = r7 instanceof androidx.media3.exoplayer.drm.UnsupportedDrmException
            if (r1 == 0) goto L40
            r6 = 6001(0x1771, float:8.409E-42)
            goto L62
        L40:
            boolean r1 = r7 instanceof androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MissingSchemeDataException
            if (r1 == 0) goto L47
            r6 = 6003(0x1773, float:8.412E-42)
            goto L62
        L47:
            boolean r1 = r7 instanceof androidx.media3.exoplayer.drm.KeysExpiredException
            if (r1 == 0) goto L4e
            r6 = 6008(0x1778, float:8.419E-42)
            goto L62
        L4e:
            if (r6 != r2) goto L51
            goto L23
        L51:
            r1 = 2
            if (r6 != r1) goto L57
            r6 = 6004(0x1774, float:8.413E-42)
            goto L62
        L57:
            r1 = 3
            if (r6 != r1) goto L5c
        L5a:
            r6 = r3
            goto L62
        L5c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L62:
            r0.<init>(r7, r6)
            r5.t = r0
            java.lang.String r6 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            androidx.media3.common.util.Log.d(r6, r0, r7)
            boolean r6 = r7 instanceof java.lang.Exception
            if (r6 == 0) goto L94
            androidx.media3.common.util.CopyOnWriteMultiset r6 = r5.h
            java.lang.Object r0 = r6.d
            monitor-enter(r0)
            java.util.Set r6 = r6.f     // Catch: java.lang.Throwable -> L91
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            java.util.Iterator r6 = r6.iterator()
        L7e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r0 = r6.next()
            androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher r0 = (androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher) r0
            r1 = r7
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0.e(r1)
            goto L7e
        L91:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            throw r6
        L94:
            boolean r6 = r7 instanceof java.lang.Error
            if (r6 == 0) goto Lb0
            boolean r6 = androidx.media3.exoplayer.drm.DrmUtil.c(r7)
            if (r6 != 0) goto La8
            boolean r6 = androidx.media3.exoplayer.drm.DrmUtil.b(r7)
            if (r6 == 0) goto La5
            goto La8
        La5:
            java.lang.Error r7 = (java.lang.Error) r7
            throw r7
        La8:
            int r6 = r5.o
            r7 = 4
            if (r6 == r7) goto Laf
            r5.o = r2
        Laf:
            return
        Lb0:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected Throwable subclass"
            r6.<init>(r0, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.DefaultDrmSession.j(int, java.lang.Throwable):void");
    }

    public final void k(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || DrmUtil.b(th)) {
            this.c.c(this);
        } else {
            j(z ? 1 : 2, th);
        }
    }

    public final void l(byte[] bArr, int i, boolean z) {
        try {
            ExoMediaDrm.KeyRequest keyRequestM = this.b.m(bArr, this.f3071a, i, this.g);
            this.w = keyRequestM;
            RequestHandler requestHandler = this.r;
            int i2 = Util.f2928a;
            keyRequestM.getClass();
            requestHandler.getClass();
            requestHandler.obtainMessage(2, new RequestTask(LoadEventInfo.b.getAndIncrement(), z, SystemClock.elapsedRealtime(), keyRequestM)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            k(e, true);
        }
    }

    public final void m() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.m;
        if (threadCurrentThread != looper.getThread()) {
            Log.h("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
