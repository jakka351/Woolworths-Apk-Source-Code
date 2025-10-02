package me.oriient.ipssdk.realtime.services.tag.model;

import androidx.camera.core.impl.b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \b2\u00020\u0001:\u0004\b\t\n\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/model/EventTagType;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "Companion", "Custom", "ItemNotFound", "ProductScan", "Lme/oriient/ipssdk/realtime/services/tag/model/EventTagType$Custom;", "Lme/oriient/ipssdk/realtime/services/tag/model/EventTagType$ItemNotFound;", "Lme/oriient/ipssdk/realtime/services/tag/model/EventTagType$ProductScan;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class EventTagType implements Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/model/EventTagType$Custom;", "Lme/oriient/ipssdk/realtime/services/tag/model/EventTagType;", "", "value", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lme/oriient/ipssdk/realtime/services/tag/model/EventTagType$Custom;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getValue", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Custom extends EventTagType {

        /* renamed from: b, reason: from kotlin metadata */
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(@NotNull String value) {
            super(value, null);
            Intrinsics.h(value, "value");
            this.value = value;
        }

        public static /* synthetic */ Custom copy$default(Custom custom, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = custom.value;
            }
            return custom.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final Custom copy(@NotNull String value) {
            Intrinsics.h(value, "value");
            return new Custom(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Custom) && Intrinsics.c(this.value, ((Custom) other).value);
        }

        @Override // me.oriient.ipssdk.realtime.services.tag.model.EventTagType
        @NotNull
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return b.r(new StringBuilder("Custom(value="), this.value, ')');
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/model/EventTagType$ItemNotFound;", "Lme/oriient/ipssdk/realtime/services/tag/model/EventTagType;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ItemNotFound extends EventTagType {

        @NotNull
        public static final ItemNotFound INSTANCE = new ItemNotFound();

        private ItemNotFound() {
            super("itemNotFound", null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/model/EventTagType$ProductScan;", "Lme/oriient/ipssdk/realtime/services/tag/model/EventTagType;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ProductScan extends EventTagType {

        @NotNull
        public static final ProductScan INSTANCE = new ProductScan();

        private ProductScan() {
            super("productScan", null);
        }
    }

    public EventTagType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.value = str;
    }

    @NotNull
    public String getValue() {
        return this.value;
    }
}
