package androidx.media.session;

import YU.a;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes2.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    public static class MediaButtonConnectionCallback extends MediaBrowserCompat.ConnectionCallback {
        public final Context c;
        public final Intent d;
        public final BroadcastReceiver.PendingResult e;
        public MediaBrowserCompat f;

        public MediaButtonConnectionCallback(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent) {
            this.c = context;
            this.d = intent;
            this.e = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void a() {
            try {
                new MediaControllerCompat(this.c, this.f.c()).a((KeyEvent) this.d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException e) {
                Log.e("MediaButtonReceiver", "Failed to create a media controller", e);
            }
            this.f.b();
            this.e.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void b() {
            this.f.b();
            this.e.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void c() {
            this.f.b();
            this.e.finish();
        }
    }

    public static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sbU = a.u("Expected 1 service that handles ", str, ", found ");
        sbU.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbU.toString());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameA = a(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameA != null) {
            intent.setComponent(componentNameA);
            context.startForegroundService(intent);
            return;
        }
        ComponentName componentNameA2 = a(context, "android.media.browse.MediaBrowserService");
        if (componentNameA2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        MediaButtonConnectionCallback mediaButtonConnectionCallback = new MediaButtonConnectionCallback(pendingResultGoAsync, applicationContext, intent);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameA2, mediaButtonConnectionCallback);
        mediaButtonConnectionCallback.f = mediaBrowserCompat;
        mediaBrowserCompat.a();
    }
}
