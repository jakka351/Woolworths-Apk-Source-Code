package me.oriient.internal.services.remoteLog.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.android.TimeProviderImpl;

/* loaded from: classes7.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f25532a = new f();

    public f() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new TimeProviderImpl();
    }
}
