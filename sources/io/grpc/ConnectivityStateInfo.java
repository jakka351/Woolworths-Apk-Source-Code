package io.grpc;

import com.google.common.base.Preconditions;

@ExperimentalApi
/* loaded from: classes7.dex */
public final class ConnectivityStateInfo {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityState f23930a;
    public final Status b;

    public ConnectivityStateInfo(ConnectivityState connectivityState, Status status) {
        this.f23930a = connectivityState;
        Preconditions.j(status, "status is null");
        this.b = status;
    }

    public static ConnectivityStateInfo a(ConnectivityState connectivityState) {
        Preconditions.f("state is TRANSIENT_ERROR. Use forError() instead", connectivityState != ConnectivityState.f);
        return new ConnectivityStateInfo(connectivityState, Status.e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectivityStateInfo)) {
            return false;
        }
        ConnectivityStateInfo connectivityStateInfo = (ConnectivityStateInfo) obj;
        return this.f23930a.equals(connectivityStateInfo.f23930a) && this.b.equals(connectivityStateInfo.b);
    }

    public final int hashCode() {
        return this.f23930a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        Status status = this.b;
        boolean zF = status.f();
        ConnectivityState connectivityState = this.f23930a;
        if (zF) {
            return connectivityState.toString();
        }
        return connectivityState + "(" + status + ")";
    }
}
