package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ComputedProvidableCompositionLocal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComputedProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public final ComputedValueHolder b;

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.ComputedProvidableCompositionLocal$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function0<Object> {
        public static final AnonymousClass1 h = new AnonymousClass1(0);

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ComposerKt.d("Unexpected call to default provider");
            throw new KotlinNothingValueException();
        }
    }

    public ComputedProvidableCompositionLocal(Function1 function1) {
        super(AnonymousClass1.h);
        this.b = new ComputedValueHolder(function1);
    }

    @Override // androidx.compose.runtime.CompositionLocal
    public final ValueHolder a() {
        return this.b;
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public final ProvidedValue b(Object obj) {
        return new ProvidedValue(this, obj, obj == null, null, null, null, true);
    }
}
