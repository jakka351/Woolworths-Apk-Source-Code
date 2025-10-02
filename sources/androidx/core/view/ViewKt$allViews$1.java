package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.wallet.WalletConstants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroid/view/View;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {WalletConstants.ERROR_CODE_INVALID_TRANSACTION, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super View>, Continuation<? super Unit>, Object> {
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ View s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, Continuation continuation) {
        super(2, continuation);
        this.s = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.s, continuation);
        viewKt$allViews$1.r = obj;
        return viewKt$allViews$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewKt$allViews$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        View view = this.s;
        if (i == 0) {
            ResultKt.b(obj);
            SequenceScope sequenceScope = (SequenceScope) this.r;
            this.r = sequenceScope;
            this.q = 1;
            sequenceScope.a(view, this);
            return coroutineSingletons;
        }
        Unit unit = Unit.f24250a;
        if (i == 1) {
            SequenceScope sequenceScope2 = (SequenceScope) this.r;
            ResultKt.b(obj);
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup) view;
                Sequence<View> sequence = new Sequence<View>() { // from class: androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1
                    @Override // kotlin.sequences.Sequence
                    /* renamed from: iterator */
                    public final Iterator getF24664a() {
                        return new TreeIterator(new ViewGroupKt$children$1(viewGroup).getF24664a());
                    }
                };
                this.r = null;
                this.q = 2;
                sequenceScope2.getClass();
                Object objB = sequenceScope2.b(sequence.getF24664a(), this);
                if (objB != coroutineSingletons) {
                    objB = unit;
                }
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return unit;
    }
}
