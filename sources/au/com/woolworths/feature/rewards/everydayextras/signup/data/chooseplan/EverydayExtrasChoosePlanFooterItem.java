package au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonActionType;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonInterface;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonStyle;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.NoteTextItemInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/chooseplan/EverydayExtrasChoosePlanFooterItem;", "", "Button", "NoteTextItem", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/chooseplan/EverydayExtrasChoosePlanFooterItem$Button;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/chooseplan/EverydayExtrasChoosePlanFooterItem$NoteTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EverydayExtrasChoosePlanFooterItem {

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/chooseplan/EverydayExtrasChoosePlanFooterItem$Button;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/chooseplan/EverydayExtrasChoosePlanFooterItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/EverydayExtrasButtonInterface;", "Landroid/os/Parcelable;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button implements EverydayExtrasChoosePlanFooterItem, EverydayExtrasButtonInterface, Parcelable {

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new Creator();
        public final String d;
        public final EverydayExtrasButtonActionType e;
        public final String f;
        public final EverydayExtrasButtonStyle g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Button(parcel.readString(), EverydayExtrasButtonActionType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : EverydayExtrasButtonStyle.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(String label, EverydayExtrasButtonActionType action, String str, EverydayExtrasButtonStyle everydayExtrasButtonStyle) {
            Intrinsics.h(label, "label");
            Intrinsics.h(action, "action");
            this.d = label;
            this.e = action;
            this.f = str;
            this.g = everydayExtrasButtonStyle;
        }

        @Override // au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonInterface
        /* renamed from: a, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonInterface
        /* renamed from: b, reason: from getter */
        public final String getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.d, button.d) && this.e == button.e && Intrinsics.c(this.f, button.f) && this.g == button.g;
        }

        @Override // au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonInterface
        /* renamed from: getAction, reason: from getter */
        public final EverydayExtrasButtonActionType getE() {
            return this.e;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
            String str = this.f;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            EverydayExtrasButtonStyle everydayExtrasButtonStyle = this.g;
            return iHashCode2 + (everydayExtrasButtonStyle != null ? everydayExtrasButtonStyle.hashCode() : 0);
        }

        public final String toString() {
            return "Button(label=" + this.d + ", action=" + this.e + ", actionUrl=" + this.f + ", style=" + this.g + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e.name());
            dest.writeString(this.f);
            EverydayExtrasButtonStyle everydayExtrasButtonStyle = this.g;
            if (everydayExtrasButtonStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(everydayExtrasButtonStyle.name());
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/chooseplan/EverydayExtrasChoosePlanFooterItem$NoteTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/chooseplan/EverydayExtrasChoosePlanFooterItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/NoteTextItemInterface;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoteTextItem implements EverydayExtrasChoosePlanFooterItem, NoteTextItemInterface {
        public final String d;

        public NoteTextItem(String str) {
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoteTextItem) && Intrinsics.c(this.d, ((NoteTextItem) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("NoteTextItem(content=", this.d, ")");
        }
    }
}
