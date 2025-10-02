package retrofit2;

import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.CallAdapter;

@TargetApi
@IgnoreJRERequirement
/* loaded from: classes2.dex */
final class CompletableFutureCallAdapterFactory extends CallAdapter.Factory {

    @IgnoreJRERequirement
    /* loaded from: classes8.dex */
    public static final class BodyCallAdapter<R> implements CallAdapter<R, CompletableFuture<R>> {

        /* renamed from: a, reason: collision with root package name */
        public final Type f26973a;

        @IgnoreJRERequirement
        public class BodyCallback implements Callback<R> {
            public final CompletableFuture d;

            public BodyCallback(CompletableFuture completableFuture) {
                this.d = completableFuture;
            }

            @Override // retrofit2.Callback
            public final void a(Call call, Throwable th) {
                this.d.completeExceptionally(th);
            }

            @Override // retrofit2.Callback
            public final void c(Call call, Response response) {
                boolean z = response.f27002a.s;
                CompletableFuture completableFuture = this.d;
                if (z) {
                    completableFuture.complete(response.b);
                } else {
                    completableFuture.completeExceptionally(new HttpException(response));
                }
            }
        }

        public BodyCallAdapter(Type type) {
            this.f26973a = type;
        }

        @Override // retrofit2.CallAdapter
        public final Type a() {
            return this.f26973a;
        }

        @Override // retrofit2.CallAdapter
        public final Object b(Call call) {
            CallCancelCompletableFuture callCancelCompletableFuture = new CallCancelCompletableFuture(call);
            ((OkHttpCall) call).Z(new BodyCallback(callCancelCompletableFuture));
            return callCancelCompletableFuture;
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes8.dex */
    public static final class CallCancelCompletableFuture<T> extends CompletableFuture<T> {
        public final Call d;

        public CallCancelCompletableFuture(Call call) {
            this.d = call;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (z) {
                this.d.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes8.dex */
    public static final class ResponseCallAdapter<R> implements CallAdapter<R, CompletableFuture<Response<R>>> {

        /* renamed from: a, reason: collision with root package name */
        public final Type f26974a;

        @IgnoreJRERequirement
        public class ResponseCallback implements Callback<R> {
            public final CompletableFuture d;

            public ResponseCallback(CompletableFuture completableFuture) {
                this.d = completableFuture;
            }

            @Override // retrofit2.Callback
            public final void a(Call call, Throwable th) {
                this.d.completeExceptionally(th);
            }

            @Override // retrofit2.Callback
            public final void c(Call call, Response response) {
                this.d.complete(response);
            }
        }

        public ResponseCallAdapter(Type type) {
            this.f26974a = type;
        }

        @Override // retrofit2.CallAdapter
        public final Type a() {
            return this.f26974a;
        }

        @Override // retrofit2.CallAdapter
        public final Object b(Call call) {
            CallCancelCompletableFuture callCancelCompletableFuture = new CallCancelCompletableFuture(call);
            ((OkHttpCall) call).Z(new ResponseCallback(callCancelCompletableFuture));
            return callCancelCompletableFuture;
        }
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter a(Type type, Annotation[] annotationArr) {
        if (Utils.e(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeD = Utils.d(0, (ParameterizedType) type);
        if (Utils.e(typeD) != Response.class) {
            return new BodyCallAdapter(typeD);
        }
        if (typeD instanceof ParameterizedType) {
            return new ResponseCallAdapter(Utils.d(0, (ParameterizedType) typeD));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
