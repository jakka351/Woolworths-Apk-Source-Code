package au.com.woolworths.android.onesite.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.lifecycle.viewmodel.compose.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006\""}, d2 = {"Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "Landroid/os/Parcelable;", "Lau/com/woolworths/android/onesite/data/DownloadableAssetType;", "assetType", "", "assetUrl", "", "assetWidth", "assetHeight", "Lau/com/woolworths/android/onesite/data/DownloadableAssetFit;", "fit", "altText", "<init>", "(Lau/com/woolworths/android/onesite/data/DownloadableAssetType;Ljava/lang/String;IILau/com/woolworths/android/onesite/data/DownloadableAssetFit;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILau/com/woolworths/android/onesite/data/DownloadableAssetType;Ljava/lang/String;IILau/com/woolworths/android/onesite/data/DownloadableAssetFit;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lau/com/woolworths/android/onesite/data/DownloadableAssetType;", "c", "()Lau/com/woolworths/android/onesite/data/DownloadableAssetType;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "I", "e", "()I", "b", "Lau/com/woolworths/android/onesite/data/DownloadableAssetFit;", "f", "()Lau/com/woolworths/android/onesite/data/DownloadableAssetFit;", "a", "Companion", "$serializer", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class DownloadableAsset implements Parcelable {
    public static final Lazy[] d;

    @SerializedName("altText")
    @Nullable
    private final String altText;

    @SerializedName("assetHeight")
    private final int assetHeight;

    @SerializedName("assetType")
    @NotNull
    private final DownloadableAssetType assetType;

    @SerializedName("assetUrl")
    @NotNull
    private final String assetUrl;

    @SerializedName("assetWidth")
    private final int assetWidth;

    @SerializedName("fit")
    @Nullable
    private final DownloadableAssetFit fit;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<DownloadableAsset> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/data/DownloadableAsset$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<DownloadableAsset> serializer() {
            return DownloadableAsset$$serializer.f4241a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DownloadableAsset> {
        @Override // android.os.Parcelable.Creator
        public final DownloadableAsset createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new DownloadableAsset(DownloadableAssetType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : DownloadableAssetFit.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadableAsset[] newArray(int i) {
            return new DownloadableAsset[i];
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
        d = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new a(4)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new a(5)), null};
    }

    public /* synthetic */ DownloadableAsset(int i, DownloadableAssetType downloadableAssetType, String str, int i2, int i3, DownloadableAssetFit downloadableAssetFit, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.a(i, 31, DownloadableAsset$$serializer.f4241a.getDescriptor());
            throw null;
        }
        this.assetType = downloadableAssetType;
        this.assetUrl = str;
        this.assetWidth = i2;
        this.assetHeight = i3;
        this.fit = downloadableAssetFit;
        if ((i & 32) == 0) {
            this.altText = null;
        } else {
            this.altText = str2;
        }
    }

    public static final /* synthetic */ void g(DownloadableAsset downloadableAsset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Lazy[] lazyArr = d;
        compositeEncoder.F(serialDescriptor, 0, (SerializationStrategy) lazyArr[0].getD(), downloadableAsset.assetType);
        compositeEncoder.p(serialDescriptor, 1, downloadableAsset.assetUrl);
        compositeEncoder.C(2, downloadableAsset.assetWidth, serialDescriptor);
        compositeEncoder.C(3, downloadableAsset.assetHeight, serialDescriptor);
        compositeEncoder.w(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getD(), downloadableAsset.fit);
        if (!compositeEncoder.q(serialDescriptor, 5) && downloadableAsset.altText == null) {
            return;
        }
        compositeEncoder.w(serialDescriptor, 5, StringSerializer.f24821a, downloadableAsset.altText);
    }

    /* renamed from: a, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    /* renamed from: b, reason: from getter */
    public final int getAssetHeight() {
        return this.assetHeight;
    }

    /* renamed from: c, reason: from getter */
    public final DownloadableAssetType getAssetType() {
        return this.assetType;
    }

    /* renamed from: d, reason: from getter */
    public final String getAssetUrl() {
        return this.assetUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final int getAssetWidth() {
        return this.assetWidth;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadableAsset)) {
            return false;
        }
        DownloadableAsset downloadableAsset = (DownloadableAsset) obj;
        return this.assetType == downloadableAsset.assetType && Intrinsics.c(this.assetUrl, downloadableAsset.assetUrl) && this.assetWidth == downloadableAsset.assetWidth && this.assetHeight == downloadableAsset.assetHeight && this.fit == downloadableAsset.fit && Intrinsics.c(this.altText, downloadableAsset.altText);
    }

    /* renamed from: f, reason: from getter */
    public final DownloadableAssetFit getFit() {
        return this.fit;
    }

    public final int hashCode() {
        int iA = b.a(this.assetHeight, b.a(this.assetWidth, b.c(this.assetType.hashCode() * 31, 31, this.assetUrl), 31), 31);
        DownloadableAssetFit downloadableAssetFit = this.fit;
        int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
        String str = this.altText;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        DownloadableAssetType downloadableAssetType = this.assetType;
        String str = this.assetUrl;
        int i = this.assetWidth;
        int i2 = this.assetHeight;
        DownloadableAssetFit downloadableAssetFit = this.fit;
        String str2 = this.altText;
        StringBuilder sb = new StringBuilder("DownloadableAsset(assetType=");
        sb.append(downloadableAssetType);
        sb.append(", assetUrl=");
        sb.append(str);
        sb.append(", assetWidth=");
        YU.a.w(i, i2, ", assetHeight=", ", fit=", sb);
        sb.append(downloadableAssetFit);
        sb.append(", altText=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.assetType.name());
        dest.writeString(this.assetUrl);
        dest.writeInt(this.assetWidth);
        dest.writeInt(this.assetHeight);
        DownloadableAssetFit downloadableAssetFit = this.fit;
        if (downloadableAssetFit == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(downloadableAssetFit.name());
        }
        dest.writeString(this.altText);
    }

    public DownloadableAsset(@NotNull DownloadableAssetType assetType, @NotNull String assetUrl, int i, int i2, @Nullable DownloadableAssetFit downloadableAssetFit, @Nullable String str) {
        Intrinsics.h(assetType, "assetType");
        Intrinsics.h(assetUrl, "assetUrl");
        this.assetType = assetType;
        this.assetUrl = assetUrl;
        this.assetWidth = i;
        this.assetHeight = i2;
        this.fit = downloadableAssetFit;
        this.altText = str;
    }

    public /* synthetic */ DownloadableAsset(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(downloadableAssetType, str, i, i2, downloadableAssetFit, (i3 & 32) != 0 ? null : str2);
    }
}
