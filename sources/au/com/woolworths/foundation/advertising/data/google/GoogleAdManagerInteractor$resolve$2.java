package au.com.woolworths.foundation.advertising.data.google;

import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$resolve$2", f = "GoogleAdManagerInteractor.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class GoogleAdManagerInteractor$resolve$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ List q;
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ GoogleAdManagerInteractor s;
    public final /* synthetic */ CopyOnWriteArrayList t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ GoogleAdConsumer v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAdManagerInteractor$resolve$2(List list, ArrayList arrayList, GoogleAdManagerInteractor googleAdManagerInteractor, CopyOnWriteArrayList copyOnWriteArrayList, boolean z, GoogleAdConsumer googleAdConsumer, Continuation continuation) {
        super(2, continuation);
        this.q = list;
        this.r = arrayList;
        this.s = googleAdManagerInteractor;
        this.t = copyOnWriteArrayList;
        this.u = z;
        this.v = googleAdConsumer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GoogleAdManagerInteractor$resolve$2 googleAdManagerInteractor$resolve$2 = new GoogleAdManagerInteractor$resolve$2(this.q, this.r, this.s, this.t, this.u, this.v, continuation);
        googleAdManagerInteractor$resolve$2.p = obj;
        return googleAdManagerInteractor$resolve$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        GoogleAdManagerInteractor$resolve$2 googleAdManagerInteractor$resolve$2 = (GoogleAdManagerInteractor$resolve$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        googleAdManagerInteractor$resolve$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.p;
        List list = this.q;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof GoogleAdBannerCard) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.r.add(BuildersKt.c(coroutineScope, null, null, new GoogleAdManagerInteractor$resolve$2$1$job$1(this.s, (GoogleAdBannerCard) it.next(), this.t, this.u, this.v, null), 3));
        }
        return Unit.f24250a;
    }
}
