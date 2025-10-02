package me.oriient.navigation.common.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lme/oriient/navigation/common/models/NavigationFloor;", "", "id", "", "order", "", "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getOrder", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NavigationFloor {

    @NotNull
    private final String id;
    private final int order;

    public NavigationFloor(@NotNull String id, int i) {
        Intrinsics.h(id, "id");
        this.id = id;
        this.order = i;
    }

    public static /* synthetic */ NavigationFloor copy$default(NavigationFloor navigationFloor, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = navigationFloor.id;
        }
        if ((i2 & 2) != 0) {
            i = navigationFloor.order;
        }
        return navigationFloor.copy(str, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    @NotNull
    public final NavigationFloor copy(@NotNull String id, int order) {
        Intrinsics.h(id, "id");
        return new NavigationFloor(id, order);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationFloor)) {
            return false;
        }
        NavigationFloor navigationFloor = (NavigationFloor) other;
        return Intrinsics.c(this.id, navigationFloor.id) && this.order == navigationFloor.order;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getOrder() {
        return this.order;
    }

    public int hashCode() {
        return Integer.hashCode(this.order) + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NavigationFloor(id=");
        sb.append(this.id);
        sb.append(", order=");
        return YU.a.l(sb, this.order, ')');
    }
}
