package com.scandit.datacapture.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1025i implements InterfaceC1087o7 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f18531a;

    public C1025i(AtomicInteger generator) {
        Intrinsics.h(generator, "generator");
        this.f18531a = generator;
    }

    public final int a() {
        return this.f18531a.getAndIncrement();
    }

    public /* synthetic */ C1025i() {
        this(AbstractC1105q7.a());
    }
}
