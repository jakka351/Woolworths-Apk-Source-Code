package au.com.woolworths.shop.lists.ui.lists.mylists;

import android.content.Context;
import android.view.Window;
import androidx.activity.result.ActivityResultLauncher;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity;
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
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.mylists.MyListsFragment$launchSnapAListProcessor$1", f = "MyListsFragment.kt", l = {274}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MyListsFragment$launchSnapAListProcessor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ProcessorActivity.Companion p;
    public ActivityResultLauncher q;
    public int r;
    public final /* synthetic */ MyListsFragment s;
    public final /* synthetic */ ProcessorActivity.Companion.SourceType t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListsFragment$launchSnapAListProcessor$1(MyListsFragment myListsFragment, ProcessorActivity.Companion.SourceType sourceType, Continuation continuation) {
        super(2, continuation);
        this.s = myListsFragment;
        this.t = sourceType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyListsFragment$launchSnapAListProcessor$1(this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyListsFragment$launchSnapAListProcessor$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProcessorActivity.Companion companion;
        ActivityResultLauncher activityResultLauncher;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        MyListsFragment myListsFragment = this.s;
        if (i == 0) {
            ResultKt.b(obj);
            ActivityResultLauncher activityResultLauncher2 = myListsFragment.o;
            companion = ProcessorActivity.C;
            Window window = myListsFragment.requireActivity().getWindow();
            Intrinsics.g(window, "getWindow(...)");
            this.p = companion;
            this.q = activityResultLauncher2;
            this.r = 1;
            Object objB = BitmapRenderer.b(window, this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            activityResultLauncher = activityResultLauncher2;
            obj = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activityResultLauncher = this.q;
            companion = this.p;
            ResultKt.b(obj);
        }
        Context contextRequireContext = myListsFragment.requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        companion.getClass();
        activityResultLauncher.a(ProcessorActivity.Companion.a(contextRequireContext, this.t, (byte[]) obj), null);
        return Unit.f24250a;
    }
}
