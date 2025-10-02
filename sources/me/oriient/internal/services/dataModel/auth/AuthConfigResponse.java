package me.oriient.internal.services.dataModel.auth;

import androidx.annotation.Keep;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000278B_\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fBY\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0012Jb\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0006\u0010+\u001a\u00020,J\t\u0010-\u001a\u00020.HÖ\u0001J&\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205HÁ\u0001¢\u0006\u0002\b6R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018¨\u00069"}, d2 = {"Lme/oriient/internal/services/dataModel/auth/AuthConfigResponse;", "", "seen1", "", "loginRetryAttempts", "loginRetryInterval", "", "timeIntervalBeforeRefresh", "maxRefreshAttempts", "refreshBaseInterval", "refreshIntervalMultiplier", "inactivityTimeToStopJwtRefreshesMillis", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;)V", "getInactivityTimeToStopJwtRefreshesMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLoginRetryAttempts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLoginRetryInterval", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMaxRefreshAttempts", "getRefreshBaseInterval", "getRefreshIntervalMultiplier", "getTimeIntervalBeforeRefresh", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;)Lme/oriient/internal/services/dataModel/auth/AuthConfigResponse;", "equals", "", "other", "hashCode", "toAuthConfig", "Lme/oriient/internal/services/dataModel/auth/AuthConfig;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class AuthConfigResponse {

    @NotNull
    private static final Companion Companion = new Companion();
    private static final long SEC_TO_MILLIS = TimeUnit.SECONDS.toMillis(1);

    @Nullable
    private final Long inactivityTimeToStopJwtRefreshesMillis;

    @Nullable
    private final Integer loginRetryAttempts;

    @Nullable
    private final Double loginRetryInterval;

    @Nullable
    private final Integer maxRefreshAttempts;

    @Nullable
    private final Double refreshBaseInterval;

    @Nullable
    private final Double refreshIntervalMultiplier;

    @Nullable
    private final Double timeIntervalBeforeRefresh;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/auth/AuthConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/auth/AuthConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<AuthConfigResponse> serializer() {
            return AuthConfigResponse$$serializer.INSTANCE;
        }
    }

    public AuthConfigResponse() {
        this((Integer) null, (Double) null, (Double) null, (Integer) null, (Double) null, (Double) null, (Long) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AuthConfigResponse copy$default(AuthConfigResponse authConfigResponse, Integer num, Double d, Double d2, Integer num2, Double d3, Double d4, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            num = authConfigResponse.loginRetryAttempts;
        }
        if ((i & 2) != 0) {
            d = authConfigResponse.loginRetryInterval;
        }
        if ((i & 4) != 0) {
            d2 = authConfigResponse.timeIntervalBeforeRefresh;
        }
        if ((i & 8) != 0) {
            num2 = authConfigResponse.maxRefreshAttempts;
        }
        if ((i & 16) != 0) {
            d3 = authConfigResponse.refreshBaseInterval;
        }
        if ((i & 32) != 0) {
            d4 = authConfigResponse.refreshIntervalMultiplier;
        }
        if ((i & 64) != 0) {
            l = authConfigResponse.inactivityTimeToStopJwtRefreshesMillis;
        }
        Double d5 = d4;
        Long l2 = l;
        Double d6 = d3;
        Double d7 = d2;
        return authConfigResponse.copy(num, d, d7, num2, d6, d5, l2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(AuthConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || self.loginRetryAttempts != null) {
            output.w(serialDesc, 0, IntSerializer.f24800a, self.loginRetryAttempts);
        }
        if (output.q(serialDesc, 1) || self.loginRetryInterval != null) {
            output.w(serialDesc, 1, DoubleSerializer.f24792a, self.loginRetryInterval);
        }
        if (output.q(serialDesc, 2) || self.timeIntervalBeforeRefresh != null) {
            output.w(serialDesc, 2, DoubleSerializer.f24792a, self.timeIntervalBeforeRefresh);
        }
        if (output.q(serialDesc, 3) || self.maxRefreshAttempts != null) {
            output.w(serialDesc, 3, IntSerializer.f24800a, self.maxRefreshAttempts);
        }
        if (output.q(serialDesc, 4) || self.refreshBaseInterval != null) {
            output.w(serialDesc, 4, DoubleSerializer.f24792a, self.refreshBaseInterval);
        }
        if (output.q(serialDesc, 5) || self.refreshIntervalMultiplier != null) {
            output.w(serialDesc, 5, DoubleSerializer.f24792a, self.refreshIntervalMultiplier);
        }
        if (!output.q(serialDesc, 6) && self.inactivityTimeToStopJwtRefreshesMillis == null) {
            return;
        }
        output.w(serialDesc, 6, LongSerializer.f24804a, self.inactivityTimeToStopJwtRefreshesMillis);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getLoginRetryAttempts() {
        return this.loginRetryAttempts;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getLoginRetryInterval() {
        return this.loginRetryInterval;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getTimeIntervalBeforeRefresh() {
        return this.timeIntervalBeforeRefresh;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getMaxRefreshAttempts() {
        return this.maxRefreshAttempts;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getRefreshBaseInterval() {
        return this.refreshBaseInterval;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getRefreshIntervalMultiplier() {
        return this.refreshIntervalMultiplier;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Long getInactivityTimeToStopJwtRefreshesMillis() {
        return this.inactivityTimeToStopJwtRefreshesMillis;
    }

    @NotNull
    public final AuthConfigResponse copy(@Nullable Integer loginRetryAttempts, @Nullable Double loginRetryInterval, @Nullable Double timeIntervalBeforeRefresh, @Nullable Integer maxRefreshAttempts, @Nullable Double refreshBaseInterval, @Nullable Double refreshIntervalMultiplier, @Nullable Long inactivityTimeToStopJwtRefreshesMillis) {
        return new AuthConfigResponse(loginRetryAttempts, loginRetryInterval, timeIntervalBeforeRefresh, maxRefreshAttempts, refreshBaseInterval, refreshIntervalMultiplier, inactivityTimeToStopJwtRefreshesMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthConfigResponse)) {
            return false;
        }
        AuthConfigResponse authConfigResponse = (AuthConfigResponse) other;
        return Intrinsics.c(this.loginRetryAttempts, authConfigResponse.loginRetryAttempts) && Intrinsics.c(this.loginRetryInterval, authConfigResponse.loginRetryInterval) && Intrinsics.c(this.timeIntervalBeforeRefresh, authConfigResponse.timeIntervalBeforeRefresh) && Intrinsics.c(this.maxRefreshAttempts, authConfigResponse.maxRefreshAttempts) && Intrinsics.c(this.refreshBaseInterval, authConfigResponse.refreshBaseInterval) && Intrinsics.c(this.refreshIntervalMultiplier, authConfigResponse.refreshIntervalMultiplier) && Intrinsics.c(this.inactivityTimeToStopJwtRefreshesMillis, authConfigResponse.inactivityTimeToStopJwtRefreshesMillis);
    }

    @Nullable
    public final Long getInactivityTimeToStopJwtRefreshesMillis() {
        return this.inactivityTimeToStopJwtRefreshesMillis;
    }

    @Nullable
    public final Integer getLoginRetryAttempts() {
        return this.loginRetryAttempts;
    }

    @Nullable
    public final Double getLoginRetryInterval() {
        return this.loginRetryInterval;
    }

    @Nullable
    public final Integer getMaxRefreshAttempts() {
        return this.maxRefreshAttempts;
    }

    @Nullable
    public final Double getRefreshBaseInterval() {
        return this.refreshBaseInterval;
    }

    @Nullable
    public final Double getRefreshIntervalMultiplier() {
        return this.refreshIntervalMultiplier;
    }

    @Nullable
    public final Double getTimeIntervalBeforeRefresh() {
        return this.timeIntervalBeforeRefresh;
    }

    public int hashCode() {
        Integer num = this.loginRetryAttempts;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d = this.loginRetryInterval;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.timeIntervalBeforeRefresh;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num2 = this.maxRefreshAttempts;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d3 = this.refreshBaseInterval;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.refreshIntervalMultiplier;
        int iHashCode6 = (iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Long l = this.inactivityTimeToStopJwtRefreshesMillis;
        return iHashCode6 + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public final AuthConfig toAuthConfig() {
        Integer num = this.loginRetryAttempts;
        int iIntValue = num != null ? num.intValue() : 1;
        Double d = this.loginRetryInterval;
        double dDoubleValue = d != null ? d.doubleValue() : 3.0d;
        double d2 = SEC_TO_MILLIS;
        long j = (long) (dDoubleValue * d2);
        Double d3 = this.timeIntervalBeforeRefresh;
        long jDoubleValue = (long) ((d3 != null ? d3.doubleValue() : 60.0d) * d2);
        Integer num2 = this.maxRefreshAttempts;
        int iIntValue2 = num2 != null ? num2.intValue() : 10;
        Double d4 = this.refreshBaseInterval;
        long jDoubleValue2 = (long) ((d4 != null ? d4.doubleValue() : 2.0d) * d2);
        Double d5 = this.refreshIntervalMultiplier;
        double dDoubleValue2 = d5 != null ? d5.doubleValue() : 2.0d;
        Long l = this.inactivityTimeToStopJwtRefreshesMillis;
        return new AuthConfig(iIntValue, j, jDoubleValue, iIntValue2, jDoubleValue2, dDoubleValue2, l != null ? l.longValue() : TimeUnit.HOURS.toMillis(3L));
    }

    @NotNull
    public String toString() {
        return "AuthConfigResponse(loginRetryAttempts=" + this.loginRetryAttempts + ", loginRetryInterval=" + this.loginRetryInterval + ", timeIntervalBeforeRefresh=" + this.timeIntervalBeforeRefresh + ", maxRefreshAttempts=" + this.maxRefreshAttempts + ", refreshBaseInterval=" + this.refreshBaseInterval + ", refreshIntervalMultiplier=" + this.refreshIntervalMultiplier + ", inactivityTimeToStopJwtRefreshesMillis=" + this.inactivityTimeToStopJwtRefreshesMillis + ')';
    }

    @Deprecated
    public /* synthetic */ AuthConfigResponse(int i, Integer num, Double d, Double d2, Integer num2, Double d3, Double d4, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.loginRetryAttempts = null;
        } else {
            this.loginRetryAttempts = num;
        }
        if ((i & 2) == 0) {
            this.loginRetryInterval = null;
        } else {
            this.loginRetryInterval = d;
        }
        if ((i & 4) == 0) {
            this.timeIntervalBeforeRefresh = null;
        } else {
            this.timeIntervalBeforeRefresh = d2;
        }
        if ((i & 8) == 0) {
            this.maxRefreshAttempts = null;
        } else {
            this.maxRefreshAttempts = num2;
        }
        if ((i & 16) == 0) {
            this.refreshBaseInterval = null;
        } else {
            this.refreshBaseInterval = d3;
        }
        if ((i & 32) == 0) {
            this.refreshIntervalMultiplier = null;
        } else {
            this.refreshIntervalMultiplier = d4;
        }
        if ((i & 64) == 0) {
            this.inactivityTimeToStopJwtRefreshesMillis = null;
        } else {
            this.inactivityTimeToStopJwtRefreshesMillis = l;
        }
    }

    public AuthConfigResponse(@Nullable Integer num, @Nullable Double d, @Nullable Double d2, @Nullable Integer num2, @Nullable Double d3, @Nullable Double d4, @Nullable Long l) {
        this.loginRetryAttempts = num;
        this.loginRetryInterval = d;
        this.timeIntervalBeforeRefresh = d2;
        this.maxRefreshAttempts = num2;
        this.refreshBaseInterval = d3;
        this.refreshIntervalMultiplier = d4;
        this.inactivityTimeToStopJwtRefreshesMillis = l;
    }

    public /* synthetic */ AuthConfigResponse(Integer num, Double d, Double d2, Integer num2, Double d3, Double d4, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : d3, (i & 32) != 0 ? null : d4, (i & 64) != 0 ? null : l);
    }
}
