package au.com.woolworths.product.details.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.MappedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006 "}, d2 = {"Lau/com/woolworths/product/details/models/FormattedContentData;", "Landroid/os/Parcelable;", "title", "", "content", "framedContent", "isCollapsable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getContent", "getFramedContent", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FormattedContentData implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<FormattedContentData> CREATOR = new Creator();

    @NotNull
    private final String content;

    @Nullable
    private final String framedContent;
    private final boolean isCollapsable;

    @MappedName
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FormattedContentData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormattedContentData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new FormattedContentData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormattedContentData[] newArray(int i) {
            return new FormattedContentData[i];
        }
    }

    public FormattedContentData(@NotNull String title, @NotNull String content, @Nullable String str, boolean z) {
        Intrinsics.h(title, "title");
        Intrinsics.h(content, "content");
        this.title = title;
        this.content = content;
        this.framedContent = str;
        this.isCollapsable = z;
    }

    public static /* synthetic */ FormattedContentData copy$default(FormattedContentData formattedContentData, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formattedContentData.title;
        }
        if ((i & 2) != 0) {
            str2 = formattedContentData.content;
        }
        if ((i & 4) != 0) {
            str3 = formattedContentData.framedContent;
        }
        if ((i & 8) != 0) {
            z = formattedContentData.isCollapsable;
        }
        return formattedContentData.copy(str, str2, str3, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getFramedContent() {
        return this.framedContent;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCollapsable() {
        return this.isCollapsable;
    }

    @NotNull
    public final FormattedContentData copy(@NotNull String title, @NotNull String content, @Nullable String framedContent, boolean isCollapsable) {
        Intrinsics.h(title, "title");
        Intrinsics.h(content, "content");
        return new FormattedContentData(title, content, framedContent, isCollapsable);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormattedContentData)) {
            return false;
        }
        FormattedContentData formattedContentData = (FormattedContentData) other;
        return Intrinsics.c(this.title, formattedContentData.title) && Intrinsics.c(this.content, formattedContentData.content) && Intrinsics.c(this.framedContent, formattedContentData.framedContent) && this.isCollapsable == formattedContentData.isCollapsable;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getFramedContent() {
        return this.framedContent;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iC = b.c(this.title.hashCode() * 31, 31, this.content);
        String str = this.framedContent;
        return Boolean.hashCode(this.isCollapsable) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean isCollapsable() {
        return this.isCollapsable;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.content;
        return d.r(this.framedContent, ", isCollapsable=", ")", a.v("FormattedContentData(title=", str, ", content=", str2, ", framedContent="), this.isCollapsable);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.content);
        dest.writeString(this.framedContent);
        dest.writeInt(this.isCollapsable ? 1 : 0);
    }
}
