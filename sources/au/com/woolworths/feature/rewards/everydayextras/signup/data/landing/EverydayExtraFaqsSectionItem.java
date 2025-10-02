package au.com.woolworths.feature.rewards.everydayextras.signup.data.landing;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.DividerInterface;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasDividerType;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.NoteTextItemInterface;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.SubheadTextItemInterface;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.TitleTextItemInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem;", "", "TitleTextItem", "SubheadTextItem", "NoteTextItem", "Divider", "FaqsFaqUiItem", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem$Divider;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem$FaqsFaqUiItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem$NoteTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem$SubheadTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem$TitleTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EverydayExtraFaqsSectionItem {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem$Divider;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/DividerInterface;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Divider implements EverydayExtraFaqsSectionItem, DividerInterface {
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem$FaqsFaqUiItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem;", "Item", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FaqsFaqUiItem implements EverydayExtraFaqsSectionItem {
        public final Item d;
        public final boolean e;

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem$FaqsFaqUiItem$Item;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Item {

            /* renamed from: a, reason: collision with root package name */
            public final String f6156a;
            public final String b;
            public final String c;

            public Item(String str, String str2, String str3) {
                this.f6156a = str;
                this.b = str2;
                this.c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Item)) {
                    return false;
                }
                Item item = (Item) obj;
                return Intrinsics.c(this.f6156a, item.f6156a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c);
            }

            public final int hashCode() {
                int iC = b.c(this.f6156a.hashCode() * 31, 31, this.b);
                String str = this.c;
                return iC + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return a.o(a.v("Item(id=", this.f6156a, ", question=", this.b, ", markdownAnswer="), this.c, ")");
            }
        }

        public FaqsFaqUiItem(Item item, boolean z) {
            this.d = item;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FaqsFaqUiItem)) {
                return false;
            }
            FaqsFaqUiItem faqsFaqUiItem = (FaqsFaqUiItem) obj;
            return Intrinsics.c(this.d, faqsFaqUiItem.d) && this.e == faqsFaqUiItem.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "FaqsFaqUiItem(item=" + this.d + ", expanded=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem$NoteTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/NoteTextItemInterface;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoteTextItem implements EverydayExtraFaqsSectionItem, NoteTextItemInterface {
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

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem$SubheadTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/SubheadTextItemInterface;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubheadTextItem implements EverydayExtraFaqsSectionItem, SubheadTextItemInterface {
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
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem$TitleTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/TitleTextItemInterface;", "Landroid/os/Parcelable;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TitleTextItem implements EverydayExtraFaqsSectionItem, TitleTextItemInterface, Parcelable {

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
}
