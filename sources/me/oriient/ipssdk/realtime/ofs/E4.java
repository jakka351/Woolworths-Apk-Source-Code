package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.services.rest.MapsRestServiceImpl;

/* loaded from: classes8.dex */
public final class E4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final E4 f25934a = new E4();

    public E4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new MapsRestServiceImpl();
    }
}
