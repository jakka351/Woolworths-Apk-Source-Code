package androidx.core.app;

import YU.a;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static String d;
    public static SideChannelManager g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2405a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api23Impl {
    }

    @RequiresApi
    public static class Api24Impl {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api26Impl {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static NotificationChannel b(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        public static List c(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api28Impl {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api30Impl {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api34Impl {
    }

    /* loaded from: classes2.dex */
    public static class CancelTask implements Task {
        @Override // androidx.core.app.NotificationManagerCompat.Task
        public final void a(INotificationSideChannel iNotificationSideChannel) {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface InterruptionFilter {
    }

    /* loaded from: classes2.dex */
    public static class NotificationWithIdAndTag {
    }

    /* loaded from: classes2.dex */
    public static class NotifyTask implements Task {

        /* renamed from: a, reason: collision with root package name */
        public final String f2406a;
        public final int b;
        public final Notification c;

        public NotifyTask(String str, int i, Notification notification) {
            this.f2406a = str;
            this.b = i;
            this.c = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public final void a(INotificationSideChannel iNotificationSideChannel) {
            iNotificationSideChannel.Y(this.f2406a, this.b, "Medallia Digital Notifications Tag", this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
            sb.append(this.f2406a);
            sb.append(", id:");
            return a.m(sb, this.b, ", tag:Medallia Digital Notifications Tag]");
        }
    }

    /* loaded from: classes2.dex */
    public static class ServiceConnectedEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f2407a;
        public final IBinder b;

        public ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
            this.f2407a = componentName;
            this.b = iBinder;
        }
    }

    /* loaded from: classes2.dex */
    public static class SideChannelManager implements Handler.Callback, ServiceConnection {
        public final Context d;
        public final Handler e;
        public final HashMap f = new HashMap();
        public HashSet g = new HashSet();

        public static class ListenerRecord {

            /* renamed from: a, reason: collision with root package name */
            public final ComponentName f2408a;
            public INotificationSideChannel c;
            public boolean b = false;
            public final ArrayDeque d = new ArrayDeque();
            public int e = 0;

            public ListenerRecord(ComponentName componentName) {
                this.f2408a = componentName;
            }
        }

        public SideChannelManager(Context context) {
            this.d = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.e = new Handler(handlerThread.getLooper(), this);
        }

        public final void a(ListenerRecord listenerRecord) {
            boolean z;
            ArrayDeque arrayDeque = listenerRecord.d;
            ComponentName componentName = listenerRecord.f2408a;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            if (listenerRecord.b) {
                z = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.d;
                boolean zBindService = context.bindService(component, this, 33);
                listenerRecord.b = zBindService;
                if (zBindService) {
                    listenerRecord.e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z = listenerRecord.b;
            }
            if (!z || listenerRecord.c == null) {
                c(listenerRecord);
                return;
            }
            while (true) {
                Task task = (Task) arrayDeque.peek();
                if (task == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + task);
                    }
                    task.a(listenerRecord.c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + componentName);
                    }
                } catch (RemoteException e) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
                }
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            c(listenerRecord);
        }

        public final void b(NotifyTask notifyTask) {
            this.e.obtainMessage(0, notifyTask).sendToTarget();
        }

        public final void c(ListenerRecord listenerRecord) {
            ComponentName componentName = listenerRecord.f2408a;
            ArrayDeque arrayDeque = listenerRecord.d;
            Handler handler = this.e;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i = listenerRecord.e;
            int i2 = i + 1;
            listenerRecord.e = i2;
            if (i2 <= 6) {
                int i3 = (1 << i) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
                }
                handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + listenerRecord.e + " retries");
            arrayDeque.clear();
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            HashSet hashSet;
            int i = message.what;
            if (i == 0) {
                Task task = (Task) message.obj;
                Context context = this.d;
                Object obj = NotificationManagerCompat.c;
                String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
                synchronized (NotificationManagerCompat.c) {
                    if (string != null) {
                        try {
                            if (!string.equals(NotificationManagerCompat.d)) {
                                String[] strArrSplit = string.split(":", -1);
                                HashSet hashSet2 = new HashSet(strArrSplit.length);
                                for (String str : strArrSplit) {
                                    ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                    if (componentNameUnflattenFromString != null) {
                                        hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                    }
                                }
                                NotificationManagerCompat.e = hashSet2;
                                NotificationManagerCompat.d = string;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    hashSet = NotificationManagerCompat.e;
                }
                if (!hashSet.equals(this.g)) {
                    this.g = hashSet;
                    List<ResolveInfo> listQueryIntentServices = this.d.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet hashSet3 = new HashSet();
                    for (ResolveInfo resolveInfo : listQueryIntentServices) {
                        if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                            } else {
                                hashSet3.add(componentName);
                            }
                        }
                    }
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        ComponentName componentName2 = (ComponentName) it.next();
                        if (!this.f.containsKey(componentName2)) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                            }
                            this.f.put(componentName2, new ListenerRecord(componentName2));
                        }
                    }
                    Iterator it2 = this.f.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        if (!hashSet3.contains(entry.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                            }
                            ListenerRecord listenerRecord = (ListenerRecord) entry.getValue();
                            if (listenerRecord.b) {
                                this.d.unbindService(this);
                                listenerRecord.b = false;
                            }
                            listenerRecord.c = null;
                            it2.remove();
                        }
                    }
                }
                for (ListenerRecord listenerRecord2 : this.f.values()) {
                    listenerRecord2.d.add(task);
                    a(listenerRecord2);
                }
            } else if (i == 1) {
                ServiceConnectedEvent serviceConnectedEvent = (ServiceConnectedEvent) message.obj;
                ComponentName componentName3 = serviceConnectedEvent.f2407a;
                IBinder iBinder = serviceConnectedEvent.b;
                ListenerRecord listenerRecord3 = (ListenerRecord) this.f.get(componentName3);
                if (listenerRecord3 != null) {
                    listenerRecord3.c = INotificationSideChannel.Stub.h1(iBinder);
                    listenerRecord3.e = 0;
                    a(listenerRecord3);
                    return true;
                }
            } else if (i == 2) {
                ListenerRecord listenerRecord4 = (ListenerRecord) this.f.get((ComponentName) message.obj);
                if (listenerRecord4 != null) {
                    if (listenerRecord4.b) {
                        this.d.unbindService(this);
                        listenerRecord4.b = false;
                    }
                    listenerRecord4.c = null;
                    return true;
                }
            } else {
                if (i != 3) {
                    return false;
                }
                ListenerRecord listenerRecord5 = (ListenerRecord) this.f.get((ComponentName) message.obj);
                if (listenerRecord5 != null) {
                    a(listenerRecord5);
                    return true;
                }
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.e.obtainMessage(1, new ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.e.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* loaded from: classes2.dex */
    public interface Task {
        void a(INotificationSideChannel iNotificationSideChannel);
    }

    public NotificationManagerCompat(Context context) {
        this.f2405a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(NotificationChannel notificationChannel) {
        Api26Impl.a(this.b, notificationChannel);
    }

    public final NotificationChannel b(String str) {
        return Api26Impl.b(this.b, str);
    }

    public final List c() {
        return Api26Impl.c(this.b);
    }

    public final void d(int i, Notification notification) {
        NotificationManager notificationManager = this.b;
        Bundle bundleA = NotificationCompat.a(notification);
        if (bundleA == null || !bundleA.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify("Medallia Digital Notifications Tag", i, notification);
            return;
        }
        NotifyTask notifyTask = new NotifyTask(this.f2405a.getPackageName(), i, notification);
        synchronized (f) {
            try {
                if (g == null) {
                    g = new SideChannelManager(this.f2405a.getApplicationContext());
                }
                g.b(notifyTask);
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel("Medallia Digital Notifications Tag", i);
    }
}
