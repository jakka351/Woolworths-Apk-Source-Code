package au.com.woolworths.feature.shop.weblink;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.weblink.WebLinkContract;
import au.com.woolworths.feature.shop.weblink.model.WebLink;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.weblink.WebLinkViewModel$loadWebLink$1", f = "WebLinkViewModel.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WebLinkViewModel$loadWebLink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ WebLinkViewModel q;
    public final /* synthetic */ String r;
    public final /* synthetic */ List s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLinkViewModel$loadWebLink$1(WebLinkViewModel webLinkViewModel, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.q = webLinkViewModel;
        this.r = str;
        this.s = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebLinkViewModel$loadWebLink$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WebLinkViewModel$loadWebLink$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        WebLinkViewModel webLinkViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                MutableLiveData mutableLiveData = webLinkViewModel.f;
                mutableLiveData.m(((WebLinkContract.ViewState) mutableLiveData.e()) != null ? new WebLinkContract.ViewState(null, true, null) : null);
                WebLinkInteractor webLinkInteractor = webLinkViewModel.e;
                String str = this.r;
                this.p = 1;
                WebLinkRepository webLinkRepository = webLinkInteractor.f8256a;
                webLinkRepository.b.getClass();
                DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                obj = BuildersKt.f(DefaultIoScheduler.f, new WebLinkRepository$fetchWebLink$2(webLinkRepository, str, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            Collection collection = this.s;
            WebLink webLink = (WebLink) obj;
            ListBuilder listBuilderV = CollectionsKt.v();
            listBuilderV.addAll(webLink.d);
            if (collection == null) {
                collection = EmptyList.d;
            }
            listBuilderV.addAll(collection);
            WebLinkViewModel.p6(webLinkViewModel.f, WebLink.a(webLink, null, CollectionsKt.q(listBuilderV), 7), null, 4);
        } catch (NoConnectivityException unused) {
            WebLinkViewModel.p6(webLinkViewModel.f, null, WebLinkErrorState.d, 1);
        } catch (ServerErrorException unused2) {
            WebLinkViewModel.p6(webLinkViewModel.f, null, WebLinkErrorState.e, 1);
        }
        return Unit.f24250a;
    }
}
