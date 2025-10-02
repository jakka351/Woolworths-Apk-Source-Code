package me.oriient.internal.services.auth;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;

/* renamed from: me.oriient.internal.services.auth.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1210b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1210b f25024a = new C1210b();

    public C1210b() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (AuthManager) InternalDiKt.getDi().get(Reflection.f24268a.b(U.class));
    }
}
