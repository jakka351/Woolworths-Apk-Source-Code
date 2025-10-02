package au.com.woolworths.android.onesite.models.text;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.PluralsRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0006\u0010\u0013\u001a\u00020\u0003J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0019"}, d2 = {"Lau/com/woolworths/android/onesite/models/text/PluralResText;", "Lau/com/woolworths/android/onesite/models/text/Text;", "pluralStringRes", "", "quantity", "<init>", "(II)V", "getPluralStringRes", "()I", "getQuantity", "getText", "", "context", "Landroid/content/Context;", "equals", "", "other", "", "hashCode", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PluralResText implements Text {

    @NotNull
    public static final Parcelable.Creator<PluralResText> CREATOR = new Creator();
    private final int pluralStringRes;
    private final int quantity;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PluralResText> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PluralResText createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new PluralResText(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PluralResText[] newArray(int i) {
            return new PluralResText[i];
        }
    }

    public PluralResText(@PluralsRes int i, int i2) {
        this.pluralStringRes = i;
        this.quantity = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!PluralResText.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type au.com.woolworths.android.onesite.models.text.PluralResText");
        PluralResText pluralResText = (PluralResText) other;
        return this.pluralStringRes == pluralResText.pluralStringRes && this.quantity == pluralResText.quantity;
    }

    public final int getPluralStringRes() {
        return this.pluralStringRes;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @Override // au.com.woolworths.android.onesite.models.text.Text
    @NotNull
    public CharSequence getText(@NotNull Context context) throws Resources.NotFoundException {
        Intrinsics.h(context, "context");
        Resources resources = context.getResources();
        int i = this.pluralStringRes;
        int i2 = this.quantity;
        String quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2));
        Intrinsics.g(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    public int hashCode() {
        return (this.pluralStringRes * 31) + this.quantity;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(this.pluralStringRes);
        dest.writeInt(this.quantity);
    }
}
