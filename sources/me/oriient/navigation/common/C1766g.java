package me.oriient.navigation.common;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.navigation.ondevice.NdkBridgeImpl;

/* renamed from: me.oriient.navigation.common.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1766g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1766g f26241a = new C1766g();

    public C1766g() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new NdkBridgeImpl();
    }
}
