package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.feature.shop.homepage.data.HomeListData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$fetchHomePage$1", f = "HomePageViewModel.kt", l = {444, 451}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class HomePageViewModel$fetchHomePage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public HomeListData p;
    public HomePageViewModel q;
    public int r;
    public final /* synthetic */ HomePageViewModel s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePageViewModel$fetchHomePage$1(HomePageViewModel homePageViewModel, Continuation continuation) {
        super(2, continuation);
        this.s = homePageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomePageViewModel$fetchHomePage$1(this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomePageViewModel$fetchHomePage$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[Catch: ServerErrorException -> 0x0019, NoConnectivityException -> 0x00a7, TryCatch #2 {NoConnectivityException -> 0x00a7, ServerErrorException -> 0x0019, blocks: (B:7:0x0015, B:26:0x0076, B:28:0x008b, B:30:0x008f, B:13:0x0024, B:19:0x0047, B:21:0x0052, B:22:0x005b, B:16:0x003c), top: B:53:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$fetchHomePage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
