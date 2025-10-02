package com.dynatrace.android.agent.db;

import com.dynatrace.android.agent.comm.MonitoringDataPacket;

/* loaded from: classes.dex */
public class MonitoringDataEntity {

    /* renamed from: a, reason: collision with root package name */
    public final long f14116a;
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final MonitoringDataPacket f;
    public final boolean g;

    public MonitoringDataEntity(long j, long j2, int i, int i2, long j3, MonitoringDataPacket monitoringDataPacket, boolean z) {
        this.f14116a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = j3;
        this.f = monitoringDataPacket;
        this.g = z;
    }
}
