package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.OnDeviceEngineAutoStopDetectorImpl;

/* loaded from: classes8.dex */
public final class A4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final A4 f25911a = new A4();

    public A4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new OnDeviceEngineAutoStopDetectorImpl();
    }
}
