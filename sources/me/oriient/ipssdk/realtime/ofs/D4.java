package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl;

/* loaded from: classes8.dex */
public final class D4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final D4 f25928a = new D4();

    public D4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ContentRestServiceImpl();
    }
}
