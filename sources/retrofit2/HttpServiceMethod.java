package retrofit2;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;

/* loaded from: classes2.dex */
abstract class HttpServiceMethod<ResponseT, ReturnT> extends ServiceMethod<ReturnT> {

    /* renamed from: a, reason: collision with root package name */
    public final RequestFactory f26978a;
    public final Call.Factory b;
    public final Converter c;

    /* loaded from: classes8.dex */
    public static final class CallAdapted<ResponseT, ReturnT> extends HttpServiceMethod<ResponseT, ReturnT> {
        public final CallAdapter d;

        public CallAdapted(RequestFactory requestFactory, Call.Factory factory, Converter converter, CallAdapter callAdapter) {
            super(requestFactory, factory, converter);
            this.d = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        public final Object c(Call call, Object[] objArr) {
            return this.d.b(call);
        }
    }

    public static final class SuspendForBody<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        public final CallAdapter d;
        public final boolean e;

        public SuspendForBody(RequestFactory requestFactory, Call.Factory factory, Converter converter, CallAdapter callAdapter, boolean z) {
            super(requestFactory, factory, converter);
            this.d = callAdapter;
            this.e = z;
        }

        @Override // retrofit2.HttpServiceMethod
        public final Object c(Call call, Object[] objArr) {
            Call call2 = (Call) this.d.b(call);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                if (!this.e) {
                    return KotlinExtensions.a(call2, continuation);
                }
                Intrinsics.f(call2, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
                return KotlinExtensions.b(call2, continuation);
            } catch (LinkageError e) {
                throw e;
            } catch (ThreadDeath e2) {
                throw e2;
            } catch (VirtualMachineError e3) {
                throw e3;
            } catch (Throwable th) {
                KotlinExtensions.c(th, continuation);
                return CoroutineSingletons.d;
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class SuspendForResponse<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        public final CallAdapter d;

        public SuspendForResponse(RequestFactory requestFactory, Call.Factory factory, Converter converter, CallAdapter callAdapter) {
            super(requestFactory, factory, converter);
            this.d = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        public final Object c(Call call, Object[] objArr) {
            final Call call2 = (Call) this.d.b(call);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
                cancellableContinuationImpl.o();
                cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        call2.cancel();
                        return Unit.f24250a;
                    }
                });
                call2.Z(new Callback<Object>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
                    @Override // retrofit2.Callback
                    public final void a(Call call3, Throwable th) {
                        cancellableContinuationImpl.resumeWith(ResultKt.a(th));
                    }

                    @Override // retrofit2.Callback
                    public final void c(Call call3, Response response) {
                        cancellableContinuationImpl.resumeWith(response);
                    }
                });
                Object objN = cancellableContinuationImpl.n();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                return objN;
            } catch (Exception e) {
                KotlinExtensions.c(e, continuation);
                return CoroutineSingletons.d;
            }
        }
    }

    public HttpServiceMethod(RequestFactory requestFactory, Call.Factory factory, Converter converter) {
        this.f26978a = requestFactory;
        this.b = factory;
        this.c = converter;
    }

    @Override // retrofit2.ServiceMethod
    public final Object a(Object[] objArr, Object obj) {
        return c(new OkHttpCall(this.f26978a, obj, objArr, this.b, this.c), objArr);
    }

    public abstract Object c(Call call, Object[] objArr);
}
