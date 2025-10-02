package me.oriient.navigation.common.models;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lme/oriient/navigation/common/models/NavigationBuilding;", "", "id", "", "floors", "", "Lme/oriient/navigation/common/models/NavigationFloor;", "(Ljava/lang/String;Ljava/util/List;)V", "getFloors", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NavigationBuilding {

    @NotNull
    private final List<NavigationFloor> floors;

    @NotNull
    private final String id;

    public NavigationBuilding(@NotNull String id, @NotNull List<NavigationFloor> floors) {
        Intrinsics.h(id, "id");
        Intrinsics.h(floors, "floors");
        this.id = id;
        this.floors = floors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigationBuilding copy$default(NavigationBuilding navigationBuilding, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = navigationBuilding.id;
        }
        if ((i & 2) != 0) {
            list = navigationBuilding.floors;
        }
        return navigationBuilding.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<NavigationFloor> component2() {
        return this.floors;
    }

    @NotNull
    public final NavigationBuilding copy(@NotNull String id, @NotNull List<NavigationFloor> floors) {
        Intrinsics.h(id, "id");
        Intrinsics.h(floors, "floors");
        return new NavigationBuilding(id, floors);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationBuilding)) {
            return false;
        }
        NavigationBuilding navigationBuilding = (NavigationBuilding) other;
        return Intrinsics.c(this.id, navigationBuilding.id) && Intrinsics.c(this.floors, navigationBuilding.floors);
    }

    @NotNull
    public final List<NavigationFloor> getFloors() {
        return this.floors;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.floors.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NavigationBuilding(id=");
        sb.append(this.id);
        sb.append(", floors=");
        return androidx.compose.ui.input.pointer.a.o(sb, this.floors, ')');
    }
}
