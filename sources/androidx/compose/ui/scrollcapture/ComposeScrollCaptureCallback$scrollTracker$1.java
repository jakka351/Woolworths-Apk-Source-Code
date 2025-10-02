package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {88}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ComposeScrollCaptureCallback$scrollTracker$1 extends SuspendLambda implements Function2<Float, Continuation<? super Float>, Object> {
    public boolean p;
    public int q;
    public /* synthetic */ float r;
    public final /* synthetic */ ComposeScrollCaptureCallback s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, Continuation continuation) {
        super(2, continuation);
        this.s = composeScrollCaptureCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.s, continuation);
        composeScrollCaptureCallback$scrollTracker$1.r = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            float f = this.r;
            ComposeScrollCaptureCallback composeScrollCaptureCallback = this.s;
            Function2 function2 = (Function2) SemanticsConfigurationKt.a(composeScrollCaptureCallback.f2005a.d, SemanticsActions.e);
            if (function2 == null) {
                InlineClassHelperKt.c("Required value was null.");
                throw new KotlinNothingValueException();
            }
            boolean z2 = ((ScrollAxisRange) composeScrollCaptureCallback.f2005a.d.g(SemanticsProperties.t)).c;
            if (z2) {
                f = -f;
            }
            Offset offset = new Offset((Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            this.p = z2;
            this.q = 1;
            obj = function2.invoke(offset, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            z = z2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.p;
            ResultKt.b(obj);
        }
        long j = ((Offset) obj).f1751a;
        return new Float(z ? -Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
