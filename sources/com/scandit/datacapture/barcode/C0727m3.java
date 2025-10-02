package com.scandit.datacapture.barcode;

import android.content.Context;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.m3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0727m3 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f17846a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0727m3(Context context) {
        super(0);
        this.f17846a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new TorchSwitchControl(this.f17846a);
    }
}
