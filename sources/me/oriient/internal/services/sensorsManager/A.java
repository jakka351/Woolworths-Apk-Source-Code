package me.oriient.internal.services.sensorsManager;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataReading;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class A implements InterfaceC1510y {

    @NotNull
    private static final C1511z Companion = new C1511z();

    /* renamed from: a, reason: collision with root package name */
    public final Logger f25551a;
    public final TimeProvider b;
    public final f0 c;
    public SensorsDataReading d;

    public A(Logger logger, TimeProvider timeProvider, f0 delegate) {
        Intrinsics.h(logger, "logger");
        Intrinsics.h(timeProvider, "timeProvider");
        Intrinsics.h(delegate, "delegate");
        this.f25551a = logger;
        this.b = timeProvider;
        this.c = delegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02dd  */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
    @Override // me.oriient.internal.services.sensorsManager.InterfaceC1510y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a(me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample r29) {
        /*
            Method dump skipped, instructions count: 1194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.sensorsManager.A.a(me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample):java.util.List");
    }
}
