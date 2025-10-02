package au.com.woolworths.android.onesite.modules.collectionmode.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.browser.customtabs.CustomTabsCallback;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode;", "Landroid/os/Parcelable;", "", "modeName", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PickUp", "Delivery", "InStore", "NotSet", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode$Delivery;", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode$InStore;", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode$NotSet;", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode$PickUp;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CollectionMode implements Parcelable {

    @SerializedName("modeName")
    @NotNull
    private final String modeName;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode$Delivery;", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode;", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/DeliveryModeVariant;", "variant", "<init>", "(Lau/com/woolworths/android/onesite/modules/collectionmode/common/DeliveryModeVariant;)V", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/DeliveryModeVariant;", "b", "()Lau/com/woolworths/android/onesite/modules/collectionmode/common/DeliveryModeVariant;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Delivery extends CollectionMode {

        @NotNull
        public static final Parcelable.Creator<Delivery> CREATOR = new Creator();

        @SerializedName("variant")
        @NotNull
        private final DeliveryModeVariant variant;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Delivery> {
            @Override // android.os.Parcelable.Creator
            public final Delivery createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Delivery(DeliveryModeVariant.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Delivery[] newArray(int i) {
                return new Delivery[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Delivery(@NotNull DeliveryModeVariant variant) {
            super(CustomTabsCallback.ONLINE_EXTRAS_KEY, null);
            Intrinsics.h(variant, "variant");
            this.variant = variant;
        }

        /* renamed from: b, reason: from getter */
        public final DeliveryModeVariant getVariant() {
            return this.variant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Delivery) && this.variant == ((Delivery) obj).variant;
        }

        public final int hashCode() {
            return this.variant.hashCode();
        }

        public final String toString() {
            return "Delivery(variant=" + this.variant + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.variant.name());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode$InStore;", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InStore extends CollectionMode {
        public static final InStore d = new InStore("instore", null);

        @NotNull
        public static final Parcelable.Creator<InStore> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InStore> {
            @Override // android.os.Parcelable.Creator
            public final InStore createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                parcel.readInt();
                return InStore.d;
            }

            @Override // android.os.Parcelable.Creator
            public final InStore[] newArray(int i) {
                return new InStore[i];
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

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode$NotSet;", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class NotSet extends CollectionMode {
        public static final NotSet d = new NotSet("notset", null);

        @NotNull
        public static final Parcelable.Creator<NotSet> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NotSet> {
            @Override // android.os.Parcelable.Creator
            public final NotSet createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                parcel.readInt();
                return NotSet.d;
            }

            @Override // android.os.Parcelable.Creator
            public final NotSet[] newArray(int i) {
                return new NotSet[i];
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

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode$PickUp;", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class PickUp extends CollectionMode {
        public static final PickUp d = new PickUp("pickup", null);

        @NotNull
        public static final Parcelable.Creator<PickUp> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PickUp> {
            @Override // android.os.Parcelable.Creator
            public final PickUp createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                parcel.readInt();
                return PickUp.d;
            }

            @Override // android.os.Parcelable.Creator
            public final PickUp[] newArray(int i) {
                return new PickUp[i];
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

    public /* synthetic */ CollectionMode(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a, reason: from getter */
    public final String getModeName() {
        return this.modeName;
    }

    private CollectionMode(String str) {
        this.modeName = str;
    }
}
