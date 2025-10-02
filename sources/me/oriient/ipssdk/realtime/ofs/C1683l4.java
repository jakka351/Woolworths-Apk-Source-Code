package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.locationManager.SystemLocationManagerFactoryImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.l4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1683l4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1683l4 f26107a = new C1683l4();

    public C1683l4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SystemLocationManagerFactoryImpl();
    }
}
