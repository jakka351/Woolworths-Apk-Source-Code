package me.oriient.internal.services.elog;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016J<\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u001a\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H\u0016J8\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H\u0016J \u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016J<\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u001a\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H\u0016J8\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H\u0016J2\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J \u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016J<\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u001a\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H\u0016J8\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H\u0016J \u0010 \u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016J<\u0010 \u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u001a\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H\u0016J8\u0010 \u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H\u0016J \u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016J<\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u001a\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H\u0016J8\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H\u0016J \u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016J<\u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u001a\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H\u0016J8\u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H\u0016J \u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016J<\u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u001a\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H\u0016J8\u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H\u0016J \u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016J<\u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u001a\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H\u0016J8\u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H\u0016J2\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014*\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0011H\u0002R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lme/oriient/internal/services/elog/MetricImpl;", "Lme/oriient/internal/services/elog/Metric;", "metricELog", "Lme/oriient/internal/services/elog/ELog;", "(Lme/oriient/internal/services/elog/ELog;)V", "value", "Lme/oriient/internal/services/elog/ELog$Level;", "level", "getLevel", "()Lme/oriient/internal/services/elog/ELog$Level;", "setLevel", "(Lme/oriient/internal/services/elog/ELog$Level;)V", "api", "", "tag", "", "message", "", "metadata", "Lkotlin/Function0;", "", "", "c", "configure", "url", com.salesforce.marketingcloud.config.a.k, "", "retries", "sendingIntervalSeconds", "", "queueSize", "d", "e", "i", "io", "v", "w", "addValueToParams", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MetricImpl implements Metric {

    @NotNull
    private final ELog metricELog;

    public MetricImpl(@NotNull ELog metricELog) {
        Intrinsics.h(metricELog, "metricELog");
        this.metricELog = metricELog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> addValueToParams(Map<String, ? extends Object> map, double d) {
        LinkedHashMap linkedHashMapS = map != null ? MapsKt.s(map) : new LinkedHashMap();
        linkedHashMapS.put("value", Double.valueOf(d));
        return MapsKt.q(linkedHashMapS);
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void api(@NotNull String tag, @NotNull String message, double value) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        api(tag, message, value, (Map<String, ? extends Object>) null);
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void c(@NotNull String tag, @NotNull String message, double value) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        c(tag, message, value, (Map<String, ? extends Object>) null);
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void configure(@Nullable String url, int maxBatchSize, int retries, long sendingIntervalSeconds, int queueSize) {
        this.metricELog.configure(url, maxBatchSize, retries, sendingIntervalSeconds, queueSize, false);
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void d(@NotNull String tag, @NotNull String message, double value) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        d(tag, message, value, (Map<String, ? extends Object>) null);
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void e(@NotNull String tag, @NotNull String message, double value) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        e(tag, message, value, (Map<String, ? extends Object>) null);
    }

    @Override // me.oriient.internal.services.elog.Metric
    @NotNull
    public ELog.Level getLevel() {
        return this.metricELog.getLevel();
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void i(@NotNull String tag, @NotNull String message, double value) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        i(tag, message, value, (Map<String, ? extends Object>) null);
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void io(@NotNull String tag, @NotNull String message, double value) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        io(tag, message, value, (Map<String, ? extends Object>) null);
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void setLevel(@NotNull ELog.Level value) {
        Intrinsics.h(value, "value");
        this.metricELog.setLevel(value);
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void v(@NotNull String tag, @NotNull String message, double value) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        v(tag, message, value, (Map<String, ? extends Object>) null);
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void w(@NotNull String tag, @NotNull String message, double value) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        w(tag, message, value, (Map<String, ? extends Object>) null);
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void api(@NotNull String tag, @NotNull String message, double value, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        this.metricELog.api(tag, message, addValueToParams(metadata, value));
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void c(@NotNull String tag, @NotNull String message, double value, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        this.metricELog.c(tag, message, addValueToParams(metadata, value));
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void d(@NotNull String tag, @NotNull String message, double value, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        this.metricELog.d(tag, message, addValueToParams(metadata, value));
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void e(@NotNull String tag, @NotNull String message, double value, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        this.metricELog.e(tag, message, addValueToParams(metadata, value));
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void i(@NotNull String tag, @NotNull String message, double value, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        this.metricELog.i(tag, message, addValueToParams(metadata, value));
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void io(@NotNull String tag, @NotNull String message, double value, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        this.metricELog.io(tag, message, addValueToParams(metadata, value));
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void v(@NotNull String tag, @NotNull String message, double value, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        this.metricELog.v(tag, message, addValueToParams(metadata, value));
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void w(@NotNull String tag, @NotNull String message, double value, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        this.metricELog.w(tag, message, addValueToParams(metadata, value));
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void api(@NotNull String tag, @NotNull String message, double value, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        this.metricELog.api(tag, message, new f(this, metadata, value));
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void c(@NotNull String tag, @NotNull String message, double value, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        this.metricELog.c(tag, message, new g(this, metadata, value));
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void d(@NotNull String tag, @NotNull String message, double value, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        this.metricELog.d(tag, message, new h(this, metadata, value));
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void e(@NotNull String tag, @NotNull String message, double value, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        this.metricELog.e(tag, message, new i(this, metadata, value));
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void i(@NotNull String tag, @NotNull String message, double value, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        this.metricELog.i(tag, message, new j(this, metadata, value));
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void io(@NotNull String tag, @NotNull String message, double value, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        this.metricELog.io(tag, message, new k(this, metadata, value));
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void v(@NotNull String tag, @NotNull String message, double value, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        this.metricELog.v(tag, message, new l(this, metadata, value));
    }

    @Override // me.oriient.internal.services.elog.Metric
    public void w(@NotNull String tag, @NotNull String message, double value, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        this.metricELog.w(tag, message, new m(this, metadata, value));
    }
}
