package androidx.media3.exoplayer.offline;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.scheduler.Requirements;
import java.util.HashMap;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class DownloadService extends Service {
    public static final HashMap g = new HashMap();
    public DownloadManagerHelper d;
    public int e;
    public boolean f;

    public static final class DownloadManagerHelper implements DownloadManager.Listener {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadManager f3117a;
        public DownloadService b;

        public DownloadManagerHelper(Context context, DownloadManager downloadManager, Class cls) {
            this.f3117a = downloadManager;
            throw null;
        }
    }

    public final class ForegroundNotificationUpdater {
    }

    public abstract DownloadManager a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        Class<?> cls = getClass();
        DownloadManagerHelper downloadManagerHelper = (DownloadManagerHelper) g.get(cls);
        if (downloadManagerHelper != null) {
            this.d = downloadManagerHelper;
            Assertions.f(downloadManagerHelper.b == null);
            downloadManagerHelper.b = this;
        } else {
            int i = Util.f2928a;
            DownloadManager downloadManagerA = a();
            downloadManagerA.a(false);
            new DownloadManagerHelper(getApplicationContext(), downloadManagerA, cls);
            throw null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        DownloadManagerHelper downloadManagerHelper = this.d;
        downloadManagerHelper.getClass();
        Assertions.f(downloadManagerHelper.b == this);
        downloadManagerHelper.b = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action;
        String stringExtra;
        DownloadManager downloadManager;
        this.e = i2;
        this.f = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            if (!intent.getBooleanExtra("foreground", false)) {
                "androidx.media3.exoplayer.downloadService.action.RESTART".equals(action);
            }
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        downloadManager = this.d.f3117a;
        switch (action) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (!intent.hasExtra("stop_reason")) {
                    Log.c("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    intent.getIntExtra("stop_reason", 0);
                    downloadManager.f3116a++;
                    throw null;
                }
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    downloadManager.f3116a++;
                    throw null;
                }
                Log.c("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                downloadManager.a(false);
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                downloadManager.f3116a++;
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                if (((DownloadRequest) intent.getParcelableExtra("download_request")) != null) {
                    intent.getIntExtra("stop_reason", 0);
                    downloadManager.f3116a++;
                    throw null;
                }
                Log.c("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                break;
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                if (((Requirements) intent.getParcelableExtra("requirements")) != null) {
                    throw null;
                }
                Log.c("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                break;
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                downloadManager.a(true);
                break;
            default:
                Log.c("DownloadService", "Ignored unrecognized action: ".concat(action));
                break;
        }
        int i3 = Util.f2928a;
        if (downloadManager.f3116a == 0) {
            if (i3 < 28 && this.f) {
                stopSelf();
                return 1;
            }
            stopSelfResult(this.e);
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.f = true;
    }
}
