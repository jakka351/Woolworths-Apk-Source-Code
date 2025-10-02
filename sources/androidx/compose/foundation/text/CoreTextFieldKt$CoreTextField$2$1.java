package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", l = {347}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CoreTextFieldKt$CoreTextField$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LegacyTextFieldState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ TextInputService s;
    public final /* synthetic */ TextFieldSelectionManager t;
    public final /* synthetic */ ImeOptions u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$2$1(LegacyTextFieldState legacyTextFieldState, MutableState mutableState, TextInputService textInputService, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, Continuation continuation) {
        super(2, continuation);
        this.q = legacyTextFieldState;
        this.r = mutableState;
        this.s = textInputService;
        this.t = textFieldSelectionManager;
        this.u = imeOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoreTextFieldKt$CoreTextField$2$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreTextFieldKt$CoreTextField$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        final LegacyTextFieldState legacyTextFieldState = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                final MutableState mutableState = this.r;
                Flow flowM = SnapshotStateKt.m(new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Boolean bool = (Boolean) mutableState.getD();
                        bool.booleanValue();
                        return bool;
                    }
                });
                final TextInputService textInputService = this.s;
                final TextFieldSelectionManager textFieldSelectionManager = this.t;
                final ImeOptions imeOptions = this.u;
                FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                        if (zBooleanValue && legacyTextFieldState2.b()) {
                            TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                            TextFieldValue textFieldValueM = textFieldSelectionManager2.m();
                            OffsetMapping offsetMapping = textFieldSelectionManager2.b;
                            EditProcessor editProcessor = legacyTextFieldState2.d;
                            Function1 function1 = legacyTextFieldState2.v;
                            Function1 function12 = legacyTextFieldState2.w;
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            TextFieldDelegate$Companion$restartInput$1 textFieldDelegate$Companion$restartInput$1 = new TextFieldDelegate$Companion$restartInput$1(editProcessor, function1, objectRef);
                            TextInputService textInputService2 = textInputService;
                            PlatformTextInputService platformTextInputService = textInputService2.f2128a;
                            platformTextInputService.g(textFieldValueM, imeOptions, textFieldDelegate$Companion$restartInput$1, function12);
                            TextInputSession textInputSession = new TextInputSession(textInputService2, platformTextInputService);
                            textInputService2.b.set(textInputSession);
                            objectRef.d = textInputSession;
                            legacyTextFieldState2.e = textInputSession;
                            CoreTextFieldKt.f(legacyTextFieldState2, textFieldValueM, offsetMapping);
                        } else {
                            CoreTextFieldKt.e(legacyTextFieldState2);
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (((AbstractFlow) flowM).collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            CoreTextFieldKt.e(legacyTextFieldState);
            return Unit.f24250a;
        } catch (Throwable th) {
            CoreTextFieldKt.e(legacyTextFieldState);
            throw th;
        }
    }
}
