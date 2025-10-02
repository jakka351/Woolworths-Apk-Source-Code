package me.oriient.ipssdk.base.remoteconfig;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/RestConfig;", "", "", "restReadTimeoutSec", "restConnectTimeoutSec", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lme/oriient/ipssdk/base/remoteconfig/RestConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getRestReadTimeoutSec", "b", "getRestConnectTimeoutSec", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RestConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int restReadTimeoutSec;

    /* renamed from: b, reason: from kotlin metadata */
    private final int restConnectTimeoutSec;

    public RestConfig(int i, int i2) {
        this.restReadTimeoutSec = i;
        this.restConnectTimeoutSec = i2;
    }

    public static /* synthetic */ RestConfig copy$default(RestConfig restConfig, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = restConfig.restReadTimeoutSec;
        }
        if ((i3 & 2) != 0) {
            i2 = restConfig.restConnectTimeoutSec;
        }
        return restConfig.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRestReadTimeoutSec() {
        return this.restReadTimeoutSec;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRestConnectTimeoutSec() {
        return this.restConnectTimeoutSec;
    }

    @NotNull
    public final RestConfig copy(int restReadTimeoutSec, int restConnectTimeoutSec) {
        return new RestConfig(restReadTimeoutSec, restConnectTimeoutSec);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestConfig)) {
            return false;
        }
        RestConfig restConfig = (RestConfig) other;
        return this.restReadTimeoutSec == restConfig.restReadTimeoutSec && this.restConnectTimeoutSec == restConfig.restConnectTimeoutSec;
    }

    public final int getRestConnectTimeoutSec() {
        return this.restConnectTimeoutSec;
    }

    public final int getRestReadTimeoutSec() {
        return this.restReadTimeoutSec;
    }

    public int hashCode() {
        return Integer.hashCode(this.restConnectTimeoutSec) + (Integer.hashCode(this.restReadTimeoutSec) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RestConfig(restReadTimeoutSec=");
        sb.append(this.restReadTimeoutSec);
        sb.append(", restConnectTimeoutSec=");
        return YU.a.l(sb, this.restConnectTimeoutSec, ')');
    }
}
