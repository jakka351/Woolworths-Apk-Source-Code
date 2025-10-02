package androidx.media3.datasource;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public interface HttpDataSource extends DataSource {

    @UnstableApi
    public static abstract class BaseFactory implements Factory {
        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        public final DataSource a() {
            return b();
        }

        public abstract HttpDataSource b();

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        public final HttpDataSource a() {
            return b();
        }
    }

    public static final class CleartextNotPermittedException extends HttpDataSourceException {
    }

    public interface Factory extends DataSource.Factory {
        @Override // androidx.media3.datasource.DataSource.Factory
        HttpDataSource a();
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final int g;
        public final Map h;

        public InvalidResponseCodeException(int i, DataSourceException dataSourceException, Map map) {
            super(2004, dataSourceException, YU.a.d(i, "Response code: "));
            this.g = i;
            this.h = map;
        }
    }

    @UnstableApi
    public static final class RequestProperties {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f2963a = new HashMap();
        public Map b;

        public final synchronized Map a() {
            try {
                if (this.b == null) {
                    this.b = Collections.unmodifiableMap(new HashMap(this.f2963a));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.b;
        }
    }

    public static class HttpDataSourceException extends DataSourceException {
        public final int f;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public HttpDataSourceException() {
            super(2008);
            this.f = 1;
        }

        public static HttpDataSourceException a(IOException iOException, int i) {
            String message = iOException.getMessage();
            int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : (message == null || !Ascii.b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            return i2 == 2007 ? new CleartextNotPermittedException(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted") : new HttpDataSourceException(iOException, i2, i);
        }

        public HttpDataSourceException(String str, int i) {
            super(str, i == 2000 ? 2001 : i);
            this.f = 1;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public HttpDataSourceException(IOException iOException, int i, int i2) {
            if (i == 2000 && i2 == 1) {
                i = 2001;
            }
            super(iOException, i);
            this.f = i2;
        }

        public HttpDataSourceException(int i, IOException iOException, String str) {
            super(i == 2000 ? 2001 : i, iOException, str);
            this.f = 1;
        }
    }
}
