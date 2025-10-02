package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/dataManager/building/BuildingSearchPage;", "", "cursor", "", "(Ljava/lang/String;)V", "getCursor", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BuildingSearchPage {

    @NotNull
    private final String cursor;

    public BuildingSearchPage(@NotNull String cursor) {
        Intrinsics.h(cursor, "cursor");
        this.cursor = cursor;
    }

    public static /* synthetic */ BuildingSearchPage copy$default(BuildingSearchPage buildingSearchPage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buildingSearchPage.cursor;
        }
        return buildingSearchPage.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    @NotNull
    public final BuildingSearchPage copy(@NotNull String cursor) {
        Intrinsics.h(cursor, "cursor");
        return new BuildingSearchPage(cursor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BuildingSearchPage) && Intrinsics.c(this.cursor, ((BuildingSearchPage) other).cursor);
    }

    @NotNull
    public final String getCursor() {
        return this.cursor;
    }

    public int hashCode() {
        return this.cursor.hashCode();
    }

    @NotNull
    public String toString() {
        return me.oriient.internal.infra.rest.e.a(new StringBuilder("BuildingSearchPage(cursor="), this.cursor, ')');
    }
}
