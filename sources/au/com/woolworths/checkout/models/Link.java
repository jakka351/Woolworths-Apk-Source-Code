package au.com.woolworths.checkout.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
public class Link implements Parcelable {
    public static final Parcelable.Creator<Link> CREATOR = new Parcelable.Creator<Link>() { // from class: au.com.woolworths.checkout.models.Link.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Link createFromParcel(Parcel parcel) {
            return new Link(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Link[] newArray(int i) {
            return new Link[i];
        }
    };

    @SerializedName("alt")
    private String alt;

    @SerializedName("href")
    private String href;

    @SerializedName("rel")
    private String rel;

    @SerializedName(TextBundle.TEXT_ENTRY)
    private String text;

    public Link() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAlt() {
        return this.alt;
    }

    public String getHref() {
        return this.href;
    }

    public String getRel() {
        return this.rel;
    }

    public String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.rel);
        parcel.writeString(this.href);
        parcel.writeString(this.alt);
        parcel.writeString(this.text);
    }

    public Link(Parcel parcel) {
        this.rel = parcel.readString();
        this.href = parcel.readString();
        this.alt = parcel.readString();
        this.text = parcel.readString();
    }
}
