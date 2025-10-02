package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1312j extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1312j f25215a = new C1312j();

    public C1312j() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String fileName = (String) obj;
        Intrinsics.h(fileName, "fileName");
        return Boolean.valueOf(StringsKt.o(fileName, "mapGrid", false));
    }
}
