package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import android.view.Window;
import androidx.activity.result.ActivityResultLauncher;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.CameraMenuOption;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListMenuOption;
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
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$onOptionClick$1", f = "ShoppingListDetailsActivity.kt", l = {539}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListDetailsActivity$onOptionClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ProcessorActivity.Companion.SourceType p;
    public ProcessorActivity.Companion q;
    public ActivityResultLauncher r;
    public int s;
    public final /* synthetic */ SnapAListMenuOption t;
    public final /* synthetic */ ShoppingListDetailsActivity u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsActivity$onOptionClick$1(SnapAListMenuOption snapAListMenuOption, ShoppingListDetailsActivity shoppingListDetailsActivity, Continuation continuation) {
        super(2, continuation);
        this.t = snapAListMenuOption;
        this.u = shoppingListDetailsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListDetailsActivity$onOptionClick$1(this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListDetailsActivity$onOptionClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProcessorActivity.Companion.SourceType sourceType;
        ActivityResultLauncher activityResultLauncher;
        ProcessorActivity.Companion companion;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.s;
        ShoppingListDetailsActivity shoppingListDetailsActivity = this.u;
        if (i == 0) {
            ResultKt.b(obj);
            ProcessorActivity.Companion.SourceType sourceType2 = Intrinsics.c(this.t, CameraMenuOption.c) ? ProcessorActivity.Companion.SourceType.d : ProcessorActivity.Companion.SourceType.e;
            ActivityResultLauncher activityResultLauncher2 = shoppingListDetailsActivity.N;
            ProcessorActivity.Companion companion2 = ProcessorActivity.C;
            Window window = shoppingListDetailsActivity.getWindow();
            Intrinsics.g(window, "getWindow(...)");
            this.p = sourceType2;
            this.q = companion2;
            this.r = activityResultLauncher2;
            this.s = 1;
            Object objB = BitmapRenderer.b(window, this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            sourceType = sourceType2;
            obj = objB;
            activityResultLauncher = activityResultLauncher2;
            companion = companion2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activityResultLauncher = this.r;
            companion = this.q;
            sourceType = this.p;
            ResultKt.b(obj);
        }
        companion.getClass();
        activityResultLauncher.a(ProcessorActivity.Companion.a(shoppingListDetailsActivity, sourceType, (byte[]) obj), null);
        return Unit.f24250a;
    }
}
