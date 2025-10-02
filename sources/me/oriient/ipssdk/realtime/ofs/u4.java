package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationResolverFactory;

/* loaded from: classes8.dex */
public final class u4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u4 f26157a = new u4();

    public u4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new LocalProximityLocationResolverFactory();
    }
}
