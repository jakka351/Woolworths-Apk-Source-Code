package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextRangeLayoutMeasureResult {

    /* renamed from: a, reason: collision with root package name */
    public final int f1141a;
    public final int b;
    public final Lambda c;

    /* JADX WARN: Multi-variable type inference failed */
    public TextRangeLayoutMeasureResult(int i, int i2, Function0 function0) {
        this.f1141a = i;
        this.b = i2;
        this.c = (Lambda) function0;
    }

    /* renamed from: a, reason: from getter */
    public final int getB() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public final Function0 b() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final int getF1141a() {
        return this.f1141a;
    }
}
