package retrofit2;

import io.jsonwebtoken.JwtParser;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Request;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"retrofit"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class KotlinExtensions {
    public static final Object a(final Call call, Continuation continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$2$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                call.cancel();
                return Unit.f24250a;
            }
        });
        call.Z(new Callback<Object>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public final void a(Call call2, Throwable th) {
                cancellableContinuationImpl.resumeWith(ResultKt.a(th));
            }

            @Override // retrofit2.Callback
            public final void c(Call call2, Response response) {
                boolean z = response.f27002a.s;
                CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                if (!z) {
                    cancellableContinuationImpl2.resumeWith(ResultKt.a(new HttpException(response)));
                    return;
                }
                Object obj = response.b;
                if (obj != null) {
                    cancellableContinuationImpl2.resumeWith(obj);
                    return;
                }
                Request requestX = call2.x();
                requestX.getClass();
                KClass kClassE = JvmClassMappingKt.e(Invocation.class);
                Object objCast = JvmClassMappingKt.b(kClassE).cast(requestX.e.get(kClassE));
                Intrinsics.e(objCast);
                Invocation invocation = (Invocation) objCast;
                cancellableContinuationImpl2.resumeWith(ResultKt.a(new KotlinNullPointerException("Response from " + invocation.f26979a.getName() + JwtParser.SEPARATOR_CHAR + invocation.c.getName() + " was null but response body type was declared as non-null")));
            }
        });
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }

    public static final Object b(final Call call, Continuation continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$4$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                call.cancel();
                return Unit.f24250a;
            }
        });
        call.Z(new Callback<Object>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public final void a(Call call2, Throwable th) {
                cancellableContinuationImpl.resumeWith(ResultKt.a(th));
            }

            @Override // retrofit2.Callback
            public final void c(Call call2, Response response) {
                boolean z = response.f27002a.s;
                CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                if (z) {
                    cancellableContinuationImpl2.resumeWith(response.b);
                } else {
                    cancellableContinuationImpl2.resumeWith(ResultKt.a(new HttpException(response)));
                }
            }
        });
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final java.lang.Throwable r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r0.q
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            kotlin.ResultKt.b(r5)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L34:
            kotlin.ResultKt.b(r5)
            r0.q = r2
            kotlinx.coroutines.scheduling.DefaultScheduler r5 = kotlinx.coroutines.Dispatchers.f24691a
            kotlin.coroutines.CoroutineContext r1 = r0.getF()
            retrofit2.KotlinExtensions$suspendAndThrow$2$1 r2 = new retrofit2.KotlinExtensions$suspendAndThrow$2$1
            r2.<init>()
            r5.k(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.c(java.lang.Throwable, kotlin.coroutines.Continuation):void");
    }
}
