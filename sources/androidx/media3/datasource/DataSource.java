package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.DataReader;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public interface DataSource extends DataReader {

    public interface Factory {
        DataSource a();
    }

    long a(DataSpec dataSpec);

    void close();

    default Map d() {
        return Collections.EMPTY_MAP;
    }

    void g(TransferListener transferListener);

    Uri getUri();
}
