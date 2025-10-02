package com.scandit.datacapture.core;

import android.os.Handler;
import android.os.Looper;
import com.scandit.datacapture.core.internal.module.ui.NativeHintPresenter;
import com.scandit.datacapture.core.internal.module.ui.NativeHintStyle;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.e3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0993e3 extends NativeHintPresenter {

    /* renamed from: a, reason: collision with root package name */
    private final X2 f18488a;
    private final Handler b;
    private final WeakReference c;
    private final CopyOnWriteArrayList d;
    private EnumC0975c3 e;

    public /* synthetic */ C0993e3(I1 i1, J1 j1) {
        this(i1, j1, new Handler(Looper.getMainLooper()));
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenter
    public final void hideHint() {
        this.d.add(Y2.f18397a);
        a();
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenter
    public final void showHint(String hint, NativeHintStyle style) {
        Intrinsics.h(hint, "hint");
        Intrinsics.h(style, "style");
        this.d.add(new Z2(hint, style));
        a();
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenter
    public final void updateHint(NativeHintStyle style) {
        Intrinsics.h(style, "style");
        this.d.add(new C0957a3(style));
        a();
    }

    private final synchronized void a() {
        try {
            X2 x2 = this.f18488a;
            EnumC0975c3 state = this.e;
            CopyOnWriteArrayList operations = this.d;
            ((J1) x2).getClass();
            Intrinsics.h(state, "state");
            Intrinsics.h(operations, "operations");
            if (state == EnumC0975c3.IDLE && !operations.isEmpty()) {
                AbstractC0966b3 abstractC0966b3 = (AbstractC0966b3) CollectionsKt.h0(this.d);
                this.e = EnumC0975c3.EXECUTING;
                if (abstractC0966b3 instanceof Z2) {
                    a((Z2) abstractC0966b3);
                } else if (abstractC0966b3 instanceof Y2) {
                    c();
                } else if (abstractC0966b3 instanceof C0957a3) {
                    a((C0957a3) abstractC0966b3);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void b() {
        try {
            X2 x2 = this.f18488a;
            EnumC0975c3 state = this.e;
            CopyOnWriteArrayList operations = this.d;
            ((J1) x2).getClass();
            Intrinsics.h(state, "state");
            Intrinsics.h(operations, "operations");
            if (state != EnumC0975c3.EXECUTING || operations.isEmpty()) {
                this.e = EnumC0975c3.IDLE;
            } else {
                AbstractC0966b3 abstractC0966b3 = (AbstractC0966b3) CollectionsKt.h0(this.d);
                if (abstractC0966b3 instanceof Z2) {
                    a((Z2) abstractC0966b3);
                } else if (abstractC0966b3 instanceof Y2) {
                    c();
                } else if (abstractC0966b3 instanceof C0957a3) {
                    a((C0957a3) abstractC0966b3);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void c() {
        this.b.post(new com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.f(this, 5));
    }

    public C0993e3(I1 hintHolder, J1 operationsHandler, Handler handler) {
        Intrinsics.h(hintHolder, "hintHolder");
        Intrinsics.h(operationsHandler, "operationsHandler");
        Intrinsics.h(handler, "handler");
        this.f18488a = operationsHandler;
        this.b = handler;
        this.c = new WeakReference(hintHolder);
        this.d = new CopyOnWriteArrayList();
        this.e = EnumC0975c3.IDLE;
    }

    private final void a(Z2 z2) {
        this.b.post(new com.auth0.android.request.internal.a(4, this, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0993e3 this$0) {
        Intrinsics.h(this$0, "this$0");
        V2 v2 = (V2) this$0.c.get();
        if (v2 != null) {
            ((I1) v2).b().post(new com.auth0.android.request.internal.a(6, v2, this$0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0993e3 this$0, Z2 operation) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(operation, "$operation");
        V2 v2 = (V2) this$0.c.get();
        if (v2 != null) {
            ((I1) v2).b().post(new t8(2, v2, operation, this$0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(V2 holder, Z2 operation, C0993e3 this$0) {
        Intrinsics.h(holder, "$holder");
        Intrinsics.h(operation, "$operation");
        Intrinsics.h(this$0, "this$0");
        String text = operation.a();
        NativeHintStyle style = operation.b();
        I1 i1 = (I1) holder;
        Intrinsics.h(text, "text");
        Intrinsics.h(style, "style");
        i1.b().setText(text);
        i1.a(style);
        i1.c();
        this$0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(V2 holder, C0993e3 this$0) {
        Intrinsics.h(holder, "$holder");
        Intrinsics.h(this$0, "this$0");
        ((I1) holder).a(new C0984d3(this$0));
    }

    private final void a(C0957a3 c0957a3) {
        this.b.post(new com.auth0.android.request.internal.a(5, this, c0957a3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0993e3 this$0, C0957a3 operation) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(operation, "$operation");
        V2 v2 = (V2) this$0.c.get();
        if (v2 != null) {
            ((I1) v2).b().post(new t8(3, v2, operation, this$0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(V2 holder, C0957a3 operation, C0993e3 this$0) {
        Intrinsics.h(holder, "$holder");
        Intrinsics.h(operation, "$operation");
        Intrinsics.h(this$0, "this$0");
        ((I1) holder).a(operation.a());
        this$0.b();
    }
}
