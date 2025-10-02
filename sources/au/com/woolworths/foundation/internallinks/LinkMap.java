package au.com.woolworths.foundation.internallinks;

import au.com.woolworths.feature.shop.bundles.ui.a;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/internallinks/LinkMap;", "", "Companion", "$serializer", "internallinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class LinkMap {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.d, new a(15))};

    /* renamed from: a, reason: collision with root package name */
    public final Map f8533a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/internallinks/LinkMap$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/internallinks/LinkMap;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internallinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<LinkMap> serializer() {
            return LinkMap$$serializer.f8534a;
        }
    }

    public /* synthetic */ LinkMap(int i, Map map) {
        if (1 == (i & 1)) {
            this.f8533a = map;
        } else {
            PluginExceptionsKt.a(i, 1, LinkMap$$serializer.f8534a.getB());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinkMap) && Intrinsics.c(this.f8533a, ((LinkMap) obj).f8533a);
    }

    public final int hashCode() {
        return this.f8533a.hashCode();
    }

    public final String toString() {
        return "LinkMap(externalToInternal=" + this.f8533a + ")";
    }
}
