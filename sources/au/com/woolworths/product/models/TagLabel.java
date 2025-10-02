package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/product/models/TagLabel;", "Landroid/os/Parcelable;", TextBundle.TEXT_ENTRY, "", "style", "Lau/com/woolworths/product/models/TagStyle;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/product/models/TagStyle;)V", "getText", "()Ljava/lang/String;", "getStyle", "()Lau/com/woolworths/product/models/TagStyle;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TagLabel implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<TagLabel> CREATOR = new Creator();

    @SerializedName("style")
    @Nullable
    private final TagStyle style;

    @SerializedName(TextBundle.TEXT_ENTRY)
    @NotNull
    private final String text;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TagLabel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagLabel createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new TagLabel(parcel.readString(), parcel.readInt() == 0 ? null : TagStyle.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagLabel[] newArray(int i) {
            return new TagLabel[i];
        }
    }

    public TagLabel(@NotNull String text, @Nullable TagStyle tagStyle) {
        Intrinsics.h(text, "text");
        this.text = text;
        this.style = tagStyle;
    }

    public static /* synthetic */ TagLabel copy$default(TagLabel tagLabel, String str, TagStyle tagStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagLabel.text;
        }
        if ((i & 2) != 0) {
            tagStyle = tagLabel.style;
        }
        return tagLabel.copy(str, tagStyle);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final TagStyle getStyle() {
        return this.style;
    }

    @NotNull
    public final TagLabel copy(@NotNull String text, @Nullable TagStyle style) {
        Intrinsics.h(text, "text");
        return new TagLabel(text, style);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagLabel)) {
            return false;
        }
        TagLabel tagLabel = (TagLabel) other;
        return Intrinsics.c(this.text, tagLabel.text) && this.style == tagLabel.style;
    }

    @Nullable
    public final TagStyle getStyle() {
        return this.style;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        TagStyle tagStyle = this.style;
        return iHashCode + (tagStyle == null ? 0 : tagStyle.hashCode());
    }

    @NotNull
    public String toString() {
        return "TagLabel(text=" + this.text + ", style=" + this.style + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.text);
        TagStyle tagStyle = this.style;
        if (tagStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tagStyle.writeToParcel(dest, flags);
        }
    }
}
