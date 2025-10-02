package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaControllerCompatApi21;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.RequiresApi;
import androidx.core.app.ComponentActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class MediaControllerCompat {

    /* renamed from: a, reason: collision with root package name */
    public final MediaControllerImplApi24 f48a;

    public static abstract class Callback implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        public IMediaControllerCallback f49a;

        public class MessageHandler extends Handler {
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
            }
        }

        public static class StubApi21 implements MediaControllerCompatApi21.Callback {
        }

        public static class StubCompat extends IMediaControllerCallback.Stub {
            public final WeakReference d;

            public StubCompat(Callback callback) {
                attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
                this.d = new WeakReference(callback);
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void C0() {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void W() {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void a1() {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void d0() {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void l0() {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void m() {
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
        }
    }

    public static class MediaControllerExtraData extends ComponentActivity.ExtraData {
    }

    public interface MediaControllerImpl {
    }

    @RequiresApi
    public static class MediaControllerImplApi21 implements MediaControllerImpl {

        /* renamed from: a, reason: collision with root package name */
        public final MediaController f50a;
        public final Object b = new Object();
        public final ArrayList c = new ArrayList();
        public final HashMap d = new HashMap();
        public final MediaSessionCompat.Token e;

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            public WeakReference d;

            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.d.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.b) {
                    mediaControllerImplApi21.e.e = IMediaSession.Stub.h1(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER"));
                    MediaSessionCompat.Token token = mediaControllerImplApi21.e;
                    bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                    token.getClass();
                    mediaControllerImplApi21.a();
                }
            }
        }

        public static class ExtraCallback extends Callback.StubCompat {
            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public final void C0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public final void W() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public final void a1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public final void d0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public final void l0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public final void m() {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.d);
            this.f50a = mediaController;
            if (token.e == null) {
                ExtraBinderRequestResultReceiver extraBinderRequestResultReceiver = new ExtraBinderRequestResultReceiver(null);
                extraBinderRequestResultReceiver.d = new WeakReference(this);
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, extraBinderRequestResultReceiver);
            }
        }

        public final void a() {
            MediaSessionCompat.Token token = this.e;
            if (token.e == null) {
                return;
            }
            ArrayList arrayList = this.c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Callback callback = (Callback) it.next();
                ExtraCallback extraCallback = new ExtraCallback(callback);
                this.d.put(callback, extraCallback);
                callback.f49a = extraCallback;
                try {
                    token.e.H(extraCallback);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            arrayList.clear();
        }
    }

    @RequiresApi
    public static class MediaControllerImplApi23 extends MediaControllerImplApi21 {
    }

    @RequiresApi
    public static class MediaControllerImplApi24 extends MediaControllerImplApi23 {
    }

    public static class MediaControllerImplBase implements MediaControllerImpl {
    }

    public static final class PlaybackInfo {
    }

    public static abstract class TransportControls {
    }

    public static class TransportControlsApi21 extends TransportControls {
    }

    @RequiresApi
    public static class TransportControlsApi23 extends TransportControlsApi21 {
    }

    @RequiresApi
    public static class TransportControlsApi24 extends TransportControlsApi23 {
    }

    public static class TransportControlsBase extends TransportControls {
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        new HashSet();
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f48a = new MediaControllerImplApi24(context, token);
    }

    public final void a(KeyEvent keyEvent) {
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        this.f48a.f50a.dispatchMediaButtonEvent(keyEvent);
    }
}
