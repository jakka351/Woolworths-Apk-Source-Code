package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/CompletedContinuation;", "R", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final /* data */ class CompletedContinuation<R> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24688a;
    public final CancelHandler b;
    public final Function3 c;
    public final Object d;
    public final Throwable e;

    public CompletedContinuation(Object obj, CancelHandler cancelHandler, Function3 function3, Object obj2, Throwable th) {
        this.f24688a = obj;
        this.b = cancelHandler;
        this.c = function3;
        this.d = obj2;
        this.e = th;
    }

    public static CompletedContinuation a(CompletedContinuation completedContinuation, CancelHandler cancelHandler, Throwable th, int i) {
        Object obj = completedContinuation.f24688a;
        if ((i & 2) != 0) {
            cancelHandler = completedContinuation.b;
        }
        CancelHandler cancelHandler2 = cancelHandler;
        Function3 function3 = completedContinuation.c;
        Object obj2 = completedContinuation.d;
        if ((i & 16) != 0) {
            th = completedContinuation.e;
        }
        return new CompletedContinuation(obj, cancelHandler2, function3, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) obj;
        return Intrinsics.c(this.f24688a, completedContinuation.f24688a) && Intrinsics.c(this.b, completedContinuation.b) && Intrinsics.c(this.c, completedContinuation.c) && Intrinsics.c(this.d, completedContinuation.d) && Intrinsics.c(this.e, completedContinuation.e);
    }

    public final int hashCode() {
        Object obj = this.f24688a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        CancelHandler cancelHandler = this.b;
        int iHashCode2 = (iHashCode + (cancelHandler == null ? 0 : cancelHandler.hashCode())) * 31;
        Function3 function3 = this.c;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f24688a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ CompletedContinuation(Object obj, CancelHandler cancelHandler, Function3 function3, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : cancelHandler, (i & 4) != 0 ? null : function3, (Object) null, (i & 16) != 0 ? null : th);
    }
}
