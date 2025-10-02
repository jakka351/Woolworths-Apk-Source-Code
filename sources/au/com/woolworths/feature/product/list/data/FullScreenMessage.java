package au.com.woolworths.feature.product.list.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.graphql.MappedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lau/com/woolworths/feature/product/list/data/FullScreenMessage;", "Lau/com/woolworths/feature/product/list/data/CustomMessage;", "Landroid/os/Parcelable;", "title", "", lqlqqlq.mmm006Dm006Dm, "messageAsset", "Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "buttons", "", "Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/DownloadableAsset;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getMessageAsset", "()Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "getButtons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FullScreenMessage implements CustomMessage, Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FullScreenMessage> CREATOR = new Creator();

    @MappedName
    @NotNull
    private final List<ButtonApiData> buttons;

    @MappedName
    @Nullable
    private final String description;

    @Nullable
    private final DownloadableAsset messageAsset;

    @MappedName
    @Nullable
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FullScreenMessage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FullScreenMessage createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            DownloadableAsset downloadableAsset = (DownloadableAsset) parcel.readParcelable(FullScreenMessage.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = a.a(FullScreenMessage.class, parcel, arrayList, iA, 1);
            }
            return new FullScreenMessage(string, string2, downloadableAsset, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FullScreenMessage[] newArray(int i) {
            return new FullScreenMessage[i];
        }
    }

    public FullScreenMessage(@Nullable String str, @Nullable String str2, @Nullable DownloadableAsset downloadableAsset, @NotNull List<ButtonApiData> buttons) {
        Intrinsics.h(buttons, "buttons");
        this.title = str;
        this.description = str2;
        this.messageAsset = downloadableAsset;
        this.buttons = buttons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FullScreenMessage copy$default(FullScreenMessage fullScreenMessage, String str, String str2, DownloadableAsset downloadableAsset, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fullScreenMessage.title;
        }
        if ((i & 2) != 0) {
            str2 = fullScreenMessage.description;
        }
        if ((i & 4) != 0) {
            downloadableAsset = fullScreenMessage.messageAsset;
        }
        if ((i & 8) != 0) {
            list = fullScreenMessage.buttons;
        }
        return fullScreenMessage.copy(str, str2, downloadableAsset, list);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final DownloadableAsset getMessageAsset() {
        return this.messageAsset;
    }

    @NotNull
    public final List<ButtonApiData> component4() {
        return this.buttons;
    }

    @NotNull
    public final FullScreenMessage copy(@Nullable String title, @Nullable String description, @Nullable DownloadableAsset messageAsset, @NotNull List<ButtonApiData> buttons) {
        Intrinsics.h(buttons, "buttons");
        return new FullScreenMessage(title, description, messageAsset, buttons);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullScreenMessage)) {
            return false;
        }
        FullScreenMessage fullScreenMessage = (FullScreenMessage) other;
        return Intrinsics.c(this.title, fullScreenMessage.title) && Intrinsics.c(this.description, fullScreenMessage.description) && Intrinsics.c(this.messageAsset, fullScreenMessage.messageAsset) && Intrinsics.c(this.buttons, fullScreenMessage.buttons);
    }

    @NotNull
    public final List<ButtonApiData> getButtons() {
        return this.buttons;
    }

    @Override // au.com.woolworths.feature.product.list.data.CustomMessage
    @Nullable
    public String getDescription() {
        return this.description;
    }

    @Nullable
    public final DownloadableAsset getMessageAsset() {
        return this.messageAsset;
    }

    @Override // au.com.woolworths.feature.product.list.data.CustomMessage
    @Nullable
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DownloadableAsset downloadableAsset = this.messageAsset;
        return this.buttons.hashCode() + ((iHashCode2 + (downloadableAsset != null ? downloadableAsset.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.description;
        DownloadableAsset downloadableAsset = this.messageAsset;
        List<ButtonApiData> list = this.buttons;
        StringBuilder sbV = YU.a.v("FullScreenMessage(title=", str, ", description=", str2, ", messageAsset=");
        sbV.append(downloadableAsset);
        sbV.append(", buttons=");
        sbV.append(list);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeParcelable(this.messageAsset, flags);
        Iterator itU = a.u(this.buttons, dest);
        while (itU.hasNext()) {
            dest.writeParcelable((Parcelable) itU.next(), flags);
        }
    }
}
