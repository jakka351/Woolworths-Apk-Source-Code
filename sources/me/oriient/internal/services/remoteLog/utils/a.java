package me.oriient.internal.services.remoteLog.utils;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.remoteLog.GlobalOptions;
import me.oriient.internal.services.remoteLog.InstanceOptions;
import me.oriient.internal.services.remoteLog.RemoteLogOptions;
import me.oriient.internal.services.remoteLog.SendingSchedule;

/* loaded from: classes7.dex */
public final class a implements RemoteLogOptions {

    /* renamed from: a, reason: collision with root package name */
    public final InstanceOptions f25543a;
    public final RemoteLogOptions b;

    public a(InstanceOptions instanceOptions, RemoteLogOptions globalOptions) {
        Intrinsics.h(instanceOptions, "instanceOptions");
        Intrinsics.h(globalOptions, "globalOptions");
        this.f25543a = instanceOptions;
        this.b = globalOptions;
    }

    public final GlobalOptions a() {
        GlobalOptions globalOptions = new GlobalOptions();
        globalOptions.setStoreSizeLimit(this.b.getStoreSizeLimit());
        globalOptions.setMessageSizeLimitBytes(getMessageSizeLimitBytes());
        globalOptions.setRetries(getRetries());
        globalOptions.setMaxBatchSize(getMaxBatchSize());
        globalOptions.setSendingSchedule(getSendingSchedule());
        globalOptions.setRequireCharger(getRequireCharger());
        globalOptions.setAllowMeteredNetworks(getAllowMeteredNetworks());
        return globalOptions;
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLogOptions
    public final boolean getAllowMeteredNetworks() {
        Boolean allowMeteredNetworks = this.f25543a.getAllowMeteredNetworks();
        return allowMeteredNetworks != null ? allowMeteredNetworks.booleanValue() : this.b.getAllowMeteredNetworks();
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLogOptions
    public final int getMaxBatchSize() {
        Integer maxBatchSize = this.f25543a.getMaxBatchSize();
        return maxBatchSize != null ? maxBatchSize.intValue() : this.b.getMaxBatchSize();
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLogOptions
    public final long getMessageSizeLimitBytes() {
        Long messageSizeLimitBytes = this.f25543a.getMessageSizeLimitBytes();
        return messageSizeLimitBytes != null ? messageSizeLimitBytes.longValue() : this.b.getMessageSizeLimitBytes();
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLogOptions
    public final boolean getRequireCharger() {
        Boolean requireCharger = this.f25543a.getRequireCharger();
        return requireCharger != null ? requireCharger.booleanValue() : this.b.getRequireCharger();
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLogOptions
    public final int getRetries() {
        Integer retries = this.f25543a.getRetries();
        return retries != null ? retries.intValue() : this.b.getRetries();
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLogOptions
    public final SendingSchedule getSendingSchedule() {
        SendingSchedule sendingSchedule = this.f25543a.getSendingSchedule();
        return sendingSchedule == null ? this.b.getSendingSchedule() : sendingSchedule;
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLogOptions
    public final int getStoreSizeLimit() {
        return this.b.getStoreSizeLimit();
    }
}
