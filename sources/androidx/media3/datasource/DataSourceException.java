package androidx.media3.datasource;

import java.io.IOException;

/* loaded from: classes2.dex */
public class DataSourceException extends IOException {
    public static final /* synthetic */ int e = 0;
    public final int d;

    public DataSourceException(int i) {
        this.d = i;
    }

    public DataSourceException(Exception exc, int i) {
        super(exc);
        this.d = i;
    }

    public DataSourceException(String str, int i) {
        super(str);
        this.d = i;
    }

    public DataSourceException(int i, Exception exc, String str) {
        super(str, exc);
        this.d = i;
    }
}
