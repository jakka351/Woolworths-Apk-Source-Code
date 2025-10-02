package me.oriient.navigation.ondevice;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lme/oriient/navigation/ondevice/NavEngineTransition;", "", "index", "", "uuid", "", "type", "(DLjava/lang/String;Ljava/lang/String;)V", "getIndex", "()D", "getType", "()Ljava/lang/String;", "getUuid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NavEngineTransition {
    private final double index;

    @NotNull
    private final String type;

    @NotNull
    private final String uuid;

    public NavEngineTransition(double d, @NotNull String uuid, @NotNull String type) {
        Intrinsics.h(uuid, "uuid");
        Intrinsics.h(type, "type");
        this.index = d;
        this.uuid = uuid;
        this.type = type;
    }

    public static /* synthetic */ NavEngineTransition copy$default(NavEngineTransition navEngineTransition, double d, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = navEngineTransition.index;
        }
        if ((i & 2) != 0) {
            str = navEngineTransition.uuid;
        }
        if ((i & 4) != 0) {
            str2 = navEngineTransition.type;
        }
        return navEngineTransition.copy(d, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getIndex() {
        return this.index;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final NavEngineTransition copy(double index, @NotNull String uuid, @NotNull String type) {
        Intrinsics.h(uuid, "uuid");
        Intrinsics.h(type, "type");
        return new NavEngineTransition(index, uuid, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavEngineTransition)) {
            return false;
        }
        NavEngineTransition navEngineTransition = (NavEngineTransition) other;
        return Double.compare(this.index, navEngineTransition.index) == 0 && Intrinsics.c(this.uuid, navEngineTransition.uuid) && Intrinsics.c(this.type, navEngineTransition.type);
    }

    public final double getIndex() {
        return this.index;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.type.hashCode() + androidx.camera.core.impl.b.c(Double.hashCode(this.index) * 31, 31, this.uuid);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NavEngineTransition(index=");
        sb.append(this.index);
        sb.append(", uuid=");
        sb.append(this.uuid);
        sb.append(", type=");
        return androidx.camera.core.impl.b.r(sb, this.type, ')');
    }
}
