package au.com.woolworths.feature.shop.notification.preferences.repository;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.feature.shop.notification.preferences.PreferencesDetailsQuery;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.exception.ApolloException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/shop/notification/preferences/models/PreferencesData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.notification.preferences.repository.PreferencesRepository$fetchPreferenceDetails$2", f = "PreferencesRepository.kt", l = {46}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class PreferencesRepository$fetchPreferenceDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PreferencesData>, Object> {
    public PreferencesRepository p;
    public int q;
    public final /* synthetic */ PreferencesRepository r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesRepository$fetchPreferenceDetails$2(PreferencesRepository preferencesRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.r = preferencesRepository;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreferencesRepository$fetchPreferenceDetails$2(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PreferencesRepository$fetchPreferenceDetails$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        PreferencesRepository preferencesRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                PreferencesRepository preferencesRepository2 = this.r;
                String str = this.s;
                ApolloClient apolloClient = preferencesRepository2.f7945a;
                PreferencesDetailsQuery preferencesDetailsQuery = new PreferencesDetailsQuery(Optional.Companion.a(str), Optional.Companion.a(preferencesRepository2.c.c(BaseShopAppFeature.v) ? CollectionsKt.Q("watchlist") : null));
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, preferencesDetailsQuery);
                this.p = preferencesRepository2;
                this.q = 1;
                Object objB = apolloCall.b(this);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                preferencesRepository = preferencesRepository2;
                obj = objB;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                preferencesRepository = this.p;
                ResultKt.b(obj);
            }
            ApolloResponse apolloResponse = (ApolloResponse) obj;
            PreferencesDetailsQuery.Preferences preferences = ((PreferencesDetailsQuery.Data) ExceptionExtKt.k(apolloResponse)).f7893a;
            PreferencesData preferencesDataA = preferences != null ? PreferencesRepository.a(preferencesRepository, preferences) : null;
            if (preferencesDataA != null) {
                return preferencesDataA;
            }
            throw ExceptionExtKt.i(apolloResponse.d);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
