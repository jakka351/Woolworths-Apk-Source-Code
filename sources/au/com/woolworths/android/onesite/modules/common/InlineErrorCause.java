package au.com.woolworths.android.onesite.modules.common;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause;", "", "IconConfig", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InlineErrorCause {

    @Parcelize
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause$IconConfig;", "Landroid/os/Parcelable;", "None", "Default", "CustomIcon", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause$IconConfig$CustomIcon;", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause$IconConfig$Default;", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause$IconConfig$None;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class IconConfig implements Parcelable {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause$IconConfig$CustomIcon;", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause$IconConfig;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CustomIcon extends IconConfig {

            @NotNull
            public static final Parcelable.Creator<CustomIcon> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CustomIcon> {
                @Override // android.os.Parcelable.Creator
                public final CustomIcon createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new CustomIcon(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final CustomIcon[] newArray(int i) {
                    return new CustomIcon[i];
                }
            }

            public CustomIcon(String iconUrl) {
                Intrinsics.h(iconUrl, "iconUrl");
                this.d = iconUrl;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CustomIcon) && Intrinsics.c(this.d, ((CustomIcon) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("CustomIcon(iconUrl=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause$IconConfig$Default;", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause$IconConfig;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Default extends IconConfig {
            public static final Default d = new Default();

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Default> {
                @Override // android.os.Parcelable.Creator
                public final Default createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    parcel.readInt();
                    return Default.d;
                }

                @Override // android.os.Parcelable.Creator
                public final Default[] newArray(int i) {
                    return new Default[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause$IconConfig$None;", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause$IconConfig;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class None extends IconConfig {
            public static final None d = new None();

            @NotNull
            public static final Parcelable.Creator<None> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<None> {
                @Override // android.os.Parcelable.Creator
                public final None createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    parcel.readInt();
                    return None.d;
                }

                @Override // android.os.Parcelable.Creator
                public final None[] newArray(int i) {
                    return new None[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    default InlineErrorAction getAction() {
        return InlineErrorAction.None.d;
    }

    InlineErrorType getErrorType();

    default IconConfig getIconConfig() {
        return IconConfig.Default.d;
    }

    Text getMessageText();

    default boolean getShowAction() {
        return !Intrinsics.c(getAction(), InlineErrorAction.None.d);
    }

    default boolean getShowBorder() {
        return true;
    }
}
