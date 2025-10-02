package androidx.collection;

import androidx.collection.MutableSetWrapper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1188}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class MutableSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableSetWrapper A;
    public final /* synthetic */ MutableSetWrapper.AnonymousClass1 B;
    public MutableSetWrapper.AnonymousClass1 q;
    public Object r;
    public long[] s;
    public int t;
    public int u;
    public int v;
    public int w;
    public long x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSetWrapper$iterator$1$iterator$1(MutableSetWrapper mutableSetWrapper, MutableSetWrapper.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(2, continuation);
        this.A = mutableSetWrapper;
        this.B = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutableSetWrapper$iterator$1$iterator$1 mutableSetWrapper$iterator$1$iterator$1 = new MutableSetWrapper$iterator$1$iterator$1(this.A, this.B, continuation);
        mutableSetWrapper$iterator$1$iterator$1.z = obj;
        return mutableSetWrapper$iterator$1$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableSetWrapper$iterator$1$iterator$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0054 -> B:22:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0056 -> B:14:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0072 -> B:19:0x0099). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.y
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L31
            if (r2 != r5) goto L29
            int r2 = r0.w
            int r6 = r0.v
            long r7 = r0.x
            int r9 = r0.u
            int r10 = r0.t
            long[] r11 = r0.s
            java.lang.Object r12 = r0.r
            androidx.collection.MutableSetWrapper r12 = (androidx.collection.MutableSetWrapper) r12
            androidx.collection.MutableSetWrapper$iterator$1 r13 = r0.q
            java.lang.Object r14 = r0.z
            kotlin.sequences.SequenceScope r14 = (kotlin.sequences.SequenceScope) r14
            kotlin.ResultKt.b(r22)
            goto L99
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L31:
            kotlin.ResultKt.b(r22)
            java.lang.Object r2 = r0.z
            kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
            androidx.collection.MutableSetWrapper r6 = r0.A
            androidx.collection.MutableScatterSet r7 = r6.e
            long[] r7 = r7.f700a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La9
            androidx.collection.MutableSetWrapper$iterator$1 r9 = r0.B
            r10 = r3
        L46:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La4
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = r3
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L69:
            if (r2 >= r6) goto L9c
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L99
            int r3 = r9 << 3
            int r3 = r3 + r2
            r13.d = r3
            androidx.collection.MutableScatterSet r4 = r12.e
            java.lang.Object[] r4 = r4.b
            r3 = r4[r3]
            r0.z = r14
            r0.q = r13
            r0.r = r12
            r0.s = r11
            r0.t = r10
            r0.u = r9
            r0.x = r7
            r0.v = r6
            r0.w = r2
            r0.y = r5
            r14.a(r3, r0)
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            return r1
        L99:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L69
        L9c:
            if (r6 != r4) goto La9
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La4:
            if (r10 == r8) goto La9
            int r10 = r10 + 1
            goto L46
        La9:
            kotlin.Unit r1 = kotlin.Unit.f24250a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableSetWrapper$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
