package au.com.woolworths.shop.lists.data.entity;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Entity
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003Jo\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0019R\u0016\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0019R\u0016\u0010\r\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006,"}, d2 = {"Lau/com/woolworths/shop/lists/data/entity/TextListItemEntity;", "Lau/com/woolworths/shop/lists/data/entity/ShoppingListItemEntity;", "id", "", "listId", "localCreatedAt", "", "localUpdatedAt", "remoteId", "remoteTimestamp", "isLocalEdited", "", "isLocalDeleted", "isChecked", TextBundle.TEXT_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;JZZZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getListId", "getLocalCreatedAt", "()J", "getLocalUpdatedAt", "getRemoteId", "getRemoteTimestamp", "()Z", "getText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TextListItemEntity implements ShoppingListItemEntity {

    @PrimaryKey
    @ColumnInfo
    @NotNull
    private final String id;

    @ColumnInfo
    private final boolean isChecked;

    @ColumnInfo
    private final boolean isLocalDeleted;

    @ColumnInfo
    private final boolean isLocalEdited;

    @ColumnInfo
    @NotNull
    private final String listId;

    @ColumnInfo
    private final long localCreatedAt;

    @ColumnInfo
    private final long localUpdatedAt;

    @ColumnInfo
    @Nullable
    private final String remoteId;

    @ColumnInfo
    private final long remoteTimestamp;

    @NotNull
    private final String text;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TextListItemEntity(@NotNull String listId, @NotNull String text) {
        this(null, listId, 0L, 0L, null, 0L, false, false, false, text, 509, null);
        Intrinsics.h(listId, "listId");
        Intrinsics.h(text, "text");
    }

    public static /* synthetic */ TextListItemEntity copy$default(TextListItemEntity textListItemEntity, String str, String str2, long j, long j2, String str3, long j3, boolean z, boolean z2, boolean z3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textListItemEntity.id;
        }
        return textListItemEntity.copy(str, (i & 2) != 0 ? textListItemEntity.listId : str2, (i & 4) != 0 ? textListItemEntity.localCreatedAt : j, (i & 8) != 0 ? textListItemEntity.localUpdatedAt : j2, (i & 16) != 0 ? textListItemEntity.remoteId : str3, (i & 32) != 0 ? textListItemEntity.remoteTimestamp : j3, (i & 64) != 0 ? textListItemEntity.isLocalEdited : z, (i & 128) != 0 ? textListItemEntity.isLocalDeleted : z2, (i & 256) != 0 ? textListItemEntity.isChecked : z3, (i & 512) != 0 ? textListItemEntity.text : str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getListId() {
        return this.listId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getLocalCreatedAt() {
        return this.localCreatedAt;
    }

    /* renamed from: component4, reason: from getter */
    public final long getLocalUpdatedAt() {
        return this.localUpdatedAt;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getRemoteId() {
        return this.remoteId;
    }

    /* renamed from: component6, reason: from getter */
    public final long getRemoteTimestamp() {
        return this.remoteTimestamp;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsLocalEdited() {
        return this.isLocalEdited;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsLocalDeleted() {
        return this.isLocalDeleted;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @NotNull
    public final TextListItemEntity copy(@NotNull String id, @NotNull String listId, long localCreatedAt, long localUpdatedAt, @Nullable String remoteId, long remoteTimestamp, boolean isLocalEdited, boolean isLocalDeleted, boolean isChecked, @NotNull String text) {
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(text, "text");
        return new TextListItemEntity(id, listId, localCreatedAt, localUpdatedAt, remoteId, remoteTimestamp, isLocalEdited, isLocalDeleted, isChecked, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextListItemEntity)) {
            return false;
        }
        TextListItemEntity textListItemEntity = (TextListItemEntity) other;
        return Intrinsics.c(this.id, textListItemEntity.id) && Intrinsics.c(this.listId, textListItemEntity.listId) && this.localCreatedAt == textListItemEntity.localCreatedAt && this.localUpdatedAt == textListItemEntity.localUpdatedAt && Intrinsics.c(this.remoteId, textListItemEntity.remoteId) && this.remoteTimestamp == textListItemEntity.remoteTimestamp && this.isLocalEdited == textListItemEntity.isLocalEdited && this.isLocalDeleted == textListItemEntity.isLocalDeleted && this.isChecked == textListItemEntity.isChecked && Intrinsics.c(this.text, textListItemEntity.text);
    }

    @Override // au.com.woolworths.shop.lists.data.entity.SyncableEntity
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.ShoppingListItemEntity
    @NotNull
    public String getListId() {
        return this.listId;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.ShoppingListItemEntity
    public long getLocalCreatedAt() {
        return this.localCreatedAt;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.ShoppingListItemEntity
    public long getLocalUpdatedAt() {
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
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iB = b.b(b.b(b.c(this.id.hashCode() * 31, 31, this.listId), 31, this.localCreatedAt), 31, this.localUpdatedAt);
        String str = this.remoteId;
        return this.text.hashCode() + b.e(b.e(b.e(b.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.remoteTimestamp), 31, this.isLocalEdited), 31, this.isLocalDeleted), 31, this.isChecked);
    }

    @Override // au.com.woolworths.shop.lists.data.entity.ShoppingListItemEntity
    public boolean isChecked() {
        return this.isChecked;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.SyncableEntity
    public boolean isLocalDeleted() {
        return this.isLocalDeleted;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.SyncableEntity
    public boolean isLocalEdited() {
        return this.isLocalEdited;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.listId;
        long j = this.localCreatedAt;
        long j2 = this.localUpdatedAt;
        String str3 = this.remoteId;
        long j3 = this.remoteTimestamp;
        boolean z = this.isLocalEdited;
        boolean z2 = this.isLocalDeleted;
        boolean z3 = this.isChecked;
        String str4 = this.text;
        StringBuilder sbV = a.v("TextListItemEntity(id=", str, ", listId=", str2, ", localCreatedAt=");
        sbV.append(j);
        androidx.constraintlayout.core.state.a.A(sbV, ", localUpdatedAt=", j2, ", remoteId=");
        sbV.append(str3);
        sbV.append(", remoteTimestamp=");
        sbV.append(j3);
        sbV.append(", isLocalEdited=");
        sbV.append(z);
        sbV.append(", isLocalDeleted=");
        sbV.append(z2);
        sbV.append(", isChecked=");
        sbV.append(z3);
        sbV.append(", text=");
        sbV.append(str4);
        sbV.append(")");
        return sbV.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TextListItemEntity(@NotNull String id, @NotNull String listId, long j, long j2, @NotNull String text) {
        this(id, listId, j, j2, null, 0L, false, false, false, text, 496, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(text, "text");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TextListItemEntity(@NotNull String id, @NotNull String listId, long j, long j2, @Nullable String str, long j3, @NotNull String text) {
        this(id, listId, j, j2, str, j3, false, false, false, text, 448, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(text, "text");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TextListItemEntity(@NotNull String id, @NotNull String listId, long j, long j2, @Nullable String str, long j3, boolean z, @NotNull String text) {
        this(id, listId, j, j2, str, j3, z, false, false, text, KyberEngine.KyberPolyBytes, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(text, "text");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TextListItemEntity(@NotNull String id, @NotNull String listId, long j, long j2, @Nullable String str, long j3, boolean z, boolean z2, @NotNull String text) {
        this(id, listId, j, j2, str, j3, z, z2, false, text, 256, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(text, "text");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TextListItemEntity(@NotNull String id, @NotNull String listId, long j, long j2, @Nullable String str, @NotNull String text) {
        this(id, listId, j, j2, str, 0L, false, false, false, text, 480, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(text, "text");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TextListItemEntity(@NotNull String id, @NotNull String listId, long j, @NotNull String text) {
        this(id, listId, j, 0L, null, 0L, false, false, false, text, 504, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(text, "text");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TextListItemEntity(@NotNull String id, @NotNull String listId, @NotNull String text) {
        this(id, listId, 0L, 0L, null, 0L, false, false, false, text, 508, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(text, "text");
    }

    @JvmOverloads
    public TextListItemEntity(@NotNull String id, @NotNull String listId, long j, long j2, @Nullable String str, long j3, boolean z, boolean z2, boolean z3, @NotNull String text) {
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(text, "text");
        this.id = id;
        this.listId = listId;
        this.localCreatedAt = j;
        this.localUpdatedAt = j2;
        this.remoteId = str;
        this.remoteTimestamp = j3;
        this.isLocalEdited = z;
        this.isLocalDeleted = z2;
        this.isChecked = z3;
        this.text = text;
    }

    public /* synthetic */ TextListItemEntity(String str, String str2, long j, long j2, String str3, long j3, boolean z, boolean z2, boolean z3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? 0L : j3, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, str4);
    }
}
