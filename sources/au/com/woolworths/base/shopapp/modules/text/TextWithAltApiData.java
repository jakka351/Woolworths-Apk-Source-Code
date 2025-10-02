package au.com.woolworths.base.shopapp.modules.text;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/text/TextWithAltApiData;", "Landroid/os/Parcelable;", "", TextBundle.TEXT_ENTRY, "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextWithAltApiData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TextWithAltApiData> CREATOR = new Creator();

    @SerializedName("altText")
    @NotNull
    private final String altText;

    @SerializedName(TextBundle.TEXT_ENTRY)
    @NotNull
    private final String text;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TextWithAltApiData> {
        @Override // android.os.Parcelable.Creator
        public final TextWithAltApiData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new TextWithAltApiData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextWithAltApiData[] newArray(int i) {
            return new TextWithAltApiData[i];
        }
    }

    public TextWithAltApiData(@NotNull String text, @NotNull String altText) {
        Intrinsics.h(text, "text");
        Intrinsics.h(altText, "altText");
        this.text = text;
        this.altText = altText;
    }

    /* renamed from: a, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    /* renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextWithAltApiData)) {
            return false;
        }
        TextWithAltApiData textWithAltApiData = (TextWithAltApiData) obj;
        return Intrinsics.c(this.text, textWithAltApiData.text) && Intrinsics.c(this.altText, textWithAltApiData.altText);
    }

    public final int hashCode() {
        return this.altText.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return a.j("TextWithAltApiData(text=", this.text, ", altText=", this.altText, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.text);
        dest.writeString(this.altText);
    }
}
