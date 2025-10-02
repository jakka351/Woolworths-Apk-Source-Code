package au.com.woolworths.foundation.shop.olive.voice.ui.permission;

import androidx.compose.runtime.MutableState;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStatus;
import com.google.accompanist.permissions.PermissionsUtilKt;
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
@DebugMetadata(c = "au.com.woolworths.foundation.shop.olive.voice.ui.permission.OliveVoicePermissionScreenKt$OliveVoicePermissionScreen$1$1", f = "OliveVoicePermissionScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OliveVoicePermissionScreenKt$OliveVoicePermissionScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ PermissionState p;
    public final /* synthetic */ MutableState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OliveVoicePermissionScreenKt$OliveVoicePermissionScreen$1$1(PermissionState permissionState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.p = permissionState;
        this.q = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OliveVoicePermissionScreenKt$OliveVoicePermissionScreen$1$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OliveVoicePermissionScreenKt$OliveVoicePermissionScreen$1$1 oliveVoicePermissionScreenKt$OliveVoicePermissionScreen$1$1 = (OliveVoicePermissionScreenKt$OliveVoicePermissionScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        oliveVoicePermissionScreenKt$OliveVoicePermissionScreen$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        PermissionState permissionState = this.p;
        PermissionStatus status = permissionState.getStatus();
        Intrinsics.h(status, "<this>");
        if (!status.equals(PermissionStatus.Granted.f14367a) && PermissionsUtilKt.d(permissionState.getStatus())) {
            this.q.setValue(Boolean.TRUE);
        }
        return Unit.f24250a;
    }
}
