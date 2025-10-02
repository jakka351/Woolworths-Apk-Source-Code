package androidx.compose.ui.tooling;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroidx/compose/ui/tooling/ShadowViewInfo;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.tooling.ShadowViewInfo$allNodes$1", f = "ShadowViewInfo.android.kt", l = {43, 44}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ShadowViewInfo$allNodes$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super ShadowViewInfo>, Continuation<? super Unit>, Object> {
    public Iterator q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ShadowViewInfo t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowViewInfo$allNodes$1(ShadowViewInfo shadowViewInfo, Continuation continuation) {
        super(2, continuation);
        this.t = shadowViewInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShadowViewInfo$allNodes$1 shadowViewInfo$allNodes$1 = new ShadowViewInfo$allNodes$1(this.t, continuation);
        shadowViewInfo$allNodes$1.s = obj;
        return shadowViewInfo$allNodes$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShadowViewInfo$allNodes$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        ShadowViewInfo shadowViewInfo = this.t;
        if (i == 0) {
            ResultKt.b(obj);
            SequenceScope sequenceScope2 = (SequenceScope) this.s;
            this.s = sequenceScope2;
            this.r = 1;
            sequenceScope2.a(shadowViewInfo, this);
            return coroutineSingletons;
        }
        if (i == 1) {
            SequenceScope sequenceScope3 = (SequenceScope) this.s;
            ResultKt.b(obj);
            ArrayList arrayList = shadowViewInfo.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                CollectionsKt.i(arrayList2, ((ShadowViewInfo) it2.next()).d);
            }
            Iterator it3 = arrayList2.iterator();
            sequenceScope = sequenceScope3;
            it = it3;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.q;
            sequenceScope = (SequenceScope) this.s;
            ResultKt.b(obj);
        }
        if (!it.hasNext()) {
            return Unit.f24250a;
        }
        ShadowViewInfo shadowViewInfo2 = (ShadowViewInfo) it.next();
        this.s = sequenceScope;
        this.q = it;
        this.r = 2;
        sequenceScope.a(shadowViewInfo2, this);
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.d;
        return coroutineSingletons;
    }
}
