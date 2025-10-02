package me.oriient.internal.services.dataManager.obstacles;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* renamed from: me.oriient.internal.services.dataManager.obstacles.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1337h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1337h f25250a = new C1337h();

    public C1337h() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String fileName = (String) obj;
        Intrinsics.h(fileName, "fileName");
        return Boolean.valueOf(StringsKt.o(fileName, "obstacles", false));
    }
}
