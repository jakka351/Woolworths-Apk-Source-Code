package au.com.woolworths.shop.checkout.data.source;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.UserSubstitutionPreference;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/data/source/SubstitutionRepository;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubstitutionRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f10548a;

    public SubstitutionRepository(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f10548a = apolloClient;
    }

    public static UserSubstitutionPreference b(au.com.woolworths.shop.checkout.domain.model.substitution.UserSubstitutionPreference userSubstitutionPreference) {
        userSubstitutionPreference.getClass();
        return new UserSubstitutionPreference(Optional.Absent.f13523a, userSubstitutionPreference.f10669a, Optional.Companion.a(userSubstitutionPreference.b), Optional.Companion.a(userSubstitutionPreference.c), Optional.Companion.a(userSubstitutionPreference.d));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, double r7, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r9 instanceof au.com.woolworths.shop.checkout.data.source.SubstitutionRepository$queryProductSubstitution$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.shop.checkout.data.source.SubstitutionRepository$queryProductSubstitution$1 r0 = (au.com.woolworths.shop.checkout.data.source.SubstitutionRepository$queryProductSubstitution$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.SubstitutionRepository$queryProductSubstitution$1 r0 = new au.com.woolworths.shop.checkout.data.source.SubstitutionRepository$queryProductSubstitution$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L53
        L27:
            r6 = move-exception
            goto L62
        L29:
            r6 = move-exception
            goto L67
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r9)
            com.apollographql.apollo.ApolloClient r9 = r5.f10548a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.checkout.SubstitutionPreferenceQuery r2 = new com.woolworths.shop.checkout.SubstitutionPreferenceQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.graphql.type.SubstitutionPreferenceInput r4 = new au.com.woolworths.shop.graphql.type.SubstitutionPreferenceInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4.<init>(r6, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r9.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r6 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.<init>(r9, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r9 = r6.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r9 != r1) goto L53
            return r1
        L53:
            com.apollographql.apollo.api.ApolloResponse r9 = (com.apollographql.apollo.api.ApolloResponse) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.checkout.SubstitutionPreferenceQuery$Data r6 = (com.woolworths.shop.checkout.SubstitutionPreferenceQuery.Data) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.checkout.SubstitutionPreferenceQuery$SubstitutionPreference r6 = r6.f21900a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreference r6 = au.com.woolworths.shop.checkout.data.mappers.SubstitutionPreferenceQuerySubstitutionPreferenceExtKt.a(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r6
        L62:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)
            throw r6
        L67:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.SubstitutionRepository.a(java.lang.String, double, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(au.com.woolworths.shop.checkout.domain.model.substitution.UserSubstitutionPreference r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof au.com.woolworths.shop.checkout.data.source.SubstitutionRepository$updateSubstitutionPreferences$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.shop.checkout.data.source.SubstitutionRepository$updateSubstitutionPreferences$1 r0 = (au.com.woolworths.shop.checkout.data.source.SubstitutionRepository$updateSubstitutionPreferences$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.checkout.data.source.SubstitutionRepository$updateSubstitutionPreferences$1 r0 = new au.com.woolworths.shop.checkout.data.source.SubstitutionRepository$updateSubstitutionPreferences$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L62
        L27:
            r8 = move-exception
            goto L83
        L29:
            r8 = move-exception
            goto L88
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.b(r9)
            com.apollographql.apollo.ApolloClient r9 = r7.f10548a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.checkout.UpdateSubstitutionPreferencesMutation r2 = new com.woolworths.shop.checkout.UpdateSubstitutionPreferencesMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.graphql.type.UserSubstitutionPreferencesInput r4 = new au.com.woolworths.shop.graphql.type.UserSubstitutionPreferencesInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.graphql.type.UserSubstitutionPreference r8 = b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.util.List r8 = kotlin.collections.CollectionsKt.Q(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional$Present r6 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.<init>(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4.<init>(r8, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r9.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r8 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r8.<init>(r9, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r9 = r8.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r9 != r1) goto L62
            return r1
        L62:
            com.apollographql.apollo.api.ApolloResponse r9 = (com.apollographql.apollo.api.ApolloResponse) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.checkout.UpdateSubstitutionPreferencesMutation$Data r8 = (com.woolworths.shop.checkout.UpdateSubstitutionPreferencesMutation.Data) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.checkout.UpdateSubstitutionPreferencesMutation$UpdateSubstitutionPreferences r8 = r8.f21937a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.checkout.UpdateSubstitutionPreferencesMutation$OnUpdateSubstitutionPreferencesSuccessResponse r8 = r8.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r8 == 0) goto L78
            au.com.woolworths.shop.checkout.domain.model.substitution.UpdateSubstitutionPreferencesSuccessResponse r0 = new au.com.woolworths.shop.checkout.domain.model.substitution.UpdateSubstitutionPreferencesSuccessResponse     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r8 = r8.f21938a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.<init>(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L79
        L78:
            r0 = 0
        L79:
            if (r0 == 0) goto L7c
            return r0
        L7c:
            java.util.List r8 = r9.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L83:
            au.com.woolworths.android.onesite.network.ServerErrorException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r8)
            throw r8
        L88:
            java.lang.Exception r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.source.SubstitutionRepository.c(au.com.woolworths.shop.checkout.domain.model.substitution.UserSubstitutionPreference, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
