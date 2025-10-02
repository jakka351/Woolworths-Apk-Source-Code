package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ProvidedValue;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ProvidedValue<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ProvidableCompositionLocal f1655a;
    public final boolean b;
    public final SnapshotMutationPolicy c;
    public final MutableState d;
    public final Function1 e;
    public final boolean f;
    public final Object g;
    public boolean h = true;

    public ProvidedValue(ProvidableCompositionLocal providableCompositionLocal, Object obj, boolean z, SnapshotMutationPolicy snapshotMutationPolicy, MutableState mutableState, Function1 function1, boolean z2) {
        this.f1655a = providableCompositionLocal;
        this.b = z;
        this.c = snapshotMutationPolicy;
        this.d = mutableState;
        this.e = function1;
        this.f = z2;
        this.g = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        MutableState mutableState = this.d;
        if (mutableState != null) {
            return mutableState.getD();
        }
        Object obj = this.g;
        if (obj != null) {
            return obj;
        }
        ComposerKt.d("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }
}
