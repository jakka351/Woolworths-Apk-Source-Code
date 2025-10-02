package au.com.woolworths.rewards.base.info;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/rewards/base/info/FeatureInfoTextItem;", "Lau/com/woolworths/rewards/base/info/FeatureInfoItem;", "", "markdownContent", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "$serializer", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
@SerialName
/* loaded from: classes4.dex */
public final /* data */ class FeatureInfoTextItem implements FeatureInfoItem {

    @SerializedName("markdownContent")
    @NotNull
    private final String markdownContent;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<FeatureInfoTextItem> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/rewards/base/info/FeatureInfoTextItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/rewards/base/info/FeatureInfoTextItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<FeatureInfoTextItem> serializer() {
            return FeatureInfoTextItem$$serializer.f9374a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FeatureInfoTextItem> {
        @Override // android.os.Parcelable.Creator
        public final FeatureInfoTextItem createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new FeatureInfoTextItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FeatureInfoTextItem[] newArray(int i) {
            return new FeatureInfoTextItem[i];
        }
    }

    public /* synthetic */ FeatureInfoTextItem(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 == (i & 1)) {
            this.markdownContent = str;
        } else {
            PluginExceptionsKt.a(i, 1, FeatureInfoTextItem$$serializer.f9374a.getB());
            throw null;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getMarkdownContent() {
        return this.markdownContent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeatureInfoTextItem) && Intrinsics.c(this.markdownContent, ((FeatureInfoTextItem) obj).markdownContent);
    }

    public final int hashCode() {
        return this.markdownContent.hashCode();
    }

    public final String toString() {
        return a.h("FeatureInfoTextItem(markdownContent=", this.markdownContent, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.markdownContent);
    }

    public FeatureInfoTextItem(@NotNull String markdownContent) {
        Intrinsics.h(markdownContent, "markdownContent");
        this.markdownContent = markdownContent;
    }
}
