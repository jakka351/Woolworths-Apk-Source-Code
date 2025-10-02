package au.com.woolworths.rewards.base.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.MappedName;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/rewards/base/data/IconAsset;", "Landroid/os/Parcelable;", "HostedIcon", "LocalAsset", "CoreIcon", "Lau/com/woolworths/rewards/base/data/IconAsset$CoreIcon;", "Lau/com/woolworths/rewards/base/data/IconAsset$HostedIcon;", "Lau/com/woolworths/rewards/base/data/IconAsset$LocalAsset;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IconAsset extends Parcelable {

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/rewards/base/data/IconAsset$CoreIcon;", "Lau/com/woolworths/rewards/base/data/IconAsset;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CoreIcon implements IconAsset {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<CoreIcon> CREATOR = new Creator();

        @MappedName
        @NotNull
        private final String name;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CoreIcon> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CoreIcon createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new CoreIcon(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CoreIcon[] newArray(int i) {
                return new CoreIcon[i];
            }
        }

        public CoreIcon(@NotNull String name) {
            Intrinsics.h(name, "name");
            this.name = name;
        }

        public static /* synthetic */ CoreIcon copy$default(CoreIcon coreIcon, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = coreIcon.name;
            }
            return coreIcon.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final CoreIcon copy(@NotNull String name) {
            Intrinsics.h(name, "name");
            return new CoreIcon(name);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CoreIcon) && Intrinsics.c(this.name, ((CoreIcon) other).name);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return a.h("CoreIcon(name=", this.name, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.name);
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/rewards/base/data/IconAsset$HostedIcon;", "Lau/com/woolworths/rewards/base/data/IconAsset;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HostedIcon implements IconAsset {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<HostedIcon> CREATOR = new Creator();

        @NotNull
        private final String url;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HostedIcon> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HostedIcon createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new HostedIcon(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HostedIcon[] newArray(int i) {
                return new HostedIcon[i];
            }
        }

        public HostedIcon(@NotNull String url) {
            Intrinsics.h(url, "url");
            this.url = url;
        }

        public static /* synthetic */ HostedIcon copy$default(HostedIcon hostedIcon, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hostedIcon.url;
            }
            return hostedIcon.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final HostedIcon copy(@NotNull String url) {
            Intrinsics.h(url, "url");
            return new HostedIcon(url);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HostedIcon) && Intrinsics.c(this.url, ((HostedIcon) other).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return a.h("HostedIcon(url=", this.url, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.url);
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/rewards/base/data/IconAsset$LocalAsset;", "Lau/com/woolworths/rewards/base/data/IconAsset;", "iconName", "Lau/com/woolworths/rewards/base/data/LocalAssetIconName;", "<init>", "(Lau/com/woolworths/rewards/base/data/LocalAssetIconName;)V", "getIconName", "()Lau/com/woolworths/rewards/base/data/LocalAssetIconName;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Deprecated
    public static final /* data */ class LocalAsset implements IconAsset {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<LocalAsset> CREATOR = new Creator();

        @NotNull
        private final LocalAssetIconName iconName;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LocalAsset> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalAsset createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new LocalAsset(LocalAssetIconName.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalAsset[] newArray(int i) {
                return new LocalAsset[i];
            }
        }

        public LocalAsset(@NotNull LocalAssetIconName iconName) {
            Intrinsics.h(iconName, "iconName");
            this.iconName = iconName;
        }

        public static /* synthetic */ LocalAsset copy$default(LocalAsset localAsset, LocalAssetIconName localAssetIconName, int i, Object obj) {
            if ((i & 1) != 0) {
                localAssetIconName = localAsset.iconName;
            }
            return localAsset.copy(localAssetIconName);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final LocalAssetIconName getIconName() {
            return this.iconName;
        }

        @NotNull
        public final LocalAsset copy(@NotNull LocalAssetIconName iconName) {
            Intrinsics.h(iconName, "iconName");
            return new LocalAsset(iconName);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LocalAsset) && this.iconName == ((LocalAsset) other).iconName;
        }

        @NotNull
        public final LocalAssetIconName getIconName() {
            return this.iconName;
        }

        public int hashCode() {
            return this.iconName.hashCode();
        }

        @NotNull
        public String toString() {
            return "LocalAsset(iconName=" + this.iconName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.iconName.name());
        }
    }
}
