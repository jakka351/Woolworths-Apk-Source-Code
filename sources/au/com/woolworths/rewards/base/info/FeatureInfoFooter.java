package au.com.woolworths.rewards.base.info;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.ContentCta$$serializer;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0010B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/rewards/base/info/FeatureInfoFooter;", "Landroid/os/Parcelable;", "Lau/com/woolworths/android/onesite/data/ContentCta;", "primaryCta", "secondaryCta", "<init>", "(Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/ContentCta;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/ContentCta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lau/com/woolworths/android/onesite/data/ContentCta;", "a", "()Lau/com/woolworths/android/onesite/data/ContentCta;", "b", "Companion", "$serializer", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class FeatureInfoFooter implements Parcelable {

    @SerializedName("primaryCta")
    @NotNull
    private final ContentCta primaryCta;

    @SerializedName("secondaryCta")
    @Nullable
    private final ContentCta secondaryCta;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<FeatureInfoFooter> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/rewards/base/info/FeatureInfoFooter$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/rewards/base/info/FeatureInfoFooter;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<FeatureInfoFooter> serializer() {
            return FeatureInfoFooter$$serializer.f9371a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FeatureInfoFooter> {
        @Override // android.os.Parcelable.Creator
        public final FeatureInfoFooter createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new FeatureInfoFooter((ContentCta) parcel.readParcelable(FeatureInfoFooter.class.getClassLoader()), (ContentCta) parcel.readParcelable(FeatureInfoFooter.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FeatureInfoFooter[] newArray(int i) {
            return new FeatureInfoFooter[i];
        }
    }

    public /* synthetic */ FeatureInfoFooter(int i, ContentCta contentCta, ContentCta contentCta2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.a(i, 1, FeatureInfoFooter$$serializer.f9371a.getB());
            throw null;
        }
        this.primaryCta = contentCta;
        if ((i & 2) == 0) {
            this.secondaryCta = null;
        } else {
            this.secondaryCta = contentCta2;
        }
    }

    public static final /* synthetic */ void c(FeatureInfoFooter featureInfoFooter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        ContentCta$$serializer contentCta$$serializer = ContentCta$$serializer.f4240a;
        compositeEncoder.F(serialDescriptor, 0, contentCta$$serializer, featureInfoFooter.primaryCta);
        if (!compositeEncoder.q(serialDescriptor, 1) && featureInfoFooter.secondaryCta == null) {
            return;
        }
        compositeEncoder.w(serialDescriptor, 1, contentCta$$serializer, featureInfoFooter.secondaryCta);
    }

    /* renamed from: a, reason: from getter */
    public final ContentCta getPrimaryCta() {
        return this.primaryCta;
    }

    /* renamed from: b, reason: from getter */
    public final ContentCta getSecondaryCta() {
        return this.secondaryCta;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureInfoFooter)) {
            return false;
        }
        FeatureInfoFooter featureInfoFooter = (FeatureInfoFooter) obj;
        return Intrinsics.c(this.primaryCta, featureInfoFooter.primaryCta) && Intrinsics.c(this.secondaryCta, featureInfoFooter.secondaryCta);
    }

    public final int hashCode() {
        int iHashCode = this.primaryCta.hashCode() * 31;
        ContentCta contentCta = this.secondaryCta;
        return iHashCode + (contentCta == null ? 0 : contentCta.hashCode());
    }

    public final String toString() {
        return "FeatureInfoFooter(primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.primaryCta, i);
        dest.writeParcelable(this.secondaryCta, i);
    }

    public FeatureInfoFooter(@NotNull ContentCta primaryCta, @Nullable ContentCta contentCta) {
        Intrinsics.h(primaryCta, "primaryCta");
        this.primaryCta = primaryCta;
        this.secondaryCta = contentCta;
    }

    public /* synthetic */ FeatureInfoFooter(ContentCta contentCta, ContentCta contentCta2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentCta, (i & 2) != 0 ? null : contentCta2);
    }
}
