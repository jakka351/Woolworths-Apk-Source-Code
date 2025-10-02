package au.com.woolworths.android.onesite.models.text;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/android/onesite/models/text/PlainText;", "Lau/com/woolworths/android/onesite/models/text/Text;", "stringText", "", "<init>", "(Ljava/lang/String;)V", "getStringText", "()Ljava/lang/String;", "getText", "", "context", "Landroid/content/Context;", "equals", "", "other", "", "hashCode", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlainText implements Text {

    @NotNull
    public static final Parcelable.Creator<PlainText> CREATOR = new Creator();

    @NotNull
    private final String stringText;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlainText> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlainText createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new PlainText(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlainText[] newArray(int i) {
            return new PlainText[i];
        }
    }

    public PlainText(@NotNull String stringText) {
        Intrinsics.h(stringText, "stringText");
        this.stringText = stringText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!PlainText.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        String str = this.stringText;
        Intrinsics.f(other, "null cannot be cast to non-null type au.com.woolworths.android.onesite.models.text.PlainText");
        return Intrinsics.c(str, ((PlainText) other).stringText);
    }

    @NotNull
    public final String getStringText() {
        return this.stringText;
    }

    @Override // au.com.woolworths.android.onesite.models.text.Text
    @NotNull
    public CharSequence getText(@NotNull Context context) {
        Intrinsics.h(context, "context");
        return this.stringText;
    }

    public int hashCode() {
        return this.stringText.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.stringText);
    }
}
