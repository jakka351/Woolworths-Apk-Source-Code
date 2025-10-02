package au.com.woolworths.foundation.shop.prompt.handler.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.sdui.common.IconAsset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/data/PromptBottomSheet;", "Lau/com/woolworths/foundation/shop/prompt/handler/data/PromptData;", "Landroid/os/Parcelable;", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PromptBottomSheet implements PromptData, Parcelable {

    @NotNull
    public static final Parcelable.Creator<PromptBottomSheet> CREATOR = new Creator();
    public final IconAsset d;
    public final String e;
    public final String f;
    public final List g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromptBottomSheet> {
        @Override // android.os.Parcelable.Creator
        public final PromptBottomSheet createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            IconAsset iconAsset = (IconAsset) parcel.readParcelable(PromptBottomSheet.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = a.a(PromptBottomSheet.class, parcel, arrayList, iA, 1);
            }
            return new PromptBottomSheet(iconAsset, string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PromptBottomSheet[] newArray(int i) {
            return new PromptBottomSheet[i];
        }
    }

    public PromptBottomSheet(IconAsset iconAsset, String title, String body, List list) {
        Intrinsics.h(title, "title");
        Intrinsics.h(body, "body");
        this.d = iconAsset;
        this.e = title;
        this.f = body;
        this.g = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptBottomSheet)) {
            return false;
        }
        PromptBottomSheet promptBottomSheet = (PromptBottomSheet) obj;
        return Intrinsics.c(this.d, promptBottomSheet.d) && Intrinsics.c(this.e, promptBottomSheet.e) && Intrinsics.c(this.f, promptBottomSheet.f) && Intrinsics.c(this.g, promptBottomSheet.g);
    }

    public final int hashCode() {
        IconAsset iconAsset = this.d;
        return this.g.hashCode() + b.c(b.c((iconAsset == null ? 0 : iconAsset.hashCode()) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "PromptBottomSheet(icon=" + this.d + ", title=" + this.e + ", body=" + this.f + ", ctas=" + this.g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Iterator itU = a.u(this.g, dest);
        while (itU.hasNext()) {
            dest.writeParcelable((Parcelable) itU.next(), i);
        }
    }
}
