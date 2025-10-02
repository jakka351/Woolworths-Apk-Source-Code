package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.calibration.PeriodicAutomaticCalibratorImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.s3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1723s3 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1723s3 f26145a = new C1723s3();

    public C1723s3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new PeriodicAutomaticCalibratorImpl(new C1664i3());
    }
}
