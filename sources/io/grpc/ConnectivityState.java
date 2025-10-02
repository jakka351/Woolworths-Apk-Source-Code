package io.grpc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@ExperimentalApi
/* loaded from: classes7.dex */
public final class ConnectivityState {
    public static final ConnectivityState d;
    public static final ConnectivityState e;
    public static final ConnectivityState f;
    public static final ConnectivityState g;
    public static final ConnectivityState h;
    public static final /* synthetic */ ConnectivityState[] i;

    static {
        ConnectivityState connectivityState = new ConnectivityState("CONNECTING", 0);
        d = connectivityState;
        ConnectivityState connectivityState2 = new ConnectivityState("READY", 1);
        e = connectivityState2;
        ConnectivityState connectivityState3 = new ConnectivityState("TRANSIENT_FAILURE", 2);
        f = connectivityState3;
        ConnectivityState connectivityState4 = new ConnectivityState("IDLE", 3);
        g = connectivityState4;
        ConnectivityState connectivityState5 = new ConnectivityState("SHUTDOWN", 4);
        h = connectivityState5;
        i = new ConnectivityState[]{connectivityState, connectivityState2, connectivityState3, connectivityState4, connectivityState5};
    }

    public static ConnectivityState valueOf(String str) {
        return (ConnectivityState) Enum.valueOf(ConnectivityState.class, str);
    }

    public static ConnectivityState[] values() {
        return (ConnectivityState[]) i.clone();
    }
}
