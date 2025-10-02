package au.com.woolworths.feature.shop.contentpage.ui;

import android.content.Context;
import androidx.compose.material.SnackbarDuration;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.SnackbarResult;
import androidx.compose.runtime.State;
import au.com.woolworths.feature.shop.contentpage.ContentPageContract;
import au.com.woolworths.feature.shop.contentpage.data.SnackBarActionEvent;
import au.com.woolworths.feature.shop.contentpage.data.SnackbarContent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.contentpage.ui.ContentPageScreenKt$ContentPageScreen$2$1", f = "ContentPageScreen.kt", l = {191}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ContentPageScreenKt$ContentPageScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Function0 p;
    public Function1 q;
    public SnackbarContent r;
    public int s;
    public final /* synthetic */ State t;
    public final /* synthetic */ SnackbarHostState u;
    public final /* synthetic */ Context v;
    public final /* synthetic */ Function0 w;
    public final /* synthetic */ Function1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentPageScreenKt$ContentPageScreen$2$1(State state, SnackbarHostState snackbarHostState, Context context, Function0 function0, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.t = state;
        this.u = snackbarHostState;
        this.v = context;
        this.w = function0;
        this.x = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContentPageScreenKt$ContentPageScreen$2$1(this.t, this.u, this.v, this.w, this.x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ContentPageScreenKt$ContentPageScreen$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SnackbarContent snackbarContent;
        Function0 function0;
        Function1 function1;
        SnackBarActionEvent snackBarActionEvent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.s;
        if (i == 0) {
            ResultKt.b(obj);
            SnackbarContent snackbarContent2 = ((ContentPageContract.ViewState) this.t.getD()).h;
            if (snackbarContent2 != null) {
                String string = snackbarContent2.f7024a.getText(this.v).toString();
                String str = snackbarContent2.b;
                SnackbarDuration snackbarDuration = SnackbarDuration.d;
                Function0 function02 = this.w;
                this.p = function02;
                Function1 function12 = this.x;
                this.q = function12;
                this.r = snackbarContent2;
                this.s = 1;
                Object objA = this.u.a(string, str, snackbarDuration, this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                snackbarContent = snackbarContent2;
                obj = objA;
                function0 = function02;
                function1 = function12;
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        snackbarContent = this.r;
        function1 = this.q;
        function0 = this.p;
        ResultKt.b(obj);
        SnackbarResult snackbarResult = (SnackbarResult) obj;
        function0.invoke();
        if (snackbarResult == SnackbarResult.e && (snackBarActionEvent = snackbarContent.c) != null) {
            function1.invoke(snackBarActionEvent);
        }
        return Unit.f24250a;
    }
}
