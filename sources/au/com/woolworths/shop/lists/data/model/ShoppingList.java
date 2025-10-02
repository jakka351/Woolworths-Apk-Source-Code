package au.com.woolworths.shop.lists.data.model;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JN\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\t\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/ShoppingList;", "", "id", "", "title", "color", "", "updatedAt", "", "isWatchlist", "", "remoteId", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Boolean;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getColor", "()I", "getUpdatedAt", "()J", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRemoteId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Boolean;Ljava/lang/String;)Lau/com/woolworths/shop/lists/data/model/ShoppingList;", "equals", "other", "hashCode", "toString", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShoppingList {
    public static final int DEFAULT_COLOR = -16733362;
    private final int color;

    @NotNull
    private final String id;

    @Nullable
    private final Boolean isWatchlist;

    @Nullable
    private final String remoteId;

    @NotNull
    private final String title;
    private final long updatedAt;

    public ShoppingList(@NotNull String id, @NotNull String title, int i, long j, @Nullable Boolean bool, @Nullable String str) {
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        this.id = id;
        this.title = title;
        this.color = i;
        this.updatedAt = j;
        this.isWatchlist = bool;
        this.remoteId = str;
    }

    public static /* synthetic */ ShoppingList copy$default(ShoppingList shoppingList, String str, String str2, int i, long j, Boolean bool, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shoppingList.id;
        }
        if ((i2 & 2) != 0) {
            str2 = shoppingList.title;
        }
        if ((i2 & 4) != 0) {
            i = shoppingList.color;
        }
        if ((i2 & 8) != 0) {
            j = shoppingList.updatedAt;
        }
        if ((i2 & 16) != 0) {
            bool = shoppingList.isWatchlist;
        }
        if ((i2 & 32) != 0) {
            str3 = shoppingList.remoteId;
        }
        long j2 = j;
        int i3 = i;
        return shoppingList.copy(str, str2, i3, j2, bool, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsWatchlist() {
        return this.isWatchlist;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getRemoteId() {
        return this.remoteId;
    }

    @NotNull
    public final ShoppingList copy(@NotNull String id, @NotNull String title, int color, long updatedAt, @Nullable Boolean isWatchlist, @Nullable String remoteId) {
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        return new ShoppingList(id, title, color, updatedAt, isWatchlist, remoteId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingList)) {
            return false;
        }
        ShoppingList shoppingList = (ShoppingList) other;
        return Intrinsics.c(this.id, shoppingList.id) && Intrinsics.c(this.title, shoppingList.title) && this.color == shoppingList.color && this.updatedAt == shoppingList.updatedAt && Intrinsics.c(this.isWatchlist, shoppingList.isWatchlist) && Intrinsics.c(this.remoteId, shoppingList.remoteId);
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getRemoteId() {
        return this.remoteId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iB = b.b(b.a(this.color, b.c(this.id.hashCode() * 31, 31, this.title), 31), 31, this.updatedAt);
        Boolean bool = this.isWatchlist;
        int iHashCode = (iB + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.remoteId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Nullable
    public final Boolean isWatchlist() {
        return this.isWatchlist;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        int i = this.color;
        long j = this.updatedAt;
        Boolean bool = this.isWatchlist;
        String str3 = this.remoteId;
        StringBuilder sbV = a.v("ShoppingList(id=", str, ", title=", str2, ", color=");
        sbV.append(i);
        sbV.append(", updatedAt=");
        sbV.append(j);
        sbV.append(", isWatchlist=");
        sbV.append(bool);
        sbV.append(", remoteId=");
        sbV.append(str3);
        sbV.append(")");
        return sbV.toString();
    }

    public /* synthetic */ ShoppingList(String str, String str2, int i, long j, Boolean bool, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, str2, (i2 & 4) != 0 ? DEFAULT_COLOR : i, j, (i2 & 16) != 0 ? Boolean.FALSE : bool, (i2 & 32) != 0 ? null : str3);
    }
}
