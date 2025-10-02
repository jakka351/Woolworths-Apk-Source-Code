package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.EngineSessionDataProviderImpl;

/* loaded from: classes8.dex */
public final class w4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w4 f26169a = new w4();

    public w4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new EngineSessionDataProviderImpl();
    }
}
