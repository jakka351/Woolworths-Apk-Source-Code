package androidx.media3.datasource;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
/* loaded from: classes2.dex */
public final class DataSourceUtil {
    public static void a(DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }
}
