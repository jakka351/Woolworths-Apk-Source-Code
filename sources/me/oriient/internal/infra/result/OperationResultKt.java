package me.oriient.internal.infra.result;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.result.OperationResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a8\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aV\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0004\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\n0\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001ag\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0004\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00042\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000eH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aV\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0004\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\n0\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\f\u001ag\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0004\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00042\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000eH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011\u001a8\u0010\u0016\u001a\u0004\u0018\u0001H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0006\u001a`\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00190\u0004\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003\"\b\b\u0002\u0010\u0019*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00190\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\f\u001a`\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u00010\u0004\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003\"\b\b\u0002\u0010\u0019*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00190\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\f\u001a~\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H\u001f0\u0004\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003\"\b\b\u0002\u0010\u001e*\u00020\u0003\"\b\b\u0003\u0010\u001f*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u001e0\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u001f0\tH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"errorOrNull", "F", "S", "", "Lme/oriient/internal/infra/result/OperationResult;", "errorOrNull-DHWKYCI", "(Ljava/lang/Object;)Ljava/lang/Object;", "onFailure", UrlHandler.ACTION, "Lkotlin/Function1;", "", "onFailure-1gcwg9M", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "onFailureSuspend", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "onFailureSuspend-cztIqUw", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSuccess", "onSuccess-1gcwg9M", "onSuccessSuspend", "onSuccessSuspend-cztIqUw", "successValueOrNull", "successValueOrNull-DHWKYCI", "transformFailure", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "transformFailure-1gcwg9M", "transformSuccess", "transformSuccess-1gcwg9M", "transformValues", "TS", "TF", "transformValues-cztIqUw", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class OperationResultKt {
    @Keep
    @Nullable
    /* renamed from: errorOrNull-DHWKYCI, reason: not valid java name */
    public static final <S, F> F m351errorOrNullDHWKYCI(@NotNull Object errorOrNull) {
        Intrinsics.h(errorOrNull, "$this$errorOrNull");
        if (!(errorOrNull instanceof a)) {
            return null;
        }
        F f = (F) ((a) errorOrNull).f24981a;
        Intrinsics.f(f, "null cannot be cast to non-null type F of me.oriient.internal.infra.result.OperationResultKt.errorOrNull");
        return f;
    }

    @Keep
    @NotNull
    /* renamed from: onFailure-1gcwg9M, reason: not valid java name */
    public static final <S, F> Object m352onFailure1gcwg9M(@NotNull Object onFailure, @NotNull Function1<? super F, Unit> action) {
        Intrinsics.h(onFailure, "$this$onFailure");
        Intrinsics.h(action, "action");
        Object objM351errorOrNullDHWKYCI = m351errorOrNullDHWKYCI(onFailure);
        if (objM351errorOrNullDHWKYCI != null) {
            action.invoke(objM351errorOrNullDHWKYCI);
        }
        return onFailure;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.Keep
    @org.jetbrains.annotations.Nullable
    /* renamed from: onFailureSuspend-cztIqUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S, F> java.lang.Object m353onFailureSuspendcztIqUw(@org.jetbrains.annotations.NotNull java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super F, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.result.OperationResult<S, F>> r6) {
        /*
            boolean r0 = r6 instanceof me.oriient.internal.infra.result.b
            if (r0 == 0) goto L13
            r0 = r6
            me.oriient.internal.infra.result.b r0 = (me.oriient.internal.infra.result.b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            me.oriient.internal.infra.result.b r0 = new me.oriient.internal.infra.result.b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r4 = r0.f24982a
            kotlin.ResultKt.b(r6)
            return r4
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r6)
            java.lang.Object r6 = m351errorOrNullDHWKYCI(r4)
            if (r6 == 0) goto L45
            r0.f24982a = r4
            r0.c = r3
            java.lang.Object r5 = r5.invoke(r6, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.infra.result.OperationResultKt.m353onFailureSuspendcztIqUw(java.lang.Object, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Keep
    @NotNull
    /* renamed from: onSuccess-1gcwg9M, reason: not valid java name */
    public static final <S, F> Object m354onSuccess1gcwg9M(@NotNull Object onSuccess, @NotNull Function1<? super S, Unit> action) {
        Intrinsics.h(onSuccess, "$this$onSuccess");
        Intrinsics.h(action, "action");
        if (OperationResult.m345isSuccessimpl(onSuccess)) {
            action.invoke(onSuccess);
        }
        return onSuccess;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.Keep
    @org.jetbrains.annotations.Nullable
    /* renamed from: onSuccessSuspend-cztIqUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S, F> java.lang.Object m355onSuccessSuspendcztIqUw(@org.jetbrains.annotations.NotNull java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super S, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.result.OperationResult<S, F>> r6) {
        /*
            boolean r0 = r6 instanceof me.oriient.internal.infra.result.c
            if (r0 == 0) goto L13
            r0 = r6
            me.oriient.internal.infra.result.c r0 = (me.oriient.internal.infra.result.c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            me.oriient.internal.infra.result.c r0 = new me.oriient.internal.infra.result.c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r4 = r0.f24983a
            kotlin.ResultKt.b(r6)
            return r4
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r6)
            boolean r6 = me.oriient.internal.infra.result.OperationResult.m345isSuccessimpl(r4)
            if (r6 == 0) goto L4a
            java.lang.String r6 = "null cannot be cast to non-null type S of me.oriient.internal.infra.result.OperationResultKt.onSuccessSuspend"
            kotlin.jvm.internal.Intrinsics.f(r4, r6)
            r0.f24983a = r4
            r0.c = r3
            java.lang.Object r5 = r5.invoke(r4, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.infra.result.OperationResultKt.m355onSuccessSuspendcztIqUw(java.lang.Object, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Keep
    @Nullable
    /* renamed from: successValueOrNull-DHWKYCI, reason: not valid java name */
    public static final <S, F> S m356successValueOrNullDHWKYCI(@NotNull Object successValueOrNull) {
        Intrinsics.h(successValueOrNull, "$this$successValueOrNull");
        if (OperationResult.m345isSuccessimpl(successValueOrNull)) {
            return successValueOrNull;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Keep
    @NotNull
    /* renamed from: transformFailure-1gcwg9M, reason: not valid java name */
    public static final <S, F, T> Object m357transformFailure1gcwg9M(@NotNull Object transformFailure, @NotNull Function1<? super F, ? extends T> action) {
        Intrinsics.h(transformFailure, "$this$transformFailure");
        Intrinsics.h(action, "action");
        if (OperationResult.m345isSuccessimpl(transformFailure)) {
            return OperationResult.INSTANCE.m350success8kmFncQ(transformFailure);
        }
        OperationResult.Companion companion = OperationResult.INSTANCE;
        Object obj = ((a) transformFailure).f24981a;
        Intrinsics.f(obj, "null cannot be cast to non-null type F of me.oriient.internal.infra.result.OperationResultKt.transformFailure");
        return companion.m349failure8kmFncQ(action.invoke(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Keep
    @NotNull
    /* renamed from: transformSuccess-1gcwg9M, reason: not valid java name */
    public static final <S, F, T> Object m358transformSuccess1gcwg9M(@NotNull Object transformSuccess, @NotNull Function1<? super S, ? extends T> action) {
        Intrinsics.h(transformSuccess, "$this$transformSuccess");
        Intrinsics.h(action, "action");
        if (OperationResult.m345isSuccessimpl(transformSuccess)) {
            return OperationResult.INSTANCE.m350success8kmFncQ(action.invoke(transformSuccess));
        }
        OperationResult.Companion companion = OperationResult.INSTANCE;
        Object obj = ((a) transformSuccess).f24981a;
        Intrinsics.f(obj, "null cannot be cast to non-null type F of me.oriient.internal.infra.result.OperationResultKt.transformSuccess");
        return companion.m349failure8kmFncQ(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Keep
    @NotNull
    /* renamed from: transformValues-cztIqUw, reason: not valid java name */
    public static final <S, F, TS, TF> Object m359transformValuescztIqUw(@NotNull Object transformValues, @NotNull Function1<? super S, ? extends TS> transformSuccess, @NotNull Function1<? super F, ? extends TF> transformFailure) {
        Intrinsics.h(transformValues, "$this$transformValues");
        Intrinsics.h(transformSuccess, "transformSuccess");
        Intrinsics.h(transformFailure, "transformFailure");
        if (OperationResult.m345isSuccessimpl(transformValues)) {
            return OperationResult.INSTANCE.m350success8kmFncQ(transformSuccess.invoke(transformValues));
        }
        OperationResult.Companion companion = OperationResult.INSTANCE;
        Object obj = ((a) transformValues).f24981a;
        Intrinsics.f(obj, "null cannot be cast to non-null type F of me.oriient.internal.infra.result.OperationResultKt.transformValues");
        return companion.m349failure8kmFncQ(transformFailure.invoke(obj));
    }
}
