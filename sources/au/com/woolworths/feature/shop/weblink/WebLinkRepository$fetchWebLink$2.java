package au.com.woolworths.feature.shop.weblink;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.android.onesite.webview.ReleaseSquadHeaderInteractor;
import au.com.woolworths.feature.shop.weblink.model.WebLink;
import au.com.woolworths.shop.weblink.ShopMagicLinksQuery;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/shop/weblink/model/WebLink;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.weblink.WebLinkRepository$fetchWebLink$2", f = "WebLinkRepository.kt", l = {33}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class WebLinkRepository$fetchWebLink$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WebLink>, Object> {
    public WebLinkRepository p;
    public int q;
    public final /* synthetic */ WebLinkRepository r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLinkRepository$fetchWebLink$2(WebLinkRepository webLinkRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.r = webLinkRepository;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebLinkRepository$fetchWebLink$2(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WebLinkRepository$fetchWebLink$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        WebLinkRepository webLinkRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                WebLinkRepository webLinkRepository2 = this.r;
                String str = this.s;
                ApolloClient apolloClient = webLinkRepository2.f8257a;
                ShopMagicLinksQuery shopMagicLinksQuery = new ShopMagicLinksQuery(str);
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, shopMagicLinksQuery);
                this.p = webLinkRepository2;
                this.q = 1;
                Object objB = apolloCall.b(this);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                webLinkRepository = webLinkRepository2;
                obj = objB;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webLinkRepository = this.p;
                ResultKt.b(obj);
            }
            ApolloResponse apolloResponse = (ApolloResponse) obj;
            ShopMagicLinksQuery.MagicLink magicLink = ((ShopMagicLinksQuery.Data) ExceptionExtKt.k(apolloResponse)).f12946a;
            if (apolloResponse.b()) {
                throw ExceptionExtKt.i(apolloResponse.d);
            }
            WebLink webLinkA = WebLinkRepositoryKt.a(magicLink);
            Map map = webLinkA.c;
            ReleaseSquadHeaderInteractor releaseSquadHeaderInteractor = webLinkRepository.c;
            return WebLink.a(webLinkA, MapsKt.m(map, EmptyMap.d), null, 11);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
