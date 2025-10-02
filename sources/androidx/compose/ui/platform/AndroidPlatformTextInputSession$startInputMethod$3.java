package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.WeakReference;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "methodSession", "Landroidx/compose/ui/platform/InputMethodSession;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AndroidPlatformTextInputSession$startInputMethod$3 extends SuspendLambda implements Function2<InputMethodSession, Continuation<?>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AndroidPlatformTextInputSession r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(AndroidPlatformTextInputSession androidPlatformTextInputSession, Continuation continuation) {
        super(2, continuation);
        this.r = androidPlatformTextInputSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.r, continuation);
        androidPlatformTextInputSession$startInputMethod$3.q = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((AndroidPlatformTextInputSession$startInputMethod$3) create((InputMethodSession) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final InputMethodSession inputMethodSession = (InputMethodSession) this.q;
            this.q = inputMethodSession;
            this.p = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(this));
            cancellableContinuationImpl.o();
            final AndroidPlatformTextInputSession androidPlatformTextInputSession = this.r;
            TextInputService textInputService = androidPlatformTextInputSession.e;
            PlatformTextInputService platformTextInputService = textInputService.f2128a;
            platformTextInputService.d();
            textInputService.b.set(new TextInputSession(textInputService, platformTextInputService));
            cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    InputMethodSession inputMethodSession2 = inputMethodSession;
                    synchronized (inputMethodSession2.c) {
                        try {
                            inputMethodSession2.e = true;
                            MutableVector mutableVector = inputMethodSession2.d;
                            Object[] objArr = mutableVector.d;
                            int i2 = mutableVector.f;
                            for (int i3 = 0; i3 < i2; i3++) {
                                NullableInputConnectionWrapper nullableInputConnectionWrapper = (NullableInputConnectionWrapper) ((WeakReference) objArr[i3]).get();
                                if (nullableInputConnectionWrapper != null) {
                                    nullableInputConnectionWrapper.a();
                                }
                            }
                            inputMethodSession2.d.h();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    TextInputService textInputService2 = androidPlatformTextInputSession.e;
                    textInputService2.b.set(null);
                    textInputService2.f2128a.a();
                    return Unit.f24250a;
                }
            });
            if (cancellableContinuationImpl.n() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
