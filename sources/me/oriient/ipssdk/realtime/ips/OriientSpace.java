package me.oriient.ipssdk.realtime.ips;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.auth.Space;
import me.oriient.ipssdk.api.models.IPSSpace;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/OriientSpace;", "Lme/oriient/ipssdk/api/models/IPSSpace;", "Lme/oriient/internal/services/auth/Space;", "space", "<init>", "(Lme/oriient/internal/services/auth/Space;)V", "", "getId", "()Ljava/lang/String;", "getName", "toString", "copy", "(Lme/oriient/internal/services/auth/Space;)Lme/oriient/ipssdk/realtime/ips/OriientSpace;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OriientSpace implements IPSSpace {

    /* renamed from: a, reason: collision with root package name */
    private final Space f25836a;

    public OriientSpace(@NotNull Space space) {
        Intrinsics.h(space, "space");
        this.f25836a = space;
    }

    public static /* synthetic */ OriientSpace copy$default(OriientSpace oriientSpace, Space space, int i, Object obj) {
        if ((i & 1) != 0) {
            space = oriientSpace.f25836a;
        }
        return oriientSpace.copy(space);
    }

    @NotNull
    public final OriientSpace copy(@NotNull Space space) {
        Intrinsics.h(space, "space");
        return new OriientSpace(space);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OriientSpace) && Intrinsics.c(this.f25836a, ((OriientSpace) other).f25836a);
    }

    @Override // me.oriient.ipssdk.api.models.IPSSpace
    @NotNull
    public String getId() {
        return this.f25836a.getId();
    }

    @Override // me.oriient.ipssdk.api.models.IPSSpace
    @NotNull
    public String getName() {
        return this.f25836a.getName();
    }

    public int hashCode() {
        return this.f25836a.hashCode();
    }

    @NotNull
    public String toString() {
        return this.f25836a.toString();
    }
}
