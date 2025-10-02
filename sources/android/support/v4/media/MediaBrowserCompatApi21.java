package android.support.v4.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.List;

@RequiresApi
/* loaded from: classes2.dex */
class MediaBrowserCompatApi21 {

    public interface ConnectionCallback {
    }

    public static class ConnectionCallbackProxy<T extends ConnectionCallback> extends MediaBrowser.ConnectionCallback {

        /* renamed from: a, reason: collision with root package name */
        public final MediaBrowserCompat.ConnectionCallback.StubApi21 f46a;

        public ConnectionCallbackProxy(MediaBrowserCompat.ConnectionCallback.StubApi21 stubApi21) {
            this.f46a = stubApi21;
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public final void onConnected() {
            MediaBrowserCompat.ConnectionCallback connectionCallback = MediaBrowserCompat.ConnectionCallback.this;
            MediaBrowserCompat.MediaBrowserImplApi21 mediaBrowserImplApi21 = connectionCallback.b;
            if (mediaBrowserImplApi21 != null) {
                MediaBrowserCompat.CallbackHandler callbackHandler = mediaBrowserImplApi21.d;
                MediaBrowser mediaBrowser = mediaBrowserImplApi21.b;
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        Bundle bundle = mediaBrowserImplApi21.c;
                        MediaBrowserCompat.ServiceBinderWrapper serviceBinderWrapper = new MediaBrowserCompat.ServiceBinderWrapper();
                        serviceBinderWrapper.f45a = new Messenger(binder);
                        serviceBinderWrapper.b = bundle;
                        mediaBrowserImplApi21.f = serviceBinderWrapper;
                        Messenger messenger = new Messenger(callbackHandler);
                        mediaBrowserImplApi21.g = messenger;
                        callbackHandler.getClass();
                        callbackHandler.b = new WeakReference(messenger);
                        try {
                            MediaBrowserCompat.ServiceBinderWrapper serviceBinderWrapper2 = mediaBrowserImplApi21.f;
                            Context context = mediaBrowserImplApi21.f43a;
                            Messenger messenger2 = mediaBrowserImplApi21.g;
                            serviceBinderWrapper2.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("data_package_name", context.getPackageName());
                            bundle2.putBundle("data_root_hints", serviceBinderWrapper2.b);
                            serviceBinderWrapper2.a(6, bundle2, messenger2);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IMediaSession iMediaSessionH1 = IMediaSession.Stub.h1(extras.getBinder("extra_session_binder"));
                    if (iMediaSessionH1 != null) {
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        mediaBrowserImplApi21.h = sessionToken != null ? new MediaSessionCompat.Token(sessionToken, iMediaSessionH1) : null;
                    }
                }
            }
            connectionCallback.a();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public final void onConnectionFailed() {
            MediaBrowserCompat.ConnectionCallback.this.b();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public final void onConnectionSuspended() {
            MediaBrowserCompat.ConnectionCallback connectionCallback = MediaBrowserCompat.ConnectionCallback.this;
            MediaBrowserCompat.MediaBrowserImplApi21 mediaBrowserImplApi21 = connectionCallback.b;
            if (mediaBrowserImplApi21 != null) {
                mediaBrowserImplApi21.f = null;
                mediaBrowserImplApi21.g = null;
                mediaBrowserImplApi21.h = null;
                MediaBrowserCompat.CallbackHandler callbackHandler = mediaBrowserImplApi21.d;
                callbackHandler.getClass();
                callbackHandler.b = new WeakReference(null);
            }
            connectionCallback.c();
        }
    }

    public static class MediaItem {
    }

    public interface SubscriptionCallback {
    }

    public static class SubscriptionCallbackProxy<T extends SubscriptionCallback> extends MediaBrowser.SubscriptionCallback {
        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public final void onChildrenLoaded(String str, List list) {
            throw null;
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public final void onError(String str) {
            throw null;
        }
    }
}
