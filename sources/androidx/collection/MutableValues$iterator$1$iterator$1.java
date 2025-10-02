package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.collection.MutableValues$iterator$1$iterator$1", f = "ScatterMap.kt", l = {1696}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class MutableValues$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
    public long[] q;
    public int r;
    public int s;
    public int t;
    public int u;
    public long v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ MutableValues y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableValues$iterator$1$iterator$1(MutableValues mutableValues, Continuation continuation) {
        super(2, continuation);
        this.y = mutableValues;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutableValues$iterator$1$iterator$1 mutableValues$iterator$1$iterator$1 = new MutableValues$iterator$1$iterator$1(this.y, continuation);
        mutableValues$iterator$1$iterator$1.x = obj;
        return mutableValues$iterator$1$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableValues$iterator$1$iterator$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        r3 = 8 - ((~(r6 - r7)) >>> 31);
        r1 = 0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r14.w
            if (r1 == 0) goto L73
            r2 = 1
            if (r1 != r2) goto L6b
            int r1 = r14.u
            int r3 = r14.t
            long r4 = r14.v
            int r6 = r14.s
            int r7 = r14.r
            long[] r8 = r14.q
            java.lang.Object r9 = r14.x
            kotlin.sequences.SequenceScope r9 = (kotlin.sequences.SequenceScope) r9
            kotlin.ResultKt.b(r15)
        L1c:
            r15 = 8
            long r4 = r4 >> r15
            int r1 = r1 + r2
        L20:
            if (r1 >= r3) goto L49
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r4
            r12 = 128(0x80, double:6.32E-322)
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L1c
            int r15 = r6 << 3
            int r15 = r15 + r1
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r15)
            r14.x = r9
            r14.q = r8
            r14.r = r7
            r14.s = r6
            r14.v = r4
            r14.t = r3
            r14.u = r1
            r14.w = r2
            r9.a(r10, r14)
            kotlin.coroutines.intrinsics.CoroutineSingletons r15 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            return r0
        L49:
            if (r3 != r15) goto L68
        L4b:
            if (r6 == r7) goto L68
            int r6 = r6 + 1
            r4 = r8[r6]
            long r10 = ~r4
            r1 = 7
            long r10 = r10 << r1
            long r10 = r10 & r4
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 == 0) goto L4b
            int r1 = r6 - r7
            int r1 = ~r1
            int r1 = r1 >>> 31
            int r3 = 8 - r1
            r1 = 0
            goto L20
        L68:
            kotlin.Unit r15 = kotlin.Unit.f24250a
            return r15
        L6b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L73:
            kotlin.ResultKt.b(r15)
            java.lang.Object r15 = r14.x
            kotlin.sequences.SequenceScope r15 = (kotlin.sequences.SequenceScope) r15
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableValues$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
