package okhttp3;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.ConnectionListener;
import okhttp3.internal.connection.ConnectionUser;
import okhttp3.internal.connection.FastFallbackExchangeFinder;
import okhttp3.internal.connection.ForceConnectRoutePlanner;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RealRoutePlanner;
import okhttp3.internal.connection.RouteDatabase;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/ConnectionPool;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConnectionPool {

    /* renamed from: a, reason: collision with root package name */
    public final RealConnectionPool f26670a;

    /* JADX WARN: Type inference failed for: r2v5, types: [okhttp3.a] */
    public ConnectionPool(TaskRunner taskRunner, ConnectionListener connectionListener, int i, int i2, int i3, int i4, boolean z, boolean z2, RouteDatabase routeDatabase, int i5) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        final TaskRunner taskRunner2 = (i5 & 8) != 0 ? TaskRunner.o : taskRunner;
        if ((i5 & 16) != 0) {
            ConnectionListener.f26712a.getClass();
            connectionListener = ConnectionListener.b;
        }
        int i6 = i5 & 32;
        int i7 = ModuleDescriptor.MODULE_VERSION;
        final int i8 = i6 != 0 ? 10000 : i;
        final int i9 = (i5 & 64) != 0 ? 10000 : i2;
        final int i10 = (i5 & 128) != 0 ? 10000 : i3;
        final int i11 = (i5 & 256) != 0 ? 10000 : i4;
        final int i12 = (i5 & 512) == 0 ? 0 : i7;
        final boolean z3 = (i5 & 1024) != 0 ? true : z;
        final boolean z4 = (i5 & 2048) != 0 ? true : z2;
        final RouteDatabase routeDatabase2 = (i5 & 4096) != 0 ? new RouteDatabase() : routeDatabase;
        Intrinsics.h(timeUnit, "timeUnit");
        Intrinsics.h(taskRunner2, "taskRunner");
        Intrinsics.h(connectionListener, "connectionListener");
        this.f26670a = new RealConnectionPool(taskRunner2, 5, 5L, timeUnit, connectionListener, new Function3() { // from class: okhttp3.a
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                RealConnectionPool pool = (RealConnectionPool) obj;
                Address address = (Address) obj2;
                ConnectionUser user = (ConnectionUser) obj3;
                Intrinsics.h(pool, "pool");
                Intrinsics.h(address, "address");
                Intrinsics.h(user, "user");
                TaskRunner taskRunner3 = taskRunner2;
                return new FastFallbackExchangeFinder(new ForceConnectRoutePlanner(new RealRoutePlanner(taskRunner3, pool, i8, i9, i10, i11, i12, z3, z4, address, routeDatabase2, user)), taskRunner3);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConnectionPool() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.h(timeUnit, "timeUnit");
        TaskRunner taskRunner = TaskRunner.o;
        ConnectionListener.f26712a.getClass();
        this(taskRunner, ConnectionListener.b, 0, 0, 0, 0, false, false, null, 8160);
    }
}
