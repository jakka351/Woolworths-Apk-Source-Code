package au.com.woolworths.foundation.advertising.data.google.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdLoadingTimeoutConfig;", "", "Companion", "$serializer", "advertising-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class GoogleAdLoadingTimeoutConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final Long f8403a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdLoadingTimeoutConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdLoadingTimeoutConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "advertising-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<GoogleAdLoadingTimeoutConfig> serializer() {
            return GoogleAdLoadingTimeoutConfig$$serializer.f8404a;
        }
    }

    public /* synthetic */ GoogleAdLoadingTimeoutConfig(int i, Long l, Long l2, Long l3, Long l4, Long l5) {
        if ((i & 1) == 0) {
            this.f8403a = null;
        } else {
            this.f8403a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleAdLoadingTimeoutConfig)) {
            return false;
        }
        GoogleAdLoadingTimeoutConfig googleAdLoadingTimeoutConfig = (GoogleAdLoadingTimeoutConfig) obj;
        return Intrinsics.c(this.f8403a, googleAdLoadingTimeoutConfig.f8403a) && Intrinsics.c(this.b, googleAdLoadingTimeoutConfig.b) && Intrinsics.c(this.c, googleAdLoadingTimeoutConfig.c) && Intrinsics.c(this.d, googleAdLoadingTimeoutConfig.d) && Intrinsics.c(this.e, googleAdLoadingTimeoutConfig.e);
    }

    public final int hashCode() {
        Long l = this.f8403a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.e;
        return iHashCode4 + (l5 != null ? l5.hashCode() : 0);
    }

    public final String toString() {
        return "GoogleAdLoadingTimeoutConfig(productList=" + this.f8403a + ", recipe=" + this.b + ", homePage=" + this.c + ", orderConfirmation=" + this.d + ", contentPage=" + this.e + ")";
    }

    public GoogleAdLoadingTimeoutConfig() {
        this.f8403a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
