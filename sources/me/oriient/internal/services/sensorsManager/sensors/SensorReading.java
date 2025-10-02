package me.oriient.internal.services.sensorsManager.sensors;

import androidx.annotation.CallSuper;
import androidx.annotation.Keep;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.salesforce.marketingcloud.storage.db.h;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.infra.utils.android.appState.AppState;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.building.E;
import me.oriient.internal.services.sensorsManager.C1487a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 $2\u00020\u0001:\t#$%&'()*+B#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0017J!\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0012\u0010\u000f\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\b,-./0123¨\u00064"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading;", "", "seen1", "", "type", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/sensorsManager/sensors/SystemSensor;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;)V", "hasNaN", "", "getHasNaN", "()Z", "isNaN", "isZeroes", "timestampNanos", "", "getTimestampNanos", "()J", "timestampUnixMillis", "getTimestampUnixMillis", "getType", "()Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "appendRsmp", "", "appendTo", "Ljava/nio/ByteBuffer;", "firstTimestampNanos", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "AccelerometerReading", "Companion", "GameRotationVectorReading", "GyroscopeReading", "GyroscopeUncalibratedReading", "LocationReading", "MagneticFieldReading", "MagneticFieldUncalibratedReading", "PressureReading", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$AccelerometerReading;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GameRotationVectorReading;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeReading;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeUncalibratedReading;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$LocationReading;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldReading;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldUncalibratedReading;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$PressureReading;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public abstract class SensorReading {

    @NotNull
    private final SystemSensor type;

    @NotNull
    private static final Companion Companion = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.b(SystemSensor.values(), "me.oriient.internal.services.sensorsManager.sensors.SystemSensor")};

    @NotNull
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.d, a.f25591a);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static long a(TimeProvider timeProvider, long j) {
            Intrinsics.h(timeProvider, "timeProvider");
            return timeProvider.getCurrentTimeMillis() - TimeUnit.NANOSECONDS.toMillis(Math.abs(timeProvider.getElapsedTimeNano() - j));
        }

        @NotNull
        public final KSerializer<SensorReading> serializer() {
            return (KSerializer) SensorReading.$cachedSerializer$delegate.getD();
        }
    }

    public /* synthetic */ SensorReading(SystemSensor systemSensor, DefaultConstructorMarker defaultConstructorMarker) {
        this(systemSensor);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(SensorReading self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.F(serialDesc, 0, $childSerializers[0], self.type);
    }

    @CallSuper
    public void appendRsmp(@NotNull ByteBuffer appendTo, long firstTimestampNanos) {
        Intrinsics.h(appendTo, "appendTo");
        appendTo.putInt((int) ((getTimestampNanos() - firstTimestampNanos) / 100000));
    }

    public abstract boolean getHasNaN();

    public abstract long getTimestampNanos();

    public abstract long getTimestampUnixMillis();

    @NotNull
    public final SystemSensor getType() {
        return this.type;
    }

    /* renamed from: isNaN */
    public abstract boolean getIsNaN();

    /* renamed from: isZeroes */
    public abstract boolean getIsZeroes();

    @Deprecated
    public /* synthetic */ SensorReading(int i, SystemSensor systemSensor, SerializationConstructorMarker serializationConstructorMarker) {
        this.type = systemSensor;
    }

    private SensorReading(SystemSensor systemSensor) {
        this.type = systemSensor;
    }

    @Keep
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BAB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\rBU\b\u0011\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0007\u0010\u0018J(\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cHÁ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0000¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b-\u0010.J.\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010+R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010+R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010.R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b\u0013\u0010?R\u001a\u0010\u0014\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\b\u0014\u0010?R\u001a\u0010\u0015\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b@\u0010?¨\u0006C"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$PressureReading;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading;", "", "timestampNanos", "timestampUnixMillis", "", "pressureKpa", "<init>", "(JJD)V", "Lme/oriient/internal/services/sensorsManager/a;", "eventWrapper", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "(Lme/oriient/internal/services/sensorsManager/a;Lme/oriient/internal/infra/utils/core/time/TimeProvider;)V", "", "seen1", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "type", "", "isZeroes", "isNaN", "hasNaN", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILme/oriient/internal/services/sensorsManager/sensors/SystemSensor;JJDZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$internal_publishRelease", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$PressureReading;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/nio/ByteBuffer;", "appendTo", "firstTimestampNanos", "appendRsmp", "(Ljava/nio/ByteBuffer;J)V", "other", "isSameValues", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$PressureReading;)Z", "component1", "()J", "component2", "component3", "()D", "copy", "(JJD)Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$PressureReading;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestampNanos", "getTimestampUnixMillis", "D", "getPressureKpa", "Z", "()Z", "getHasNaN", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PressureReading extends SensorReading {
        private final boolean hasNaN;
        private final boolean isNaN;
        private final boolean isZeroes;
        private final double pressureKpa;
        private final long timestampNanos;
        private final long timestampUnixMillis;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @JvmField
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {EnumsKt.b(SystemSensor.values(), "me.oriient.internal.services.sensorsManager.sensors.SystemSensor"), null, null, null, null, null, null};

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$PressureReading$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$PressureReading;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<PressureReading> serializer() {
                return SensorReading$PressureReading$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ PressureReading(int i, SystemSensor systemSensor, long j, long j2, double d, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, systemSensor, serializationConstructorMarker);
            if (15 != (i & 15)) {
                PluginExceptionsKt.a(i, 15, SensorReading$PressureReading$$serializer.INSTANCE.getB());
                throw null;
            }
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.pressureKpa = d;
            if ((i & 16) == 0) {
                this.isZeroes = d == 0.0d;
            } else {
                this.isZeroes = z;
            }
            if ((i & 32) == 0) {
                this.isNaN = Double.isNaN(d);
            } else {
                this.isNaN = z2;
            }
            if ((i & 64) == 0) {
                this.hasNaN = Double.isNaN(d);
            } else {
                this.hasNaN = z3;
            }
        }

        public static /* synthetic */ PressureReading copy$default(PressureReading pressureReading, long j, long j2, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                j = pressureReading.timestampNanos;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = pressureReading.timestampUnixMillis;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                d = pressureReading.pressureKpa;
            }
            return pressureReading.copy(j3, j4, d);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading.PressureReading r7, kotlinx.serialization.encoding.CompositeEncoder r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
            /*
                me.oriient.internal.services.sensorsManager.sensors.SensorReading.write$Self(r7, r8, r9)
                long r0 = r7.getTimestampNanos()
                r2 = 1
                r8.t(r9, r2, r0)
                long r0 = r7.getTimestampUnixMillis()
                r3 = 2
                r8.t(r9, r3, r0)
                double r0 = r7.pressureKpa
                r3 = 3
                r8.G(r9, r3, r0)
                r0 = 4
                boolean r1 = r8.q(r9, r0)
                if (r1 == 0) goto L21
                goto L31
            L21:
                boolean r1 = r7.getIsZeroes()
                double r3 = r7.pressureKpa
                r5 = 0
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 != 0) goto L2e
                goto L2f
            L2e:
                r2 = 0
            L2f:
                if (r1 == r2) goto L38
            L31:
                boolean r1 = r7.getIsZeroes()
                r8.o(r9, r0, r1)
            L38:
                r0 = 5
                boolean r1 = r8.q(r9, r0)
                if (r1 == 0) goto L40
                goto L4c
            L40:
                boolean r1 = r7.getIsNaN()
                double r2 = r7.pressureKpa
                boolean r2 = java.lang.Double.isNaN(r2)
                if (r1 == r2) goto L53
            L4c:
                boolean r1 = r7.getIsNaN()
                r8.o(r9, r0, r1)
            L53:
                r0 = 6
                boolean r1 = r8.q(r9, r0)
                if (r1 == 0) goto L5b
                goto L67
            L5b:
                boolean r1 = r7.getHasNaN()
                double r2 = r7.pressureKpa
                boolean r2 = java.lang.Double.isNaN(r2)
                if (r1 == r2) goto L6e
            L67:
                boolean r7 = r7.getHasNaN()
                r8.o(r9, r0, r7)
            L6e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.sensorsManager.sensors.SensorReading.PressureReading.write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading$PressureReading, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public void appendRsmp(@NotNull ByteBuffer appendTo, long firstTimestampNanos) {
            Intrinsics.h(appendTo, "appendTo");
            super.appendRsmp(appendTo, firstTimestampNanos);
            appendTo.putFloat((float) this.pressureKpa);
            appendTo.putFloat(BitmapDescriptorFactory.HUE_RED);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestampNanos() {
            return this.timestampNanos;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        /* renamed from: component3, reason: from getter */
        public final double getPressureKpa() {
            return this.pressureKpa;
        }

        @NotNull
        public final PressureReading copy(long timestampNanos, long timestampUnixMillis, double pressureKpa) {
            return new PressureReading(timestampNanos, timestampUnixMillis, pressureKpa);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PressureReading)) {
                return false;
            }
            PressureReading pressureReading = (PressureReading) other;
            return this.timestampNanos == pressureReading.timestampNanos && this.timestampUnixMillis == pressureReading.timestampUnixMillis && Double.compare(this.pressureKpa, pressureReading.pressureKpa) == 0;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public boolean getHasNaN() {
            return this.hasNaN;
        }

        public final double getPressureKpa() {
            return this.pressureKpa;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampNanos() {
            return this.timestampNanos;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        public int hashCode() {
            return Double.hashCode(this.pressureKpa) + K.a(this.timestampUnixMillis, Long.hashCode(this.timestampNanos) * 31, 31);
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isNaN, reason: from getter */
        public boolean getIsNaN() {
            return this.isNaN;
        }

        public final boolean isSameValues(@NotNull PressureReading other) {
            Intrinsics.h(other, "other");
            return this.pressureKpa == other.pressureKpa;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isZeroes, reason: from getter */
        public boolean getIsZeroes() {
            return this.isZeroes;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("PressureReading(timestampNanos=");
            sb.append(this.timestampNanos);
            sb.append(", timestampUnixMillis=");
            sb.append(this.timestampUnixMillis);
            sb.append(", pressureKpa=");
            return E.a(sb, this.pressureKpa, ')');
        }

        public PressureReading(long j, long j2, double d) {
            super(SystemSensor.PRESSURE, null);
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.pressureKpa = d;
            this.isZeroes = d == 0.0d;
            this.isNaN = Double.isNaN(d);
            this.hasNaN = Double.isNaN(d);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PressureReading(@NotNull C1487a eventWrapper, @NotNull TimeProvider timeProvider) {
            Intrinsics.h(eventWrapper, "eventWrapper");
            Intrinsics.h(timeProvider, "timeProvider");
            long j = eventWrapper.b;
            Companion companion = SensorReading.Companion;
            long j2 = eventWrapper.b;
            companion.getClass();
            this(j, Companion.a(timeProvider, j2), eventWrapper.c[0] / 10);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\t\u0010\u000fBe\b\u0011\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\t\u0010\u001aJ(\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÁ\u0001¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020 2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0000¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b1\u00100J\u0010\u00102\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b2\u00100JB\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010;\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010-R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b?\u0010-R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u00100R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bB\u00100R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bC\u00100R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\b\u0015\u0010ER\u001a\u0010\u0016\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010D\u001a\u0004\b\u0016\u0010ER\u001a\u0010\u0017\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\bF\u0010E¨\u0006I"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$AccelerometerReading;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading;", "", "timestampNanos", "timestampUnixMillis", "", "x", "y", "z", "<init>", "(JJDDD)V", "Lme/oriient/internal/services/sensorsManager/a;", "eventWrapper", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "(Lme/oriient/internal/services/sensorsManager/a;Lme/oriient/internal/infra/utils/core/time/TimeProvider;)V", "", "seen1", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "type", "", "isZeroes", "isNaN", "hasNaN", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILme/oriient/internal/services/sensorsManager/sensors/SystemSensor;JJDDDZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$internal_publishRelease", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$AccelerometerReading;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/nio/ByteBuffer;", "appendTo", "firstTimestampNanos", "appendRsmp", "(Ljava/nio/ByteBuffer;J)V", "other", "isSameValues", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$AccelerometerReading;)Z", "component1", "()J", "component2", "component3", "()D", "component4", "component5", "copy", "(JJDDD)Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$AccelerometerReading;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestampNanos", "getTimestampUnixMillis", "D", "getX", "getY", "getZ", "Z", "()Z", "getHasNaN", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class AccelerometerReading extends SensorReading {
        private final boolean hasNaN;
        private final boolean isNaN;
        private final boolean isZeroes;
        private final long timestampNanos;
        private final long timestampUnixMillis;
        private final double x;
        private final double y;
        private final double z;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @JvmField
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {EnumsKt.b(SystemSensor.values(), "me.oriient.internal.services.sensorsManager.sensors.SystemSensor"), null, null, null, null, null, null, null, null};

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$AccelerometerReading$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$AccelerometerReading;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<AccelerometerReading> serializer() {
                return SensorReading$AccelerometerReading$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ AccelerometerReading(int i, SystemSensor systemSensor, long j, long j2, double d, double d2, double d3, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, systemSensor, serializationConstructorMarker);
            if (63 != (i & 63)) {
                PluginExceptionsKt.a(i, 63, SensorReading$AccelerometerReading$$serializer.INSTANCE.getB());
                throw null;
            }
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.x = d;
            this.y = d2;
            this.z = d3;
            this.isZeroes = (i & 64) == 0 ? d == 0.0d && d2 == 0.0d && d3 == 0.0d : z;
            this.isNaN = (i & 128) == 0 ? Double.isNaN(d) && Double.isNaN(d2) && Double.isNaN(d3) : z2;
            if ((i & 256) == 0) {
                this.hasNaN = Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3);
            } else {
                this.hasNaN = z3;
            }
        }

        public static /* synthetic */ AccelerometerReading copy$default(AccelerometerReading accelerometerReading, long j, long j2, double d, double d2, double d3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = accelerometerReading.timestampNanos;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = accelerometerReading.timestampUnixMillis;
            }
            return accelerometerReading.copy(j3, j2, (i & 4) != 0 ? accelerometerReading.x : d, (i & 8) != 0 ? accelerometerReading.y : d2, (i & 16) != 0 ? accelerometerReading.z : d3);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading.AccelerometerReading r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
            /*
                me.oriient.internal.services.sensorsManager.sensors.SensorReading.write$Self(r8, r9, r10)
                long r0 = r8.getTimestampNanos()
                r2 = 1
                r9.t(r10, r2, r0)
                long r0 = r8.getTimestampUnixMillis()
                r3 = 2
                r9.t(r10, r3, r0)
                double r0 = r8.x
                r3 = 3
                r9.G(r10, r3, r0)
                double r0 = r8.y
                r3 = 4
                r9.G(r10, r3, r0)
                double r0 = r8.z
                r3 = 5
                r9.G(r10, r3, r0)
                r0 = 6
                boolean r1 = r9.q(r10, r0)
                r3 = 0
                if (r1 == 0) goto L2e
                goto L4b
            L2e:
                boolean r1 = r8.getIsZeroes()
                double r4 = r8.x
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L48
                double r4 = r8.y
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L48
                double r4 = r8.z
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L48
                r4 = r2
                goto L49
            L48:
                r4 = r3
            L49:
                if (r1 == r4) goto L52
            L4b:
                boolean r1 = r8.getIsZeroes()
                r9.o(r10, r0, r1)
            L52:
                r0 = 7
                boolean r1 = r9.q(r10, r0)
                if (r1 == 0) goto L5a
                goto L7b
            L5a:
                boolean r1 = r8.getIsNaN()
                double r4 = r8.x
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L78
                double r4 = r8.y
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L78
                double r4 = r8.z
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L78
                r4 = r2
                goto L79
            L78:
                r4 = r3
            L79:
                if (r1 == r4) goto L82
            L7b:
                boolean r1 = r8.getIsNaN()
                r9.o(r10, r0, r1)
            L82:
                r0 = 8
                boolean r1 = r9.q(r10, r0)
                if (r1 == 0) goto L8b
                goto Lab
            L8b:
                boolean r1 = r8.getHasNaN()
                double r4 = r8.x
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 != 0) goto La9
                double r4 = r8.y
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 != 0) goto La9
                double r4 = r8.z
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto La8
                goto La9
            La8:
                r2 = r3
            La9:
                if (r1 == r2) goto Lb2
            Lab:
                boolean r8 = r8.getHasNaN()
                r9.o(r10, r0, r8)
            Lb2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.sensorsManager.sensors.SensorReading.AccelerometerReading.write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading$AccelerometerReading, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public void appendRsmp(@NotNull ByteBuffer appendTo, long firstTimestampNanos) {
            Intrinsics.h(appendTo, "appendTo");
            super.appendRsmp(appendTo, firstTimestampNanos);
            appendTo.putFloat((float) this.x);
            appendTo.putFloat((float) this.y);
            appendTo.putFloat((float) this.z);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestampNanos() {
            return this.timestampNanos;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        /* renamed from: component3, reason: from getter */
        public final double getX() {
            return this.x;
        }

        /* renamed from: component4, reason: from getter */
        public final double getY() {
            return this.y;
        }

        /* renamed from: component5, reason: from getter */
        public final double getZ() {
            return this.z;
        }

        @NotNull
        public final AccelerometerReading copy(long timestampNanos, long timestampUnixMillis, double x, double y, double z) {
            return new AccelerometerReading(timestampNanos, timestampUnixMillis, x, y, z);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccelerometerReading)) {
                return false;
            }
            AccelerometerReading accelerometerReading = (AccelerometerReading) other;
            return this.timestampNanos == accelerometerReading.timestampNanos && this.timestampUnixMillis == accelerometerReading.timestampUnixMillis && Double.compare(this.x, accelerometerReading.x) == 0 && Double.compare(this.y, accelerometerReading.y) == 0 && Double.compare(this.z, accelerometerReading.z) == 0;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public boolean getHasNaN() {
            return this.hasNaN;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampNanos() {
            return this.timestampNanos;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        public final double getX() {
            return this.x;
        }

        public final double getY() {
            return this.y;
        }

        public final double getZ() {
            return this.z;
        }

        public int hashCode() {
            return Double.hashCode(this.z) + J.a(this.y, J.a(this.x, K.a(this.timestampUnixMillis, Long.hashCode(this.timestampNanos) * 31, 31), 31), 31);
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isNaN, reason: from getter */
        public boolean getIsNaN() {
            return this.isNaN;
        }

        public final boolean isSameValues(@NotNull AccelerometerReading other) {
            Intrinsics.h(other, "other");
            return this.x == other.x && this.y == other.y && this.z == other.z;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isZeroes, reason: from getter */
        public boolean getIsZeroes() {
            return this.isZeroes;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("AccelerometerReading(timestampNanos=");
            sb.append(this.timestampNanos);
            sb.append(", timestampUnixMillis=");
            sb.append(this.timestampUnixMillis);
            sb.append(", x=");
            sb.append(this.x);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(", z=");
            return E.a(sb, this.z, ')');
        }

        public AccelerometerReading(long j, long j2, double d, double d2, double d3) {
            super(SystemSensor.ACCELEROMETER, null);
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.x = d;
            this.y = d2;
            this.z = d3;
            this.isZeroes = d == 0.0d && d2 == 0.0d && d3 == 0.0d;
            this.isNaN = Double.isNaN(d) && Double.isNaN(d2) && Double.isNaN(d3);
            this.hasNaN = Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public AccelerometerReading(@NotNull C1487a eventWrapper, @NotNull TimeProvider timeProvider) {
            Intrinsics.h(eventWrapper, "eventWrapper");
            Intrinsics.h(timeProvider, "timeProvider");
            long j = eventWrapper.b;
            Companion companion = SensorReading.Companion;
            long j2 = eventWrapper.b;
            companion.getClass();
            long jA = Companion.a(timeProvider, j2);
            float[] fArr = eventWrapper.c;
            double d = -9.80665f;
            this(j, jA, fArr[0] / d, fArr[1] / d, fArr[2] / d);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u000b\u0010\u0011Bo\b\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u000b\u0010\u001cJ(\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 HÁ\u0001¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020\"2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u0000¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0010\u00101\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b3\u00102J\u0010\u00104\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b4\u00102J\u0010\u00105\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b5\u00106JL\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u000209HÖ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020\u00162\b\u0010+\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\b?\u0010@R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010/R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bC\u0010/R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bE\u00102R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bF\u00102R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bG\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bI\u00106R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\b\u0017\u0010KR\u001a\u0010\u0018\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\b\u0018\u0010KR\u001a\u0010\u0019\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010J\u001a\u0004\bL\u0010K¨\u0006O"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeReading;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading;", "", "timestampNanos", "timestampUnixMillis", "", "x", "y", "z", "Lme/oriient/internal/infra/utils/android/appState/AppState;", "appState", "<init>", "(JJDDDLme/oriient/internal/infra/utils/android/appState/AppState;)V", "Lme/oriient/internal/services/sensorsManager/a;", "eventWrapper", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "(Lme/oriient/internal/services/sensorsManager/a;Lme/oriient/internal/infra/utils/core/time/TimeProvider;)V", "", "seen1", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "type", "", "isZeroes", "isNaN", "hasNaN", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILme/oriient/internal/services/sensorsManager/sensors/SystemSensor;JJDDDLme/oriient/internal/infra/utils/android/appState/AppState;ZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$internal_publishRelease", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeReading;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/nio/ByteBuffer;", "appendTo", "firstTimestampNanos", "appendRsmp", "(Ljava/nio/ByteBuffer;J)V", "other", "isSameValues", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeReading;)Z", "component1", "()J", "component2", "component3", "()D", "component4", "component5", "component6", "()Lme/oriient/internal/infra/utils/android/appState/AppState;", "copy", "(JJDDDLme/oriient/internal/infra/utils/android/appState/AppState;)Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeReading;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestampNanos", "getTimestampUnixMillis", "D", "getX", "getY", "getZ", "Lme/oriient/internal/infra/utils/android/appState/AppState;", "getAppState", "Z", "()Z", "getHasNaN", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class GyroscopeReading extends SensorReading {

        @NotNull
        private final AppState appState;
        private final boolean hasNaN;
        private final boolean isNaN;
        private final boolean isZeroes;
        private final long timestampNanos;
        private final long timestampUnixMillis;
        private final double x;
        private final double y;
        private final double z;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @JvmField
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {EnumsKt.b(SystemSensor.values(), "me.oriient.internal.services.sensorsManager.sensors.SystemSensor"), null, null, null, null, null, EnumsKt.b(AppState.values(), "me.oriient.internal.infra.utils.android.appState.AppState"), null, null, null};

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeReading$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeReading;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<GyroscopeReading> serializer() {
                return SensorReading$GyroscopeReading$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ GyroscopeReading(int i, SystemSensor systemSensor, long j, long j2, double d, double d2, double d3, AppState appState, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, systemSensor, serializationConstructorMarker);
            if (127 != (i & 127)) {
                PluginExceptionsKt.a(i, 127, SensorReading$GyroscopeReading$$serializer.INSTANCE.getB());
                throw null;
            }
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.x = d;
            this.y = d2;
            this.z = d3;
            this.appState = appState;
            this.isZeroes = (i & 128) == 0 ? d == 0.0d && d2 == 0.0d && d3 == 0.0d : z;
            this.isNaN = (i & 256) == 0 ? Double.isNaN(d) && Double.isNaN(d2) && Double.isNaN(d3) : z2;
            if ((i & 512) == 0) {
                this.hasNaN = Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3);
            } else {
                this.hasNaN = z3;
            }
        }

        public static /* synthetic */ GyroscopeReading copy$default(GyroscopeReading gyroscopeReading, long j, long j2, double d, double d2, double d3, AppState appState, int i, Object obj) {
            if ((i & 1) != 0) {
                j = gyroscopeReading.timestampNanos;
            }
            return gyroscopeReading.copy(j, (i & 2) != 0 ? gyroscopeReading.timestampUnixMillis : j2, (i & 4) != 0 ? gyroscopeReading.x : d, (i & 8) != 0 ? gyroscopeReading.y : d2, (i & 16) != 0 ? gyroscopeReading.z : d3, (i & 32) != 0 ? gyroscopeReading.appState : appState);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading.GyroscopeReading r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
            /*
                me.oriient.internal.services.sensorsManager.sensors.SensorReading.write$Self(r8, r9, r10)
                kotlinx.serialization.KSerializer<java.lang.Object>[] r0 = me.oriient.internal.services.sensorsManager.sensors.SensorReading.GyroscopeReading.$childSerializers
                long r1 = r8.getTimestampNanos()
                r3 = 1
                r9.t(r10, r3, r1)
                long r1 = r8.getTimestampUnixMillis()
                r4 = 2
                r9.t(r10, r4, r1)
                double r1 = r8.x
                r4 = 3
                r9.G(r10, r4, r1)
                double r1 = r8.y
                r4 = 4
                r9.G(r10, r4, r1)
                double r1 = r8.z
                r4 = 5
                r9.G(r10, r4, r1)
                r1 = 6
                r0 = r0[r1]
                me.oriient.internal.infra.utils.android.appState.AppState r2 = r8.appState
                r9.F(r10, r1, r0, r2)
                r0 = 7
                boolean r1 = r9.q(r10, r0)
                r2 = 0
                if (r1 == 0) goto L38
                goto L55
            L38:
                boolean r1 = r8.getIsZeroes()
                double r4 = r8.x
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L52
                double r4 = r8.y
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L52
                double r4 = r8.z
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L52
                r4 = r3
                goto L53
            L52:
                r4 = r2
            L53:
                if (r1 == r4) goto L5c
            L55:
                boolean r1 = r8.getIsZeroes()
                r9.o(r10, r0, r1)
            L5c:
                r0 = 8
                boolean r1 = r9.q(r10, r0)
                if (r1 == 0) goto L65
                goto L86
            L65:
                boolean r1 = r8.getIsNaN()
                double r4 = r8.x
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L83
                double r4 = r8.y
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L83
                double r4 = r8.z
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L83
                r4 = r3
                goto L84
            L83:
                r4 = r2
            L84:
                if (r1 == r4) goto L8d
            L86:
                boolean r1 = r8.getIsNaN()
                r9.o(r10, r0, r1)
            L8d:
                r0 = 9
                boolean r1 = r9.q(r10, r0)
                if (r1 == 0) goto L96
                goto Lb6
            L96:
                boolean r1 = r8.getHasNaN()
                double r4 = r8.x
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 != 0) goto Lb4
                double r4 = r8.y
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 != 0) goto Lb4
                double r4 = r8.z
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto Lb3
                goto Lb4
            Lb3:
                r3 = r2
            Lb4:
                if (r1 == r3) goto Lbd
            Lb6:
                boolean r8 = r8.getHasNaN()
                r9.o(r10, r0, r8)
            Lbd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.sensorsManager.sensors.SensorReading.GyroscopeReading.write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading$GyroscopeReading, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public void appendRsmp(@NotNull ByteBuffer appendTo, long firstTimestampNanos) {
            Intrinsics.h(appendTo, "appendTo");
            super.appendRsmp(appendTo, firstTimestampNanos);
            appendTo.putFloat((float) this.x);
            appendTo.putFloat((float) this.y);
            appendTo.putFloat((float) this.z);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestampNanos() {
            return this.timestampNanos;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        /* renamed from: component3, reason: from getter */
        public final double getX() {
            return this.x;
        }

        /* renamed from: component4, reason: from getter */
        public final double getY() {
            return this.y;
        }

        /* renamed from: component5, reason: from getter */
        public final double getZ() {
            return this.z;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final AppState getAppState() {
            return this.appState;
        }

        @NotNull
        public final GyroscopeReading copy(long timestampNanos, long timestampUnixMillis, double x, double y, double z, @NotNull AppState appState) {
            Intrinsics.h(appState, "appState");
            return new GyroscopeReading(timestampNanos, timestampUnixMillis, x, y, z, appState);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GyroscopeReading)) {
                return false;
            }
            GyroscopeReading gyroscopeReading = (GyroscopeReading) other;
            return this.timestampNanos == gyroscopeReading.timestampNanos && this.timestampUnixMillis == gyroscopeReading.timestampUnixMillis && Double.compare(this.x, gyroscopeReading.x) == 0 && Double.compare(this.y, gyroscopeReading.y) == 0 && Double.compare(this.z, gyroscopeReading.z) == 0 && this.appState == gyroscopeReading.appState;
        }

        @NotNull
        public final AppState getAppState() {
            return this.appState;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public boolean getHasNaN() {
            return this.hasNaN;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampNanos() {
            return this.timestampNanos;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        public final double getX() {
            return this.x;
        }

        public final double getY() {
            return this.y;
        }

        public final double getZ() {
            return this.z;
        }

        public int hashCode() {
            return this.appState.hashCode() + J.a(this.z, J.a(this.y, J.a(this.x, K.a(this.timestampUnixMillis, Long.hashCode(this.timestampNanos) * 31, 31), 31), 31), 31);
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isNaN, reason: from getter */
        public boolean getIsNaN() {
            return this.isNaN;
        }

        public final boolean isSameValues(@NotNull GyroscopeReading other) {
            Intrinsics.h(other, "other");
            return this.x == other.x && this.y == other.y && this.z == other.z;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isZeroes, reason: from getter */
        public boolean getIsZeroes() {
            return this.isZeroes;
        }

        @NotNull
        public String toString() {
            return "GyroscopeReading(timestampNanos=" + this.timestampNanos + ", timestampUnixMillis=" + this.timestampUnixMillis + ", x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", appState=" + this.appState + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GyroscopeReading(long j, long j2, double d, double d2, double d3, @NotNull AppState appState) {
            super(SystemSensor.GYROSCOPE, null);
            Intrinsics.h(appState, "appState");
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.x = d;
            this.y = d2;
            this.z = d3;
            this.appState = appState;
            this.isZeroes = d == 0.0d && d2 == 0.0d && d3 == 0.0d;
            this.isNaN = Double.isNaN(d) && Double.isNaN(d2) && Double.isNaN(d3);
            this.hasNaN = Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public GyroscopeReading(@NotNull C1487a eventWrapper, @NotNull TimeProvider timeProvider) {
            Intrinsics.h(eventWrapper, "eventWrapper");
            Intrinsics.h(timeProvider, "timeProvider");
            long j = eventWrapper.b;
            Companion companion = SensorReading.Companion;
            long j2 = eventWrapper.b;
            companion.getClass();
            long jA = Companion.a(timeProvider, j2);
            float[] fArr = eventWrapper.c;
            this(j, jA, fArr[0], fArr[1], fArr[2], eventWrapper.d);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\t\u0010\u000fBe\b\u0011\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\t\u0010\u001aJ(\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÁ\u0001¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020 2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0000¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b1\u00100J\u0010\u00102\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b2\u00100JB\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010;\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010-R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b?\u0010-R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u00100R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bB\u00100R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bC\u00100R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\b\u0015\u0010ER\u001a\u0010\u0016\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010D\u001a\u0004\b\u0016\u0010ER\u001a\u0010\u0017\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\bF\u0010E¨\u0006I"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldReading;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading;", "", "timestampNanos", "timestampUnixMillis", "", "xUt", "yUt", "zUt", "<init>", "(JJDDD)V", "Lme/oriient/internal/services/sensorsManager/a;", "eventWrapper", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "(Lme/oriient/internal/services/sensorsManager/a;Lme/oriient/internal/infra/utils/core/time/TimeProvider;)V", "", "seen1", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "type", "", "isZeroes", "isNaN", "hasNaN", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILme/oriient/internal/services/sensorsManager/sensors/SystemSensor;JJDDDZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$internal_publishRelease", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldReading;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/nio/ByteBuffer;", "appendTo", "firstTimestampNanos", "appendRsmp", "(Ljava/nio/ByteBuffer;J)V", "other", "isSameValues", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldReading;)Z", "component1", "()J", "component2", "component3", "()D", "component4", "component5", "copy", "(JJDDD)Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldReading;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestampNanos", "getTimestampUnixMillis", "D", "getXUt", "getYUt", "getZUt", "Z", "()Z", "getHasNaN", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MagneticFieldReading extends SensorReading {
        private final boolean hasNaN;
        private final boolean isNaN;
        private final boolean isZeroes;
        private final long timestampNanos;
        private final long timestampUnixMillis;
        private final double xUt;
        private final double yUt;
        private final double zUt;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @JvmField
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {EnumsKt.b(SystemSensor.values(), "me.oriient.internal.services.sensorsManager.sensors.SystemSensor"), null, null, null, null, null, null, null, null};

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldReading$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldReading;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<MagneticFieldReading> serializer() {
                return SensorReading$MagneticFieldReading$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ MagneticFieldReading(int i, SystemSensor systemSensor, long j, long j2, double d, double d2, double d3, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, systemSensor, serializationConstructorMarker);
            if (63 != (i & 63)) {
                PluginExceptionsKt.a(i, 63, SensorReading$MagneticFieldReading$$serializer.INSTANCE.getB());
                throw null;
            }
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.xUt = d;
            this.yUt = d2;
            this.zUt = d3;
            this.isZeroes = (i & 64) == 0 ? d == 0.0d && d2 == 0.0d && d3 == 0.0d : z;
            this.isNaN = (i & 128) == 0 ? Double.isNaN(d) && Double.isNaN(d2) && Double.isNaN(d3) : z2;
            if ((i & 256) == 0) {
                this.hasNaN = Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3);
            } else {
                this.hasNaN = z3;
            }
        }

        public static /* synthetic */ MagneticFieldReading copy$default(MagneticFieldReading magneticFieldReading, long j, long j2, double d, double d2, double d3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = magneticFieldReading.timestampNanos;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = magneticFieldReading.timestampUnixMillis;
            }
            return magneticFieldReading.copy(j3, j2, (i & 4) != 0 ? magneticFieldReading.xUt : d, (i & 8) != 0 ? magneticFieldReading.yUt : d2, (i & 16) != 0 ? magneticFieldReading.zUt : d3);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading.MagneticFieldReading r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
            /*
                me.oriient.internal.services.sensorsManager.sensors.SensorReading.write$Self(r8, r9, r10)
                long r0 = r8.getTimestampNanos()
                r2 = 1
                r9.t(r10, r2, r0)
                long r0 = r8.getTimestampUnixMillis()
                r3 = 2
                r9.t(r10, r3, r0)
                double r0 = r8.xUt
                r3 = 3
                r9.G(r10, r3, r0)
                double r0 = r8.yUt
                r3 = 4
                r9.G(r10, r3, r0)
                double r0 = r8.zUt
                r3 = 5
                r9.G(r10, r3, r0)
                r0 = 6
                boolean r1 = r9.q(r10, r0)
                r3 = 0
                if (r1 == 0) goto L2e
                goto L4b
            L2e:
                boolean r1 = r8.getIsZeroes()
                double r4 = r8.xUt
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L48
                double r4 = r8.yUt
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L48
                double r4 = r8.zUt
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L48
                r4 = r2
                goto L49
            L48:
                r4 = r3
            L49:
                if (r1 == r4) goto L52
            L4b:
                boolean r1 = r8.getIsZeroes()
                r9.o(r10, r0, r1)
            L52:
                r0 = 7
                boolean r1 = r9.q(r10, r0)
                if (r1 == 0) goto L5a
                goto L7b
            L5a:
                boolean r1 = r8.getIsNaN()
                double r4 = r8.xUt
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L78
                double r4 = r8.yUt
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L78
                double r4 = r8.zUt
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L78
                r4 = r2
                goto L79
            L78:
                r4 = r3
            L79:
                if (r1 == r4) goto L82
            L7b:
                boolean r1 = r8.getIsNaN()
                r9.o(r10, r0, r1)
            L82:
                r0 = 8
                boolean r1 = r9.q(r10, r0)
                if (r1 == 0) goto L8b
                goto Lab
            L8b:
                boolean r1 = r8.getHasNaN()
                double r4 = r8.xUt
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 != 0) goto La9
                double r4 = r8.yUt
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 != 0) goto La9
                double r4 = r8.zUt
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto La8
                goto La9
            La8:
                r2 = r3
            La9:
                if (r1 == r2) goto Lb2
            Lab:
                boolean r8 = r8.getHasNaN()
                r9.o(r10, r0, r8)
            Lb2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.sensorsManager.sensors.SensorReading.MagneticFieldReading.write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading$MagneticFieldReading, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public void appendRsmp(@NotNull ByteBuffer appendTo, long firstTimestampNanos) {
            Intrinsics.h(appendTo, "appendTo");
            super.appendRsmp(appendTo, firstTimestampNanos);
            appendTo.putFloat((float) this.xUt);
            appendTo.putFloat((float) this.yUt);
            appendTo.putFloat((float) this.zUt);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestampNanos() {
            return this.timestampNanos;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        /* renamed from: component3, reason: from getter */
        public final double getXUt() {
            return this.xUt;
        }

        /* renamed from: component4, reason: from getter */
        public final double getYUt() {
            return this.yUt;
        }

        /* renamed from: component5, reason: from getter */
        public final double getZUt() {
            return this.zUt;
        }

        @NotNull
        public final MagneticFieldReading copy(long timestampNanos, long timestampUnixMillis, double xUt, double yUt, double zUt) {
            return new MagneticFieldReading(timestampNanos, timestampUnixMillis, xUt, yUt, zUt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MagneticFieldReading)) {
                return false;
            }
            MagneticFieldReading magneticFieldReading = (MagneticFieldReading) other;
            return this.timestampNanos == magneticFieldReading.timestampNanos && this.timestampUnixMillis == magneticFieldReading.timestampUnixMillis && Double.compare(this.xUt, magneticFieldReading.xUt) == 0 && Double.compare(this.yUt, magneticFieldReading.yUt) == 0 && Double.compare(this.zUt, magneticFieldReading.zUt) == 0;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public boolean getHasNaN() {
            return this.hasNaN;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampNanos() {
            return this.timestampNanos;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        public final double getXUt() {
            return this.xUt;
        }

        public final double getYUt() {
            return this.yUt;
        }

        public final double getZUt() {
            return this.zUt;
        }

        public int hashCode() {
            return Double.hashCode(this.zUt) + J.a(this.yUt, J.a(this.xUt, K.a(this.timestampUnixMillis, Long.hashCode(this.timestampNanos) * 31, 31), 31), 31);
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isNaN, reason: from getter */
        public boolean getIsNaN() {
            return this.isNaN;
        }

        public final boolean isSameValues(@NotNull MagneticFieldReading other) {
            Intrinsics.h(other, "other");
            return this.xUt == other.xUt && this.yUt == other.yUt && this.zUt == other.zUt;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isZeroes, reason: from getter */
        public boolean getIsZeroes() {
            return this.isZeroes;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("MagneticFieldReading(timestampNanos=");
            sb.append(this.timestampNanos);
            sb.append(", timestampUnixMillis=");
            sb.append(this.timestampUnixMillis);
            sb.append(", xUt=");
            sb.append(this.xUt);
            sb.append(", yUt=");
            sb.append(this.yUt);
            sb.append(", zUt=");
            return E.a(sb, this.zUt, ')');
        }

        public MagneticFieldReading(long j, long j2, double d, double d2, double d3) {
            super(SystemSensor.MAGNETIC_FIELD, null);
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.xUt = d;
            this.yUt = d2;
            this.zUt = d3;
            this.isZeroes = d == 0.0d && d2 == 0.0d && d3 == 0.0d;
            this.isNaN = Double.isNaN(d) && Double.isNaN(d2) && Double.isNaN(d3);
            this.hasNaN = Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public MagneticFieldReading(@NotNull C1487a eventWrapper, @NotNull TimeProvider timeProvider) {
            Intrinsics.h(eventWrapper, "eventWrapper");
            Intrinsics.h(timeProvider, "timeProvider");
            long j = eventWrapper.b;
            Companion companion = SensorReading.Companion;
            long j2 = eventWrapper.b;
            companion.getClass();
            long jA = Companion.a(timeProvider, j2);
            float[] fArr = eventWrapper.c;
            this(j, jA, fArr[0], fArr[1], fArr[2]);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\t\u0010\u000fBe\b\u0011\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\t\u0010\u001aJ(\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÁ\u0001¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020 2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0000¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b1\u00100J\u0010\u00102\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b2\u00100JB\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010;\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010-R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b?\u0010-R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u00100R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bB\u00100R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bC\u00100R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\b\u0015\u0010ER\u001a\u0010\u0016\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010D\u001a\u0004\b\u0016\u0010ER\u001a\u0010\u0017\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\bF\u0010E¨\u0006I"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldUncalibratedReading;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading;", "", "timestampNanos", "timestampUnixMillis", "", "x", "y", "z", "<init>", "(JJDDD)V", "Lme/oriient/internal/services/sensorsManager/a;", "eventWrapper", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "(Lme/oriient/internal/services/sensorsManager/a;Lme/oriient/internal/infra/utils/core/time/TimeProvider;)V", "", "seen1", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "type", "", "isZeroes", "isNaN", "hasNaN", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILme/oriient/internal/services/sensorsManager/sensors/SystemSensor;JJDDDZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$internal_publishRelease", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldUncalibratedReading;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/nio/ByteBuffer;", "appendTo", "firstTimestampNanos", "appendRsmp", "(Ljava/nio/ByteBuffer;J)V", "other", "isSameValues", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldUncalibratedReading;)Z", "component1", "()J", "component2", "component3", "()D", "component4", "component5", "copy", "(JJDDD)Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldUncalibratedReading;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestampNanos", "getTimestampUnixMillis", "D", "getX", "getY", "getZ", "Z", "()Z", "getHasNaN", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MagneticFieldUncalibratedReading extends SensorReading {
        private final boolean hasNaN;
        private final boolean isNaN;
        private final boolean isZeroes;
        private final long timestampNanos;
        private final long timestampUnixMillis;
        private final double x;
        private final double y;
        private final double z;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @JvmField
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {EnumsKt.b(SystemSensor.values(), "me.oriient.internal.services.sensorsManager.sensors.SystemSensor"), null, null, null, null, null, null, null, null};

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldUncalibratedReading$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldUncalibratedReading;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<MagneticFieldUncalibratedReading> serializer() {
                return SensorReading$MagneticFieldUncalibratedReading$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ MagneticFieldUncalibratedReading(int i, SystemSensor systemSensor, long j, long j2, double d, double d2, double d3, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, systemSensor, serializationConstructorMarker);
            if (63 != (i & 63)) {
                PluginExceptionsKt.a(i, 63, SensorReading$MagneticFieldUncalibratedReading$$serializer.INSTANCE.getB());
                throw null;
            }
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.x = d;
            this.y = d2;
            this.z = d3;
            this.isZeroes = (i & 64) == 0 ? d == 0.0d && d2 == 0.0d && d3 == 0.0d : z;
            this.isNaN = (i & 128) == 0 ? Double.isNaN(d) && Double.isNaN(d2) && Double.isNaN(d3) : z2;
            if ((i & 256) == 0) {
                this.hasNaN = Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3);
            } else {
                this.hasNaN = z3;
            }
        }

        public static /* synthetic */ MagneticFieldUncalibratedReading copy$default(MagneticFieldUncalibratedReading magneticFieldUncalibratedReading, long j, long j2, double d, double d2, double d3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = magneticFieldUncalibratedReading.timestampNanos;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = magneticFieldUncalibratedReading.timestampUnixMillis;
            }
            return magneticFieldUncalibratedReading.copy(j3, j2, (i & 4) != 0 ? magneticFieldUncalibratedReading.x : d, (i & 8) != 0 ? magneticFieldUncalibratedReading.y : d2, (i & 16) != 0 ? magneticFieldUncalibratedReading.z : d3);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading.MagneticFieldUncalibratedReading r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
            /*
                me.oriient.internal.services.sensorsManager.sensors.SensorReading.write$Self(r8, r9, r10)
                long r0 = r8.getTimestampNanos()
                r2 = 1
                r9.t(r10, r2, r0)
                long r0 = r8.getTimestampUnixMillis()
                r3 = 2
                r9.t(r10, r3, r0)
                double r0 = r8.x
                r3 = 3
                r9.G(r10, r3, r0)
                double r0 = r8.y
                r3 = 4
                r9.G(r10, r3, r0)
                double r0 = r8.z
                r3 = 5
                r9.G(r10, r3, r0)
                r0 = 6
                boolean r1 = r9.q(r10, r0)
                r3 = 0
                if (r1 == 0) goto L2e
                goto L4b
            L2e:
                boolean r1 = r8.getIsZeroes()
                double r4 = r8.x
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L48
                double r4 = r8.y
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L48
                double r4 = r8.z
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L48
                r4 = r2
                goto L49
            L48:
                r4 = r3
            L49:
                if (r1 == r4) goto L52
            L4b:
                boolean r1 = r8.getIsZeroes()
                r9.o(r10, r0, r1)
            L52:
                r0 = 7
                boolean r1 = r9.q(r10, r0)
                if (r1 == 0) goto L5a
                goto L7b
            L5a:
                boolean r1 = r8.getIsNaN()
                double r4 = r8.x
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L78
                double r4 = r8.y
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L78
                double r4 = r8.z
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L78
                r4 = r2
                goto L79
            L78:
                r4 = r3
            L79:
                if (r1 == r4) goto L82
            L7b:
                boolean r1 = r8.getIsNaN()
                r9.o(r10, r0, r1)
            L82:
                r0 = 8
                boolean r1 = r9.q(r10, r0)
                if (r1 == 0) goto L8b
                goto Lab
            L8b:
                boolean r1 = r8.getHasNaN()
                double r4 = r8.x
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 != 0) goto La9
                double r4 = r8.y
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 != 0) goto La9
                double r4 = r8.z
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto La8
                goto La9
            La8:
                r2 = r3
            La9:
                if (r1 == r2) goto Lb2
            Lab:
                boolean r8 = r8.getHasNaN()
                r9.o(r10, r0, r8)
            Lb2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.sensorsManager.sensors.SensorReading.MagneticFieldUncalibratedReading.write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading$MagneticFieldUncalibratedReading, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public void appendRsmp(@NotNull ByteBuffer appendTo, long firstTimestampNanos) {
            Intrinsics.h(appendTo, "appendTo");
            super.appendRsmp(appendTo, firstTimestampNanos);
            appendTo.putFloat((float) this.x);
            appendTo.putFloat((float) this.y);
            appendTo.putFloat((float) this.z);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestampNanos() {
            return this.timestampNanos;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        /* renamed from: component3, reason: from getter */
        public final double getX() {
            return this.x;
        }

        /* renamed from: component4, reason: from getter */
        public final double getY() {
            return this.y;
        }

        /* renamed from: component5, reason: from getter */
        public final double getZ() {
            return this.z;
        }

        @NotNull
        public final MagneticFieldUncalibratedReading copy(long timestampNanos, long timestampUnixMillis, double x, double y, double z) {
            return new MagneticFieldUncalibratedReading(timestampNanos, timestampUnixMillis, x, y, z);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MagneticFieldUncalibratedReading)) {
                return false;
            }
            MagneticFieldUncalibratedReading magneticFieldUncalibratedReading = (MagneticFieldUncalibratedReading) other;
            return this.timestampNanos == magneticFieldUncalibratedReading.timestampNanos && this.timestampUnixMillis == magneticFieldUncalibratedReading.timestampUnixMillis && Double.compare(this.x, magneticFieldUncalibratedReading.x) == 0 && Double.compare(this.y, magneticFieldUncalibratedReading.y) == 0 && Double.compare(this.z, magneticFieldUncalibratedReading.z) == 0;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public boolean getHasNaN() {
            return this.hasNaN;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampNanos() {
            return this.timestampNanos;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        public final double getX() {
            return this.x;
        }

        public final double getY() {
            return this.y;
        }

        public final double getZ() {
            return this.z;
        }

        public int hashCode() {
            return Double.hashCode(this.z) + J.a(this.y, J.a(this.x, K.a(this.timestampUnixMillis, Long.hashCode(this.timestampNanos) * 31, 31), 31), 31);
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isNaN, reason: from getter */
        public boolean getIsNaN() {
            return this.isNaN;
        }

        public final boolean isSameValues(@NotNull MagneticFieldUncalibratedReading other) {
            Intrinsics.h(other, "other");
            return this.x == other.x && this.y == other.y && this.z == other.z;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isZeroes, reason: from getter */
        public boolean getIsZeroes() {
            return this.isZeroes;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("MagneticFieldUncalibratedReading(timestampNanos=");
            sb.append(this.timestampNanos);
            sb.append(", timestampUnixMillis=");
            sb.append(this.timestampUnixMillis);
            sb.append(", x=");
            sb.append(this.x);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(", z=");
            return E.a(sb, this.z, ')');
        }

        public MagneticFieldUncalibratedReading(long j, long j2, double d, double d2, double d3) {
            super(SystemSensor.MAGNETIC_FIELD_UNCALIBRATED, null);
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.x = d;
            this.y = d2;
            this.z = d3;
            this.isZeroes = d == 0.0d && d2 == 0.0d && d3 == 0.0d;
            this.isNaN = Double.isNaN(d) && Double.isNaN(d2) && Double.isNaN(d3);
            this.hasNaN = Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public MagneticFieldUncalibratedReading(@NotNull C1487a eventWrapper, @NotNull TimeProvider timeProvider) {
            Intrinsics.h(eventWrapper, "eventWrapper");
            Intrinsics.h(timeProvider, "timeProvider");
            long j = eventWrapper.b;
            Companion companion = SensorReading.Companion;
            long j2 = eventWrapper.b;
            companion.getClass();
            long jA = Companion.a(timeProvider, j2);
            float[] fArr = eventWrapper.c;
            this(j, jA, fArr[0], fArr[1], fArr[2]);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0010Bm\b\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\n\u0010\u001bJ(\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fHÁ\u0001¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020!2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u0000¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b2\u00101J\u0010\u00103\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b3\u00101J\u0010\u00104\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b4\u00101JL\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010.R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\bA\u0010.R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bC\u00101R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bD\u00101R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bE\u00101R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bF\u00101R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\b\u0016\u0010HR\u001a\u0010\u0017\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010G\u001a\u0004\b\u0017\u0010HR\u001a\u0010\u0018\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010G\u001a\u0004\bI\u0010H¨\u0006L"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GameRotationVectorReading;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading;", "", "timestampNanos", "timestampUnixMillis", "", "x", "y", "z", "w", "<init>", "(JJDDDD)V", "Lme/oriient/internal/services/sensorsManager/a;", "eventWrapper", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "(Lme/oriient/internal/services/sensorsManager/a;Lme/oriient/internal/infra/utils/core/time/TimeProvider;)V", "", "seen1", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "type", "", "isZeroes", "isNaN", "hasNaN", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILme/oriient/internal/services/sensorsManager/sensors/SystemSensor;JJDDDDZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$internal_publishRelease", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GameRotationVectorReading;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/nio/ByteBuffer;", "appendTo", "firstTimestampNanos", "appendRsmp", "(Ljava/nio/ByteBuffer;J)V", "other", "isSameValues", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GameRotationVectorReading;)Z", "component1", "()J", "component2", "component3", "()D", "component4", "component5", "component6", "copy", "(JJDDDD)Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GameRotationVectorReading;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestampNanos", "getTimestampUnixMillis", "D", "getX", "getY", "getZ", "getW", "Z", "()Z", "getHasNaN", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class GameRotationVectorReading extends SensorReading {
        private final boolean hasNaN;
        private final boolean isNaN;
        private final boolean isZeroes;
        private final long timestampNanos;
        private final long timestampUnixMillis;
        private final double w;
        private final double x;
        private final double y;
        private final double z;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @JvmField
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {EnumsKt.b(SystemSensor.values(), "me.oriient.internal.services.sensorsManager.sensors.SystemSensor"), null, null, null, null, null, null, null, null, null};

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GameRotationVectorReading$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GameRotationVectorReading;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<GameRotationVectorReading> serializer() {
                return SensorReading$GameRotationVectorReading$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ GameRotationVectorReading(int i, SystemSensor systemSensor, long j, long j2, double d, double d2, double d3, double d4, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, systemSensor, serializationConstructorMarker);
            if (127 != (i & 127)) {
                PluginExceptionsKt.a(i, 127, SensorReading$GameRotationVectorReading$$serializer.INSTANCE.getB());
                throw null;
            }
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.x = d;
            this.y = d2;
            this.z = d3;
            this.w = d4;
            this.isZeroes = (i & 128) == 0 ? d == 0.0d && d2 == 0.0d && d3 == 0.0d && d4 == 0.0d : z;
            this.isNaN = (i & 256) == 0 ? Double.isNaN(d) && Double.isNaN(d2) && Double.isNaN(d3) && Double.isNaN(d4) : z2;
            if ((i & 512) == 0) {
                this.hasNaN = Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4);
            } else {
                this.hasNaN = z3;
            }
        }

        public static /* synthetic */ GameRotationVectorReading copy$default(GameRotationVectorReading gameRotationVectorReading, long j, long j2, double d, double d2, double d3, double d4, int i, Object obj) {
            if ((i & 1) != 0) {
                j = gameRotationVectorReading.timestampNanos;
            }
            return gameRotationVectorReading.copy(j, (i & 2) != 0 ? gameRotationVectorReading.timestampUnixMillis : j2, (i & 4) != 0 ? gameRotationVectorReading.x : d, (i & 8) != 0 ? gameRotationVectorReading.y : d2, (i & 16) != 0 ? gameRotationVectorReading.z : d3, (i & 32) != 0 ? gameRotationVectorReading.w : d4);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading.GameRotationVectorReading r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
            /*
                me.oriient.internal.services.sensorsManager.sensors.SensorReading.write$Self(r8, r9, r10)
                long r0 = r8.getTimestampNanos()
                r2 = 1
                r9.t(r10, r2, r0)
                long r0 = r8.getTimestampUnixMillis()
                r3 = 2
                r9.t(r10, r3, r0)
                double r0 = r8.x
                r3 = 3
                r9.G(r10, r3, r0)
                double r0 = r8.y
                r3 = 4
                r9.G(r10, r3, r0)
                double r0 = r8.z
                r3 = 5
                r9.G(r10, r3, r0)
                double r0 = r8.w
                r3 = 6
                r9.G(r10, r3, r0)
                r0 = 7
                boolean r1 = r9.q(r10, r0)
                r3 = 0
                if (r1 == 0) goto L34
                goto L57
            L34:
                boolean r1 = r8.getIsZeroes()
                double r4 = r8.x
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L54
                double r4 = r8.y
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L54
                double r4 = r8.z
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L54
                double r4 = r8.w
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L54
                r4 = r2
                goto L55
            L54:
                r4 = r3
            L55:
                if (r1 == r4) goto L5e
            L57:
                boolean r1 = r8.getIsZeroes()
                r9.o(r10, r0, r1)
            L5e:
                r0 = 8
                boolean r1 = r9.q(r10, r0)
                if (r1 == 0) goto L67
                goto L90
            L67:
                boolean r1 = r8.getIsNaN()
                double r4 = r8.x
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L8d
                double r4 = r8.y
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L8d
                double r4 = r8.z
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L8d
                double r4 = r8.w
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L8d
                r4 = r2
                goto L8e
            L8d:
                r4 = r3
            L8e:
                if (r1 == r4) goto L97
            L90:
                boolean r1 = r8.getIsNaN()
                r9.o(r10, r0, r1)
            L97:
                r0 = 9
                boolean r1 = r9.q(r10, r0)
                if (r1 == 0) goto La0
                goto Lc8
            La0:
                boolean r1 = r8.getHasNaN()
                double r4 = r8.x
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 != 0) goto Lc6
                double r4 = r8.y
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 != 0) goto Lc6
                double r4 = r8.z
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 != 0) goto Lc6
                double r4 = r8.w
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto Lc5
                goto Lc6
            Lc5:
                r2 = r3
            Lc6:
                if (r1 == r2) goto Lcf
            Lc8:
                boolean r8 = r8.getHasNaN()
                r9.o(r10, r0, r8)
            Lcf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.sensorsManager.sensors.SensorReading.GameRotationVectorReading.write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading$GameRotationVectorReading, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public void appendRsmp(@NotNull ByteBuffer appendTo, long firstTimestampNanos) {
            Intrinsics.h(appendTo, "appendTo");
            super.appendRsmp(appendTo, firstTimestampNanos);
            appendTo.putFloat((float) this.w);
            appendTo.putFloat((float) this.x);
            appendTo.putFloat((float) this.y);
            appendTo.putFloat((float) this.z);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestampNanos() {
            return this.timestampNanos;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        /* renamed from: component3, reason: from getter */
        public final double getX() {
            return this.x;
        }

        /* renamed from: component4, reason: from getter */
        public final double getY() {
            return this.y;
        }

        /* renamed from: component5, reason: from getter */
        public final double getZ() {
            return this.z;
        }

        /* renamed from: component6, reason: from getter */
        public final double getW() {
            return this.w;
        }

        @NotNull
        public final GameRotationVectorReading copy(long timestampNanos, long timestampUnixMillis, double x, double y, double z, double w) {
            return new GameRotationVectorReading(timestampNanos, timestampUnixMillis, x, y, z, w);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GameRotationVectorReading)) {
                return false;
            }
            GameRotationVectorReading gameRotationVectorReading = (GameRotationVectorReading) other;
            return this.timestampNanos == gameRotationVectorReading.timestampNanos && this.timestampUnixMillis == gameRotationVectorReading.timestampUnixMillis && Double.compare(this.x, gameRotationVectorReading.x) == 0 && Double.compare(this.y, gameRotationVectorReading.y) == 0 && Double.compare(this.z, gameRotationVectorReading.z) == 0 && Double.compare(this.w, gameRotationVectorReading.w) == 0;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public boolean getHasNaN() {
            return this.hasNaN;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampNanos() {
            return this.timestampNanos;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        public final double getW() {
            return this.w;
        }

        public final double getX() {
            return this.x;
        }

        public final double getY() {
            return this.y;
        }

        public final double getZ() {
            return this.z;
        }

        public int hashCode() {
            return Double.hashCode(this.w) + J.a(this.z, J.a(this.y, J.a(this.x, K.a(this.timestampUnixMillis, Long.hashCode(this.timestampNanos) * 31, 31), 31), 31), 31);
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isNaN, reason: from getter */
        public boolean getIsNaN() {
            return this.isNaN;
        }

        public final boolean isSameValues(@NotNull GameRotationVectorReading other) {
            Intrinsics.h(other, "other");
            return this.x == other.x && this.y == other.y && this.z == other.z && this.w == other.w;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isZeroes, reason: from getter */
        public boolean getIsZeroes() {
            return this.isZeroes;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("GameRotationVectorReading(timestampNanos=");
            sb.append(this.timestampNanos);
            sb.append(", timestampUnixMillis=");
            sb.append(this.timestampUnixMillis);
            sb.append(", x=");
            sb.append(this.x);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(", z=");
            sb.append(this.z);
            sb.append(", w=");
            return E.a(sb, this.w, ')');
        }

        public GameRotationVectorReading(long j, long j2, double d, double d2, double d3, double d4) {
            super(SystemSensor.GAME_ROTATION_VECTOR, null);
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.x = d;
            this.y = d2;
            this.z = d3;
            this.w = d4;
            this.isZeroes = d == 0.0d && d2 == 0.0d && d3 == 0.0d && d4 == 0.0d;
            this.isNaN = Double.isNaN(d) && Double.isNaN(d2) && Double.isNaN(d3) && Double.isNaN(d4);
            this.hasNaN = Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public GameRotationVectorReading(@NotNull C1487a eventWrapper, @NotNull TimeProvider timeProvider) {
            Intrinsics.h(eventWrapper, "eventWrapper");
            Intrinsics.h(timeProvider, "timeProvider");
            long j = eventWrapper.b;
            Companion companion = SensorReading.Companion;
            long j2 = eventWrapper.b;
            companion.getClass();
            long jA = Companion.a(timeProvider, j2);
            float[] fArr = eventWrapper.c;
            this(j, jA, fArr[0], fArr[1], fArr[2], fArr[3]);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u000b\u0010\u0011Bu\b\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u000b\u0010\u001cJ(\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 HÁ\u0001¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020\"2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u0000¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0010\u00101\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b3\u00102J\u0010\u00104\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b4\u00102J\u0010\u00105\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b5\u00102J\u0010\u00106\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b6\u00102JV\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u000209HÖ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020\u00162\b\u0010+\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\b?\u0010@R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010/R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bC\u0010/R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bE\u00102R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bF\u00102R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bG\u00102R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bH\u00102R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bI\u00102R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\b\u0017\u0010KR\u001a\u0010\u0018\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\b\u0018\u0010KR\u001a\u0010\u0019\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010J\u001a\u0004\bL\u0010K¨\u0006O"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$LocationReading;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading;", "", "timestampNanos", "timestampUnixMillis", "", h.a.b, h.a.c, "altitude", "horizontalAccuracy", FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, "<init>", "(JJDDDDD)V", "Lme/oriient/internal/services/sensorsManager/a;", "eventWrapper", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "(Lme/oriient/internal/services/sensorsManager/a;Lme/oriient/internal/infra/utils/core/time/TimeProvider;)V", "", "seen1", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "type", "", "isZeroes", "isNaN", "hasNaN", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILme/oriient/internal/services/sensorsManager/sensors/SystemSensor;JJDDDDDZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$internal_publishRelease", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$LocationReading;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/nio/ByteBuffer;", "appendTo", "firstTimestampNanos", "appendRsmp", "(Ljava/nio/ByteBuffer;J)V", "other", "isSameValues", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$LocationReading;)Z", "component1", "()J", "component2", "component3", "()D", "component4", "component5", "component6", "component7", "copy", "(JJDDDDD)Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$LocationReading;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestampNanos", "getTimestampUnixMillis", "D", "getLatitude", "getLongitude", "getAltitude", "getHorizontalAccuracy", "getVerticalAccuracy", "Z", "()Z", "getHasNaN", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class LocationReading extends SensorReading {
        private final double altitude;
        private final boolean hasNaN;
        private final double horizontalAccuracy;
        private final boolean isNaN;
        private final boolean isZeroes;
        private final double latitude;
        private final double longitude;
        private final long timestampNanos;
        private final long timestampUnixMillis;
        private final double verticalAccuracy;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @JvmField
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {EnumsKt.b(SystemSensor.values(), "me.oriient.internal.services.sensorsManager.sensors.SystemSensor"), null, null, null, null, null, null, null, null, null, null};

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$LocationReading$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$LocationReading;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<LocationReading> serializer() {
                return SensorReading$LocationReading$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ LocationReading(int i, SystemSensor systemSensor, long j, long j2, double d, double d2, double d3, double d4, double d5, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, systemSensor, serializationConstructorMarker);
            if (255 != (i & 255)) {
                PluginExceptionsKt.a(i, 255, SensorReading$LocationReading$$serializer.INSTANCE.getB());
                throw null;
            }
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.latitude = d;
            this.longitude = d2;
            this.altitude = d3;
            this.horizontalAccuracy = d4;
            this.verticalAccuracy = d5;
            this.isZeroes = (i & 256) == 0 ? d == 0.0d && d2 == 0.0d && d3 == 0.0d && d4 == 0.0d && d5 == 0.0d : z;
            this.isNaN = (i & 512) == 0 ? Double.isNaN(d) && Double.isNaN(d2) && Double.isNaN(d3) && Double.isNaN(d4) && Double.isNaN(d5) : z2;
            if ((i & 1024) == 0) {
                this.hasNaN = Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5);
            } else {
                this.hasNaN = z3;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading.LocationReading r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
            /*
                Method dump skipped, instructions count: 237
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.sensorsManager.sensors.SensorReading.LocationReading.write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading$LocationReading, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public void appendRsmp(@NotNull ByteBuffer appendTo, long firstTimestampNanos) {
            Intrinsics.h(appendTo, "appendTo");
            super.appendRsmp(appendTo, firstTimestampNanos);
            appendTo.putFloat((float) this.latitude);
            appendTo.putFloat((float) this.longitude);
            appendTo.putFloat((float) this.altitude);
            appendTo.putFloat((float) this.horizontalAccuracy);
            appendTo.putFloat((float) this.verticalAccuracy);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestampNanos() {
            return this.timestampNanos;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        /* renamed from: component3, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        /* renamed from: component4, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        /* renamed from: component5, reason: from getter */
        public final double getAltitude() {
            return this.altitude;
        }

        /* renamed from: component6, reason: from getter */
        public final double getHorizontalAccuracy() {
            return this.horizontalAccuracy;
        }

        /* renamed from: component7, reason: from getter */
        public final double getVerticalAccuracy() {
            return this.verticalAccuracy;
        }

        @NotNull
        public final LocationReading copy(long timestampNanos, long timestampUnixMillis, double latitude, double longitude, double altitude, double horizontalAccuracy, double verticalAccuracy) {
            return new LocationReading(timestampNanos, timestampUnixMillis, latitude, longitude, altitude, horizontalAccuracy, verticalAccuracy);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationReading)) {
                return false;
            }
            LocationReading locationReading = (LocationReading) other;
            return this.timestampNanos == locationReading.timestampNanos && this.timestampUnixMillis == locationReading.timestampUnixMillis && Double.compare(this.latitude, locationReading.latitude) == 0 && Double.compare(this.longitude, locationReading.longitude) == 0 && Double.compare(this.altitude, locationReading.altitude) == 0 && Double.compare(this.horizontalAccuracy, locationReading.horizontalAccuracy) == 0 && Double.compare(this.verticalAccuracy, locationReading.verticalAccuracy) == 0;
        }

        public final double getAltitude() {
            return this.altitude;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public boolean getHasNaN() {
            return this.hasNaN;
        }

        public final double getHorizontalAccuracy() {
            return this.horizontalAccuracy;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampNanos() {
            return this.timestampNanos;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        public final double getVerticalAccuracy() {
            return this.verticalAccuracy;
        }

        public int hashCode() {
            return Double.hashCode(this.verticalAccuracy) + J.a(this.horizontalAccuracy, J.a(this.altitude, J.a(this.longitude, J.a(this.latitude, K.a(this.timestampUnixMillis, Long.hashCode(this.timestampNanos) * 31, 31), 31), 31), 31), 31);
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isNaN, reason: from getter */
        public boolean getIsNaN() {
            return this.isNaN;
        }

        public final boolean isSameValues(@NotNull LocationReading other) {
            Intrinsics.h(other, "other");
            return this.latitude == other.latitude && this.longitude == other.longitude && this.altitude == other.altitude && this.horizontalAccuracy == other.horizontalAccuracy && this.verticalAccuracy == other.verticalAccuracy;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isZeroes, reason: from getter */
        public boolean getIsZeroes() {
            return this.isZeroes;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("LocationReading(timestampNanos=");
            sb.append(this.timestampNanos);
            sb.append(", timestampUnixMillis=");
            sb.append(this.timestampUnixMillis);
            sb.append(", latitude=");
            sb.append(this.latitude);
            sb.append(", longitude=");
            sb.append(this.longitude);
            sb.append(", altitude=");
            sb.append(this.altitude);
            sb.append(", horizontalAccuracy=");
            sb.append(this.horizontalAccuracy);
            sb.append(", verticalAccuracy=");
            return E.a(sb, this.verticalAccuracy, ')');
        }

        public LocationReading(long j, long j2, double d, double d2, double d3, double d4, double d5) {
            super(SystemSensor.LOCATION, null);
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.latitude = d;
            this.longitude = d2;
            this.altitude = d3;
            this.horizontalAccuracy = d4;
            this.verticalAccuracy = d5;
            this.isZeroes = d == 0.0d && d2 == 0.0d && d3 == 0.0d && d4 == 0.0d && d5 == 0.0d;
            this.isNaN = Double.isNaN(d) && Double.isNaN(d2) && Double.isNaN(d3) && Double.isNaN(d4) && Double.isNaN(d5);
            this.hasNaN = Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public LocationReading(@NotNull C1487a eventWrapper, @NotNull TimeProvider timeProvider) {
            Intrinsics.h(eventWrapper, "eventWrapper");
            Intrinsics.h(timeProvider, "timeProvider");
            long j = eventWrapper.b;
            Companion companion = SensorReading.Companion;
            long j2 = eventWrapper.b;
            companion.getClass();
            long jA = Companion.a(timeProvider, j2);
            float[] fArr = eventWrapper.c;
            this(j, jA, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4]);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002QPBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\f\u0010\u0012B}\b\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\f\u0010\u001dJ(\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!HÁ\u0001¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020#2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0000¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u00100J\u0010\u00102\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b4\u00103J\u0010\u00105\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b5\u00103J\u0010\u00106\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b6\u00103J\u0010\u00107\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b7\u00103J\u0010\u00108\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b8\u00103J`\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010A\u001a\u00020\u00172\b\u0010,\u001a\u0004\u0018\u00010@HÖ\u0003¢\u0006\u0004\bA\u0010BR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u00100R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010C\u001a\u0004\bE\u00100R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010F\u001a\u0004\bG\u00103R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bH\u00103R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bI\u00103R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010F\u001a\u0004\bJ\u00103R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bK\u00103R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010F\u001a\u0004\bL\u00103R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010M\u001a\u0004\b\u0018\u0010NR\u001a\u0010\u0019\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010M\u001a\u0004\b\u0019\u0010NR\u001a\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010M\u001a\u0004\bO\u0010N¨\u0006R"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeUncalibratedReading;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading;", "", "timestampNanos", "timestampUnixMillis", "", "xSpeed", "ySpeed", "zSpeed", "xDrift", "yDrift", "zDrift", "<init>", "(JJDDDDDD)V", "Lme/oriient/internal/services/sensorsManager/a;", "eventWrapper", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "(Lme/oriient/internal/services/sensorsManager/a;Lme/oriient/internal/infra/utils/core/time/TimeProvider;)V", "", "seen1", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "type", "", "isZeroes", "isNaN", "hasNaN", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILme/oriient/internal/services/sensorsManager/sensors/SystemSensor;JJDDDDDDZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$internal_publishRelease", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeUncalibratedReading;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/nio/ByteBuffer;", "appendTo", "firstTimestampNanos", "appendRsmp", "(Ljava/nio/ByteBuffer;J)V", "other", "isSameValues", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeUncalibratedReading;)Z", "component1", "()J", "component2", "component3", "()D", "component4", "component5", "component6", "component7", "component8", "copy", "(JJDDDDDD)Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeUncalibratedReading;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestampNanos", "getTimestampUnixMillis", "D", "getXSpeed", "getYSpeed", "getZSpeed", "getXDrift", "getYDrift", "getZDrift", "Z", "()Z", "getHasNaN", "Companion", "$serializer", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class GyroscopeUncalibratedReading extends SensorReading {
        private final boolean hasNaN;
        private final boolean isNaN;
        private final boolean isZeroes;
        private final long timestampNanos;
        private final long timestampUnixMillis;
        private final double xDrift;
        private final double xSpeed;
        private final double yDrift;
        private final double ySpeed;
        private final double zDrift;
        private final double zSpeed;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @JvmField
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {EnumsKt.b(SystemSensor.values(), "me.oriient.internal.services.sensorsManager.sensors.SystemSensor"), null, null, null, null, null, null, null, null, null, null, null};

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeUncalibratedReading$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeUncalibratedReading;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<GyroscopeUncalibratedReading> serializer() {
                return SensorReading$GyroscopeUncalibratedReading$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ GyroscopeUncalibratedReading(int i, SystemSensor systemSensor, long j, long j2, double d, double d2, double d3, double d4, double d5, double d6, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, systemSensor, serializationConstructorMarker);
            if (511 != (i & 511)) {
                PluginExceptionsKt.a(i, 511, SensorReading$GyroscopeUncalibratedReading$$serializer.INSTANCE.getB());
                throw null;
            }
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.xSpeed = d;
            this.ySpeed = d2;
            this.zSpeed = d3;
            this.xDrift = d4;
            this.yDrift = d5;
            this.zDrift = d6;
            this.isZeroes = (i & 512) == 0 ? d == 0.0d && d2 == 0.0d && d3 == 0.0d && d4 == 0.0d && d5 == 0.0d && d6 == 0.0d : z;
            this.isNaN = (i & 1024) == 0 ? Double.isNaN(d) && Double.isNaN(d2) && Double.isNaN(d3) && Double.isNaN(d4) && Double.isNaN(d5) && Double.isNaN(d6) : z2;
            if ((i & 2048) == 0) {
                this.hasNaN = Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6);
            } else {
                this.hasNaN = z3;
            }
        }

        public static /* synthetic */ GyroscopeUncalibratedReading copy$default(GyroscopeUncalibratedReading gyroscopeUncalibratedReading, long j, long j2, double d, double d2, double d3, double d4, double d5, double d6, int i, Object obj) {
            double d7;
            long j3;
            long j4 = (i & 1) != 0 ? gyroscopeUncalibratedReading.timestampNanos : j;
            long j5 = (i & 2) != 0 ? gyroscopeUncalibratedReading.timestampUnixMillis : j2;
            double d8 = (i & 4) != 0 ? gyroscopeUncalibratedReading.xSpeed : d;
            double d9 = (i & 8) != 0 ? gyroscopeUncalibratedReading.ySpeed : d2;
            double d10 = (i & 16) != 0 ? gyroscopeUncalibratedReading.zSpeed : d3;
            double d11 = (i & 32) != 0 ? gyroscopeUncalibratedReading.xDrift : d4;
            double d12 = (i & 64) != 0 ? gyroscopeUncalibratedReading.yDrift : d5;
            if ((i & 128) != 0) {
                d7 = gyroscopeUncalibratedReading.zDrift;
                j3 = j4;
            } else {
                d7 = d6;
                j3 = j4;
            }
            return gyroscopeUncalibratedReading.copy(j3, j5, d8, d9, d10, d11, d12, d7);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final /* synthetic */ void write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading.GyroscopeUncalibratedReading r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.sensorsManager.sensors.SensorReading.GyroscopeUncalibratedReading.write$Self$internal_publishRelease(me.oriient.internal.services.sensorsManager.sensors.SensorReading$GyroscopeUncalibratedReading, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public void appendRsmp(@NotNull ByteBuffer appendTo, long firstTimestampNanos) {
            Intrinsics.h(appendTo, "appendTo");
            super.appendRsmp(appendTo, firstTimestampNanos);
            appendTo.putFloat((float) this.xSpeed);
            appendTo.putFloat((float) this.ySpeed);
            appendTo.putFloat((float) this.zSpeed);
            appendTo.putFloat((float) this.xDrift);
            appendTo.putFloat((float) this.yDrift);
            appendTo.putFloat((float) this.zDrift);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestampNanos() {
            return this.timestampNanos;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        /* renamed from: component3, reason: from getter */
        public final double getXSpeed() {
            return this.xSpeed;
        }

        /* renamed from: component4, reason: from getter */
        public final double getYSpeed() {
            return this.ySpeed;
        }

        /* renamed from: component5, reason: from getter */
        public final double getZSpeed() {
            return this.zSpeed;
        }

        /* renamed from: component6, reason: from getter */
        public final double getXDrift() {
            return this.xDrift;
        }

        /* renamed from: component7, reason: from getter */
        public final double getYDrift() {
            return this.yDrift;
        }

        /* renamed from: component8, reason: from getter */
        public final double getZDrift() {
            return this.zDrift;
        }

        @NotNull
        public final GyroscopeUncalibratedReading copy(long timestampNanos, long timestampUnixMillis, double xSpeed, double ySpeed, double zSpeed, double xDrift, double yDrift, double zDrift) {
            return new GyroscopeUncalibratedReading(timestampNanos, timestampUnixMillis, xSpeed, ySpeed, zSpeed, xDrift, yDrift, zDrift);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GyroscopeUncalibratedReading)) {
                return false;
            }
            GyroscopeUncalibratedReading gyroscopeUncalibratedReading = (GyroscopeUncalibratedReading) other;
            return this.timestampNanos == gyroscopeUncalibratedReading.timestampNanos && this.timestampUnixMillis == gyroscopeUncalibratedReading.timestampUnixMillis && Double.compare(this.xSpeed, gyroscopeUncalibratedReading.xSpeed) == 0 && Double.compare(this.ySpeed, gyroscopeUncalibratedReading.ySpeed) == 0 && Double.compare(this.zSpeed, gyroscopeUncalibratedReading.zSpeed) == 0 && Double.compare(this.xDrift, gyroscopeUncalibratedReading.xDrift) == 0 && Double.compare(this.yDrift, gyroscopeUncalibratedReading.yDrift) == 0 && Double.compare(this.zDrift, gyroscopeUncalibratedReading.zDrift) == 0;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public boolean getHasNaN() {
            return this.hasNaN;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampNanos() {
            return this.timestampNanos;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        public long getTimestampUnixMillis() {
            return this.timestampUnixMillis;
        }

        public final double getXDrift() {
            return this.xDrift;
        }

        public final double getXSpeed() {
            return this.xSpeed;
        }

        public final double getYDrift() {
            return this.yDrift;
        }

        public final double getYSpeed() {
            return this.ySpeed;
        }

        public final double getZDrift() {
            return this.zDrift;
        }

        public final double getZSpeed() {
            return this.zSpeed;
        }

        public int hashCode() {
            return Double.hashCode(this.zDrift) + J.a(this.yDrift, J.a(this.xDrift, J.a(this.zSpeed, J.a(this.ySpeed, J.a(this.xSpeed, K.a(this.timestampUnixMillis, Long.hashCode(this.timestampNanos) * 31, 31), 31), 31), 31), 31), 31);
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isNaN, reason: from getter */
        public boolean getIsNaN() {
            return this.isNaN;
        }

        public final boolean isSameValues(@NotNull GyroscopeUncalibratedReading other) {
            Intrinsics.h(other, "other");
            return this.xSpeed == other.xSpeed && this.ySpeed == other.ySpeed && this.zSpeed == other.zSpeed && this.xDrift == other.xDrift && this.yDrift == other.yDrift && this.zDrift == other.zDrift;
        }

        @Override // me.oriient.internal.services.sensorsManager.sensors.SensorReading
        /* renamed from: isZeroes, reason: from getter */
        public boolean getIsZeroes() {
            return this.isZeroes;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("GyroscopeUncalibratedReading(timestampNanos=");
            sb.append(this.timestampNanos);
            sb.append(", timestampUnixMillis=");
            sb.append(this.timestampUnixMillis);
            sb.append(", xSpeed=");
            sb.append(this.xSpeed);
            sb.append(", ySpeed=");
            sb.append(this.ySpeed);
            sb.append(", zSpeed=");
            sb.append(this.zSpeed);
            sb.append(", xDrift=");
            sb.append(this.xDrift);
            sb.append(", yDrift=");
            sb.append(this.yDrift);
            sb.append(", zDrift=");
            return E.a(sb, this.zDrift, ')');
        }

        public GyroscopeUncalibratedReading(long j, long j2, double d, double d2, double d3, double d4, double d5, double d6) {
            super(SystemSensor.GYROSCOPE_UNCALIBRATED, null);
            this.timestampNanos = j;
            this.timestampUnixMillis = j2;
            this.xSpeed = d;
            this.ySpeed = d2;
            this.zSpeed = d3;
            this.xDrift = d4;
            this.yDrift = d5;
            this.zDrift = d6;
            this.isZeroes = d == 0.0d && d2 == 0.0d && d3 == 0.0d && d4 == 0.0d && d5 == 0.0d && d6 == 0.0d;
            this.isNaN = Double.isNaN(d) && Double.isNaN(d2) && Double.isNaN(d3) && Double.isNaN(d4) && Double.isNaN(d5) && Double.isNaN(d6);
            this.hasNaN = Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public GyroscopeUncalibratedReading(@NotNull C1487a eventWrapper, @NotNull TimeProvider timeProvider) {
            Intrinsics.h(eventWrapper, "eventWrapper");
            Intrinsics.h(timeProvider, "timeProvider");
            long j = eventWrapper.b;
            Companion companion = SensorReading.Companion;
            long j2 = eventWrapper.b;
            companion.getClass();
            long jA = Companion.a(timeProvider, j2);
            float[] fArr = eventWrapper.c;
            this(j, jA, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
        }
    }
}
