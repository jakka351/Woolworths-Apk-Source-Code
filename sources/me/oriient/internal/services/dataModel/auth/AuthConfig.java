package me.oriient.internal.services.dataModel.auth;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
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
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.services.config.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000212BQ\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0002\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J&\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÁ\u0001¢\u0006\u0002\b0R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u00063"}, d2 = {"Lme/oriient/internal/services/dataModel/auth/AuthConfig;", "", "seen1", "", "loginRetryAttempts", "loginRetryIntervalMillis", "", "timeIntervalBeforeRefreshMillis", "maxRefreshAttempts", "refreshBaseIntervalMillis", "refreshIntervalMultiplier", "", "inactivityTimeToStopJwtRefreshesMillis", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIJJIJDJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IJJIJDJ)V", "getInactivityTimeToStopJwtRefreshesMillis", "()J", "getLoginRetryAttempts", "()I", "getLoginRetryIntervalMillis", "getMaxRefreshAttempts", "getRefreshBaseIntervalMillis", "getRefreshIntervalMultiplier", "()D", "getTimeIntervalBeforeRefreshMillis", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class AuthConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final long inactivityTimeToStopJwtRefreshesMillis;
    private final int loginRetryAttempts;
    private final long loginRetryIntervalMillis;
    private final int maxRefreshAttempts;
    private final long refreshBaseIntervalMillis;
    private final double refreshIntervalMultiplier;
    private final long timeIntervalBeforeRefreshMillis;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/auth/AuthConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/auth/AuthConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<AuthConfig> serializer() {
            return AuthConfig$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ AuthConfig(int i, int i2, long j, long j2, int i3, long j3, double d, long j4, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.a(i, 127, AuthConfig$$serializer.INSTANCE.getB());
            throw null;
        }
        this.loginRetryAttempts = i2;
        this.loginRetryIntervalMillis = j;
        this.timeIntervalBeforeRefreshMillis = j2;
        this.maxRefreshAttempts = i3;
        this.refreshBaseIntervalMillis = j3;
        this.refreshIntervalMultiplier = d;
        this.inactivityTimeToStopJwtRefreshesMillis = j4;
    }

    public static /* synthetic */ AuthConfig copy$default(AuthConfig authConfig, int i, long j, long j2, int i2, long j3, double d, long j4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = authConfig.loginRetryAttempts;
        }
        if ((i3 & 2) != 0) {
            j = authConfig.loginRetryIntervalMillis;
        }
        if ((i3 & 4) != 0) {
            j2 = authConfig.timeIntervalBeforeRefreshMillis;
        }
        if ((i3 & 8) != 0) {
            i2 = authConfig.maxRefreshAttempts;
        }
        if ((i3 & 16) != 0) {
            j3 = authConfig.refreshBaseIntervalMillis;
        }
        if ((i3 & 32) != 0) {
            d = authConfig.refreshIntervalMultiplier;
        }
        if ((i3 & 64) != 0) {
            j4 = authConfig.inactivityTimeToStopJwtRefreshesMillis;
        }
        long j5 = j4;
        int i4 = i2;
        long j6 = j2;
        return authConfig.copy(i, j, j6, i4, j3, d, j5);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(AuthConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.C(0, self.loginRetryAttempts, serialDesc);
        output.t(serialDesc, 1, self.loginRetryIntervalMillis);
        output.t(serialDesc, 2, self.timeIntervalBeforeRefreshMillis);
        output.C(3, self.maxRefreshAttempts, serialDesc);
        output.t(serialDesc, 4, self.refreshBaseIntervalMillis);
        output.G(serialDesc, 5, self.refreshIntervalMultiplier);
        output.t(serialDesc, 6, self.inactivityTimeToStopJwtRefreshesMillis);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLoginRetryAttempts() {
        return this.loginRetryAttempts;
    }

    /* renamed from: component2, reason: from getter */
    public final long getLoginRetryIntervalMillis() {
        return this.loginRetryIntervalMillis;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimeIntervalBeforeRefreshMillis() {
        return this.timeIntervalBeforeRefreshMillis;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaxRefreshAttempts() {
        return this.maxRefreshAttempts;
    }

    /* renamed from: component5, reason: from getter */
    public final long getRefreshBaseIntervalMillis() {
        return this.refreshBaseIntervalMillis;
    }

    /* renamed from: component6, reason: from getter */
    public final double getRefreshIntervalMultiplier() {
        return this.refreshIntervalMultiplier;
    }

    /* renamed from: component7, reason: from getter */
    public final long getInactivityTimeToStopJwtRefreshesMillis() {
        return this.inactivityTimeToStopJwtRefreshesMillis;
    }

    @NotNull
    public final AuthConfig copy(int loginRetryAttempts, long loginRetryIntervalMillis, long timeIntervalBeforeRefreshMillis, int maxRefreshAttempts, long refreshBaseIntervalMillis, double refreshIntervalMultiplier, long inactivityTimeToStopJwtRefreshesMillis) {
        return new AuthConfig(loginRetryAttempts, loginRetryIntervalMillis, timeIntervalBeforeRefreshMillis, maxRefreshAttempts, refreshBaseIntervalMillis, refreshIntervalMultiplier, inactivityTimeToStopJwtRefreshesMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthConfig)) {
            return false;
        }
        AuthConfig authConfig = (AuthConfig) other;
        return this.loginRetryAttempts == authConfig.loginRetryAttempts && this.loginRetryIntervalMillis == authConfig.loginRetryIntervalMillis && this.timeIntervalBeforeRefreshMillis == authConfig.timeIntervalBeforeRefreshMillis && this.maxRefreshAttempts == authConfig.maxRefreshAttempts && this.refreshBaseIntervalMillis == authConfig.refreshBaseIntervalMillis && Double.compare(this.refreshIntervalMultiplier, authConfig.refreshIntervalMultiplier) == 0 && this.inactivityTimeToStopJwtRefreshesMillis == authConfig.inactivityTimeToStopJwtRefreshesMillis;
    }

    public final long getInactivityTimeToStopJwtRefreshesMillis() {
        return this.inactivityTimeToStopJwtRefreshesMillis;
    }

    public final int getLoginRetryAttempts() {
        return this.loginRetryAttempts;
    }

    public final long getLoginRetryIntervalMillis() {
        return this.loginRetryIntervalMillis;
    }

    public final int getMaxRefreshAttempts() {
        return this.maxRefreshAttempts;
    }

    public final long getRefreshBaseIntervalMillis() {
        return this.refreshBaseIntervalMillis;
    }

    public final double getRefreshIntervalMultiplier() {
        return this.refreshIntervalMultiplier;
    }

    public final long getTimeIntervalBeforeRefreshMillis() {
        return this.timeIntervalBeforeRefreshMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.inactivityTimeToStopJwtRefreshesMillis) + J.a(this.refreshIntervalMultiplier, K.a(this.refreshBaseIntervalMillis, a.a(this.maxRefreshAttempts, K.a(this.timeIntervalBeforeRefreshMillis, K.a(this.loginRetryIntervalMillis, Integer.hashCode(this.loginRetryAttempts) * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AuthConfig(loginRetryAttempts=");
        sb.append(this.loginRetryAttempts);
        sb.append(", loginRetryIntervalMillis=");
        sb.append(this.loginRetryIntervalMillis);
        sb.append(", timeIntervalBeforeRefreshMillis=");
        sb.append(this.timeIntervalBeforeRefreshMillis);
        sb.append(", maxRefreshAttempts=");
        sb.append(this.maxRefreshAttempts);
        sb.append(", refreshBaseIntervalMillis=");
        sb.append(this.refreshBaseIntervalMillis);
        sb.append(", refreshIntervalMultiplier=");
        sb.append(this.refreshIntervalMultiplier);
        sb.append(", inactivityTimeToStopJwtRefreshesMillis=");
        return b.q(sb, this.inactivityTimeToStopJwtRefreshesMillis, ')');
    }

    public AuthConfig(int i, long j, long j2, int i2, long j3, double d, long j4) {
        this.loginRetryAttempts = i;
        this.loginRetryIntervalMillis = j;
        this.timeIntervalBeforeRefreshMillis = j2;
        this.maxRefreshAttempts = i2;
        this.refreshBaseIntervalMillis = j3;
        this.refreshIntervalMultiplier = d;
        this.inactivityTimeToStopJwtRefreshesMillis = j4;
    }
}
