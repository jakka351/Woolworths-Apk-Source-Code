package me.oriient.internal.infra.result;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087@\u0018\u0000 \u001c*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u001c\u001dB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00108F¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u0016\u0088\u0001\u0004\u0092\u0001\u00020\u0001¨\u0006\u001e"}, d2 = {"Lme/oriient/internal/infra/result/OperationResult;", "", "S", "F", "value", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/lang/Object;)I", "hashCode", "other", "", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "equals", "Ljava/lang/Object;", "isSuccess-impl", "(Ljava/lang/Object;)Z", "isSuccess", "isFailure-impl", "isFailure$annotations", "()V", "isFailure", "Companion", "me/oriient/internal/infra/result/a", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes7.dex */
public final class OperationResult<S, F> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Object value;

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b\"\b\b\u0002\u0010\t*\u00020\u0001\"\b\b\u0003\u0010\u0004*\u00020\u00012\u0006\u0010\n\u001a\u00028\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b\"\b\b\u0002\u0010\t*\u00020\u0001\"\b\b\u0003\u0010\u0004*\u00020\u00012\u0006\u0010\u0005\u001a\u00028\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\r\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lme/oriient/internal/infra/result/OperationResult$Companion;", "", "<init>", "()V", "F", "error", "Lme/oriient/internal/infra/result/a;", "createFailure", "(Ljava/lang/Object;)Lme/oriient/internal/infra/result/a;", "S", "value", "Lme/oriient/internal/infra/result/OperationResult;", "success-8kmFncQ", "(Ljava/lang/Object;)Ljava/lang/Object;", "success", "failure-8kmFncQ", "failure", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final <F> a createFailure(F error) {
            return new a(error);
        }

        @JvmStatic
        @NotNull
        /* renamed from: failure-8kmFncQ, reason: not valid java name */
        public final <S, F> Object m349failure8kmFncQ(@NotNull F error) {
            Intrinsics.h(error, "error");
            return OperationResult.m339constructorimpl(createFailure(error));
        }

        @JvmStatic
        @NotNull
        /* renamed from: success-8kmFncQ, reason: not valid java name */
        public final <S, F> Object m350success8kmFncQ(@NotNull S value) {
            Intrinsics.h(value, "value");
            return OperationResult.m339constructorimpl(value);
        }

        private Companion() {
        }
    }

    private /* synthetic */ OperationResult(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OperationResult m338boximpl(Object obj) {
        return new OperationResult(obj);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <S, F> Object m339constructorimpl(@NotNull Object value) {
        Intrinsics.h(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m340equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof OperationResult) && Intrinsics.c(obj, ((OperationResult) obj2).getValue());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m341equalsimpl0(Object obj, Object obj2) {
        return Intrinsics.c(obj, obj2);
    }

    @JvmStatic
    @NotNull
    /* renamed from: failure-8kmFncQ, reason: not valid java name */
    public static final <S, F> Object m342failure8kmFncQ(@NotNull F f) {
        return INSTANCE.m349failure8kmFncQ(f);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m343hashCodeimpl(Object obj) {
        return obj.hashCode();
    }

    public static /* synthetic */ void isFailure$annotations() {
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m344isFailureimpl(Object obj) {
        return obj instanceof a;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m345isSuccessimpl(Object obj) {
        return !(obj instanceof a);
    }

    @JvmStatic
    @NotNull
    /* renamed from: success-8kmFncQ, reason: not valid java name */
    public static final <S, F> Object m346success8kmFncQ(@NotNull S s) {
        return INSTANCE.m350success8kmFncQ(s);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m347toStringimpl(Object obj) {
        return "OperationResult(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m340equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m343hashCodeimpl(this.value);
    }

    public String toString() {
        return m347toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Object getValue() {
        return this.value;
    }
}
