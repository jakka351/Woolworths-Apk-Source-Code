package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.sensorsManager.SystemSensorManagerImpl;

/* loaded from: classes2.dex */
public final class D extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final D f25718a = new D();

    public D() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SystemSensorManagerImpl();
    }
}
