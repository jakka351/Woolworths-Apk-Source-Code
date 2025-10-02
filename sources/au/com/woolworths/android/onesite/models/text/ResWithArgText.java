package au.com.woolworths.android.onesite.models.text;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012 \u0010\u0004\u001a\u0011\u0012\r\b\u0001\u0012\t\u0018\u00010\u0006¢\u0006\u0002\b\u00070\u0005\"\t\u0018\u00010\u0006¢\u0006\u0002\b\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0006\u0010\u0015\u001a\u00020\u0003J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0011\u0012\r\b\u0001\u0012\t\u0018\u00010\u0006¢\u0006\u0002\b\u00070\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u001b"}, d2 = {"Lau/com/woolworths/android/onesite/models/text/ResWithArgText;", "Lau/com/woolworths/android/onesite/models/text/Text;", "stringRes", "", "args", "", "", "Lkotlinx/parcelize/RawValue;", "<init>", "(I[Ljava/lang/Object;)V", "getStringRes", "()I", "[Ljava/lang/Object;", "getText", "", "context", "Landroid/content/Context;", "equals", "", "other", "hashCode", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResWithArgText implements Text {

    @NotNull
    public static final Parcelable.Creator<ResWithArgText> CREATOR = new Creator();

    @NotNull
    private final Object[] args;
    private final int stringRes;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ResWithArgText> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResWithArgText createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            Object[] objArr = new Object[i2];
            for (int i3 = 0; i3 != i2; i3++) {
                objArr[i3] = parcel.readValue(ResWithArgText.class.getClassLoader());
            }
            return new ResWithArgText(i, objArr);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResWithArgText[] newArray(int i) {
            return new ResWithArgText[i];
        }
    }

    public ResWithArgText(@StringRes int i, @NotNull Object... args) {
        Intrinsics.h(args, "args");
        this.stringRes = i;
        this.args = args;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!ResWithArgText.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type au.com.woolworths.android.onesite.models.text.ResWithArgText");
        ResWithArgText resWithArgText = (ResWithArgText) other;
        return this.stringRes == resWithArgText.stringRes && Arrays.equals(this.args, resWithArgText.args);
    }

    public final int getStringRes() {
        return this.stringRes;
    }

    @Override // au.com.woolworths.android.onesite.models.text.Text
    @NotNull
    public CharSequence getText(@NotNull Context context) {
        Intrinsics.h(context, "context");
        int i = this.stringRes;
        Object[] objArr = this.args;
        String string = context.getString(i, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    public int hashCode() {
        return Arrays.hashCode(this.args) + (this.stringRes * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(this.stringRes);
        Object[] objArr = this.args;
        int length = objArr.length;
        dest.writeInt(length);
        for (int i = 0; i != length; i++) {
            dest.writeValue(objArr[i]);
        }
    }
}
