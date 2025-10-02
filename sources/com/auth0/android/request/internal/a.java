package com.auth0.android.request.internal;

import com.auth0.android.Auth0Exception;
import com.auth0.android.callback.Callback;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyHandler;
import com.scandit.datacapture.core.AbstractC1041j6;
import com.scandit.datacapture.core.C0957a3;
import com.scandit.datacapture.core.C0993e3;
import com.scandit.datacapture.core.C1014g6;
import com.scandit.datacapture.core.V2;
import com.scandit.datacapture.core.Z2;
import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.DataCaptureView$contextStatusView$1;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.android.HandlerContext;
import me.oriient.ipssdk.ips.IPSCalibrationDialog;
import me.oriient.ui.contentview.ContentView;
import me.oriient.ui.contentview.models.PixelMatrix;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                Callback callback = (Callback) obj2;
                Auth0Exception uError = (Auth0Exception) obj;
                Intrinsics.h(callback, "$callback");
                Intrinsics.h(uError, "$uError");
                callback.a(uError);
                break;
            case 1:
                ((EventHandler) ((Map.Entry) obj2).getKey()).a((Event) obj);
                break;
            case 2:
                ((AppStartTrace) obj2).e.c((TraceMetric) ((TraceMetric.Builder) obj).m(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                break;
            case 3:
                ModuleReadyHandler.m268deliverModule$lambda0((ModuleReadyHandler) obj2, (ModuleInterface) obj);
                break;
            case 4:
                C0993e3.a((C0993e3) obj2, (Z2) obj);
                break;
            case 5:
                C0993e3.a((C0993e3) obj2, (C0957a3) obj);
                break;
            case 6:
                C0993e3.a((V2) obj2, (C0993e3) obj);
                break;
            case 7:
                C1014g6.a((C1014g6) obj2, (AbstractC1041j6) obj);
                break;
            case 8:
                DataCaptureView$contextStatusView$1.a((ContextStatus) obj2, (DataCaptureView) obj);
                break;
            case 9:
                int i2 = HandlerContext.j;
                ((CancellableContinuationImpl) obj2).D((HandlerContext) obj, Unit.f24250a);
                break;
            case 10:
                ((IPSCalibrationDialog) obj2).lambda$subscribeToUiComponents$18((Boolean) obj);
                break;
            case 11:
                ((IPSCalibrationDialog) obj2).lambda$subscribeToUiComponents$16((String) obj);
                break;
            default:
                ContentView.centerOnPixels_E0VtUJE$lambda$37((ContentView) obj2, (PixelMatrix) obj);
                break;
        }
    }
}
