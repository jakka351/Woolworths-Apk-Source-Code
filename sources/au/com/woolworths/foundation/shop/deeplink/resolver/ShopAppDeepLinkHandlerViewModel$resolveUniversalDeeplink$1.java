package au.com.woolworths.foundation.shop.deeplink.resolver;

import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.deeplink.resolver.ShopAppDeepLinkContract;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.deeplink.resolver.ShopAppDeepLinkHandlerViewModel$resolveUniversalDeeplink$1", f = "ShopAppDeepLinkHandlerViewModel.kt", l = {88}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ShopAppDeepLinkHandlerViewModel$resolveUniversalDeeplink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShopAppDeepLinkHandlerViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopAppDeepLinkHandlerViewModel$resolveUniversalDeeplink$1(ShopAppDeepLinkHandlerViewModel shopAppDeepLinkHandlerViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = shopAppDeepLinkHandlerViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShopAppDeepLinkHandlerViewModel$resolveUniversalDeeplink$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShopAppDeepLinkHandlerViewModel$resolveUniversalDeeplink$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object value;
        Object value2;
        ShopAppDeepLinkHandlerViewModel shopAppDeepLinkHandlerViewModel = this.q;
        MutableStateFlow mutableStateFlow = shopAppDeepLinkHandlerViewModel.h;
        CollectionModeInteractor collectionModeInteractor = shopAppDeepLinkHandlerViewModel.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ShoppingModeType shoppingModeTypeA = ShoppingModeTypeDataKt.a(collectionModeInteractor.w());
                ShopAppDeepLinkInteractor shopAppDeepLinkInteractor = shopAppDeepLinkHandlerViewModel.e;
                String str = this.r;
                String strA = shoppingModeTypeA == ShoppingModeType.i ? collectionModeInteractor.a() : null;
                this.p = 1;
                obj = shopAppDeepLinkInteractor.f8714a.a(shoppingModeTypeA, str, strA, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            shopAppDeepLinkHandlerViewModel.j.f(new ShopAppDeepLinkContract.Actions.LaunchDeepLink((String) obj));
        } catch (NoConnectivityException unused) {
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, ShopAppDeepLinkContract.ViewState.a((ShopAppDeepLinkContract.ViewState) value2, null, 4)));
        } catch (ServerErrorException unused2) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, ShopAppDeepLinkContract.ViewState.a((ShopAppDeepLinkContract.ViewState) value, new ShopAppDeepLinkContract.Snackbar(new ResText(com.woolworths.R.string.server_error_snackbar_message)), 2)));
        }
        return Unit.f24250a;
    }
}
