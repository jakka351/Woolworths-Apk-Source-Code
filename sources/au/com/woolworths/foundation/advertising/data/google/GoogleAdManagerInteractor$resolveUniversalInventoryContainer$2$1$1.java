package au.com.woolworths.foundation.advertising.data.google;

import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer;
import au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$resolveUniversalInventoryContainer$2$1$1", f = "GoogleAdManagerInteractor.kt", l = {150}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class GoogleAdManagerInteractor$resolveUniversalInventoryContainer$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public GoogleAdBannerCard p;
    public int q;
    public final /* synthetic */ UniversalInventoryContainerData r;
    public final /* synthetic */ GoogleAdManagerInteractor s;
    public final /* synthetic */ GoogleAdConsumer t;
    public final /* synthetic */ CopyOnWriteArrayList u;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAdManagerInteractor$resolveUniversalInventoryContainer$2$1$1(UniversalInventoryContainerData universalInventoryContainerData, GoogleAdManagerInteractor googleAdManagerInteractor, GoogleAdConsumer googleAdConsumer, CopyOnWriteArrayList copyOnWriteArrayList, boolean z, Continuation continuation) {
        super(2, continuation);
        this.r = universalInventoryContainerData;
        this.s = googleAdManagerInteractor;
        this.t = googleAdConsumer;
        this.u = copyOnWriteArrayList;
        this.v = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoogleAdManagerInteractor$resolveUniversalInventoryContainer$2$1$1(this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GoogleAdManagerInteractor$resolveUniversalInventoryContainer$2$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r8.q
            r2 = 0
            java.util.concurrent.CopyOnWriteArrayList r3 = r8.u
            r4 = 1
            au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData r5 = r8.r
            if (r1 == 0) goto L1c
            if (r1 != r4) goto L14
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r0 = r8.p
            kotlin.ResultKt.b(r9)
            goto L44
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            kotlin.ResultKt.b(r9)
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r9 = r5.getGoogleAdBannerCard()
            if (r9 == 0) goto L68
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor r1 = r8.s
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository r6 = r1.f8399a
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner r6 = r6.a(r9)
            boolean r7 = r8.v
            if (r7 == 0) goto L32
            goto L33
        L32:
            r6 = r2
        L33:
            if (r6 != 0) goto L48
            r8.p = r9
            r8.q = r4
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer r6 = r8.t
            java.lang.Object r1 = r1.b(r9, r6, r8)
            if (r1 != r0) goto L42
            return r0
        L42:
            r0 = r9
            r9 = r1
        L44:
            r6 = r9
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner r6 = (au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner) r6
            r9 = r0
        L48:
            if (r6 == 0) goto L4e
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r2 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt.d(r9, r6)
        L4e:
            if (r2 == 0) goto L5a
            boolean r9 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt.c(r2)
            if (r9 != r4) goto L5a
            r3.add(r2)
            goto L75
        L5a:
            java.lang.Object r9 = r5.getUniversalInventoryFallback()
            if (r9 == 0) goto L75
            java.lang.Object r9 = r5.getUniversalInventoryFallback()
            r3.add(r9)
            goto L75
        L68:
            java.lang.Object r9 = r5.getUniversalInventoryFallback()
            if (r9 == 0) goto L75
            java.lang.Object r9 = r5.getUniversalInventoryFallback()
            r3.add(r9)
        L75:
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$resolveUniversalInventoryContainer$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
