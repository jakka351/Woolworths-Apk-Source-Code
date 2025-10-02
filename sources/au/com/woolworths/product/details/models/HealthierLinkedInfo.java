package au.com.woolworths.product.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006-"}, d2 = {"Lau/com/woolworths/product/details/models/HealthierLinkedInfo;", "Landroid/os/Parcelable;", "buttonLabel", "", "title", "content", "links", "", "Lau/com/woolworths/product/details/models/HealthierLink;", "markdownContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getButtonLabel", "()Ljava/lang/String;", "setButtonLabel", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getContent", "setContent", "getLinks", "()Ljava/util/List;", "setLinks", "(Ljava/util/List;)V", "getMarkdownContent", "setMarkdownContent", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HealthierLinkedInfo implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<HealthierLinkedInfo> CREATOR = new Creator();

    @NotNull
    private String buttonLabel;

    @NotNull
    private String content;

    @NotNull
    private List<HealthierLink> links;

    @Nullable
    private String markdownContent;

    @NotNull
    private String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HealthierLinkedInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthierLinkedInfo createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(HealthierLink.CREATOR, parcel, arrayList, iE, 1);
            }
            return new HealthierLinkedInfo(string, string2, string3, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthierLinkedInfo[] newArray(int i) {
            return new HealthierLinkedInfo[i];
        }
    }

    public HealthierLinkedInfo(@NotNull String buttonLabel, @NotNull String title, @NotNull String content, @NotNull List<HealthierLink> links, @Nullable String str) {
        Intrinsics.h(buttonLabel, "buttonLabel");
        Intrinsics.h(title, "title");
        Intrinsics.h(content, "content");
        Intrinsics.h(links, "links");
        this.buttonLabel = buttonLabel;
        this.title = title;
        this.content = content;
        this.links = links;
        this.markdownContent = str;
    }

    public static /* synthetic */ HealthierLinkedInfo copy$default(HealthierLinkedInfo healthierLinkedInfo, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthierLinkedInfo.buttonLabel;
        }
        if ((i & 2) != 0) {
            str2 = healthierLinkedInfo.title;
        }
        if ((i & 4) != 0) {
            str3 = healthierLinkedInfo.content;
        }
        if ((i & 8) != 0) {
            list = healthierLinkedInfo.links;
        }
        if ((i & 16) != 0) {
            str4 = healthierLinkedInfo.markdownContent;
        }
        String str5 = str4;
        String str6 = str3;
        return healthierLinkedInfo.copy(str, str2, str6, list, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final List<HealthierLink> component4() {
        return this.links;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getMarkdownContent() {
        return this.markdownContent;
    }

    @NotNull
    public final HealthierLinkedInfo copy(@NotNull String buttonLabel, @NotNull String title, @NotNull String content, @NotNull List<HealthierLink> links, @Nullable String markdownContent) {
        Intrinsics.h(buttonLabel, "buttonLabel");
        Intrinsics.h(title, "title");
        Intrinsics.h(content, "content");
        Intrinsics.h(links, "links");
        return new HealthierLinkedInfo(buttonLabel, title, content, links, markdownContent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthierLinkedInfo)) {
            return false;
        }
        HealthierLinkedInfo healthierLinkedInfo = (HealthierLinkedInfo) other;
        return Intrinsics.c(this.buttonLabel, healthierLinkedInfo.buttonLabel) && Intrinsics.c(this.title, healthierLinkedInfo.title) && Intrinsics.c(this.content, healthierLinkedInfo.content) && Intrinsics.c(this.links, healthierLinkedInfo.links) && Intrinsics.c(this.markdownContent, healthierLinkedInfo.markdownContent);
    }

    @NotNull
    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final List<HealthierLink> getLinks() {
        return this.links;
    }

    @Nullable
    public final String getMarkdownContent() {
        return this.markdownContent;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD = b.d(b.c(b.c(this.buttonLabel.hashCode() * 31, 31, this.title), 31, this.content), 31, this.links);
        String str = this.markdownContent;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final void setButtonLabel(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.buttonLabel = str;
    }

    public final void setContent(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.content = str;
    }

    public final void setLinks(@NotNull List<HealthierLink> list) {
        Intrinsics.h(list, "<set-?>");
        this.links = list;
    }

    public final void setMarkdownContent(@Nullable String str) {
        this.markdownContent = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        String str = this.buttonLabel;
        String str2 = this.title;
        String str3 = this.content;
        List<HealthierLink> list = this.links;
        String str4 = this.markdownContent;
        StringBuilder sbV = YU.a.v("HealthierLinkedInfo(buttonLabel=", str, ", title=", str2, ", content=");
        au.com.woolworths.android.onesite.a.B(sbV, str3, ", links=", list, ", markdownContent=");
        return YU.a.o(sbV, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.buttonLabel);
        dest.writeString(this.title);
        dest.writeString(this.content);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.links, dest);
        while (itU.hasNext()) {
            ((HealthierLink) itU.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.markdownContent);
    }
}
