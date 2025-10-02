package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

@UnstableApi
/* loaded from: classes2.dex */
public class DefaultDrmSessionManager implements DrmSessionManager {
    public int b;
    public ExoMediaDrm c;
    public DefaultDrmSession d;
    public DefaultDrmSession e;
    public Looper f;
    public Handler g;
    public PlayerId h;
    public volatile MediaDrmHandler i;

    public static final class Builder {
        public Builder() {
            new HashMap();
            UUID uuid = C.d;
        }
    }

    public class MediaDrmEventListener implements ExoMediaDrm.OnEventListener {
        public MediaDrmEventListener() {
        }
    }

    @SuppressLint
    public class MediaDrmHandler extends Handler {
        public MediaDrmHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (((byte[]) message.obj) != null) {
                throw null;
            }
        }
    }

    public static final class MissingSchemeDataException extends Exception {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class PreacquiredSessionReference implements DrmSessionManager.DrmSessionReference {
        public final DrmSessionEventListener.EventDispatcher d;
        public DrmSession e;
        public boolean f;

        public PreacquiredSessionReference(DrmSessionEventListener.EventDispatcher eventDispatcher) {
            this.d = eventDispatcher;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
        public final void release() {
            Handler handler = DefaultDrmSessionManager.this.g;
            handler.getClass();
            final int i = 0;
            Util.L(handler, new Runnable() { // from class: androidx.media3.exoplayer.drm.a
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            DefaultDrmSessionManager.PreacquiredSessionReference preacquiredSessionReference = (DefaultDrmSessionManager.PreacquiredSessionReference) this;
                            if (preacquiredSessionReference.f) {
                                return;
                            }
                            DrmSession drmSession = preacquiredSessionReference.e;
                            if (drmSession != null) {
                                drmSession.e(preacquiredSessionReference.d);
                            }
                            throw null;
                        default:
                            ((DefaultDrmSession) this).e(null);
                            return;
                    }
                }
            });
        }
    }

    public class ProvisioningManagerImpl implements DefaultDrmSession.ProvisioningManager {

        /* renamed from: a, reason: collision with root package name */
        public DefaultDrmSession f3077a;

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public final void a(Exception exc, boolean z) {
            this.f3077a = null;
            ImmutableList.o(null);
            throw null;
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public final void b() {
            this.f3077a = null;
            ImmutableList.o(null);
            throw null;
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public final void c(DefaultDrmSession defaultDrmSession) {
            throw null;
        }
    }

    public class ReferenceCountListenerImpl implements DefaultDrmSession.ReferenceCountListener {
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener
        public final void a(DefaultDrmSession defaultDrmSession) {
            if (0 != -9223372036854775807L) {
                throw null;
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener
        public final void b(DefaultDrmSession defaultDrmSession, int i) {
            if (i == 1) {
                throw null;
            }
            if (i != 0) {
                throw null;
            }
            throw null;
        }
    }

    public static boolean f(DrmSession drmSession) {
        DefaultDrmSession defaultDrmSession = (DefaultDrmSession) drmSession;
        defaultDrmSession.m();
        if (defaultDrmSession.o != 1) {
            return false;
        }
        DrmSession.DrmSessionException drmSessionExceptionC = defaultDrmSession.c();
        drmSessionExceptionC.getClass();
        Throwable cause = drmSessionExceptionC.getCause();
        return (cause instanceof ResourceBusyException) || DrmUtil.c(cause);
    }

    public static ArrayList g(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.g);
        for (int i = 0; i < drmInitData.g; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.d[i];
            if ((schemeData.a(uuid) || (C.c.equals(uuid) && schemeData.a(C.b))) && (schemeData.h != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final int a(Format format) {
        String str;
        h(false);
        ExoMediaDrm exoMediaDrm = this.c;
        exoMediaDrm.getClass();
        int i = exoMediaDrm.i();
        DrmInitData drmInitData = format.r;
        if (drmInitData == null) {
            MimeTypes.h(format.n);
            throw null;
        }
        if (!g(drmInitData, null, true).isEmpty()) {
            str = drmInitData.f;
            if (str != null || "cenc".equals(str) || (!"cbcs".equals(str) ? !("cbc1".equals(str) || "cens".equals(str)) : Util.f2928a >= 25)) {
                return i;
            }
        } else if (drmInitData.g == 1 && drmInitData.d[0].a(C.b)) {
            Log.g("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + ((Object) null));
            str = drmInitData.f;
            if (str != null) {
            }
            return i;
        }
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void b(Looper looper, PlayerId playerId) {
        synchronized (this) {
            try {
                Looper looper2 = this.f;
                if (looper2 == null) {
                    this.f = looper;
                    this.g = new Handler(looper);
                } else {
                    Assertions.f(looper2 == looper);
                    this.g.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.h = playerId;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final DrmSession c(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        h(false);
        Assertions.f(this.b > 0);
        Assertions.g(this.f);
        return e(this.f, eventDispatcher, format, true);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final DrmSessionManager.DrmSessionReference d(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        Assertions.f(this.b > 0);
        Assertions.g(this.f);
        PreacquiredSessionReference preacquiredSessionReference = new PreacquiredSessionReference(eventDispatcher);
        Handler handler = this.g;
        handler.getClass();
        handler.post(new c(3, preacquiredSessionReference, format));
        return preacquiredSessionReference;
    }

    public final DrmSession e(Looper looper, DrmSessionEventListener.EventDispatcher eventDispatcher, Format format, boolean z) {
        if (this.i == null) {
            this.i = new MediaDrmHandler(looper);
        }
        DrmInitData drmInitData = format.r;
        if (drmInitData == null) {
            MimeTypes.h(format.n);
            ExoMediaDrm exoMediaDrm = this.c;
            exoMediaDrm.getClass();
            if (exoMediaDrm.i() == 2 && FrameworkCryptoConfig.c) {
                return null;
            }
            throw null;
        }
        ArrayList arrayListG = g(drmInitData, null, false);
        if (arrayListG.isEmpty()) {
            MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException("Media does not support uuid: " + ((Object) null));
            Log.d("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
            if (eventDispatcher != null) {
                eventDispatcher.e(missingSchemeDataException);
            }
            return new ErrorStateDrmSession(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
        }
        DefaultDrmSession defaultDrmSession = this.e;
        if (defaultDrmSession != null) {
            defaultDrmSession.g(eventDispatcher);
            return defaultDrmSession;
        }
        this.c.getClass();
        ExoMediaDrm exoMediaDrm2 = this.c;
        Looper looper2 = this.f;
        looper2.getClass();
        PlayerId playerId = this.h;
        playerId.getClass();
        DefaultDrmSession defaultDrmSession2 = new DefaultDrmSession(null, exoMediaDrm2, null, null, arrayListG, false | false, false, null, null, null, looper2, null, playerId);
        defaultDrmSession2.g(eventDispatcher);
        if (0 != -9223372036854775807L) {
            defaultDrmSession2.g(null);
        }
        if (f(defaultDrmSession2)) {
            throw null;
        }
        if (f(defaultDrmSession2) && z) {
            throw null;
        }
        this.e = defaultDrmSession2;
        throw null;
    }

    public final void h(boolean z) {
        if (z && this.f == null) {
            Log.h("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            Log.h("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void p() {
        h(true);
        int i = this.b;
        this.b = i + 1;
        if (i != 0) {
            return;
        }
        this.c.getClass();
        if (0 != -9223372036854775807L) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void release() {
        h(true);
        int i = this.b - 1;
        this.b = i;
        if (i != 0) {
            return;
        }
        if (0 != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList((Collection) null);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((DefaultDrmSession) arrayList.get(i2)).e(null);
            }
        }
        UnmodifiableIterator it = ImmutableSet.q(null).iterator();
        while (it.hasNext()) {
            ((PreacquiredSessionReference) it.next()).release();
        }
        if (this.c != null && this.b == 0) {
            throw null;
        }
    }
}
