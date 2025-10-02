package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import au.com.woolworths.feature.shop.instore.navigation.map.data.ImageMapData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt$MapFromImage$1$1", f = "InstoreMapScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreMapScreenKt$MapFromImage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ImageMapData p;
    public final /* synthetic */ MutableState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapScreenKt$MapFromImage$1$1(ImageMapData imageMapData, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.p = imageMapData;
        this.q = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreMapScreenKt$MapFromImage$1$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InstoreMapScreenKt$MapFromImage$1$1 instoreMapScreenKt$MapFromImage$1$1 = (InstoreMapScreenKt$MapFromImage$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        instoreMapScreenKt$MapFromImage$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        AndroidImageBitmap androidImageBitmap = new AndroidImageBitmap(this.p.f);
        InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$1 = InstoreMapScreenKt.f7385a;
        this.q.setValue(androidImageBitmap);
        return Unit.f24250a;
    }
}
