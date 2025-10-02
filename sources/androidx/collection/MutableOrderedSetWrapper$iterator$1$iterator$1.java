package androidx.collection;

import androidx.collection.MutableOrderedSetWrapper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1489}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class MutableOrderedSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {
    public MutableOrderedSetWrapper.AnonymousClass1 q;
    public Object r;
    public long[] s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ MutableOrderedSetWrapper w;
    public final /* synthetic */ MutableOrderedSetWrapper.AnonymousClass1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper$iterator$1$iterator$1(MutableOrderedSetWrapper mutableOrderedSetWrapper, MutableOrderedSetWrapper.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(2, continuation);
        this.w = mutableOrderedSetWrapper;
        this.x = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.w, this.x, continuation);
        mutableOrderedSetWrapper$iterator$1$iterator$1.v = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        MutableOrderedSetWrapper mutableOrderedSetWrapper;
        long[] jArr;
        int i;
        MutableOrderedSetWrapper.AnonymousClass1 anonymousClass1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = this.u;
        if (i2 == 0) {
            ResultKt.b(obj);
            sequenceScope = (SequenceScope) this.v;
            mutableOrderedSetWrapper = this.w;
            MutableOrderedScatterSet mutableOrderedScatterSet = mutableOrderedSetWrapper.e;
            jArr = mutableOrderedScatterSet.c;
            i = mutableOrderedScatterSet.e;
            anonymousClass1 = this.x;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.t;
            jArr = this.s;
            mutableOrderedSetWrapper = (MutableOrderedSetWrapper) this.r;
            anonymousClass1 = this.q;
            sequenceScope = (SequenceScope) this.v;
            ResultKt.b(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return Unit.f24250a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        anonymousClass1.d = i;
        Object obj2 = mutableOrderedSetWrapper.e.b[i];
        this.v = sequenceScope;
        this.q = anonymousClass1;
        this.r = mutableOrderedSetWrapper;
        this.s = jArr;
        this.t = i3;
        this.u = 1;
        sequenceScope.a(obj2, this);
        return coroutineSingletons;
    }
}
