package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.service.notification.StatusBarNotification;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import android.util.Base64;
import android.util.Log;
import androidx.browser.trusted.PackageIdentityUtils;
import androidx.core.app.NotificationManagerCompat;
import com.google.androidbrowserhelper.trusted.PrefUtils;
import com.google.androidbrowserhelper.trusted.SharedPreferencesTokenStore;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class TrustedWebActivityService extends Service {
    public NotificationManager d;
    public int e = -1;
    public final ITrustedWebActivityService.Stub f = new ITrustedWebActivityService.Stub() { // from class: androidx.browser.trusted.TrustedWebActivityService.1
        {
            attachInterface(this, ITrustedWebActivityService.Z2);
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle B(Bundle bundle) {
            Notification notificationBuild;
            h1();
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            String string = bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG");
            int i = bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID");
            Notification notification = (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION");
            String string2 = bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME");
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (trustedWebActivityService.d == null) {
                throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
            }
            boolean z = false;
            if (new NotificationManagerCompat(trustedWebActivityService).b.areNotificationsEnabled()) {
                String strA = TrustedWebActivityService.a(string2);
                NotificationManager notificationManager = trustedWebActivityService.d;
                notificationManager.createNotificationChannel(new NotificationChannel(strA, string2, 3));
                if (notificationManager.getNotificationChannel(strA).getImportance() == 0) {
                    notificationBuild = null;
                } else {
                    Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(trustedWebActivityService, notification);
                    builderRecoverBuilder.setChannelId(strA);
                    notificationBuild = builderRecoverBuilder.build();
                }
                NotificationChannel notificationChannel = trustedWebActivityService.d.getNotificationChannel(strA);
                if (notificationChannel == null || notificationChannel.getImportance() != 0) {
                    trustedWebActivityService.d.notify(string, i, notificationBuild);
                    z = true;
                }
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", z);
            return bundle2;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle J0() {
            h1();
            NotificationManager notificationManager = TrustedWebActivityService.this.d;
            if (notificationManager == null) {
                throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
            }
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", activeNotifications);
            return bundle;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final int U0() {
            h1();
            return TrustedWebActivityService.this.d();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle V0(Bundle bundle) {
            NotificationChannel notificationChannel;
            h1();
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            String string = bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME");
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (trustedWebActivityService.d == null) {
                throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
            }
            boolean z = false;
            if (new NotificationManagerCompat(trustedWebActivityService).b.areNotificationsEnabled() && ((notificationChannel = trustedWebActivityService.d.getNotificationChannel(TrustedWebActivityService.a(string))) == null || notificationChannel.getImportance() != 0)) {
                z = true;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", z);
            return bundle2;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final void W0(Bundle bundle) {
            h1();
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            String string = bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG");
            int i = bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID");
            NotificationManager notificationManager = TrustedWebActivityService.this.d;
            if (notificationManager == null) {
                throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
            }
            notificationManager.cancel(string, i);
        }

        public final void h1() {
            boolean zB;
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (trustedWebActivityService.e == -1) {
                String[] packagesForUid = trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                if (packagesForUid == null) {
                    packagesForUid = new String[0];
                }
                String string = PrefUtils.a(trustedWebActivityService.b().f14784a).getString("SharedPreferencesTokenStore.TOKEN", null);
                Token token = string != null ? new Token(new TokenContents(Base64.decode(string, 3))) : null;
                PackageManager packageManager = trustedWebActivityService.getPackageManager();
                if (token != null) {
                    int length = packagesForUid.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        try {
                            zB = new PackageIdentityUtils.Api28Implementation().b(packagesForUid[i], packageManager, token.f213a);
                        } catch (PackageManager.NameNotFoundException | IOException e) {
                            Log.e("PackageIdentity", "Could not check if package matches token.", e);
                            zB = false;
                        }
                        if (zB) {
                            trustedWebActivityService.e = Binder.getCallingUid();
                            break;
                        }
                        i++;
                    }
                }
            }
            if (trustedWebActivityService.e != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle j0(String str, Bundle bundle, IBinder iBinder) {
            h1();
            ITrustedWebActivityCallback iTrustedWebActivityCallbackH1 = iBinder == null ? null : ITrustedWebActivityCallback.Stub.h1(iBinder);
            return TrustedWebActivityService.this.c(str, bundle, iTrustedWebActivityCallbackH1 != null ? new TrustedWebActivityCallbackRemote(iTrustedWebActivityCallbackH1) : null);
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle r0() {
            h1();
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            int iD = trustedWebActivityService.d();
            Bundle bundle = new Bundle();
            if (iD == -1) {
                return bundle;
            }
            bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(trustedWebActivityService.getResources(), iD));
            return bundle;
        }
    };

    public static String a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    public abstract SharedPreferencesTokenStore b();

    public Bundle c(String str, Bundle bundle, TrustedWebActivityCallbackRemote trustedWebActivityCallbackRemote) {
        return null;
    }

    public final int d() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.d = (NotificationManager) getSystemService("notification");
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.e = -1;
        return super.onUnbind(intent);
    }
}
