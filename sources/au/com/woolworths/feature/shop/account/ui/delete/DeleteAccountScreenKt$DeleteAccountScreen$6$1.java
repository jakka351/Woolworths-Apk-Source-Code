package au.com.woolworths.feature.shop.account.ui.delete;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountScreenKt$DeleteAccountScreen$6$1", f = "DeleteAccountScreen.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DeleteAccountScreenKt$DeleteAccountScreen$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Context q;
    public final /* synthetic */ SnackbarHostState r;
    public final /* synthetic */ DeleteAccountViewModel s;
    public final /* synthetic */ MutableState t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteAccountScreenKt$DeleteAccountScreen$6$1(Context context, SnackbarHostState snackbarHostState, DeleteAccountViewModel deleteAccountViewModel, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = context;
        this.r = snackbarHostState;
        this.s = deleteAccountViewModel;
        this.t = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeleteAccountScreenKt$DeleteAccountScreen$6$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DeleteAccountScreenKt$DeleteAccountScreen$6$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws android.content.res.Resources.NotFoundException {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r10.p
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r11)
            r8 = r10
            goto L75
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            kotlin.ResultKt.b(r11)
            androidx.compose.runtime.MutableState r11 = r10.t
            java.lang.Object r1 = r11.getD()
            au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract$ViewState r1 = (au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract.ViewState) r1
            au.com.woolworths.feature.shop.account.viewmodel.delete.AccountDeletionState r1 = r1.a()
            if (r1 == 0) goto L2c
            au.com.woolworths.feature.shop.account.ui.model.DeletionError r1 = r1.c
            goto L2d
        L2c:
            r1 = r3
        L2d:
            boolean r4 = r1 instanceof au.com.woolworths.feature.shop.account.ui.model.DeletionError.ConnectionError
            android.content.Context r5 = r10.q
            if (r4 == 0) goto L40
            android.content.res.Resources r1 = r5.getResources()
            r4 = 2132017708(0x7f14022c, float:1.9673702E38)
            java.lang.String r1 = r1.getString(r4)
        L3e:
            r5 = r1
            goto L51
        L40:
            boolean r1 = r1 instanceof au.com.woolworths.feature.shop.account.ui.model.DeletionError.ServerError
            if (r1 == 0) goto L50
            android.content.res.Resources r1 = r5.getResources()
            r4 = 2132017707(0x7f14022b, float:1.96737E38)
            java.lang.String r1 = r1.getString(r4)
            goto L3e
        L50:
            r5 = r3
        L51:
            java.lang.Object r11 = r11.getD()
            au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract$ViewState r11 = (au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract.ViewState) r11
            au.com.woolworths.feature.shop.account.viewmodel.delete.AccountDeletionState r11 = r11.a()
            if (r11 == 0) goto L60
            au.com.woolworths.feature.shop.account.ui.model.DeletionError r11 = r11.c
            goto L61
        L60:
            r11 = r3
        L61:
            if (r11 == 0) goto L9d
            if (r5 == 0) goto L9d
            r10.p = r2
            au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState r4 = r10.r
            r6 = 0
            r7 = 0
            r9 = 14
            r8 = r10
            java.lang.Object r11 = au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState.c(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L75
            return r0
        L75:
            au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarResult r11 = (au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarResult) r11
            au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarResult r0 = au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarResult.d
            if (r11 != r0) goto L9e
            au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel r11 = r8.s
            kotlinx.coroutines.flow.MutableStateFlow r11 = r11.j
        L7f:
            java.lang.Object r0 = r11.getValue()
            r1 = r0
            au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract$ViewState r1 = (au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract.ViewState) r1
            boolean r2 = r1 instanceof au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract.ViewState.Content
            if (r2 == 0) goto L96
            au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract$ViewState$Content r1 = (au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract.ViewState.Content) r1
            au.com.woolworths.feature.shop.account.viewmodel.delete.AccountDeletionState r2 = new au.com.woolworths.feature.shop.account.viewmodel.delete.AccountDeletionState
            r4 = 0
            r2.<init>(r3, r4, r3)
            au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract$ViewState$Content r1 = au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract.ViewState.Content.b(r1, r2)
        L96:
            boolean r0 = r11.d(r0, r1)
            if (r0 == 0) goto L7f
            goto L9e
        L9d:
            r8 = r10
        L9e:
            kotlin.Unit r11 = kotlin.Unit.f24250a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountScreenKt$DeleteAccountScreen$6$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
