package me.oriient.internal.services.remoteLog.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.coroutines.DefaultCoroutineContextProvider;

/* loaded from: classes7.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25527a = new a();

    public a() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DefaultCoroutineContextProvider();
    }
}
