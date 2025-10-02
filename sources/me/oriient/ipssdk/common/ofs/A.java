package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.android.HandlerFactoryImpl;

/* loaded from: classes2.dex */
public final class A extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final A f25715a = new A();

    public A() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new HandlerFactoryImpl();
    }
}
