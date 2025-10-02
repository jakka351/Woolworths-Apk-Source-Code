package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import com.dynatrace.android.callback.OkCallback;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012#\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\bB\u001b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\rH\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lme/oriient/internal/infra/rest/CallContinuationCallback;", "Lokhttp3/Callback;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "call", "Lokhttp3/Call;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "Lokhttp3/Response;", "(Lokhttp3/Call;Lkotlinx/coroutines/CancellableContinuation;)V", "TAG", "", "invoke", "onFailure", "e", "Ljava/io/IOException;", "onResponse", "response", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CallContinuationCallback implements Callback, Function1<Throwable, Unit> {

    @NotNull
    private final String TAG;

    @NotNull
    private final Call call;

    @NotNull
    private final CancellableContinuation<Response> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public CallContinuationCallback(@NotNull Call call, @NotNull CancellableContinuation<? super Response> continuation) {
        Intrinsics.h(call, "call");
        Intrinsics.h(continuation, "continuation");
        this.call = call;
        this.continuation = continuation;
        this.TAG = "CallContinuationCallbac";
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.f24250a;
    }

    @Override // okhttp3.Callback
    public void onFailure(@NotNull Call call, @NotNull IOException e) {
        OkCallback.b(call, e);
        try {
            Intrinsics.h(call, "call");
            Intrinsics.h(e, "e");
            if (call.getS()) {
                return;
            }
            this.continuation.resumeWith(ResultKt.a(e));
        } catch (Throwable th) {
            String str = OkCallback.f14143a;
            throw th;
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(@NotNull Call call, @NotNull Response response) {
        OkCallback.c(call, response);
        try {
            Intrinsics.h(call, "call");
            Intrinsics.h(response, "response");
            this.continuation.resumeWith(response);
        } catch (Throwable th) {
            String str = OkCallback.f14143a;
            throw th;
        }
    }

    public void invoke(@Nullable Throwable cause) {
        try {
            this.call.cancel();
        } catch (Throwable unused) {
        }
    }
}
