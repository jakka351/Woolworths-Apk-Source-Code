package com.salesforce.marketingcloud.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.storage.db.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MCKeep
@Parcelize
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 C2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002CDB\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005Bo\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\u0010\u0015J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\"J\u0011\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0000H\u0096\u0002J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jy\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001J\t\u00100\u001a\u00020\u000bHÖ\u0001J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\b1J\u0013\u00102\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u000bHÖ\u0001J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b5J\r\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0002\b6J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007¢\u0006\u0002\b7J\r\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0002\b8J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\b9J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\b:J\r\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\b;J\r\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0002\b<J\t\u0010=\u001a\u00020\u0007HÖ\u0001J\u0019\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0017R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0017R,\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198A@AX\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001d\u0010\u001fR\u0013\u0010\r\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010 R\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010!R\u0013\u0010\u000e\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010 R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0017R\u0013\u0010\n\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010 R\u0013\u0010\u000f\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 ¨\u0006E"}, d2 = {"Lcom/salesforce/marketingcloud/messages/Region;", "Landroid/os/Parcelable;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "id", "", "center", "Lcom/salesforce/marketingcloud/location/LatLon;", "radius", "", "proximityUuid", "major", "minor", "regionType", AppMeasurementSdk.ConditionalUserProperty.NAME, lqlqqlq.mmm006Dm006Dm, i.e, "", "Lcom/salesforce/marketingcloud/messages/Message;", "(Ljava/lang/String;Lcom/salesforce/marketingcloud/location/LatLon;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "()Lcom/salesforce/marketingcloud/location/LatLon;", "()Ljava/lang/String;", "<set-?>", "", "isInside", "-isInside$annotations", "()V", "-isInside", "()Z", "(Z)V", "()I", "()Ljava/util/List;", "-deprecated_center", "compareTo", "other", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "-deprecated_description", "equals", "", "hashCode", "-deprecated_id", "-deprecated_major", "-deprecated_messages", "-deprecated_minor", "-deprecated_name", "-deprecated_proximityUuid", "-deprecated_radius", "-deprecated_regionType", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "RegionType", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class Region implements Parcelable, Comparable<Region> {

    @NotNull
    public static final String MAGIC_REGION_ID = "~~m@g1c_f3nc3~~";
    public static final int REGION_TYPE_FENCE = 1;
    public static final int REGION_TYPE_PROXIMITY = 3;

    @NotNull
    private final LatLon center;

    @Nullable
    private final String description;

    @NotNull
    private final String id;
    private boolean isInside;
    private final int major;

    @NotNull
    private final List<Message> messages;
    private final int minor;

    @Nullable
    private final String name;

    @Nullable
    private final String proximityUuid;
    private final int radius;
    private final int regionType;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Region> CREATOR = new c();

    @NotNull
    private static final String TAG = g.a("Region");

    @MCKeep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\u00048AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/salesforce/marketingcloud/messages/Region$Companion;", "", "()V", "MAGIC_REGION_ID", "", "REGION_TYPE_FENCE", "", "REGION_TYPE_PROXIMITY", "TAG", "-TAG", "()Ljava/lang/String;", "magicFence", "Lcom/salesforce/marketingcloud/messages/Region;", "center", "Lcom/salesforce/marketingcloud/location/LatLon;", "radius", "-magicFence", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmName
        @NotNull
        /* renamed from: -TAG, reason: not valid java name */
        public final String m146TAG() {
            return Region.TAG;
        }

        @JvmName
        @NotNull
        /* renamed from: -magicFence, reason: not valid java name */
        public final Region m147magicFence(@NotNull LatLon center, int radius) {
            Intrinsics.h(center, "center");
            return new Region(Region.MAGIC_REGION_ID, center, radius, null, 0, 0, -1, null, null, null, 952, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @MCKeep
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/salesforce/marketingcloud/messages/Region$RegionType;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface RegionType {
    }

    public static final class a extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16984a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to parse Message from region payload.";
        }
    }

    public static final class b extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f16985a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to parse region messages.";
        }
    }

    /* renamed from: -isInside$annotations, reason: not valid java name */
    public static /* synthetic */ void m133isInside$annotations() {
    }

    public Region(@NotNull String id, @NotNull LatLon center, int i, @Nullable String str, int i2, int i3, int i4, @Nullable String str2, @Nullable String str3, @NotNull List<Message> messages) {
        Intrinsics.h(id, "id");
        Intrinsics.h(center, "center");
        Intrinsics.h(messages, "messages");
        this.id = id;
        this.center = center;
        this.radius = i;
        this.proximityUuid = str;
        this.major = i2;
        this.minor = i3;
        this.regionType = i4;
        this.name = str2;
        this.description = str3;
        this.messages = messages;
    }

    public static /* synthetic */ Region copy$default(Region region, String str, LatLon latLon, int i, String str2, int i2, int i3, int i4, String str3, String str4, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = region.id;
        }
        if ((i5 & 2) != 0) {
            latLon = region.center;
        }
        if ((i5 & 4) != 0) {
            i = region.radius;
        }
        if ((i5 & 8) != 0) {
            str2 = region.proximityUuid;
        }
        if ((i5 & 16) != 0) {
            i2 = region.major;
        }
        if ((i5 & 32) != 0) {
            i3 = region.minor;
        }
        if ((i5 & 64) != 0) {
            i4 = region.regionType;
        }
        if ((i5 & 128) != 0) {
            str3 = region.name;
        }
        if ((i5 & 256) != 0) {
            str4 = region.description;
        }
        if ((i5 & 512) != 0) {
            list = region.messages;
        }
        String str5 = str4;
        List list2 = list;
        int i6 = i4;
        String str6 = str3;
        int i7 = i2;
        int i8 = i3;
        return region.copy(str, latLon, i, str2, i7, i8, i6, str6, str5, list2);
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_center, reason: not valid java name and from getter */
    public final LatLon getCenter() {
        return this.center;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_description, reason: not valid java name and from getter */
    public final String getDescription() {
        return this.description;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_id, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_major, reason: not valid java name and from getter */
    public final int getMajor() {
        return this.major;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_messages, reason: not valid java name */
    public final List<Message> m138deprecated_messages() {
        return this.messages;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_minor, reason: not valid java name and from getter */
    public final int getMinor() {
        return this.minor;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_name, reason: not valid java name and from getter */
    public final String getName() {
        return this.name;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_proximityUuid, reason: not valid java name and from getter */
    public final String getProximityUuid() {
        return this.proximityUuid;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_radius, reason: not valid java name and from getter */
    public final int getRadius() {
        return this.radius;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_regionType, reason: not valid java name and from getter */
    public final int getRegionType() {
        return this.regionType;
    }

    @JvmName
    /* renamed from: -isInside, reason: not valid java name */
    public final void m144isInside(boolean z) {
        this.isInside = z;
    }

    @JvmName
    @NotNull
    public final LatLon center() {
        return this.center;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Region other) {
        Intrinsics.h(other, "other");
        return this.id.compareTo(other.id);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final List<Message> component10() {
        return this.messages;
    }

    @NotNull
    public final LatLon component2() {
        return this.center;
    }

    public final int component3() {
        return this.radius;
    }

    @Nullable
    public final String component4() {
        return this.proximityUuid;
    }

    public final int component5() {
        return this.major;
    }

    public final int component6() {
        return this.minor;
    }

    public final int component7() {
        return this.regionType;
    }

    @Nullable
    public final String component8() {
        return this.name;
    }

    @Nullable
    public final String component9() {
        return this.description;
    }

    @NotNull
    public final Region copy(@NotNull String id, @NotNull LatLon center, int radius, @Nullable String proximityUuid, int major, int minor, int regionType, @Nullable String name, @Nullable String description, @NotNull List<Message> messages) {
        Intrinsics.h(id, "id");
        Intrinsics.h(center, "center");
        Intrinsics.h(messages, "messages");
        return new Region(id, center, radius, proximityUuid, major, minor, regionType, name, description, messages);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @JvmName
    @Nullable
    public final String description() {
        return this.description;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Region)) {
            return false;
        }
        Region region = (Region) other;
        return Intrinsics.c(this.id, region.id) && Intrinsics.c(this.center, region.center) && this.radius == region.radius && Intrinsics.c(this.proximityUuid, region.proximityUuid) && this.major == region.major && this.minor == region.minor && this.regionType == region.regionType && Intrinsics.c(this.name, region.name) && Intrinsics.c(this.description, region.description) && Intrinsics.c(this.messages, region.messages);
    }

    public int hashCode() {
        int iA = androidx.camera.core.impl.b.a(this.radius, (this.center.hashCode() + (this.id.hashCode() * 31)) * 31, 31);
        String str = this.proximityUuid;
        int iA2 = androidx.camera.core.impl.b.a(this.regionType, androidx.camera.core.impl.b.a(this.minor, androidx.camera.core.impl.b.a(this.major, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        String str2 = this.name;
        int iHashCode = (iA2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        return this.messages.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @JvmName
    @NotNull
    public final String id() {
        return this.id;
    }

    @JvmName
    public final int major() {
        return this.major;
    }

    @JvmName
    @NotNull
    public final List<Message> messages() {
        return this.messages;
    }

    @JvmName
    public final int minor() {
        return this.minor;
    }

    @JvmName
    @Nullable
    public final String name() {
        return this.name;
    }

    @JvmName
    @Nullable
    public final String proximityUuid() {
        return this.proximityUuid;
    }

    @JvmName
    public final int radius() {
        return this.radius;
    }

    @JvmName
    public final int regionType() {
        return this.regionType;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        LatLon latLon = this.center;
        int i = this.radius;
        String str2 = this.proximityUuid;
        int i2 = this.major;
        int i3 = this.minor;
        int i4 = this.regionType;
        String str3 = this.name;
        String str4 = this.description;
        List<Message> list = this.messages;
        StringBuilder sb = new StringBuilder("Region(id=");
        sb.append(str);
        sb.append(", center=");
        sb.append(latLon);
        sb.append(", radius=");
        androidx.compose.ui.input.pointer.a.u(i, ", proximityUuid=", str2, ", major=", sb);
        YU.a.w(i2, i3, ", minor=", ", regionType=", sb);
        androidx.compose.ui.input.pointer.a.u(i4, ", name=", str3, ", description=", sb);
        sb.append(str4);
        sb.append(", messages=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.h(parcel, "out");
        parcel.writeString(this.id);
        this.center.writeToParcel(parcel, flags);
        parcel.writeInt(this.radius);
        parcel.writeString(this.proximityUuid);
        parcel.writeInt(this.major);
        parcel.writeInt(this.minor);
        parcel.writeInt(this.regionType);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.messages, parcel);
        while (itU.hasNext()) {
            ((Message) itU.next()).writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ Region(String str, LatLon latLon, int i, String str2, int i2, int i3, int i4, String str3, String str4, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, latLon, i, (i5 & 8) != 0 ? null : str2, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 0 : i3, i4, (i5 & 128) != 0 ? null : str3, (i5 & 256) != 0 ? null : str4, (i5 & 512) != 0 ? EmptyList.d : list);
    }

    @JvmName
    /* renamed from: -isInside, reason: not valid java name and from getter */
    public final boolean getIsInside() {
        return this.isInside;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public Region(@org.jetbrains.annotations.NotNull org.json.JSONObject r19) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.Region.<init>(org.json.JSONObject):void");
    }

    public static final class c implements Parcelable.Creator<Region> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Region createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            LatLon latLonCreateFromParcel = LatLon.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i5);
            int iE = 0;
            while (iE != i5) {
                iE = androidx.compose.ui.input.pointer.a.e(Message.CREATOR, parcel, arrayList, iE, 1);
            }
            return new Region(string, latLonCreateFromParcel, i, string2, i2, i3, i4, string3, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Region[] newArray(int i) {
            return new Region[i];
        }
    }
}
