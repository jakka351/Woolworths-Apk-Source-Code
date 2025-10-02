package au.com.woolworths.foundation.appcomms.inbox.client.internal.datastore;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/datastore/LastChatbotMessageEntity;", "", "Companion", "$serializer", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class LastChatbotMessageEntity {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f8421a;
    public final String b;
    public final String c;
    public final int d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/datastore/LastChatbotMessageEntity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/datastore/LastChatbotMessageEntity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<LastChatbotMessageEntity> serializer() {
            return LastChatbotMessageEntity$$serializer.f8422a;
        }
    }

    public /* synthetic */ LastChatbotMessageEntity(int i, int i2, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, LastChatbotMessageEntity$$serializer.f8422a.getB());
            throw null;
        }
        this.f8421a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastChatbotMessageEntity)) {
            return false;
        }
        LastChatbotMessageEntity lastChatbotMessageEntity = (LastChatbotMessageEntity) obj;
        return Intrinsics.c(this.f8421a, lastChatbotMessageEntity.f8421a) && Intrinsics.c(this.b, lastChatbotMessageEntity.b) && Intrinsics.c(this.c, lastChatbotMessageEntity.c) && this.d == lastChatbotMessageEntity.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.c(b.c(this.f8421a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbV = a.v("LastChatbotMessageEntity(title=", this.f8421a, ", body=", this.b, ", source=");
        sbV.append(this.c);
        sbV.append(", unreadMessagesCount=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }

    public LastChatbotMessageEntity(int i, String str, String str2, String str3) {
        this.f8421a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }
}
