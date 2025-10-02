package au.com.woolworths.feature.rewards.everydayextras.signup.data.summary;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.DividerInterface;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonActionType;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonInterface;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonStyle;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasDividerType;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.ParagraphTextItemInterface;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.SmallIconListItemInterface;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.SubheadTextItemInterface;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.TitleTextItemInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem;", "", "TitleTextItem", "Divider", "SelectedPlan", "SmallIconListItem", "SubheadTextItem", "ParagraphTextItem", "CheckableTextItem", "WpayPayment", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$CheckableTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$Divider;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$ParagraphTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$SelectedPlan;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$SmallIconListItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$SubheadTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$TitleTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$WpayPayment;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EverydayExtrasSummaryContentItem {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$CheckableTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckableTextItem implements EverydayExtrasSummaryContentItem {
        public final String d;
        public final boolean e;
        public final String f;

        public CheckableTextItem(String str, String str2, boolean z) {
            this.d = str;
            this.e = z;
            this.f = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckableTextItem)) {
                return false;
            }
            CheckableTextItem checkableTextItem = (CheckableTextItem) obj;
            return Intrinsics.c(this.d, checkableTextItem.d) && this.e == checkableTextItem.e && Intrinsics.c(this.f, checkableTextItem.f);
        }

        public final int hashCode() {
            int iE = b.e(this.d.hashCode() * 31, 31, this.e);
            String str = this.f;
            return iE + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(androidx.constraintlayout.core.state.a.q("CheckableTextItem(content=", this.d, ", isRequired=", ", errorText=", this.e), this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$Divider;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/DividerInterface;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Divider implements EverydayExtrasSummaryContentItem, DividerInterface {
        public Divider() {
            EverydayExtrasDividerType everydayExtrasDividerType = EverydayExtrasDividerType.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Divider)) {
                return false;
            }
            EverydayExtrasDividerType everydayExtrasDividerType = EverydayExtrasDividerType.d;
            return true;
        }

        public final int hashCode() {
            return EverydayExtrasDividerType.d.hashCode();
        }

        public final String toString() {
            return "Divider(type=" + EverydayExtrasDividerType.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$ParagraphTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/ParagraphTextItemInterface;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ParagraphTextItem implements EverydayExtrasSummaryContentItem, ParagraphTextItemInterface {
        public final String d;

        public ParagraphTextItem(String str) {
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ParagraphTextItem) && Intrinsics.c(this.d, ((ParagraphTextItem) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("ParagraphTextItem(content=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$SelectedPlan;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem;", "Button", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectedPlan implements EverydayExtrasSummaryContentItem {
        public final String d;
        public final int e;
        public final Button f;

        @StabilityInferred
        @Parcelize
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$SelectedPlan$Button;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/EverydayExtrasButtonInterface;", "Landroid/os/Parcelable;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Button implements EverydayExtrasButtonInterface, Parcelable {

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

        public SelectedPlan(String str, int i, Button button) {
            this.d = str;
            this.e = i;
            this.f = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectedPlan)) {
                return false;
            }
            SelectedPlan selectedPlan = (SelectedPlan) obj;
            return Intrinsics.c(this.d, selectedPlan.d) && this.e == selectedPlan.e && Intrinsics.c(this.f, selectedPlan.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + b.a(this.e, this.d.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sbU = b.u("SelectedPlan(title=", this.e, this.d, ", price=", ", button=");
            sbU.append(this.f);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$SmallIconListItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/SmallIconListItemInterface;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SmallIconListItem implements EverydayExtrasSummaryContentItem, SmallIconListItemInterface {
        public final String d;
        public final String e;

        public SmallIconListItem(String str, String str2) {
            this.d = str;
            this.e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SmallIconListItem)) {
                return false;
            }
            SmallIconListItem smallIconListItem = (SmallIconListItem) obj;
            return Intrinsics.c(this.d, smallIconListItem.d) && Intrinsics.c(this.e, smallIconListItem.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return a.j("SmallIconListItem(iconUrl=", this.d, ", label=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$SubheadTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/SubheadTextItemInterface;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubheadTextItem implements EverydayExtrasSummaryContentItem, SubheadTextItemInterface {
        public final String d;

        public SubheadTextItem(String str) {
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubheadTextItem) && Intrinsics.c(this.d, ((SubheadTextItem) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("SubheadTextItem(content=", this.d, ")");
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$TitleTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/TitleTextItemInterface;", "Landroid/os/Parcelable;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TitleTextItem implements EverydayExtrasSummaryContentItem, TitleTextItemInterface, Parcelable {

        @NotNull
        public static final Parcelable.Creator<TitleTextItem> CREATOR = new Creator();
        public final String d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TitleTextItem> {
            @Override // android.os.Parcelable.Creator
            public final TitleTextItem createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new TitleTextItem(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TitleTextItem[] newArray(int i) {
                return new TitleTextItem[i];
            }
        }

        public TitleTextItem(String content) {
            Intrinsics.h(content, "content");
            this.d = content;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TitleTextItem) && Intrinsics.c(this.d, ((TitleTextItem) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("TitleTextItem(content=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$WpayPayment;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem;", "Error", "CardError", "ErrorItem", "ExternalSystemError", "CardProviderIcon", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WpayPayment implements EverydayExtrasSummaryContentItem {
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final Error h;
        public final String i;
        public final List j;

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$WpayPayment$CardError;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CardError {

            /* renamed from: a, reason: collision with root package name */
            public final String f6167a;
            public final List b;

            public CardError(String str, List list) {
                this.f6167a = str;
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CardError)) {
                    return false;
                }
                CardError cardError = (CardError) obj;
                return Intrinsics.c(this.f6167a, cardError.f6167a) && Intrinsics.c(this.b, cardError.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f6167a.hashCode() * 31);
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.i("CardError(title=", this.f6167a, ", items=", ")", this.b);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$WpayPayment$CardProviderIcon;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CardProviderIcon {

            /* renamed from: a, reason: collision with root package name */
            public final String f6168a;
            public final String b;

            public CardProviderIcon(String str, String str2) {
                this.f6168a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CardProviderIcon)) {
                    return false;
                }
                CardProviderIcon cardProviderIcon = (CardProviderIcon) obj;
                return Intrinsics.c(this.f6168a, cardProviderIcon.f6168a) && Intrinsics.c(this.b, cardProviderIcon.b);
            }

            public final int hashCode() {
                int iHashCode = this.f6168a.hashCode() * 31;
                String str = this.b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return a.j("CardProviderIcon(iconUrl=", this.f6168a, ", altText=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$WpayPayment$Error;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error {

            /* renamed from: a, reason: collision with root package name */
            public final CardError f6169a;
            public final ExternalSystemError b;

            public Error(CardError cardError, ExternalSystemError externalSystemError) {
                this.f6169a = cardError;
                this.b = externalSystemError;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.c(this.f6169a, error.f6169a) && Intrinsics.c(this.b, error.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f6169a.hashCode() * 31);
            }

            public final String toString() {
                return "Error(cardErrors=" + this.f6169a + ", externalSystemError=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$WpayPayment$ErrorItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ErrorItem {

            /* renamed from: a, reason: collision with root package name */
            public final String f6170a;
            public final String b;
            public final String c;

            public ErrorItem(String str, String str2, String str3) {
                this.f6170a = str;
                this.b = str2;
                this.c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ErrorItem)) {
                    return false;
                }
                ErrorItem errorItem = (ErrorItem) obj;
                return Intrinsics.c(this.f6170a, errorItem.f6170a) && Intrinsics.c(this.b, errorItem.b) && Intrinsics.c(this.c, errorItem.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + b.c(this.f6170a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                return a.o(a.v("ErrorItem(key=", this.f6170a, ", value=", this.b, ", domId="), this.c, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryContentItem$WpayPayment$ExternalSystemError;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExternalSystemError {

            /* renamed from: a, reason: collision with root package name */
            public final String f6171a;
            public final String b;

            public ExternalSystemError(String str, String str2) {
                this.f6171a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExternalSystemError)) {
                    return false;
                }
                ExternalSystemError externalSystemError = (ExternalSystemError) obj;
                return Intrinsics.c(this.f6171a, externalSystemError.f6171a) && Intrinsics.c(this.b, externalSystemError.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f6171a.hashCode() * 31);
            }

            public final String toString() {
                return a.j("ExternalSystemError(title=", this.f6171a, ", value=", this.b, ")");
            }
        }

        public WpayPayment(String str, String str2, String str3, String str4, Error error, String str5, List list) {
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = error;
            this.i = str5;
            this.j = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WpayPayment)) {
                return false;
            }
            WpayPayment wpayPayment = (WpayPayment) obj;
            return Intrinsics.c(this.d, wpayPayment.d) && Intrinsics.c(this.e, wpayPayment.e) && Intrinsics.c(this.f, wpayPayment.f) && Intrinsics.c(this.g, wpayPayment.g) && Intrinsics.c(this.h, wpayPayment.h) && Intrinsics.c(this.i, wpayPayment.i) && Intrinsics.c(this.j, wpayPayment.j);
        }

        public final int hashCode() {
            return this.j.hashCode() + b.c((this.h.hashCode() + b.c(b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i);
        }

        public final String toString() {
            StringBuilder sbV = a.v("WpayPayment(titleIcon=", this.d, ", title=", this.e, ", label=");
            androidx.constraintlayout.core.state.a.B(sbV, this.f, ", labelIcon=", this.g, ", errors=");
            sbV.append(this.h);
            sbV.append(", cardProvidersLabel=");
            sbV.append(this.i);
            sbV.append(", cardProviders=");
            return android.support.v4.media.session.a.t(sbV, this.j, ")");
        }
    }
}
