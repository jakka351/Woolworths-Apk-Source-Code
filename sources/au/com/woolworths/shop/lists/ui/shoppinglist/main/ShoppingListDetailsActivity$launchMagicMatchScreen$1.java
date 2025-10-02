package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import android.view.Window;
import androidx.activity.result.ActivityResultLauncher;
import au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchActivity;
import au.com.woolworths.shop.lists.ui.utils.BitmapRenderer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$launchMagicMatchScreen$1", f = "ShoppingListDetailsActivity.kt", l = {552}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListDetailsActivity$launchMagicMatchScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ActivityResultLauncher p;
    public MagicMatchActivity.Companion q;
    public ShoppingListDetailsActivity r;
    public int s;
    public final /* synthetic */ ShoppingListDetailsActivity t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsActivity$launchMagicMatchScreen$1(ShoppingListDetailsActivity shoppingListDetailsActivity, String str, Continuation continuation) {
        super(2, continuation);
        this.t = shoppingListDetailsActivity;
        this.u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListDetailsActivity$launchMagicMatchScreen$1(this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListDetailsActivity$launchMagicMatchScreen$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ShoppingListDetailsActivity shoppingListDetailsActivity;
        ActivityResultLauncher activityResultLauncher;
        MagicMatchActivity.Companion companion;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.s;
        if (i == 0) {
            ResultKt.b(obj);
            ShoppingListDetailsActivity shoppingListDetailsActivity2 = this.t;
            ActivityResultLauncher activityResultLauncher2 = shoppingListDetailsActivity2.O;
            MagicMatchActivity.Companion companion2 = MagicMatchActivity.z;
            Window window = shoppingListDetailsActivity2.getWindow();
            Intrinsics.g(window, "getWindow(...)");
            this.p = activityResultLauncher2;
            this.q = companion2;
            this.r = shoppingListDetailsActivity2;
            this.s = 1;
            Object objB = BitmapRenderer.b(window, this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            shoppingListDetailsActivity = shoppingListDetailsActivity2;
            obj = objB;
            activityResultLauncher = activityResultLauncher2;
            companion = companion2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            shoppingListDetailsActivity = this.r;
            companion = this.q;
            activityResultLauncher = this.p;
            ResultKt.b(obj);
        }
        companion.getClass();
        activityResultLauncher.a(MagicMatchActivity.Companion.a(shoppingListDetailsActivity, this.u, (byte[]) obj), null);
        return Unit.f24250a;
    }
}
