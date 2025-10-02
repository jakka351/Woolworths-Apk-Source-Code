package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;
import retrofit2.CallAdapter;

/* loaded from: classes2.dex */
final class DefaultCallAdapterFactory extends CallAdapter.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f26975a;

    /* loaded from: classes8.dex */
    public static final class ExecutorCallbackCall<T> implements Call<T> {
        public final Executor d;
        public final Call e;

        /* renamed from: retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1, reason: invalid class name */
        class AnonymousClass1 implements Callback<Object> {
            public final /* synthetic */ Callback d;

            public AnonymousClass1(Callback callback) {
                this.d = callback;
            }

            @Override // retrofit2.Callback
            public final void a(Call call, Throwable th) {
                ExecutorCallbackCall.this.d.execute(new a(this, this.d, th, 1));
            }

            @Override // retrofit2.Callback
            public final void c(Call call, Response response) {
                ExecutorCallbackCall.this.d.execute(new a(this, this.d, response, 0));
            }
        }

        public ExecutorCallbackCall(Executor executor, Call call) {
            this.d = executor;
            this.e = call;
        }

        @Override // retrofit2.Call
        public final void Z(Callback callback) {
            this.e.Z(new AnonymousClass1(callback));
        }

        @Override // retrofit2.Call
        public final void cancel() {
            this.e.cancel();
        }

        @Override // retrofit2.Call
        public final Response execute() {
            return this.e.execute();
        }

        @Override // retrofit2.Call
        public final boolean isCanceled() {
            return this.e.isCanceled();
        }

        @Override // retrofit2.Call
        public final Request x() {
            return this.e.x();
        }

        @Override // retrofit2.Call
        public final Call clone() {
            return new ExecutorCallbackCall(this.d, this.e.clone());
        }
    }

    public DefaultCallAdapterFactory(Executor executor) {
        this.f26975a = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter a(Type type, Annotation[] annotationArr) {
        if (Utils.e(type) != Call.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        final Type typeD = Utils.d(0, (ParameterizedType) type);
        final Executor executor = Utils.h(annotationArr, SkipCallbackExecutor.class) ? null : this.f26975a;
        return new CallAdapter<Object, Call<?>>() { // from class: retrofit2.DefaultCallAdapterFactory.1
            @Override // retrofit2.CallAdapter
            public final Type a() {
                return typeD;
            }

            @Override // retrofit2.CallAdapter
            public final Object b(Call call) {
                Executor executor2 = executor;
                return executor2 == null ? call : new ExecutorCallbackCall(executor2, call);
            }
        };
    }
}
