package au.com.woolworths.shop.ratingsandreviews.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem;", "Landroid/os/Parcelable;", "Rating", "Title", "Recommendation", "Info", "Body", "Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem$Body;", "Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem$Info;", "Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem$Rating;", "Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem$Recommendation;", "Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem$Title;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ReviewItem extends Parcelable {

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem$Body;", "Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Body implements ReviewItem {

        @NotNull
        public static final Parcelable.Creator<Body> CREATOR = new Creator();
        public final String d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Body> {
            @Override // android.os.Parcelable.Creator
            public final Body createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Body(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Body[] newArray(int i) {
                return new Body[i];
            }
        }

        public Body(String content) {
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
            return (obj instanceof Body) && Intrinsics.c(this.d, ((Body) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("Body(content=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem$Info;", "Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Info implements ReviewItem {

        @NotNull
        public static final Parcelable.Creator<Info> CREATOR = new Creator();
        public final String d;
        public final String e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Info> {
            @Override // android.os.Parcelable.Creator
            public final Info createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Info(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Info[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info(String userName, String createdAt) {
            Intrinsics.h(userName, "userName");
            Intrinsics.h(createdAt, "createdAt");
            this.d = userName;
            this.e = createdAt;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return Intrinsics.c(this.d, info.d) && Intrinsics.c(this.e, info.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Info(userName=", this.d, ", createdAt=", this.e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem$Rating;", "Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Rating implements ReviewItem {

        @NotNull
        public static final Parcelable.Creator<Rating> CREATOR = new Creator();
        public final int d;
        public final int e;
        public final String f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Rating> {
            @Override // android.os.Parcelable.Creator
            public final Rating createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Rating(parcel.readInt(), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Rating[] newArray(int i) {
                return new Rating[i];
            }
        }

        public Rating(int i, int i2, String str) {
            this.d = i;
            this.e = i2;
            this.f = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rating)) {
                return false;
            }
            Rating rating = (Rating) obj;
            return this.d == rating.d && this.e == rating.e && Intrinsics.c(this.f, rating.f);
        }

        public final int hashCode() {
            int iA = b.a(this.e, Integer.hashCode(this.d) * 31, 31);
            String str = this.f;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(a.q(this.d, this.e, "Rating(rating=", ", maximumRating=", ", text="), this.f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeInt(this.d);
            dest.writeInt(this.e);
            dest.writeString(this.f);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem$Recommendation;", "Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Recommendation implements ReviewItem {

        @NotNull
        public static final Parcelable.Creator<Recommendation> CREATOR = new Creator();
        public final String d;
        public final String e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Recommendation> {
            @Override // android.os.Parcelable.Creator
            public final Recommendation createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Recommendation(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Recommendation[] newArray(int i) {
                return new Recommendation[i];
            }
        }

        public Recommendation(String str, String str2) {
            this.d = str;
            this.e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Recommendation)) {
                return false;
            }
            Recommendation recommendation = (Recommendation) obj;
            return Intrinsics.c(this.d, recommendation.d) && Intrinsics.c(this.e, recommendation.e);
        }

        public final int hashCode() {
            String str = this.d;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.e;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.j("Recommendation(text=", this.d, ", iconUrl=", this.e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem$Title;", "Lau/com/woolworths/shop/ratingsandreviews/data/ReviewItem;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Title implements ReviewItem {

        @NotNull
        public static final Parcelable.Creator<Title> CREATOR = new Creator();
        public final String d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Title> {
            @Override // android.os.Parcelable.Creator
            public final Title createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Title(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Title[] newArray(int i) {
                return new Title[i];
            }
        }

        public Title(String title) {
            Intrinsics.h(title, "title");
            this.d = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Title) && Intrinsics.c(this.d, ((Title) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("Title(title=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }
    }
}
