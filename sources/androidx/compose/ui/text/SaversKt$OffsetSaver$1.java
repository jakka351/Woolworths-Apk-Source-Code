package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-Uv8p0NA", "(Landroidx/compose/runtime/saveable/SaverScope;J)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SaversKt$OffsetSaver$1 extends Lambda implements Function2<SaverScope, Offset, Object> {
    public static final SaversKt$OffsetSaver$1 h = new SaversKt$OffsetSaver$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((Offset) obj2).f1751a;
        if (Offset.c(j, 9205357640488583168L)) {
            return Boolean.FALSE;
        }
        Float fValueOf = Float.valueOf(Float.intBitsToFloat((int) (j >> 32)));
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f2055a;
        return CollectionsKt.k(fValueOf, Float.valueOf(Float.intBitsToFloat((int) (j & 4294967295L))));
    }
}
