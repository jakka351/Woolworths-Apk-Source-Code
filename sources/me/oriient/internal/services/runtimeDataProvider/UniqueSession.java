package me.oriient.internal.services.runtimeDataProvider;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/services/runtimeDataProvider/UniqueSession;", "", "id", "", "startTimeMillis", "", "(Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getStartTimeMillis", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UniqueSession {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String id;
    private final long startTimeMillis;

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/runtimeDataProvider/UniqueSession$Companion;", "", "()V", "createNewSession", "Lme/oriient/internal/services/runtimeDataProvider/UniqueSession;", "timeProvider", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Keep
        @NotNull
        public final UniqueSession createNewSession(@NotNull TimeProvider timeProvider) {
            Intrinsics.h(timeProvider, "timeProvider");
            return new UniqueSession(androidx.constraintlayout.core.state.a.h("toString(...)"), timeProvider.getCurrentTimeMillis());
        }

        private Companion() {
        }
    }

    public UniqueSession(@NotNull String id, long j) {
        Intrinsics.h(id, "id");
        this.id = id;
        this.startTimeMillis = j;
    }

    public static /* synthetic */ UniqueSession copy$default(UniqueSession uniqueSession, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uniqueSession.id;
        }
        if ((i & 2) != 0) {
            j = uniqueSession.startTimeMillis;
        }
        return uniqueSession.copy(str, j);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    @NotNull
    public final UniqueSession copy(@NotNull String id, long startTimeMillis) {
        Intrinsics.h(id, "id");
        return new UniqueSession(id, startTimeMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniqueSession)) {
            return false;
        }
        UniqueSession uniqueSession = (UniqueSession) other;
        return Intrinsics.c(this.id, uniqueSession.id) && this.startTimeMillis == uniqueSession.startTimeMillis;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.startTimeMillis) + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("UniqueSession(id=");
        sb.append(this.id);
        sb.append(", startTimeMillis=");
        return androidx.camera.core.impl.b.q(sb, this.startTimeMillis, ')');
    }
}
