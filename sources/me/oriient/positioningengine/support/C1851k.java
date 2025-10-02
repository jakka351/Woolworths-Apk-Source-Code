package me.oriient.positioningengine.support;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.OriientError;

/* renamed from: me.oriient.positioningengine.support.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1851k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1851k f26559a = new C1851k();

    public C1851k() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OriientError it = (OriientError) obj;
        Intrinsics.h(it, "it");
        return me.oriient.positioningengine.common.util.b.a(it);
    }
}
