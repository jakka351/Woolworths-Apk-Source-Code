package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/SocketAdapter;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SocketAdapter {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
    }

    boolean a();

    boolean b(SSLSocket sSLSocket);

    String c(SSLSocket sSLSocket);

    void d(SSLSocket sSLSocket, String str, List list);
}
