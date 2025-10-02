package au.com.woolworths.android.onesite.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/utils/ConnectionManagerImpl;", "Lau/com/woolworths/android/onesite/utils/ConnectionManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ConnectionType", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConnectionManagerImpl implements ConnectionManager {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f4594a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/utils/ConnectionManagerImpl$ConnectionType;", "", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConnectionType {
        public static final ConnectionType d;
        public static final ConnectionType e;
        public static final ConnectionType f;
        public static final ConnectionType g;
        public static final /* synthetic */ ConnectionType[] h;
        public static final /* synthetic */ EnumEntries i;

        static {
            ConnectionType connectionType = new ConnectionType("NONE", 0);
            d = connectionType;
            ConnectionType connectionType2 = new ConnectionType("WIFI", 1);
            e = connectionType2;
            ConnectionType connectionType3 = new ConnectionType("MOBILE", 2);
            f = connectionType3;
            ConnectionType connectionType4 = new ConnectionType("OTHER", 3);
            g = connectionType4;
            ConnectionType[] connectionTypeArr = {connectionType, connectionType2, connectionType3, connectionType4};
            h = connectionTypeArr;
            i = EnumEntriesKt.a(connectionTypeArr);
        }

        public static ConnectionType valueOf(String str) {
            return (ConnectionType) Enum.valueOf(ConnectionType.class, str);
        }

        public static ConnectionType[] values() {
            return (ConnectionType[]) h.clone();
        }
    }

    public ConnectionManagerImpl(@NotNull Context context) {
        Intrinsics.h(context, "context");
        this.f4594a = (ConnectivityManager) context.getApplicationContext().getSystemService(ConnectivityManager.class);
    }

    @Override // au.com.woolworths.android.onesite.utils.ConnectionManager
    public final boolean isConnected() {
        ConnectionType connectionType = ConnectionType.d;
        ConnectivityManager connectivityManager = this.f4594a;
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return connectionType != ((activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? connectionType : activeNetworkInfo.getType() == 1 ? ConnectionType.e : activeNetworkInfo.getType() == 0 ? ConnectionType.f : ConnectionType.g);
    }
}
