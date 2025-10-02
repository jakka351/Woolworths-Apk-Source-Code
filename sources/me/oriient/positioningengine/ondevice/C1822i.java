package me.oriient.positioningengine.ondevice;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;

/* renamed from: me.oriient.positioningengine.ondevice.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1822i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1822i f26433a = new C1822i();

    public C1822i() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Job it = (Job) obj;
        Intrinsics.h(it, "it");
        return Boolean.valueOf(!it.isActive());
    }
}
