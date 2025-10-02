package me.oriient.ipssdk.realtime.services.rest.responses;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B3\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J%\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/ContentContainer;", "", "seen1", "", "data", "", "Lme/oriient/ipssdk/realtime/services/rest/responses/Content;", "pagination", "Lme/oriient/ipssdk/realtime/services/rest/responses/Pagination;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lme/oriient/ipssdk/realtime/services/rest/responses/Pagination;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Lme/oriient/ipssdk/realtime/services/rest/responses/Pagination;)V", "getData", "()Ljava/util/List;", "getPagination", "()Lme/oriient/ipssdk/realtime/services/rest/responses/Pagination;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_realtime", "$serializer", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class ContentContainer {

    @NotNull
    private final List<Content> data;

    @Nullable
    private final Pagination pagination;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(Content$$serializer.INSTANCE), null};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/ContentContainer$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/realtime/services/rest/responses/ContentContainer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<ContentContainer> serializer() {
            return ContentContainer$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ ContentContainer(int i, List list, Pagination pagination, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.a(i, 1, ContentContainer$$serializer.INSTANCE.getB());
            throw null;
        }
        this.data = list;
        if ((i & 2) == 0) {
            this.pagination = null;
        } else {
            this.pagination = pagination;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentContainer copy$default(ContentContainer contentContainer, List list, Pagination pagination, int i, Object obj) {
        if ((i & 1) != 0) {
            list = contentContainer.data;
        }
        if ((i & 2) != 0) {
            pagination = contentContainer.pagination;
        }
        return contentContainer.copy(list, pagination);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_realtime(ContentContainer self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.F(serialDesc, 0, $childSerializers[0], self.data);
        if (!output.q(serialDesc, 1) && self.pagination == null) {
            return;
        }
        output.w(serialDesc, 1, Pagination$$serializer.INSTANCE, self.pagination);
    }

    @NotNull
    public final List<Content> component1() {
        return this.data;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Pagination getPagination() {
        return this.pagination;
    }

    @NotNull
    public final ContentContainer copy(@NotNull List<Content> data, @Nullable Pagination pagination) {
        Intrinsics.h(data, "data");
        return new ContentContainer(data, pagination);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentContainer)) {
            return false;
        }
        ContentContainer contentContainer = (ContentContainer) other;
        return Intrinsics.c(this.data, contentContainer.data) && Intrinsics.c(this.pagination, contentContainer.pagination);
    }

    @NotNull
    public final List<Content> getData() {
        return this.data;
    }

    @Nullable
    public final Pagination getPagination() {
        return this.pagination;
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        Pagination pagination = this.pagination;
        return iHashCode + (pagination == null ? 0 : pagination.hashCode());
    }

    @NotNull
    public String toString() {
        return "ContentContainer(data=" + this.data + ", pagination=" + this.pagination + ')';
    }

    public ContentContainer(@NotNull List<Content> data, @Nullable Pagination pagination) {
        Intrinsics.h(data, "data");
        this.data = data;
        this.pagination = pagination;
    }

    public /* synthetic */ ContentContainer(List list, Pagination pagination, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : pagination);
    }
}
