package net.engawapg.lib.zoomable;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomableKt$detectTransformGestures$6", f = "Zoomable.kt", l = {59, 65, 91, 98}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ZoomableKt$detectTransformGestures$6 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    public Object q;
    public Serializable r;
    public Serializable s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Function0 v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ Function1 x;
    public final /* synthetic */ Function0 y;
    public final /* synthetic */ Function4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableKt$detectTransformGestures$6(Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function4 function4, Continuation continuation) {
        super(2, continuation);
        this.v = function0;
        this.w = function1;
        this.x = function12;
        this.y = function02;
        this.z = function4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZoomableKt$detectTransformGestures$6 zoomableKt$detectTransformGestures$6 = new ZoomableKt$detectTransformGestures$6(this.v, this.w, this.x, this.y, this.z, continuation);
        zoomableKt$detectTransformGestures$6.u = obj;
        return zoomableKt$detectTransformGestures$6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoomableKt$detectTransformGestures$6) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.engawapg.lib.zoomable.ZoomableKt$detectTransformGestures$6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
