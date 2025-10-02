package au.com.woolworths.feature.shop.instore.navigation.map;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/MappedStoreInfo;", "", "Companion", "$serializer", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
final /* data */ class MappedStoreInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.d, new b())};

    /* renamed from: a, reason: collision with root package name */
    public final Map f7327a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/MappedStoreInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/feature/shop/instore/navigation/map/MappedStoreInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<MappedStoreInfo> serializer() {
            return MappedStoreInfo$$serializer.f7328a;
        }
    }

    public /* synthetic */ MappedStoreInfo(int i, Map map) {
        if ((i & 1) == 0) {
            this.f7327a = new LinkedHashMap();
        } else {
            this.f7327a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MappedStoreInfo) && Intrinsics.c(this.f7327a, ((MappedStoreInfo) obj).f7327a);
    }

    public final int hashCode() {
        return this.f7327a.hashCode();
    }

    public final String toString() {
        return "MappedStoreInfo(mappedStores=" + this.f7327a + ")";
    }

    public MappedStoreInfo() {
        this.f7327a = new LinkedHashMap();
    }
}
