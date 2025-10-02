package au.com.woolworths.feature.shop.notification.preferences.repository;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.feature.shop.notification.preferences.UpdatePreferencesMutation;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.notification.preferences.repository.PreferencesRepository$updatePreferenceToggle$2", f = "PreferencesRepository.kt", l = {61}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class PreferencesRepository$updatePreferenceToggle$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PreferencesData>, Object> {
    public PreferencesRepository p;
    public int q;
    public final /* synthetic */ PreferencesRepository r;
    public final /* synthetic */ String s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesRepository$updatePreferenceToggle$2(PreferencesRepository preferencesRepository, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.r = preferencesRepository;
        this.s = str;
        this.t = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreferencesRepository$updatePreferenceToggle$2(this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PreferencesRepository$updatePreferenceToggle$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
                boolean z = this.t;
                ApolloClient apolloClient = preferencesRepository2.f7945a;
                UpdatePreferencesMutation updatePreferencesMutation = new UpdatePreferencesMutation(Optional.Companion.a(preferencesRepository2.c.c(BaseShopAppFeature.v) ? CollectionsKt.Q("watchlist") : null), str, z);
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, updatePreferencesMutation);
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
            UpdatePreferencesMutation.UpdatePreference updatePreference = ((UpdatePreferencesMutation.Data) ExceptionExtKt.k(apolloResponse)).f7907a;
            PreferencesData preferencesDataB = updatePreference != null ? PreferencesRepository.b(preferencesRepository, updatePreference) : null;
            if (preferencesDataB != null) {
                return preferencesDataB;
            }
            throw ExceptionExtKt.i(apolloResponse.d);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
