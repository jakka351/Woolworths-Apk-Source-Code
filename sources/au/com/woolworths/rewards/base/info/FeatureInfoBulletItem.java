package au.com.woolworths.rewards.base.info;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/rewards/base/info/FeatureInfoBulletItem;", "Lau/com/woolworths/rewards/base/info/FeatureInfoItem;", "", "iconUrl", "title", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "a", "Companion", "$serializer", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
@SerialName
/* loaded from: classes4.dex */
public final /* data */ class FeatureInfoBulletItem implements FeatureInfoItem {

    @SerializedName("content")
    @NotNull
    private final String content;

    @SerializedName("iconUrl")
    @NotNull
    private final String iconUrl;

    @SerializedName("title")
    @NotNull
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<FeatureInfoBulletItem> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/rewards/base/info/FeatureInfoBulletItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/rewards/base/info/FeatureInfoBulletItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<FeatureInfoBulletItem> serializer() {
            return FeatureInfoBulletItem$$serializer.f9370a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FeatureInfoBulletItem> {
        @Override // android.os.Parcelable.Creator
        public final FeatureInfoBulletItem createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new FeatureInfoBulletItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FeatureInfoBulletItem[] newArray(int i) {
            return new FeatureInfoBulletItem[i];
        }
    }

    public /* synthetic */ FeatureInfoBulletItem(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, FeatureInfoBulletItem$$serializer.f9370a.getDescriptor());
            throw null;
        }
        this.iconUrl = str;
        this.title = str2;
        this.content = str3;
    }

    public static final /* synthetic */ void d(FeatureInfoBulletItem featureInfoBulletItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.p(serialDescriptor, 0, featureInfoBulletItem.iconUrl);
        compositeEncoder.p(serialDescriptor, 1, featureInfoBulletItem.title);
        compositeEncoder.p(serialDescriptor, 2, featureInfoBulletItem.content);
    }

    /* renamed from: a, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: b, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureInfoBulletItem)) {
            return false;
        }
        FeatureInfoBulletItem featureInfoBulletItem = (FeatureInfoBulletItem) obj;
        return Intrinsics.c(this.iconUrl, featureInfoBulletItem.iconUrl) && Intrinsics.c(this.title, featureInfoBulletItem.title) && Intrinsics.c(this.content, featureInfoBulletItem.content);
    }

    public final int hashCode() {
        return this.content.hashCode() + b.c(this.iconUrl.hashCode() * 31, 31, this.title);
    }

    public final String toString() {
        String str = this.iconUrl;
        String str2 = this.title;
        return a.o(a.v("FeatureInfoBulletItem(iconUrl=", str, ", title=", str2, ", content="), this.content, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.iconUrl);
        dest.writeString(this.title);
        dest.writeString(this.content);
    }

    public FeatureInfoBulletItem(@NotNull String iconUrl, @NotNull String title, @NotNull String content) {
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(title, "title");
        Intrinsics.h(content, "content");
        this.iconUrl = iconUrl;
        this.title = title;
        this.content = content;
    }
}
