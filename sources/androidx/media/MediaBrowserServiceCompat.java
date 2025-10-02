package androidx.media;

import YU.a;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.util.Pair;
import androidx.media.MediaBrowserServiceCompatApi21;
import androidx.media.MediaBrowserServiceCompatApi23;
import androidx.media.MediaBrowserServiceCompatApi26;
import androidx.media.MediaSessionManagerImplApi28;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    public static final boolean g = Log.isLoggable("MBServiceCompat", 3);
    public MediaBrowserServiceImplApi28 d;
    public final ArrayMap e = new ArrayMap(0);
    public final ServiceHandler f = new ServiceHandler(this);

    public static final class BrowserRoot {
    }

    public class ConnectionRecord implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        public final String f2830a;
        public final ServiceCallbacks b;
        public final HashMap c = new HashMap();

        public ConnectionRecord(String str, int i, int i2, ServiceCallbacksCompat serviceCallbacksCompat) {
            this.f2830a = str;
            new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(str, i, i2);
            this.b = serviceCallbacksCompat;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            MediaBrowserServiceCompat.this.f.post(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ConnectionRecord.1
                @Override // java.lang.Runnable
                public final void run() {
                    ConnectionRecord connectionRecord = ConnectionRecord.this;
                    MediaBrowserServiceCompat.this.e.remove(connectionRecord.b.asBinder());
                }
            });
        }
    }

    public interface MediaBrowserServiceImpl {
    }

    @RequiresApi
    public class MediaBrowserServiceImplApi21 implements MediaBrowserServiceImpl, MediaBrowserServiceCompatApi21.ServiceCompatProxy {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f2831a = new ArrayList();
        public Object b;
        public Messenger c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2, reason: invalid class name */
        class AnonymousClass2 extends Result<List<MediaBrowserCompat.MediaItem>> {
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public final void b() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3, reason: invalid class name */
        class AnonymousClass3 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4, reason: invalid class name */
        class AnonymousClass4 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public MediaBrowserServiceImplApi21() {
        }
    }

    @RequiresApi
    public class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 implements MediaBrowserServiceCompatApi23.ServiceCompatProxy {
        @Override // androidx.media.MediaBrowserServiceCompatApi23.ServiceCompatProxy
        public final void a(String str, final MediaBrowserServiceCompatApi21.ResultWrapper resultWrapper) {
            Result<MediaBrowserCompat.MediaItem> result = new Result<MediaBrowserCompat.MediaItem>(str) { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.1
                @Override // androidx.media.MediaBrowserServiceCompat.Result
                public final void b() {
                    resultWrapper.f2837a.sendResult(null);
                }
            };
            result.d = 2;
            result.c();
        }
    }

    @RequiresApi
    public class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 implements MediaBrowserServiceCompatApi26.ServiceCompatProxy {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$1, reason: invalid class name */
        class AnonymousClass1 extends Result<List<MediaBrowserCompat.MediaItem>> {
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public final void b() {
                throw null;
            }
        }

        public MediaBrowserServiceImplApi26() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi26.ServiceCompatProxy
        public final void b(String str, MediaBrowserServiceCompatApi26.ResultWrapper resultWrapper) {
            MediaBrowserServiceCompat.this.b();
        }
    }

    @RequiresApi
    public class MediaBrowserServiceImplApi28 extends MediaBrowserServiceImplApi26 {
    }

    public class MediaBrowserServiceImplBase implements MediaBrowserServiceImpl {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2, reason: invalid class name */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$3, reason: invalid class name */
        class AnonymousClass3 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }
    }

    public static class Result<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2832a;
        public boolean b;
        public boolean c;
        public int d;

        public Result(Object obj) {
            this.f2832a = obj;
        }

        public final boolean a() {
            return this.b || this.c;
        }

        public void b() {
        }

        public final void c() {
            if (this.b || this.c) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f2832a);
            }
            this.b = true;
            b();
        }
    }

    public class ServiceBinderImpl {
        public ServiceBinderImpl() {
        }
    }

    public interface ServiceCallbacks {
        void a(Bundle bundle, String str, List list);

        IBinder asBinder();
    }

    public static class ServiceCallbacksCompat implements ServiceCallbacks {

        /* renamed from: a, reason: collision with root package name */
        public final Messenger f2834a;

        public ServiceCallbacksCompat(Messenger messenger) {
            this.f2834a = messenger;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public final void a(Bundle bundle, String str, List list) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            bundle2.putBundle("data_notify_children_changed_options", null);
            if (list != null) {
                bundle2.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            b(3, bundle2);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public final IBinder asBinder() {
            return this.f2834a.getBinder();
        }

        public final void b(int i, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 2;
            messageObtain.setData(bundle);
            this.f2834a.send(messageObtain);
        }
    }

    public final class ServiceHandler extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final ServiceBinderImpl f2835a;

        public ServiceHandler(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f2835a = mediaBrowserServiceCompat.new ServiceBinderImpl();
        }

        public final void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data = message.getData();
            int i = message.what;
            final ServiceBinderImpl serviceBinderImpl = this.f2835a;
            switch (i) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    String string = data.getString("data_package_name");
                    int i2 = data.getInt("data_calling_pid");
                    int i3 = data.getInt("data_calling_uid");
                    ServiceCallbacksCompat serviceCallbacksCompat = new ServiceCallbacksCompat(message.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                    if (string != null) {
                        for (String str : mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i3)) {
                            if (str.equals(string)) {
                                mediaBrowserServiceCompat.f.a(new Runnable(serviceCallbacksCompat, string, i2, i3, bundle) { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.1
                                    public final /* synthetic */ ServiceCallbacksCompat d;
                                    public final /* synthetic */ String e;
                                    public final /* synthetic */ int f;
                                    public final /* synthetic */ int g;

                                    @Override // java.lang.Runnable
                                    public final void run() throws RemoteException {
                                        ServiceCallbacksCompat serviceCallbacksCompat2 = this.d;
                                        IBinder binder = serviceCallbacksCompat2.f2834a.getBinder();
                                        ServiceBinderImpl serviceBinderImpl2 = ServiceBinderImpl.this;
                                        MediaBrowserServiceCompat.this.e.remove(binder);
                                        MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                                        int i4 = this.f;
                                        int i5 = this.g;
                                        String str2 = this.e;
                                        ConnectionRecord connectionRecord = mediaBrowserServiceCompat2.new ConnectionRecord(str2, i4, i5, serviceCallbacksCompat2);
                                        if (mediaBrowserServiceCompat2.a() != null) {
                                            try {
                                                mediaBrowserServiceCompat2.e.put(binder, connectionRecord);
                                                binder.linkToDeath(connectionRecord, 0);
                                                return;
                                            } catch (RemoteException unused) {
                                                Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat(str2));
                                                mediaBrowserServiceCompat2.e.remove(binder);
                                                return;
                                            }
                                        }
                                        StringBuilder sbU = a.u("No root for client ", str2, " from service ");
                                        sbU.append(getClass().getName());
                                        Log.i("MBServiceCompat", sbU.toString());
                                        try {
                                            serviceCallbacksCompat2.b(2, null);
                                        } catch (RemoteException unused2) {
                                            Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat(str2));
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + string);
                case 2:
                    final ServiceCallbacksCompat serviceCallbacksCompat2 = new ServiceCallbacksCompat(message.replyTo);
                    MediaBrowserServiceCompat.this.f.a(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.e.remove(serviceCallbacksCompat2.f2834a.getBinder());
                            if (connectionRecord != null) {
                                connectionRecord.b.asBinder().unlinkToDeath(connectionRecord, 0);
                            }
                        }
                    });
                    return;
                case 3:
                    final Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    final String string2 = data.getString("data_media_item_id");
                    final IBinder binder = data.getBinder("data_callback_token");
                    final ServiceCallbacksCompat serviceCallbacksCompat3 = new ServiceCallbacksCompat(message.replyTo);
                    MediaBrowserServiceCompat.this.f.a(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            IBinder binder2 = serviceCallbacksCompat3.f2834a.getBinder();
                            ServiceBinderImpl serviceBinderImpl2 = ServiceBinderImpl.this;
                            final ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.e.get(binder2);
                            final String str2 = string2;
                            if (connectionRecord == null) {
                                Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + str2);
                                return;
                            }
                            HashMap map = connectionRecord.c;
                            final MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                            List arrayList = (List) map.get(str2);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            Iterator it = arrayList.iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                IBinder iBinder = binder;
                                final Bundle bundle3 = bundle2;
                                if (!zHasNext) {
                                    arrayList.add(new Pair(iBinder, bundle3));
                                    map.put(str2, arrayList);
                                    Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str2) { // from class: androidx.media.MediaBrowserServiceCompat.1
                                        @Override // androidx.media.MediaBrowserServiceCompat.Result
                                        public final void b() {
                                            Bundle bundle4 = bundle3;
                                            ArrayMap arrayMap = MediaBrowserServiceCompat.this.e;
                                            ConnectionRecord connectionRecord2 = connectionRecord;
                                            ServiceCallbacks serviceCallbacks = connectionRecord2.b;
                                            String str3 = connectionRecord2.f2830a;
                                            Object obj = arrayMap.get(serviceCallbacks.asBinder());
                                            String str4 = str2;
                                            if (obj != connectionRecord2) {
                                                if (MediaBrowserServiceCompat.g) {
                                                    Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str3 + " id=" + str4);
                                                    return;
                                                }
                                                return;
                                            }
                                            try {
                                                serviceCallbacks.a(bundle4, str4, null);
                                            } catch (RemoteException unused) {
                                                Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str4 + " package=" + str3);
                                            }
                                        }
                                    };
                                    if (bundle3 == null) {
                                        mediaBrowserServiceCompat2.b();
                                    } else {
                                        result.d = 1;
                                        mediaBrowserServiceCompat2.b();
                                    }
                                    if (!result.a()) {
                                        throw new IllegalStateException(a.p(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), connectionRecord.f2830a, " id=", str2));
                                    }
                                    return;
                                }
                                Pair pair = (Pair) it.next();
                                if (iBinder == pair.f2463a) {
                                    Bundle bundle4 = (Bundle) pair.b;
                                    if (bundle3 == bundle4) {
                                        return;
                                    }
                                    if (bundle3 == null) {
                                        if (bundle4.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle4.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                            return;
                                        }
                                    } else if (bundle4 == null) {
                                        if (bundle3.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                            return;
                                        }
                                    } else if (bundle3.getInt("android.media.browse.extra.PAGE", -1) == bundle4.getInt("android.media.browse.extra.PAGE", -1) && bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle4.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                                        return;
                                    }
                                }
                            }
                        }
                    });
                    return;
                case 4:
                    final String string3 = data.getString("data_media_item_id");
                    final IBinder binder2 = data.getBinder("data_callback_token");
                    final ServiceCallbacksCompat serviceCallbacksCompat4 = new ServiceCallbacksCompat(message.replyTo);
                    MediaBrowserServiceCompat.this.f.a(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.e.get(serviceCallbacksCompat4.f2834a.getBinder());
                            String str2 = string3;
                            if (connectionRecord == null) {
                                Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str2);
                                return;
                            }
                            HashMap map = connectionRecord.c;
                            IBinder iBinder = binder2;
                            boolean z = false;
                            if (iBinder != null) {
                                List list = (List) map.get(str2);
                                if (list != null) {
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        if (iBinder == ((Pair) it.next()).f2463a) {
                                            it.remove();
                                            z = true;
                                        }
                                    }
                                    if (list.size() == 0) {
                                        map.remove(str2);
                                    }
                                }
                            } else if (map.remove(str2) != null) {
                                z = true;
                            }
                            if (z) {
                                return;
                            }
                            Log.w("MBServiceCompat", "removeSubscription called for " + str2 + " which is not subscribed");
                        }
                    });
                    return;
                case 5:
                    final String string4 = data.getString("data_media_item_id");
                    final ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    final ServiceCallbacksCompat serviceCallbacksCompat5 = new ServiceCallbacksCompat(message.replyTo);
                    serviceBinderImpl.getClass();
                    if (TextUtils.isEmpty(string4) || resultReceiver == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f.a(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.e.get(serviceCallbacksCompat5.f2834a.getBinder());
                            String str2 = string4;
                            if (connectionRecord == null) {
                                Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + str2);
                            } else {
                                final ResultReceiver resultReceiver2 = resultReceiver;
                                Result<MediaBrowserCompat.MediaItem> result = new Result<MediaBrowserCompat.MediaItem>(str2) { // from class: androidx.media.MediaBrowserServiceCompat.2
                                    @Override // androidx.media.MediaBrowserServiceCompat.Result
                                    public final void b() {
                                        int i4 = this.d & 2;
                                        ResultReceiver resultReceiver3 = resultReceiver2;
                                        if (i4 != 0) {
                                            resultReceiver3.b(-1, null);
                                            return;
                                        }
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putParcelable("media_item", null);
                                        resultReceiver3.b(0, bundle3);
                                    }
                                };
                                result.d = 2;
                                result.c();
                                if (!result.a()) {
                                    throw new IllegalStateException(a.A("onLoadItem must call detach() or sendResult() before returning for id=", str2));
                                }
                            }
                        }
                    });
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle3);
                    MediaBrowserServiceCompat.this.f.a(new Runnable(new ServiceCallbacksCompat(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3) { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.6
                        public final /* synthetic */ ServiceCallbacksCompat d;
                        public final /* synthetic */ String e;
                        public final /* synthetic */ int f;
                        public final /* synthetic */ int g;

                        @Override // java.lang.Runnable
                        public final void run() throws RemoteException {
                            ServiceCallbacksCompat serviceCallbacksCompat6 = this.d;
                            IBinder binder3 = serviceCallbacksCompat6.f2834a.getBinder();
                            ServiceBinderImpl serviceBinderImpl2 = ServiceBinderImpl.this;
                            MediaBrowserServiceCompat.this.e.remove(binder3);
                            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                            ConnectionRecord connectionRecord = mediaBrowserServiceCompat2.new ConnectionRecord(this.e, this.f, this.g, serviceCallbacksCompat6);
                            mediaBrowserServiceCompat2.e.put(binder3, connectionRecord);
                            try {
                                binder3.linkToDeath(connectionRecord, 0);
                            } catch (RemoteException unused) {
                                Log.w("MBServiceCompat", "IBinder is already dead.");
                            }
                        }
                    });
                    return;
                case 7:
                    final ServiceCallbacksCompat serviceCallbacksCompat6 = new ServiceCallbacksCompat(message.replyTo);
                    MediaBrowserServiceCompat.this.f.a(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.7
                        @Override // java.lang.Runnable
                        public final void run() {
                            IBinder binder3 = serviceCallbacksCompat6.f2834a.getBinder();
                            ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.e.remove(binder3);
                            if (connectionRecord != null) {
                                binder3.unlinkToDeath(connectionRecord, 0);
                            }
                        }
                    });
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.a(bundle4);
                    String string5 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    ServiceCallbacksCompat serviceCallbacksCompat7 = new ServiceCallbacksCompat(message.replyTo);
                    serviceBinderImpl.getClass();
                    if (TextUtils.isEmpty(string5) || resultReceiver2 == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f.a(new Runnable(serviceCallbacksCompat7, string5, bundle4, resultReceiver2) { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.8
                        public final /* synthetic */ ServiceCallbacksCompat d;
                        public final /* synthetic */ String e;
                        public final /* synthetic */ ResultReceiver f;

                        {
                            this.f = resultReceiver2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.e.get(this.d.f2834a.getBinder());
                            String str2 = this.e;
                            if (connectionRecord == null) {
                                Log.w("MBServiceCompat", "search for callback that isn't registered query=" + str2);
                            } else {
                                final ResultReceiver resultReceiver3 = this.f;
                                Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str2) { // from class: androidx.media.MediaBrowserServiceCompat.3
                                    @Override // androidx.media.MediaBrowserServiceCompat.Result
                                    public final void b() {
                                        resultReceiver3.b(-1, null);
                                    }
                                };
                                result.d = 4;
                                result.c();
                                if (!result.a()) {
                                    throw new IllegalStateException(a.A("onSearch must call detach() or sendResult() before returning for query=", str2));
                                }
                            }
                        }
                    });
                    return;
                case 9:
                    final Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.a(bundle5);
                    final String string6 = data.getString("data_custom_action");
                    final ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    final ServiceCallbacksCompat serviceCallbacksCompat8 = new ServiceCallbacksCompat(message.replyTo);
                    serviceBinderImpl.getClass();
                    if (TextUtils.isEmpty(string6) || resultReceiver3 == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f.a(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.9
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.e.get(serviceCallbacksCompat8.f2834a.getBinder());
                            Bundle bundle6 = bundle5;
                            String str2 = string6;
                            if (connectionRecord == null) {
                                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + str2 + ", extras=" + bundle6);
                                return;
                            }
                            final ResultReceiver resultReceiver4 = resultReceiver3;
                            Result<Bundle> result = new Result<Bundle>(str2) { // from class: androidx.media.MediaBrowserServiceCompat.4
                                @Override // androidx.media.MediaBrowserServiceCompat.Result
                                public final void b() {
                                    resultReceiver4.b(0, null);
                                }
                            };
                            if (result.b || result.c) {
                                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + ((Object) str2));
                            }
                            result.c = true;
                            resultReceiver4.b(-1, null);
                            if (result.a()) {
                                return;
                            }
                            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str2 + " extras=" + bundle6);
                        }
                    });
                    return;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    return;
            }
        }

        @Override // android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    public abstract BrowserRoot a();

    public abstract void b();

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return ((MediaBrowserService) this.d.b).onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        MediaBrowserServiceImplApi28 mediaBrowserServiceImplApi28 = new MediaBrowserServiceImplApi28();
        this.d = mediaBrowserServiceImplApi28;
        Field field = MediaBrowserServiceCompatApi26.f2838a;
        MediaBrowserServiceCompatApi26.MediaBrowserServiceAdaptor mediaBrowserServiceAdaptor = new MediaBrowserServiceCompatApi26.MediaBrowserServiceAdaptor(this, mediaBrowserServiceImplApi28);
        mediaBrowserServiceImplApi28.b = mediaBrowserServiceAdaptor;
        mediaBrowserServiceAdaptor.onCreate();
    }
}
