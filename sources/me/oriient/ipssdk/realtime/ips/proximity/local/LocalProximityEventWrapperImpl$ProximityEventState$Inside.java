package me.oriient.ipssdk.realtime.ips.proximity.local;

import kotlin.Metadata;
import me.oriient.ipssdk.realtime.ofs.AbstractC1733u2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u0019"}, d2 = {"me/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventWrapperImpl$ProximityEventState$Inside", "Lme/oriient/ipssdk/realtime/ofs/u2;", "", "sinceMillis", "<init>", "(J)V", "component1", "()J", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventWrapperImpl$ProximityEventState$Inside;", "copy", "(J)Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventWrapperImpl$ProximityEventState$Inside;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getSinceMillis", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class LocalProximityEventWrapperImpl$ProximityEventState$Inside extends AbstractC1733u2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long sinceMillis;

    public LocalProximityEventWrapperImpl$ProximityEventState$Inside(long j) {
        this.sinceMillis = j;
    }

    public static /* synthetic */ LocalProximityEventWrapperImpl$ProximityEventState$Inside copy$default(LocalProximityEventWrapperImpl$ProximityEventState$Inside localProximityEventWrapperImpl$ProximityEventState$Inside, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = localProximityEventWrapperImpl$ProximityEventState$Inside.sinceMillis;
        }
        return localProximityEventWrapperImpl$ProximityEventState$Inside.copy(j);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSinceMillis() {
        return this.sinceMillis;
    }

    @NotNull
    public final LocalProximityEventWrapperImpl$ProximityEventState$Inside copy(long sinceMillis) {
        return new LocalProximityEventWrapperImpl$ProximityEventState$Inside(sinceMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LocalProximityEventWrapperImpl$ProximityEventState$Inside) && this.sinceMillis == ((LocalProximityEventWrapperImpl$ProximityEventState$Inside) other).sinceMillis;
    }

    public final long getSinceMillis() {
        return this.sinceMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.sinceMillis);
    }

    @NotNull
    public String toString() {
        return androidx.camera.core.impl.b.q(new StringBuilder("Inside(sinceMillis="), this.sinceMillis, ')');
    }
}
