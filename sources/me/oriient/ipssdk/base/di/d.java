package me.oriient.ipssdk.base.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManagerImpl;

/* loaded from: classes2.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f25687a = new d();

    public d() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new RemoteConfigManagerImpl();
    }
}
