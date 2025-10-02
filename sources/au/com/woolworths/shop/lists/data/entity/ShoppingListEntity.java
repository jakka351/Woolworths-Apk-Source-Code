package au.com.woolworths.shop.lists.data.entity;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Entity
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\u008a\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u0010HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001bR\u0016\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001bR\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u0011\u0010 ¨\u00065"}, d2 = {"Lau/com/woolworths/shop/lists/data/entity/ShoppingListEntity;", "Lau/com/woolworths/shop/lists/data/entity/SyncableEntity;", "id", "", "localCreatedAt", "", "localUpdatedAt", "remoteId", "remoteTimestamp", "isLocalEdited", "", "isLocalDeleted", "isRemoteEdited", "lastSyncedTime", "title", "color", "", "isWatchlist", "<init>", "(Ljava/lang/String;JJLjava/lang/String;JZZZJLjava/lang/String;ILjava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getLocalCreatedAt", "()J", "getLocalUpdatedAt", "getRemoteId", "getRemoteTimestamp", "()Z", "getLastSyncedTime", "getTitle", "getColor", "()I", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;JJLjava/lang/String;JZZZJLjava/lang/String;ILjava/lang/Boolean;)Lau/com/woolworths/shop/lists/data/entity/ShoppingListEntity;", "equals", "other", "", "hashCode", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShoppingListEntity implements SyncableEntity {

    @ColumnInfo
    private final int color;

    @PrimaryKey
    @ColumnInfo
    @NotNull
    private final String id;

    @ColumnInfo
    private final boolean isLocalDeleted;

    @ColumnInfo
    private final boolean isLocalEdited;

    @ColumnInfo
    private final boolean isRemoteEdited;

    @ColumnInfo
    @Nullable
    private final Boolean isWatchlist;

    @ColumnInfo
    private final long lastSyncedTime;

    @ColumnInfo
    private final long localCreatedAt;

    @ColumnInfo
    private final long localUpdatedAt;

    @ColumnInfo
    @Nullable
    private final String remoteId;

    @ColumnInfo
    private final long remoteTimestamp;

    @ColumnInfo
    @NotNull
    private final String title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShoppingListEntity(long j, @NotNull String title) {
        this(null, 0L, j, null, 0L, false, false, false, 0L, title, 0, null, 3579, null);
        Intrinsics.h(title, "title");
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component11, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Boolean getIsWatchlist() {
        return this.isWatchlist;
    }

    /* renamed from: component2, reason: from getter */
    public final long getLocalCreatedAt() {
        return this.localCreatedAt;
    }

    /* renamed from: component3, reason: from getter */
    public final long getLocalUpdatedAt() {
        return this.localUpdatedAt;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getRemoteId() {
        return this.remoteId;
    }

    /* renamed from: component5, reason: from getter */
    public final long getRemoteTimestamp() {
        return this.remoteTimestamp;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLocalEdited() {
        return this.isLocalEdited;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsLocalDeleted() {
        return this.isLocalDeleted;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsRemoteEdited() {
        return this.isRemoteEdited;
    }

    /* renamed from: component9, reason: from getter */
    public final long getLastSyncedTime() {
        return this.lastSyncedTime;
    }

    @NotNull
    public final ShoppingListEntity copy(@NotNull String id, long localCreatedAt, long localUpdatedAt, @Nullable String remoteId, long remoteTimestamp, boolean isLocalEdited, boolean isLocalDeleted, boolean isRemoteEdited, long lastSyncedTime, @NotNull String title, int color, @Nullable Boolean isWatchlist) {
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        return new ShoppingListEntity(id, localCreatedAt, localUpdatedAt, remoteId, remoteTimestamp, isLocalEdited, isLocalDeleted, isRemoteEdited, lastSyncedTime, title, color, isWatchlist);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingListEntity)) {
            return false;
        }
        ShoppingListEntity shoppingListEntity = (ShoppingListEntity) other;
        return Intrinsics.c(this.id, shoppingListEntity.id) && this.localCreatedAt == shoppingListEntity.localCreatedAt && this.localUpdatedAt == shoppingListEntity.localUpdatedAt && Intrinsics.c(this.remoteId, shoppingListEntity.remoteId) && this.remoteTimestamp == shoppingListEntity.remoteTimestamp && this.isLocalEdited == shoppingListEntity.isLocalEdited && this.isLocalDeleted == shoppingListEntity.isLocalDeleted && this.isRemoteEdited == shoppingListEntity.isRemoteEdited && this.lastSyncedTime == shoppingListEntity.lastSyncedTime && Intrinsics.c(this.title, shoppingListEntity.title) && this.color == shoppingListEntity.color && Intrinsics.c(this.isWatchlist, shoppingListEntity.isWatchlist);
    }

    public final int getColor() {
        return this.color;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.SyncableEntity
    @NotNull
    public String getId() {
        return this.id;
    }

    public final long getLastSyncedTime() {
        return this.lastSyncedTime;
    }

    public final long getLocalCreatedAt() {
        return this.localCreatedAt;
    }

    public final long getLocalUpdatedAt() {
        return this.localUpdatedAt;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.SyncableEntity
    @Nullable
    public String getRemoteId() {
        return this.remoteId;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.SyncableEntity
    public long getRemoteTimestamp() {
        return this.remoteTimestamp;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iB = b.b(b.b(this.id.hashCode() * 31, 31, this.localCreatedAt), 31, this.localUpdatedAt);
        String str = this.remoteId;
        int iA = b.a(this.color, b.c(b.b(b.e(b.e(b.e(b.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.remoteTimestamp), 31, this.isLocalEdited), 31, this.isLocalDeleted), 31, this.isRemoteEdited), 31, this.lastSyncedTime), 31, this.title), 31);
        Boolean bool = this.isWatchlist;
        return iA + (bool != null ? bool.hashCode() : 0);
    }

    @Override // au.com.woolworths.shop.lists.data.entity.SyncableEntity
    public boolean isLocalDeleted() {
        return this.isLocalDeleted;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.SyncableEntity
    public boolean isLocalEdited() {
        return this.isLocalEdited;
    }

    public final boolean isRemoteEdited() {
        return this.isRemoteEdited;
    }

    @Nullable
    public final Boolean isWatchlist() {
        return this.isWatchlist;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        long j = this.localCreatedAt;
        long j2 = this.localUpdatedAt;
        String str2 = this.remoteId;
        long j3 = this.remoteTimestamp;
        boolean z = this.isLocalEdited;
        boolean z2 = this.isLocalDeleted;
        boolean z3 = this.isRemoteEdited;
        long j4 = this.lastSyncedTime;
        String str3 = this.title;
        int i = this.color;
        Boolean bool = this.isWatchlist;
        StringBuilder sb = new StringBuilder("ShoppingListEntity(id=");
        sb.append(str);
        sb.append(", localCreatedAt=");
        sb.append(j);
        a.A(sb, ", localUpdatedAt=", j2, ", remoteId=");
        sb.append(str2);
        sb.append(", remoteTimestamp=");
        sb.append(j3);
        sb.append(", isLocalEdited=");
        sb.append(z);
        sb.append(", isLocalDeleted=");
        sb.append(z2);
        sb.append(", isRemoteEdited=");
        sb.append(z3);
        sb.append(", lastSyncedTime=");
        sb.append(j4);
        sb.append(", title=");
        sb.append(str3);
        sb.append(", color=");
        sb.append(i);
        sb.append(", isWatchlist=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShoppingListEntity(@NotNull String id, long j, long j2, @NotNull String title) {
        this(id, j, j2, null, 0L, false, false, false, 0L, title, 0, null, 3576, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShoppingListEntity(@NotNull String id, long j, long j2, @Nullable String str, long j3, @NotNull String title) {
        this(id, j, j2, str, j3, false, false, false, 0L, title, 0, null, 3552, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShoppingListEntity(@NotNull String id, long j, long j2, @Nullable String str, long j3, boolean z, @NotNull String title) {
        this(id, j, j2, str, j3, z, false, false, 0L, title, 0, null, 3520, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShoppingListEntity(@NotNull String id, long j, long j2, @Nullable String str, long j3, boolean z, boolean z2, @NotNull String title) {
        this(id, j, j2, str, j3, z, z2, false, 0L, title, 0, null, 3456, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShoppingListEntity(@NotNull String id, long j, long j2, @Nullable String str, long j3, boolean z, boolean z2, boolean z3, long j4, @NotNull String title) {
        this(id, j, j2, str, j3, z, z2, z3, j4, title, 0, null, 3072, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShoppingListEntity(@NotNull String id, long j, long j2, @Nullable String str, long j3, boolean z, boolean z2, boolean z3, long j4, @NotNull String title, int i) {
        this(id, j, j2, str, j3, z, z2, z3, j4, title, i, null, 2048, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShoppingListEntity(@NotNull String id, long j, long j2, @Nullable String str, long j3, boolean z, boolean z2, boolean z3, @NotNull String title) {
        this(id, j, j2, str, j3, z, z2, z3, 0L, title, 0, null, 3328, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShoppingListEntity(@NotNull String id, long j, long j2, @Nullable String str, @NotNull String title) {
        this(id, j, j2, str, 0L, false, false, false, 0L, title, 0, null, 3568, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShoppingListEntity(@NotNull String id, long j, @NotNull String title) {
        this(id, 0L, j, null, 0L, false, false, false, 0L, title, 0, null, 3578, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
    }

    @JvmOverloads
    public ShoppingListEntity(@NotNull String id, long j, long j2, @Nullable String str, long j3, boolean z, boolean z2, boolean z3, long j4, @NotNull String title, int i, @Nullable Boolean bool) {
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        this.id = id;
        this.localCreatedAt = j;
        this.localUpdatedAt = j2;
        this.remoteId = str;
        this.remoteTimestamp = j3;
        this.isLocalEdited = z;
        this.isLocalDeleted = z2;
        this.isRemoteEdited = z3;
        this.lastSyncedTime = j4;
        this.title = title;
        this.color = i;
        this.isWatchlist = bool;
    }

    public /* synthetic */ ShoppingListEntity(String str, long j, long j2, String str2, long j3, boolean z, boolean z2, boolean z3, long j4, String str3, int i, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, j2, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? 0L : j3, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? 0L : j4, str3, (i2 & 1024) != 0 ? -16733362 : i, (i2 & 2048) != 0 ? Boolean.FALSE : bool);
    }
}
