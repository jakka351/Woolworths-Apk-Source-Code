package coil.util;

import com.dynatrace.android.callback.OkCallback;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012#\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b¨\u0006\t"}, d2 = {"Lcoil/util/ContinuationCallback;", "Lokhttp3/Callback;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ContinuationCallback implements Callback, Function1<Throwable, Unit> {
    public final Call d;
    public final CancellableContinuationImpl e;

    public ContinuationCallback(Call call, CancellableContinuationImpl cancellableContinuationImpl) {
        this.d = call;
        this.e = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        try {
            this.d.cancel();
        } catch (Throwable unused) {
        }
        return Unit.f24250a;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        OkCallback.b(call, iOException);
        try {
            if (call.getS()) {
                return;
            }
            this.e.resumeWith(ResultKt.a(iOException));
        } catch (Throwable th) {
            String str = OkCallback.f14143a;
            throw th;
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        OkCallback.c(call, response);
        try {
            this.e.resumeWith(response);
        } catch (Throwable th) {
            String str = OkCallback.f14143a;
            throw th;
        }
    }
}
