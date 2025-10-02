package me.oriient.navigation.ondevice;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.OriientError;

/* renamed from: me.oriient.navigation.ondevice.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1790f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1790f f26285a = new C1790f();

    public C1790f() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OriientError it = (OriientError) obj;
        Intrinsics.h(it, "it");
        return me.oriient.navigation.common.util.a.a(it);
    }
}
