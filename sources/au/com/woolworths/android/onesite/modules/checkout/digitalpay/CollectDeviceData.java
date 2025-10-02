package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import androidx.compose.runtime.internal.StabilityInferred;
import com.braintreepayments.api.DataCollector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/CollectDeviceData;", "", "DeviceData", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CollectDeviceData {
    public static DataCollector b;
    public static String c;

    /* renamed from: a, reason: collision with root package name */
    public final Json f4280a = JsonKt.a(new androidx.navigation.a(24));

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/CollectDeviceData$Companion;", "", "Lcom/braintreepayments/api/DataCollector;", "collector", "Lcom/braintreepayments/api/DataCollector;", "", "authToken", "Ljava/lang/String;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/CollectDeviceData$DeviceData;", "", "Companion", "$serializer", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class DeviceData {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final String f4282a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/CollectDeviceData$DeviceData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/CollectDeviceData$DeviceData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<DeviceData> serializer() {
                return CollectDeviceData$DeviceData$$serializer.f4281a;
            }
        }

        public /* synthetic */ DeviceData(int i, String str) {
            if ((i & 1) == 0) {
                this.f4282a = null;
            } else {
                this.f4282a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeviceData) && Intrinsics.c(this.f4282a, ((DeviceData) obj).f4282a);
        }

        public final int hashCode() {
            String str = this.f4282a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return YU.a.h("DeviceData(correlationId=", this.f4282a, ")");
        }
    }
}
