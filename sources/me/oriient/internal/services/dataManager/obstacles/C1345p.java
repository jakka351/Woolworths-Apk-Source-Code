package me.oriient.internal.services.dataManager.obstacles;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.ByteArrayExtensionsKt;

/* renamed from: me.oriient.internal.services.dataManager.obstacles.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1345p extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25258a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1345p(String str, String str2, String str3) {
        super(1);
        this.f25258a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte[] it = (byte[]) obj;
        Intrinsics.h(it, "it");
        return new w(this.f25258a, this.b, this.c, (Obstacles) ByteArrayExtensionsKt.toSerializableObject(it));
    }
}
