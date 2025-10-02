package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public interface ExtractorsFactory {
    default Extractor[] b(Uri uri, Map map) {
        return c();
    }

    Extractor[] c();
}
