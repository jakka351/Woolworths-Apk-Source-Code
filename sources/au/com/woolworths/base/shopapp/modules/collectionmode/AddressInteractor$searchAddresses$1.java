package au.com.woolworths.base.shopapp.modules.collectionmode;

import au.com.woolworths.base.shopapp.models.address.AddressResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lau/com/woolworths/base/shopapp/models/address/AddressResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.base.shopapp.modules.collectionmode.AddressInteractor$searchAddresses$1", f = "AddressInteractor.kt", l = {36, 36}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AddressInteractor$searchAddresses$1 extends SuspendLambda implements Function2<ProducerScope<? super AddressResult>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AddressInteractor r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressInteractor$searchAddresses$1(AddressInteractor addressInteractor, String str, Continuation continuation) {
        super(2, continuation);
        this.r = addressInteractor;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddressInteractor$searchAddresses$1 addressInteractor$searchAddresses$1 = new AddressInteractor$searchAddresses$1(this.r, this.s, continuation);
        addressInteractor$searchAddresses$1.q = obj;
        return addressInteractor$searchAddresses$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressInteractor$searchAddresses$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r1.z(r5, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r4.p
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r5)
            goto L45
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            java.lang.Object r1 = r4.q
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            kotlin.ResultKt.b(r5)
            goto L39
        L20:
            kotlin.ResultKt.b(r5)
            java.lang.Object r5 = r4.q
            r1 = r5
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            au.com.woolworths.base.shopapp.modules.collectionmode.AddressInteractor r5 = r4.r
            au.com.woolworths.base.shopapp.modules.collectionmode.AddressApi r5 = r5.f4623a
            r4.q = r1
            r4.p = r3
            java.lang.String r3 = r4.s
            java.lang.Object r5 = r5.e(r3, r4)
            if (r5 != r0) goto L39
            goto L44
        L39:
            r3 = 0
            r4.q = r3
            r4.p = r2
            java.lang.Object r5 = r1.z(r5, r4)
            if (r5 != r0) goto L45
        L44:
            return r0
        L45:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.shopapp.modules.collectionmode.AddressInteractor$searchAddresses$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
