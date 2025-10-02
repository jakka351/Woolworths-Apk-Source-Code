package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.positioningengine.ondevice.util.locationReporter.LocationReporterFactoryImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.e4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1641e4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1641e4 f26068a = new C1641e4();

    public C1641e4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new LocationReporterFactoryImpl();
    }
}
