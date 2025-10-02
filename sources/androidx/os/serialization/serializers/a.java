package androidx.os.serialization.serializers;

import androidx.os.serialization.serializers.SparseArraySerializer;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparseArraySerializer.SparseArraySurrogate.Companion companion = SparseArraySerializer.SparseArraySurrogate.INSTANCE;
        return new ArrayListSerializer(IntSerializer.f24800a);
    }
}
