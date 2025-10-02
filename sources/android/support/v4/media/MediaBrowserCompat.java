package android.support.v4.media;

import YU.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompatApi21;
import android.support.v4.media.MediaBrowserCompatApi23;
import android.support.v4.media.MediaBrowserCompatApi26;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class MediaBrowserCompat {
    public static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a, reason: collision with root package name */
    public final MediaBrowserImplApi26 f39a;

    public static class CallbackHandler extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f40a;
        public WeakReference b;

        public CallbackHandler(MediaBrowserImplApi21 mediaBrowserImplApi21) {
            this.f40a = new WeakReference(mediaBrowserImplApi21);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            WeakReference weakReference = this.b;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            WeakReference weakReference2 = this.f40a;
            if (weakReference2.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.a(data);
            MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl = (MediaBrowserServiceCallbackImpl) weakReference2.get();
            Messenger messenger = (Messenger) this.b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    MediaSessionCompat.a(data.getBundle("data_root_hints"));
                    mediaBrowserServiceCallbackImpl.c(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"));
                    return;
                }
                if (i == 2) {
                    mediaBrowserServiceCallbackImpl.b(messenger);
                    return;
                }
                if (i != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                    return;
                }
                MediaSessionCompat.a(data.getBundle("data_options"));
                MediaSessionCompat.a(data.getBundle("data_notify_children_changed_options"));
                String string = data.getString("data_media_item_id");
                data.getParcelableArrayList("data_media_item_list");
                mediaBrowserServiceCallbackImpl.a(messenger, string);
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    mediaBrowserServiceCallbackImpl.b(messenger);
                }
            }
        }
    }

    public static class ConnectionCallback {

        /* renamed from: a, reason: collision with root package name */
        public final Object f41a = new MediaBrowserCompatApi21.ConnectionCallbackProxy(new StubApi21());
        public MediaBrowserImplApi21 b;

        public interface ConnectionCallbackInternal {
        }

        public class StubApi21 implements MediaBrowserCompatApi21.ConnectionCallback {
            public StubApi21() {
            }
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }

    public static abstract class CustomActionCallback {
    }

    public static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i, Bundle bundle) {
        }
    }

    public static abstract class ItemCallback {

        public class StubApi23 implements MediaBrowserCompatApi23.ItemCallback {
        }
    }

    public static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                throw null;
            }
            throw null;
        }
    }

    public interface MediaBrowserImpl {
    }

    @RequiresApi
    public static class MediaBrowserImplApi21 implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl, ConnectionCallback.ConnectionCallbackInternal {

        /* renamed from: a, reason: collision with root package name */
        public final Context f43a;
        public final MediaBrowser b;
        public final Bundle c;
        public final CallbackHandler d = new CallbackHandler(this);
        public final ArrayMap e = new ArrayMap(0);
        public ServiceBinderWrapper f;
        public Messenger g;
        public MediaSessionCompat.Token h;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$2, reason: invalid class name */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$3, reason: invalid class name */
        class AnonymousClass3 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$4, reason: invalid class name */
        class AnonymousClass4 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$5, reason: invalid class name */
        class AnonymousClass5 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$6, reason: invalid class name */
        class AnonymousClass6 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$7, reason: invalid class name */
        class AnonymousClass7 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public MediaBrowserImplApi21(Context context, ComponentName componentName, ConnectionCallback connectionCallback) {
            this.f43a = context;
            Bundle bundle = new Bundle();
            this.c = bundle;
            bundle.putInt("extra_client_version", 1);
            connectionCallback.b = this;
            this.b = new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) connectionCallback.f41a, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public final void a(Messenger messenger, String str) {
            if (this.g != messenger) {
                return;
            }
            if (((Subscription) this.e.get(str)) != null) {
                throw null;
            }
            if (MediaBrowserCompat.b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public final void b(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public final void c(Messenger messenger, String str, MediaSessionCompat.Token token) {
        }
    }

    @RequiresApi
    public static class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {
    }

    @RequiresApi
    public static class MediaBrowserImplApi26 extends MediaBrowserImplApi23 {
    }

    public static class MediaBrowserImplBase implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f44a;
        public MediaServiceConnection b;
        public ServiceBinderWrapper c;
        public Messenger d;
        public String e;
        public MediaSessionCompat.Token f;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$2, reason: invalid class name */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$3, reason: invalid class name */
        class AnonymousClass3 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$4, reason: invalid class name */
        class AnonymousClass4 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$5, reason: invalid class name */
        class AnonymousClass5 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$6, reason: invalid class name */
        class AnonymousClass6 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public class MediaServiceConnection implements ServiceConnection {

            /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1, reason: invalid class name */
            class AnonymousClass1 implements Runnable {
                @Override // java.lang.Runnable
                public final void run() {
                    if (!MediaBrowserCompat.b) {
                        throw null;
                    }
                    Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceConnected name=" + ((Object) null) + " binder=" + ((Object) null));
                    throw null;
                }
            }

            /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2, reason: invalid class name */
            class AnonymousClass2 implements Runnable {
                @Override // java.lang.Runnable
                public final void run() {
                    if (!MediaBrowserCompat.b) {
                        throw null;
                    }
                    toString();
                    throw null;
                }
            }

            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Thread.currentThread();
                throw null;
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                Thread.currentThread();
                throw null;
            }
        }

        public static String d(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? a.d(i, "UNKNOWN/") : "CONNECT_STATE_SUSPENDED" : "CONNECT_STATE_CONNECTED" : "CONNECT_STATE_CONNECTING" : "CONNECT_STATE_DISCONNECTED" : "CONNECT_STATE_DISCONNECTING";
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public final void a(Messenger messenger, String str) {
            if (e(messenger, "onLoadChildren")) {
                if (MediaBrowserCompat.b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for null id=" + str);
                }
                throw null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public final void b(Messenger messenger) {
            Log.e("MediaBrowserCompat", "onConnectFailed for null");
            if (e(messenger, "onConnectFailed")) {
                if (this.f44a != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + d(this.f44a) + "... ignoring");
                    return;
                }
                if (this.b != null) {
                    throw null;
                }
                this.f44a = 1;
                this.b = null;
                this.c = null;
                this.d = null;
                throw null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public final void c(Messenger messenger, String str, MediaSessionCompat.Token token) {
            if (e(messenger, "onConnect")) {
                if (this.f44a != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + d(this.f44a) + "... ignoring");
                    return;
                }
                this.e = str;
                this.f = token;
                this.f44a = 3;
                if (MediaBrowserCompat.b) {
                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                    Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
                    Log.d("MediaBrowserCompat", "  mServiceComponent=null");
                    Log.d("MediaBrowserCompat", "  mCallback=null");
                    Log.d("MediaBrowserCompat", "  mRootHints=null");
                    Log.d("MediaBrowserCompat", "  mState=" + d(this.f44a));
                    Log.d("MediaBrowserCompat", "  mServiceConnection=" + this.b);
                    Log.d("MediaBrowserCompat", "  mServiceBinderWrapper=" + this.c);
                    Log.d("MediaBrowserCompat", "  mCallbacksMessenger=" + this.d);
                    Log.d("MediaBrowserCompat", "  mRootId=" + this.e);
                    Log.d("MediaBrowserCompat", "  mMediaSessionToken=" + this.f);
                }
                throw null;
            }
        }

        public final boolean e(Messenger messenger, String str) {
            int i;
            if (this.d == messenger && (i = this.f44a) != 0 && i != 1) {
                return true;
            }
            int i2 = this.f44a;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            StringBuilder sbT = a.t(str, " for null with mCallbacksMessenger=");
            sbT.append(this.d);
            sbT.append(" this=");
            sbT.append(this);
            Log.i("MediaBrowserCompat", sbT.toString());
            return false;
        }
    }

    public interface MediaBrowserServiceCallbackImpl {
        void a(Messenger messenger, String str);

        void b(Messenger messenger);

        void c(Messenger messenger, String str, MediaSessionCompat.Token token);
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new AnonymousClass1();
        public final int d;
        public final MediaDescriptionCompat e;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface Flags {
        }

        public MediaItem(Parcel parcel) {
            this.d = parcel.readInt();
            this.e = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaItem{mFlags=" + this.d + ", mDescription=" + this.e + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.d);
            this.e.writeToParcel(parcel, i);
        }
    }

    public static abstract class SearchCallback {
    }

    public static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i, Bundle bundle) {
            Parcelable[] parcelableArray;
            MediaSessionCompat.a(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("search_results") || (parcelableArray = bundle.getParcelableArray("search_results")) == null) {
                throw null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    public static class ServiceBinderWrapper {

        /* renamed from: a, reason: collision with root package name */
        public Messenger f45a;
        public Bundle b;

        public final void a(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.f45a.send(messageObtain);
        }
    }

    public static class Subscription {
    }

    public static abstract class SubscriptionCallback {

        public class StubApi21 implements MediaBrowserCompatApi21.SubscriptionCallback {
        }

        public class StubApi26 extends StubApi21 implements MediaBrowserCompatApi26.SubscriptionCallback {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback) {
        this.f39a = new MediaBrowserImplApi26(context, componentName, connectionCallback);
    }

    public final void a() {
        this.f39a.b.connect();
    }

    public final void b() {
        Messenger messenger;
        MediaBrowserImplApi26 mediaBrowserImplApi26 = this.f39a;
        ServiceBinderWrapper serviceBinderWrapper = mediaBrowserImplApi26.f;
        if (serviceBinderWrapper != null && (messenger = mediaBrowserImplApi26.g) != null) {
            try {
                serviceBinderWrapper.a(7, null, messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        mediaBrowserImplApi26.b.disconnect();
    }

    public final MediaSessionCompat.Token c() {
        MediaBrowserImplApi26 mediaBrowserImplApi26 = this.f39a;
        if (mediaBrowserImplApi26.h == null) {
            MediaSession.Token sessionToken = mediaBrowserImplApi26.b.getSessionToken();
            mediaBrowserImplApi26.h = sessionToken != null ? new MediaSessionCompat.Token(sessionToken, null) : null;
        }
        return mediaBrowserImplApi26.h;
    }
}
