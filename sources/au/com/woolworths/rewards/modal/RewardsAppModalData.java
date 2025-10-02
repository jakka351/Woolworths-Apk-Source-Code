package au.com.woolworths.rewards.modal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsData$$serializer;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAsset$$serializer;
import au.com.woolworths.rewards.base.d;
import au.com.woolworths.rewards.base.info.FeatureInfoFooter;
import au.com.woolworths.rewards.base.info.FeatureInfoFooter$$serializer;
import au.com.woolworths.rewards.base.info.FeatureInfoItem;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dBa\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011Bq\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lau/com/woolworths/rewards/modal/RewardsAppModalData;", "Landroid/os/Parcelable;", "Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "headerImage", "", "title", ErrorBundle.SUMMARY_ENTRY, "dismissActionUrl", "", "Lau/com/woolworths/rewards/base/info/FeatureInfoItem;", "infoItems", "Lau/com/woolworths/rewards/base/info/FeatureInfoFooter;", "footer", "Lau/com/woolworths/analytics/model/AnalyticsData;", "impressionAnalytics", "dismissAnalytics", "<init>", "(Lau/com/woolworths/android/onesite/data/DownloadableAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lau/com/woolworths/rewards/base/info/FeatureInfoFooter;Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/analytics/model/AnalyticsData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILau/com/woolworths/android/onesite/data/DownloadableAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lau/com/woolworths/rewards/base/info/FeatureInfoFooter;Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/analytics/model/AnalyticsData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "Companion", "$serializer", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class RewardsAppModalData implements Parcelable {
    public final DownloadableAsset d;
    public final String e;
    public final String f;
    public final FeatureInfoFooter g;
    public final AnalyticsData h;
    public final AnalyticsData i;

    @SerializedName("infoItems")
    @NotNull
    private final List<FeatureInfoItem> infoItems;

    @SerializedName(ErrorBundle.SUMMARY_ENTRY)
    @NotNull
    private final String summary;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RewardsAppModalData> CREATOR = new Creator();
    public static final Lazy[] j = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.d, new d(3)), null, null, null};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/rewards/modal/RewardsAppModalData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/rewards/modal/RewardsAppModalData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<RewardsAppModalData> serializer() {
            return RewardsAppModalData$$serializer.f9966a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsAppModalData> {
        @Override // android.os.Parcelable.Creator
        public final RewardsAppModalData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            DownloadableAsset downloadableAsset = (DownloadableAsset) parcel.readParcelable(RewardsAppModalData.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = a.a(RewardsAppModalData.class, parcel, arrayList, iA, 1);
            }
            return new RewardsAppModalData(downloadableAsset, string, string2, string3, arrayList, parcel.readInt() == 0 ? null : FeatureInfoFooter.CREATOR.createFromParcel(parcel), (AnalyticsData) parcel.readParcelable(RewardsAppModalData.class.getClassLoader()), (AnalyticsData) parcel.readParcelable(RewardsAppModalData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RewardsAppModalData[] newArray(int i) {
            return new RewardsAppModalData[i];
        }
    }

    public /* synthetic */ RewardsAppModalData(int i, DownloadableAsset downloadableAsset, String str, String str2, String str3, List list, FeatureInfoFooter featureInfoFooter, AnalyticsData analyticsData, AnalyticsData analyticsData2, SerializationConstructorMarker serializationConstructorMarker) {
        if (22 != (i & 22)) {
            PluginExceptionsKt.a(i, 22, RewardsAppModalData$$serializer.f9966a.getB());
            throw null;
        }
        if ((i & 1) == 0) {
            this.d = null;
        } else {
            this.d = downloadableAsset;
        }
        this.e = str;
        this.summary = str2;
        if ((i & 8) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        this.infoItems = list;
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = featureInfoFooter;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = analyticsData;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = analyticsData2;
        }
    }

    public static final /* synthetic */ void c(RewardsAppModalData rewardsAppModalData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.q(serialDescriptor, 0) || rewardsAppModalData.d != null) {
            compositeEncoder.w(serialDescriptor, 0, DownloadableAsset$$serializer.f4241a, rewardsAppModalData.d);
        }
        String str = rewardsAppModalData.e;
        AnalyticsData analyticsData = rewardsAppModalData.i;
        AnalyticsData analyticsData2 = rewardsAppModalData.h;
        FeatureInfoFooter featureInfoFooter = rewardsAppModalData.g;
        String str2 = rewardsAppModalData.f;
        compositeEncoder.p(serialDescriptor, 1, str);
        compositeEncoder.p(serialDescriptor, 2, rewardsAppModalData.summary);
        if (compositeEncoder.q(serialDescriptor, 3) || str2 != null) {
            compositeEncoder.w(serialDescriptor, 3, StringSerializer.f24821a, str2);
        }
        compositeEncoder.F(serialDescriptor, 4, (SerializationStrategy) j[4].getD(), rewardsAppModalData.infoItems);
        if (compositeEncoder.q(serialDescriptor, 5) || featureInfoFooter != null) {
            compositeEncoder.w(serialDescriptor, 5, FeatureInfoFooter$$serializer.f9371a, featureInfoFooter);
        }
        if (compositeEncoder.q(serialDescriptor, 6) || analyticsData2 != null) {
            compositeEncoder.w(serialDescriptor, 6, AnalyticsData$$serializer.f4018a, analyticsData2);
        }
        if (!compositeEncoder.q(serialDescriptor, 7) && analyticsData == null) {
            return;
        }
        compositeEncoder.w(serialDescriptor, 7, AnalyticsData$$serializer.f4018a, analyticsData);
    }

    /* renamed from: a, reason: from getter */
    public final List getInfoItems() {
        return this.infoItems;
    }

    /* renamed from: b, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsAppModalData)) {
            return false;
        }
        RewardsAppModalData rewardsAppModalData = (RewardsAppModalData) obj;
        return Intrinsics.c(this.d, rewardsAppModalData.d) && Intrinsics.c(this.e, rewardsAppModalData.e) && Intrinsics.c(this.summary, rewardsAppModalData.summary) && Intrinsics.c(this.f, rewardsAppModalData.f) && Intrinsics.c(this.infoItems, rewardsAppModalData.infoItems) && Intrinsics.c(this.g, rewardsAppModalData.g) && Intrinsics.c(this.h, rewardsAppModalData.h) && Intrinsics.c(this.i, rewardsAppModalData.i);
    }

    public final int hashCode() {
        DownloadableAsset downloadableAsset = this.d;
        int iC = b.c(b.c((downloadableAsset == null ? 0 : downloadableAsset.hashCode()) * 31, 31, this.e), 31, this.summary);
        String str = this.f;
        int iD = b.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.infoItems);
        FeatureInfoFooter featureInfoFooter = this.g;
        int iHashCode = (iD + (featureInfoFooter == null ? 0 : featureInfoFooter.hashCode())) * 31;
        AnalyticsData analyticsData = this.h;
        int iHashCode2 = (iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.i;
        return iHashCode2 + (analyticsData2 != null ? analyticsData2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.summary;
        List<FeatureInfoItem> list = this.infoItems;
        StringBuilder sb = new StringBuilder("RewardsAppModalData(headerImage=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", summary=");
        androidx.constraintlayout.core.state.a.B(sb, str, ", dismissActionUrl=", this.f, ", infoItems=");
        sb.append(list);
        sb.append(", footer=");
        sb.append(this.g);
        sb.append(", impressionAnalytics=");
        sb.append(this.h);
        sb.append(", dismissAnalytics=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        dest.writeString(this.summary);
        dest.writeString(this.f);
        Iterator itU = a.u(this.infoItems, dest);
        while (itU.hasNext()) {
            dest.writeParcelable((Parcelable) itU.next(), i);
        }
        FeatureInfoFooter featureInfoFooter = this.g;
        if (featureInfoFooter == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            featureInfoFooter.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.h, i);
        dest.writeParcelable(this.i, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RewardsAppModalData(@Nullable DownloadableAsset downloadableAsset, @NotNull String title, @NotNull String summary, @Nullable String str, @NotNull List<? extends FeatureInfoItem> infoItems, @Nullable FeatureInfoFooter featureInfoFooter, @Nullable AnalyticsData analyticsData, @Nullable AnalyticsData analyticsData2) {
        Intrinsics.h(title, "title");
        Intrinsics.h(summary, "summary");
        Intrinsics.h(infoItems, "infoItems");
        this.d = downloadableAsset;
        this.e = title;
        this.summary = summary;
        this.f = str;
        this.infoItems = infoItems;
        this.g = featureInfoFooter;
        this.h = analyticsData;
        this.i = analyticsData2;
    }

    public /* synthetic */ RewardsAppModalData(DownloadableAsset downloadableAsset, String str, String str2, String str3, List list, FeatureInfoFooter featureInfoFooter, AnalyticsData analyticsData, AnalyticsData analyticsData2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : downloadableAsset, str, str2, (i & 8) != 0 ? null : str3, list, (i & 32) != 0 ? null : featureInfoFooter, (i & 64) != 0 ? null : analyticsData, (i & 128) != 0 ? null : analyticsData2);
    }
}
