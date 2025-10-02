package com.scandit.datacapture.core;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.e6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0996e6 implements A7 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1014g6 f18490a;

    public C0996e6(C1014g6 c1014g6) {
        this.f18490a = c1014g6;
    }

    @Override // com.scandit.datacapture.core.A7
    public final void a(InterfaceC1186z7 event) {
        Intrinsics.h(event, "event");
        Iterator it = this.f18490a.f.iterator();
        while (it.hasNext()) {
            try {
                ((A7) it.next()).a(event);
            } catch (Throwable unused) {
            }
        }
    }
}
