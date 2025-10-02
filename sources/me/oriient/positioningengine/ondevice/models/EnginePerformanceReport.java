package me.oriient.positioningengine.ondevice.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005¨\u0006\u0014"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/EnginePerformanceReport;", "", "averageLagTimeAfterFirstLock", "", "getAverageLagTimeAfterFirstLock", "()J", "averageLagTimeBeforeFirstLock", "getAverageLagTimeBeforeFirstLock", "averageProcessingTimeAfterFirstLock", "getAverageProcessingTimeAfterFirstLock", "averageProcessingTimeBeforeFirstLock", "getAverageProcessingTimeBeforeFirstLock", "maxLagTimeAfterFirstLock", "getMaxLagTimeAfterFirstLock", "maxLagTimeBeforeFirstLock", "getMaxLagTimeBeforeFirstLock", "maxProcessingTimeAfterFirstLock", "getMaxProcessingTimeAfterFirstLock", "maxProcessingTimeBeforeFirstLock", "getMaxProcessingTimeBeforeFirstLock", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface EnginePerformanceReport {
    long getAverageLagTimeAfterFirstLock();

    long getAverageLagTimeBeforeFirstLock();

    long getAverageProcessingTimeAfterFirstLock();

    long getAverageProcessingTimeBeforeFirstLock();

    long getMaxLagTimeAfterFirstLock();

    long getMaxLagTimeBeforeFirstLock();

    long getMaxProcessingTimeAfterFirstLock();

    long getMaxProcessingTimeBeforeFirstLock();
}
