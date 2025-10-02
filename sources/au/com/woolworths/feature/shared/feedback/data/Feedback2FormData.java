package au.com.woolworths.feature.shared.feedback.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.offers.home.ui.a;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/data/Feedback2FormData;", "", "Companion", "$serializer", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class Feedback2FormData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, LazyKt.a(LazyThreadSafetyMode.d, new a(24)), null, null, null};

    /* renamed from: a, reason: collision with root package name */
    public final String f6477a;
    public final Map b;
    public final Long c;
    public final Long d;
    public final Long e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/data/Feedback2FormData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/feature/shared/feedback/data/Feedback2FormData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<Feedback2FormData> serializer() {
            return Feedback2FormData$$serializer.f6478a;
        }
    }

    public /* synthetic */ Feedback2FormData(int i, String str, Map map, Long l, Long l2, Long l3) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, Feedback2FormData$$serializer.f6478a.getB());
            throw null;
        }
        this.f6477a = str;
        this.b = map;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Feedback2FormData)) {
            return false;
        }
        Feedback2FormData feedback2FormData = (Feedback2FormData) obj;
        return Intrinsics.c(this.f6477a, feedback2FormData.f6477a) && Intrinsics.c(this.b, feedback2FormData.b) && Intrinsics.c(this.c, feedback2FormData.c) && Intrinsics.c(this.d, feedback2FormData.d) && Intrinsics.c(this.e, feedback2FormData.e);
    }

    public final int hashCode() {
        int iD = d.d(this.b, this.f6477a.hashCode() * 31, 31);
        Long l = this.c;
        int iHashCode = (iD + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        return "Feedback2FormData(formId=" + this.f6477a + ", data=" + this.b + ", exp=" + this.c + ", nbf=" + this.d + ", iat=" + this.e + ")";
    }
}
