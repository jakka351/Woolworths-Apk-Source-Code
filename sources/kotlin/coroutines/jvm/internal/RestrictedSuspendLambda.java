package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@SinceKotlin
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/jvm/internal/FunctionBase;", "", "Lkotlin/coroutines/jvm/internal/SuspendFunction;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements FunctionBase<Object>, SuspendFunction {
    public final int p;

    public RestrictedSuspendLambda(int i, Continuation continuation) {
        super(continuation);
        this.p = i;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    /* renamed from: getArity, reason: from getter */
    public final int getP() {
        return this.p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strJ = Reflection.f24268a.j(this);
        Intrinsics.g(strJ, "renderLambdaToString(...)");
        return strJ;
    }
}
