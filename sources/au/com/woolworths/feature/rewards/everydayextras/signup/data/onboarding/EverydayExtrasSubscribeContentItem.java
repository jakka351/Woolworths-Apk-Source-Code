package au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.ParagraphTextItemInterface;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.TitleTextItemInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem;", "Landroid/os/Parcelable;", "HeaderImage", "TitleTextItem", "ParagraphTextItem", "IconListItemWithNestedItems", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem$HeaderImage;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem$IconListItemWithNestedItems;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem$ParagraphTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem$TitleTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EverydayExtrasSubscribeContentItem implements Parcelable {

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem$HeaderImage;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem;", "Landroid/os/Parcelable;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeaderImage extends EverydayExtrasSubscribeContentItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HeaderImage> CREATOR = new Creator();
        public final DownloadableAsset d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HeaderImage> {
            @Override // android.os.Parcelable.Creator
            public final HeaderImage createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new HeaderImage((DownloadableAsset) parcel.readParcelable(HeaderImage.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final HeaderImage[] newArray(int i) {
                return new HeaderImage[i];
            }
        }

        public HeaderImage(DownloadableAsset downloadableAsset) {
            Intrinsics.h(downloadableAsset, "downloadableAsset");
            this.d = downloadableAsset;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HeaderImage) && Intrinsics.c(this.d, ((HeaderImage) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "HeaderImage(downloadableAsset=" + this.d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeParcelable(this.d, i);
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem$IconListItemWithNestedItems;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem;", "Landroid/os/Parcelable;", "NestedItem", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IconListItemWithNestedItems extends EverydayExtrasSubscribeContentItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<IconListItemWithNestedItems> CREATOR = new Creator();
        public final String d;
        public final List e;
        public final String f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IconListItemWithNestedItems> {
            @Override // android.os.Parcelable.Creator
            public final IconListItemWithNestedItems createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = a.a(IconListItemWithNestedItems.class, parcel, arrayList, iA, 1);
                }
                return new IconListItemWithNestedItems(string, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IconListItemWithNestedItems[] newArray(int i) {
                return new IconListItemWithNestedItems[i];
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem$IconListItemWithNestedItems$NestedItem;", "Landroid/os/Parcelable;", "NestedMarkdownContentItem", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem$IconListItemWithNestedItems$NestedItem$NestedMarkdownContentItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class NestedItem implements Parcelable {

            @StabilityInferred
            @Parcelize
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem$IconListItemWithNestedItems$NestedItem$NestedMarkdownContentItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem$IconListItemWithNestedItems$NestedItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class NestedMarkdownContentItem extends NestedItem {

                @NotNull
                public static final Parcelable.Creator<NestedMarkdownContentItem> CREATOR = new Creator();
                public final String d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<NestedMarkdownContentItem> {
                    @Override // android.os.Parcelable.Creator
                    public final NestedMarkdownContentItem createFromParcel(Parcel parcel) {
                        Intrinsics.h(parcel, "parcel");
                        return new NestedMarkdownContentItem(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final NestedMarkdownContentItem[] newArray(int i) {
                        return new NestedMarkdownContentItem[i];
                    }
                }

                public NestedMarkdownContentItem(String content) {
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
                    return (obj instanceof NestedMarkdownContentItem) && Intrinsics.c(this.d, ((NestedMarkdownContentItem) obj).d);
                }

                public final int hashCode() {
                    return this.d.hashCode();
                }

                public final String toString() {
                    return YU.a.h("NestedMarkdownContentItem(content=", this.d, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.h(dest, "dest");
                    dest.writeString(this.d);
                }
            }
        }

        public IconListItemWithNestedItems(String str, List list, String combinedItemsContent) {
            Intrinsics.h(combinedItemsContent, "combinedItemsContent");
            this.d = str;
            this.e = list;
            this.f = combinedItemsContent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconListItemWithNestedItems)) {
                return false;
            }
            IconListItemWithNestedItems iconListItemWithNestedItems = (IconListItemWithNestedItems) obj;
            return Intrinsics.c(this.d, iconListItemWithNestedItems.d) && Intrinsics.c(this.e, iconListItemWithNestedItems.e) && Intrinsics.c(this.f, iconListItemWithNestedItems.f);
        }

        public final int hashCode() {
            String str = this.d;
            return this.f.hashCode() + b.d((str == null ? 0 : str.hashCode()) * 31, 31, this.e);
        }

        public final String toString() {
            return YU.a.o(a.s("IconListItemWithNestedItems(iconUrl=", this.d, ", items=", ", combinedItemsContent=", this.e), this.f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            Iterator itU = a.u(this.e, dest);
            while (itU.hasNext()) {
                dest.writeParcelable((Parcelable) itU.next(), i);
            }
            dest.writeString(this.f);
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem$ParagraphTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/ParagraphTextItemInterface;", "Landroid/os/Parcelable;", "Alignment", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ParagraphTextItem extends EverydayExtrasSubscribeContentItem implements ParagraphTextItemInterface, Parcelable {

        @NotNull
        public static final Parcelable.Creator<ParagraphTextItem> CREATOR = new Creator();
        public final String d;
        public final Alignment e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem$ParagraphTextItem$Alignment;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Alignment {
            public static final Alignment d;
            public static final Alignment e;
            public static final Alignment f;
            public static final /* synthetic */ Alignment[] g;
            public static final /* synthetic */ EnumEntries h;

            static {
                Alignment alignment = new Alignment("LEADING", 0);
                d = alignment;
                Alignment alignment2 = new Alignment("CENTER", 1);
                e = alignment2;
                Alignment alignment3 = new Alignment("TRAILING", 2);
                f = alignment3;
                Alignment[] alignmentArr = {alignment, alignment2, alignment3};
                g = alignmentArr;
                h = EnumEntriesKt.a(alignmentArr);
            }

            public static Alignment valueOf(String str) {
                return (Alignment) Enum.valueOf(Alignment.class, str);
            }

            public static Alignment[] values() {
                return (Alignment[]) g.clone();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ParagraphTextItem> {
            @Override // android.os.Parcelable.Creator
            public final ParagraphTextItem createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new ParagraphTextItem(parcel.readString(), Alignment.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final ParagraphTextItem[] newArray(int i) {
                return new ParagraphTextItem[i];
            }
        }

        public ParagraphTextItem(String content, Alignment alignment) {
            Intrinsics.h(content, "content");
            Intrinsics.h(alignment, "alignment");
            this.d = content;
            this.e = alignment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParagraphTextItem)) {
                return false;
            }
            ParagraphTextItem paragraphTextItem = (ParagraphTextItem) obj;
            return Intrinsics.c(this.d, paragraphTextItem.d) && this.e == paragraphTextItem.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "ParagraphTextItem(content=" + this.d + ", alignment=" + this.e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e.name());
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem$TitleTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeContentItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/TitleTextItemInterface;", "Landroid/os/Parcelable;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TitleTextItem extends EverydayExtrasSubscribeContentItem implements TitleTextItemInterface, Parcelable {

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
            return YU.a.h("TitleTextItem(content=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }
    }
}
