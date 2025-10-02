package me.oriient.internal.services.dataManager.mapGrid;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002%&B=\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB'\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÁ\u0001¢\u0006\u0002\b$R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006'"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridUrl;", "", "seen1", "", "url", "", "mapVersion", "majorVersion", "createdBy", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;IILjava/lang/String;)V", "getCreatedBy", "()Ljava/lang/String;", "getMajorVersion", "()I", "getMapVersion", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class MapGridUrl {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final String createdBy;
    private final int majorVersion;
    private final int mapVersion;

    @Nullable
    private final String url;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridUrl$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridUrl;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<MapGridUrl> serializer() {
            return MapGridUrl$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ MapGridUrl(int i, String str, int i2, int i3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, MapGridUrl$$serializer.INSTANCE.getB());
            throw null;
        }
        this.url = str;
        this.mapVersion = i2;
        this.majorVersion = i3;
        this.createdBy = str2;
    }

    public static /* synthetic */ MapGridUrl copy$default(MapGridUrl mapGridUrl, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = mapGridUrl.url;
        }
        if ((i3 & 2) != 0) {
            i = mapGridUrl.mapVersion;
        }
        if ((i3 & 4) != 0) {
            i2 = mapGridUrl.majorVersion;
        }
        if ((i3 & 8) != 0) {
            str2 = mapGridUrl.createdBy;
        }
        return mapGridUrl.copy(str, i, i2, str2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(MapGridUrl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.w(serialDesc, 0, StringSerializer.f24821a, self.url);
        output.C(1, self.mapVersion, serialDesc);
        output.C(2, self.majorVersion, serialDesc);
        output.p(serialDesc, 3, self.createdBy);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMapVersion() {
        return this.mapVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMajorVersion() {
        return this.majorVersion;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCreatedBy() {
        return this.createdBy;
    }

    @NotNull
    public final MapGridUrl copy(@Nullable String url, int mapVersion, int majorVersion, @NotNull String createdBy) {
        Intrinsics.h(createdBy, "createdBy");
        return new MapGridUrl(url, mapVersion, majorVersion, createdBy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapGridUrl)) {
            return false;
        }
        MapGridUrl mapGridUrl = (MapGridUrl) other;
        return Intrinsics.c(this.url, mapGridUrl.url) && this.mapVersion == mapGridUrl.mapVersion && this.majorVersion == mapGridUrl.majorVersion && Intrinsics.c(this.createdBy, mapGridUrl.createdBy);
    }

    @NotNull
    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final int getMajorVersion() {
        return this.majorVersion;
    }

    public final int getMapVersion() {
        return this.mapVersion;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        return this.createdBy.hashCode() + me.oriient.internal.services.config.a.a(this.majorVersion, me.oriient.internal.services.config.a.a(this.mapVersion, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MapGridUrl(url=");
        sb.append(this.url);
        sb.append(", mapVersion=");
        sb.append(this.mapVersion);
        sb.append(", majorVersion=");
        sb.append(this.majorVersion);
        sb.append(", createdBy=");
        return me.oriient.internal.infra.rest.e.a(sb, this.createdBy, ')');
    }

    public MapGridUrl(@Nullable String str, int i, int i2, @NotNull String createdBy) {
        Intrinsics.h(createdBy, "createdBy");
        this.url = str;
        this.mapVersion = i;
        this.majorVersion = i2;
        this.createdBy = createdBy;
    }
}
