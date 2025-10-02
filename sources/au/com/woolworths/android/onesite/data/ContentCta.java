package au.com.woolworths.android.onesite.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsData$$serializer;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lau/com/woolworths/android/onesite/data/ContentCta;", "Landroid/os/Parcelable;", "", AnnotatedPrivateKey.LABEL, "url", "altText", "", "isExternalUrl", "Lau/com/woolworths/analytics/model/AnalyticsData;", "onCtaClickAnalytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lau/com/woolworths/analytics/model/AnalyticsData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lau/com/woolworths/analytics/model/AnalyticsData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "getAltText", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "Lau/com/woolworths/analytics/model/AnalyticsData;", "b", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "Companion", "$serializer", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class ContentCta implements Parcelable {

    @SerializedName("altText")
    @Nullable
    private final String altText;

    @SerializedName("isExternalUrl")
    @Nullable
    private final Boolean isExternalUrl;

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @NotNull
    private final String label;

    @SerializedName("onCtaClickAnalytics")
    @Nullable
    private final AnalyticsData onCtaClickAnalytics;

    @SerializedName("url")
    @Nullable
    private final String url;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<ContentCta> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/data/ContentCta$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/android/onesite/data/ContentCta;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<ContentCta> serializer() {
            return ContentCta$$serializer.f4240a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ContentCta> {
        @Override // android.os.Parcelable.Creator
        public final ContentCta createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ContentCta(string, string2, string3, boolValueOf, (AnalyticsData) parcel.readParcelable(ContentCta.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ContentCta[] newArray(int i) {
            return new ContentCta[i];
        }
    }

    public /* synthetic */ ContentCta(int i, String str, String str2, String str3, Boolean bool, AnalyticsData analyticsData, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, ContentCta$$serializer.f4240a.getDescriptor());
            throw null;
        }
        this.label = str;
        this.url = str2;
        if ((i & 4) == 0) {
            this.altText = null;
        } else {
            this.altText = str3;
        }
        if ((i & 8) == 0) {
            this.isExternalUrl = null;
        } else {
            this.isExternalUrl = bool;
        }
        if ((i & 16) == 0) {
            this.onCtaClickAnalytics = null;
        } else {
            this.onCtaClickAnalytics = analyticsData;
        }
    }

    public static final /* synthetic */ void e(ContentCta contentCta, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.p(serialDescriptor, 0, contentCta.label);
        StringSerializer stringSerializer = StringSerializer.f24821a;
        compositeEncoder.w(serialDescriptor, 1, stringSerializer, contentCta.url);
        if (compositeEncoder.q(serialDescriptor, 2) || contentCta.altText != null) {
            compositeEncoder.w(serialDescriptor, 2, stringSerializer, contentCta.altText);
        }
        if (compositeEncoder.q(serialDescriptor, 3) || contentCta.isExternalUrl != null) {
            compositeEncoder.w(serialDescriptor, 3, BooleanSerializer.f24779a, contentCta.isExternalUrl);
        }
        if (!compositeEncoder.q(serialDescriptor, 4) && contentCta.onCtaClickAnalytics == null) {
            return;
        }
        compositeEncoder.w(serialDescriptor, 4, AnalyticsData$$serializer.f4018a, contentCta.onCtaClickAnalytics);
    }

    /* renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: b, reason: from getter */
    public final AnalyticsData getOnCtaClickAnalytics() {
        return this.onCtaClickAnalytics;
    }

    /* renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: d, reason: from getter */
    public final Boolean getIsExternalUrl() {
        return this.isExternalUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentCta)) {
            return false;
        }
        ContentCta contentCta = (ContentCta) obj;
        return Intrinsics.c(this.label, contentCta.label) && Intrinsics.c(this.url, contentCta.url) && Intrinsics.c(this.altText, contentCta.altText) && Intrinsics.c(this.isExternalUrl, contentCta.isExternalUrl) && Intrinsics.c(this.onCtaClickAnalytics, contentCta.onCtaClickAnalytics);
    }

    public final int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.altText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isExternalUrl;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        AnalyticsData analyticsData = this.onCtaClickAnalytics;
        return iHashCode4 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    public final String toString() {
        String str = this.label;
        String str2 = this.url;
        String str3 = this.altText;
        Boolean bool = this.isExternalUrl;
        AnalyticsData analyticsData = this.onCtaClickAnalytics;
        StringBuilder sbV = a.v("ContentCta(label=", str, ", url=", str2, ", altText=");
        au.com.woolworths.android.onesite.a.A(sbV, str3, ", isExternalUrl=", bool, ", onCtaClickAnalytics=");
        return au.com.woolworths.android.onesite.a.n(sbV, analyticsData, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        int iBooleanValue;
        Intrinsics.h(dest, "dest");
        dest.writeString(this.label);
        dest.writeString(this.url);
        dest.writeString(this.altText);
        Boolean bool = this.isExternalUrl;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            dest.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        dest.writeInt(iBooleanValue);
        dest.writeParcelable(this.onCtaClickAnalytics, i);
    }

    public ContentCta(@NotNull String label, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable AnalyticsData analyticsData) {
        Intrinsics.h(label, "label");
        this.label = label;
        this.url = str;
        this.altText = str2;
        this.isExternalUrl = bool;
        this.onCtaClickAnalytics = analyticsData;
    }

    public /* synthetic */ ContentCta(String str, String str2, String str3, Boolean bool, AnalyticsData analyticsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : analyticsData);
    }
}
