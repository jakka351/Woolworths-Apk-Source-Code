package com.google.firebase.firestore.remote;

/* loaded from: classes6.dex */
public interface ConnectivityMonitor {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NetworkStatus {
        public static final NetworkStatus d;
        public static final NetworkStatus e;
        public static final /* synthetic */ NetworkStatus[] f;

        static {
            NetworkStatus networkStatus = new NetworkStatus("UNREACHABLE", 0);
            d = networkStatus;
            NetworkStatus networkStatus2 = new NetworkStatus("REACHABLE", 1);
            e = networkStatus2;
            f = new NetworkStatus[]{networkStatus, networkStatus2};
        }

        public static NetworkStatus valueOf(String str) {
            return (NetworkStatus) Enum.valueOf(NetworkStatus.class, str);
        }

        public static NetworkStatus[] values() {
            return (NetworkStatus[]) f.clone();
        }
    }
}
