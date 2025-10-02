package au.com.woolworths.android.onesite.notification;

import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.android.onesite.network.ApiService;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.shopapp.utils.RequestDisposableSingleObserver;
import io.reactivex.Single;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class WowNotificationManager {

    /* renamed from: a, reason: collision with root package name */
    public ApiService f4582a;
    public WeakHashMap b;
    public HashMap c;
    public NotificationResult.Notification d;

    /* renamed from: au.com.woolworths.android.onesite.notification.WowNotificationManager$2, reason: invalid class name */
    class AnonymousClass2 implements Comparator<NotificationResult.Notification> {
        @Override // java.util.Comparator
        public final int compare(NotificationResult.Notification notification, NotificationResult.Notification notification2) {
            NotificationResult.Notification notification3 = notification;
            NotificationResult.Notification notification4 = notification2;
            if (notification3.getContentType().equalsIgnoreCase("alert")) {
                return -1;
            }
            if (notification4.getContentType().equalsIgnoreCase("alert")) {
                return 1;
            }
            if (notification3.getContentType().equalsIgnoreCase(NotificationResult.Notification.CAMPAIGN)) {
                return -1;
            }
            if (notification4.getContentType().equalsIgnoreCase(NotificationResult.Notification.CAMPAIGN)) {
                return 1;
            }
            return notification3.getContentType().equalsIgnoreCase(NotificationResult.Notification.WARNING) ? -1 : 0;
        }
    }

    public interface NotificationListener {
        void S4(NotificationResult.Notification notification);
    }

    public class Progress {

        /* renamed from: a, reason: collision with root package name */
        public long f4583a;
        public boolean b;
    }

    public final void a(GenericNotificationRequestType genericNotificationRequestType) {
        HashMap map = this.c;
        Progress progress = (Progress) map.get(String.valueOf(0));
        if (progress == null) {
            map.put(String.valueOf(0), new Progress());
        } else if (progress.b || System.currentTimeMillis() - progress.f4583a < genericNotificationRequestType.b) {
            return;
        }
        ((Progress) map.get(String.valueOf(0))).b = true;
        String str = genericNotificationRequestType.f4580a;
        final String strValueOf = String.valueOf(0);
        ApiService apiService = this.f4582a;
        Single<NotificationResult> singleB = apiService.f4562a.b(str, "android_supermarkets", apiService.d.getDeviceId());
        SchedulersProvider schedulersProvider = apiService.e;
        singleB.h(schedulersProvider.d()).f(schedulersProvider.b()).a(new RequestDisposableSingleObserver<NotificationResult>(this) { // from class: au.com.woolworths.android.onesite.notification.WowNotificationManager.1
            public final /* synthetic */ WowNotificationManager f;

            {
                this.f = this;
            }

            @Override // au.com.woolworths.base.shopapp.utils.RequestDisposableSingleObserver, io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                ((Progress) this.f.c.get(strValueOf)).b = false;
            }

            @Override // au.com.woolworths.base.shopapp.utils.RequestDisposableSingleObserver, io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                NotificationResult notificationResult = (NotificationResult) obj;
                WowNotificationManager wowNotificationManager = this.f;
                String str2 = strValueOf;
                ((Progress) wowNotificationManager.c.get(str2)).b = false;
                if (notificationResult == null || notificationResult.getNotifications() == null) {
                    return;
                }
                ((Progress) wowNotificationManager.c.get(str2)).f4583a = System.currentTimeMillis();
                List<NotificationResult.Notification> notifications = notificationResult.getNotifications();
                if (notifications.isEmpty()) {
                    return;
                }
                Collections.sort(notifications, new AnonymousClass2());
                synchronized (wowNotificationManager) {
                    NotificationResult.Notification notification = notifications.get(0);
                    WeakHashMap weakHashMap = wowNotificationManager.b;
                    if (weakHashMap == null || weakHashMap.isEmpty()) {
                        wowNotificationManager.d = notification;
                    } else {
                        Iterator it = weakHashMap.keySet().iterator();
                        while (it.hasNext()) {
                            ((NotificationListener) it.next()).S4(notification);
                        }
                    }
                }
            }
        });
    }
}
