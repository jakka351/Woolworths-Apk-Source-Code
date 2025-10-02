package me.oriient.ipssdk.realtime.services.rest.responses;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.ipssdk.ips.IPSContentSearchPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002#$B#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J*\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/Pagination;", "", "seen1", "", "next", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getNext", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toContentSearchPage", "Lme/oriient/ipssdk/ips/IPSContentSearchPage;", "buildingId", "Lme/oriient/ipssdk/common/utils/models/BuildingId;", "filter", "pageSize", "toContentSearchPage-dfyszzk", "(Ljava/lang/String;Ljava/lang/String;I)Lme/oriient/ipssdk/ips/IPSContentSearchPage;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_realtime", "$serializer", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class Pagination {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String next;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/Pagination$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/realtime/services/rest/responses/Pagination;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<Pagination> serializer() {
            return Pagination$$serializer.INSTANCE;
        }
    }

    public Pagination() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ Pagination copy$default(Pagination pagination, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pagination.next;
        }
        return pagination.copy(str);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_realtime(Pagination self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (!output.q(serialDesc, 0) && self.next == null) {
            return;
        }
        output.w(serialDesc, 0, StringSerializer.f24821a, self.next);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    @NotNull
    public final Pagination copy(@Nullable String next) {
        return new Pagination(next);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Pagination) && Intrinsics.c(this.next, ((Pagination) other).next);
    }

    @Nullable
    public final String getNext() {
        return this.next;
    }

    public int hashCode() {
        String str = this.next;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Nullable
    /* renamed from: toContentSearchPage-dfyszzk, reason: not valid java name */
    public final IPSContentSearchPage m471toContentSearchPagedfyszzk(@NotNull String buildingId, @NotNull String filter, int pageSize) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(filter, "filter");
        String str = this.next;
        if (str != null) {
            return new IPSContentSearchPage(buildingId, filter, pageSize, str);
        }
        return null;
    }

    @NotNull
    public String toString() {
        return b.r(new StringBuilder("Pagination(next="), this.next, ')');
    }

    @Deprecated
    public /* synthetic */ Pagination(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.next = null;
        } else {
            this.next = str;
        }
    }

    public Pagination(@Nullable String str) {
        this.next = str;
    }

    public /* synthetic */ Pagination(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
