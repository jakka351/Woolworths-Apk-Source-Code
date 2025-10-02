package androidx.media;

import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.media.MediaBrowserServiceCompatApi23;
import java.lang.reflect.Field;

@RequiresApi
/* loaded from: classes2.dex */
class MediaBrowserServiceCompatApi26 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f2838a;

    public static class MediaBrowserServiceAdaptor extends MediaBrowserServiceCompatApi23.MediaBrowserServiceAdaptor {
        @Override // android.service.media.MediaBrowserService
        public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            ServiceCompatProxy serviceCompatProxy = (ServiceCompatProxy) this.d;
            ResultWrapper resultWrapper = new ResultWrapper();
            resultWrapper.f2839a = result;
            serviceCompatProxy.b(str, resultWrapper);
        }
    }

    public static class ResultWrapper {

        /* renamed from: a, reason: collision with root package name */
        public MediaBrowserService.Result f2839a;
    }

    public interface ServiceCompatProxy extends MediaBrowserServiceCompatApi23.ServiceCompatProxy {
        void b(String str, ResultWrapper resultWrapper);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f2838a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.w("MBSCompatApi26", e);
        }
    }
}
