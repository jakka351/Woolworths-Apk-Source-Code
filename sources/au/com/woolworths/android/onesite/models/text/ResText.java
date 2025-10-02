package au.com.woolworths.android.onesite.models.text;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0006\u0010\u0011\u001a\u00020\u0003J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/android/onesite/models/text/ResText;", "Lau/com/woolworths/android/onesite/models/text/Text;", "stringRes", "", "<init>", "(I)V", "getStringRes", "()I", "getText", "", "context", "Landroid/content/Context;", "equals", "", "other", "", "hashCode", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResText implements Text {

    @NotNull
    public static final Parcelable.Creator<ResText> CREATOR = new Creator();
    private final int stringRes;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ResText> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResText createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ResText(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResText[] newArray(int i) {
            return new ResText[i];
        }
    }

    public ResText(@StringRes int i) {
        this.stringRes = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!ResText.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        int i = this.stringRes;
        Intrinsics.f(other, "null cannot be cast to non-null type au.com.woolworths.android.onesite.models.text.ResText");
        return i == ((ResText) other).stringRes;
    }

    public final int getStringRes() {
        return this.stringRes;
    }

    @Override // au.com.woolworths.android.onesite.models.text.Text
    @NotNull
    public CharSequence getText(@NotNull Context context) {
        Intrinsics.h(context, "context");
        CharSequence text = context.getText(this.stringRes);
        Intrinsics.g(text, "getText(...)");
        return text;
    }

    public int hashCode() {
        return this.stringRes;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(this.stringRes);
    }
}
