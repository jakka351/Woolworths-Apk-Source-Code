package me.oriient.positioningengine.ondevice;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScopeKt;

/* renamed from: me.oriient.positioningengine.ondevice.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1823j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f26437a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823j(I i) {
        super(0);
        this.f26437a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoroutineScopeKt.a(this.f26437a.c);
    }
}
