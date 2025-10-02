package au.com.woolworths.feature.rewards.everydayextras.signup.data.landing;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.TitleTextItemInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraComparisonSectionItem;", "", "TitleTextItem", "BenefitsCompare", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraComparisonSectionItem$BenefitsCompare;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraComparisonSectionItem$TitleTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EverydayExtraComparisonSectionItem {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraComparisonSectionItem$BenefitsCompare;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraComparisonSectionItem;", "CompareTableColumnHeadings", "CompareTableColumnHeader", "CompareTableRow", "CompareTableRowValue", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BenefitsCompare implements EverydayExtraComparisonSectionItem {
        public final CompareTableColumnHeadings d;
        public final List e;

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraComparisonSectionItem$BenefitsCompare$CompareTableColumnHeader;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CompareTableColumnHeader {

            /* renamed from: a, reason: collision with root package name */
            public final String f6152a;
            public final String b;

            public CompareTableColumnHeader(String str, String str2) {
                this.f6152a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CompareTableColumnHeader)) {
                    return false;
                }
                CompareTableColumnHeader compareTableColumnHeader = (CompareTableColumnHeader) obj;
                return Intrinsics.c(this.f6152a, compareTableColumnHeader.f6152a) && Intrinsics.c(this.b, compareTableColumnHeader.b);
            }

            public final int hashCode() {
                String str = this.f6152a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return a.j("CompareTableColumnHeader(iconName=", this.f6152a, ", label=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraComparisonSectionItem$BenefitsCompare$CompareTableColumnHeadings;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CompareTableColumnHeadings {

            /* renamed from: a, reason: collision with root package name */
            public final CompareTableColumnHeader f6153a;
            public final CompareTableColumnHeader b;
            public final CompareTableColumnHeader c;

            public CompareTableColumnHeadings(CompareTableColumnHeader compareTableColumnHeader, CompareTableColumnHeader compareTableColumnHeader2, CompareTableColumnHeader compareTableColumnHeader3) {
                this.f6153a = compareTableColumnHeader;
                this.b = compareTableColumnHeader2;
                this.c = compareTableColumnHeader3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CompareTableColumnHeadings)) {
                    return false;
                }
                CompareTableColumnHeadings compareTableColumnHeadings = (CompareTableColumnHeadings) obj;
                return Intrinsics.c(this.f6153a, compareTableColumnHeadings.f6153a) && Intrinsics.c(this.b, compareTableColumnHeadings.b) && Intrinsics.c(this.c, compareTableColumnHeadings.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.f6153a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "CompareTableColumnHeadings(labelColumn=" + this.f6153a + ", rewardsColumn=" + this.b + ", extraColumn=" + this.c + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraComparisonSectionItem$BenefitsCompare$CompareTableRow;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CompareTableRow {

            /* renamed from: a, reason: collision with root package name */
            public final String f6154a;
            public final boolean b;
            public final List c;
            public final List d;
            public final List e;

            public CompareTableRow(String str, boolean z, List list, List list2, List list3) {
                this.f6154a = str;
                this.b = z;
                this.c = list;
                this.d = list2;
                this.e = list3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CompareTableRow)) {
                    return false;
                }
                CompareTableRow compareTableRow = (CompareTableRow) obj;
                return Intrinsics.c(this.f6154a, compareTableRow.f6154a) && this.b == compareTableRow.b && Intrinsics.c(this.c, compareTableRow.c) && Intrinsics.c(this.d, compareTableRow.d) && Intrinsics.c(this.e, compareTableRow.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + b.d(b.d(b.e(this.f6154a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            }

            public final String toString() {
                StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("CompareTableRow(rowId=", this.f6154a, ", altBackground=", ", labelValue=", this.b);
                au.com.woolworths.android.onesite.a.C(sbQ, this.c, ", rewardsValue=", this.d, ", extraValue=");
                return android.support.v4.media.session.a.t(sbQ, this.e, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraComparisonSectionItem$BenefitsCompare$CompareTableRowValue;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CompareTableRowValue {

            /* renamed from: a, reason: collision with root package name */
            public final String f6155a;
            public final String b;

            public CompareTableRowValue(String str, String str2) {
                this.f6155a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CompareTableRowValue)) {
                    return false;
                }
                CompareTableRowValue compareTableRowValue = (CompareTableRowValue) obj;
                return Intrinsics.c(this.f6155a, compareTableRowValue.f6155a) && Intrinsics.c(this.b, compareTableRowValue.b);
            }

            public final int hashCode() {
                String str = this.f6155a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return a.j("CompareTableRowValue(iconName=", this.f6155a, ", label=", this.b, ")");
            }
        }

        public BenefitsCompare(CompareTableColumnHeadings compareTableColumnHeadings, List list) {
            this.d = compareTableColumnHeadings;
            this.e = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BenefitsCompare)) {
                return false;
            }
            BenefitsCompare benefitsCompare = (BenefitsCompare) obj;
            return Intrinsics.c(this.d, benefitsCompare.d) && Intrinsics.c(this.e, benefitsCompare.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "BenefitsCompare(columnHeadings=" + this.d + ", rows=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraComparisonSectionItem$TitleTextItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraComparisonSectionItem;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/TitleTextItemInterface;", "Landroid/os/Parcelable;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TitleTextItem implements EverydayExtraComparisonSectionItem, TitleTextItemInterface, Parcelable {

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
