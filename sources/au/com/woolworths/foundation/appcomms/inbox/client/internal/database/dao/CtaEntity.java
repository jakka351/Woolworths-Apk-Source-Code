package au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/CtaEntity;", "", "Companion", "$serializer", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class CtaEntity {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f8413a;
    public final String b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/CtaEntity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/CtaEntity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<CtaEntity> serializer() {
            return CtaEntity$$serializer.f8414a;
        }
    }

    public /* synthetic */ CtaEntity(int i, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, CtaEntity$$serializer.f8414a.getDescriptor());
            throw null;
        }
        this.f8413a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CtaEntity)) {
            return false;
        }
        CtaEntity ctaEntity = (CtaEntity) obj;
        return Intrinsics.c(this.f8413a, ctaEntity.f8413a) && Intrinsics.c(this.b, ctaEntity.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8413a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("CtaEntity(label=", this.f8413a, ", url=", this.b, ")");
    }

    public CtaEntity(String str, String str2) {
        this.f8413a = str;
        this.b = str2;
    }
}
