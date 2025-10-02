package au.com.woolworths.foundation.internallinks;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/internallinks/LinkSpec;", "", "Companion", "$serializer", "internallinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class LinkSpec {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f8535a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/internallinks/LinkSpec$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/internallinks/LinkSpec;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internallinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<LinkSpec> serializer() {
            return LinkSpec$$serializer.f8536a;
        }
    }

    public /* synthetic */ LinkSpec(int i, String str) {
        if (1 == (i & 1)) {
            this.f8535a = str;
        } else {
            PluginExceptionsKt.a(i, 1, LinkSpec$$serializer.f8536a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinkSpec) && Intrinsics.c(this.f8535a, ((LinkSpec) obj).f8535a);
    }

    public final int hashCode() {
        return this.f8535a.hashCode();
    }

    public final String toString() {
        return a.h("LinkSpec(uri=", this.f8535a, ")");
    }
}
