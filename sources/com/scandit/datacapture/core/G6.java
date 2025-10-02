package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsResponse;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class G6 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ H6 f18320a;
    final /* synthetic */ HashMap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G6(H6 h6, HashMap map) {
        super(0);
        this.f18320a = h6;
        this.b = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws C1113r6 {
        InputStream inputStreamF;
        H6.a(this.f18320a, D7.b);
        int iC = ((C4) this.f18320a.c).c();
        try {
            if (200 > iC || iC >= 300) {
                H6.a(this.f18320a, E7.b);
                inputStreamF = ((C4) this.f18320a.c).f();
            } else {
                H6.a(this.f18320a, F7.b);
                inputStreamF = ((C4) this.f18320a.c).g();
            }
            try {
                byte[] bArrB = ByteStreamsKt.b(inputStreamF);
                inputStreamF.close();
                H6.a(this.f18320a, new K7(new NativeHttpsResponse(iC, this.b, bArrB)));
            } finally {
            }
        } catch (Throwable th) {
            this.f18320a.a(th);
        }
        return Unit.f24250a;
    }
}
