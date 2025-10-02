package au.com.woolworths.devicefingerprint;

import au.com.woolworths.android.onesite.ShopAppFeature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/devicefingerprint/BotmanagerApolloInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "device-fingerprint_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BotmanagerApolloInterceptor implements ApolloInterceptor {

    /* renamed from: a, reason: collision with root package name */
    public final FeatureToggleManager f5166a;
    public final BotmanagerInteractor b;

    public BotmanagerApolloInterceptor(FeatureToggleManager featureToggleManager, BotmanagerInteractor botmanagerInteractor) {
        ShopAppFeature shopAppFeature = ShopAppFeature.d;
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f5166a = featureToggleManager;
        this.b = botmanagerInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.flow.Flow a(com.apollographql.apollo.api.ApolloRequest r5, com.apollographql.apollo.interceptor.DefaultInterceptorChain r6) {
        /*
            r4 = this;
            com.apollographql.apollo.api.Operation r0 = r5.d
            java.lang.String r0 = r0.name()
            java.util.List r1 = r5.h
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r2 = r4.f5166a
            au.com.woolworths.android.onesite.ShopAppFeature r3 = au.com.woolworths.android.onesite.ShopAppFeature.d
            boolean r2 = r2.c(r3)
            if (r2 == 0) goto L63
            java.lang.String r2 = "x-acf-sensor-data"
            if (r1 == 0) goto L3f
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L26
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L26
            goto L3f
        L26:
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r1.next()
            com.apollographql.apollo.api.http.HttpHeader r3 = (com.apollographql.apollo.api.http.HttpHeader) r3
            java.lang.String r3 = r3.f13528a
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r3, r2)
            if (r3 == 0) goto L2a
            goto L63
        L3f:
            java.lang.String r1 = "operation"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            au.com.woolworths.devicefingerprint.BotmanagerInteractor r1 = r4.b
            au.com.woolworths.devicefingerprint.AkamaiBotmanagerConfig r3 = r1.b()
            java.util.List r3 = r3.getProtectedGraphQlOperations()
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L63
            com.apollographql.apollo.api.ApolloRequest$Builder r5 = r5.a()
            java.lang.String r0 = r1.a()
            r5.a(r2, r0)
            com.apollographql.apollo.api.ApolloRequest r5 = r5.b()
        L63:
            kotlinx.coroutines.flow.Flow r5 = r6.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.devicefingerprint.BotmanagerApolloInterceptor.a(com.apollographql.apollo.api.ApolloRequest, com.apollographql.apollo.interceptor.DefaultInterceptorChain):kotlinx.coroutines.flow.Flow");
    }
}
