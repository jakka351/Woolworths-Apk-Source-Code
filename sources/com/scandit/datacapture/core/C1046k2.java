package com.scandit.datacapture.core;

import com.scandit.datacapture.core.source.TorchListener;
import com.scandit.datacapture.core.source.TorchState;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.k2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1046k2 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1055l2 f18790a;
    final /* synthetic */ TorchState b;
    final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1046k2(C1055l2 c1055l2, TorchState torchState, Function0 function0) {
        super(1);
        this.f18790a = c1055l2;
        this.b = torchState;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f18790a.c = this.b;
            Iterator it = this.f18790a.a().iterator();
            while (it.hasNext()) {
                ((TorchListener) it.next()).onTorchStateChanged(this.b);
            }
            Iterator it2 = this.f18790a.c().iterator();
            while (it2.hasNext()) {
                TorchListener torchListener = (TorchListener) ((WeakReference) it2.next()).get();
                if (torchListener != null) {
                    torchListener.onTorchStateChanged(this.b);
                }
            }
        }
        this.c.invoke();
        return Unit.f24250a;
    }
}
