package androidx.appcompat.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class AppLocalesMetadataHolderService extends Service {
    public static final /* synthetic */ int d = 0;

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        public static int a() {
            return 512;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
