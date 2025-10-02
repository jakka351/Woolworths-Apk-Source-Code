package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Route;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/ConnectionUser;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ConnectionUser {
    void a(RealConnection realConnection);

    void b(Route route, Protocol protocol);

    void c(HttpUrl httpUrl);

    void d(HttpUrl httpUrl, List list);

    void e(RealConnection realConnection);

    void f(RealConnection realConnection);

    boolean g();

    void h();

    RealConnection i();

    boolean isCanceled();

    void j(RealConnection realConnection);

    void k(Connection connection);

    void l(String str, List list);

    void m(Connection connection, Route route);

    void n(String str);

    void o(RealConnection realConnection);

    void p(Handshake handshake);

    void q(ConnectPlan connectPlan);

    void r(Route route, IOException iOException);

    Socket s();

    void t(RealConnection realConnection);

    void u(Route route);

    void v(Route route);

    void w(ConnectPlan connectPlan);
}
