package androidx.media3.datasource;

import android.util.Base64;
import androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Supplier {
    public final /* synthetic */ int d;

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.d) {
            case 0:
                Supplier supplier = DataSourceBitmapLoader.b;
                return MoreExecutors.b(Executors.newSingleThreadExecutor());
            default:
                byte[] bArr = new byte[12];
                DefaultPlaybackSessionManager.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
