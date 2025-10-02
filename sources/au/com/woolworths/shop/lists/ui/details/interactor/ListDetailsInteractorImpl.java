package au.com.woolworths.shop.lists.ui.details.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/interactor/ListDetailsInteractorImpl;", "Lau/com/woolworths/shop/lists/ui/details/interactor/ListDetailsInteractor;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListDetailsInteractorImpl implements ListDetailsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ListDetailsRepository f12303a;
    public final SharedFlowImpl b = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);

    public ListDetailsInteractorImpl(ListDetailsRepository listDetailsRepository) {
        this.f12303a = listDetailsRepository;
    }

    @Override // au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInteractor
    /* renamed from: a, reason: from getter */
    public final SharedFlowImpl getB() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, java.util.ArrayList r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r8 instanceof au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInteractorImpl$listDetails$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInteractorImpl$listDetails$1 r0 = (au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInteractorImpl$listDetails$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInteractorImpl$listDetails$1 r0 = new au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInteractorImpl$listDetails$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.ArrayList r7 = r0.q
            java.lang.String r5 = r0.p
            kotlin.ResultKt.b(r8)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r8)
            r0.p = r5
            r0.q = r7
            r0.t = r3
            au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsRepository r8 = r4.f12303a
            java.lang.Object r8 = r8.a(r5, r6, r7, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            au.com.woolworths.shop.lists.ui.details.models.ListDetails r8 = (au.com.woolworths.shop.lists.ui.details.models.ListDetails) r8
            au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsResult r6 = new au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsResult
            au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInput r0 = new au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInput
            r0.<init>(r5, r7)
            r6.<init>(r0, r8)
            kotlinx.coroutines.flow.SharedFlowImpl r5 = r4.b
            r5.f(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInteractorImpl.b(java.lang.String, java.lang.String, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
