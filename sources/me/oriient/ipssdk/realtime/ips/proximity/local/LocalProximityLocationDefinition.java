package me.oriient.ipssdk.realtime.ips.proximity.local;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0014\u0010\u0005\u001a\u00020\u00028 X \u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition;", "", "", "getDescription$me_oriient_sdk_realtime", "()Ljava/lang/String;", lqlqqlq.mmm006Dm006Dm, "AreaCircle", "AreaPolygon", "AreaRectangle", "WalkingDistance", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$AreaCircle;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$AreaPolygon;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$AreaRectangle;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$WalkingDistance;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class LocalProximityLocationDefinition {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u0014\u0010 \u001a\u00020\u000e8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010¨\u0006!"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$AreaCircle;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition;", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "center", "", "radiusMeters", "<init>", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;D)V", "component1", "()Lme/oriient/ipssdk/api/models/IPSCoordinate;", "component2", "()D", "copy", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;D)Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$AreaCircle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "getCenter", "b", "D", "getRadiusMeters", "getDescription$me_oriient_sdk_realtime", lqlqqlq.mmm006Dm006Dm, "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AreaCircle extends LocalProximityLocationDefinition {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final IPSCoordinate center;

        /* renamed from: b, reason: from kotlin metadata */
        private final double radiusMeters;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AreaCircle(@NotNull IPSCoordinate center, double d) {
            super(null);
            Intrinsics.h(center, "center");
            this.center = center;
            this.radiusMeters = d;
        }

        public static /* synthetic */ AreaCircle copy$default(AreaCircle areaCircle, IPSCoordinate iPSCoordinate, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                iPSCoordinate = areaCircle.center;
            }
            if ((i & 2) != 0) {
                d = areaCircle.radiusMeters;
            }
            return areaCircle.copy(iPSCoordinate, d);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IPSCoordinate getCenter() {
            return this.center;
        }

        /* renamed from: component2, reason: from getter */
        public final double getRadiusMeters() {
            return this.radiusMeters;
        }

        @NotNull
        public final AreaCircle copy(@NotNull IPSCoordinate center, double radiusMeters) {
            Intrinsics.h(center, "center");
            return new AreaCircle(center, radiusMeters);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AreaCircle)) {
                return false;
            }
            AreaCircle areaCircle = (AreaCircle) other;
            return Intrinsics.c(this.center, areaCircle.center) && Double.compare(this.radiusMeters, areaCircle.radiusMeters) == 0;
        }

        @NotNull
        public final IPSCoordinate getCenter() {
            return this.center;
        }

        @Override // me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationDefinition
        @NotNull
        public String getDescription$me_oriient_sdk_realtime() {
            return "areaCircle";
        }

        public final double getRadiusMeters() {
            return this.radiusMeters;
        }

        public int hashCode() {
            return Double.hashCode(this.radiusMeters) + (this.center.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("AreaCircle(center=");
            sb.append(this.center);
            sb.append(", radiusMeters=");
            return androidx.camera.core.impl.b.p(sb, this.radiusMeters, ')');
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0014\u0010\u001a\u001a\u00020\u000b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\r¨\u0006\u001b"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$AreaPolygon;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition;", "", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "points", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$AreaPolygon;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getPoints", "getDescription$me_oriient_sdk_realtime", lqlqqlq.mmm006Dm006Dm, "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AreaPolygon extends LocalProximityLocationDefinition {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List points;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AreaPolygon(@NotNull List<IndoorCoordinate> points) {
            super(null);
            Intrinsics.h(points, "points");
            this.points = points;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AreaPolygon copy$default(AreaPolygon areaPolygon, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = areaPolygon.points;
            }
            return areaPolygon.copy(list);
        }

        @NotNull
        public final List<IndoorCoordinate> component1() {
            return this.points;
        }

        @NotNull
        public final AreaPolygon copy(@NotNull List<IndoorCoordinate> points) {
            Intrinsics.h(points, "points");
            return new AreaPolygon(points);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AreaPolygon) && Intrinsics.c(this.points, ((AreaPolygon) other).points);
        }

        @Override // me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationDefinition
        @NotNull
        public String getDescription$me_oriient_sdk_realtime() {
            return "areaPolygon";
        }

        @NotNull
        public final List<IndoorCoordinate> getPoints() {
            return this.points;
        }

        public int hashCode() {
            return this.points.hashCode();
        }

        @NotNull
        public String toString() {
            return androidx.compose.ui.input.pointer.a.o(new StringBuilder("AreaPolygon(points="), this.points, ')');
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\bR\u0014\u0010\u001d\u001a\u00020\f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001e"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$AreaRectangle;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition;", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "topRight", "bottomLeft", "<init>", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSCoordinate;)V", "component1", "()Lme/oriient/ipssdk/api/models/IPSCoordinate;", "component2", "copy", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSCoordinate;)Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$AreaRectangle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "getTopRight", "b", "getBottomLeft", "getDescription$me_oriient_sdk_realtime", lqlqqlq.mmm006Dm006Dm, "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AreaRectangle extends LocalProximityLocationDefinition {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final IPSCoordinate topRight;

        /* renamed from: b, reason: from kotlin metadata */
        private final IPSCoordinate bottomLeft;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AreaRectangle(@NotNull IPSCoordinate topRight, @NotNull IPSCoordinate bottomLeft) {
            super(null);
            Intrinsics.h(topRight, "topRight");
            Intrinsics.h(bottomLeft, "bottomLeft");
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
        }

        public static /* synthetic */ AreaRectangle copy$default(AreaRectangle areaRectangle, IPSCoordinate iPSCoordinate, IPSCoordinate iPSCoordinate2, int i, Object obj) {
            if ((i & 1) != 0) {
                iPSCoordinate = areaRectangle.topRight;
            }
            if ((i & 2) != 0) {
                iPSCoordinate2 = areaRectangle.bottomLeft;
            }
            return areaRectangle.copy(iPSCoordinate, iPSCoordinate2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IPSCoordinate getTopRight() {
            return this.topRight;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IPSCoordinate getBottomLeft() {
            return this.bottomLeft;
        }

        @NotNull
        public final AreaRectangle copy(@NotNull IPSCoordinate topRight, @NotNull IPSCoordinate bottomLeft) {
            Intrinsics.h(topRight, "topRight");
            Intrinsics.h(bottomLeft, "bottomLeft");
            return new AreaRectangle(topRight, bottomLeft);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AreaRectangle)) {
                return false;
            }
            AreaRectangle areaRectangle = (AreaRectangle) other;
            return Intrinsics.c(this.topRight, areaRectangle.topRight) && Intrinsics.c(this.bottomLeft, areaRectangle.bottomLeft);
        }

        @NotNull
        public final IPSCoordinate getBottomLeft() {
            return this.bottomLeft;
        }

        @Override // me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationDefinition
        @NotNull
        public String getDescription$me_oriient_sdk_realtime() {
            return "areaRectangle";
        }

        @NotNull
        public final IPSCoordinate getTopRight() {
            return this.topRight;
        }

        public int hashCode() {
            return this.bottomLeft.hashCode() + (this.topRight.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AreaRectangle(topRight=" + this.topRight + ", bottomLeft=" + this.bottomLeft + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u0014\u0010 \u001a\u00020\u000e8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010¨\u0006!"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$WalkingDistance;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition;", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "from", "Lme/oriient/ipssdk/realtime/ips/proximity/local/PointProximityEventAreaRadius;", "distanceLimit", "<init>", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/realtime/ips/proximity/local/PointProximityEventAreaRadius;)V", "component1", "()Lme/oriient/ipssdk/api/models/IPSCoordinate;", "component2", "()Lme/oriient/ipssdk/realtime/ips/proximity/local/PointProximityEventAreaRadius;", "copy", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/realtime/ips/proximity/local/PointProximityEventAreaRadius;)Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition$WalkingDistance;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "getFrom", "b", "Lme/oriient/ipssdk/realtime/ips/proximity/local/PointProximityEventAreaRadius;", "getDistanceLimit", "getDescription$me_oriient_sdk_realtime", lqlqqlq.mmm006Dm006Dm, "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WalkingDistance extends LocalProximityLocationDefinition {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final IPSCoordinate from;

        /* renamed from: b, reason: from kotlin metadata */
        private final PointProximityEventAreaRadius distanceLimit;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PointProximityEventAreaRadius.values().length];
                try {
                    iArr[PointProximityEventAreaRadius.SMALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PointProximityEventAreaRadius.MEDIUM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PointProximityEventAreaRadius.LARGE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WalkingDistance(@NotNull IPSCoordinate from, @NotNull PointProximityEventAreaRadius distanceLimit) {
            super(null);
            Intrinsics.h(from, "from");
            Intrinsics.h(distanceLimit, "distanceLimit");
            this.from = from;
            this.distanceLimit = distanceLimit;
        }

        public static /* synthetic */ WalkingDistance copy$default(WalkingDistance walkingDistance, IPSCoordinate iPSCoordinate, PointProximityEventAreaRadius pointProximityEventAreaRadius, int i, Object obj) {
            if ((i & 1) != 0) {
                iPSCoordinate = walkingDistance.from;
            }
            if ((i & 2) != 0) {
                pointProximityEventAreaRadius = walkingDistance.distanceLimit;
            }
            return walkingDistance.copy(iPSCoordinate, pointProximityEventAreaRadius);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IPSCoordinate getFrom() {
            return this.from;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PointProximityEventAreaRadius getDistanceLimit() {
            return this.distanceLimit;
        }

        @NotNull
        public final WalkingDistance copy(@NotNull IPSCoordinate from, @NotNull PointProximityEventAreaRadius distanceLimit) {
            Intrinsics.h(from, "from");
            Intrinsics.h(distanceLimit, "distanceLimit");
            return new WalkingDistance(from, distanceLimit);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WalkingDistance)) {
                return false;
            }
            WalkingDistance walkingDistance = (WalkingDistance) other;
            return Intrinsics.c(this.from, walkingDistance.from) && this.distanceLimit == walkingDistance.distanceLimit;
        }

        @Override // me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationDefinition
        @NotNull
        public String getDescription$me_oriient_sdk_realtime() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.distanceLimit.ordinal()];
            if (i == 1) {
                return "closeWalkingDistance";
            }
            if (i == 2) {
                return "mediumWalkingDistance";
            }
            if (i == 3) {
                return "longWalkingDistance";
            }
            throw new NoWhenBranchMatchedException();
        }

        @NotNull
        public final PointProximityEventAreaRadius getDistanceLimit() {
            return this.distanceLimit;
        }

        @NotNull
        public final IPSCoordinate getFrom() {
            return this.from;
        }

        public int hashCode() {
            return this.distanceLimit.hashCode() + (this.from.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "WalkingDistance(from=" + this.from + ", distanceLimit=" + this.distanceLimit + ')';
        }
    }

    public LocalProximityLocationDefinition(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @NotNull
    public abstract String getDescription$me_oriient_sdk_realtime();
}
