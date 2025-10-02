package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BE\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\u000fJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÁ\u0001¢\u0006\u0002\b(R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006+"}, d2 = {"Lme/oriient/internal/services/dataManager/building/Entrance;", "", "seen1", "", "id", "", "entranceDescription", "isMain", "", "x", "", "y", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;ZDD)V", "getEntranceDescription", "()Ljava/lang/String;", "getId", "()Z", "getX", "()D", "getY", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class Entrance {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final String entranceDescription;

    @NotNull
    private final String id;
    private final boolean isMain;
    private final double x;
    private final double y;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/building/Entrance$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/building/Entrance;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<Entrance> serializer() {
            return Entrance$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ Entrance(int i, String str, String str2, boolean z, double d, double d2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.a(i, 31, Entrance$$serializer.INSTANCE.getB());
            throw null;
        }
        this.id = str;
        this.entranceDescription = str2;
        this.isMain = z;
        this.x = d;
        this.y = d2;
    }

    public static /* synthetic */ Entrance copy$default(Entrance entrance, String str, String str2, boolean z, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entrance.id;
        }
        if ((i & 2) != 0) {
            str2 = entrance.entranceDescription;
        }
        if ((i & 4) != 0) {
            z = entrance.isMain;
        }
        if ((i & 8) != 0) {
            d = entrance.x;
        }
        if ((i & 16) != 0) {
            d2 = entrance.y;
        }
        double d3 = d2;
        boolean z2 = z;
        return entrance.copy(str, str2, z2, d, d3);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(Entrance self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.id);
        output.p(serialDesc, 1, self.entranceDescription);
        output.o(serialDesc, 2, self.isMain);
        output.G(serialDesc, 3, self.x);
        output.G(serialDesc, 4, self.y);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEntranceDescription() {
        return this.entranceDescription;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsMain() {
        return this.isMain;
    }

    /* renamed from: component4, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component5, reason: from getter */
    public final double getY() {
        return this.y;
    }

    @NotNull
    public final Entrance copy(@NotNull String id, @NotNull String entranceDescription, boolean isMain, double x, double y) {
        Intrinsics.h(id, "id");
        Intrinsics.h(entranceDescription, "entranceDescription");
        return new Entrance(id, entranceDescription, isMain, x, y);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Entrance)) {
            return false;
        }
        Entrance entrance = (Entrance) other;
        return Intrinsics.c(this.id, entrance.id) && Intrinsics.c(this.entranceDescription, entrance.entranceDescription) && this.isMain == entrance.isMain && Double.compare(this.x, entrance.x) == 0 && Double.compare(this.y, entrance.y) == 0;
    }

    @NotNull
    public final String getEntranceDescription() {
        return this.entranceDescription;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        return Double.hashCode(this.y) + me.oriient.internal.infra.locationManager.J.a(this.x, me.oriient.internal.infra.scheduler.a.a(this.isMain, me.oriient.internal.infra.rest.a.a(this.entranceDescription, this.id.hashCode() * 31, 31), 31), 31);
    }

    public final boolean isMain() {
        return this.isMain;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Entrance(id=");
        sb.append(this.id);
        sb.append(", entranceDescription=");
        sb.append(this.entranceDescription);
        sb.append(", isMain=");
        sb.append(this.isMain);
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        return E.a(sb, this.y, ')');
    }

    public Entrance(@NotNull String id, @NotNull String entranceDescription, boolean z, double d, double d2) {
        Intrinsics.h(id, "id");
        Intrinsics.h(entranceDescription, "entranceDescription");
        this.id = id;
        this.entranceDescription = entranceDescription;
        this.isMain = z;
        this.x = d;
        this.y = d2;
    }
}
