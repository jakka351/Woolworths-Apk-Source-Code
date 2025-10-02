package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceInputStream;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.StatsDataSource;
import com.google.common.io.ByteStreams;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public final class DrmUtil {

    @RequiresApi
    public static final class Api23 {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorSource {
    }

    public static byte[] a(DataSource dataSource, String str, byte[] bArr, Map map) throws MediaDrmCallbackException {
        Map map2;
        List list;
        StatsDataSource statsDataSource = new StatsDataSource(dataSource);
        DataSpec.Builder builder = new DataSpec.Builder();
        builder.f2958a = Uri.parse(str);
        builder.e = map;
        builder.c = 2;
        builder.d = bArr;
        builder.i = 1;
        DataSpec dataSpecA = builder.a();
        int i = 0;
        int i2 = 0;
        DataSpec dataSpecA2 = dataSpecA;
        while (true) {
            try {
                DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(statsDataSource, dataSpecA2);
                try {
                    byte[] bArrC = ByteStreams.c(dataSourceInputStream);
                    Util.f(dataSourceInputStream);
                    return bArrC;
                } catch (HttpDataSource.InvalidResponseCodeException e) {
                    try {
                        int i3 = e.g;
                        String str2 = null;
                        if ((i3 == 307 || i3 == 308) && i2 < 5 && (map2 = e.h) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(i);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        i2++;
                        DataSpec.Builder builderA = dataSpecA2.a();
                        builderA.f2958a = Uri.parse(str2);
                        dataSpecA2 = builderA.a();
                        Util.f(dataSourceInputStream);
                    } catch (Throwable th) {
                        Util.f(dataSourceInputStream);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                throw new MediaDrmCallbackException(dataSpecA, statsDataSource.c, statsDataSource.f2970a.d(), statsDataSource.b, e2);
            }
        }
    }

    public static boolean b(Throwable th) {
        return Util.f2928a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean c(Throwable th) {
        return Util.f2928a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
