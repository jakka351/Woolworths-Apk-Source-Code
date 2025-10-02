package com.scandit.datacapture.core.internal.module.https;

import YU.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeHttpsSessionConfiguration {
    final boolean allowsCellularAccess;
    final int timeoutInterval;

    public NativeHttpsSessionConfiguration(int i, boolean z) {
        this.timeoutInterval = i;
        this.allowsCellularAccess = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NativeHttpsSessionConfiguration)) {
            return false;
        }
        NativeHttpsSessionConfiguration nativeHttpsSessionConfiguration = (NativeHttpsSessionConfiguration) obj;
        return this.timeoutInterval == nativeHttpsSessionConfiguration.timeoutInterval && this.allowsCellularAccess == nativeHttpsSessionConfiguration.allowsCellularAccess;
    }

    public boolean getAllowsCellularAccess() {
        return this.allowsCellularAccess;
    }

    public int getTimeoutInterval() {
        return this.timeoutInterval;
    }

    public int hashCode() {
        return ((this.timeoutInterval + 527) * 31) + (this.allowsCellularAccess ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeHttpsSessionConfiguration{timeoutInterval=");
        sb.append(this.timeoutInterval);
        sb.append(",allowsCellularAccess=");
        return a.k("}", sb, this.allowsCellularAccess);
    }
}
