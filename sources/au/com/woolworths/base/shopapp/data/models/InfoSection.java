package au.com.woolworths.base.shopapp.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/base/shopapp/data/models/InfoSection;", "Landroid/os/Parcelable;", "", "title", "", "Lau/com/woolworths/base/shopapp/data/models/InfoSectionItem;", "items", "Lau/com/woolworths/base/shopapp/data/models/InfoSectionFooter;", "footer", "<init>", "(Ljava/lang/String;Ljava/util/List;Lau/com/woolworths/base/shopapp/data/models/InfoSectionFooter;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lau/com/woolworths/base/shopapp/data/models/InfoSectionFooter;", "a", "()Lau/com/woolworths/base/shopapp/data/models/InfoSectionFooter;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InfoSection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InfoSection> CREATOR = new Creator();

    @SerializedName("footer")
    @Nullable
    private final InfoSectionFooter footer;

    @SerializedName("items")
    @NotNull
    private final List<InfoSectionItem> items;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InfoSection> {
        @Override // android.os.Parcelable.Creator
        public final InfoSection createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(InfoSectionItem.CREATOR, parcel, arrayList, iE, 1);
            }
            return new InfoSection(string, arrayList, parcel.readInt() == 0 ? null : InfoSectionFooter.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final InfoSection[] newArray(int i) {
            return new InfoSection[i];
        }
    }

    public InfoSection(@NotNull String title, @NotNull List<InfoSectionItem> items, @Nullable InfoSectionFooter infoSectionFooter) {
        Intrinsics.h(title, "title");
        Intrinsics.h(items, "items");
        this.title = title;
        this.items = items;
        this.footer = infoSectionFooter;
    }

    /* renamed from: a, reason: from getter */
    public final InfoSectionFooter getFooter() {
        return this.footer;
    }

    /* renamed from: b, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoSection)) {
            return false;
        }
        InfoSection infoSection = (InfoSection) obj;
        return Intrinsics.c(this.title, infoSection.title) && Intrinsics.c(this.items, infoSection.items) && Intrinsics.c(this.footer, infoSection.footer);
    }

    public final int hashCode() {
        int iD = b.d(this.title.hashCode() * 31, 31, this.items);
        InfoSectionFooter infoSectionFooter = this.footer;
        return iD + (infoSectionFooter == null ? 0 : infoSectionFooter.hashCode());
    }

    public final String toString() {
        String str = this.title;
        List<InfoSectionItem> list = this.items;
        InfoSectionFooter infoSectionFooter = this.footer;
        StringBuilder sbS = au.com.woolworths.android.onesite.a.s("InfoSection(title=", str, ", items=", ", footer=", list);
        sbS.append(infoSectionFooter);
        sbS.append(")");
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.items, dest);
        while (itU.hasNext()) {
            ((InfoSectionItem) itU.next()).writeToParcel(dest, i);
        }
        InfoSectionFooter infoSectionFooter = this.footer;
        if (infoSectionFooter == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            infoSectionFooter.writeToParcel(dest, i);
        }
    }
}
