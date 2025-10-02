package au.com.woolworths.foundation.advertising.data.google;

import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdBannerCard;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetch$3", f = "GoogleAdManagerInteractor.kt", l = {196, DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER, DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER, 204}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class GoogleAdManagerInteractor$fetch$3 extends SuspendLambda implements Function2<FlowCollector<? super GoogleAdBannerCard>, Continuation<? super Unit>, Object> {
    public GoogleAdManagerInteractor p;
    public Object q;
    public Iterator r;
    public GoogleAdBannerCard s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ArrayList v;
    public final /* synthetic */ GoogleAdManagerInteractor w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAdManagerInteractor$fetch$3(ArrayList arrayList, GoogleAdManagerInteractor googleAdManagerInteractor, Continuation continuation) {
        super(2, continuation);
        GoogleAdConsumer googleAdConsumer = GoogleAdConsumer.e;
        this.v = arrayList;
        this.w = googleAdManagerInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GoogleAdConsumer googleAdConsumer = GoogleAdConsumer.e;
        GoogleAdManagerInteractor$fetch$3 googleAdManagerInteractor$fetch$3 = new GoogleAdManagerInteractor$fetch$3(this.v, this.w, continuation);
        googleAdManagerInteractor$fetch$3.u = obj;
        return googleAdManagerInteractor$fetch$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GoogleAdManagerInteractor$fetch$3) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e6, code lost:
    
        if (r8.emit(r1, r11) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        r1 = r2;
        r2 = r3;
        r3 = r7;
        r7 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetch$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
