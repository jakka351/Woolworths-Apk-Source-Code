package com.scandit.datacapture.barcode;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.x8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0917x8 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8 f18262a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0917x8(C8 c8) {
        super(1);
        this.f18262a = c8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.h(it, "it");
        return C8.b(this.f18262a, it);
    }
}
