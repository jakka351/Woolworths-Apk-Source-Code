package au.com.woolworths.shop.checkout.domain.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.checkout.data.source.SubstitutionRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/interactor/SubstitutionInteractor;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubstitutionInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final SubstitutionRepository f10551a;

    public SubstitutionInteractor(SubstitutionRepository substitutionRepository) {
        this.f10551a = substitutionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, double r6, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor$queryProductSubstitution$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor$queryProductSubstitution$1 r0 = (au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor$queryProductSubstitution$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor$queryProductSubstitution$1 r0 = new au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor$queryProductSubstitution$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            goto L41
        L27:
            r5 = move-exception
            goto L44
        L29:
            r5 = move-exception
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.shop.checkout.data.source.SubstitutionRepository r8 = r4.f10551a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            java.lang.Object r8 = r8.a(r5, r6, r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            if (r8 != r1) goto L41
            return r1
        L41:
            au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreference r8 = (au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreference) r8     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            return r8
        L44:
            kotlin.Result$Failure r5 = kotlin.ResultKt.a(r5)
            return r5
        L49:
            kotlin.Result$Failure r5 = kotlin.ResultKt.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor.a(java.lang.String, double, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable b(java.lang.String r8, java.lang.String r9, java.util.Map r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor$saveUserSubstitutionPreferences$1
            if (r0 == 0) goto L13
            r0 = r11
            au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor$saveUserSubstitutionPreferences$1 r0 = (au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor$saveUserSubstitutionPreferences$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor$saveUserSubstitutionPreferences$1 r0 = new au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor$saveUserSubstitutionPreferences$1
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.b(r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            goto Lbf
        L28:
            r8 = move-exception
            goto Lc8
        L2b:
            r8 = move-exception
            goto Lcd
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.ResultKt.b(r11)
            au.com.woolworths.shop.checkout.data.source.SubstitutionRepository r11 = r7.f10551a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            r2.<init>()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.util.Set r4 = r10.entrySet()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.util.Iterator r4 = r4.iterator()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
        L48:
            boolean r5 = r4.hasNext()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r4.next()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.lang.Object r6 = r5.getValue()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            boolean r6 = r6.booleanValue()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            if (r6 == 0) goto L48
            java.lang.Object r6 = r5.getKey()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.lang.Object r5 = r5.getValue()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            r2.put(r6, r5)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            goto L48
        L6c:
            java.util.Set r2 = r2.keySet()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.util.List r2 = kotlin.collections.CollectionsKt.G0(r2)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            r4.<init>()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.util.Set r10 = r10.entrySet()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.util.Iterator r10 = r10.iterator()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
        L83:
            boolean r5 = r10.hasNext()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            if (r5 == 0) goto La7
            java.lang.Object r5 = r10.next()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.lang.Object r6 = r5.getValue()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            boolean r6 = r6.booleanValue()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            if (r6 != 0) goto L83
            java.lang.Object r6 = r5.getKey()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.lang.Object r5 = r5.getValue()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            r4.put(r6, r5)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            goto L83
        La7:
            java.util.Set r10 = r4.keySet()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.util.List r10 = kotlin.collections.CollectionsKt.G0(r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            au.com.woolworths.shop.checkout.domain.model.substitution.UserSubstitutionPreference r4 = new au.com.woolworths.shop.checkout.domain.model.substitution.UserSubstitutionPreference     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            r4.<init>(r8, r9, r2, r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.lang.Object r11 = r11.c(r4, r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            if (r11 != r1) goto Lbf
            return r1
        Lbf:
            au.com.woolworths.shop.checkout.domain.model.substitution.UpdateSubstitutionPreferencesSuccessResponse r11 = (au.com.woolworths.shop.checkout.domain.model.substitution.UpdateSubstitutionPreferencesSuccessResponse) r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            boolean r8 = r11.f10668a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28 au.com.woolworths.android.onesite.network.NoConnectivityException -> L2b
            return r8
        Lc8:
            kotlin.Result$Failure r8 = kotlin.ResultKt.a(r8)
            return r8
        Lcd:
            kotlin.Result$Failure r8 = kotlin.ResultKt.a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor.b(java.lang.String, java.lang.String, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
