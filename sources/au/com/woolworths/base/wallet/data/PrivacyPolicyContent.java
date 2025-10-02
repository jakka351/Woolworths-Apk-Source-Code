package au.com.woolworths.base.wallet.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
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

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/base/wallet/data/PrivacyPolicyContent;", "Landroid/os/Parcelable;", "", "title", "message", "", "Lau/com/woolworths/base/wallet/data/MessageModelCta;", "actionItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Ljava/util/List;", "a", "()Ljava/util/List;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PrivacyPolicyContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PrivacyPolicyContent> CREATOR = new Creator();

    @SerializedName("actionItems")
    @Nullable
    private final List<MessageModelCta> actionItems;

    @SerializedName("message")
    @Nullable
    private final String message;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PrivacyPolicyContent> {
        @Override // android.os.Parcelable.Creator
        public final PrivacyPolicyContent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = a.e(MessageModelCta.CREATOR, parcel, arrayList2, iE, 1);
                }
                arrayList = arrayList2;
            }
            return new PrivacyPolicyContent(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivacyPolicyContent[] newArray(int i) {
            return new PrivacyPolicyContent[i];
        }
    }

    public PrivacyPolicyContent(@NotNull String title, @Nullable String str, @Nullable List<MessageModelCta> list) {
        Intrinsics.h(title, "title");
        this.title = title;
        this.message = str;
        this.actionItems = list;
    }

    /* renamed from: a, reason: from getter */
    public final List getActionItems() {
        return this.actionItems;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
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
        if (!(obj instanceof PrivacyPolicyContent)) {
            return false;
        }
        PrivacyPolicyContent privacyPolicyContent = (PrivacyPolicyContent) obj;
        return Intrinsics.c(this.title, privacyPolicyContent.title) && Intrinsics.c(this.message, privacyPolicyContent.message) && Intrinsics.c(this.actionItems, privacyPolicyContent.actionItems);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<MessageModelCta> list = this.actionItems;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.message;
        return android.support.v4.media.session.a.t(YU.a.v("PrivacyPolicyContent(title=", str, ", message=", str2, ", actionItems="), this.actionItems, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.message);
        List<MessageModelCta> list = this.actionItems;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<MessageModelCta> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i);
        }
    }
}
