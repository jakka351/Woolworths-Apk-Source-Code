package au.com.woolworths.shop.lists.data.model;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006("}, d2 = {"Lau/com/woolworths/shop/lists/data/model/TextListItem;", "Lau/com/woolworths/shop/lists/data/model/ShoppingListItem;", "id", "", "listId", "createdAt", "", "updatedAt", "isChecked", "", TextBundle.TEXT_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getListId", "getCreatedAt", "()J", "getUpdatedAt", "()Z", "getText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TextListItem implements ShoppingListItem {

    @NotNull
    public static final Parcelable.Creator<TextListItem> CREATOR = new Creator();
    private final long createdAt;

    @NotNull
    private final String id;
    private final boolean isChecked;

    @NotNull
    private final String listId;

    @NotNull
    private final String text;
    private final long updatedAt;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TextListItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextListItem createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new TextListItem(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextListItem[] newArray(int i) {
            return new TextListItem[i];
        }
    }

    public TextListItem(@NotNull String id, @NotNull String listId, long j, long j2, boolean z, @NotNull String text) {
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(text, "text");
        this.id = id;
        this.listId = listId;
        this.createdAt = j;
        this.updatedAt = j2;
        this.isChecked = z;
        this.text = text;
    }

    public static /* synthetic */ TextListItem copy$default(TextListItem textListItem, String str, String str2, long j, long j2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textListItem.id;
        }
        if ((i & 2) != 0) {
            str2 = textListItem.listId;
        }
        if ((i & 4) != 0) {
            j = textListItem.createdAt;
        }
        if ((i & 8) != 0) {
            j2 = textListItem.updatedAt;
        }
        if ((i & 16) != 0) {
            z = textListItem.isChecked;
        }
        if ((i & 32) != 0) {
            str3 = textListItem.text;
        }
        long j3 = j2;
        long j4 = j;
        return textListItem.copy(str, str2, j4, j3, z, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getListId() {
        return this.listId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final TextListItem copy(@NotNull String id, @NotNull String listId, long createdAt, long updatedAt, boolean isChecked, @NotNull String text) {
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(text, "text");
        return new TextListItem(id, listId, createdAt, updatedAt, isChecked, text);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextListItem)) {
            return false;
        }
        TextListItem textListItem = (TextListItem) other;
        return Intrinsics.c(this.id, textListItem.id) && Intrinsics.c(this.listId, textListItem.listId) && this.createdAt == textListItem.createdAt && this.updatedAt == textListItem.updatedAt && this.isChecked == textListItem.isChecked && Intrinsics.c(this.text, textListItem.text);
    }

    @Override // au.com.woolworths.shop.lists.data.model.ShoppingListItem
    public long getCreatedAt() {
        return this.createdAt;
    }

    @Override // au.com.woolworths.shop.lists.data.model.ShoppingListItem
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // au.com.woolworths.shop.lists.data.model.ShoppingListItem
    @NotNull
    public String getListId() {
        return this.listId;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Override // au.com.woolworths.shop.lists.data.model.ShoppingListItem
    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return this.text.hashCode() + b.e(b.b(b.b(b.c(this.id.hashCode() * 31, 31, this.listId), 31, this.createdAt), 31, this.updatedAt), 31, this.isChecked);
    }

    @Override // au.com.woolworths.shop.lists.data.model.ShoppingListItem
    public boolean isChecked() {
        return this.isChecked;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.listId;
        long j = this.createdAt;
        long j2 = this.updatedAt;
        boolean z = this.isChecked;
        String str3 = this.text;
        StringBuilder sbV = a.v("TextListItem(id=", str, ", listId=", str2, ", createdAt=");
        sbV.append(j);
        androidx.constraintlayout.core.state.a.A(sbV, ", updatedAt=", j2, ", isChecked=");
        sbV.append(z);
        sbV.append(", text=");
        sbV.append(str3);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.listId);
        dest.writeLong(this.createdAt);
        dest.writeLong(this.updatedAt);
        dest.writeInt(this.isChecked ? 1 : 0);
        dest.writeString(this.text);
    }

    public /* synthetic */ TextListItem(String str, String str2, long j, long j2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? false : z, str3);
    }
}
