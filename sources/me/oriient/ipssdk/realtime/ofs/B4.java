package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.debugInfo.DebugInfoManagerImpl;

/* loaded from: classes8.dex */
public final class B4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final B4 f25917a = new B4();

    public B4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DebugInfoManagerImpl();
    }
}
