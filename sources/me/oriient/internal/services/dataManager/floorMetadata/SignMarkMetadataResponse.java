package me.oriient.internal.services.dataManager.floorMetadata;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B)\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0017\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u001b\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006!"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkMetadataResponse;", "", "seen1", "", "visibleRanges", "", "Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkVisibleRangeResponse;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getVisibleRanges", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toSignMarkMetadata", "Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkMetadata;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class SignMarkMetadataResponse {

    @Nullable
    private final List<SignMarkVisibleRangeResponse> visibleRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SignMarkVisibleRangeResponse$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkMetadataResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkMetadataResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SignMarkMetadataResponse> serializer() {
            return SignMarkMetadataResponse$$serializer.INSTANCE;
        }
    }

    public SignMarkMetadataResponse() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignMarkMetadataResponse copy$default(SignMarkMetadataResponse signMarkMetadataResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = signMarkMetadataResponse.visibleRanges;
        }
        return signMarkMetadataResponse.copy(list);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(SignMarkMetadataResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!output.q(serialDesc, 0) && self.visibleRanges == null) {
            return;
        }
        output.w(serialDesc, 0, kSerializerArr[0], self.visibleRanges);
    }

    @Nullable
    public final List<SignMarkVisibleRangeResponse> component1() {
        return this.visibleRanges;
    }

    @NotNull
    public final SignMarkMetadataResponse copy(@Nullable List<SignMarkVisibleRangeResponse> visibleRanges) {
        return new SignMarkMetadataResponse(visibleRanges);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SignMarkMetadataResponse) && Intrinsics.c(this.visibleRanges, ((SignMarkMetadataResponse) other).visibleRanges);
    }

    @Nullable
    public final List<SignMarkVisibleRangeResponse> getVisibleRanges() {
        return this.visibleRanges;
    }

    public int hashCode() {
        List<SignMarkVisibleRangeResponse> list = this.visibleRanges;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public final SignMarkMetadata toSignMarkMetadata() {
        ArrayList arrayList;
        List<SignMarkVisibleRangeResponse> list = this.visibleRanges;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((SignMarkVisibleRangeResponse) it.next()).toSignMarkVisibleRange());
            }
        } else {
            arrayList = null;
        }
        return new SignMarkMetadata(arrayList);
    }

    @NotNull
    public String toString() {
        return me.oriient.internal.services.auth.rest.m.a(new StringBuilder("SignMarkMetadataResponse(visibleRanges="), this.visibleRanges, ')');
    }

    @Deprecated
    public /* synthetic */ SignMarkMetadataResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.visibleRanges = null;
        } else {
            this.visibleRanges = list;
        }
    }

    public SignMarkMetadataResponse(@Nullable List<SignMarkVisibleRangeResponse> list) {
        this.visibleRanges = list;
    }

    public /* synthetic */ SignMarkMetadataResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
