package androidx.media;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RequiresApi;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat.ConnectionRecord;

@RequiresApi
/* loaded from: classes2.dex */
class MediaBrowserServiceCompatApi21 {

    public static class BrowserRoot {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f2836a;

        public BrowserRoot(Bundle bundle) {
            this.f2836a = bundle;
        }
    }

    public static class MediaBrowserServiceAdaptor extends MediaBrowserService {
        public final ServiceCompatProxy d;

        public MediaBrowserServiceAdaptor(Context context, ServiceCompatProxy serviceCompatProxy) {
            attachBaseContext(context);
            this.d = serviceCompatProxy;
        }

        @Override // android.service.media.MediaBrowserService
        public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            Bundle bundle2;
            BrowserRoot browserRoot;
            MediaSessionCompat.a(bundle);
            Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
            MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 mediaBrowserServiceImplApi21 = (MediaBrowserServiceCompat.MediaBrowserServiceImplApi21) this.d;
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
            } else {
                bundle3.remove("extra_client_version");
                mediaBrowserServiceImplApi21.c = new Messenger(mediaBrowserServiceCompat.f);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                bundle2.putBinder("extra_messenger", mediaBrowserServiceImplApi21.c.getBinder());
                mediaBrowserServiceImplApi21.f2831a.add(bundle2);
            }
            mediaBrowserServiceCompat.new ConnectionRecord(str, -1, i, null);
            if (mediaBrowserServiceCompat.a() == null) {
                browserRoot = null;
            } else {
                if (bundle2 == null) {
                    bundle2 = null;
                }
                browserRoot = new BrowserRoot(bundle2);
            }
            if (browserRoot == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(null, browserRoot.f2836a);
        }

        @Override // android.service.media.MediaBrowserService
        public final void onLoadChildren(String str, MediaBrowserService.Result result) {
            MediaBrowserServiceCompat.this.b();
        }
    }

    public static class ResultWrapper<T> {

        /* renamed from: a, reason: collision with root package name */
        public final MediaBrowserService.Result f2837a;

        public ResultWrapper(MediaBrowserService.Result result) {
            this.f2837a = result;
        }
    }

    public interface ServiceCompatProxy {
    }
}
