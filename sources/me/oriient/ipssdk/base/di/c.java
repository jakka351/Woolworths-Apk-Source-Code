package me.oriient.ipssdk.base.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigRestImpl;

/* loaded from: classes2.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f25686a = new c();

    public c() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new RemoteConfigRestImpl();
    }
}
