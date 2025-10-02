package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.coroutines.DefaultCoroutineContextProvider;

/* renamed from: me.oriient.ipssdk.common.ofs.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1567z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1567z f25773a = new C1567z();

    public C1567z() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DefaultCoroutineContextProvider();
    }
}
