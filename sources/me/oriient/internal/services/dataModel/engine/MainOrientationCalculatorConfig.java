package me.oriient.internal.services.dataModel.engine;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.services.dataManager.building.E;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BA\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÁ\u0001¢\u0006\u0002\b(R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006+"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfig;", "", "seen1", "", "moGridIntervalRadians", "", "moGridAllowedDeviationRadiansWhenIdle", "moGridAllowedDeviationRadiansWhenWalking", "positionsBufferSize", "minimumWalkingDistance", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDDIDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DDDID)V", "getMinimumWalkingDistance", "()D", "getMoGridAllowedDeviationRadiansWhenIdle", "getMoGridAllowedDeviationRadiansWhenWalking", "getMoGridIntervalRadians", "getPositionsBufferSize", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class MainOrientationCalculatorConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final double minimumWalkingDistance;
    private final double moGridAllowedDeviationRadiansWhenIdle;
    private final double moGridAllowedDeviationRadiansWhenWalking;
    private final double moGridIntervalRadians;
    private final int positionsBufferSize;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<MainOrientationCalculatorConfig> serializer() {
            return MainOrientationCalculatorConfig$$serializer.INSTANCE;
        }
    }

    public MainOrientationCalculatorConfig(double d, double d2, double d3, int i, double d4) {
        this.moGridIntervalRadians = d;
        this.moGridAllowedDeviationRadiansWhenIdle = d2;
        this.moGridAllowedDeviationRadiansWhenWalking = d3;
        this.positionsBufferSize = i;
        this.minimumWalkingDistance = d4;
    }

    public static /* synthetic */ MainOrientationCalculatorConfig copy$default(MainOrientationCalculatorConfig mainOrientationCalculatorConfig, double d, double d2, double d3, int i, double d4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = mainOrientationCalculatorConfig.moGridIntervalRadians;
        }
        double d5 = d;
        if ((i2 & 2) != 0) {
            d2 = mainOrientationCalculatorConfig.moGridAllowedDeviationRadiansWhenIdle;
        }
        return mainOrientationCalculatorConfig.copy(d5, d2, (i2 & 4) != 0 ? mainOrientationCalculatorConfig.moGridAllowedDeviationRadiansWhenWalking : d3, (i2 & 8) != 0 ? mainOrientationCalculatorConfig.positionsBufferSize : i, (i2 & 16) != 0 ? mainOrientationCalculatorConfig.minimumWalkingDistance : d4);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(MainOrientationCalculatorConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.G(serialDesc, 0, self.moGridIntervalRadians);
        output.G(serialDesc, 1, self.moGridAllowedDeviationRadiansWhenIdle);
        output.G(serialDesc, 2, self.moGridAllowedDeviationRadiansWhenWalking);
        output.C(3, self.positionsBufferSize, serialDesc);
        output.G(serialDesc, 4, self.minimumWalkingDistance);
    }

    /* renamed from: component1, reason: from getter */
    public final double getMoGridIntervalRadians() {
        return this.moGridIntervalRadians;
    }

    /* renamed from: component2, reason: from getter */
    public final double getMoGridAllowedDeviationRadiansWhenIdle() {
        return this.moGridAllowedDeviationRadiansWhenIdle;
    }

    /* renamed from: component3, reason: from getter */
    public final double getMoGridAllowedDeviationRadiansWhenWalking() {
        return this.moGridAllowedDeviationRadiansWhenWalking;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPositionsBufferSize() {
        return this.positionsBufferSize;
    }

    /* renamed from: component5, reason: from getter */
    public final double getMinimumWalkingDistance() {
        return this.minimumWalkingDistance;
    }

    @NotNull
    public final MainOrientationCalculatorConfig copy(double moGridIntervalRadians, double moGridAllowedDeviationRadiansWhenIdle, double moGridAllowedDeviationRadiansWhenWalking, int positionsBufferSize, double minimumWalkingDistance) {
        return new MainOrientationCalculatorConfig(moGridIntervalRadians, moGridAllowedDeviationRadiansWhenIdle, moGridAllowedDeviationRadiansWhenWalking, positionsBufferSize, minimumWalkingDistance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainOrientationCalculatorConfig)) {
            return false;
        }
        MainOrientationCalculatorConfig mainOrientationCalculatorConfig = (MainOrientationCalculatorConfig) other;
        return Double.compare(this.moGridIntervalRadians, mainOrientationCalculatorConfig.moGridIntervalRadians) == 0 && Double.compare(this.moGridAllowedDeviationRadiansWhenIdle, mainOrientationCalculatorConfig.moGridAllowedDeviationRadiansWhenIdle) == 0 && Double.compare(this.moGridAllowedDeviationRadiansWhenWalking, mainOrientationCalculatorConfig.moGridAllowedDeviationRadiansWhenWalking) == 0 && this.positionsBufferSize == mainOrientationCalculatorConfig.positionsBufferSize && Double.compare(this.minimumWalkingDistance, mainOrientationCalculatorConfig.minimumWalkingDistance) == 0;
    }

    public final double getMinimumWalkingDistance() {
        return this.minimumWalkingDistance;
    }

    public final double getMoGridAllowedDeviationRadiansWhenIdle() {
        return this.moGridAllowedDeviationRadiansWhenIdle;
    }

    public final double getMoGridAllowedDeviationRadiansWhenWalking() {
        return this.moGridAllowedDeviationRadiansWhenWalking;
    }

    public final double getMoGridIntervalRadians() {
        return this.moGridIntervalRadians;
    }

    public final int getPositionsBufferSize() {
        return this.positionsBufferSize;
    }

    public int hashCode() {
        return Double.hashCode(this.minimumWalkingDistance) + me.oriient.internal.services.config.a.a(this.positionsBufferSize, J.a(this.moGridAllowedDeviationRadiansWhenWalking, J.a(this.moGridAllowedDeviationRadiansWhenIdle, Double.hashCode(this.moGridIntervalRadians) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MainOrientationCalculatorConfig(moGridIntervalRadians=");
        sb.append(this.moGridIntervalRadians);
        sb.append(", moGridAllowedDeviationRadiansWhenIdle=");
        sb.append(this.moGridAllowedDeviationRadiansWhenIdle);
        sb.append(", moGridAllowedDeviationRadiansWhenWalking=");
        sb.append(this.moGridAllowedDeviationRadiansWhenWalking);
        sb.append(", positionsBufferSize=");
        sb.append(this.positionsBufferSize);
        sb.append(", minimumWalkingDistance=");
        return E.a(sb, this.minimumWalkingDistance, ')');
    }

    @Deprecated
    public /* synthetic */ MainOrientationCalculatorConfig(int i, double d, double d2, double d3, int i2, double d4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.a(i, 31, MainOrientationCalculatorConfig$$serializer.INSTANCE.getB());
            throw null;
        }
        this.moGridIntervalRadians = d;
        this.moGridAllowedDeviationRadiansWhenIdle = d2;
        this.moGridAllowedDeviationRadiansWhenWalking = d3;
        this.positionsBufferSize = i2;
        this.minimumWalkingDistance = d4;
    }
}
