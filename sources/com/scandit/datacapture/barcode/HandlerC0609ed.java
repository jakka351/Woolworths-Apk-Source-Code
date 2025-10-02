package com.scandit.datacapture.barcode;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.spark.feedback.SparkScanBarcodeFeedback;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.ed, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class HandlerC0609ed extends Handler implements InterfaceC0593dd {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17631a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0609ed(SparkScanViewPresenter parent) {
        super(Looper.getMainLooper());
        Intrinsics.h(parent, "parent");
        this.f17631a = new WeakReference(parent);
    }

    public final void a(long j) {
        Message messageObtainMessage = obtainMessage(2, Boolean.TRUE);
        Intrinsics.g(messageObtainMessage, "obtainMessage(SWITCH_TO_IDLE, true)");
        if (j < 0) {
            return;
        }
        sendMessageDelayed(messageObtainMessage, j);
    }

    public final void b(long j) {
        Message messageObtainMessage = obtainMessage(1, Boolean.TRUE);
        Intrinsics.g(messageObtainMessage, "obtainMessage(SWITCH_TO_INACTIVE, true)");
        if (j < 0) {
            return;
        }
        sendMessageDelayed(messageObtainMessage, j);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.h(msg, "msg");
        SparkScanViewPresenter sparkScanViewPresenter = (SparkScanViewPresenter) this.f17631a.get();
        if (sparkScanViewPresenter == null) {
            return;
        }
        switch (msg.what) {
            case 1:
                Object obj = msg.obj;
                sparkScanViewPresenter.i(Intrinsics.c(obj instanceof Boolean ? (Boolean) obj : null, Boolean.TRUE));
                break;
            case 2:
                Object obj2 = msg.obj;
                sparkScanViewPresenter.h(Intrinsics.c(obj2 instanceof Boolean ? (Boolean) obj2 : null, Boolean.TRUE));
                break;
            case 4:
                sparkScanViewPresenter.T();
                break;
            case 5:
                Object obj3 = msg.obj;
                Intrinsics.f(obj3, "null cannot be cast to non-null type com.scandit.datacapture.barcode.spark.feedback.SparkScanBarcodeFeedback.Error");
                sparkScanViewPresenter.a((SparkScanBarcodeFeedback.Error) obj3);
                break;
            case 6:
                Object obj4 = msg.obj;
                Intrinsics.f(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                sparkScanViewPresenter.f(((Boolean) obj4).booleanValue());
                break;
            case 7:
                Object obj5 = msg.obj;
                Intrinsics.f(obj5, "null cannot be cast to non-null type com.scandit.datacapture.barcode.spark.feedback.SparkScanBarcodeFeedback.Success");
                sparkScanViewPresenter.a((SparkScanBarcodeFeedback.Success) obj5);
                break;
            case 9:
                sparkScanViewPresenter.a();
                break;
            case 10:
                sparkScanViewPresenter.h();
                break;
            case 11:
                sparkScanViewPresenter.s();
                break;
            case 12:
                sparkScanViewPresenter.p();
                break;
            case 13:
                sparkScanViewPresenter.i();
                break;
            case 14:
                sparkScanViewPresenter.e();
                break;
            case 15:
                sparkScanViewPresenter.f();
                break;
            case 16:
                sparkScanViewPresenter.r();
                break;
            case 17:
                sparkScanViewPresenter.j();
                break;
            case 18:
                sparkScanViewPresenter.q();
                break;
            case 19:
                SparkScanViewPresenter.a(sparkScanViewPresenter, false, false, 6);
                break;
            case 20:
                Object obj6 = msg.obj;
                Intrinsics.f(obj6, "null cannot be cast to non-null type kotlin.String");
                sparkScanViewPresenter.a((String) obj6);
                break;
            case 21:
                sparkScanViewPresenter.l();
                break;
            case 22:
                sparkScanViewPresenter.k();
                break;
            case 23:
                sparkScanViewPresenter.m();
                break;
            case 24:
                Object obj7 = msg.obj;
                Intrinsics.f(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                sparkScanViewPresenter.a(((Boolean) obj7).booleanValue());
                break;
            case 25:
                sparkScanViewPresenter.o();
                break;
            case 26:
                Object obj8 = msg.obj;
                Intrinsics.f(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                sparkScanViewPresenter.c(((Boolean) obj8).booleanValue());
                break;
            case 27:
                sparkScanViewPresenter.n();
                break;
            case 28:
                Object obj9 = msg.obj;
                Intrinsics.f(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                sparkScanViewPresenter.b(((Boolean) obj9).booleanValue());
                break;
            case 29:
                sparkScanViewPresenter.g();
                break;
        }
    }
}
