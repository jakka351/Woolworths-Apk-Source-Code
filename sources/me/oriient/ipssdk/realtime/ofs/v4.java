package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.wrappers.PositioningWrapperImpl;

/* loaded from: classes8.dex */
public final class v4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v4 f26163a = new v4();

    public v4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new PositioningWrapperImpl();
    }
}
