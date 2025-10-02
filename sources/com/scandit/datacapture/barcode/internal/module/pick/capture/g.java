package com.scandit.datacapture.barcode.internal.module.pick.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodePickInternal f17756a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BarcodePickInternal barcodePickInternal) {
        super(0);
        this.f17756a = barcodePickInternal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodePickPublicSession publicSession = this.f17756a.a().getSession().getPublicSession();
        Intrinsics.g(publicSession, "_impl().session.publicSession");
        return publicSession;
    }
}
