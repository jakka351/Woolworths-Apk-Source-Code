package me.oriient.ipssdk.realtime.ips;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.building.Floor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/FloorSelectionStrategy;", "", "AutoFloorDetection", "FloorDetectionNotSupported", "Manual", "ManualInvalidFloorOrder", "Lme/oriient/ipssdk/realtime/ips/FloorSelectionStrategy$AutoFloorDetection;", "Lme/oriient/ipssdk/realtime/ips/FloorSelectionStrategy$FloorDetectionNotSupported;", "Lme/oriient/ipssdk/realtime/ips/FloorSelectionStrategy$Manual;", "Lme/oriient/ipssdk/realtime/ips/FloorSelectionStrategy$ManualInvalidFloorOrder;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class FloorSelectionStrategy {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/FloorSelectionStrategy$AutoFloorDetection;", "Lme/oriient/ipssdk/realtime/ips/FloorSelectionStrategy;", "", "Lme/oriient/internal/services/dataManager/building/Floor;", "floors", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lme/oriient/ipssdk/realtime/ips/FloorSelectionStrategy$AutoFloorDetection;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getFloors", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AutoFloorDetection extends FloorSelectionStrategy {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List floors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoFloorDetection(@NotNull List<Floor> floors) {
            super(null);
            Intrinsics.h(floors, "floors");
            this.floors = floors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AutoFloorDetection copy$default(AutoFloorDetection autoFloorDetection, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = autoFloorDetection.floors;
            }
            return autoFloorDetection.copy(list);
        }

        @NotNull
        public final List<Floor> component1() {
            return this.floors;
        }

        @NotNull
        public final AutoFloorDetection copy(@NotNull List<Floor> floors) {
            Intrinsics.h(floors, "floors");
            return new AutoFloorDetection(floors);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AutoFloorDetection) && Intrinsics.c(this.floors, ((AutoFloorDetection) other).floors);
        }

        @NotNull
        public final List<Floor> getFloors() {
            return this.floors;
        }

        public int hashCode() {
            return this.floors.hashCode();
        }

        @NotNull
        public String toString() {
            return androidx.compose.ui.input.pointer.a.o(new StringBuilder("AutoFloorDetection(floors="), this.floors, ')');
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/FloorSelectionStrategy$FloorDetectionNotSupported;", "Lme/oriient/ipssdk/realtime/ips/FloorSelectionStrategy;", "()V", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FloorDetectionNotSupported extends FloorSelectionStrategy {
        public FloorDetectionNotSupported() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/FloorSelectionStrategy$Manual;", "Lme/oriient/ipssdk/realtime/ips/FloorSelectionStrategy;", "Lme/oriient/internal/services/dataManager/building/Floor;", "floor", "<init>", "(Lme/oriient/internal/services/dataManager/building/Floor;)V", "component1", "()Lme/oriient/internal/services/dataManager/building/Floor;", "copy", "(Lme/oriient/internal/services/dataManager/building/Floor;)Lme/oriient/ipssdk/realtime/ips/FloorSelectionStrategy$Manual;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lme/oriient/internal/services/dataManager/building/Floor;", "getFloor", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Manual extends FloorSelectionStrategy {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Floor floor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Manual(@NotNull Floor floor) {
            super(null);
            Intrinsics.h(floor, "floor");
            this.floor = floor;
        }

        public static /* synthetic */ Manual copy$default(Manual manual, Floor floor, int i, Object obj) {
            if ((i & 1) != 0) {
                floor = manual.floor;
            }
            return manual.copy(floor);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Floor getFloor() {
            return this.floor;
        }

        @NotNull
        public final Manual copy(@NotNull Floor floor) {
            Intrinsics.h(floor, "floor");
            return new Manual(floor);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Manual) && Intrinsics.c(this.floor, ((Manual) other).floor);
        }

        @NotNull
        public final Floor getFloor() {
            return this.floor;
        }

        public int hashCode() {
            return this.floor.hashCode();
        }

        @NotNull
        public String toString() {
            return "Manual(floor=" + this.floor + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/FloorSelectionStrategy$ManualInvalidFloorOrder;", "Lme/oriient/ipssdk/realtime/ips/FloorSelectionStrategy;", "()V", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ManualInvalidFloorOrder extends FloorSelectionStrategy {
        public ManualInvalidFloorOrder() {
            super(null);
        }
    }

    public FloorSelectionStrategy(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
