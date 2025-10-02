package me.oriient.navigation.common.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001f"}, d2 = {"Lme/oriient/navigation/common/models/TransitionCore;", "", "", "uuid", "", "index", "Lme/oriient/navigation/common/models/TransitionCore$a;", "type", "<init>", "(Ljava/lang/String;ILme/oriient/navigation/common/models/TransitionCore$a;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lme/oriient/navigation/common/models/TransitionCore$a;", "copy", "(Ljava/lang/String;ILme/oriient/navigation/common/models/TransitionCore$a;)Lme/oriient/navigation/common/models/TransitionCore;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "I", "getIndex", "Lme/oriient/navigation/common/models/TransitionCore$a;", "getType", "a", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TransitionCore {
    private final int index;

    @NotNull
    private final a type;

    @NotNull
    private final String uuid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @NotNull
        public static final j Companion;

        @NotNull
        private final String value;
        public static final a ESCALATOR = new a("ESCALATOR", 0, "escalator");
        public static final a ELEVATOR = new a("ELEVATOR", 1, "elevator");
        public static final a STAIRS = new a("STAIRS", 2, "stairs");
        public static final a RAMP = new a("RAMP", 3, "ramp");
        public static final a UNKNOWN = new a("UNKNOWN", 4, com.salesforce.marketingcloud.messages.iam.j.h);

        private static final /* synthetic */ a[] $values() {
            return new a[]{ESCALATOR, ELEVATOR, STAIRS, RAMP, UNKNOWN};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = EnumEntriesKt.a(aVarArr$values);
            Companion = new j();
        }

        private a(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public TransitionCore(@NotNull String uuid, int i, @NotNull a type) {
        Intrinsics.h(uuid, "uuid");
        Intrinsics.h(type, "type");
        this.uuid = uuid;
        this.index = i;
        this.type = type;
    }

    public static /* synthetic */ TransitionCore copy$default(TransitionCore transitionCore, String str, int i, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = transitionCore.uuid;
        }
        if ((i2 & 2) != 0) {
            i = transitionCore.index;
        }
        if ((i2 & 4) != 0) {
            aVar = transitionCore.type;
        }
        return transitionCore.copy(str, i, aVar);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final a getType() {
        return this.type;
    }

    @NotNull
    public final TransitionCore copy(@NotNull String uuid, int index, @NotNull a type) {
        Intrinsics.h(uuid, "uuid");
        Intrinsics.h(type, "type");
        return new TransitionCore(uuid, index, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransitionCore)) {
            return false;
        }
        TransitionCore transitionCore = (TransitionCore) other;
        return Intrinsics.c(this.uuid, transitionCore.uuid) && this.index == transitionCore.index && this.type == transitionCore.type;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final a getType() {
        return this.type;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.type.hashCode() + androidx.camera.core.impl.b.a(this.index, this.uuid.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "TransitionCore(uuid=" + this.uuid + ", index=" + this.index + ", type=" + this.type + ')';
    }
}
